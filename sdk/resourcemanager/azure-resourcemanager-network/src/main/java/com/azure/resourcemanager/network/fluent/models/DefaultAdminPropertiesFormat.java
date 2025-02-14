// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.AddressPrefixItem;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleAccess;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleDirection;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Security default admin rule resource. */
@Fluent
public final class DefaultAdminPropertiesFormat {
    /*
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Default rule flag.
     */
    @JsonProperty(value = "flag")
    private String flag;

    /*
     * Network protocol this rule applies to.
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityConfigurationRuleProtocol protocol;

    /*
     * The CIDR or source IP ranges.
     */
    @JsonProperty(value = "sources", access = JsonProperty.Access.WRITE_ONLY)
    private List<AddressPrefixItem> sources;

    /*
     * The destination address prefixes. CIDR or destination IP ranges.
     */
    @JsonProperty(value = "destinations", access = JsonProperty.Access.WRITE_ONLY)
    private List<AddressPrefixItem> destinations;

    /*
     * The source port ranges.
     */
    @JsonProperty(value = "sourcePortRanges", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> sourcePortRanges;

    /*
     * The destination port ranges.
     */
    @JsonProperty(value = "destinationPortRanges", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> destinationPortRanges;

    /*
     * Indicates the access allowed for this particular rule
     */
    @JsonProperty(value = "access", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityConfigurationRuleAccess access;

    /*
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule
     * in the collection. The lower the priority number, the higher the priority of the rule.
     */
    @JsonProperty(value = "priority", access = JsonProperty.Access.WRITE_ONLY)
    private Integer priority;

    /*
     * Indicates if the traffic matched against the rule in inbound or outbound.
     */
    @JsonProperty(value = "direction", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityConfigurationRuleDirection direction;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the flag property: Default rule flag.
     *
     * @return the flag value.
     */
    public String flag() {
        return this.flag;
    }

    /**
     * Set the flag property: Default rule flag.
     *
     * @param flag the flag value to set.
     * @return the DefaultAdminPropertiesFormat object itself.
     */
    public DefaultAdminPropertiesFormat withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     *
     * @return the protocol value.
     */
    public SecurityConfigurationRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Get the sources property: The CIDR or source IP ranges.
     *
     * @return the sources value.
     */
    public List<AddressPrefixItem> sources() {
        return this.sources;
    }

    /**
     * Get the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinations value.
     */
    public List<AddressPrefixItem> destinations() {
        return this.destinations;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Get the access property: Indicates the access allowed for this particular rule.
     *
     * @return the access value.
     */
    public SecurityConfigurationRuleAccess access() {
        return this.access;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Get the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     *
     * @return the direction value.
     */
    public SecurityConfigurationRuleDirection direction() {
        return this.direction;
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
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
        if (destinations() != null) {
            destinations().forEach(e -> e.validate());
        }
    }
}
