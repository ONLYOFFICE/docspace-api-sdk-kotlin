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

import onlyoffice.docspace.api.sdk.models.AiModelCapabilities
import onlyoffice.docspace.api.sdk.models.ChatMultimodalSettingsDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The chat settings parameters.
 *
 * @param providerId The AI provider ID.
 * @param modelId The AI model ID used for chat completions.
 * @param modelAlias The AI model display alias.
 * @param prompt The system prompt for the chat.
 * @param multimodal 
 * @param thinking Indicates whether the model supports extended thinking mode.
 * @param capabilities 
 * @param `internal` Indicates whether this is an internal AI gateway provider.
 */


data class ChatSettingsDto (

    /* The AI provider ID. */
    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    /* The AI model ID used for chat completions. */
    @Json(name = "modelId")
    val modelId: kotlin.String? = null,

    /* The AI model display alias. */
    @Json(name = "modelAlias")
    val modelAlias: kotlin.String? = null,

    /* The system prompt for the chat. */
    @Json(name = "prompt")
    val prompt: kotlin.String? = null,

    @Json(name = "multimodal")
    val multimodal: ChatMultimodalSettingsDto? = null,

    /* Indicates whether the model supports extended thinking mode. */
    @Json(name = "thinking")
    @Deprecated(message = "This property is deprecated.")
    val thinking: kotlin.Boolean? = null,

    @Json(name = "capabilities")
    val capabilities: AiModelCapabilities? = null,

    /* Indicates whether this is an internal AI gateway provider. */
    @Json(name = "internal")
    val `internal`: kotlin.Boolean? = null

) {


}

