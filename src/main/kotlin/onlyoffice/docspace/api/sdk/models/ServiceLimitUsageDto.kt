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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * What has been spent against a spending limit in its current period, and what is left.
 *
 * @param periodStart The start of the current period, in UTC.
 * @param periodEnd The end of the current period, in UTC: the moment the spending starts again from zero. Null for a lifetime  limit, which never resets.
 * @param amountConsumed The money charged in the current period, in the currency of the limit.
 * @param amountAvailable The money still available in the current period: the threshold less what was charged and what is reserved for  operations in progress, never below zero. Null when the limit has no money threshold.
 * @param quantityConsumed The quantity consumed in the current period, in the unit of the limit.
 * @param quantityAvailable The quantity still available in the current period, never below zero; null when the limit has no quantity  threshold.
 */


data class ServiceLimitUsageDto (

    @Json(name = "periodStart")
    val periodStart: java.time.OffsetDateTime? = null,

    @Json(name = "periodEnd")
    val periodEnd: java.time.OffsetDateTime? = null,

    @Json(name = "amountConsumed")
    val amountConsumed: kotlin.Double? = null,

    @Json(name = "amountAvailable")
    val amountAvailable: kotlin.Double? = null,

    @Json(name = "quantityConsumed")
    val quantityConsumed: kotlin.Int? = null,

    @Json(name = "quantityAvailable")
    val quantityAvailable: kotlin.Int? = null

) {


}

