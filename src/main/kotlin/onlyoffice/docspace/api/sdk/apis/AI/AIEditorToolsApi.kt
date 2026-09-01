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

import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIEditorToolsApi {
    /**
     * POST api/2.0/ai/editor-tools/call
     * Execute a DocSpace tool on behalf of the editor AI plugin
     * Executes one DocSpace tool on behalf of the document editor's AI plugin, server-side and with the caller's forwarded credentials. Whatever the tool produced is returned for the plugin to relay to the model; a failure comes back as an error payload.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiEditorToolsCall Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-call/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/editor-tools/call")
    suspend fun aiEditorToolsCall(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any>): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/editor-tools/list
     * Sanitized DocSpace tool catalog for the editor AI plugin
     * Returns the sanitized catalog of DocSpace tools available to the document editor's AI plugin - the same composed tool set the DocSpace chat sees, minus the web-search pair the editor already has through its own passthrough. Only the name, description, parameters and approval flag of each tool are exposed; transport details never reach the browser.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiEditorToolsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-editor-tools-list/
     *
     *
     * @return [AiSuccessResponse]
     */
    @GET("api/2.0/ai/editor-tools/list")
    suspend fun aiEditorToolsList(): Response<AiSuccessResponse>

}
