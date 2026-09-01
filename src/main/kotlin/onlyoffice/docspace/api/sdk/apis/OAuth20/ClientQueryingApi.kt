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
import onlyoffice.docspace.api.sdk.models.PageableModificationResponse
import onlyoffice.docspace.api.sdk.models.PageableResponse
import onlyoffice.docspace.api.sdk.models.PageableResponseClientInfoResponse
import onlyoffice.docspace.api.sdk.models.ProblemDetail

interface ClientQueryingApi {
    /**
     * GET api/2.0/clients/{clientId}
     * Get client details
     * Retrieves detailed information about a specific OAuth2 client including its name, description, redirect URIs, and scopes.
     * Responses:
     *  - 200: Client details successfully retrieved
     *  - 400: Invalid client ID format
     *  - 403: Insufficient permissions to view client
     *  - 404: Client not found
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for getClient Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientResponse]
     */
    @GET("api/2.0/clients/{clientId}")
    suspend fun getClient(@Path("clientId") clientId: kotlin.String): Response<ClientResponse>

    /**
     * GET api/2.0/clients/{clientId}/info
     * Retrieves detailed information for a specific client
     * Retrieves the detailed information for a client with the ID specified in the request.
     * Responses:
     *  - 200: Successfully retrieved client info
     *  - 400: Bad request
     *  - 429: Too many requests
     *  - 500: Internal server error
     *
     * REST API Reference for getClientInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-client-info/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientInfoResponse]
     */
    @GET("api/2.0/clients/{clientId}/info")
    suspend fun getClientInfo(@Path("clientId") clientId: kotlin.String): Response<ClientInfoResponse>

    /**
     * GET api/2.0/clients
     * List clients
     * Retrieves a paginated list of OAuth2 clients. The results can be paginated using the limit parameter and last seen client ID/creation date.
     * Responses:
     *  - 200: Client list successfully retrieved
     *  - 400: Invalid pagination parameters
     *  - 403: Insufficient permissions to list clients
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for getClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
     *
     *
     * @param limit Pagination limit (default to 30)
     * @param lastClientId ID of the last retrieved client (optional)
     * @param lastCreatedOn Date of the last retrieved client (optional)
     * @return [PageableResponse]
     */
    @GET("api/2.0/clients")
    suspend fun getClients(@Query("limit") limit: kotlin.Int = 30, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Response<PageableResponse>

    /**
     * GET api/2.0/clients/info
     * Retrieves a pageable list of client information
     * Retrieves a paginated list of information for all clients.
     * Responses:
     *  - 200: Successfully retrieved clients info
     *  - 400: Bad request
     *  - 429: Too many requests
     *  - 500: Internal server error
     *
     * REST API Reference for getClientsInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients-info/
     *
     *
     * @param limit Pagination limit
     * @param lastClientId ID of the last retrieved client (optional)
     * @param lastCreatedOn Date of the last retrieved client (optional)
     * @return [PageableResponseClientInfoResponse]
     */
    @GET("api/2.0/clients/info")
    suspend fun getClientsInfo(@Query("limit") limit: kotlin.Int, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Response<PageableResponseClientInfoResponse>

    /**
     * GET api/2.0/clients/consents
     * Retrieves a pageable list of consents
     * Retrieves a paginated list of user consents.
     * Responses:
     *  - 200: Successfully retrieved user consents
     *
     * REST API Reference for getConsents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
     *
     *
     * @param limit Pagination limit
     * @param lastModifiedOn Date of the last retrieved consent (optional)
     * @return [PageableModificationResponse]
     */
    @GET("api/2.0/clients/consents")
    suspend fun getConsents(@Query("limit") limit: kotlin.Int, @Query("last_modified_on") lastModifiedOn: java.time.OffsetDateTime? = null): Response<PageableModificationResponse>

    /**
     * GET api/2.0/clients/{clientId}/public/info
     * Handles the GET request for public client information
     * 
     * Responses:
     *  - 200: Successfully retrieved client public info
     *  - 400: Bad request
     *  - 429: Too many requests
     *  - 500: Internal server error
     *
     * REST API Reference for getPublicClientInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-client-info/
     *
     *
     * @param clientId ID of the client to retrieve
     * @return [ClientInfoResponse]
     */
    @GET("api/2.0/clients/{clientId}/public/info")
    suspend fun getPublicClientInfo(@Path("clientId") clientId: kotlin.String): Response<ClientInfoResponse>

}
