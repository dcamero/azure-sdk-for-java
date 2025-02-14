// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.synapse.fluent.SqlPoolMetadataSyncConfigsClient;
import com.azure.resourcemanager.synapse.fluent.models.MetadataSyncConfigInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SqlPoolMetadataSyncConfigsClient. */
public final class SqlPoolMetadataSyncConfigsClientImpl implements SqlPoolMetadataSyncConfigsClient {
    /** The proxy service used to perform REST calls. */
    private final SqlPoolMetadataSyncConfigsService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolMetadataSyncConfigsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SqlPoolMetadataSyncConfigsClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    SqlPoolMetadataSyncConfigsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientSqlPoolMetadataSyncConfigs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface SqlPoolMetadataSyncConfigsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/metadataSync/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetadataSyncConfigInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/sqlPools/{sqlPoolName}/metadataSync/config")
        @ExpectedResponses({200, 404})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetadataSyncConfigInner>> create(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("sqlPoolName") String sqlPoolName,
            @BodyParam("application/json") MetadataSyncConfigInner metadataSyncConfiguration,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetadataSyncConfigInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetadataSyncConfigInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                accept,
                context);
    }

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MetadataSyncConfigInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName)
            .flatMap(
                (Response<MetadataSyncConfigInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetadataSyncConfigInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getAsync(resourceGroupName, workspaceName, sqlPoolName).block();
    }

    /**
     * Get the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata sync configuration for a SQL pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetadataSyncConfigInner> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, context).block();
    }

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata sync configuration along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetadataSyncConfigInner>> createWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (metadataSyncConfiguration == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter metadataSyncConfiguration is required and cannot be null."));
        } else {
            metadataSyncConfiguration.validate();
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            sqlPoolName,
                            metadataSyncConfiguration,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata sync configuration along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MetadataSyncConfigInner>> createWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (sqlPoolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null."));
        }
        if (metadataSyncConfiguration == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter metadataSyncConfiguration is required and cannot be null."));
        } else {
            metadataSyncConfiguration.validate();
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                sqlPoolName,
                metadataSyncConfiguration,
                accept,
                context);
    }

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata sync configuration on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MetadataSyncConfigInner> createAsync(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration) {
        return createWithResponseAsync(resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration)
            .flatMap(
                (Response<MetadataSyncConfigInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata sync configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetadataSyncConfigInner create(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration) {
        return createAsync(resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration).block();
    }

    /**
     * Set the metadata sync configuration for a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param metadataSyncConfiguration Metadata sync configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata sync configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetadataSyncConfigInner> createWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration,
        Context context) {
        return createWithResponseAsync(
                resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration, context)
            .block();
    }
}
