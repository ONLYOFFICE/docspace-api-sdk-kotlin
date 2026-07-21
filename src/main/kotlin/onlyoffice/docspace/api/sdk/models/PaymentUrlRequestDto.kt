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
 * The request parameters for the payment URL configuration with quantity information.
 *
 * @param backUrl The URL where the user will be redirected after payment cancellation.
 * @param successUrl The URL where the user will be redirected after successful payment.
 * @param quantity The payment quantity.
 */


data class PaymentUrlRequestDto (

    /* The URL where the user will be redirected after payment cancellation. */
    @Json(name = "backUrl")
    val backUrl: java.net.URI,

    /* The URL where the user will be redirected after successful payment. */
    @Json(name = "successUrl")
    val successUrl: java.net.URI,

    /* The payment quantity. */
    @Json(name = "quantity")
    val quantity: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null

) {


}

