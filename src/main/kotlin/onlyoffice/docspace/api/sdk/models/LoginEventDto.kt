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
import onlyoffice.docspace.api.sdk.models.MessageAction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The login event parameters.
 *
 * @param id The login event ID.
 * @param date 
 * @param user The user name of the login event.
 * @param userId The user ID of the login event.
 * @param login The user login of the login event.
 * @param action The login event action.
 * @param actionId 
 * @param ip The login event IP.
 * @param country The login event country.
 * @param city The login event city.
 * @param browser The login event browser.
 * @param platform The login event platform.
 * @param page The login event page.
 */


data class LoginEventDto (

    /* The login event ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    /* The user name of the login event. */
    @Json(name = "user")
    val user: kotlin.String? = null,

    /* The user ID of the login event. */
    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    /* The user login of the login event. */
    @Json(name = "login")
    val login: kotlin.String? = null,

    /* The login event action. */
    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "actionId")
    val actionId: MessageAction? = null,

    /* The login event IP. */
    @Json(name = "ip")
    val ip: kotlin.String? = null,

    /* The login event country. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* The login event city. */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* The login event browser. */
    @Json(name = "browser")
    val browser: kotlin.String? = null,

    /* The login event platform. */
    @Json(name = "platform")
    val platform: kotlin.String? = null,

    /* The login event page. */
    @Json(name = "page")
    val page: kotlin.String? = null

) {


}

