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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiEditorToolsCall200Response
import onlyoffice.docspace.api.sdk.models.AiEditorToolsCallRequest
import onlyoffice.docspace.api.sdk.models.AiEditorToolsList200Response
import onlyoffice.docspace.api.sdk.models.AiErrorResponse

interface AIEditorToolsApi {
    /**
     * POST api/2.0/ai/editor-tools/call
     * Call an editor tool
     * Executes one DocSpace tool on behalf of the document editor's AI plugin, server-side and under the caller's own credentials, so the browser never holds the transport. `name` has to be one of the tools `GET api/2.0/ai/editor-tools/list` reports; anything else, including a tool the editor is not allowed to reach, is refused. The result is always returned as a string - a structured result is serialised - because the plugin relays it to the model verbatim. A tool that fails does so inside that string as an error payload rather than as an HTTP status, so check the content before trusting it.
     * Responses:
     *  - 200: The tool's output as a string. A tool that failed reports it inside that string.
     *  - 400: The tool name is not one this portal exposes.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiEditorToolsCall Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-call/
     *
     *
     * @param aiEditorToolsCallRequest The tool to run: `name` from `GET api/2.0/ai/editor-tools/list`, `arguments` matching that tool's input schema, and an optional `entityId` for the room to run it in.
     * @return [AiEditorToolsCall200Response]
     */
    @POST("api/2.0/ai/editor-tools/call")
    suspend fun aiEditorToolsCall(@Body aiEditorToolsCallRequest: AiEditorToolsCallRequest): Response<AiEditorToolsCall200Response>

    /**
     * GET api/2.0/ai/editor-tools/list
     * List editor tools
     * Returns the catalogue of DocSpace tools the document editor's AI plugin may offer the model - the same composed set the DocSpace chat sees, minus the two web-search tools the editor already reaches through its own passthrough. `entityId` scopes the catalogue to a room, which decides the room-specific tools it contains. Each entry carries exactly four fields: the tool name, its description, its input schema, and whether calling it requires an approval dialog; nothing else is exposed, because the raw listings of system servers carry transport details that must not reach a browser. The approval flag follows the same policy the chat engine applies, and a read-only tool comes back needing none - execute a tool with `POST api/2.0/ai/editor-tools/call`, which accepts only the names this catalogue reports.
     * Responses:
     *  - 200: The tools the editor plugin may offer the model, four fields each.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiEditorToolsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-list/
     *
     *
     * @return [AiEditorToolsList200Response]
     */
    @GET("api/2.0/ai/editor-tools/list")
    suspend fun aiEditorToolsList(): Response<AiEditorToolsList200Response>

}
