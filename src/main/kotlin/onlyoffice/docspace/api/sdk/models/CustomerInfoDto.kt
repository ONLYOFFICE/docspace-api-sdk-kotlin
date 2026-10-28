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

import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.PaymentMethodStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The billing customer behind the portal, and which portal member pays for it.
 *
 * @param portalId The portal's identifier in the billing system, which is what support and invoices refer to. It is not the  portal alias.
 * @param paymentMethodStatus Whether a payment method is stored for the account and usable. Without one the portal can hold a wallet  balance but cannot be charged automatically.
 * @param paymentMethodType The customer's payment method type.
 * @param isDelayedPaymentMethod Indicates whether the customer's payment method is delayed, i.e. the money reaches the wallet only after  the transfer settles rather than immediately.
 * @param email The address the billing account is registered to, lower-cased. It need not belong to a portal member,  which is exactly when `payer` stays empty.
 * @param payer The portal member whose account is behind the billing address. It is empty when `email` matches no member  of this portal, and while it is empty every operation of this group that only the payer may call is out  of reach for everybody.
 */


data class CustomerInfoDto (

    @Json(name = "portalId")
    val portalId: kotlin.String? = null,

    @Json(name = "paymentMethodStatus")
    val paymentMethodStatus: PaymentMethodStatus? = null,

    @Json(name = "paymentMethodType")
    val paymentMethodType: kotlin.String? = null,

    @Json(name = "isDelayedPaymentMethod")
    val isDelayedPaymentMethod: kotlin.Boolean? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "payer")
    val payer: EmployeeDto? = null

) {


}

