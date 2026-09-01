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
 * The customer information.
 *
 * @param portalId The portal ID.
 * @param paymentMethodStatus The customer's payment method.
 * @param email The customer email address.
 * @param payer The paying user.
 */


data class CustomerInfoDto (

    @Json(name = "portalId")
    val portalId: kotlin.String? = null,

    @Json(name = "paymentMethodStatus")
    val paymentMethodStatus: PaymentMethodStatus? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "payer")
    val payer: EmployeeDto? = null

) {


}

