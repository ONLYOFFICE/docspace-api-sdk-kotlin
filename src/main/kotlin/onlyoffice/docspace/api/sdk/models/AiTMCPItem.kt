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
 * Descriptor for a tool exposed by an MCP server.
 *
 * @param name Tool name as registered on the MCP server (e.g. `web_search`, `insert_text`).
 * @param description Human-readable description shown to the AI model and in the tools list UI.
 * @param inputSchema JSON Schema describing the tool's input parameters.
 * @param enabled Whether this tool is currently enabled. Disabled tools are hidden from the AI model.
 * @param serverType Server type (MCP server name / host tool group id) this tool belongs to — the key the persisted disabled map is stored under. Set by the source that enumerated the tool, so a caller-supplied tool can still be attributed to its group after being flattened into a single list: that is what lets the engine apply the disabled map to `actionArgs.tools` instead of trusting the caller to pre-filter. Wire-serializable, so it survives a remote (server-side) engine.
 * @param requireApproval Whether the consumer must show an approval dialog before this tool runs. The engine reads it when deciding the `autoAllow` flag on a `tool-call-pending` event: `requireApproval === false` auto-allows the call (no dialog), `true` always prompts. `undefined` leaves the decision to the persisted always-allow list alone — so MCP / custom-server tools (which never set it) keep prompting as before, while host tools opt into auto-allow by default. Wire-serializable, so it survives a remote (server-side) engine.
 */


data class AiTMCPItem (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "inputSchema")
    val inputSchema: kotlin.Any,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "serverType")
    val serverType: kotlin.String? = null,

    @Json(name = "requireApproval")
    val requireApproval: kotlin.Boolean? = null

) {


}

