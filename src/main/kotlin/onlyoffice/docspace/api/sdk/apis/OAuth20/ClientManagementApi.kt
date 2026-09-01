 /*
 * (c) Copyright Ascensio System SIA 2026
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package onlyoffice.docspace.api.sdk.apis.OAuth20

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ChangeClientActivationRequest
import onlyoffice.docspace.api.sdk.models.ClientResponse
import onlyoffice.docspace.api.sdk.models.ClientSecretResponse
import onlyoffice.docspace.api.sdk.models.CreateClientRequest
import onlyoffice.docspace.api.sdk.models.ProblemDetail
import onlyoffice.docspace.api.sdk.models.UpdateClientRequest

interface ClientManagementApi {
    /**
     * PATCH api/2.0/clients/{clientId}/activation
     * Change client activation status
     * Activates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.
     * Responses:
     *  - 200: Client activation status successfully changed
     *  - 400: Invalid client ID format or activation status
     *  - 403: Insufficient permissions to change client activation
     *  - 404: Client not found
     *  - 415: Unsupported media type
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for changeActivation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
     *
     *
     * @param clientId ID of the client to change activation for
     * @param changeClientActivationRequest 
     * @return [kotlin.Any]
     */
    @PATCH("api/2.0/clients/{clientId}/activation")
    suspend fun changeActivation(@Path("clientId") clientId: kotlin.String, @Body changeClientActivationRequest: ChangeClientActivationRequest): Response<kotlin.Any>

    /**
     * POST api/2.0/clients
     * Create a new OAuth2 client
     * Creates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.
     * Responses:
     *  - 201: Client successfully created
     *  - 400: Invalid request - missing required fields or validation failed
     *  - 403: Insufficient permissions to create client
     *  - 415: Unsupported media type
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for createClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/
     *
     *
     * @param createClientRequest 
     * @return [ClientResponse]
     */
    @POST("api/2.0/clients")
    suspend fun createClient(@Body createClientRequest: CreateClientRequest): Response<ClientResponse>

    /**
     * DELETE api/2.0/clients/{clientId}
     * Delete an OAuth2 client
     * Permanently deletes an OAuth2 client and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 400: Invalid client ID format
     *  - 403: Insufficient permissions to delete client
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for deleteClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
     *
     *
     * @param clientId ID of the client to delete
     * @return [kotlin.Any]
     */
    @DELETE("api/2.0/clients/{clientId}")
    suspend fun deleteClient(@Path("clientId") clientId: kotlin.String): Response<kotlin.Any>

    /**
     * DELETE api/2.0/clients/tenant
     * Delete all tenant OAuth2 clients
     * Permanently deletes tenant OAuth2 clients and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 403: Insufficient permissions to delete tenant clients
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for deleteTenantClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-tenant-clients/
     *
     *
     * @return [kotlin.Any]
     */
    @DELETE("api/2.0/clients/tenant")
    suspend fun deleteTenantClients(): Response<kotlin.Any>

    /**
     * DELETE api/2.0/clients
     * Delete all user OAuth2 clients
     * Permanently deletes user OAuth2 clients and all associated data. This will invalidate all access tokens and refresh tokens issued to this client. This operation cannot be undone.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 403: Insufficient permissions to delete user clients
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for deleteUserClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-user-clients/
     *
     *
     * @return [kotlin.Any]
     */
    @DELETE("api/2.0/clients")
    suspend fun deleteUserClients(): Response<kotlin.Any>

    /**
     * PATCH api/2.0/clients/{clientId}/regenerate
     * Regenerate client secret
     * Generates a new client secret for the specified OAuth2 client. The old secret will be immediately invalidated. This operation should be used with caution as it requires updating the secret in all client applications.
     * Responses:
     *  - 200: Client secret successfully regenerated
     *  - 400: Invalid client ID format
     *  - 403: Insufficient permissions to regenerate client secret
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for regenerateSecret Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
     *
     *
     * @param clientId ID of the client to regenerate secret for
     * @return [ClientSecretResponse]
     */
    @PATCH("api/2.0/clients/{clientId}/regenerate")
    suspend fun regenerateSecret(@Path("clientId") clientId: kotlin.String): Response<ClientSecretResponse>

    /**
     * DELETE api/2.0/clients/{clientId}/revoke
     * Revoke client consent
     * Revokes all user consents for the specified OAuth2 client. This will invalidate all access tokens and refresh tokens issued to this client for the current user. The user will need to re-authorize the client to access their resources.
     * Responses:
     *  - 200: Client consent successfully revoked
     *  - 400: Invalid client ID format
     *  - 403: Insufficient permissions to revoke consent
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 503: Authorization service unavailable
     *
     * REST API Reference for revokeUserClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
     *
     *
     * @param clientId ID of the client to revoke consent for
     * @return [kotlin.Any]
     */
    @DELETE("api/2.0/clients/{clientId}/revoke")
    suspend fun revokeUserClient(@Path("clientId") clientId: kotlin.String): Response<kotlin.Any>

    /**
     * PUT api/2.0/clients/{clientId}
     * Update an existing OAuth2 client
     * Updates the configuration of an existing OAuth2 client. Allows modification of client name, description, redirect URIs, and other settings. The client ID cannot be modified.
     * Responses:
     *  - 200: Client successfully updated
     *  - 400: Invalid request - missing required fields or validation failed
     *  - 403: Insufficient permissions to update client
     *  - 404: Client not found
     *  - 415: Unsupported media type
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for updateClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
     *
     *
     * @param clientId ID of the client to update
     * @param updateClientRequest 
     * @return [kotlin.Any]
     */
    @PUT("api/2.0/clients/{clientId}")
    suspend fun updateClient(@Path("clientId") clientId: kotlin.String, @Body updateClientRequest: UpdateClientRequest): Response<kotlin.Any>

}
