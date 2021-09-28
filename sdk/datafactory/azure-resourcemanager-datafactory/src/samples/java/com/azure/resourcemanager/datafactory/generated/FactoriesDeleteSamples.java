// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.Context;

/** Samples for Factories Delete. */
public final class FactoriesDeleteSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Factories_Delete.json
     */
    /**
     * Sample code: Factories_Delete.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void factoriesDelete(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.factories().deleteWithResponse("exampleResourceGroup", "exampleFactoryName", Context.NONE);
    }
}