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

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.WebPluginArrayWrapper
import onlyoffice.docspace.api.sdk.models.WebPluginRequests
import onlyoffice.docspace.api.sdk.models.WebPluginWrapper

interface WebpluginsApi {
    /**
     * POST api/2.0/settings/webplugins
     * Add a web plugin
     * Installs a web plugin into the current portal from an uploaded package, and switches the plugin on straight  away. The package is sent as `multipart/form-data` with exactly one file: a `.zip` archive holding a  `config.json` manifest and a `plugin.js` entry point, under the configured size cap of 5 MB by default.  Editing the portal settings is required, so a portal owner or administrator, and the installation has to have  web plugins and plugin uploading enabled in its configuration. Pass `system=true` to install the plugin for  every portal of the installation, which is accepted on standalone installations only. The call is mutating and  not idempotent: a package whose manifest name is already installed replaces the stored files and keeps the  settings saved for that name, and the domains the manifest declares are added to the portal Content Security  Policy. It returns the freshly installed plugin, enabled, with the `url` its script is served from. A portal  holds up to 100 plugins by default, the manifest name has to be lower-case letters, digits, `_`, `.` or `-`,  and the package is rejected when another installed plugin registers the same JavaScript object under a  different name. List what is installed with `GET api/2.0/settings/webplugins`.
     * Responses:
     *  - 200: The installed web plugin, enabled, with the `url` its script is served from
     *  - 400: The uploaded package is missing, of the wrong type, too large, or its manifest is rejected
     *  - 403: Web plugins or plugin uploads are switched off for the installation, or `system` was requested outside a standalone installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addWebPluginFromFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/
     *
     *
     * @param system Whether the plugin is installed for every portal of the installation rather than only this one. It is  accepted on a self-hosted installation alone and refused with 403 elsewhere; an installation-wide plugin also  hides a portal plugin that carries the same name. (optional)
     * @return [WebPluginWrapper]
     */
    @POST("api/2.0/settings/webplugins")
    suspend fun addWebPluginFromFile(@Query("system") system: kotlin.Boolean? = null): Response<WebPluginWrapper>

    /**
     * DELETE api/2.0/settings/webplugins/{name}
     * Delete a web plugin
     * Removes a web plugin from the current portal and deletes the files of its package from storage. The `name` is  the manifest name published by `GET api/2.0/settings/webplugins`, matched without regard to case. Editing the  portal settings is required, so a portal owner or administrator, and the installation has to have web plugins  and plugin deletion enabled in its configuration. An installation-wide plugin, the one whose `system` field is  true, can be removed on standalone installations only. The call is destructive and cannot be undone: the state  and the settings stored for the plugin are dropped along with its files, the domains its manifest declares are  taken out of the portal Content Security Policy, and the connected clients are notified. Getting the plugin  back means uploading its package again with `POST api/2.0/settings/webplugins`, and the settings it had are  gone. Nothing is returned on success, and a repeated call on a name that is no longer installed is rejected as  not found instead of answered as success. To keep a plugin installed but inactive, switch it off with  `PUT api/2.0/settings/webplugins/{name}` instead.
     * Responses:
     *  - 200: The web plugin and the files of its package are removed from the portal
     *  - 403: Web plugins or plugin deletion are switched off, the caller may not edit the portal settings, or the plugin is installation-wide outside a standalone installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/
     *
     *
     * @param name The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404.
     * @return [Unit]
     */
    @DELETE("api/2.0/settings/webplugins/{name}")
    suspend fun deleteWebPlugin(@Path("name") name: kotlin.String): Response<Unit>

    /**
     * GET api/2.0/settings/webplugins/{name}
     * Get a web plugin by name
     * Returns one web plugin of the current portal by its manifest name, looked up over the same set as  `GET api/2.0/settings/webplugins`: the installation-wide plugins plus the portal's own. The `name` is the  manifest name published in the `name` field of that list, matched without regard to case; it is neither the  localized display name nor the JavaScript object name in `pluginName`, so it cannot be taken from the title  shown in the interface. Any authenticated portal member may call it, no settings permission needed, and the  installation has to have web plugins enabled in its configuration. The call is read-only and idempotent. The  response carries the manifest data along with the state the portal stored for that plugin: `enabled`, the  `settings` string, `system`, and the `url` and `cssUrl` a client loads it from. A name that is not installed  is rejected as not found, and 403 means web plugins are switched off for the installation. Change the state of  the plugin with `PUT api/2.0/settings/webplugins/{name}`.
     * Responses:
     *  - 200: The requested web plugin with the state the portal stored for it
     *  - 403: Web plugins are switched off for the installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/
     *
     *
     * @param name The plugin to act on, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`; a name that is not installed answers 404.
     * @return [WebPluginWrapper]
     */
    @GET("api/2.0/settings/webplugins/{name}")
    suspend fun getWebPlugin(@Path("name") name: kotlin.String): Response<WebPluginWrapper>

    /**
     * GET api/2.0/settings/webplugins
     * Get web plugins
     * Lists the web plugins available in the current portal: the plugins installed for the whole installation first,  then the portal's own, with a portal plugin dropped when an installation-wide plugin already uses its name.  Any authenticated portal member may call it, no settings permission needed, and the installation has to have  web plugins enabled in its configuration. The call is read-only and idempotent. Pass `enabled=true` or  `enabled=false` to keep only the plugins in that state, and leave the parameter out to get every plugin. Each  entry carries the manifest data together with the state the portal stored for that plugin: `enabled`, the  `settings` string, `system` for an installation-wide plugin, and the `url` and `cssUrl` a client loads the  plugin from. An empty list means nothing is installed for this portal, not that plugins are switched off,  which is refused with 403 instead. The list is capped at the configured maximum, 100 plugins by default, and  is not paginated. For one plugin by its manifest name use `GET api/2.0/settings/webplugins/{name}`.
     * Responses:
     *  - 200: The web plugins available in the portal, the installation-wide ones first
     *  - 403: Web plugins are switched off for the installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWebPlugins Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/
     *
     *
     * @param enabled Which plugins are kept: `true` the ones switched on, `false` the ones switched off. Omitting it lists every  installed plugin whatever its state. (optional)
     * @return [WebPluginArrayWrapper]
     */
    @GET("api/2.0/settings/webplugins")
    suspend fun getWebPlugins(@Query("enabled") enabled: kotlin.Boolean? = null): Response<WebPluginArrayWrapper>

    /**
     * PUT api/2.0/settings/webplugins/{name}
     * Update a web plugin
     * Switches a web plugin of the current portal on or off and stores the settings string the portal keeps for it.  The plugin has to be installed already, so upload its package with `POST api/2.0/settings/webplugins` first,  and `name` is its manifest name as published by `GET api/2.0/settings/webplugins`, matched without regard to  case. Editing the portal settings is required, so a portal owner or administrator, and the installation has to  have web plugins enabled in its configuration. The body replaces the stored state instead of merging into it,  which makes the call idempotent; `settings` is required, so send `{}` when there is nothing to keep, and it is  limited to 255 characters and stored encrypted for this portal alone. Switching the plugin on adds the domains  its manifest declares to the portal Content Security Policy and switching it off takes them away again, and  the connected clients are notified of the new state. Nothing is returned on success. A name that is not  installed is rejected as not found, and 403 means web plugins are switched off or the caller may not edit the  portal settings.
     * Responses:
     *  - 200: The state and the settings of the web plugin are saved for the portal
     *  - 403: Web plugins are switched off for the installation, or the caller may not edit the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/
     *
     *
     * @param name The plugin to change, by the manifest name `GET api/2.0/settings/webplugins` publishes as `name`, matched  without regard to case. It is neither the localized display name nor the JavaScript object name in  `pluginName`, so it cannot be read off the interface; a name that is not installed answers 404.
     * @param webPluginRequests The whole state the plugin is to have afterwards. It replaces what was stored instead of merging into it, so  both the enabled flag and the settings have to be sent every time.
     * @return [Unit]
     */
    @PUT("api/2.0/settings/webplugins/{name}")
    suspend fun updateWebPlugin(@Path("name") name: kotlin.String, @Body webPluginRequests: WebPluginRequests): Response<Unit>

}
