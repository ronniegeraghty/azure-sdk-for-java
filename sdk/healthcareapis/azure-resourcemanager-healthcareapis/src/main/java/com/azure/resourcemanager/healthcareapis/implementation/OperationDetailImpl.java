// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.resourcemanager.healthcareapis.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.healthcareapis.models.ActionType;
import com.azure.resourcemanager.healthcareapis.models.OperationDetail;
import com.azure.resourcemanager.healthcareapis.models.OperationDisplay;
import com.azure.resourcemanager.healthcareapis.models.OperationProperties;

public final class OperationDetailImpl implements OperationDetail {
    private OperationDetailInner innerObject;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    OperationDetailImpl(
        OperationDetailInner innerObject,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ActionType actionType() {
        return this.innerModel().actionType();
    }

    public OperationProperties properties() {
        return this.innerModel().properties();
    }

    public OperationDetailInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }
}
