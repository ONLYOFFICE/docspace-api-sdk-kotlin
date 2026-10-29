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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The personal spending limit on the AI services to set for each of several portal users.
 *
 * @param userIds The IDs of the portal users the limit is set for, as returned in `id` by the people operations.
 * @param amountValue The most money the AI services may cost each user per period, in their currency, which cannot be chosen. Zero  blocks the AI services completely.
 * @param quantityValue The largest quantity the AI services may consume per period for each user, in their common unit. Zero blocks the  AI services completely.
 * @param period The window the thresholds apply to, in UTC. A day, week or month is calendar-aligned rather than rolling - a  daily limit resets at midnight UTC, a weekly one on Monday - while a lifetime limit counts from its creation and  never resets.
 */


data class SetParticipantServiceLimitsRequestDto (

    @Json(name = "userIds")
    val userIds: kotlin.collections.List<java.util.UUID>,

    @Json(name = "amountValue")
    val amountValue: kotlin.Double? = null,

    @Json(name = "quantityValue")
    val quantityValue: kotlin.Int? = null,

    @Json(name = "period")
    val period: ServiceLimitPeriod? = null

) {


}

