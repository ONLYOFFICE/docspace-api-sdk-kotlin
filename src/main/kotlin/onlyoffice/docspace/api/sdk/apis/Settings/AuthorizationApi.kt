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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AuthServiceRequestsArrayWrapper
import onlyoffice.docspace.api.sdk.models.AuthServiceRequestsDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ConnectionTestResultWrapper
import onlyoffice.docspace.api.sdk.models.ExternalDatabaseSettings

interface AuthorizationApi {
    /**
     * GET api/2.0/settings/authservice
     * Get the authorization services
     * Returns the authorization services.
     * Responses:
     *  - 200: Authorization services
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuthServices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-auth-services/
     *
     *
     * @return [AuthServiceRequestsArrayWrapper]
     */
    @GET("api/2.0/settings/authservice")
    suspend fun getAuthServices(): Response<AuthServiceRequestsArrayWrapper>

    /**
     * POST api/2.0/settings/authservice
     * Save the authorization keys
     * Saves the authorization keys.
     * Responses:
     *  - 200: Boolean value: true if the authorization keys are changed
     *  - 400: Bad keys
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveAuthKeys Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-auth-keys/
     *
     *
     * @param authServiceRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/authservice")
    suspend fun saveAuthKeys(@Body authServiceRequestsDto: AuthServiceRequestsDto? = null): Response<BooleanWrapper>

    /**
     * POST api/2.0/settings/authservice/externaldb/test
     * Test external database connection
     * Tests an external database connection with the provided settings without saving them.
     * Responses:
     *  - 200: Connection test result with Success flag and optional Error message
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for testExternalDatabaseConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/test-external-database-connection/
     *
     *
     * @param externalDatabaseSettings  (optional)
     * @return [ConnectionTestResultWrapper]
     */
    @POST("api/2.0/settings/authservice/externaldb/test")
    suspend fun testExternalDatabaseConnection(@Body externalDatabaseSettings: ExternalDatabaseSettings? = null): Response<ConnectionTestResultWrapper>

}
