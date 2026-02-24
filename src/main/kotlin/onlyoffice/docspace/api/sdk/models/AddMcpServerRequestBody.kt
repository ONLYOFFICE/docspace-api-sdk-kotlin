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
 * Parameters for creating a new custom MCP server.
 *
 * @param name Unique display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters.
 * @param description Human-readable description of the server's purpose and capabilities. Maximum 255 characters.
 * @param endpoint Base URL of the MCP server endpoint. Must be a valid, reachable URL. The system will verify connectivity during registration.
 * @param headers Optional HTTP headers to include with every request to the MCP server (e.g., authentication tokens or API keys).
 * @param icon Optional Base64-encoded icon image for the server. Used as the visual identifier in the UI.
 */


data class AddMcpServerRequestBody (

    /* Unique display name for the server. Only letters, numbers, underscores, and hyphens are allowed. Maximum 128 characters. */
    @Json(name = "name")
    val name: kotlin.String?,

    /* Human-readable description of the server's purpose and capabilities. Maximum 255 characters. */
    @Json(name = "description")
    val description: kotlin.String?,

    /* Base URL of the MCP server endpoint. Must be a valid, reachable URL. The system will verify connectivity during registration. */
    @Json(name = "endpoint")
    val endpoint: java.net.URI?,

    /* Optional HTTP headers to include with every request to the MCP server (e.g., authentication tokens or API keys). */
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* Optional Base64-encoded icon image for the server. Used as the visual identifier in the UI. */
    @Json(name = "icon")
    val icon: kotlin.String? = null

) {


}

