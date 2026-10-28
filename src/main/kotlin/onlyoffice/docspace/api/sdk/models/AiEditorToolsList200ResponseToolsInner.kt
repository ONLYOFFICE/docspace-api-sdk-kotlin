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
 * @param name Tool name, as it is passed back to the call endpoint.
 * @param description What the tool does, empty when the server declares nothing.
 * @param inputSchema JSON Schema of the tool arguments.
 * @param requireApproval Whether the editor has to ask the user before running the tool. Read-only operations arrive with this off.
 */


data class AiEditorToolsList200ResponseToolsInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "inputSchema")
    val inputSchema: kotlin.collections.Map<kotlin.String, kotlin.Any?>,

    @Json(name = "requireApproval")
    val requireApproval: kotlin.Boolean

) {


}

