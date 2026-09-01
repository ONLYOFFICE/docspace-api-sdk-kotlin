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
 * Aggregated customer spending for a single calendar month.
 *
 * @param year The calendar year.
 * @param month The calendar month (1-12).
 * @param currency The three-character ISO 4217 currency symbol of the amounts.
 * @param totalAmount The total amount charged across all services in this month.
 * @param operationCount The number of individual purchase operations in this month.
 */


data class CustomerMonthlyUsageDto (

    @Json(name = "year")
    val year: kotlin.Int? = null,

    @Json(name = "month")
    val month: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "totalAmount")
    val totalAmount: kotlin.Double? = null,

    @Json(name = "operationCount")
    val operationCount: kotlin.Int? = null

) {


}

