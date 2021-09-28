// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the operating system settings for the AzureBareMetal instance. */
@Fluent
public final class OSProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSProfile.class);

    /*
     * Specifies the host OS name of the AzureBareMetal instance.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /*
     * This property allows you to specify the type of the OS.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /*
     * Specifies version of operating system.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Specifies the SSH public key used to access the operating system.
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /**
     * Get the computerName property: Specifies the host OS name of the AzureBareMetal instance.
     *
     * @return the computerName value.
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set the computerName property: Specifies the host OS name of the AzureBareMetal instance.
     *
     * @param computerName the computerName value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the version property: Specifies version of operating system.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the sshPublicKey property: Specifies the SSH public key used to access the operating system.
     *
     * @return the sshPublicKey value.
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: Specifies the SSH public key used to access the operating system.
     *
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the OSProfile object itself.
     */
    public OSProfile withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}