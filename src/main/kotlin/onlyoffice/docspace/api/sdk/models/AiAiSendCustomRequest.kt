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

import onlyoffice.docspace.api.sdk.models.AiAiActionArgs
import onlyoffice.docspace.api.sdk.models.AiThreadMessageLike

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param isStream Stream the reply (ndjson) when true, else return a single message.
 * @param systemPrompt Caller-supplied system prompt for this one-turn call.
 * @param userMessage 
 * @param actionArgs Per-request engine options: extra tools, reasoning, prompt override.
 */


data class AiAiSendCustomRequest (

    @Json(name = "isStream")
    val isStream: kotlin.Boolean,

    @Json(name = "systemPrompt")
    val systemPrompt: kotlin.String,

    @Json(name = "userMessage")
    val userMessage: AiThreadMessageLike,

    @Json(name = "actionArgs")
    val actionArgs: AiAiActionArgs? = null

) {


}

