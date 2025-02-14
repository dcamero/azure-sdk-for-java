// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema for Desktop properties. */
@Fluent
public final class DesktopProperties {
    /*
     * ObjectId of Desktop. (internal use)
     */
    @JsonProperty(value = "objectId", access = JsonProperty.Access.WRITE_ONLY)
    private String objectId;

    /*
     * Description of Desktop.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Friendly name of Desktop.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Hash of the icon.
     */
    @JsonProperty(value = "iconHash", access = JsonProperty.Access.WRITE_ONLY)
    private String iconHash;

    /*
     * The icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "iconContent", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] iconContent;

    /**
     * Get the objectId property: ObjectId of Desktop. (internal use).
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the description property: Description of Desktop.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of Desktop.
     *
     * @param description the description value to set.
     * @return the DesktopProperties object itself.
     */
    public DesktopProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Desktop.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of Desktop.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the DesktopProperties object itself.
     */
    public DesktopProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the iconHash property: Hash of the icon.
     *
     * @return the iconHash value.
     */
    public String iconHash() {
        return this.iconHash;
    }

    /**
     * Get the iconContent property: The icon a 64 bit string as a byte array.
     *
     * @return the iconContent value.
     */
    public byte[] iconContent() {
        return CoreUtils.clone(this.iconContent);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
