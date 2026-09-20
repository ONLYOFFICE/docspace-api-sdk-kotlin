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
import onlyoffice.docspace.api.sdk.models.LoginSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.LoginSettingsWrapper

interface LoginSettingsApi {
    /**
     * GET api/2.0/settings/security/loginsettings
     * Get login settings
     * Returns the brute-force protection of the sign-in form for the current portal: how many failed attempts are  tolerated, how long the window they are counted in lasts, and how long an offender stays blocked. The caller  needs the portal-settings right of a DocSpace administrator; members without it are refused, and anonymous  callers are not admitted. The operation is read-only and honours `If-Modified-Since`: send back the  `Last-Modified` value of an earlier answer and unchanged settings come back as an empty not-modified response  rather than a body. `checkPeriod` and `blockTime` are counted in seconds. A portal nobody has configured  tolerates 5 failed attempts inside a window of 60 seconds and blocks for 60 seconds, and reports `isDefault`  true; the flag turns false as soon as any of the three values differs from that. The answer describes the  portal-wide policy only: it does not say which accounts or addresses are blocked at the moment, while a  lockout that has already happened is recorded in the login history and can be read with  `GET api/2.0/security/audit/login/filter`. Change the numbers with  `PUT api/2.0/settings/security/loginsettings`, or put them back with  `DELETE api/2.0/settings/security/loginsettings`.
     * Responses:
     *  - 200: The brute-force protection settings of the portal: the tolerated attempts, the counting window and the block in seconds, and whether they match the shipped defaults
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-settings/
     *
     *
     * @return [LoginSettingsWrapper]
     */
    @GET("api/2.0/settings/security/loginsettings")
    suspend fun getLoginSettings(): Response<LoginSettingsWrapper>

    /**
     * DELETE api/2.0/settings/security/loginsettings
     * Reset login settings
     * Puts the brute-force protection of the sign-in form back to what the portal shipped with: 5 tolerated failed  attempts, a counting window of 60 seconds and a block of 60 seconds. The caller needs the portal-settings  right of a DocSpace administrator, otherwise the call is refused. The operation takes no parameters and  overwrites whatever was configured before without asking, so read the current numbers with  `GET api/2.0/settings/security/loginsettings` first if they are worth keeping. Only the setting is reset:  sign-ins already blocked stay blocked until the block they were given runs out, and the attempt counters  running for other users are left alone. The reset is portal-wide, applies to attempts made from now on, is  recorded in the audit trail, and calling it twice changes nothing further. The restored numbers also decide  when the sign-in form starts asking for a captcha, which it does one attempt before the block. The answer is  the restored settings, with `isDefault` true. Store numbers of your own with  `PUT api/2.0/settings/security/loginsettings`.
     * Responses:
     *  - 200: The brute-force protection settings restored to the shipped defaults
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setDefaultLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-login-settings/
     *
     *
     * @return [LoginSettingsWrapper]
     */
    @DELETE("api/2.0/settings/security/loginsettings")
    suspend fun setDefaultLoginSettings(): Response<LoginSettingsWrapper>

    /**
     * PUT api/2.0/settings/security/loginsettings
     * Update login settings
     * Replaces the brute-force protection of the sign-in form for the whole portal: `attemptCount` failed attempts  inside a rolling window of `checkPeriod` seconds, after which the offender is blocked for `blockTime` seconds.  All three values are replaced together and each has to be between 1 and 9999, so read the current ones with  `GET api/2.0/settings/security/loginsettings` before changing only one of them; a value outside the range is  rejected as an invalid request. The caller needs the portal-settings right of a DocSpace administrator,  otherwise the call is refused. Failed attempts are counted per user name and client address, so one member's  lockout leaves the rest of the portal signing in normally, and a blocked pair is refused even once the  password is finally correct. The new numbers apply to attempts made from now on and leave counters and blocks  already running as they are. The change is recorded in the audit trail, and the answer is the stored settings  with the flag that says whether they still match the shipped defaults.
     * Responses:
     *  - 200: The brute-force protection settings as they were stored, with the flag that says whether they match the shipped defaults
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateLoginSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-login-settings/
     *
     *
     * @param loginSettingsRequestDto  (optional)
     * @return [LoginSettingsWrapper]
     */
    @PUT("api/2.0/settings/security/loginsettings")
    suspend fun updateLoginSettings(@Body loginSettingsRequestDto: LoginSettingsRequestDto? = null): Response<LoginSettingsWrapper>

}
