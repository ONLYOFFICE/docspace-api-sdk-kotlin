 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
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
     *
     * REST API Reference for getUserQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-quota-settings/
     *
     *
     * @return [Call]<[TenantUserQuotaSettingsWrapper]>
     */
    @GET("api/2.0/settings/userquotasettings")
    fun getUserQuotaSettings(): Call<TenantUserQuotaSettingsWrapper>

    /**
     * POST api/2.0/settings/aiagentquotasettings
     * Save the AI Agent quota settings
     * Saves the AI Agent quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant AI Agent quota settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for saveAiAgentQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ai-agent-quota-settings/
     *
     *
     * @param quotaSettingsRequestsDto  (optional)
     * @return [Call]<[TenantAiAgentQuotaSettingsWrapper]>
     */
    @POST("api/2.0/settings/aiagentquotasettings")
    fun saveAiAgentQuotaSettings(@Body quotaSettingsRequestsDto: QuotaSettingsRequestsDto? = null): Call<TenantAiAgentQuotaSettingsWrapper>

    /**
     * POST api/2.0/settings/roomquotasettings
     * Save the room quota settings
     * Saves the room quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant room quota settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for saveRoomQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-room-quota-settings/
     *
     *
     * @param quotaSettingsRequestsDto  (optional)
     * @return [Call]<[TenantRoomQuotaSettingsWrapper]>
     */
    @POST("api/2.0/settings/roomquotasettings")
    fun saveRoomQuotaSettings(@Body quotaSettingsRequestsDto: QuotaSettingsRequestsDto? = null): Call<TenantRoomQuotaSettingsWrapper>

    /**
     * PUT api/2.0/settings/tenantquotasettings
     * Save the tenant quota settings
     * Saves the tenant quota settings specified in the request to the current portal.
     * Responses:
     *  - 200: Tenant quota settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *  - 405: Not available
     *
     * REST API Reference for setTenantQuotaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-quota-settings/
     *
     *
     * @param tenantQuotaSettingsRequestsDto  (optional)
     * @return [Call]<[TenantQuotaSettingsWrapper]>
     */
    @PUT("api/2.0/settings/tenantquotasettings")
    fun setTenantQuotaSettings(@Body tenantQuotaSettingsRequestsDto: TenantQuotaSettingsRequestsDto? = null): Call<TenantQuotaSettingsWrapper>

}
