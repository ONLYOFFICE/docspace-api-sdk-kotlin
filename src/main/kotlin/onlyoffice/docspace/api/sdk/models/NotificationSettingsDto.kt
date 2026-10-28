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
 * Whether one kind of notification is switched on for the calling user.
 *
 * @param type Which kind of notification the flag belongs to, echoed from the request. It is published as a number:  badges, room activity, the daily feed, and the tips.
 * @param isEnabled Whether the caller receives that kind of notification. It describes the caller's own account and nobody  else's; a fresh account has the badges on and the other three off, because those are subscriptions that  only `POST api/2.0/settings/notification` creates.
 */


data class NotificationSettingsDto (

    @Json(name = "type")
    val type: NotificationType? = null,

    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean? = null

) {


}

