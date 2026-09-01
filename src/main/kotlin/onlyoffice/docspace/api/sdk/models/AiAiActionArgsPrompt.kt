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
 * Override the action's baked-in system prompt (replace or append).
 *
 * @param mode 
 * @param text 
 */


data class AiAiActionArgsPrompt (

    @Json(name = "mode")
    val mode: AiAiActionArgsPrompt.Mode,

    @Json(name = "text")
    val text: kotlin.String

) {

    /**
     * 
     *
     * Values: replace,append
     */
    @JsonClass(generateAdapter = false)
    enum class Mode(val value: kotlin.String) {
        @Json(name = "replace") replace("replace"),
        @Json(name = "append") append("append");
    }

}

