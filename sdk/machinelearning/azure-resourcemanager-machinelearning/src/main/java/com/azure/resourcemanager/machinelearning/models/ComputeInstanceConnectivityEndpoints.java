// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines all connectivity endpoints and properties for an ComputeInstance. */
@Immutable
public final class ComputeInstanceConnectivityEndpoints {
    /*
     * Public IP Address of this ComputeInstance.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /*
     * Private IP Address of this ComputeInstance (local to the VNET in which
     * the compute instance is deployed).
     */
    @JsonProperty(value = "privateIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /**
     * Get the publicIpAddress property: Public IP Address of this ComputeInstance.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the privateIpAddress property: Private IP Address of this ComputeInstance (local to the VNET in which the
     * compute instance is deployed).
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
