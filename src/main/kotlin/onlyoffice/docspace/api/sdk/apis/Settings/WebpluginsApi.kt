 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
     *  - 401: Unauthorized
     *  - 403: Plugins disabled
     *
     * REST API Reference for addWebPluginFromFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-web-plugin-from-file/
     *
     *
     * @param system Specifies whether to load the system plugins or not. (optional)
     * @return [Call]<[WebPluginWrapper]>
     */
    @POST("api/2.0/settings/webplugins")
    fun addWebPluginFromFile(@Query("system") system: kotlin.Boolean? = null): Call<WebPluginWrapper>

    /**
     * DELETE api/2.0/settings/webplugins/{name}
     * Delete a web plugin
     * Deletes a web plugin by the name specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 403: Plugins disabled
     *
     * REST API Reference for deleteWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @return [Call]<[Unit]>
     */
    @DELETE("api/2.0/settings/webplugins/{name}")
    fun deleteWebPlugin(@Path("name") name: kotlin.String): Call<Unit>

    /**
     * GET api/2.0/settings/webplugins/{name}
     * Get a web plugin by name
     * Returns a web plugin by the name specified in the request.
     * Responses:
     *  - 200: Web plugin
     *  - 401: Unauthorized
     *  - 403: Plugins disabled
     *
     * REST API Reference for getWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @return [Call]<[WebPluginWrapper]>
     */
    @GET("api/2.0/settings/webplugins/{name}")
    fun getWebPlugin(@Path("name") name: kotlin.String): Call<WebPluginWrapper>

    /**
     * GET api/2.0/settings/webplugins
     * Get web plugins
     * Returns the portal web plugins.
     * Responses:
     *  - 200: Web plugin
     *  - 401: Unauthorized
     *  - 403: Plugins disabled
     *
     * REST API Reference for getWebPlugins Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-plugins/
     *
     *
     * @param enabled The optional filter for the plugin enabled state. (optional)
     * @return [Call]<[WebPluginArrayWrapper]>
     */
    @GET("api/2.0/settings/webplugins")
    fun getWebPlugins(@Query("enabled") enabled: kotlin.Boolean? = null): Call<WebPluginArrayWrapper>

    /**
     * PUT api/2.0/settings/webplugins/{name}
     * Update a web plugin
     * Updates a web plugin with the parameters specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 403: Plugins disabled
     *
     * REST API Reference for updateWebPlugin Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-web-plugin/
     *
     *
     * @param name The web plugin name.
     * @param webPluginRequests The configuration settings for the web plugin instance.
     * @return [Call]<[Unit]>
     */
    @PUT("api/2.0/settings/webplugins/{name}")
    fun updateWebPlugin(@Path("name") name: kotlin.String, @Body webPluginRequests: WebPluginRequests): Call<Unit>

}
