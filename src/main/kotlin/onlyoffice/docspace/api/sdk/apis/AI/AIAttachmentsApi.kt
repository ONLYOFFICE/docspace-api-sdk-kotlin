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
     * Delete one attachment
     * Permanently deletes one attachment, whether it is still a draft or already bound to a message. The ID is not validated here, so a malformed one surfaces as an error relayed from storage rather than as a 400, and an ID that does not exist answers success without deleting anything. Deleting a bound attachment leaves the message in place without it. The deletion cannot be undone.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not anything was deleted.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAttachmentsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete/
     *
     *
     * @param body The ID of the attachment to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/attachments/delete", hasBody = true)
    suspend fun aiAttachmentsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/attachments/delete-many
     * Delete many
     * Permanently deletes several attachments in one round trip. `ids` is optional and an absent value is treated as an empty list, so a malformed request quietly deletes nothing instead of failing. IDs that do not exist are skipped without being reported, so the answer confirms only that the call was accepted. The deletions cannot be undone.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not anything was deleted.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAttachmentsDeleteMany Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-delete-many/
     *
     *
     * @param requestBody The IDs of the attachments to delete, as a bare JSON array of strings.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/attachments/delete-many", hasBody = true)
    suspend fun aiAttachmentsDeleteMany(@Body requestBody: kotlin.collections.List<kotlin.String>): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/attachments/get
     * Get one attachment
     * Returns one attachment by its ID, whether it is still a draft or already bound to a message. The ID is required and has to be a non-empty string. An ID that no longer exists is not reported as 404: the answer is a null body with status 200, so treat a missing payload as no such attachment. Use `POST api/2.0/ai/attachments/get-many` to read several at once.
     * Responses:
     *  - 200: The attachment, or a null body when no attachment has that ID.
     *  - 400: The attachment ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAttachmentsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get/
     *
     *
     * @param body The ID of the attachment to read, as a bare JSON string.
     * @return [AiAttachment]
     */
    @POST("api/2.0/ai/attachments/get")
    suspend fun aiAttachmentsGet(@Body body: kotlin.String): Response<AiAttachment>

    /**
     * POST api/2.0/ai/attachments/get-many
     * Get many
     * Returns several attachments in one call, aligned by position with the `ids` that were sent, so the answer can be zipped straight onto the request. An ID that no longer exists leaves its slot empty rather than shortening the list, which is how a caller tells which of them are gone. `ids` has to be present and non-empty - an empty batch is rejected rather than answered with an empty list. Nothing is changed by the call.
     * Responses:
     *  - 200: The attachments, aligned by position with the IDs that were sent. A missing one leaves its slot empty.
     *  - 400: The list of attachment IDs is malformed.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAttachmentsGetMany Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-many/
     *
     *
     * @param requestBody The IDs of the attachments to read, as a bare JSON array of strings. The answer is aligned with this array by position.
     * @return [kotlin.collections.List<AiAttachment?>]
     */
    @POST("api/2.0/ai/attachments/get-many")
    suspend fun aiAttachmentsGetMany(@Body requestBody: kotlin.collections.List<kotlin.String>): Response<kotlin.collections.List<AiAttachment?>>

    /**
     * POST api/2.0/ai/attachments/suggested-questions
     * Get suggested questions
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAttachmentsGetSuggestedQuestions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-attachments-get-suggested-questions/
     *
     *
     * @param requestBody 
     * @return [AiSuccessResponse]
     */
    @POST("api/2.0/ai/attachments/suggested-questions")
    suspend fun aiAttachmentsGetSuggestedQuestions(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.Any?>): Response<AiSuccessResponse>

    /**
     * POST api/2.0/ai/attachments/link-to-message
     * Link to message
     * Binds draft attachments to the chat message that owns them, after that message has been persisted, so that deleting the message removes them too. All three of `ids`, `messageId` and `threadId` are required, and the references are verified rather than trusted: an unknown message answers 404, a message that belongs to a different thread answers 400, and attachments that no longer exist answer 404 naming each missing ID. That verification exists because the underlying binding call skips unknown IDs silently, which used to report success for a link that had not happened. Drafts stay unbound until this succeeds.
     * Responses:
     *  - 200: Confirms the attachments are now bound to the message.
     *  - 400: The attachment or message reference is malformed.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The message or the attachment does not exist.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Stores one file attachment as a draft and returns it, so its ID can be attached to a message later. `input` carries the host `path` - the DocSpace entry ID the AI backend resolves server-side - the text `content` already extracted from that file, the ONLYOFFICE numeric file `type`, and optionally a `title`; the text is what the model reads, so this operation does not open the file itself. Archives are refused outright, whatever their declared name says. Drafts are not bound to a conversation until `POST api/2.0/ai/attachments/link-to-message` is called, so an unlinked draft outlives the round that created it.
     * Responses:
     *  - 200: The stored draft, whose ID links it to a message later.
     *  - 400: The attachment payload is malformed.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Stores several file attachments as drafts in one round trip and returns them in the order they were sent. Each entry is validated exactly as the single-file operation validates its `input`, and the first bad one rejects the whole batch with its index named in the message - nothing is stored. `inputs` has to be present and an array: an absent or null value is a malformed request rather than an empty batch, and only an explicit empty array means no files. Follow up with `POST api/2.0/ai/attachments/link-to-message` to bind the drafts to a message.
     * Responses:
     *  - 200: The stored drafts, in the order they were sent.
     *  - 400: `inputs` is not an array, or one of its entries is malformed.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
