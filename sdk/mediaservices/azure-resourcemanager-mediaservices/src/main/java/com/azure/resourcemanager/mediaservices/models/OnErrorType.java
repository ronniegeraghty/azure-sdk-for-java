// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OnErrorType. */
public final class OnErrorType extends ExpandableStringEnum<OnErrorType> {
    /** Static value StopProcessingJob for OnErrorType. */
    public static final OnErrorType STOP_PROCESSING_JOB = fromString("StopProcessingJob");

    /** Static value ContinueJob for OnErrorType. */
    public static final OnErrorType CONTINUE_JOB = fromString("ContinueJob");

    /**
     * Creates or finds a OnErrorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OnErrorType.
     */
    @JsonCreator
    public static OnErrorType fromString(String name) {
        return fromString(name, OnErrorType.class);
    }

    /**
     * Gets known OnErrorType values.
     *
     * @return known OnErrorType values.
     */
    public static Collection<OnErrorType> values() {
        return values(OnErrorType.class);
    }
}
