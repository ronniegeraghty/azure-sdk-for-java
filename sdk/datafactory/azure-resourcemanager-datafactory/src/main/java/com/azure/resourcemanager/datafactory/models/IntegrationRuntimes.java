// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimes. */
public interface IntegrationRuntimes {
    /**
     * Lists integration runtimes.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationRuntimeResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists integration runtimes.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IntegrationRuntimeResource> listByFactory(
        String resourceGroupName, String factoryName, Context context);

    /**
     * Gets an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime.
     */
    IntegrationRuntimeResource get(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param ifNoneMatch ETag of the integration runtime entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeResource> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Deletes an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Gets detailed status information for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed status information for an integration runtime.
     */
    IntegrationRuntimeStatusResponse getStatus(
        String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets detailed status information for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed status information for an integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeStatusResponse> getStatusWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     */
    IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets the list of outbound network dependencies for a given Azure-SSIS integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of outbound network dependencies for a given Azure-SSIS integration runtime along with {@link
     *     Response}.
     */
    Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse>
        listOutboundNetworkDependenciesEndpointsWithResponse(
            String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Gets the on-premises integration runtime connection information for encrypting the on-premises data source
     * credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the on-premises integration runtime connection information for encrypting the on-premises data source
     *     credentials.
     */
    IntegrationRuntimeConnectionInfo getConnectionInfo(
        String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets the on-premises integration runtime connection information for encrypting the on-premises data source
     * credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the on-premises integration runtime connection information for encrypting the on-premises data source
     *     credentials along with {@link Response}.
     */
    Response<IntegrationRuntimeConnectionInfo> getConnectionInfoWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Regenerates the authentication key for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    IntegrationRuntimeAuthKeys regenerateAuthKey(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters);

    /**
     * Regenerates the authentication key for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys along with {@link Response}.
     */
    Response<IntegrationRuntimeAuthKeys> regenerateAuthKeyWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
        Context context);

    /**
     * Retrieves the authentication keys for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    IntegrationRuntimeAuthKeys listAuthKeys(
        String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Retrieves the authentication keys for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys along with {@link Response}.
     */
    Response<IntegrationRuntimeAuthKeys> listAuthKeysWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Starts a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    IntegrationRuntimeStatusResponse start(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Starts a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    IntegrationRuntimeStatusResponse start(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Stops a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Stops a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncCredentials(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override
     * the credentials across all worker nodes with those available on the dispatcher node. If you already have the
     * latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime
     * node than using this API directly.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> syncCredentialsWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Get the integration runtime monitoring data, which includes the monitor data for all the nodes under this
     * integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime monitoring data, which includes the monitor data for all the nodes under this
     *     integration runtime.
     */
    IntegrationRuntimeMonitoringData getMonitoringData(
        String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Get the integration runtime monitoring data, which includes the monitor data for all the nodes under this
     * integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime monitoring data, which includes the monitor data for all the nodes under this
     *     integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeMonitoringData> getMonitoringDataWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Upgrade self-hosted integration runtime to latest version if availability.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgrade(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Upgrade self-hosted integration runtime to latest version if availability.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> upgradeWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context);

    /**
     * Remove all linked integration runtimes under specific data factory in a self-hosted integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param linkedIntegrationRuntimeRequest The data factory name for the linked integration runtime.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeLinks(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest);

    /**
     * Remove all linked integration runtimes under specific data factory in a self-hosted integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param linkedIntegrationRuntimeRequest The data factory name for the linked integration runtime.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> removeLinksWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        LinkedIntegrationRuntimeRequest linkedIntegrationRuntimeRequest,
        Context context);

    /**
     * Create a linked integration runtime entry in a shared integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param createLinkedIntegrationRuntimeRequest The linked integration runtime properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response.
     */
    IntegrationRuntimeStatusResponse createLinkedIntegrationRuntime(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest);

    /**
     * Create a linked integration runtime entry in a shared integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param createLinkedIntegrationRuntimeRequest The linked integration runtime properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration runtime status response along with {@link Response}.
     */
    Response<IntegrationRuntimeStatusResponse> createLinkedIntegrationRuntimeWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        CreateLinkedIntegrationRuntimeRequest createLinkedIntegrationRuntimeRequest,
        Context context);

    /**
     * Gets an integration runtime.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    IntegrationRuntimeResource getById(String id);

    /**
     * Gets an integration runtime.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the integration runtime entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime along with {@link Response}.
     */
    Response<IntegrationRuntimeResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes an integration runtime.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an integration runtime.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IntegrationRuntimeResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new IntegrationRuntimeResource definition.
     */
    IntegrationRuntimeResource.DefinitionStages.Blank define(String name);
}
