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

import onlyoffice.docspace.api.sdk.models.AiOpenAIChatCompletionChunk
import onlyoffice.docspace.api.sdk.models.AiOpenAIChunkChoice
import onlyoffice.docspace.api.sdk.models.AiOpenAIStreamError
import onlyoffice.docspace.api.sdk.models.AiOpenAIStreamErrorError

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A chunk or the terminal error envelope emitted on a failed stream.
 *
 * @param id The completion identifier, stable across every chunk of one response.
 * @param `object` Always `chat.completion.chunk`.
 * @param created When the completion started, in Unix seconds.
 * @param model The model that produced the completion - the resolved profile's model.
 * @param choices The choices carried by this chunk. This service emits exactly one.
 * @param error 
 */


data class AiOpenAIStreamChunk (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "object")
    val `object`: AiOpenAIStreamChunk.`Object`,

    @Json(name = "created")
    val created: java.math.BigDecimal,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "choices")
    val choices: kotlin.collections.List<AiOpenAIChunkChoice>,

    @Json(name = "error")
    val error: AiOpenAIStreamErrorError

) {

    /**
     * Always `chat.completion.chunk`.
     *
     * Values: chatPeriodCompletionPeriodChunk
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "chat.completion.chunk") chatPeriodCompletionPeriodChunk("chat.completion.chunk");
    }

}

