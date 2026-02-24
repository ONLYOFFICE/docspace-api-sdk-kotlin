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
 * The editor tool call state. Used to run the agent flow in the editor.
 *
 * @param toolName The tool name.
 * @param parameters The editor tool call parameters.
 */


data class EditorToolCallStateDto (

    /* The tool name. */
    @Json(name = "toolName")
    val toolName: kotlin.String?,

    /* The editor tool call parameters. */
    @Json(name = "parameters")
    val parameters: kotlin.Any

) {


}

