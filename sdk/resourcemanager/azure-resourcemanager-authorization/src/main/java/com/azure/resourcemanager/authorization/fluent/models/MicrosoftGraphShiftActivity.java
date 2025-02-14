// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** shiftActivity. */
@Fluent
public final class MicrosoftGraphShiftActivity {
    /*
     * Customer defined code for the shiftActivity. Required.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The name of the shiftActivity. Required.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The end date and time for the shiftActivity. The Timestamp type
     * represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
     * this: '2014-01-01T00:00:00Z'. Required.
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /*
     * Indicates whether the microsoft.graph.user should be paid for the
     * activity during their shift. Required.
     */
    @JsonProperty(value = "isPaid")
    private Boolean isPaid;

    /*
     * The start date and time for the shiftActivity. The Timestamp type
     * represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like
     * this: '2014-01-01T00:00:00Z'. Required.
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * scheduleEntityTheme
     */
    @JsonProperty(value = "theme")
    private MicrosoftGraphScheduleEntityTheme theme;

    /*
     * shiftActivity
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the code property: Customer defined code for the shiftActivity. Required.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Customer defined code for the shiftActivity. Required.
     *
     * @param code the code value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the displayName property: The name of the shiftActivity. Required.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the shiftActivity. Required.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the endDateTime property: The end date and time for the shiftActivity. The Timestamp type represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'. Required.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The end date and time for the shiftActivity. The Timestamp type represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: '2014-01-01T00:00:00Z'. Required.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the isPaid property: Indicates whether the microsoft.graph.user should be paid for the activity during their
     * shift. Required.
     *
     * @return the isPaid value.
     */
    public Boolean isPaid() {
        return this.isPaid;
    }

    /**
     * Set the isPaid property: Indicates whether the microsoft.graph.user should be paid for the activity during their
     * shift. Required.
     *
     * @param isPaid the isPaid value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
        return this;
    }

    /**
     * Get the startDateTime property: The start date and time for the shiftActivity. The Timestamp type represents date
     * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014
     * would look like this: '2014-01-01T00:00:00Z'. Required.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The start date and time for the shiftActivity. The Timestamp type represents date
     * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014
     * would look like this: '2014-01-01T00:00:00Z'. Required.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the theme property: scheduleEntityTheme.
     *
     * @return the theme value.
     */
    public MicrosoftGraphScheduleEntityTheme theme() {
        return this.theme;
    }

    /**
     * Set the theme property: scheduleEntityTheme.
     *
     * @param theme the theme value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withTheme(MicrosoftGraphScheduleEntityTheme theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Get the additionalProperties property: shiftActivity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: shiftActivity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphShiftActivity object itself.
     */
    public MicrosoftGraphShiftActivity withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}
