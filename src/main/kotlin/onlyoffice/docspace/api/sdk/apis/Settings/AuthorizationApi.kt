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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.ExternalDatabaseSettings

interface AuthorizationApi {
    /**
     * GET api/2.0/settings/authservice
     * Get the authorization services
     * Returns the catalogue of third-party storage and authorization providers DocSpace can integrate with (for  example Amazon S3, Dropbox, Google, or Telegram), including whichever keys were last saved for each one that  currently has any configured. Requires Owner or DocSpaceAdmin (the EditPortalSettings permission). This is a  read-only, idempotent call, and the list is not paginated; entries are ordered by the provider's configured  display order. Only providers that expose at least one manageable key are included, so a provider with nothing  to configure is omitted entirely. Save or change a provider's keys with `POST api/2.0/settings/authservice`.
     * Responses:
     *  - 200: Third-party providers with a manageable key, and their last-saved key values
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Saves the authorization keys for one third-party storage or authorization provider, identified by name, or  clears them when every submitted key is left empty. Requires Owner or DocSpaceAdmin (the EditPortalSettings  permission); a provider that does not allow its keys to be changed from the API rejects the call outright. A  provider that is only available on a paid plan additionally requires the portal's tariff to include  third-party storage, or Standalone licensing, before the call is accepted. Keys that fail the provider's own  validation are cleared and the call is rejected rather than left partially applied. This is a mutating,  idempotent call: resaving identical keys succeeds and reports no change. It returns whether the keys actually  changed, not the keys themselves; connecting Telegram or an external database through this call also triggers  the matching real-time connection update.
     * Responses:
     *  - 200: Whether the provider's keys actually changed
     *  - 400: The submitted keys failed the provider's own validation
     *  - 402: The provider is a paid option not covered by the portal's current pricing plan
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Probes connectivity to an external database using the settings supplied in the request, without saving them or  affecting the portal's own configuration. Requires Owner or DocSpaceAdmin (the EditPortalSettings permission).  SQLite is only accepted as a target on a Standalone (self-hosted) installation; requesting it on SaaS is  reported as a failed connection rather than an error. This is a read-only call, safe to retry. A failed  connection is not an HTTP error: the response always comes back as a normal success with `success=false` and  an `error` message describing what went wrong.
     * Responses:
     *  - 200: Connection test result: a success flag and, on failure, an error message
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
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
