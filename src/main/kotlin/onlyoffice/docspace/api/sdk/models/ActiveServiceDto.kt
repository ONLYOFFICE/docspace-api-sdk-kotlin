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
 * One wallet service the portal is running right now, with the allowance it grants where that is counted.
 *
 * @param service The stable key of the service, which is what `POST api/2.0/portal/payment/servicestate` takes to switch  it off again.
 * @param serviceUnit What `limit` and `used` count, in the portal language - gigabytes, editor seats, credits.
 * @param subscription Whether the service is billed as a standing subscription rather than per unit consumed. Only a  subscription can carry `limit` and `used`.
 * @param title The service name in the portal language, for printing rather than matching.
 * @param limit How much of the service the portal is entitled to. It is empty for a service whose consumption is not  counted this way, which is not the same as a service without a limit.
 * @param used How much of that allowance is in use - the editors currently active for the cloud editors, the units  already consumed for disk storage. Empty under the same conditions as `limit`.
 */


data class ActiveServiceDto (

    @Json(name = "service")
    val service: kotlin.String? = null,

    @Json(name = "serviceUnit")
    val serviceUnit: kotlin.String? = null,

    @Json(name = "subscription")
    val subscription: kotlin.Boolean? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    @Json(name = "used")
    val used: kotlin.Int? = null

) {


}

