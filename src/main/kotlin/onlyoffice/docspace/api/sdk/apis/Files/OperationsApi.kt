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


package onlyoffice.docspace.api.sdk.apis.Files

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto
import onlyoffice.docspace.api.sdk.models.BatchRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CheckConversionRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.CheckDestFolderWrapper
import onlyoffice.docspace.api.sdk.models.ChunkedUploadSessionResponseIntegerWrapper
import onlyoffice.docspace.api.sdk.models.ChunkedUploadSessionResponseWrapperIntegerWrapper
import onlyoffice.docspace.api.sdk.models.ConversationResultArrayWrapper
import onlyoffice.docspace.api.sdk.models.DeleteBatchRequestDto
import onlyoffice.docspace.api.sdk.models.DeleteVersionBatchRequestDto
import onlyoffice.docspace.api.sdk.models.DownloadRequestDto
import onlyoffice.docspace.api.sdk.models.DuplicateRequestDto
import onlyoffice.docspace.api.sdk.models.FileEntryBaseArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationType
import onlyoffice.docspace.api.sdk.models.FileOperationWrapper
import onlyoffice.docspace.api.sdk.models.SessionRequest
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UpdateComment
import onlyoffice.docspace.api.sdk.models.UploadSessionResponseIntegerWrapper

import onlyoffice.docspace.api.sdk.models.*

import okhttp3.MultipartBody

interface OperationsApi {
    /**
     * DELETE api/2.0/files/{folderId}/session/{sessionId}
     * Aborts an in-progress file upload session.
     * This method allows users to cancel an ongoing upload session identified by the session ID.  Once the session is aborted, the associated resources will be cleaned up, and the session will no longer accept further uploads.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for abortUploadSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/abort-upload-session/
     *
     *
     * @param sessionId The session ID.
     * @param folderId The folder ID.
     * @return [Unit]
     */
    @DELETE("api/2.0/files/{folderId}/session/{sessionId}")
    suspend fun abortUploadSession(@Path("sessionId") sessionId: kotlin.String, @Path("folderId") folderId: kotlin.Int): Response<Unit>

    /**
     * POST api/2.0/files/favorites
     * Add favorite files and folders
     * Adds files and folders with the IDs specified in the request to the favorite list.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: You don't have enough permission to perform the operation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for addFavorites Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-favorites/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/files/favorites")
    suspend fun addFavorites(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/fileops/bulkdownload
     * Bulk download
     * Starts the download process of files and folders with the IDs specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to download
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for bulkDownload Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/bulk-download/
     *
     *
     * @param downloadRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/bulkdownload")
    suspend fun bulkDownload(@Body downloadRequestDto: DownloadRequestDto? = null): Response<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/checkconversion
     * Get conversion status
     * Checks the conversion status of a file with the ID specified in the request.
     * Responses:
     *  - 200: Conversion result
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for checkConversionStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-conversion-status/
     *
     *
     * @param fileId The file ID to check conversion status.
     * @param start Specifies whether a conversion operation is started or not. (optional)
     * @return [ConversationResultArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/checkconversion")
    suspend fun checkConversionStatus(@Path("fileId") fileId: kotlin.Int, @Query("start") start: kotlin.Boolean? = null): Response<ConversationResultArrayWrapper>

    /**
     * GET api/2.0/files/fileops/move
     * Move or copy files to a folder
     * Checks if files or folders can be moved or copied to the specified folder, moves or copies them, and returns their information.
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for checkMoveOrCopyBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-batch-items/
     *
     *
     * @param inDto The request parameters for copying/moving files. (optional)
     * @return [FileEntryBaseArrayWrapper]
     */
    @GET("api/2.0/files/fileops/move")
    suspend fun checkMoveOrCopyBatchItems(@Query("inDto") inDto: BatchRequestDto? = null): Response<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/fileops/checkdestfolder
     * Check for moving or copying files to a folder
     * Checks if files can be moved or copied to the specified folder.
     * Responses:
     *  - 200: Result
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for checkMoveOrCopyDestFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-move-or-copy-dest-folder/
     *
     *
     * @param inDto The request parameters for copying/moving files. (optional)
     * @return [CheckDestFolderWrapper]
     */
    @GET("api/2.0/files/fileops/checkdestfolder")
    suspend fun checkMoveOrCopyDestFolder(@Query("inDto") inDto: BatchRequestDto? = null): Response<CheckDestFolderWrapper>

    /**
     * PUT api/2.0/files/fileops/copy
     * Copy to the folder
     * Copies all the selected files and folders to the folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to copy
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for copyBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-batch-items/
     *
     *
     * @param batchRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/copy")
    suspend fun copyBatchItems(@Body batchRequestDto: BatchRequestDto? = null): Response<FileOperationArrayWrapper>

    /**
     * POST api/2.0/files/{folderId}/upload/create_session
     * Chunked upload
     * Creates the session to upload large files in multiple chunks to the folder with the ID specified in the request.
     * Responses:
     *  - 200: Information about created session
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createUploadSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session/
     *
     *
     * @param folderId The session folder ID.
     * @param sessionRequest The session parameters.
     * @return [ChunkedUploadSessionResponseWrapperIntegerWrapper]
     */
    @Deprecated("This api was deprecated")
    @POST("api/2.0/files/{folderId}/upload/create_session")
    suspend fun createUploadSession(@Path("folderId") folderId: kotlin.Int, @Body sessionRequest: SessionRequest): Response<ChunkedUploadSessionResponseWrapperIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/session
     * Creates a session for uploading a file to a specific folder in chunks.
     * The session allows the user to upload a file in smaller chunks to the folder identified by its ID.  The file information, such as name, size, and additional metadata, must be provided in the request.  This method facilitates large file upload scenarios by enabling chunked file uploads.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createUploadSessionInFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-upload-session-in-folder/
     *
     *
     * @param folderId The session folder ID.
     * @param sessionRequest The session parameters.
     * @return [ChunkedUploadSessionResponseIntegerWrapper]
     */
    @POST("api/2.0/files/{folderId}/session")
    suspend fun createUploadSessionInFolder(@Path("folderId") folderId: kotlin.Int, @Body sessionRequest: SessionRequest): Response<ChunkedUploadSessionResponseIntegerWrapper>

    /**
     * PUT api/2.0/files/fileops/delete
     * Delete files and folders
     * Deletes the files and folders with the IDs specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to delete
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-batch-items/
     *
     *
     * @param deleteBatchRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/delete")
    suspend fun deleteBatchItems(@Body deleteBatchRequestDto: DeleteBatchRequestDto? = null): Response<FileOperationArrayWrapper>

    /**
     * DELETE api/2.0/files/favorites
     * Delete favorite files and folders (using body parameters)
     * Removes files and folders with the IDs specified in the request from the favorite list. This method uses the body parameters.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteFavoritesFromBody Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-favorites-from-body/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/files/favorites", hasBody = true)
    suspend fun deleteFavoritesFromBody(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/fileops/deleteversion
     * Delete file versions
     * Deletes the file versions with the IDs specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteFileVersions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file-versions/
     *
     *
     * @param deleteVersionBatchRequestDto  (optional)
     * @return [FileOperationWrapper]
     */
    @PUT("api/2.0/files/fileops/deleteversion")
    suspend fun deleteFileVersions(@Body deleteVersionBatchRequestDto: DeleteVersionBatchRequestDto? = null): Response<FileOperationWrapper>

    /**
     * PUT api/2.0/files/fileops/duplicate
     * Duplicate files and folders
     * Duplicates all the selected files and folders.
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to duplicate
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for duplicateBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/duplicate-batch-items/
     *
     *
     * @param duplicateRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/duplicate")
    suspend fun duplicateBatchItems(@Body duplicateRequestDto: DuplicateRequestDto? = null): Response<FileOperationArrayWrapper>


    /**
    * enum for parameter folderType
    */
    enum class FolderTypeEmptyTrash(val value: kotlin.Int) {
        @Json(name = "0") DEFAULT(0),
        @Json(name = "1") COMMON(1),
        @Json(name = "2") BUNCH(2),
        @Json(name = "3") TRASH(3),
        @Json(name = "5") USER(5),
        @Json(name = "6") SHARE(6),
        @Json(name = "8") Projects(8),
        @Json(name = "10") Favorites(10),
        @Json(name = "11") Recent(11),
        @Json(name = "12") Templates(12),
        @Json(name = "13") Privacy(13),
        @Json(name = "14") VirtualRooms(14),
        @Json(name = "15") FillingFormsRoom(15),
        @Json(name = "16") EditingRoom(16),
        @Json(name = "19") CustomRoom(19),
        @Json(name = "20") Archive(20),
        @Json(name = "21") ThirdpartyBackup(21),
        @Json(name = "22") PublicRoom(22),
        @Json(name = "25") ReadyFormFolder(25),
        @Json(name = "26") InProcessFormFolder(26),
        @Json(name = "27") FormFillingFolderDone(27),
        @Json(name = "28") FormFillingFolderInProgress(28),
        @Json(name = "29") VirtualDataRoom(29),
        @Json(name = "30") RoomTemplates(30),
        @Json(name = "31") AiRoom(31),
        @Json(name = "32") Knowledge(32),
        @Json(name = "33") ResultStorage(33),
        @Json(name = "34") AiAgents(34),
        @Json(name = "35") DefaultTemplates(35),
        @Json(name = "36") Forms(36)
    }

    /**
     * PUT api/2.0/files/fileops/emptytrash
     * Empty the Trash folder
     * Deletes all the files and folders from the Trash folder. If the folder types are specified, only the items originally located in the sections of these types are deleted.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for emptyTrash Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/empty-trash/
     *
     *
     * @param single Specifies whether to return only the current operation (optional)
     * @param folderType The parent folder types used to empty the trash only from the items originally located in the sections of the specified types. (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/emptytrash")
    suspend fun emptyTrash(@Query("Single") single: kotlin.Boolean? = null, @Query("folderType") folderType: @JvmSuppressWildcards kotlin.collections.List<kotlin.Int>? = null): Response<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/{folderId}/session/{sessionId}/finalize
     * Finalize an upload session
     * Finalizes the upload session by processing the uploaded file chunks and marking the upload as complete.  This method consolidates chunked uploads into a complete file if required, sends notifications about the upload event,  and performs any additional cleanup or related actions, such as socket updates and webhook publishing.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for finalizeSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/finalize-session/
     *
     *
     * @param folderId The folder ID.
     * @param sessionId The session ID.
     * @return [UploadSessionResponseIntegerWrapper]
     */
    @PUT("api/2.0/files/{folderId}/session/{sessionId}/finalize")
    suspend fun finalizeSession(@Path("folderId") folderId: kotlin.Int, @Path("sessionId") sessionId: kotlin.String): Response<UploadSessionResponseIntegerWrapper>

    /**
     * GET api/2.0/files/fileops
     * Get active file operations
     * Returns a list of all the active file operations.
     * Responses:
     *  - 200: List of file operations
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getOperationStatuses Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses/
     *
     *
     * @param id The ID of the file operation. (optional)
     * @return [FileOperationArrayWrapper]
     */
    @GET("api/2.0/files/fileops")
    suspend fun getOperationStatuses(@Query("id") id: kotlin.String? = null): Response<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/fileops/{operationType}
     * Get file operation statuses
     * Retrieves the statuses of operations filtered by the specified operation type.
     * Responses:
     *  - 200: List of file operations
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getOperationStatusesByType Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-operation-statuses-by-type/
     *
     *
     * @param operationType Specifies the type of file operation to be retrieved.
     * @param id The ID of the file operation. (optional)
     * @return [FileOperationArrayWrapper]
     */
    @GET("api/2.0/files/fileops/{operationType}")
    suspend fun getOperationStatusesByType(@Path("operationType") operationType: FileOperationType, @Query("id") id: kotlin.String? = null): Response<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/markasread
     * Mark as read
     * Marks the files and folders with the IDs specified in the request as read.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for markAsRead Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/mark-as-read/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/markasread")
    suspend fun markAsRead(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/move
     * Move or copy to a folder
     * Moves or copies all the selected files and folders to the folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 403: You don't have enough permission to move
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for moveBatchItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-batch-items/
     *
     *
     * @param batchRequestDto  (optional)
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/move")
    suspend fun moveBatchItems(@Body batchRequestDto: BatchRequestDto? = null): Response<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/checkconversion
     * Start file conversion
     * Starts a conversion operation of a file with the ID specified in the request.
     * Responses:
     *  - 200: Conversion result
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startFileConversion Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-file-conversion/
     *
     *
     * @param fileId The file ID to start conversion proccess.
     * @param checkConversionRequestDtoInteger The parameters for checking file conversion. (optional)
     * @return [ConversationResultArrayWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/checkconversion")
    suspend fun startFileConversion(@Path("fileId") fileId: kotlin.Int, @Body checkConversionRequestDtoInteger: CheckConversionRequestDtoInteger? = null): Response<ConversationResultArrayWrapper>

    /**
     * PUT api/2.0/files/fileops/terminate/{id}
     * Finish active operations
     * Finishes an operation with the ID specified in the request or all the active operations.
     * Responses:
     *  - 200: List of file operations
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateTasks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tasks/
     *
     *
     * @param id The operation unique identifier.
     * @return [FileOperationArrayWrapper]
     */
    @PUT("api/2.0/files/fileops/terminate/{id}")
    suspend fun terminateTasks(@Path("id") id: kotlin.String): Response<FileOperationArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/comment
     * Update a comment
     * Updates a comment in a file with the ID specified in the request.
     * Responses:
     *  - 200: Updated comment
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateFileComment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file-comment/
     *
     *
     * @param fileId The file ID where the comment is located.
     * @param updateComment The parameters for updating a comment.
     * @return [StringWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/comment")
    suspend fun updateFileComment(@Path("fileId") fileId: kotlin.Int, @Body updateComment: UpdateComment): Response<StringWrapper>

    /**
     * POST api/2.0/files/{folderId}/session/{sessionId}/upload
     * Handles the upload of a chunk for an existing upload session.
     * This method allows the caller to upload a specific chunk of a file to an ongoing upload session.  The session is identified by the session ID provided in the request. The chunk can be of any size  within the limits allowed during the session initialization. Each chunk must be uploaded in the  correct order for the server to process it appropriately.  The server updates the upload session status and stores the progress information after processing  each chunk. The updated session details are returned in the response.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for uploadAsyncSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-async-session/
     *
     *
     * @param folderId The folder ID.
     * @param sessionId The upload session ID.
     * @param chunkNumber The chunk number. (optional)
     * @param file The file chunk to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file chunk content from the HTTP request form for chunked upload operations.  The file chunk is accessed via the IFormFile interface which provides access to the chunk content and length. (optional)
     * @return [ChunkedUploadSessionResponseIntegerWrapper]
     */
    @Multipart
    @POST("api/2.0/files/{folderId}/session/{sessionId}/upload")
    suspend fun uploadAsyncSession(@Path("folderId") folderId: kotlin.Int, @Path("sessionId") sessionId: kotlin.String, @Query("ChunkNumber") chunkNumber: kotlin.Int? = null, @Part file: MultipartBody.Part? = null): Response<ChunkedUploadSessionResponseIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/session/{sessionId}
     * Resumes an ongoing file upload session for uploading additional chunks of data.
     * This method allows continuing an interrupted or partially completed file upload session by uploading subsequent data chunks.  The server will validate each uploaded chunk, update the session state, and respond with the status of the current upload. Once  the total bytes uploaded match the total file size, the file upload process is finalized and related events are triggered.  If the file is newly uploaded, the server responds with a 201 Created status upon completion. If it overwrites an existing file,  versioning information is updated accordingly. The method also triggers associated webhooks and socket notifications to reflect  the updated file state.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for uploadSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-session/
     *
     *
     * @param folderId The folder ID.
     * @param sessionId The upload session ID.
     * @param file The file to be uploaded as part of the multipart/form-data request.  This property represents the uploaded file content from the HTTP request form.  The file is accessed via the IFormFile interface which provides access to the file name, content type, length, and stream. (optional)
     * @return [UploadSessionResponseIntegerWrapper]
     */
    @Multipart
    @POST("api/2.0/files/{folderId}/session/{sessionId}")
    suspend fun uploadSession(@Path("folderId") folderId: kotlin.Int, @Path("sessionId") sessionId: kotlin.String, @Part file: MultipartBody.Part? = null): Response<UploadSessionResponseIntegerWrapper>

}
