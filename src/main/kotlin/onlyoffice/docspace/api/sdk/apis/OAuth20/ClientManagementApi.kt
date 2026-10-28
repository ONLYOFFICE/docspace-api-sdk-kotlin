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
     * PATCH api/2.0/oauth2/clients/{clientId}/activation
     * Change client activation status
     * Enables or disables an existing client and answers 200 with an empty body. A disabled client can no longer obtain new tokens, but the tokens and consents it already holds stay valid until they expire on their own: disable a client to stop new authorizations, delete it to end the existing ones. An administrator may change any client of the tenant, a plain user only the clients they created. The body carries the single activation flag, and a client the caller may not see is reported as not found rather than as forbidden.
     * Responses:
     *  - 200: Client activation status successfully changed
     *  - 400: The client ID is blank, or the activation status is missing
     *  - 403: Insufficient permissions to change client activation
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 415: The Content-Type header is not application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for changeActivation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-activation/
     *
     *
     * @param clientId ID of the client to change activation for
     * @param changeClientActivationRequest 
     * @return [Unit]
     */
    @PATCH("api/2.0/oauth2/clients/{clientId}/activation")
    suspend fun changeActivation(@Path("clientId") clientId: kotlin.String, @Body changeClientActivationRequest: ChangeClientActivationRequest): Response<Unit>

    /**
     * POST api/2.0/oauth2/clients
     * Create a new OAuth2 client
     * Registers a new OAuth2 client in the caller's tenant and returns it. The body must carry a name, a description, a logo and at least one redirect URI, allowed origin and scope, and every scope named must already exist in the tenant's scope catalogue. Administrators and users may both register clients; the caller is recorded as the creator, which is what later restricts a plain user to the clients they created. The response is the stored client with its generated client ID and secret, and it is the first place either value can be read. Some deployments cap how many clients one tenant may hold, and reaching that cap is reported as 400 together with the validation failures.
     * Responses:
     *  - 201: Client successfully created
     *  - 400: Missing required fields, validation failed, an unknown scope was requested, or the client limit for this tenant has been reached
     *  - 403: Insufficient permissions to create client
     *  - 415: The Content-Type header is not application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for createClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-client/
     *
     *
     * @param createClientRequest 
     * @return [ClientResponse]
     */
    @POST("api/2.0/oauth2/clients")
    suspend fun createClient(@Body createClientRequest: CreateClientRequest): Response<ClientResponse>

    /**
     * DELETE api/2.0/oauth2/clients/{clientId}
     * Delete an OAuth2 client
     * Deletes one client from the tenant permanently and answers 200 with an empty body. An administrator may delete any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The authorizations and consents issued for the client are removed too, but that cleanup is driven by a message and completes on the authorization service after this call has already returned. A delete that removes no row answers 400. The operation cannot be undone.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 400: The client ID is blank, or the client could not be deleted
     *  - 403: Insufficient permissions to delete client
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for deleteClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-client/
     *
     *
     * @param clientId ID of the client to delete
     * @return [Unit]
     */
    @DELETE("api/2.0/oauth2/clients/{clientId}")
    suspend fun deleteClient(@Path("clientId") clientId: kotlin.String): Response<Unit>

    /**
     * DELETE api/2.0/oauth2/clients/tenant
     * Delete all tenant OAuth2 clients
     * Deletes every client registered in the current tenant and answers 200 with an empty body. Only an administrator may call it - for a plain user or a guest it is refused with 403 - and it removes the clients of all users of the tenant, not only those of the caller. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 400: The clients could not be deleted because of concurrent modification
     *  - 403: Insufficient permissions to delete tenant clients
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for deleteTenantClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-tenant-clients/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/oauth2/clients/tenant")
    suspend fun deleteTenantClients(): Response<Unit>

    /**
     * DELETE api/2.0/oauth2/clients
     * Delete all user OAuth2 clients
     * Deletes every client the calling user created in the current tenant and answers 200 with an empty body. The caller's own identity always selects the set, so this never reaches clients created by somebody else, not even for an administrator. The authorizations and consents of the deleted clients are cleaned up asynchronously on the authorization service, and the tenant's client cache is dropped as part of the call. Concurrent modification that survives the retries is reported as 400. The operation cannot be undone, and the response does not say how many clients were removed.
     * Responses:
     *  - 200: Client successfully deleted
     *  - 400: The clients could not be deleted because of concurrent modification
     *  - 403: Insufficient permissions to delete user clients
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for deleteUserClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-user-clients/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/oauth2/clients")
    suspend fun deleteUserClients(): Response<Unit>

    /**
     * PATCH api/2.0/oauth2/clients/{clientId}/regenerate
     * Regenerate client secret
     * Issues a new secret for the client and returns it. The previous secret stops working as soon as this call succeeds, there is no grace period and no way to recover it, so every deployed copy of the client has to be updated with the value returned here. An administrator may do this for any client of the tenant, a plain user only for the clients they created. Tokens already issued to the client keep working; only future client authentication is affected. The response carries the new secret and nothing else.
     * Responses:
     *  - 200: Client secret successfully regenerated
     *  - 400: The client ID is blank or contains only whitespace
     *  - 403: Insufficient permissions to regenerate client secret
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for regenerateSecret Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/regenerate-secret/
     *
     *
     * @param clientId ID of the client to regenerate secret for
     * @return [ClientSecretResponse]
     */
    @PATCH("api/2.0/oauth2/clients/{clientId}/regenerate")
    suspend fun regenerateSecret(@Path("clientId") clientId: kotlin.String): Response<ClientSecretResponse>

    /**
     * DELETE api/2.0/oauth2/clients/{clientId}/revoke
     * Revoke client consent
     * Revokes the calling user's own consent for one client and answers 200 with an empty body. It touches only the caller's grant: other users keep their consents and the client itself stays registered. Guests may call it as well as users and administrators, because it can never reach anyone else's data. The revocation is carried out by the authorization service over gRPC, so a service that reports nothing was revoked produces 400 and a service that cannot be reached produces 503. Once it succeeds the user has to authorize the client again before it can act on their behalf.
     * Responses:
     *  - 200: Client consent successfully revoked
     *  - 400: The client ID is blank, or the authorization service reported that the consent was not revoked
     *  - 403: Insufficient permissions to revoke consent
     *  - 429: Too many requests - rate limit exceeded
     *  - 503: Authorization service unavailable
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for revokeUserClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/revoke-user-client/
     *
     *
     * @param clientId ID of the client to revoke consent for
     * @return [Unit]
     */
    @DELETE("api/2.0/oauth2/clients/{clientId}/revoke")
    suspend fun revokeUserClient(@Path("clientId") clientId: kotlin.String): Response<Unit>

    /**
     * PUT api/2.0/oauth2/clients/{clientId}
     * Update an existing OAuth2 client
     * Updates the mutable settings of an existing client and answers 200 with an empty body. Only the fields carried in the request body change; the client ID, the secret, the tenant and the creator cannot be changed this way. An administrator may update any client of the tenant, a plain user only the clients they created, and a client the caller may not see is reported as not found rather than as forbidden. The write runs under optimistic locking and is retried a few times, so a request that still loses the race is rejected with 400 instead of silently overwriting a concurrent change. Nothing is returned in the body - read the client back to see the stored result.
     * Responses:
     *  - 200: Client successfully updated
     *  - 400: Missing required fields, validation failed, or the client could not be updated because of concurrent modification
     *  - 403: Insufficient permissions to update client
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 415: The Content-Type header is not application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for updateClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-client/
     *
     *
     * @param clientId ID of the client to update
     * @param updateClientRequest 
     * @return [Unit]
     */
    @PUT("api/2.0/oauth2/clients/{clientId}")
    suspend fun updateClient(@Path("clientId") clientId: kotlin.String, @Body updateClientRequest: UpdateClientRequest): Response<Unit>

}
