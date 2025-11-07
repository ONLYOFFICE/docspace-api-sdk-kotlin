 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto
import onlyoffice.docspace.api.sdk.models.BatchRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CheckConversionRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.CheckDestFolderWrapper
import onlyoffice.docspace.api.sdk.models.ConversationResultArrayWrapper
import onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDto
import onlyoffice.docspace.api.sdk.models.DeleteVersionBatchRequestDto
import onlyoffice.docspace.api.sdk.models.DownloadRequestDto
import onlyoffice.docspace.api.sdk.models.DuplicateRequestDto
import onlyoffice.docspace.api.sdk.models.FileEntryBaseArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationType
import onlyoffice.docspace.api.sdk.models.FileOperationWrapper
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.SessionRequest
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UpdateComment

import onlyoffice.docspace.api.sdk.models.*

interface OperationsApi {
    /**
     * POST api/2.0/files/favorites
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: You don't have enough permission to perform the operation
     *
     * REST API Reference for addFavorites Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/files/favorites")
    fun addFavorites(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/fileops/bulkdownload
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to download
     *
     * REST API Reference for bulkDownload Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/
     *
     *
     * @param downloadRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/bulkdownload")
    fun bulkDownload(@Body downloadRequestDto: DownloadRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/checkconversion
     * 
     * 
     * Responses:
     *  - 200: Conversion result
     *
     * REST API Reference for checkConversionStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
     *
     *
     * @param fileId The file ID to check conversion status.
     * @param start Specifies whether a conversion operation is started or not. (optional)
     * @return [Call]<[ConversationResultArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/checkconversion")
    fun checkConversionStatus(@Path("fileId") fileId: kotlin.Int, @Query("start") start: kotlin.Boolean? = null): Call<ConversationResultArrayWrapper>

    /**
     * GET api/2.0/files/fileops/move
     * 
     * 
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for checkMoveOrCopyBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
     *
     *
     * @param inDto The request parameters for copying/moving files. (optional)
     * @return [Call]<[FileEntryBaseArrayWrapper]>
     */
    @GET("api/2.0/files/fileops/move")
    fun checkMoveOrCopyBatchItems(@Query("inDto") inDto: BatchRequestDto? = null): Call<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/fileops/checkdestfolder
     * 
     * 
     * Responses:
     *  - 200: Result
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for checkMoveOrCopyDestFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
     *
     *
     * @param inDto The request parameters for copying/moving files. (optional)
     * @return [Call]<[CheckDestFolderWrapper]>
     */
    @GET("api/2.0/files/fileops/checkdestfolder")
    fun checkMoveOrCopyDestFolder(@Query("inDto") inDto: BatchRequestDto? = null): Call<CheckDestFolderWrapper>

    /**
     * PUT api/2.0/files/fileops/copy
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to copy
     *
     * REST API Reference for copyBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/
     *
     *
     * @param batchRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/copy")
    fun copyBatchItems(@Body batchRequestDto: BatchRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * POST api/2.0/files/{folderId}/upload/create_session
     * 
     * 
     * Responses:
     *  - 200: Information about created session
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for createUploadSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
     *
     *
     * @param folderId The session folder ID.
     * @param sessionRequest The session parameters.
     * @return [Call]<[ObjectWrapper]>
     */
    @POST("api/2.0/files/{folderId}/upload/create_session")
    fun createUploadSession(@Path("folderId") folderId: kotlin.Int, @Body sessionRequest: SessionRequest): Call<ObjectWrapper>

    /**
     * PUT api/2.0/files/fileops/delete
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to delete
     *
     * REST API Reference for deleteBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/
     *
     *
     * @param deleteBatchRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/delete")
    fun deleteBatchItems(@Body deleteBatchRequestDto: DeleteBatchRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * DELETE api/2.0/files/favorites
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for deleteFavoritesFromBody Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @DELETE("api/2.0/files/favorites")
    fun deleteFavoritesFromBody(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/fileops/deleteversion
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for deleteFileVersions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
     *
     *
     * @param deleteVersionBatchRequestDto  (optional)
     * @return [Call]<[FileOperationWrapper]>
     */
    @PUT("api/2.0/files/fileops/deleteversion")
    fun deleteFileVersions(@Body deleteVersionBatchRequestDto: DeleteVersionBatchRequestDto? = null): Call<FileOperationWrapper>

    /**
     * PUT api/2.0/files/fileops/duplicate
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to duplicate
     *
     * REST API Reference for duplicateBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/
     *
     *
     * @param duplicateRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/duplicate")
    fun duplicateBatchItems(@Body duplicateRequestDto: DuplicateRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/emptytrash
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for emptyTrash Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
     *
     *
     * @param single Specifies whether to return only the current operation (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/emptytrash")
    fun emptyTrash(@Query("Single") single: kotlin.Boolean? = null): Call<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/fileops
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for getOperationStatuses Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
     *
     *
     * @param id The ID of the file operation. (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @GET("api/2.0/files/fileops")
    fun getOperationStatuses(@Query("id") id: kotlin.String? = null): Call<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/fileops/{operationType}
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for getOperationStatusesByType Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
     *
     *
     * @param operationType Specifies the type of file operation to be retrieved.
     * @param id The ID of the file operation. (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @GET("api/2.0/files/fileops/{operationType}")
    fun getOperationStatusesByType(@Path("operationType") operationType: FileOperationType, @Query("id") id: kotlin.String? = null): Call<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/markasread
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for markAsRead Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/markasread")
    fun markAsRead(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/move
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to move
     *
     * REST API Reference for moveBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/
     *
     *
     * @param batchRequestDto  (optional)
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/move")
    fun moveBatchItems(@Body batchRequestDto: BatchRequestDto? = null): Call<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/checkconversion
     * 
     * 
     * Responses:
     *  - 200: Conversion result
     *
     * REST API Reference for startFileConversion Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
     *
     *
     * @param fileId The file ID to start conversion proccess.
     * @param checkConversionRequestDtoInteger The parameters for checking file conversion. (optional)
     * @return [Call]<[ConversationResultArrayWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/checkconversion")
    fun startFileConversion(@Path("fileId") fileId: kotlin.Int, @Body checkConversionRequestDtoInteger: CheckConversionRequestDtoInteger? = null): Call<ConversationResultArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/terminate/{id}
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for terminateTasks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
     *
     *
     * @param id The operation unique identifier.
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @PUT("api/2.0/files/fileops/terminate/{id}")
    fun terminateTasks(@Path("id") id: kotlin.String): Call<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/comment
     * 
     * 
     * Responses:
     *  - 200: Updated comment
     *
     * REST API Reference for updateFileComment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
     *
     *
     * @param fileId The file ID where the comment is located.
     * @param updateComment The parameters for updating a comment.
     * @return [Call]<[StringWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/comment")
    fun updateFileComment(@Path("fileId") fileId: kotlin.Int, @Body updateComment: UpdateComment): Call<StringWrapper>

}
