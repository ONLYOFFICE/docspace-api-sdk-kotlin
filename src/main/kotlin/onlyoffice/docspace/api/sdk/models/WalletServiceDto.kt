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
import onlyoffice.docspace.api.sdk.models.TenantEntityQuotaSettings
import onlyoffice.docspace.api.sdk.models.TenantQuotaFeatureDto
import onlyoffice.docspace.api.sdk.models.TenantQuotaSettings

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One service the portal can pay for out of its wallet: a quota sold per unit rather than per period.
 *
 * @param id The identifier of the quota, which is what the tariff reports as a quota `id` and what a purchase names.  A negative value belongs to a built-in quota rather than one on the price list.
 * @param price What the quota costs, in the currency resolved for the request. Its `value` is empty for a quota that is  not sold for money, which is what `free`, `trial` and `nonProfit` describe.
 * @param nonProfit Whether this is the non-profit quota, which is granted rather than bought. A portal on it cannot buy any  other plan, so a catalogue asked for plans returns this one alone.
 * @param free Whether this is the free quota a portal falls back to when nothing is paid for. It has no end date and  the tightest limits of any quota.
 * @param trial Whether this is the trial quota, which grants the paid limits for a while and then expires. A trial is not  extended by paying - a plan has to be bought instead.
 * @param features The features the quota switches on, each with the limit it grants and, on the quota the portal is  actually on, how much of that limit is already used. A feature that is absent is off, so the list is the  whole truth about what the quota includes.
 * @param title The quota name in the portal language, for printing rather than matching. It is empty when this build  ships no wording for the quota, which is normal for a quota that is not on the public price list.
 * @param usersQuota The per-member storage allowance an administrator has set on top of the quota, and whether it is applied  at all. It describes the live portal rather than this quota, so every entry of a catalogue listing repeats  the same values, and it is empty unless the portal is a server installation or its plan includes  statistics.
 * @param roomsQuota The same kind of per-room storage override, filled in and read the same way as `usersQuota`.
 * @param aiAgentsQuota The same kind of per-agent storage override for AI agents, filled in and read the same way as  `usersQuota`.
 * @param tenantCustomQuota The storage allowance an administrator has set for the portal as a whole, which caps it below what the  quota grants. Filled in under the same conditions as `usersQuota`.
 * @param dueDate When the quota runs out, in UTC. It is empty on a quota from the catalogue, which has no date until it is  bought, and on a quota that never expires.
 * @param innerServices The variants of this service that are folded into it, so a client renders one card per group instead of  one per variant. It is empty when the service has no variants, and always empty in the answer of  `GET api/2.0/portal/payment/walletservice`, which looks one service up on its own.
 * @param serviceName The stable key of the service, which is what the wallet operations take as their `service` argument and  what the usage reports key their entries by.
 */


data class WalletServiceDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "price")
    val price: PriceDto,

    @Json(name = "nonProfit")
    val nonProfit: kotlin.Boolean,

    @Json(name = "free")
    val free: kotlin.Boolean,

    @Json(name = "trial")
    val trial: kotlin.Boolean,

    @Json(name = "features")
    val features: kotlin.collections.List<TenantQuotaFeatureDto>,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "usersQuota")
    val usersQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "roomsQuota")
    val roomsQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "aiAgentsQuota")
    val aiAgentsQuota: TenantEntityQuotaSettings? = null,

    @Json(name = "tenantCustomQuota")
    val tenantCustomQuota: TenantQuotaSettings? = null,

    @Json(name = "dueDate")
    val dueDate: java.time.OffsetDateTime? = null,

    @Json(name = "innerServices")
    val innerServices: kotlin.collections.List<WalletServiceDto>? = null,

    @Json(name = "serviceName")
    val serviceName: kotlin.String? = null

) {


}

