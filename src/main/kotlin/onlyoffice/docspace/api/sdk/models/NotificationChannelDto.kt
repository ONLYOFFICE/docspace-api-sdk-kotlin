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
 * One delivery channel of the installation, with the state it is in for this portal.
 *
 * @param name The internal name of the channel as the notification service knows it - `email.sender` for letters,  `telegram.sender` for Telegram messages. It is a key to match on, not a label to print.
 * @param isEnabled Whether the channel can deliver for this portal. Letters are enabled whenever the channel is listed at  all, while Telegram is enabled only while the portal has a bot name and token stored. It says nothing  about the caller, who also has to connect their own Telegram account through  `GET api/2.0/settings/telegram/link`.
 */


data class NotificationChannelDto (

    @Json(name = "name")
    val name: kotlin.String?,

    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean

) {


}

