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

import onlyoffice.docspace.api.sdk.models.AiChatErrorPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Delivery/generation status of the message.
 *
 * @param type `running`, `requires-action`, `complete` or `incomplete`.
 * @param reason Why the message is in that state: `tool-calls` or `interrupt` for `requires-action`; `stop` or `unknown` for `complete`; `cancelled`, `tool-calls`, `length`, `content-filter`, `other` or `error` for `incomplete`. An `incomplete` message the chat stored carries `cancelled` (the round was stopped) or `error`.
 * @param error What failed, on an `incomplete` message whose `reason` is `error`.
 */


data class AiThreadMessageLikeStatus (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "reason")
    val reason: kotlin.String? = null,

    @Json(name = "error")
    val error: AiChatErrorPayload? = null

) {


}

