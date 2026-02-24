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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.LoginSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.LoginSettingsWrapper

interface LoginSettingsApi {
    /**
     * GET api/2.0/settings/security/loginsettings
     * Get the login settings
     * Returns the portal login settings.
     * Responses:
     *  - 200: Login settings
     *  - 401: Unauthorized
     *
     * REST API Reference for getLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-settings/
     *
     *
     * @return [Call]<[LoginSettingsWrapper]>
     */
    @GET("api/2.0/settings/security/loginsettings")
    fun getLoginSettings(): Call<LoginSettingsWrapper>

    /**
     * DELETE api/2.0/settings/security/loginsettings
     * Reset the login settings
     * Resets the portal login settings to default.
     * Responses:
     *  - 200: Login settings
     *  - 401: Unauthorized
     *
     * REST API Reference for setDefaultLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-login-settings/
     *
     *
     * @return [Call]<[LoginSettingsWrapper]>
     */
    @DELETE("api/2.0/settings/security/loginsettings")
    fun setDefaultLoginSettings(): Call<LoginSettingsWrapper>

    /**
     * PUT api/2.0/settings/security/loginsettings
     * Update the login settings
     * Updates the login settings with the parameters specified in the request.
     * Responses:
     *  - 200: Updated login settings
     *  - 401: Unauthorized
     *
     * REST API Reference for updateLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-login-settings/
     *
     *
     * @param loginSettingsRequestDto  (optional)
     * @return [Call]<[LoginSettingsWrapper]>
     */
    @PUT("api/2.0/settings/security/loginsettings")
    fun updateLoginSettings(@Body loginSettingsRequestDto: LoginSettingsRequestDto? = null): Call<LoginSettingsWrapper>

}
