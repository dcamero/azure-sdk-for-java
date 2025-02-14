// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** sharingInvitation. */
@Fluent
public final class MicrosoftGraphSharingInvitation {
    /*
     * The email address provided for the recipient of the sharing invitation.
     * Read-only.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * identitySet
     */
    @JsonProperty(value = "invitedBy")
    private MicrosoftGraphIdentitySet invitedBy;

    /*
     * The redeemedBy property.
     */
    @JsonProperty(value = "redeemedBy")
    private String redeemedBy;

    /*
     * If true the recipient of the invitation needs to sign in in order to
     * access the shared item. Read-only.
     */
    @JsonProperty(value = "signInRequired")
    private Boolean signInRequired;

    /*
     * sharingInvitation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the email property: The email address provided for the recipient of the sharing invitation. Read-only.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: The email address provided for the recipient of the sharing invitation. Read-only.
     *
     * @param email the email value to set.
     * @return the MicrosoftGraphSharingInvitation object itself.
     */
    public MicrosoftGraphSharingInvitation withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the invitedBy property: identitySet.
     *
     * @return the invitedBy value.
     */
    public MicrosoftGraphIdentitySet invitedBy() {
        return this.invitedBy;
    }

    /**
     * Set the invitedBy property: identitySet.
     *
     * @param invitedBy the invitedBy value to set.
     * @return the MicrosoftGraphSharingInvitation object itself.
     */
    public MicrosoftGraphSharingInvitation withInvitedBy(MicrosoftGraphIdentitySet invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * Get the redeemedBy property: The redeemedBy property.
     *
     * @return the redeemedBy value.
     */
    public String redeemedBy() {
        return this.redeemedBy;
    }

    /**
     * Set the redeemedBy property: The redeemedBy property.
     *
     * @param redeemedBy the redeemedBy value to set.
     * @return the MicrosoftGraphSharingInvitation object itself.
     */
    public MicrosoftGraphSharingInvitation withRedeemedBy(String redeemedBy) {
        this.redeemedBy = redeemedBy;
        return this;
    }

    /**
     * Get the signInRequired property: If true the recipient of the invitation needs to sign in in order to access the
     * shared item. Read-only.
     *
     * @return the signInRequired value.
     */
    public Boolean signInRequired() {
        return this.signInRequired;
    }

    /**
     * Set the signInRequired property: If true the recipient of the invitation needs to sign in in order to access the
     * shared item. Read-only.
     *
     * @param signInRequired the signInRequired value to set.
     * @return the MicrosoftGraphSharingInvitation object itself.
     */
    public MicrosoftGraphSharingInvitation withSignInRequired(Boolean signInRequired) {
        this.signInRequired = signInRequired;
        return this;
    }

    /**
     * Get the additionalProperties property: sharingInvitation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: sharingInvitation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSharingInvitation object itself.
     */
    public MicrosoftGraphSharingInvitation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (invitedBy() != null) {
            invitedBy().validate();
        }
    }
}
