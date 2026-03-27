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

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.GreetingSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface GreetingSettingsApi {
    /**
     * GET api/2.0/settings/greetingsettings
     * Get greeting settings
     * Returns the greeting settings for the current portal.
     * Responses:
     *  - 200: Greeting settings: tenant name
     *  - 401: Unauthorized
     *
     * REST API Reference for getGreetingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-greeting-settings/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/settings/greetingsettings")
    suspend fun getGreetingSettings(): Response<ObjectWrapper>

    /**
     * GET api/2.0/settings/greetingsettings/isdefault
     * Check the default greeting settings
     * Checks if the greeting settings of the current portal are set to default or not.
     * Responses:
     *  - 200: Boolean value: true if the greeting settings of the current portal are set to default
     *  - 401: Unauthorized
     *
     * REST API Reference for getIsDefaultGreetingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-greeting-settings/
     *
     *
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/settings/greetingsettings/isdefault")
    suspend fun getIsDefaultGreetingSettings(): Response<BooleanWrapper>

    /**
     * POST api/2.0/settings/greetingsettings/restore
     * Restore the greeting settings
     * Restores the current portal greeting settings.
     * Responses:
     *  - 200: Greeting settings: tenant name
     *  - 401: Unauthorized
     *
     * REST API Reference for restoreGreetingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-greeting-settings/
     *
     *
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/greetingsettings/restore")
    suspend fun restoreGreetingSettings(): Response<StringWrapper>

    /**
     * POST api/2.0/settings/greetingsettings
     * Save the greeting settings
     * Saves the greeting settings specified in the request to the current portal.
     * Responses:
     *  - 200: Message about saving greeting settings successfully
     *  - 401: Unauthorized
     *
     * REST API Reference for saveGreetingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-greeting-settings/
     *
     *
     * @param greetingSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/greetingsettings")
    suspend fun saveGreetingSettings(@Body greetingSettingsRequestsDto: GreetingSettingsRequestsDto? = null): Response<StringWrapper>

}
