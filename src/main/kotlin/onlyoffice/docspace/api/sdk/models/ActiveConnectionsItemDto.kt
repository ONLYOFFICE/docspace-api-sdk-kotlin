 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * @param date 
 * @param page The active connection page.
 */


data class ActiveConnectionsItemDto (

    /* The active connection ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* The tenant ID. */
    @Json(name = "tenantId")
    val tenantId: kotlin.Int,

    /* The user ID. */
    @Json(name = "userId")
    val userId: java.util.UUID,

    /* Specifies if the active connection has a mobile phone or not. */
    @Json(name = "mobile")
    val mobile: kotlin.Boolean? = null,

    /* The IP address of the active connection. */
    @Json(name = "ip")
    val ip: kotlin.String? = null,

    /* The active connection country. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* The active connection city. */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* The active connection browser. */
    @Json(name = "browser")
    val browser: kotlin.String? = null,

    /* The active connection platform. */
    @Json(name = "platform")
    val platform: kotlin.String? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    /* The active connection page. */
    @Json(name = "page")
    val page: kotlin.String? = null

) {


}

