 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ChangeClientActivationRequest
import onlyoffice.docspace.api.sdk.models.ClientResponse
import onlyoffice.docspace.api.sdk.models.ClientSecretResponse
import onlyoffice.docspace.api.sdk.models.CreateClientRequest
import onlyoffice.docspace.api.sdk.models.ErrorResponse
import onlyoffice.docspace.api.sdk.models.UpdateClientRequest

interface ClientManagementApi {
    /**
     * PATCH api/2.0/clients/{clientId}/activation
     * Change the client activation status
     * Activates or deactivates an OAuth2 client. When deactivated, the client cannot request new access tokens, but existing tokens will remain valid until they expire.
     * Responses:
     *  - 200: Client activation status successfully changed
     *  - 400: Invalid client ID format or activation status
     *  - 403: Insufficient permissions to change client activation
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for changeActivation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
     *
     *
     * @param clientId The client identifier.
     * @param changeClientActivationRequest 
     * @return [Call]<[kotlin.Any]>
     */
    @PATCH("api/2.0/clients/{clientId}/activation")
    fun changeActivation(@Path("clientId") clientId: kotlin.String, @Body changeClientActivationRequest: ChangeClientActivationRequest): Call<kotlin.Any>

    /**
     * POST api/2.0/clients
     * Create a new OAuth2 client
     * Creates a new OAuth2 client with the specified configuration. The client will be created with the provided scopes, redirect URIs, and other settings. Returns the created client details including the generated client ID.
     * Responses:
     *  - 201: Client successfully created
     *  - 400: Invalid request - missing required fields or validation failed
     *  - 403: Insufficient permissions to create a client
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for createClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/
     *
     *
     * @param createClientRequest 
     * @return [Call]<[ClientResponse]>
     */
    @POST("api/2.0/clients")
    fun createClient(@Body createClientRequest: CreateClientRequest): Call<ClientResponse>

    /**
     * DELETE api/2.0/clients/{clientId}
     * Delete an OAuth2 client
     * Permanently deletes an OAuth2 client and all associated data. All access and refresh tokens issued to this client will be invalidated. This operation cannot be undone.
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
     * @param clientId The client identifier.
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/2.0/clients/{clientId}")
    fun deleteClient(@Path("clientId") clientId: kotlin.String): Call<kotlin.Any>

    /**
     * PATCH api/2.0/clients/{clientId}/regenerate
     * Regenerate the client secret
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
     * @param clientId The client identifier.
     * @return [Call]<[ClientSecretResponse]>
     */
    @PATCH("api/2.0/clients/{clientId}/regenerate")
    fun regenerateSecret(@Path("clientId") clientId: kotlin.String): Call<ClientSecretResponse>

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
     * @param clientId The client identifier.
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/2.0/clients/{clientId}/revoke")
    fun revokeUserClient(@Path("clientId") clientId: kotlin.String): Call<kotlin.Any>

    /**
     * PUT api/2.0/clients/{clientId}
     * Update an existing OAuth2 client
     * Updates the configuration of an existing OAuth2 client, allowing modifications to the client name, description, redirect URIs, and other settings. The client ID cannot be modified.
     * Responses:
     *  - 200: Client successfully updated
     *  - 400: Invalid request - missing required fields or validation failed
     *  - 403: Insufficient permissions to update client
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for updateClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
     *
     *
     * @param clientId The client identifier.
     * @param updateClientRequest 
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/2.0/clients/{clientId}")
    fun updateClient(@Path("clientId") clientId: kotlin.String, @Body updateClientRequest: UpdateClientRequest): Call<kotlin.Any>

}
