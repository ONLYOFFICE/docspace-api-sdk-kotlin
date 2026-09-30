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
import onlyoffice.docspace.api.sdk.models.TenantDevToolsAccessSettingsWrapper

interface AccessToDevToolsApi {
    /**
     * GET api/2.0/settings/devtoolsaccess
     * Get the Developer Tools access settings
     * Returns whether the portal currently restricts the `User` role from using the developer tools (API keys, OAuth  apps, webhooks). Requires an authenticated session; every role can read the restriction, even though it only  limits what a `User` may do, not what a `RoomAdmin` or `DocSpaceAdmin` may do. This is a read-only, idempotent  call. Change the restriction with `POST api/2.0/security/devtoolsaccess`, which requires the  EditPortalSettings permission.
     * Responses:
     *  - 200: Whether the `User` role is currently restricted from using the developer tools
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantAccessDevToolsSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-access-dev-tools-settings/
     *
     *
     * @return [TenantDevToolsAccessSettingsWrapper]
     */
    @GET("api/2.0/settings/devtoolsaccess")
    suspend fun getTenantAccessDevToolsSettings(): Response<TenantDevToolsAccessSettingsWrapper>

}
