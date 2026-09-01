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

import onlyoffice.docspace.api.sdk.models.AiCreatePromptInput
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiFolderMutationResult
import onlyoffice.docspace.api.sdk.models.AiImportResult
import onlyoffice.docspace.api.sdk.models.AiPrompt
import onlyoffice.docspace.api.sdk.models.AiPromptBundle
import onlyoffice.docspace.api.sdk.models.AiPromptFolder
import onlyoffice.docspace.api.sdk.models.AiPromptMutationResult
import onlyoffice.docspace.api.sdk.models.AiPromptsImportBundleRequest
import onlyoffice.docspace.api.sdk.models.AiPromptsMoveRequest
import onlyoffice.docspace.api.sdk.models.AiPromptsRenameFolderRequest
import onlyoffice.docspace.api.sdk.models.AiPromptsUpdateRequest
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIPromptsApi {
    /**
     * POST api/2.0/ai/prompts/create
     * Create
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create/
     *
     *
     * @param aiCreatePromptInput 
     * @return [AiPromptMutationResult]
     */
    @POST("api/2.0/ai/prompts/create")
    suspend fun aiPromptsCreate(@Body aiCreatePromptInput: AiCreatePromptInput): Response<AiPromptMutationResult>

    /**
     * POST api/2.0/ai/prompts/create-folder
     * Create folder
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsCreateFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
     *
     *
     * @param body 
     * @return [AiFolderMutationResult]
     */
    @POST("api/2.0/ai/prompts/create-folder")
    suspend fun aiPromptsCreateFolder(@Body body: kotlin.String): Response<AiFolderMutationResult>

    /**
     * DELETE api/2.0/ai/prompts/delete
     * Delete
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/prompts/delete", hasBody = true)
    suspend fun aiPromptsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/prompts/delete-folder
     * Delete folder
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsDeleteFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/prompts/delete-folder", hasBody = true)
    suspend fun aiPromptsDeleteFolder(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/prompts/export
     * Export
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsExport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-export/
     *
     *
     * @return [AiPromptBundle]
     */
    @GET("api/2.0/ai/prompts/export")
    suspend fun aiPromptsExport(): Response<AiPromptBundle>

    /**
     * GET api/2.0/ai/prompts/get-by-id
     * Get by id
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsGetById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
     *
     *
     * @param id 
     * @return [AiPrompt]
     */
    @GET("api/2.0/ai/prompts/get-by-id")
    suspend fun aiPromptsGetById(@Query("id") id: kotlin.String): Response<AiPrompt>

    /**
     * GET api/2.0/ai/prompts/get-folder-by-id
     * Get folder by id
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsGetFolderById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
     *
     *
     * @param id 
     * @return [AiPromptFolder]
     */
    @GET("api/2.0/ai/prompts/get-folder-by-id")
    suspend fun aiPromptsGetFolderById(@Query("id") id: kotlin.String): Response<AiPromptFolder>

    /**
     * POST api/2.0/ai/prompts/import-bundle
     * Import bundle
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsImportBundle Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-import-bundle/
     *
     *
     * @param aiPromptsImportBundleRequest 
     * @return [AiImportResult]
     */
    @POST("api/2.0/ai/prompts/import-bundle")
    suspend fun aiPromptsImportBundle(@Body aiPromptsImportBundleRequest: AiPromptsImportBundleRequest): Response<AiImportResult>

    /**
     * GET api/2.0/ai/prompts/list
     * List
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
     *
     *
     * @param folderId 
     * @return [kotlin.collections.List<AiPrompt>]
     */
    @GET("api/2.0/ai/prompts/list")
    suspend fun aiPromptsList(@Query("folderId") folderId: kotlin.String): Response<kotlin.collections.List<AiPrompt>>

    /**
     * GET api/2.0/ai/prompts/list-folders
     * List folders
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsListFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list-folders/
     *
     *
     * @return [kotlin.collections.List<AiPromptFolder>]
     */
    @GET("api/2.0/ai/prompts/list-folders")
    suspend fun aiPromptsListFolders(): Response<kotlin.collections.List<AiPromptFolder>>

    /**
     * PUT api/2.0/ai/prompts/move
     * Move
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsMove Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-move/
     *
     *
     * @param aiPromptsMoveRequest 
     * @return [AiPromptMutationResult]
     */
    @PUT("api/2.0/ai/prompts/move")
    suspend fun aiPromptsMove(@Body aiPromptsMoveRequest: AiPromptsMoveRequest): Response<AiPromptMutationResult>

    /**
     * PUT api/2.0/ai/prompts/rename-folder
     * Rename folder
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsRenameFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-rename-folder/
     *
     *
     * @param aiPromptsRenameFolderRequest 
     * @return [AiFolderMutationResult]
     */
    @PUT("api/2.0/ai/prompts/rename-folder")
    suspend fun aiPromptsRenameFolder(@Body aiPromptsRenameFolderRequest: AiPromptsRenameFolderRequest): Response<AiFolderMutationResult>

    /**
     * PUT api/2.0/ai/prompts/update
     * Update
     * 
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPromptsUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-update/
     *
     *
     * @param aiPromptsUpdateRequest 
     * @return [AiPromptMutationResult]
     */
    @PUT("api/2.0/ai/prompts/update")
    suspend fun aiPromptsUpdate(@Body aiPromptsUpdateRequest: AiPromptsUpdateRequest): Response<AiPromptMutationResult>

}
