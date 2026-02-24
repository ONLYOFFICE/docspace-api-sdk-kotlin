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
 * Full MCP server configuration, including connection details and authentication headers. Returned for administrator-level operations.
 *
 * @param id Unique identifier of the MCP server.
 * @param name Display name of the MCP server.
 * @param description Human-readable description of the server's purpose and capabilities.
 * @param endpoint Base URL of the MCP server endpoint.
 * @param serverType 
 * @param headers HTTP headers sent with every request to the server (e.g., authentication tokens).
 * @param enabled Indicates whether the server is currently enabled and available for room assignment.
 * @param icon 
 * @param needReset Indicates whether the server requires a configuration reset due to connectivity or credential issues.
 */


data class McpServerDto (

    /* Unique identifier of the MCP server. */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* Display name of the MCP server. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Human-readable description of the server's purpose and capabilities. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Base URL of the MCP server endpoint. */
    @Json(name = "endpoint")
    val endpoint: kotlin.String? = null,

    @Json(name = "serverType")
    val serverType: ServerType? = null,

    /* HTTP headers sent with every request to the server (e.g., authentication tokens). */
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

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

