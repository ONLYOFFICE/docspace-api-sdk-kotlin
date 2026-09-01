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
     * Returns the user quota settings.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Saves the AI Agent quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant AI Agent quota settings
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Saves the room quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant room quota settings
     *  - 402: Your pricing plan does not support this option
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Saves the tenant quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant quota settings
     *  - 402: Your pricing plan does not support this option
     *  - 405: Not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
