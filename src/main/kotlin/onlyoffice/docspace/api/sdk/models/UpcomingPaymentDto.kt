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

import onlyoffice.docspace.api.sdk.models.ApiDateTime

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The upcoming payment parameters.
 *
 * @param id The quota ID.
 * @param name The quota name.
 * @param title The quota title.
 * @param unitOfMeasure The quota unit of measure.
 * @param quantity The quantity that will be charged (the next quantity if set, otherwise the current quantity).
 * @param wallet The quota applies to the wallet or not.
 * @param dueDate The API date and time parameters.
 * @param amount The amount that will be charged (unit price multiplied by the quantity).
 * @param currency The three-character ISO 4217 currency symbol of the amount.
 */


data class UpcomingPaymentDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "unitOfMeasure")
    val unitOfMeasure: kotlin.String? = null,

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,

    @Json(name = "wallet")
    val wallet: kotlin.Boolean? = null,

    @Json(name = "dueDate")
    val dueDate: ApiDateTime? = null,

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null

) {


}

