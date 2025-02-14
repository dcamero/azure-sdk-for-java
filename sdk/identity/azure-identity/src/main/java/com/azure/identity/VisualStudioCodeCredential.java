// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import com.azure.identity.implementation.MsalToken;
import com.azure.identity.implementation.VisualStudioCacheAccessor;
import com.azure.identity.implementation.util.LoggingUtil;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Enables authentication to Azure Active Directory using data from Visual Studio Code
 */
public class VisualStudioCodeCredential implements TokenCredential {
    private final IdentityClient identityClient;
    private final AtomicReference<MsalToken> cachedToken;
    private final String cloudInstance;
    private static final ClientLogger LOGGER = new ClientLogger(VisualStudioCodeCredential.class);

    private static final String TROUBLESHOOTING = "VisualStudioCodeCredential is affected by known issues. See https://aka.ms/azsdk/java/identity/troubleshoot#troubleshoot-visualstudiocodecredential-authentication-issues for more information.";

    /**
     * Creates a public class VisualStudioCodeCredential implements TokenCredential with the given tenant and
     * identity client options.
     *
     * @param tenantId the tenant ID of the application
     * @param identityClientOptions the options for configuring the identity client
     */
    VisualStudioCodeCredential(String tenantId, IdentityClientOptions identityClientOptions) {

        IdentityClientOptions options = (identityClientOptions == null ? new IdentityClientOptions()
                                                 : identityClientOptions);
        String tenant;

        VisualStudioCacheAccessor accessor = new VisualStudioCacheAccessor();
        Map<String, String> userSettings = accessor.getUserSettingsDetails();

        cloudInstance = userSettings.get("cloud");
        if (CoreUtils.isNullOrEmpty(options.getAuthorityHost())) {
            options.setAuthorityHost(accessor.getAzureAuthHost(cloudInstance));
        }

        if (!CoreUtils.isNullOrEmpty(tenantId)) {
            tenant = tenantId;
        } else {
            tenant = userSettings.getOrDefault("tenant", "common");
        }

        identityClient = new IdentityClientBuilder()
                .tenantId(tenant)
                .clientId("aebc6443-996d-45c2-90f0-388ff96faa56")
                .identityClientOptions(options)
                .build();

        this.cachedToken = new AtomicReference<>();
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return Mono.defer(() -> {
            if (cachedToken.get() != null) {
                return identityClient.authenticateWithPublicClientCache(request, cachedToken.get().getAccount())
                           .onErrorResume(t -> Mono.empty());
            } else {
                return Mono.empty();
            }
        }).switchIfEmpty(
            Mono.defer(() -> identityClient.authenticateWithVsCodeCredential(request, cloudInstance)))
                   .map(msalToken -> {
                       cachedToken.set(msalToken);
                       return (AccessToken) msalToken;
                   })
            .doOnNext(token -> LoggingUtil.logTokenSuccess(LOGGER, request))
            .doOnError(error -> {
                Throwable other = null;
                if (error instanceof CredentialUnavailableException) {
                    other = new CredentialUnavailableException(TROUBLESHOOTING, error);

                } else if (error instanceof ClientAuthenticationException) {
                    other = new ClientAuthenticationException(TROUBLESHOOTING, null, error);
                } else {
                    other = error;
                }
                LoggingUtil.logTokenError(LOGGER, identityClient.getIdentityClientOptions(),
                    request, other);
            });
    }
}
