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
import onlyoffice.docspace.api.sdk.models.TenantBannerSettingsWrapper

interface BannersVisibilityApi {
    /**
     * GET api/2.0/settings/banner
     * Get the banners visibility
     * Returns whether the portal's promotional banners are currently hidden from every user's interface. Requires an  authenticated session; every role can read it, since the flag affects what they see regardless of their own  permissions. This is a read-only, idempotent call. The flag only takes effect on a Standalone (self-hosted)  installation; on SaaS, banners are always shown no matter what is saved here. Change the setting with  `POST api/2.0/settings/banner`, which additionally requires an Enterprise license.
     * Responses:
     *  - 200: Whether the portal's promotional banners are currently hidden
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantBannerSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-banner-settings/
     *
     *
     * @return [TenantBannerSettingsWrapper]
     */
    @GET("api/2.0/settings/banner")
    suspend fun getTenantBannerSettings(): Response<TenantBannerSettingsWrapper>

}
