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
 * Represents an active wallet service (quota) of the current portal.
 *
 * @param service The name of the service.
 * @param serviceUnit The unit of measurement for the service.
 * @param subscription Indicates whether the service is subscription-based.
 * @param title The title of the service.
 * @param limit The service limit. Populated only for the subscription-based services.
 * @param used The current service usage. Populated only for the subscription-based services.
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

