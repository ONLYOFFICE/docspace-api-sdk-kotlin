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

import onlyoffice.docspace.api.sdk.models.CookieSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.CookieSettingsWrapper
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface CookiesApi {
    /**
     * GET api/2.0/settings/cookiesettings
     * Get cookies lifetime
     * Returns the cookies lifetime value in minutes.
     * Responses:
     *  - 200: Lifetime value in minutes
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCookieSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-cookie-settings/
     *
     *
     * @return [CookieSettingsWrapper]
     */
    @GET("api/2.0/settings/cookiesettings")
    suspend fun getCookieSettings(): Response<CookieSettingsWrapper>

    /**
     * PUT api/2.0/settings/cookiesettings
     * Update cookies lifetime
     * Updates the cookies lifetime value in minutes.
     * Responses:
     *  - 200: Message about the result of saving new settings
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateCookieSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-cookie-settings/
     *
     *
     * @param cookieSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/cookiesettings")
    suspend fun updateCookieSettings(@Body cookieSettingsRequestsDto: CookieSettingsRequestsDto? = null): Response<StringWrapper>

}
