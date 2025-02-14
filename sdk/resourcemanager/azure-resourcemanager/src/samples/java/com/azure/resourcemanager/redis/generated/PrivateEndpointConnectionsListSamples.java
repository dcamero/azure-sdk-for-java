// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2021-06-01/examples/RedisCacheListPrivateEndpointConnections.json
     */
    /**
     * Sample code: RedisCacheListPrivateEndpointConnection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheListPrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .list("rgtest01", "cachetest01", Context.NONE);
    }
}
