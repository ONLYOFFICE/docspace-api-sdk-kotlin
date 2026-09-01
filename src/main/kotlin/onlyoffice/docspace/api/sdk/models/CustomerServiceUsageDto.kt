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
 * Aggregated customer usage statistics for a service over a period.
 *
 * @param service The name of the service.
 * @param title The title of the service.
 * @param serviceUnit The unit of measurement for the service.
 * @param currency The three-character ISO 4217 currency symbol of the amounts.
 * @param totalQuantity The total number of units consumed.
 * @param totalAmount The total amount charged for the service.
 * @param operationCount The number of individual purchase operations.
 * @param price The price of the service.
 * @param subscription Indicates whether the service is subscription-based.
 */


data class CustomerServiceUsageDto (

    @Json(name = "service")
    val service: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "serviceUnit")
    val serviceUnit: kotlin.String? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "totalQuantity")
    val totalQuantity: kotlin.Int? = null,

    @Json(name = "totalAmount")
    val totalAmount: kotlin.Double? = null,

    @Json(name = "operationCount")
    val operationCount: kotlin.Int? = null,

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "subscription")
    val subscription: kotlin.Boolean? = null

) {


}

