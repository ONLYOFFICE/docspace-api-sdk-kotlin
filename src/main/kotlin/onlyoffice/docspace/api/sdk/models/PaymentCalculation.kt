 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * The parameters of the calculated payment amount.
 *
 * @param operationId The operation unique identifier.
 * @param amount The calculated payment amount.
 * @param currency The three-character ISO 4217 currency symbol used for the payment calculation.
 * @param quantity The quantity associated with the payment calculation.
 */


data class PaymentCalculation (

    /* The operation unique identifier. */
    @Json(name = "operationId")
    val operationId: kotlin.Long? = null,

    /* The calculated payment amount. */
    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    /* The three-character ISO 4217 currency symbol used for the payment calculation. */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* The quantity associated with the payment calculation. */
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null

) {


}

