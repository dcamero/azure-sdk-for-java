// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP firewall rule. */
@Fluent
public final class IpFirewallRuleInfoInner extends ProxyResource {
    /*
     * IP firewall rule properties
     */
    @JsonProperty(value = "properties")
    private IpFirewallRuleProperties innerProperties;

    /**
     * Get the innerProperties property: IP firewall rule properties.
     *
     * @return the innerProperties value.
     */
    private IpFirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endIpAddress();
    }

    /**
     * Set the endIpAddress property: The end IP address of the firewall rule. Must be IPv4 format. Must be greater than
     * or equal to startIpAddress.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the IpFirewallRuleInfoInner object itself.
     */
    public IpFirewallRuleInfoInner withEndIpAddress(String endIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpFirewallRuleProperties();
        }
        this.innerProperties().withEndIpAddress(endIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startIpAddress();
    }

    /**
     * Set the startIpAddress property: The start IP address of the firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the IpFirewallRuleInfoInner object itself.
     */
    public IpFirewallRuleInfoInner withStartIpAddress(String startIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpFirewallRuleProperties();
        }
        this.innerProperties().withStartIpAddress(startIpAddress);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
