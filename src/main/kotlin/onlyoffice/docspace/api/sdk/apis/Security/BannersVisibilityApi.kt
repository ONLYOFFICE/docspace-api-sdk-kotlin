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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.TenantBannerSettingsDto
import onlyoffice.docspace.api.sdk.models.TenantBannerSettingsWrapper

interface BannersVisibilityApi {
    /**
     * POST api/2.0/settings/banner
     * Set the banners visibility
     * Sets whether the portal's promotional banners are hidden for every user. Available only on an Enterprise  license; every other plan is refused regardless of the caller's role. Requires Owner or DocSpaceAdmin (the  EditPortalSettings permission). The flag only takes effect on a Standalone (self-hosted) installation; on  SaaS, banners are always shown no matter what is saved here. This is a mutating, idempotent, portal-wide call:  it applies to every user on the tenant immediately. It returns the saved setting; read the current value at  any time from `GET api/2.0/settings/banner`.
     * Responses:
     *  - 200: Saved promotional banners visibility setting
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setTenantBannerSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-banner-settings/
     *
     *
     * @param tenantBannerSettingsDto  (optional)
     * @return [TenantBannerSettingsWrapper]
     */
    @POST("api/2.0/settings/banner")
    suspend fun setTenantBannerSettings(@Body tenantBannerSettingsDto: TenantBannerSettingsDto? = null): Response<TenantBannerSettingsWrapper>

}
