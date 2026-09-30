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


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.DarkThemeSettingsRequestDto
import onlyoffice.docspace.api.sdk.models.DarkThemeSettingsWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse

interface ThemeApi {
    /**
     * PUT api/2.0/people/theme
     * Change the portal theme
     * Sets the interface theme of the calling account to `Base` for the light theme, `Dark` for the dark one, or  `System` to follow whatever the operating system asks for.  The setting belongs to the account and not to the portal, despite the name of the route, so it changes  nothing for anybody else and cannot be set on another account.  It needs no permission, takes effect at once and is idempotent - sending the theme that is already in use  changes nothing.  The answer echoes the theme that was stored, which is the value the request asked for.  The same value is reported as `theme` by `GET api/2.0/people/@self`.
     * Responses:
     *  - 200: The interface theme that was stored
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changePortalTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-portal-theme/
     *
     *
     * @param darkThemeSettingsRequestDto  (optional)
     * @return [DarkThemeSettingsWrapper]
     */
    @PUT("api/2.0/people/theme")
    suspend fun changePortalTheme(@Body darkThemeSettingsRequestDto: DarkThemeSettingsRequestDto? = null): Response<DarkThemeSettingsWrapper>

    /**
     * GET api/2.0/people/theme
     * Get the portal theme
     * Returns the interface theme the calling account has chosen: `Base` for the light theme, `Dark` for the dark  one, or `System` to follow whatever the operating system asks for.  The setting belongs to the account and not to the portal, despite the name of the route, so it describes the  caller alone and cannot be read for anybody else.  It needs no permission and is read-only.  A caller that has never chosen a theme gets the portal default rather than an empty answer.  The same value is also reported as `theme` by `GET api/2.0/people/@self`, so a client that reads the profile  on start-up does not need this operation as well.
     * Responses:
     *  - 200: The interface theme of the calling account
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalTheme Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-theme/
     *
     *
     * @return [DarkThemeSettingsWrapper]
     */
    @GET("api/2.0/people/theme")
    suspend fun getPortalTheme(): Response<DarkThemeSettingsWrapper>

}
