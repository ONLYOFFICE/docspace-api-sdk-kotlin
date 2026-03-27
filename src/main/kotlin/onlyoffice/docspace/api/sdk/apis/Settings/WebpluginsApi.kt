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

import onlyoffice.docspace.api.sdk.models.WebPluginArrayWrapper
import onlyoffice.docspace.api.sdk.models.WebPluginRequests
import onlyoffice.docspace.api.sdk.models.WebPluginWrapper

interface WebpluginsApi {
    /**
     * POST api/2.0/settings/webplugins
     * Add a web plugin
     * Adds a web plugin from a file to the current portal.
     * Responses:
     *  - 200: Web plugin
     *  - 400: bad request
     *  - 403: Plugins disabled
     *  - 401: Unauthorized
     *
     * REST API Reference for addWebPluginFromFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/
     *
     *
     * @param system Specifies whether to load the system plugins or not. (optional)
     * @return [WebPluginWrapper]
     */
    @POST("api/2.0/settings/webplugins")
    suspend fun addWebPluginFromFile(@Query("system") system: kotlin.Boolean? = null): Response<WebPluginWrapper>

    /**
     * DELETE api/2.0/settings/webplugins/{name}
     * Delete a web plugin
     * Deletes a web plugin by the name specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 403: Plugins disabled
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @return [Unit]
     */
    @DELETE("api/2.0/settings/webplugins/{name}")
    suspend fun deleteWebPlugin(@Path("name") name: kotlin.String): Response<Unit>

    /**
     * GET api/2.0/settings/webplugins/{name}
     * Get a web plugin by name
     * Returns a web plugin by the name specified in the request.
     * Responses:
     *  - 200: Web plugin
     *  - 403: Plugins disabled
     *  - 401: Unauthorized
     *
     * REST API Reference for getWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @return [WebPluginWrapper]
     */
    @GET("api/2.0/settings/webplugins/{name}")
    suspend fun getWebPlugin(@Path("name") name: kotlin.String): Response<WebPluginWrapper>

    /**
     * GET api/2.0/settings/webplugins
     * Get web plugins
     * Returns the portal web plugins.
     * Responses:
     *  - 200: Web plugin
     *  - 403: Plugins disabled
     *  - 401: Unauthorized
     *
     * REST API Reference for getWebPlugins Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/
     *
     *
     * @param enabled The optional filter for the plugin enabled state. (optional)
     * @return [WebPluginArrayWrapper]
     */
    @GET("api/2.0/settings/webplugins")
    suspend fun getWebPlugins(@Query("enabled") enabled: kotlin.Boolean? = null): Response<WebPluginArrayWrapper>

    /**
     * PUT api/2.0/settings/webplugins/{name}
     * Update a web plugin
     * Updates a web plugin with the parameters specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 403: Plugins disabled
     *  - 401: Unauthorized
     *
     * REST API Reference for updateWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @param webPluginRequests The configuration settings for the web plugin instance.
     * @return [Unit]
     */
    @PUT("api/2.0/settings/webplugins/{name}")
    suspend fun updateWebPlugin(@Path("name") name: kotlin.String, @Body webPluginRequests: WebPluginRequests): Response<Unit>

}
