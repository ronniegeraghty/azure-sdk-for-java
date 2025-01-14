// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.models.UserUpdateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** User of a lab that can register for and use virtual machines within the lab. Used for updates. */
@Fluent
public final class UserUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserUpdate.class);

    /*
     * User resource properties
     */
    @JsonProperty(value = "properties")
    private UserUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: User resource properties.
     *
     * @return the innerProperties value.
     */
    private UserUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the additionalUsageQuota property: The amount of usage quota time the user gets in addition to the lab usage
     * quota.
     *
     * @return the additionalUsageQuota value.
     */
    public Duration additionalUsageQuota() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalUsageQuota();
    }

    /**
     * Set the additionalUsageQuota property: The amount of usage quota time the user gets in addition to the lab usage
     * quota.
     *
     * @param additionalUsageQuota the additionalUsageQuota value to set.
     * @return the UserUpdate object itself.
     */
    public UserUpdate withAdditionalUsageQuota(Duration additionalUsageQuota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserUpdateProperties();
        }
        this.innerProperties().withAdditionalUsageQuota(additionalUsageQuota);
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
