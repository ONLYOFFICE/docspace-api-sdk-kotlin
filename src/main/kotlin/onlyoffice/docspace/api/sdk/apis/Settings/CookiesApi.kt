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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface CookiesApi {
    /**
     * GET api/2.0/settings/cookiesettings
     * Get the cookie lifetime settings
     * Returns how long an authentication session of this portal stays valid: `lifeTime` in minutes together with the  `enabled` flag that says whether that limit is applied at all. The caller needs the portal-settings right of a  DocSpace administrator - the portal owner and a DocSpace administrator qualify, any other member is refused -  and the call is read-only. The pair describes the whole portal rather than the calling user, and it is never  empty: a portal nobody has configured answers `lifeTime` 1440, one day, with `enabled` false. Read the two  fields together, because the number alone does not say how long a session lasts - while `enabled` is false the  stored number is ignored and an issued session is honoured for a year, and `lifeTime` 0 with `enabled` true  means a session that never expires on its own. On an installation whose configuration hides the cookie section  the built-in default pair comes back instead of the stored one. `GET api/2.0/settings` carries the same flag  as `cookieSettingsEnabled` without the number; change the pair with `PUT api/2.0/settings/cookiesettings`.
     * Responses:
     *  - 200: The authentication session lifetime of the portal in minutes together with the flag that says whether that limit is applied
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
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
     * Update the cookie lifetime settings
     * Stores how long an authentication session of this portal stays valid: `lifeTime` in minutes together with the  `enabled` flag that switches the limit on. The caller needs the portal-settings right of a DocSpace  administrator - the portal owner and a DocSpace administrator qualify, any other member is refused - and on an  installation whose configuration hides the cookie section nothing is stored and the call is answered with 402.  A `lifeTime` above 9999 minutes is not rejected but clamped to 9999, while 0 or less clears the number  instead, which with `enabled` true leaves sessions that never expire on their own. Any positive `lifeTime`  raises the session version of the portal: every session issued before the call stops being accepted, and with  `enabled` true the connections behind them are dropped as well. The caller is signed in again inside the same  call and gets a fresh session cookie in the response, so a client that keeps sending the token it held before  this call is the one locked out. The change is recorded in the audit trail. What comes back is a localized  confirmation message; read the stored pair with `GET api/2.0/settings/cookiesettings`.
     * Responses:
     *  - 200: A localized message confirming that the session lifetime has been saved
     *  - 402: The installation hides the cookie lifetime section, or the portal's payment has lapsed
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
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
