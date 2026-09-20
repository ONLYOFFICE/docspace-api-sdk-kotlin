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
import onlyoffice.docspace.api.sdk.models.AiExportTextToDocx202Response
import onlyoffice.docspace.api.sdk.models.AiExportTextToDocxRequest

interface AIExportApi {
    /**
     * POST api/2.0/ai/text-to-docx
     * Start markdown → docx export
     * Queues a markdown-to-docx export and answers 202 as soon as the job is accepted, without waiting for it. `title`, `content` and `folderId` are all required, and a `content` of only whitespace counts as missing even though it is not empty. The conversion runs in the AI worker, which saves the .docx into the target folder - an agent room resolves to its own result-storage subfolder - so there is nothing to poll here: completion arrives as the ordinary folder-modified socket event. This route accepts a body of up to 15 MB rather than the 100 KB the rest of the API allows, because a whole thread transcript is sent in one request.
     * Responses:
     *  - 202: Confirms the export was queued. The .docx arrives in the target folder later, announced by a folder-modified socket event.
     *  - 400: `title`, `content` or `folderId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The transcript is larger than 15 MB, this route's own parser limit.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiExportTextToDocx Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/
     *
     *
     * @param aiExportTextToDocxRequest 
     * @return [AiExportTextToDocx202Response]
     */
    @POST("api/2.0/ai/text-to-docx")
    suspend fun aiExportTextToDocx(@Body aiExportTextToDocxRequest: AiExportTextToDocxRequest): Response<AiExportTextToDocx202Response>

}
