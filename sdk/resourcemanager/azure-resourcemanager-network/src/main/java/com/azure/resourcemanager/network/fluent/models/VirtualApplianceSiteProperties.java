// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.Office365PolicyProperties;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the rule group. */
@Fluent
public final class VirtualApplianceSiteProperties {
    /*
     * Address Prefix.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * Office 365 Policy.
     */
    @JsonProperty(value = "o365Policy")
    private Office365PolicyProperties o365Policy;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address Prefix.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualApplianceSiteProperties object itself.
     */
    public VirtualApplianceSiteProperties withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the o365Policy property: Office 365 Policy.
     *
     * @return the o365Policy value.
     */
    public Office365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set the o365Policy property: Office 365 Policy.
     *
     * @param o365Policy the o365Policy value to set.
     * @return the VirtualApplianceSiteProperties object itself.
     */
    public VirtualApplianceSiteProperties withO365Policy(Office365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (o365Policy() != null) {
            o365Policy().validate();
        }
    }
}
