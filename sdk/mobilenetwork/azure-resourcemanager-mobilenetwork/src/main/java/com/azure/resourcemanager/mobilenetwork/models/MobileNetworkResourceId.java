// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reference to a mobile network resource. */
@Fluent
public final class MobileNetworkResourceId {
    /*
     * Mobile network resource ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Mobile network resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Mobile network resource ID.
     *
     * @param id the id value to set.
     * @return the MobileNetworkResourceId object itself.
     */
    public MobileNetworkResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model MobileNetworkResourceId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MobileNetworkResourceId.class);
}
