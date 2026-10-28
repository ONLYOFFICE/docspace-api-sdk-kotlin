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

import onlyoffice.docspace.api.sdk.models.EditorToolCallParametersDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A generation the editor is expected to run as soon as the document opens, left behind by an AI agent that created  the file but not its content.
 *
 * @param toolName Which generation to run, which also decides the shape of the parameters below.
 * @param parameters The arguments of the generation named above.
 */


data class EditorToolCallStateDto (

    @Json(name = "toolName")
    val toolName: kotlin.String?,

    @Json(name = "parameters")
    val parameters: EditorToolCallParametersDto

) {


}

