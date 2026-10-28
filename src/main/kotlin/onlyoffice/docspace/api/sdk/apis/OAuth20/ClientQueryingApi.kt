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

import onlyoffice.docspace.api.sdk.models.ClientInfoResponse
import onlyoffice.docspace.api.sdk.models.ClientResponse
import onlyoffice.docspace.api.sdk.models.PageableClientInfoResponse
import onlyoffice.docspace.api.sdk.models.PageableClientResponse
import onlyoffice.docspace.api.sdk.models.PageableModificationResponse
import onlyoffice.docspace.api.sdk.models.ProblemDetail

interface ClientQueryingApi {
    /**
     * GET api/2.0/oauth2/clients/{clientId}
     * Get client details
     * Returns the whole stored record of one client: its name and description, its secret, scopes, redirect URIs, allowed origins, logout redirect URIs and audit fields. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. Whatever the caller may not see is reported as 404 rather than 403, so absence and lack of access are deliberately indistinguishable, and an identifier that is not a valid client ID is reported the same way. The response is a single object, not a collection.
     * Responses:
     *  - 200: Client details successfully retrieved
     *  - 400: The client ID is blank or contains only whitespace
     *  - 403: Insufficient permissions to view client
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for getClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientResponse]
     */
    @GET("api/2.0/oauth2/clients/{clientId}")
    suspend fun getClient(@Path("clientId") clientId: kotlin.String): Response<ClientResponse>

    /**
     * GET api/2.0/oauth2/clients/{clientId}/info
     * Get client info
     * Retrieves the detailed information for a client with the ID specified in the request. It returns the consent-facing subset of the client - name, description, logo, the website, terms and policy URLs, authentication methods and scopes - and deliberately omits the secret, the redirect URIs and the allowed origins, which is what makes it safe to render on a consent screen. An administrator sees any client of the tenant, a plain user only the clients they created, and a guest none of them. A client the caller may not see is reported as 404, exactly like an unknown one.
     * Responses:
     *  - 200: Successfully retrieved client info
     *  - 400: The client ID is blank or contains only whitespace
     *  - 403: Insufficient permissions to view client information
     *  - 404: No client with this ID is visible to the caller, or the ID cannot be parsed as a client ID
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for getClientInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientInfoResponse]
     */
    @GET("api/2.0/oauth2/clients/{clientId}/info")
    suspend fun getClientInfo(@Path("clientId") clientId: kotlin.String): Response<ClientInfoResponse>

    /**
     * GET api/2.0/oauth2/clients
     * List clients
     * Returns one page of the tenant's clients, newest first, each in the same full form as the single-client read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based rather than offset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page to ask for the next one. The limit defaults to 30 and has to lie between 1 and 50; a value outside that range, or a last_created_on that cannot be parsed as a date, is rejected with 400.
     * Responses:
     *  - 200: Client list successfully retrieved
     *  - 400: Invalid pagination parameters, including a last_created_on that cannot be parsed as a date-time
     *  - 403: Insufficient permissions to list clients
     *  - 406: The Accept header does not allow application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *
     * REST API Reference for getClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
     *
     *
     * @param limit How many entries to return, between 1 and 50. Defaults to 30 when omitted. (optional, default to 30)
     * @param lastClientId ID of the last retrieved client (optional)
     * @param lastCreatedOn Date of the last retrieved client (optional)
     * @return [PageableClientResponse]
     */
    @GET("api/2.0/oauth2/clients")
    suspend fun getClients(@Query("limit") limit: kotlin.Int? = 30, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Response<PageableClientResponse>

    /**
     * GET api/2.0/oauth2/clients/info
     * List client info
     * Retrieves a paginated list of information for all clients, each in the same consent-facing form as the single-client info read. An administrator sees every client of the tenant, a plain user only the clients they created. Paging is keyset-based: limit sets the page size, and last_client_id and last_created_on are carried over from the previous page. Unlike the full client listing, limit has no default here - it has to be supplied on every call and has to lie between 1 and 50, and a missing or out-of-range value is rejected with 400.
     * Responses:
     *  - 200: Successfully retrieved clients info
     *  - 400: The limit parameter is missing, is outside the range 1-50, or last_created_on cannot be parsed as a date-time
     *  - 403: Insufficient permissions to list client information
     *  - 406: The Accept header does not allow application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *
     * REST API Reference for getClientsInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
     *
     *
     * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
     * @param lastClientId ID of the last retrieved client (optional)
     * @param lastCreatedOn Date of the last retrieved client (optional)
     * @return [PageableClientInfoResponse]
     */
    @GET("api/2.0/oauth2/clients/info")
    suspend fun getClientsInfo(@Query("limit") limit: kotlin.Int, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Response<PageableClientInfoResponse>

    /**
     * GET api/2.0/oauth2/clients/consents
     * List user consents
     * Retrieves a paginated list of user consents: the clients the calling user has authorized, each with the scopes granted, the moment the consent was last changed and the client's consent-facing details. It always reports the caller's own consents and nothing else - there is no role check on this endpoint, so guests may call it too, and no parameter widens it to another user. The consents are read from the authorization service over gRPC, so an authorization service that cannot be reached surfaces as 503. Paging is keyset-based on last_modified_on, and limit has no default: it has to be supplied on every call and has to lie between 1 and 50.
     * Responses:
     *  - 200: Successfully retrieved user consents
     *  - 400: The limit parameter is missing, is outside the range 1-50, or last_modified_on cannot be parsed as a date-time
     *  - 403: The request carries no valid portal signature
     *  - 406: The Accept header does not allow application/json
     *  - 429: Too many requests - rate limit exceeded
     *  - 503: Authorization service unavailable
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *
     * REST API Reference for getConsents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
     *
     *
     * @param limit How many entries to return, between 1 and 50. It has no default and has to be sent on every call.
     * @param lastModifiedOn Date of the last retrieved consent (optional)
     * @return [PageableModificationResponse]
     */
    @GET("api/2.0/oauth2/clients/consents")
    suspend fun getConsents(@Query("limit") limit: kotlin.Int, @Query("last_modified_on") lastModifiedOn: java.time.OffsetDateTime? = null): Response<PageableModificationResponse>

    /**
     * GET api/2.0/oauth2/clients/{clientId}/public/info
     * Get public client info
     * Returns the same consent-facing client information as the signed read, but without requiring a portal signature. It is meant for a login or consent page that has to render the client before the user is known, so it resolves the client by ID alone: there is no authentication, no tenant scoping and no creator check, and any caller who knows a client ID can read that client's public details. It still exposes no secret, no redirect URIs and no allowed origins. Being unauthenticated it is rate-limited on a separate, tighter budget than the signed endpoints. An unknown client ID, and an identifier that is not a client ID at all, are both reported as 404.
     * Responses:
     *  - 200: Successfully retrieved client public info
     *  - 400: The client ID is blank or contains only whitespace
     *  - 404: No client with this ID exists, or the ID cannot be parsed as a client ID
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *  - 405: The HTTP method is not allowed for this path
     *  - 406: The Accept header does not allow application/json
     *
     * REST API Reference for getPublicClientInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientInfoResponse]
     */
    @GET("api/2.0/oauth2/clients/{clientId}/public/info")
    suspend fun getPublicClientInfo(@Path("clientId") clientId: kotlin.String): Response<ClientInfoResponse>

}
