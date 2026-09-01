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

import onlyoffice.docspace.api.sdk.models.AiAttachment
import onlyoffice.docspace.api.sdk.models.AiAttachmentsLinkToMessageRequest
import onlyoffice.docspace.api.sdk.models.AiAttachmentsSaveFileRequest
import onlyoffice.docspace.api.sdk.models.AiAttachmentsSaveFilesManyRequest
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIAttachmentsApi {
    /**
     * DELETE api/2.0/ai/attachments/delete
     * Delete
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/attachments/delete", hasBody = true)
    suspend fun aiAttachmentsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/attachments/delete-many
     * Delete many
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsDeleteMany Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/attachments/delete-many", hasBody = true)
    suspend fun aiAttachmentsDeleteMany(@Body requestBody: kotlin.collections.List<kotlin.String>): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/attachments/get
     * Get
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
     *
     *
     * @param body 
     * @return [AiAttachment]
     */
    @POST("api/2.0/ai/attachments/get")
    suspend fun aiAttachmentsGet(@Body body: kotlin.String): Response<AiAttachment>

    /**
     * POST api/2.0/ai/attachments/get-many
     * Get many
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsGetMany Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
     *
     *
     * @param requestBody 
     * @return [kotlin.collections.List<AiAttachment?>]
     */
    @POST("api/2.0/ai/attachments/get-many")
    suspend fun aiAttachmentsGetMany(@Body requestBody: kotlin.collections.List<kotlin.String>): Response<kotlin.collections.List<AiAttachment?>>

    /**
     * POST api/2.0/ai/attachments/link-to-message
     * Link to message
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsLinkToMessage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-link-to-message/
     *
     *
     * @param aiAttachmentsLinkToMessageRequest 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/attachments/link-to-message")
    suspend fun aiAttachmentsLinkToMessage(@Body aiAttachmentsLinkToMessageRequest: AiAttachmentsLinkToMessageRequest): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/attachments/save-file
     * Save file
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsSaveFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-file/
     *
     *
     * @param aiAttachmentsSaveFileRequest 
     * @return [AiAttachment]
     */
    @POST("api/2.0/ai/attachments/save-file")
    suspend fun aiAttachmentsSaveFile(@Body aiAttachmentsSaveFileRequest: AiAttachmentsSaveFileRequest): Response<AiAttachment>

    /**
     * POST api/2.0/ai/attachments/save-files-many
     * Save files many
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAttachmentsSaveFilesMany Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-save-files-many/
     *
     *
     * @param aiAttachmentsSaveFilesManyRequest 
     * @return [kotlin.collections.List<AiAttachment>]
     */
    @POST("api/2.0/ai/attachments/save-files-many")
    suspend fun aiAttachmentsSaveFilesMany(@Body aiAttachmentsSaveFilesManyRequest: AiAttachmentsSaveFilesManyRequest): Response<kotlin.collections.List<AiAttachment>>

}
