// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.models.ExtendedLocation;
import com.azure.resourcemanager.resources.models.Identity;
import com.azure.resourcemanager.resources.models.Plan;
import com.azure.resourcemanager.resources.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Resource information. */
@Fluent
public final class GenericResourceExpandedInner extends GenericResourceInner {
    /*
     * The created time of the resource. This is only present if requested via
     * the $expand query parameter.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * The changed time of the resource. This is only present if requested via
     * the $expand query parameter.
     */
    @JsonProperty(value = "changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime changedTime;

    /*
     * The provisioning state of the resource. This is only present if
     * requested via the $expand query parameter.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the createdTime property: The created time of the resource. This is only present if requested via the $expand
     * query parameter.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: The changed time of the resource. This is only present if requested via the $expand
     * query parameter.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. This is only present if requested via
     * the $expand query parameter.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withPlan(Plan plan) {
        super.withPlan(plan);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withProperties(Object properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withIdentity(Identity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withExtendedLocation(ExtendedLocation extendedLocation) {
        super.withExtendedLocation(extendedLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericResourceExpandedInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
