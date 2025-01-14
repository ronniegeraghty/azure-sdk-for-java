// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.resources.models.ChangeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Change Resource. */
@Fluent
public final class ChangeResourceResultInner extends ProxyResource {
    /*
     * The properties of a change
     */
    @JsonProperty(value = "properties")
    private ChangeProperties properties;

    /**
     * Get the properties property: The properties of a change.
     *
     * @return the properties value.
     */
    public ChangeProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of a change.
     *
     * @param properties the properties value to set.
     * @return the ChangeResourceResultInner object itself.
     */
    public ChangeResourceResultInner withProperties(ChangeProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
