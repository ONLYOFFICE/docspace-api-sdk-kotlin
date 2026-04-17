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
 * The AI model capabilities.
 *
 * @param vision Indicates whether the model supports image and vision input.
 * @param toolCalling Indicates whether the model supports tool (function) calling.
 * @param thinking Indicates whether the model supports extended thinking and reasoning.
 */


data class AiModelCapabilities (

    /* Indicates whether the model supports image and vision input. */
    @Json(name = "vision")
    val vision: kotlin.Boolean? = null,

    /* Indicates whether the model supports tool (function) calling. */
    @Json(name = "toolCalling")
    val toolCalling: kotlin.Boolean? = null,

    /* Indicates whether the model supports extended thinking and reasoning. */
    @Json(name = "thinking")
    val thinking: kotlin.Boolean? = null

) {


}

