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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ActiveConnectionsWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface ActiveConnectionsApi {
    /**
     * GET api/2.0/security/activeconnections
     * Get active connections
     * Returns all the active connections to the portal.
     * Responses:
     *  - 200: Active portal connections
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAllActiveConnections Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-active-connections/
     *
     *
     * @return [ActiveConnectionsWrapper]
     */
    @GET("api/2.0/security/activeconnections")
    suspend fun getAllActiveConnections(): Response<ActiveConnectionsWrapper>

    /**
     * PUT api/2.0/security/activeconnections/logout/{loginEventId}
     * Log out from the connection
     * Logs out from the connection with the ID specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for logOutActiveConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-active-connection/
     *
     *
     * @param loginEventId The ID of the specific login event.
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/security/activeconnections/logout/{loginEventId}")
    suspend fun logOutActiveConnection(@Path("loginEventId") loginEventId: kotlin.Int): Response<BooleanWrapper>

    /**
     * PUT api/2.0/security/activeconnections/logoutallchangepassword
     * Log out and change password
     * Logs out from all the active connections for the current user and changes their password.
     * Responses:
     *  - 200: URL to the confirmation message for changing a password
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for logOutAllActiveConnectionsChangePassword Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-change-password/
     *
     *
     * @return [StringWrapper]
     */
    @PUT("api/2.0/security/activeconnections/logoutallchangepassword")
    suspend fun logOutAllActiveConnectionsChangePassword(): Response<StringWrapper>

    /**
     * PUT api/2.0/security/activeconnections/logoutall/{userId}
     * Log out for the user by ID
     * Logs out from all the active connections for the user with the ID specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 403: Access denied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for logOutAllActiveConnectionsForUser Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-active-connections-for-user/
     *
     *
     * @param userId The user ID extracted from the route parameters.
     * @return [Unit]
     */
    @PUT("api/2.0/security/activeconnections/logoutall/{userId}")
    suspend fun logOutAllActiveConnectionsForUser(@Path("userId") userId: java.util.UUID): Response<Unit>

    /**
     * PUT api/2.0/security/activeconnections/logoutallexceptthis
     * Log out from all connections except the current one
     * Logs out from all the active connections except the current connection.
     * Responses:
     *  - 200: Current user name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for logOutAllExceptThisConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/log-out-all-except-this-connection/
     *
     *
     * @return [StringWrapper]
     */
    @PUT("api/2.0/security/activeconnections/logoutallexceptthis")
    suspend fun logOutAllExceptThisConnection(): Response<StringWrapper>

}
