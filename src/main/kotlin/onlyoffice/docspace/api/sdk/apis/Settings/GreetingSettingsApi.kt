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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.GreetingSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface GreetingSettingsApi {
    /**
     * GET api/2.0/settings/greetingsettings
     * Get greeting settings
     * Returns the greeting title of the current portal - the caption shown as the welcome heading on the sign-in  page, kept as the portal name. Any authenticated user may call it and no administrative right is needed; the  call is read-only. The title comes back as a bare string and is never empty: when the portal has no title of  its own, the built-in default caption is returned instead, localized to the caller's language. Because of that  fallback this operation cannot tell a saved title from the default one - call  `GET api/2.0/settings/greetingsettings/isdefault` when that distinction matters. The same string is part of  the portal settings answer as the `greetingSettings` field of `GET api/2.0/settings`, so a client that already  reads the settings needs no separate call. The value is a caption only: it is neither the portal address nor  the white-label logo text of the header, which is returned by `GET api/2.0/settings/whitelabel/logotext`.
     * Responses:
     *  - 200: The greeting title of the portal, or the localized default caption when the portal has no title of its own
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGreetingSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-greeting-settings/
     *
     *
     * @return [StringWrapper]
     */
    @GET("api/2.0/settings/greetingsettings")
    suspend fun getGreetingSettings(): Response<StringWrapper>

    /**
     * GET api/2.0/settings/greetingsettings/isdefault
     * Check the default greeting settings
     * Reports whether the current portal still shows the built-in greeting caption instead of a title of its own.  The check is read-only and open to any authenticated user, with no administrative right required. It answers  `true` while no title is stored for the portal - the state after  `POST api/2.0/settings/greetingsettings/restore` on an installation that configures no portal name, and also  after saving an empty `title` - and `false` as soon as a non-empty title has been saved. Use it together with  `GET api/2.0/settings/greetingsettings`: that operation substitutes the localized default caption for a  missing title, so only these two calls together separate a default greeting from a custom one that happens to  repeat the default wording. The answer covers the greeting title alone; whether the white-label logos and logo  text are still the default ones is reported by `GET api/2.0/settings/whitelabel/logos/isdefault` and  `GET api/2.0/settings/whitelabel/logotext/isdefault`.
     * Responses:
     *  - 200: Boolean value: true if the portal has no greeting title of its own and the built-in default caption is shown
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Drops the custom greeting title of the current portal and puts back the title configured for the installation,  which is an empty value unless the installation defines a portal name of its own. The caller needs the  portal-settings right of a DocSpace administrator, otherwise the call is refused. The change is immediate for  every user of the portal and a second call changes nothing, so a retry after a failed attempt is safe. The  answer is the greeting in force afterwards: the configured title when there is one, and the localized default  caption when the stored title ends up empty - in that case `GET api/2.0/settings/greetingsettings/isdefault`  starts answering `true`. Only the caption is touched: the portal logos and the white-label logo text keep  their values and are reset separately by `PUT api/2.0/settings/whitelabel/logos/restore` and  `PUT api/2.0/settings/whitelabel/logotext/restore`. To set a title instead of the default one use  `POST api/2.0/settings/greetingsettings`.
     * Responses:
     *  - 200: The greeting title in force after the restore, or the localized default caption when the installation configures none
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Replaces the greeting title of the current portal with the `title` from the request, storing it as the portal  name. The caller needs the portal-settings right of a DocSpace administrator, otherwise the call is refused.  The new caption takes effect at once for every user of the portal and the change is written to the audit  trail; repeating the call with the same title leaves the portal in the same state. A missing `title` or one  longer than 255 characters is rejected as an invalid request before the handler runs. On a cloud portal with a  free or trial plan the title is also matched against the character rule configured for the installation and a  title that breaks it is refused, while a paid cloud plan and a server installation apply no character check.  An empty `title` clears the greeting: the portal falls back to the built-in default caption and  `GET api/2.0/settings/greetingsettings/isdefault` starts answering `true`. What comes back is a localized  confirmation message, not the stored title - read the title with `GET api/2.0/settings/greetingsettings`.
     * Responses:
     *  - 200: A localized message confirming that the greeting title has been saved
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
