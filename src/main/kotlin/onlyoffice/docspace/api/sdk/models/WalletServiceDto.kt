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

package onlyoffice.docspace.api.sdk.models

import onlyoffice.docspace.api.sdk.models.PriceDto
import onlyoffice.docspace.api.sdk.models.QuotaDto
import onlyoffice.docspace.api.sdk.models.TenantEntityQuotaSettings
import onlyoffice.docspace.api.sdk.models.TenantQuotaFeatureDto
import onlyoffice.docspace.api.sdk.models.TenantQuotaSettings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The wallet service information.
 *
 * @param id The quota ID.
 * @param title The quota title.
 * @param price 
 * @param nonProfit Specifies if the quota is nonprofit or not.
 * @param free Specifies if the quota is free or not.
 * @param trial Specifies if the quota is trial or not.
 * @param features The list of tenant quota features.
 * @param usersQuota 
 * @param roomsQuota 
 * @param aiAgentsQuota 
 * @param tenantCustomQuota 
 * @param dueDate The due date.
 * @param innerServices The list of inner services.
 */


data class WalletServiceDto (

    /* The quota ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* The quota title. */
    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "price")
    val price: PriceDto,

    /* Specifies if the quota is nonprofit or not. */
    @Json(name = "nonProfit")
    val nonProfit: kotlin.Boolean,

    /* Specifies if the quota is free or not. */
    @Json(name = "free")
    val free: kotlin.Boolean,

    /* Specifies if the quota is trial or not. */
    @Json(name = "trial")
    val trial: kotlin.Boolean,

    /* The list of tenant quota features. */
    @Json(name = "features")
    val features: kotlin.collections.List<TenantQuotaFeatureDto>?,

    @Json(name = "usersQuota")
    val usersQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "roomsQuota")
    val roomsQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "aiAgentsQuota")
    val aiAgentsQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "tenantCustomQuota")
    val tenantCustomQuota: TenantQuotaSettings? = null,

    /* The due date. */
    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The list of inner services. */
    @Json(name = "innerServices")
    val innerServices: kotlin.collections.List<QuotaDto>? = null

) {


}

