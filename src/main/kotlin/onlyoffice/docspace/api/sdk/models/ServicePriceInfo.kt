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

import onlyoffice.docspace.api.sdk.models.DiscountCategory
import onlyoffice.docspace.api.sdk.models.PriceStatus
import onlyoffice.docspace.api.sdk.models.PriceTimeUnit
import onlyoffice.docspace.api.sdk.models.TimeBound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a price of the service.
 *
 * @param id The price unique identifier.
 * @param accountNumber The account number.
 * @param serviceId The service ID.
 * @param timeUnit The time unit the price is bound to.
 * @param costPrice The cost price.
 * @param extraCharge The extra charge added to the cost price.
 * @param servicePrice The resulting service price.
 * @param quota The quota the price is set for.
 * @param timeBound The period the price is effective in.
 * @param status The price status.
 * @param created The date and time when the price was created.
 * @param discountCategoryId The discount category ID.
 * @param discountCategory The discount category.
 */


data class ServicePriceInfo (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "accountNumber")
    val accountNumber: kotlin.Int? = null,

    @Json(name = "serviceId")
    val serviceId: kotlin.Int? = null,

    @Json(name = "timeUnit")
    val timeUnit: PriceTimeUnit? = null,

    @Json(name = "costPrice")
    val costPrice: kotlin.Double? = null,

    @Json(name = "extraCharge")
    val extraCharge: kotlin.Double? = null,

    @Json(name = "servicePrice")
    val servicePrice: kotlin.Double? = null,

    @Json(name = "quota")
    val quota: kotlin.Double? = null,

    @Json(name = "timeBound")
    val timeBound: TimeBound? = null,

    @Json(name = "status")
    val status: PriceStatus? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "discountCategoryId")
    val discountCategoryId: kotlin.Int? = null,

    @Json(name = "discountCategory")
    val discountCategory: DiscountCategory? = null

) {


}

