// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;

/** The SqlContainerGetPropertiesOptions model. */
@Fluent
public final class SqlContainerGetPropertiesOptions extends OptionsResource {
    /** {@inheritDoc} */
    @Override
    public SqlContainerGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlContainerGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
