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
 * What one wallet service was consumed and cost over the requested period, added up rather than listed.
 *
 * @param service The stable key of the service, which is what the `serviceName` filter of this operation matches on and  what `GET api/2.0/portal/payment/walletservice` looks a service up by.
 * @param title The service name in the portal language, for printing rather than matching.
 * @param serviceUnit What `totalQuantity` counts, in the portal language. AI consumption is reported in tokens here rather  than in the AI credits the service is sold in, so it does not line up with the price list.
 * @param currency The currency `totalAmount` and `price` are expressed in, as a three-letter ISO 4217 code.
 * @param totalQuantity How many units of the service were consumed over the period, in the unit named by `serviceUnit`.
 * @param totalAmount What that consumption cost over the period. It is what was actually charged, so it can differ from  `price` times `totalQuantity` when the price changed inside the period.
 * @param operationCount How many separate charges the total was added up from. The charges themselves are in  `GET api/2.0/portal/payment/customer/operations`.
 * @param price What one unit of the service costs today, not what it cost during the period. It is `0` when the service  is no longer on the installation's price list.
 * @param subscription Whether the service is billed as a standing subscription rather than per unit consumed. It is derived  from today's price list, so it describes the service as it is sold now.
 */


data class CustomerServiceUsageDto (

    @Json(name = "service")
    val service: kotlin.String? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "serviceUnit")
    val serviceUnit: kotlin.String? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "totalQuantity")
    val totalQuantity: kotlin.Int? = null,

    @Json(name = "totalAmount")
    val totalAmount: kotlin.Double? = null,

    @Json(name = "operationCount")
    val operationCount: kotlin.Int? = null,

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "subscription")
    val subscription: kotlin.Boolean? = null

) {


}

