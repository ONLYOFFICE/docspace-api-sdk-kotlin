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

import onlyoffice.docspace.api.sdk.models.ServiceLimitPeriod
import onlyoffice.docspace.api.sdk.models.ServiceLimitScope
import onlyoffice.docspace.api.sdk.models.ServiceLimitUsageDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A spending limit on the AI services: for the portal as a whole, for every user, or for one user.
 *
 * @param id The service limit ID, used to read, change, switch off or delete the limit. In the list of the users the same  ID repeats for every user the limit for every user applies to.
 * @param serviceGroupName The limited service group; the AI services are `ai-services`.
 * @param customerAccountNumber The number of the billing account of the portal the limit belongs to.
 * @param scope Whom the limit applies to.
 * @param userId The ID of the portal user the limit applies to: the user of a personal limit, or, in the list of the users, the  user a limit for every user applies to. Null for a limit of the portal as a whole, and for a limit for every  user read on its own.
 * @param amountValue The most money the AI services may cost per period, in `currency`; null when the limit has no money threshold.
 * @param currency The currency `amountValue` is expressed in; null when the limit has no money threshold.
 * @param quantityValue The largest quantity the AI services may consume per period, in `serviceUnit`; null when the limit has no  quantity threshold.
 * @param serviceUnit The unit `quantityValue` is expressed in; null when the limit has no quantity threshold.
 * @param period The window the thresholds apply to. A day, week or month resets at the start of the next one in UTC (a week on  Monday), not a fixed time after the first charge; a lifetime limit never resets.
 * @param periodEnd The last moment of the current period, in UTC, after which the spending starts over from zero; null for a  lifetime limit, which never resets. Filled for every limit, the limit for every user included, whose spending is  counted per user.
 * @param usageFrom The moment a lifetime limit counts from, in UTC; null for the other periods.
 * @param enabled Whether the limit is in force. A switched-off limit no longer restricts the AI services and can be switched  back on.
 * @param created The date and time when the limit was created, in UTC.
 * @param modified The date and time when the limit was last changed, in UTC.
 * @param usage What was spent against the limit in its current period and what is left. Filled for the limit of the portal as  a whole and in the list of the users; null where the spending is not read, such as for a limit read by its ID  or the limit for every user, whose spending is counted per user.
 */


data class ServiceLimitDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "serviceGroupName")
    val serviceGroupName: kotlin.String? = null,

    @Json(name = "customerAccountNumber")
    val customerAccountNumber: kotlin.Int? = null,

    @Json(name = "scope")
    val scope: ServiceLimitScope? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "amountValue")
    val amountValue: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "quantityValue")
    val quantityValue: kotlin.Int? = null,

    @Json(name = "serviceUnit")
    val serviceUnit: kotlin.String? = null,

    @Json(name = "period")
    val period: ServiceLimitPeriod? = null,

    @Json(name = "periodEnd")
    val periodEnd: java.time.OffsetDateTime? = null,

    @Json(name = "usageFrom")
    val usageFrom: java.time.OffsetDateTime? = null,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "modified")
    val modified: java.time.OffsetDateTime? = null,

    @Json(name = "usage")
    val usage: ServiceLimitUsageDto? = null

) {


}

