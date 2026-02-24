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
 * Parameters for updating the disabled tools list of an MCP server in a room.
 *
 * @param disabledTools List of tool names to disable. Tools not included in this list will remain enabled. Pass an empty list to enable all tools.
 */


data class SetMcpToolsRequestBody (

    /* List of tool names to disable. Tools not included in this list will remain enabled. Pass an empty list to enable all tools. */
    @Json(name = "disabledTools")
    val disabledTools: kotlin.collections.List<kotlin.String>?

) {


}

