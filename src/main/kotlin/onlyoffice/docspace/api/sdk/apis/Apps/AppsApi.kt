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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.JsonValueWrapper
import onlyoffice.docspace.api.sdk.models.SetAppEnabledBody
import onlyoffice.docspace.api.sdk.models.SetAppSettingsBody

interface AppsApi {
    /**
     * GET api/2.0/apps/{id}
     * Get an app
     * Returns one portal application by its identifier - one of the feature modules the portal can turn on, such as  `ai-rooms` or `docs-cloud` - with the enabled state and the settings document stored for the current portal.  The identifier must be an application declared in the installation configuration: take it  from `GET api/2.0/apps`, because an unknown identifier is rejected instead of creating anything. Any  authenticated portal member may read it. The call is read-only and idempotent. The result carries the  identifier, the enabled flag of the current portal and the settings JSON document, which is empty while the  portal has never saved settings for this application. An application that is not configured on this  installation fails with 404, so this is also the way to find out whether an application exists here at all.  Use `GET api/2.0/apps` to read all applications in one call, or `GET api/2.0/apps/{id}/settings` when only the  settings document is needed.
     * Responses:
     *  - 200: The application with the enabled state and the settings of the current portal
     *  - 404: No application with this identifier is configured on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for get Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get/
     *
     *
     * @param id The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here.
     * @return [AppWrapper]
     */
    @GET("api/2.0/apps/{id}")
    suspend fun get(@Path("id") id: kotlin.String): Response<AppWrapper>

    /**
     * GET api/2.0/apps
     * Get all apps
     * Returns every portal application available on this installation, each with the state it has for the current  portal: the feature modules the portal can turn on and configure, such as `ai-rooms` or `docs-cloud`. The set  of applications and their initial enabled state come from the installation configuration and cannot be changed  through the API; only the enabled flag and the settings document are stored per portal, by  `PUT api/2.0/apps/{id}/enabled` and `PUT api/2.0/apps/{id}/settings`. Any authenticated portal member may read  the list. The call is read-only and idempotent. The list follows the order of the configuration, and every item  carries the application identifier, whether the application is enabled for the current portal, and the settings  JSON document saved for it, which is empty while the portal has never saved one. An empty list means that no  applications are configured on this installation, not that they are all disabled. There is neither paging nor  filtering here: to read a single application use `GET api/2.0/apps/{id}`.
     * Responses:
     *  - 200: The portal applications configured on this installation, each with the enabled state and the settings of the current portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Returns only the settings document of one portal application, such as `ai-rooms` or `docs-cloud`: the JSON  that the current portal has saved for it through `PUT api/2.0/apps/{id}/settings`, with no wrapper around it.  The identifier must be an application declared in the installation configuration, as listed by  `GET api/2.0/apps`. Any authenticated portal member  may read it. The call is read-only and idempotent. The document comes back exactly as it was saved: its shape  is defined by the application itself and is not validated by the portal, and an empty result means that the  portal has never saved settings for this application, so the application uses its own defaults. The enabled  state is not part of the answer: read it from `GET api/2.0/apps/{id}`.
     * Responses:
     *  - 200: The settings document saved for the application, or an empty result if the portal has never saved one
     *  - 404: No application with this identifier is configured on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-settings/
     *
     *
     * @param id The application to read, by the identifier `GET api/2.0/apps` reports - one of the feature modules the portal  can turn on, such as `ai-room` or `docs-cloud`. An identifier not declared in the installation configuration  answers 404, which is also how a caller learns that an application does not exist here.
     * @return [JsonValueWrapper]
     */
    @GET("api/2.0/apps/{id}/settings")
    suspend fun getSettings(@Path("id") id: kotlin.String): Response<JsonValueWrapper>

    /**
     * PUT api/2.0/apps/{id}/enabled
     * Enable or disable an app
     * Turns one portal application on or off for the current portal, and notifies the clients connected to the portal  so that they can show or hide it without being reloaded. The identifier must be an application declared in the  installation configuration, as listed by `GET api/2.0/apps`. The caller must be a portal administrator allowed  to edit the portal settings. The call is mutating and idempotent: it stores the flag for this portal, overriding  the default that the configuration gives the application, and repeating it with the same value changes nothing.  Disabling an application does not delete its settings document, which stays saved and applies again as soon as  the application is enabled. The response is the application in its new state, including that settings document.  Only the enabled flag is affected here: to change the settings document use `PUT api/2.0/apps/{id}/settings`.
     * Responses:
     *  - 200: The application in its new state, with the saved settings document left untouched
     *  - 403: The caller is not allowed to edit the portal settings
     *  - 404: No application with this identifier is configured on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setEnabled Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-enabled/
     *
     *
     * @param id The application to switch, by the identifier `GET api/2.0/apps` reports. It has to be an application declared  in the installation configuration; an unknown identifier answers 404 rather than creating anything.
     * @param setAppEnabledBody The new state of the application. Only the enabled flag travels here; the settings document is changed  through `PUT api/2.0/apps/{id}/settings`.
     * @return [AppWrapper]
     */
    @PUT("api/2.0/apps/{id}/enabled")
    suspend fun setEnabled(@Path("id") id: kotlin.String, @Body setAppEnabledBody: SetAppEnabledBody): Response<AppWrapper>

    /**
     * PUT api/2.0/apps/{id}/settings
     * Save app settings
     * Stores the application-specific settings document of one portal application for the current portal. The  identifier must be an application declared in the installation configuration, as listed by `GET api/2.0/apps`.  The caller must be a portal administrator allowed to edit the portal settings. The call is mutating and  idempotent, and it replaces the whole document instead of merging into it: read the current one with  `GET api/2.0/apps/{id}/settings`, change it and send it back complete, or send `null` to drop the saved document  and let the application fall back to its own defaults. Any valid JSON value is accepted, since the content is  stored as it is and is interpreted by the application rather than by the portal, while a body that is not valid  JSON fails with 400 and stores nothing. The response is the application in its new state, with the stored  document echoed back. Unlike `PUT api/2.0/apps/{id}/enabled`, this operation sends no notification to the  connected clients, which pick the new settings up on their next read.
     * Responses:
     *  - 200: The application in its new state, with the stored settings document
     *  - 400: The request body is not a valid JSON document, so no settings are stored
     *  - 403: The caller is not allowed to edit the portal settings
     *  - 404: No application with this identifier is configured on this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-settings/
     *
     *
     * @param id The application whose configuration is stored, by the identifier `GET api/2.0/apps` reports. An identifier  not declared in the installation configuration answers 404.
     * @param setAppSettingsBody The configuration to store for this portal, replacing whatever was stored before.
     * @return [AppWrapper]
     */
    @PUT("api/2.0/apps/{id}/settings")
    suspend fun setSettings(@Path("id") id: kotlin.String, @Body setAppSettingsBody: SetAppSettingsBody): Response<AppWrapper>

}
