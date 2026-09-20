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
 * 
 *
 * @param message Human-readable description of the failure.
 * @param type OpenAI error class, for example `invalid_request_error`.
 * @param code Machine-readable code, when the provider supplies one.
 * @param `param` The request parameter at fault, when the failure names one.
 */


data class AiOpenaiChatCompletions403ResponseError (

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "param")
    val `param`: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>() {


}

