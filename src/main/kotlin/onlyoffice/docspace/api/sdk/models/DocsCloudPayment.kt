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
 * Represents the payment information of a DocsCloud tenant.
 *
 * @param cartId The cart ID.
 * @param productId The product ID.
 * @param status The payment status.
 * @param intervalUnit The interval unit.
 * @param isYear Whether the payment interval is yearly.
 * @param isPrepaid Whether the payment is prepaid.
 * @param quantity The quantity.
 * @param currency The three-character ISO 4217 currency symbol of the payment.
 */


data class DocsCloudPayment (

    @Json(name = "cartId")
    val cartId: kotlin.String? = null,

    @Json(name = "productId")
    val productId: kotlin.Int? = null,

    @Json(name = "status")
    val status: kotlin.Int? = null,

    @Json(name = "intervalUnit")
    val intervalUnit: kotlin.Int? = null,

    @Json(name = "isYear")
    val isYear: kotlin.Boolean? = null,

    @Json(name = "isPrepaid")
    val isPrepaid: kotlin.Boolean? = null,

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null

) {


}

