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
 * The active connection item parameters.
 *
 * @param id The active connection ID.
 * @param tenantId The tenant ID.
 * @param userId The user ID.
 * @param mobile Specifies if the active connection has a mobile phone or not.
 * @param ip The IP address of the active connection.
 * @param country The active connection country.
 * @param city The active connection city.
 * @param browser The active connection browser.
 * @param platform The active connection platform.
 * @param date The API date and time parameters.
 * @param page The active connection page.
 */


data class ActiveConnectionsItemDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int,

    @Json(name = "userId")
    val userId: java.util.UUID,

    @Json(name = "mobile")
    val mobile: kotlin.Boolean? = null,

    @Json(name = "ip")
    val ip: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "browser")
    val browser: kotlin.String? = null,

    @Json(name = "platform")
    val platform: kotlin.String? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    @Json(name = "page")
    val page: kotlin.String? = null

) {


}

