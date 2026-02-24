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
 * MCP server status within a room, reflecting the current user's connection state for OAuth-based servers.
 *
 * @param name Display name of the MCP server.
 * @param id Unique identifier of the MCP server.
 * @param serverType 
 * @param connected Indicates whether the current user has an active connection to this server. For direct-connection servers this is always true; for OAuth-based servers it reflects whether the user has completed authorization.
 * @param icon 
 * @param needReset Indicates whether the server requires a configuration reset due to connectivity or credential issues.
 */


data class McpServerStatusDto (

    /* Display name of the MCP server. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* Unique identifier of the MCP server. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "serverType")
    val serverType: ServerType? = null,

    /* Indicates whether the current user has an active connection to this server. For direct-connection servers this is always true; for OAuth-based servers it reflects whether the user has completed authorization. */
    @Json(name = "connected")
    val connected: kotlin.Boolean? = null,

    @Json(name = "icon")
    val icon: Icon? = null,

    /* Indicates whether the server requires a configuration reset due to connectivity or credential issues. */
    @Json(name = "needReset")
    val needReset: kotlin.Boolean? = null

) {


}

