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
 * Represents service payment information.
 *
 * @param operationId The payment operation ID.
 * @param amount The balance of the sub-account in the specified currency.
 * @param currency The three-character ISO 4217 currency symbol.
 * @param quantity Total quantity of operations.
 * @param subscriptionId The subscription ID
 * @param startDate The subscription start date.
 * @param endDate The subscription end date.
 */


data class ServicePayment (

    /* The payment operation ID. */
    @Json(name = "operationId")
    val operationId: kotlin.Int? = null,

    /* The balance of the sub-account in the specified currency. */
    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    /* The three-character ISO 4217 currency symbol. */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* Total quantity of operations. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    /* The subscription ID */
    @Json(name = "subscriptionId")
    val subscriptionId: kotlin.Int? = null,

    /* The subscription start date. */
    @Json(name = "startDate")
    val startDate: java.time.OffsetDateTime? = null,

    /* The subscription end date. */
    @Json(name = "endDate")
    val endDate: java.time.OffsetDateTime? = null

) {


}

