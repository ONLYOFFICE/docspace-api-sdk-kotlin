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
import onlyoffice.docspace.api.sdk.models.MessageAction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The login event parameters.
 *
 * @param id The login event ID.
 * @param date The API date and time parameters.
 * @param user The user name of the login event.
 * @param userId The user ID of the login event.
 * @param login The user login of the login event.
 * @param action The login event action.
 * @param actionId The event action ID.
 * @param ip The login event IP.
 * @param country The login event country.
 * @param city The login event city.
 * @param browser The login event browser.
 * @param platform The login event platform.
 * @param page The login event page.
 */


data class LoginEventDto (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "date")
    val date: ApiDateTime? = null,

    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "login")
    val login: kotlin.String? = null,

    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "actionId")
    val actionId: MessageAction? = null,

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

    @Json(name = "page")
    val page: kotlin.String? = null

) {


}

