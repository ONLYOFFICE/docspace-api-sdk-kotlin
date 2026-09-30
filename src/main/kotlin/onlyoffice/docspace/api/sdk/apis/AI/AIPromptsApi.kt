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
     * Save a prompt
     * Saves a new prompt in the caller's own prompt library and returns it. The name has to be non-empty and unique inside its folder, and `folderId` has to name an existing folder - omit it to save the prompt at the root. Prompts are per-user: another user's library is never visible here, and no permission beyond having AI enabled is needed. The answer carries the stored prompt including the ID to use with the update, move and delete operations.
     * Responses:
     *  - 200: Whether the prompt was saved, with it in `prompt`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Creates a folder in the caller's prompt library and returns it. The name has to be non-empty and unique across that library. Folders do not nest: there is one flat level, so a folder cannot be created inside another. The answer carries the folder ID to use as `folderId` when saving or moving prompts.
     * Responses:
     *  - 200: Whether the folder was created, with it in `folder`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsCreateFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-create-folder/
     *
     *
     * @param body The name of the folder to create, as a bare JSON string.
     * @return [AiFolderMutationResult]
     */
    @POST("api/2.0/ai/prompts/create-folder")
    suspend fun aiPromptsCreateFolder(@Body body: kotlin.String): Response<AiFolderMutationResult>

    /**
     * DELETE api/2.0/ai/prompts/delete
     * Delete a saved prompt
     * Deletes one saved prompt from the caller's library. The ID may be sent in the body or as a query parameter, and it is required. An ID that does not exist, or that belongs to another user, is not reported: the call answers success without deleting anything. The deletion is permanent.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not a prompt was deleted.
     *  - 400: The prompt ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete/
     *
     *
     * @param body The ID of the prompt to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/prompts/delete", hasBody = true)
    suspend fun aiPromptsDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * DELETE api/2.0/ai/prompts/delete-folder
     * Delete folder
     * Deletes a folder together with every prompt inside it, permanently. The ID is required and may be sent in the body or as a query parameter. Unlike deleting a prompt, this checks first: a folder that does not exist, and one that belongs to another user, both answer 404 - the two cases are deliberately indistinguishable, so a foreign folder cannot be probed. Move the prompts out with `PUT api/2.0/ai/prompts/move` first if they should survive.
     * Responses:
     *  - 200: Confirms the folder and the prompts inside it are gone.
     *  - 400: The folder ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No prompt folder has this ID.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsDeleteFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-delete-folder/
     *
     *
     * @param body The ID of the folder to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/prompts/delete-folder", hasBody = true)
    suspend fun aiPromptsDeleteFolder(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/prompts/export
     * Export the prompt library
     * Builds a versioned bundle of every prompt and folder in the caller's library and returns it, with no parameters. The bundle is self-contained: it carries its own format version so an older export can still be read back, and it is the input `POST api/2.0/ai/prompts/import-bundle` expects. This is also the only way to read the whole library at once, since listing is folder-scoped. Nothing is changed by the call.
     * Responses:
     *  - 200: The whole library as a versioned bundle, ready to import.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Get a saved prompt
     * Returns one saved prompt by its ID. The ID is required and is read from the query. An ID that is unknown, or that belongs to another user, is not reported as 404: the answer is an empty body with status 200, so treat a missing payload as no such prompt. Prompt IDs come from `GET api/2.0/ai/prompts/list` or from the answer of the create operation.
     * Responses:
     *  - 200: The prompt, or an empty body when no prompt of the caller's has that ID.
     *  - 400: The prompt ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsGetById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-by-id/
     *
     *
     * @param id The saved prompt identifier.
     * @return [AiPrompt]
     */
    @GET("api/2.0/ai/prompts/get-by-id")
    suspend fun aiPromptsGetById(@Query("id") id: kotlin.String): Response<AiPrompt>

    /**
     * GET api/2.0/ai/prompts/get-folder-by-id
     * Get a prompt folder
     * Returns one folder of the caller's prompt library by its ID, without the prompts inside it. The ID is required and is read from the query. An unknown or foreign ID is not reported as 404: the answer is an empty body with status 200. This differs from the delete operation on the same ID, which does answer 404.
     * Responses:
     *  - 200: The folder, or an empty body when no folder of the caller's has that ID.
     *  - 400: The folder ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsGetFolderById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-get-folder-by-id/
     *
     *
     * @param id The prompt folder identifier.
     * @return [AiPromptFolder]
     */
    @GET("api/2.0/ai/prompts/get-folder-by-id")
    suspend fun aiPromptsGetFolderById(@Query("id") id: kotlin.String): Response<AiPromptFolder>

    /**
     * POST api/2.0/ai/prompts/import-bundle
     * Import bundle
     * Writes a bundle produced by `GET api/2.0/ai/prompts/export` back into the caller's library. `mode` decides how: `replace` deletes the current prompts and folders before writing, and `merge` writes the bundle on top of what is already there. The folder references inside the bundle are validated before anything is written, so a corrupt bundle is rejected whole rather than applied halfway. `replace` is destructive and cannot be undone - export first if the current library matters.
     * Responses:
     *  - 200: Whether the bundle was written, how many prompts it imported, and what was refused.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * List saved prompts
     * Lists the caller's saved prompts, newest first. `folderId` scopes the answer to one folder, and omitting it - or sending it empty - lists the prompts that sit at the root rather than every prompt, because the client fetcher cannot tell an absent value from a null one. There is therefore no way to ask for the whole library in one call: walk the folders from `GET api/2.0/ai/prompts/list-folders`, or take everything at once with `GET api/2.0/ai/prompts/export`. The prompts of other users are never included.
     * Responses:
     *  - 200: The prompts of the scope, newest first.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPromptsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-prompts-list/
     *
     *
     * @param folderId The prompt folder identifier. Omit to list the prompts that sit outside any folder. (optional)
     * @return [kotlin.collections.List<AiPrompt>]
     */
    @GET("api/2.0/ai/prompts/list")
    suspend fun aiPromptsList(@Query("folderId") folderId: kotlin.String? = null): Response<kotlin.collections.List<AiPrompt>>

    /**
     * GET api/2.0/ai/prompts/list-folders
     * List folders
     * Lists every folder of the caller's prompt library, newest first, with no parameters and no pagination. Folders are flat, so the answer is a single list rather than a tree. The prompts inside them are not included - read those with `GET api/2.0/ai/prompts/list` per folder. Another user's folders are never listed.
     * Responses:
     *  - 200: Every folder of the caller's library, newest first.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Move a prompt to a folder
     * Moves a saved prompt into another folder, or to the root when `folderId` is omitted or null. The name is re-validated in the target folder, so the move fails when a prompt of that name already sits there - rename it first with `PUT api/2.0/ai/prompts/update`. Nothing about the prompt other than its folder changes. The answer carries the moved prompt.
     * Responses:
     *  - 200: Whether the prompt was moved, with the moved prompt in `prompt`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Renames a folder in the caller's prompt library, validating the new name against the folders already there. The prompts inside it are untouched and keep their IDs. The answer carries the renamed folder. A name that another folder already uses is rejected.
     * Responses:
     *  - 200: Whether the folder was renamed, with the stored folder in `folder`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Update a saved prompt
     * Changes a saved prompt and returns the stored result. Only the fields present in `updates` are written, so a partial object leaves the rest of the prompt alone. The name and the folder reference are re-validated whenever either changes, which means an update can fail on a name another prompt in the same folder already uses. Use `PUT api/2.0/ai/prompts/move` to change only the folder.
     * Responses:
     *  - 200: Whether the prompt was updated, with the stored prompt in `prompt`.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
