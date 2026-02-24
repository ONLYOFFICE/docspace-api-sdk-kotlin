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


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.DoubleWrapper
import onlyoffice.docspace.api.sdk.models.TariffWrapper
import onlyoffice.docspace.api.sdk.models.TenantQuotaWrapper

interface QuotaApi {
    /**
     * GET api/2.0/portal/quota
     * Get a portal quota
     * Returns the current portal quota.
     * Responses:
     *  - 200: Current portal quota
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-quota/
     *
     *
     * @return [Call]<[TenantQuotaWrapper]>
     */
    @GET("api/2.0/portal/quota")
    fun getPortalQuota(): Call<TenantQuotaWrapper>

    /**
     * GET api/2.0/portal/tariff
     * Get a portal tariff
     * Returns the current portal tariff.
     * Responses:
     *  - 200: Current portal tariff
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalTariff Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-tariff/
     *
     *
     * @param refresh The value indicating whether the current portal tariff information should be refreshed. (optional)
     * @return [Call]<[TariffWrapper]>
     */
    @GET("api/2.0/portal/tariff")
    fun getPortalTariff(@Query("refresh") refresh: kotlin.Boolean? = null): Call<TariffWrapper>

    /**
     * GET api/2.0/portal/usedspace
     * Get the portal used space
     * Returns the used space of the current portal.
     * Responses:
     *  - 200: Used portal space
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalUsedSpace Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-used-space/
     *
     *
     * @return [Call]<[DoubleWrapper]>
     */
    @GET("api/2.0/portal/usedspace")
    fun getPortalUsedSpace(): Call<DoubleWrapper>

    /**
     * GET api/2.0/portal/quota/right
     * Get the recommended quota
     * Returns the recommended quota for the current portal.
     * Responses:
     *  - 200: Recommended portal quota
     *  - 401: Unauthorized
     *
     * REST API Reference for getRightQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-right-quota/
     *
     *
     * @return [Call]<[TenantQuotaWrapper]>
     */
    @GET("api/2.0/portal/quota/right")
    fun getRightQuota(): Call<TenantQuotaWrapper>

}
