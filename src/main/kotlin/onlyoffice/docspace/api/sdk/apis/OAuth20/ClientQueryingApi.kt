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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ClientInfoResponse
import onlyoffice.docspace.api.sdk.models.ClientResponse
import onlyoffice.docspace.api.sdk.models.ErrorResponse
import onlyoffice.docspace.api.sdk.models.PageableModificationResponse
import onlyoffice.docspace.api.sdk.models.PageableResponse
import onlyoffice.docspace.api.sdk.models.PageableResponseClientInfoResponse

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
     * @param clientId The client identifier.
     * @return [Call]<[ClientResponse]>
     */
    @GET("api/2.0/clients/{clientId}")
    fun getClient(@Path("clientId") clientId: kotlin.String): Call<ClientResponse>

    /**
     * GET api/2.0/clients/{clientId}/info
     * Get detailed client information
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
     * @param clientId The client identifier.
     * @return [Call]<[ClientInfoResponse]>
     */
    @GET("api/2.0/clients/{clientId}/info")
    fun getClientInfo(@Path("clientId") clientId: kotlin.String): Call<ClientInfoResponse>

    /**
     * GET api/2.0/clients
     * Get clients
     * Retrieves a paginated list of OAuth2 clients. The results can be paginated using the 'limit' parameter and the last seen client ID or creation date.
     * Responses:
     *  - 200: Client list successfully retrieved
     *  - 400: Invalid pagination parameters
     *  - 403: Insufficient permissions to create a client list
     *  - 429: Too many requests - rate limit exceeded
     *  - 500: Internal server error occurred
     *
     * REST API Reference for getClients Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-clients/
     *
     *
     * @param limit The maximum number of results returned per page.
     * @param lastClientId The ID of the last retrieved client. (optional)
     * @param lastCreatedOn The creation date of the last retrieved client. (optional)
     * @return [Call]<[PageableResponse]>
     */
    @GET("api/2.0/clients")
    fun getClients(@Query("limit") limit: kotlin.Int, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Call<PageableResponse>

    /**
     * GET api/2.0/clients/info
     * Get detailed information of clients
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
     * @param limit The maximum number of results returned per page.
     * @param lastClientId The identifier of the last retrieved client. (optional)
     * @param lastCreatedOn The creation date of the last retrieved client. (optional)
     * @return [Call]<[PageableResponseClientInfoResponse]>
     */
    @GET("api/2.0/clients/info")
    fun getClientsInfo(@Query("limit") limit: kotlin.Int, @Query("last_client_id") lastClientId: kotlin.String? = null, @Query("last_created_on") lastCreatedOn: java.time.OffsetDateTime? = null): Call<PageableResponseClientInfoResponse>

    /**
     * GET api/2.0/clients/consents
     * Get user consents
     * Retrieves a paginated list of user consents.
     * Responses:
     *  - 200: Successfully retrieved user consents
     *
     * REST API Reference for getConsents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-consents/
     *
     *
     * @param limit The maximum number of results returned per page.
     * @param lastModifiedOn The date when the user consent was last modified. (optional)
     * @return [Call]<[PageableModificationResponse]>
     */
    @GET("api/2.0/clients/consents")
    fun getConsents(@Query("limit") limit: kotlin.Int, @Query("last_modified_on") lastModifiedOn: java.time.OffsetDateTime? = null): Call<PageableModificationResponse>

    /**
     * GET api/2.0/clients/{clientId}/public/info
     * Get public client information
     * Returns the public information for a client with the ID secified din the request.
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
     * @param clientId The client identifier.
     * @return [Call]<[ClientInfoResponse]>
     */
    @GET("api/2.0/clients/{clientId}/public/info")
    fun getPublicClientInfo(@Path("clientId") clientId: kotlin.String): Call<ClientInfoResponse>

}
