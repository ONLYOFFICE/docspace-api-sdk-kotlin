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

import onlyoffice.docspace.api.sdk.models.TenantBannerSettingsDto
import onlyoffice.docspace.api.sdk.models.TenantBannerSettingsWrapper

interface BannersVisibilityApi {
    /**
     * POST api/2.0/settings/banner
     * Set the banners visibility
     * Sets the visibility settings of the promotional banners in the portal.
     * Responses:
     *  - 200: Promotional banners visibility settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
