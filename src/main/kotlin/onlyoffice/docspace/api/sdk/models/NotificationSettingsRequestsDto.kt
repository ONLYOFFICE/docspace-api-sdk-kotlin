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

import onlyoffice.docspace.api.sdk.models.NotificationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Which kind of notification the calling user switches, and which way.
 *
 * @param type The kind of notification being switched. A value outside the defined set is echoed back while nothing is  stored, so confirm the result with `GET api/2.0/settings/notification/{type}` rather than trusting the  answer.
 * @param isEnabled Whether that kind reaches the calling account. It applies to the caller own account alone and to every room  at once; a single room is silenced with `POST api/2.0/settings/notification/rooms` instead.
 */


data class NotificationSettingsRequestsDto (

    @Json(name = "type")
    val type: NotificationType,

    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean? = null

) {


}

