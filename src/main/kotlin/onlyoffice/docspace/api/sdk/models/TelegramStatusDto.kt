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

import onlyoffice.docspace.api.sdk.models.RegStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Whether the calling user's account is linked to the portal's Telegram bot.
 *
 * @param status Where the caller's own account stands: not linked, linked, or a registration link issued and the portal  still waiting for it to be opened in Telegram. The waiting state ends on its own when the link expires,  so it is worth polling rather than treating as final.
 * @param username The Telegram handle the account is linked to, without the leading `@`. It is filled in only while the  account is linked and comes back empty in the other two states.
 */


data class TelegramStatusDto (

    @Json(name = "status")
    val status: RegStatus,

    @Json(name = "username")
    val username: kotlin.String? = null

) {


}

