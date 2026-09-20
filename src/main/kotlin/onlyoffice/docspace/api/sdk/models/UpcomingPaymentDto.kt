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
 * One charge the portal is going to be billed for at the start of the next period.
 *
 * @param id The quota that is going to be charged. When a switch to another quota is scheduled, this is the quota  being switched to, so it can differ from what `GET api/2.0/portal/tariff` reports for today.
 * @param name The quota's stable key, which is the same identifier the wallet operations use for a service.
 * @param title The quota name in the portal language, meant to be printed on an invoice preview.
 * @param unitOfMeasure What `quantity` counts, in the portal language - seats, administrators, gigabytes. It is empty for a quota  that is simply on or off.
 * @param quantity How much is going to be charged for, which is the quantity scheduled for the next period when one has been  scheduled and today's quantity otherwise.
 * @param wallet Whether the charge is paid out of the portal wallet rather than from the subscription.
 * @param dueDate When the charge falls due, in the portal time zone.
 * @param amount What the charge comes to: the unit price of the quota multiplied by `quantity`. Taxes are not part of it,  and a quota with no price of its own is not listed at all rather than listed with a zero.
 * @param currency The currency `amount` is expressed in, as a three-letter ISO 4217 code. It follows the portal's billing  account, so every entry of one answer carries the same code.
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

