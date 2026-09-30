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
import onlyoffice.docspace.api.sdk.models.QuotaSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.TenantAiAgentQuotaSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantQuotaSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.TenantQuotaSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantRoomQuotaSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantUserQuotaSettingsWrapper

interface QuotaApi {
    /**
     * GET api/2.0/settings/userquotasettings
     * Get the user quota settings
     * Returns the portal's per-user default storage quota: whether it is enabled and, if so, its size in bytes.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other authenticated role, and an  anonymous caller, is refused. This is a read-only, idempotent call. When `enableQuota` is false, the size  value is not enforced and users get unlimited personal storage regardless of what it holds. The response  supports conditional requests: send the standard If-Modified-Since header with the previous `lastModified`  value, and an unchanged response comes back empty instead of resending the settings.
     * Responses:
     *  - 200: Current per-user default storage quota settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-quota-settings/
     *
     *
     * @return [TenantUserQuotaSettingsWrapper]
     */
    @GET("api/2.0/settings/userquotasettings")
    suspend fun getUserQuotaSettings(): Response<TenantUserQuotaSettingsWrapper>

    /**
     * POST api/2.0/settings/aiagentquotasettings
     * Save the AI Agent quota settings
     * Sets the portal's default storage quota for AI agents, applied as the starting limit for newly created agents.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission), and on a paid SaaS tenant the portal's  plan must include the statistics feature, or the call is rejected as not covered by the plan. The requested  size cannot exceed the portal's own total storage quota, nor, on a Standalone install with a portal-wide quota  enabled, that quota's size. Disable enforcement by passing `enableQuota=false`; the size is then ignored for  new agents. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved settings, not any agent's current usage.
     * Responses:
     *  - 200: Saved default AI agent storage quota settings
     *  - 402: The portal's pricing plan does not include the statistics feature required for AI agent quotas
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveAiAgentQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ai-agent-quota-settings/
     *
     *
     * @param quotaSettingsRequestsDto  (optional)
     * @return [TenantAiAgentQuotaSettingsWrapper]
     */
    @POST("api/2.0/settings/aiagentquotasettings")
    suspend fun saveAiAgentQuotaSettings(@Body quotaSettingsRequestsDto: QuotaSettingsRequestsDto? = null): Response<TenantAiAgentQuotaSettingsWrapper>

    /**
     * POST api/2.0/settings/roomquotasettings
     * Save the room quota settings
     * Sets the portal's default per-room storage quota, applied to newly created rooms as their starting limit.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission), and on a paid SaaS tenant the portal's  plan must include the statistics feature, or the call is rejected as not covered by the plan. The requested  size cannot exceed the portal's own total storage quota, nor, on a Standalone install with a portal-wide quota  enabled, that quota's size. Disable enforcement by passing `enableQuota=false`; the size is then ignored for  new rooms. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved settings, not the individual rooms' current usage.
     * Responses:
     *  - 200: Saved default per-room storage quota settings
     *  - 402: The portal's pricing plan does not include the statistics feature required for room quotas
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for saveRoomQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-room-quota-settings/
     *
     *
     * @param quotaSettingsRequestsDto  (optional)
     * @return [TenantRoomQuotaSettingsWrapper]
     */
    @POST("api/2.0/settings/roomquotasettings")
    suspend fun saveRoomQuotaSettings(@Body quotaSettingsRequestsDto: QuotaSettingsRequestsDto? = null): Response<TenantRoomQuotaSettingsWrapper>

    /**
     * PUT api/2.0/settings/tenantquotasettings
     * Save the tenant quota settings
     * Sets or removes the storage quota for a given tenant. Available only on a Standalone (self-hosted)  installation; on SaaS the call is always refused. Requires a DocSpace administrator, and the portal's plan  must include the statistics feature or the call is rejected as not covered by the plan. Pass a non-negative  `quota` in bytes to enable the limit for the tenant identified by `tenantId`, or a negative value to remove  any limit. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved quota settings for that tenant, not its current usage.
     * Responses:
     *  - 200: Saved tenant storage quota settings
     *  - 402: The portal's pricing plan does not include the statistics feature required for tenant quotas
     *  - 405: The caller is not a DocSpace administrator, or the portal is not a Standalone installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setTenantQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-quota-settings/
     *
     *
     * @param tenantQuotaSettingsRequestsDto  (optional)
     * @return [TenantQuotaSettingsWrapper]
     */
    @PUT("api/2.0/settings/tenantquotasettings")
    suspend fun setTenantQuotaSettings(@Body tenantQuotaSettingsRequestsDto: TenantQuotaSettingsRequestsDto? = null): Response<TenantQuotaSettingsWrapper>

}
