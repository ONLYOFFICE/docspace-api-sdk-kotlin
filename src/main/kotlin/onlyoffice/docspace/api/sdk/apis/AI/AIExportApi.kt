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
import onlyoffice.docspace.api.sdk.models.AiExportTextToDocx200Response
import onlyoffice.docspace.api.sdk.models.AiExportTextToDocxRequest

interface AIExportApi {
    /**
     * POST api/2.0/ai/text-to-docx
     * Start markdown → docx export
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiExportTextToDocx Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-export-text-to-docx/
     *
     *
     * @param aiExportTextToDocxRequest 
     * @return [AiExportTextToDocx200Response]
     */
    @POST("api/2.0/ai/text-to-docx")
    suspend fun aiExportTextToDocx(@Body aiExportTextToDocxRequest: AiExportTextToDocxRequest): Response<AiExportTextToDocx200Response>

}
