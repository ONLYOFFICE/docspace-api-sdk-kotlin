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
 * How much money is charged to the payment method on file and added to the portal wallet.
 *
 * @param amount The sum to charge, as a whole number of units of `currency` - 10 means ten dollars and not ten cents. The  bounds are what one call may move, not what the wallet may hold, so a larger top-up is made of several calls.
 * @param currency The currency the charge is made in, as an ISO 4217 code in upper case. It has to be one of the accounting  currencies this installation supports, which `GET api/2.0/portal/payment/accounting/currencies` lists; any  other code is refused with 400. The money lands on the wallet sub-account of that currency, so topping up in  a second currency does not add to the first one.
 */


data class TopUpDepositRequestDto (

    @Json(name = "amount")
    val amount: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null

) {


}

