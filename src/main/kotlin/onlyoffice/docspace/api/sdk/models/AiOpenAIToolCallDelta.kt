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

import onlyoffice.docspace.api.sdk.models.AiOpenAIToolCallDeltaFunction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The incremental part of one tool call the model requested.
 *
 * @param index The zero-based position of the tool call within the message.
 * @param id The tool call identifier, quoted back when its result is submitted.
 * @param type Always `function` - the only tool kind the API defines.
 * @param function 
 */


data class AiOpenAIToolCallDelta (

    @Json(name = "index")
    val index: java.math.BigDecimal,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "type")
    val type: AiOpenAIToolCallDelta.Type? = null,

    @Json(name = "function")
    val function: AiOpenAIToolCallDeltaFunction? = null

) {

    /**
     * Always `function` - the only tool kind the API defines.
     *
     * Values: function
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "function") function("function");
    }

}

