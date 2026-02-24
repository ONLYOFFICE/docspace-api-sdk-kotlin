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

import onlyoffice.docspace.api.sdk.models.Icon
import onlyoffice.docspace.api.sdk.models.ServerType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Compact MCP server summary without sensitive details like endpoint URL or authentication headers.
 *
 * @param id Unique identifier of the MCP server.
 * @param name Display name of the MCP server.
 * @param serverType 
 * @param enabled Indicates whether the server is currently enabled and available for room assignment.
 * @param icon 
 * @param needReset Indicates whether the server requires a configuration reset due to connectivity or credential issues.
 */


data class McpServerShortDto (

    /* Unique identifier of the MCP server. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* Display name of the MCP server. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "serverType")
    val serverType: ServerType? = null,

    /* Indicates whether the server is currently enabled and available for room assignment. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "icon")
    val icon: Icon? = null,

    /* Indicates whether the server requires a configuration reset due to connectivity or credential issues. */
    @Json(name = "needReset")
    val needReset: kotlin.Boolean? = null

) {


}

