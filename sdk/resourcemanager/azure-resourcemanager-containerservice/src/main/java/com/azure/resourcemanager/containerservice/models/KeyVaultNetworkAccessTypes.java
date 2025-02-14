// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KeyVaultNetworkAccessTypes. */
public final class KeyVaultNetworkAccessTypes extends ExpandableStringEnum<KeyVaultNetworkAccessTypes> {
    /** Static value Public for KeyVaultNetworkAccessTypes. */
    public static final KeyVaultNetworkAccessTypes PUBLIC = fromString("Public");

    /** Static value Private for KeyVaultNetworkAccessTypes. */
    public static final KeyVaultNetworkAccessTypes PRIVATE = fromString("Private");

    /**
     * Creates or finds a KeyVaultNetworkAccessTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyVaultNetworkAccessTypes.
     */
    @JsonCreator
    public static KeyVaultNetworkAccessTypes fromString(String name) {
        return fromString(name, KeyVaultNetworkAccessTypes.class);
    }

    /**
     * Gets known KeyVaultNetworkAccessTypes values.
     *
     * @return known KeyVaultNetworkAccessTypes values.
     */
    public static Collection<KeyVaultNetworkAccessTypes> values() {
        return values(KeyVaultNetworkAccessTypes.class);
    }
}
