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


package onlyoffice.docspace.api.sdk.apis.Apps

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AppArrayWrapper
import onlyoffice.docspace.api.sdk.models.AppWrapper
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.SetAppEnabledBody
import onlyoffice.docspace.api.sdk.models.SetAppSettingsBody

interface AppsApi {
    /**
     * GET api/2.0/apps/{id}
     * Get a single app
     * Returns a single application by id with the per-tenant enabled state and settings JSON.
     * Responses:
     *  - 200: Application info
     *  - 404: Application not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for get Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get/
     *
     *
     * @param id The application identifier.
     * @return [AppWrapper]
     */
    @GET("api/2.0/apps/{id}")
    suspend fun get(@Path("id") id: kotlin.String): Response<AppWrapper>

    /**
     * GET api/2.0/apps
     * Get all apps
     * Returns the full list of portal applications declared in configuration, merged with per-tenant overrides  (enabled state and JSON settings).
     * Responses:
     *  - 200: List of applications
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAll Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all/
     *
     *
     * @return [AppArrayWrapper]
     */
    @GET("api/2.0/apps")
    suspend fun getAll(): Response<AppArrayWrapper>

    /**
     * GET api/2.0/apps/{id}/settings
     * Get app settings
     * Returns the JSON settings document saved for the specified application, or null if no overrides exist.
     * Responses:
     *  - 200: Application settings JSON
     *  - 404: Application not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/
     *
     *
     * @param id The application identifier.
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/apps/{id}/settings")
    suspend fun getSettings(@Path("id") id: kotlin.String): Response<ObjectWrapper>

    /**
     * PUT api/2.0/apps/{id}/enabled
     * Enable or disable an app
     * Toggles the enabled state of the application for the current tenant. Requires portal administrator permissions.
     * Responses:
     *  - 200: Updated application info
     *  - 403: You don't have enough permission to manage apps
     *  - 404: Application not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setEnabled Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/
     *
     *
     * @param id The application identifier.
     * @param setAppEnabledBody New enabled state.
     * @return [AppWrapper]
     */
    @PUT("api/2.0/apps/{id}/enabled")
    suspend fun setEnabled(@Path("id") id: kotlin.String, @Body setAppEnabledBody: SetAppEnabledBody): Response<AppWrapper>

    /**
     * PUT api/2.0/apps/{id}/settings
     * Save app settings
     * Saves an arbitrary JSON settings document for the specified application for the current tenant.  Requires portal administrator permissions.
     * Responses:
     *  - 200: Updated application info
     *  - 400: Settings is not valid JSON
     *  - 403: You don't have enough permission to manage apps
     *  - 404: Application not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/
     *
     *
     * @param id The application identifier.
     * @param setAppSettingsBody New settings document.
     * @return [AppWrapper]
     */
    @PUT("api/2.0/apps/{id}/settings")
    suspend fun setSettings(@Path("id") id: kotlin.String, @Body setAppSettingsBody: SetAppSettingsBody): Response<AppWrapper>

}
