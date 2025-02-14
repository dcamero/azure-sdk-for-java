// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.appservice.fluent.WorkflowsClient;
import com.azure.resourcemanager.appservice.models.RegenerateActionParameter;
import com.azure.resourcemanager.appservice.models.Workflow;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WorkflowsClient. */
public final class WorkflowsClientImpl implements WorkflowsClient {
    /** The proxy service used to perform REST calls. */
    private final WorkflowsService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowsClientImpl(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(WorkflowsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientWorkflows to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface WorkflowsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}"
                + "/hostruntime/runtime/webhooks/workflow/api/management/workflows/{workflowName}/regenerateAccessKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> regenerateAccessKey(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("workflowName") String workflowName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RegenerateActionParameter keyType,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}"
                + "/hostruntime/runtime/webhooks/workflow/api/management/workflows/{workflowName}/validate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> validate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("workflowName") String workflowName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") Workflow validate,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> regenerateAccessKeyWithResponseAsync(
        String resourceGroupName, String name, String workflowName, RegenerateActionParameter keyType) {
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
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (keyType == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyType is required and cannot be null."));
        } else {
            keyType.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regenerateAccessKey(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            name,
                            workflowName,
                            this.client.getApiVersion(),
                            keyType,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regenerateAccessKeyWithResponseAsync(
        String resourceGroupName,
        String name,
        String workflowName,
        RegenerateActionParameter keyType,
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
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (keyType == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyType is required and cannot be null."));
        } else {
            keyType.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regenerateAccessKey(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                name,
                workflowName,
                this.client.getApiVersion(),
                keyType,
                accept,
                context);
    }

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> regenerateAccessKeyAsync(
        String resourceGroupName, String name, String workflowName, RegenerateActionParameter keyType) {
        return regenerateAccessKeyWithResponseAsync(resourceGroupName, name, workflowName, keyType)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void regenerateAccessKey(
        String resourceGroupName, String name, String workflowName, RegenerateActionParameter keyType) {
        regenerateAccessKeyAsync(resourceGroupName, name, workflowName, keyType).block();
    }

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> regenerateAccessKeyWithResponse(
        String resourceGroupName,
        String name,
        String workflowName,
        RegenerateActionParameter keyType,
        Context context) {
        return regenerateAccessKeyWithResponseAsync(resourceGroupName, name, workflowName, keyType, context).block();
    }

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> validateWithResponseAsync(
        String resourceGroupName, String name, String workflowName, Workflow validate) {
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
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (validate == null) {
            return Mono.error(new IllegalArgumentException("Parameter validate is required and cannot be null."));
        } else {
            validate.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .validate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            name,
                            workflowName,
                            this.client.getApiVersion(),
                            validate,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> validateWithResponseAsync(
        String resourceGroupName, String name, String workflowName, Workflow validate, Context context) {
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
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (validate == null) {
            return Mono.error(new IllegalArgumentException("Parameter validate is required and cannot be null."));
        } else {
            validate.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .validate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                name,
                workflowName,
                this.client.getApiVersion(),
                validate,
                accept,
                context);
    }

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> validateAsync(String resourceGroupName, String name, String workflowName, Workflow validate) {
        return validateWithResponseAsync(resourceGroupName, name, workflowName, validate)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void validate(String resourceGroupName, String name, String workflowName, Workflow validate) {
        validateAsync(resourceGroupName, name, workflowName, validate).block();
    }

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Site name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> validateWithResponse(
        String resourceGroupName, String name, String workflowName, Workflow validate, Context context) {
        return validateWithResponseAsync(resourceGroupName, name, workflowName, validate, context).block();
    }
}
