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
     * Changes the current portal theme.
     * Responses:
     *  - 200: Theme
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
     * Returns a theme which is set to the current portal.
     * Responses:
     *  - 200: Theme
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
