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
import onlyoffice.docspace.api.sdk.models.OperationStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One payment into the portal wallet: when it was made, how much it brought in, how it ended, and whether an  invoice stands behind it.
 *
 * @param id The identifier of the top-up, which is what `GET api/2.0/portal/payment/customer/deposits/{id}/invoice` takes  to read its invoice.
 * @param date When the top-up was booked, as an ISO 8601 timestamp that carries its own offset: that of the portal's time  zone, written as `Z` for a portal in UTC - the zone in which `startDate` and `endDate` without an offset are  read.
 * @param amount The amount that went into the wallet, in `currency`.
 * @param currency The currency `amount` is expressed in, as a three-letter ISO 4217 code - the accounting currency of the  wallet.
 * @param status How the top-up ended. A pending one is still being settled and may change later, so only a completed one has  actually raised the balance.
 * @param hasInvoice Whether the billing provider holds an invoice for the payment behind the top-up, which is when  `GET api/2.0/portal/payment/customer/deposits/{id}/invoice` can open it. It is `false` for a top-up whose  payment came without one, and asking for its invoice then fails with 404.
 */


data class DepositDto (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "status")
    val status: OperationStatus? = null,

    @Json(name = "hasInvoice")
    val hasInvoice: kotlin.Boolean? = null

) {


}

