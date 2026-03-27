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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ChangeHistory
import onlyoffice.docspace.api.sdk.models.CheckFillFormDraft
import onlyoffice.docspace.api.sdk.models.ChunkedUploadSessionResponseWrapperIntegerWrapper
import onlyoffice.docspace.api.sdk.models.ConfigurationIntegerWrapper
import onlyoffice.docspace.api.sdk.models.CopyAsJsonElement
import onlyoffice.docspace.api.sdk.models.CreateFileJsonElement
import onlyoffice.docspace.api.sdk.models.CreateTextOrHtmlFile
import onlyoffice.docspace.api.sdk.models.CustomFilterParameters
import onlyoffice.docspace.api.sdk.models.Delete
import onlyoffice.docspace.api.sdk.models.EditHistoryArrayWrapper
import onlyoffice.docspace.api.sdk.models.EditHistoryDataWrapper
import onlyoffice.docspace.api.sdk.models.EditorType
import onlyoffice.docspace.api.sdk.models.FileEntryBaseWrapper
import onlyoffice.docspace.api.sdk.models.FileEntryIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FileLinkRequest
import onlyoffice.docspace.api.sdk.models.FileLinkWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileReferenceWrapper
import onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileShareWrapper
import onlyoffice.docspace.api.sdk.models.FillingFormResultIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FormRoleArrayWrapper
import onlyoffice.docspace.api.sdk.models.FormSubmissionsWrapper
import onlyoffice.docspace.api.sdk.models.GetReferenceDataDtoInteger
import onlyoffice.docspace.api.sdk.models.HistoryArrayWrapper
import onlyoffice.docspace.api.sdk.models.KeyValuePairBooleanStringWrapper
import onlyoffice.docspace.api.sdk.models.LockFileParameters
import onlyoffice.docspace.api.sdk.models.ManageFormFillingDtoInteger
import onlyoffice.docspace.api.sdk.models.MentionWrapperArrayWrapper
import onlyoffice.docspace.api.sdk.models.NoContentResultWrapper
import onlyoffice.docspace.api.sdk.models.ObjectArrayWrapper
import onlyoffice.docspace.api.sdk.models.OrderRequestDto
import onlyoffice.docspace.api.sdk.models.OrdersRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.SaveAsPdfInteger
import onlyoffice.docspace.api.sdk.models.SaveFormRoleMappingDtoInteger
import onlyoffice.docspace.api.sdk.models.StartEdit
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TemplatesRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateFile

import okhttp3.MultipartBody

interface FilesApi {
    /**
     * POST api/2.0/files/file/{fileId}/recent
     * Add a file to the Recent section
     * Adds a file with the ID specified in the request to the Recent section.
     * Responses:
     *  - 200: New file information
     *  - 401: Unauthorized
     *
     * REST API Reference for addFileToRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/
     *
     *
     * @param fileId The file unique identifier.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/recent")
    suspend fun addFileToRecent(@Path("fileId") fileId: kotlin.Int): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/templates
     * Add template files
     * Adds files with the IDs specified in the request to the template list.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *
     * REST API Reference for addTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/
     *
     *
     * @param templatesRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/files/templates")
    suspend fun addTemplates(@Body templatesRequestDto: TemplatesRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/history
     * Change version history
     * Changes the version history of a file with the ID specified in the request.
     * Responses:
     *  - 200: Updated information about file versions
     *  - 403: You do not have enough permissions to edit the file
     *  - 401: Unauthorized
     *
     * REST API Reference for changeVersionHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/
     *
     *
     * @param fileId The file Id to change its version history.
     * @param changeHistory The parameters for changing version history.
     * @return [FileIntegerArrayWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/history")
    suspend fun changeVersionHistory(@Path("fileId") fileId: kotlin.Int, @Body changeHistory: ChangeHistory): Response<FileIntegerArrayWrapper>

    /**
     * POST api/2.0/files/masterform/{fileId}/checkfillformdraft
     * Check the form draft filling
     * Checks if the current file is a form draft which can be filled out.
     * Responses:
     *  - 200: Link to the form
     *  - 403: You don't have enough permission to view the file
     *
     * REST API Reference for checkFillFormDraft Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-fill-form-draft/
     *
     *
     * @param fileId The file ID of the form draft.
     * @param checkFillFormDraft The parameters for checking the form draft filling.
     * @return [StringWrapper]
     */
    @POST("api/2.0/files/masterform/{fileId}/checkfillformdraft")
    suspend fun checkFillFormDraft(@Path("fileId") fileId: kotlin.Int, @Body checkFillFormDraft: CheckFillFormDraft): Response<StringWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/copyas
     * Copy a file
     * Copies (and converts if possible) an existing file to the specified folder.
     * Responses:
     *  - 200: Copied file entry information
     *  - 400: No file id or folder id toFolderId determine provider
     *  - 403: You don't have enough permission to create
     *  - 404: File not found
     *  - 401: Unauthorized
     *
     * REST API Reference for copyFileAs Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/
     *
     *
     * @param fileId The file ID to copy.
     * @param copyAsJsonElement The parameters for copying a file.
     * @return [FileEntryBaseWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/copyas")
    suspend fun copyFileAs(@Path("fileId") fileId: kotlin.Int, @Body copyAsJsonElement: CopyAsJsonElement): Response<FileEntryBaseWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/edit_session
     * Create the editing session
     * Creates a session to edit the existing file with multiple chunks (needed for WebDAV).
     * Responses:
     *  - 200: Information about created session
     *  - 403: You don't have enough permission to edit the file
     *  - 401: Unauthorized
     *
     * REST API Reference for createEditSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/
     *
     *
     * @param fileId The file ID.
     * @param fileSize The file size in bytes. (optional)
     * @return [ChunkedUploadSessionResponseWrapperIntegerWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/edit_session")
    suspend fun createEditSession(@Path("fileId") fileId: kotlin.Int, @Query("fileSize") fileSize: kotlin.Long? = null): Response<ChunkedUploadSessionResponseWrapperIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/file
     * Create a file
     * Creates a new file in the specified folder with the title specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 401: Unauthorized
     *
     * REST API Reference for createFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/
     *
     *
     * @param folderId The folder ID for the file creation.
     * @param createFileJsonElement The parameters for creating a file.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/{folderId}/file")
    suspend fun createFile(@Path("folderId") folderId: kotlin.Int, @Body createFileJsonElement: CreateFileJsonElement): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/file
     * Create a file in the My documents section
     * Creates a new file in the My documents section with the title specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 401: Unauthorized
     *
     * REST API Reference for createFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/
     *
     *
     * @param createFileJsonElement  (optional)
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/@my/file")
    suspend fun createFileInMyDocuments(@Body createFileJsonElement: CreateFileJsonElement? = null): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{id}/link
     * Create primary external link
     * Creates a primary external link by the identifier specified in the request.
     * Responses:
     *  - 200: File security information
     *  - 404: Not Found
     *  - 401: Unauthorized
     *
     * REST API Reference for createFilePrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/
     *
     *
     * @param id The file ID.
     * @param fileLinkRequest The file external link parameters.
     * @return [FileShareWrapper]
     */
    @POST("api/2.0/files/file/{id}/link")
    suspend fun createFilePrimaryExternalLink(@Path("id") id: kotlin.Int, @Body fileLinkRequest: FileLinkRequest): Response<FileShareWrapper>

    /**
     * POST api/2.0/files/{folderId}/html
     * Create an HTML file
     * Creates an HTML (.html) file in the selected folder with the title and contents specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *
     * REST API Reference for createHtmlFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/
     *
     *
     * @param folderId The folder ID to create the text or HTML file.
     * @param createTextOrHtmlFile The parameters for creating an HTML or text file.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/{folderId}/html")
    suspend fun createHtmlFile(@Path("folderId") folderId: kotlin.Int, @Body createTextOrHtmlFile: CreateTextOrHtmlFile): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/html
     * Create an HTML file in the My documents section
     * Creates an HTML (.html) file in the My documents section with the title and contents specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *
     * REST API Reference for createHtmlFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/
     *
     *
     * @param createTextOrHtmlFile  (optional)
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/@my/html")
    suspend fun createHtmlFileInMyDocuments(@Body createTextOrHtmlFile: CreateTextOrHtmlFile? = null): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/text
     * Create a text file
     * Creates a text (.txt) file in the selected folder with the title and contents specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 401: Unauthorized
     *
     * REST API Reference for createTextFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/
     *
     *
     * @param folderId The folder ID to create the text or HTML file.
     * @param createTextOrHtmlFile The parameters for creating an HTML or text file.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/{folderId}/text")
    suspend fun createTextFile(@Path("folderId") folderId: kotlin.Int, @Body createTextOrHtmlFile: CreateTextOrHtmlFile): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/text
     * Create a text file in the My documents section
     * Creates a text (.txt) file in the My documents section with the title and contents specified in the request.
     * Responses:
     *  - 200: New file information
     *  - 401: Unauthorized
     *
     * REST API Reference for createTextFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/
     *
     *
     * @param createTextOrHtmlFile  (optional)
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/@my/text")
    suspend fun createTextFileInMyDocuments(@Body createTextOrHtmlFile: CreateTextOrHtmlFile? = null): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/thumbnails
     * Create file thumbnails
     * Creates thumbnails for the files with the IDs specified in the request.
     * Responses:
     *  - 200: List of file IDs
     *
     * REST API Reference for createThumbnails Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [ObjectArrayWrapper]
     */
    @POST("api/2.0/files/thumbnails")
    suspend fun createThumbnails(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<ObjectArrayWrapper>

    /**
     * DELETE api/2.0/files/file/{fileId}
     * Delete a file
     * Deletes a file with the ID specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/
     *
     *
     * @param fileId The file ID to delete.
     * @param delete The parameters for deleting a file.
     * @param returnSingleOperation Specifies whether to return only the current operation (optional)
     * @return [FileOperationArrayWrapper]
     */
    @DELETE("api/2.0/files/file/{fileId}")
    suspend fun deleteFile(@Path("fileId") fileId: kotlin.Int, @Body delete: Delete, @Query("ReturnSingleOperation") returnSingleOperation: kotlin.Boolean? = null): Response<FileOperationArrayWrapper>

    /**
     * DELETE api/2.0/files/recent
     * Delete recent files
     * Removes files with the IDs specified in the request from the Recent section.
     * Responses:
     *  - 200: No content
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [NoContentResultWrapper]
     */
    @DELETE("api/2.0/files/recent")
    suspend fun deleteRecent(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Response<NoContentResultWrapper>

    /**
     * DELETE api/2.0/files/templates
     * Delete template files
     * Removes files with the IDs specified in the request from the template list.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/
     *
     *
     * @param requestBody The file IDs. (optional)
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/files/templates")
    suspend fun deleteTemplates(@Body requestBody: kotlin.collections.List<kotlin.Int>? = null): Response<BooleanWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/xlsx
     * Generate XLSX report
     * Triggers asynchronous XLSX report generation for the specified form file.
     * Responses:
     *  - 200: XLSX report generation has been queued
     *  - 403: You do not have enough permissions to perform this action
     *  - 404: Form file not found
     *  - 401: Unauthorized
     *
     * REST API Reference for generateXlsx Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Unit]
     */
    @POST("api/2.0/files/file/{fileId}/xlsx")
    suspend fun generateXlsx(@Path("fileId") fileId: kotlin.Int): Response<Unit>

    /**
     * GET api/2.0/files/file/{fileId}/formroles
     * Get form roles
     * Returns all roles for the specified form.
     * Responses:
     *  - 200: Successfully retrieved all roles for the form
     *  - 403: You do not have enough permissions to view the form roles
     *  - 401: Unauthorized
     *
     * REST API Reference for getAllFormRoles Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/
     *
     *
     * @param fileId The file unique identifier.
     * @return [FormRoleArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/formroles")
    suspend fun getAllFormRoles(@Path("fileId") fileId: kotlin.Int): Response<FormRoleArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/edit/diff
     * Get changes URL
     * Returns a URL to the changes of a file version specified in the request.
     * Responses:
     *  - 200: File version history data
     *
     * REST API Reference for getEditDiffUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/
     *
     *
     * @param fileId The file ID.
     * @param version The file version. (optional)
     * @return [EditHistoryDataWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/edit/diff")
    suspend fun getEditDiffUrl(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null): Response<EditHistoryDataWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/edit/history
     * Get version history
     * Returns the version history of a file with the ID specified in the request.
     * Responses:
     *  - 200: Version history data
     *
     * REST API Reference for getEditHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/
     *
     *
     * @param fileId The file unique identifier.
     * @return [EditHistoryArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/edit/history")
    suspend fun getEditHistory(@Path("fileId") fileId: kotlin.Int): Response<EditHistoryArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/log
     * Get file history
     * Returns the list of actions performed on the file with the specified identifier.
     * Responses:
     *  - 200: List of actions performed on the file
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required file was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getFileHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/
     *
     *
     * @param fileId The file ID of the history request.
     * @param fromDate The start date of the history. (optional)
     * @param toDate The end date of the history. (optional)
     * @param count The number of history entries to retrieve for the file log. (optional)
     * @param startIndex The starting index for retrieving a subset of file history entries. (optional)
     * @return [HistoryArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/log")
    suspend fun getFileHistory(@Path("fileId") fileId: kotlin.Int, @Query("fromDate") fromDate: ApiDateTime? = null, @Query("toDate") toDate: ApiDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<HistoryArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}
     * Get file information
     * Returns the detailed information about a file with the ID specified in the request.
     * Responses:
     *  - 200: File information
     *
     * REST API Reference for getFileInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/
     *
     *
     * @param fileId The file ID.
     * @param version The file version. (optional)
     * @return [FileIntegerWrapper]
     */
    @GET("api/2.0/files/file/{fileId}")
    suspend fun getFileInfo(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null): Response<FileIntegerWrapper>

    /**
     * GET api/2.0/files/file/{id}/links
     * Get file external links
     * Returns the external links of a file with the ID specified in the request.
     * Responses:
     *  - 200: File security information
     *  - 401: Unauthorized
     *
     * REST API Reference for getFileLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/
     *
     *
     * @param id The file unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [FileShareArrayWrapper]
     */
    @GET("api/2.0/files/file/{id}/links")
    suspend fun getFileLinks(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{id}/link
     * Get primary external link
     * Returns the primary external link by the identifier specified in the request.
     * Responses:
     *  - 200: File security information
     *  - 404: Not Found
     *
     * REST API Reference for getFilePrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-primary-external-link/
     *
     *
     * @param id The file unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [FileShareWrapper]
     */
    @GET("api/2.0/files/file/{id}/link")
    suspend fun getFilePrimaryExternalLink(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<FileShareWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/history
     * Get file versions
     * Returns the detailed information about all the available file versions with the ID specified in the request.
     * Responses:
     *  - 200: Information about file versions: folder ID, version, version group, content length, pure content length, file status, URL to view a file, web URL, file type, file extension, comment, encrypted or not, thumbnail URL, thumbnail status, locked or not, user ID who locked a file, denies file downloading or not, denies file sharing or not, file accessibility
     *
     * REST API Reference for getFileVersionInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/
     *
     *
     * @param fileId The file unique identifier.
     * @return [FileIntegerArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/history")
    suspend fun getFileVersionInfo(@Path("fileId") fileId: kotlin.Int): Response<FileIntegerArrayWrapper>

    /**
     * GET api/2.0/files/file/fillresult
     * Get form-filling result
     * Retrieves the result of a form-filling session.
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getFillResult Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/
     *
     *
     * @param fillingSessionId The form-filling session ID. (optional)
     * @return [FillingFormResultIntegerWrapper]
     */
    @GET("api/2.0/files/file/fillresult")
    suspend fun getFillResult(@Query("fillingSessionId") fillingSessionId: kotlin.String? = null): Response<FillingFormResultIntegerWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/submissions
     * Get form submission results
     * Returns the results of form submissions.
     * Responses:
     *  - 200: Form submission results were successfully retrieved
     *  - 403: You do not have enough permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getFormSubmissions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-form-submissions/
     *
     *
     * @param fileId The file unique identifier.
     * @return [FormSubmissionsWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/submissions")
    suspend fun getFormSubmissions(@Path("fileId") fileId: kotlin.Int): Response<FormSubmissionsWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/presigned
     * Get file download link asynchronously
     * Returns a link to download a file with the ID specified in the request asynchronously.
     * Responses:
     *  - 200: File download link
     *  - 401: Unauthorized
     *
     * REST API Reference for getPresignedFileUri Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/
     *
     *
     * @param fileId The file unique identifier.
     * @return [FileLinkWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/presigned")
    suspend fun getPresignedFileUri(@Path("fileId") fileId: kotlin.Int): Response<FileLinkWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/presigneduri
     * Get file download link
     * Returns a pre-signed URL to download a file with the specified ID.  This temporary link provides secure access to the file.
     * Responses:
     *  - 200: File download link
     *  - 401: Unauthorized
     *
     * REST API Reference for getPresignedUri Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/
     *
     *
     * @param fileId The file unique identifier.
     * @return [StringWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/presigneduri")
    suspend fun getPresignedUri(@Path("fileId") fileId: kotlin.Int): Response<StringWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/protectusers
     * Get users access rights to the protected file
     * Returns a list of users with their access rights to the protected file with the ID specified in the request.
     * Responses:
     *  - 200: List of users with their access rights to the protected file
     *  - 401: Unauthorized
     *
     * REST API Reference for getProtectedFileUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/
     *
     *
     * @param fileId The file unique identifier.
     * @return [MentionWrapperArrayWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/protectusers")
    suspend fun getProtectedFileUsers(@Path("fileId") fileId: kotlin.Int): Response<MentionWrapperArrayWrapper>

    /**
     * POST api/2.0/files/file/referencedata
     * Get reference data
     * Returns the reference data to uniquely identify a file in its system and check the availability of insering data into the destination spreadsheet by the external link.
     * Responses:
     *  - 200: File reference data
     *  - 401: Unauthorized
     *
     * REST API Reference for getReferenceData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/
     *
     *
     * @param getReferenceDataDtoInteger  (optional)
     * @return [FileReferenceWrapper]
     */
    @POST("api/2.0/files/file/referencedata")
    suspend fun getReferenceData(@Body getReferenceDataDtoInteger: GetReferenceDataDtoInteger? = null): Response<FileReferenceWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/isformpdf
     * Check the PDF file
     * Checks if the PDF file is a form or not.
     * Responses:
     *  - 200: Boolean value: true - the PDF file is form, false - the PDF file is not a form
     *  - 401: Unauthorized
     *
     * REST API Reference for isFormPDF Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/
     *
     *
     * @param fileId The file unique identifier.
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/isformpdf")
    suspend fun isFormPDF(@Path("fileId") fileId: kotlin.Int): Response<BooleanWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/lock
     * Lock a file
     * Locks a file with the ID specified in the request.
     * Responses:
     *  - 200: Locked file information
     *  - 401: Unauthorized
     *
     * REST API Reference for lockFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/
     *
     *
     * @param fileId The file ID for locking.
     * @param lockFileParameters The parameters for locking a file.
     * @return [FileIntegerWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/lock")
    suspend fun lockFile(@Path("fileId") fileId: kotlin.Int, @Body lockFileParameters: LockFileParameters): Response<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/manageformfilling
     * Perform form filling action
     * Performs the specified form filling action.
     * Responses:
     *  - 200: Successfully processed the form filling action
     *  - 403: You do not have enough permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for manageFormFilling Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/
     *
     *
     * @param fileId 
     * @param manageFormFillingDtoInteger  (optional)
     * @return [Unit]
     */
    @PUT("api/2.0/files/file/{fileId}/manageformfilling")
    suspend fun manageFormFilling(@Path("fileId") fileId: kotlin.String, @Body manageFormFillingDtoInteger: ManageFormFillingDtoInteger? = null): Response<Unit>

    /**
     * GET api/2.0/files/file/{fileId}/openedit
     * Open a file configuration
     * Returns the initialization configuration of a file to open it in the editor.
     * Responses:
     *  - 200: Configuration parameters
     *  - 403: You don't have enough permission to view the file
     *
     * REST API Reference for openEditFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/open-edit-file/
     *
     *
     * @param fileId The file ID to open.
     * @param version The file version to open. (optional)
     * @param view Specifies if the document will be opened for viewing only or not. (optional)
     * @param editorType The editor type to open the file. (optional)
     * @param edit Specifies if the document is opened in the editing mode or not. (optional)
     * @param fill Specifies if the document is opened in the form-filling mode or not. (optional)
     * @return [ConfigurationIntegerWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/openedit")
    suspend fun openEditFile(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null, @Query("view") view: kotlin.Boolean? = null, @Query("editorType") editorType: EditorType? = null, @Query("edit") edit: kotlin.Boolean? = null, @Query("fill") fill: kotlin.Boolean? = null): Response<ConfigurationIntegerWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/restoreversion
     * Restore a file version
     * Restores a file version specified in the request.
     * Responses:
     *  - 200: Version history data: file ID, key, file version, version group, a user who updated a file, creation time, history changes in the string format, list of history changes, server version
     *  - 400: No file id or folder id toFolderId determine provider
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for restoreFileVersion Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-file-version/
     *
     *
     * @param fileId The file ID of the restore version.
     * @param version The file version of the restore. (optional)
     * @param url The file version URL of the restore. (optional)
     * @return [EditHistoryArrayWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/restoreversion")
    suspend fun restoreFileVersion(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null, @Query("url") url: kotlin.String? = null): Response<EditHistoryArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/saveediting
     * Save file edits
     * Saves edits to a file with the ID specified in the request.
     * Responses:
     *  - 200: Saved file parameters
     *  - 400: No file id or folder id toFolderId determine provider
     *  - 403: You do not have enough permissions to edit the file
     *  - 401: Unauthorized
     *
     * REST API Reference for saveEditingFileFromForm Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/
     *
     *
     * @param fileId The editing file ID from the request.
     * @param downloadUri The URI to download the editing file. (optional)
     * @param fileExtension The editing file extension from the request. (optional)
     * @param file The edited file to be saved, uploaded as part of the multipart/form-data request.  This property represents the modified file content from the HTTP request form after editing operations.  The file is accessed via the IFormFile interface which provides access to the file name, content type, length, and stream. (optional)
     * @param forcesave Specifies whether to force save the file or not. (optional)
     * @return [FileIntegerWrapper]
     */
    @Multipart
    @PUT("api/2.0/files/file/{fileId}/saveediting")
    suspend fun saveEditingFileFromForm(@Path("fileId") fileId: kotlin.Int, @Query("DownloadUri") downloadUri: kotlin.String? = null, @Part("FileExtension") fileExtension: kotlin.String? = null, @Part file: MultipartBody.Part? = null, @Part("Forcesave") forcesave: kotlin.Boolean? = null): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{id}/saveaspdf
     * Save a file as PDF
     * Saves a file with the identifier specified in the request as a PDF document.
     * Responses:
     *  - 200: New file information
     *  - 404: File not found
     *  - 401: Unauthorized
     *
     * REST API Reference for saveFileAsPdf Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/
     *
     *
     * @param id The file ID to save as PDF.
     * @param saveAsPdfInteger The parameters for saving the file as PDF.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/file/{id}/saveaspdf")
    suspend fun saveFileAsPdf(@Path("id") id: kotlin.Int, @Body saveAsPdfInteger: SaveAsPdfInteger): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/formrolemapping
     * Save form role mapping
     * Saves the form role mapping.
     * Responses:
     *  - 200: Updated information about form role mappings
     *  - 403: You do not have enough permissions to edit the file
     *  - 401: Unauthorized
     *
     * REST API Reference for saveFormRoleMapping Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/
     *
     *
     * @param fileId 
     * @param saveFormRoleMappingDtoInteger  (optional)
     * @return [Unit]
     */
    @POST("api/2.0/files/file/{fileId}/formrolemapping")
    suspend fun saveFormRoleMapping(@Path("fileId") fileId: kotlin.String, @Body saveFormRoleMappingDtoInteger: SaveFormRoleMappingDtoInteger? = null): Response<Unit>

    /**
     * PUT api/2.0/files/file/{fileId}/customfilter
     * Set the Custom Filter editing mode
     * Sets the Custom Filter editing mode to a file with the ID specified in the request.
     * Responses:
     *  - 200: File information
     *  - 401: Unauthorized
     *
     * REST API Reference for setCustomFilterTag Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/
     *
     *
     * @param fileId The file ID.
     * @param customFilterParameters The parameters for setting the Custom Filter editing mode.
     * @return [FileIntegerWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/customfilter")
    suspend fun setCustomFilterTag(@Path("fileId") fileId: kotlin.Int, @Body customFilterParameters: CustomFilterParameters): Response<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/file/{id}/links
     * Set an external link
     * Sets an external link to a file with the ID specified in the request.
     * Responses:
     *  - 200: File security information
     *  - 401: Unauthorized
     *
     * REST API Reference for setFileExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/
     *
     *
     * @param id The file ID.
     * @param fileLinkRequest The file external link parameters.
     * @return [FileShareWrapper]
     */
    @PUT("api/2.0/files/file/{id}/links")
    suspend fun setFileExternalLink(@Path("id") id: kotlin.Int, @Body fileLinkRequest: FileLinkRequest): Response<FileShareWrapper>

    /**
     * PUT api/2.0/files/{fileId}/order
     * Set file order
     * Sets the order of the file with the ID specified in the request.
     * Responses:
     *  - 200: Updated file information
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: Not Found
     *  - 401: Unauthorized
     *
     * REST API Reference for setFileOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/
     *
     *
     * @param fileId The file unique identifier.
     * @param orderRequestDto The file order information. (optional)
     * @return [FileIntegerWrapper]
     */
    @PUT("api/2.0/files/{fileId}/order")
    suspend fun setFileOrder(@Path("fileId") fileId: kotlin.Int, @Body orderRequestDto: OrderRequestDto? = null): Response<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/order
     * Set order of files
     * Sets the order of the files specified in the request.
     * Responses:
     *  - 200: Updated file entries information
     *  - 401: Unauthorized
     *
     * REST API Reference for setFilesOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/
     *
     *
     * @param ordersRequestDtoInteger  (optional)
     * @return [FileEntryIntegerArrayWrapper]
     */
    @PUT("api/2.0/files/order")
    suspend fun setFilesOrder(@Body ordersRequestDtoInteger: OrdersRequestDtoInteger? = null): Response<FileEntryIntegerArrayWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/startedit
     * Start file editing
     * Informs about opening a file with the ID specified in the request for editing, locking it from being deleted or moved (this method is called by the mobile editors).
     * Responses:
     *  - 200: File key for Document Service
     *  - 403: You don't have enough permission to view the file
     *
     * REST API Reference for startEditFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-edit-file/
     *
     *
     * @param fileId The file ID to start editing.
     * @param startEdit The file parameters to start editing.
     * @return [StringWrapper]
     */
    @POST("api/2.0/files/file/{fileId}/startedit")
    suspend fun startEditFile(@Path("fileId") fileId: kotlin.Int, @Body startEdit: StartEdit): Response<StringWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/startfilling
     * Start file filling
     * Starts filling a file with the ID specified in the request.
     * Responses:
     *  - 200: File information
     *  - 403: You do not have enough permissions to edit the file
     *  - 401: Unauthorized
     *
     * REST API Reference for startFillingFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/
     *
     *
     * @param fileId The file ID to start filling.
     * @return [FileIntegerWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}/startfilling")
    suspend fun startFillingFile(@Path("fileId") fileId: kotlin.Int): Response<FileIntegerWrapper>

    /**
     * GET api/2.0/files/favorites/{fileId}
     * Change the file favorite status
     * Changes the favorite status of the file with the ID specified in the request.
     * Responses:
     *  - 200: Boolean value: true - the file is favorite, false - the file is not favorite
     *  - 403: You don't have enough permission to perform the operation
     *  - 401: Unauthorized
     *
     * REST API Reference for toggleFileFavorite Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/
     *
     *
     * @param fileId The file ID.
     * @param favorite Specifies if the file is marked as favorite or not. (optional)
     * @return [BooleanWrapper]
     */
    @GET("api/2.0/files/favorites/{fileId}")
    suspend fun toggleFileFavorite(@Path("fileId") fileId: kotlin.Int, @Query("favorite") favorite: kotlin.Boolean? = null): Response<BooleanWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/trackeditfile
     * Track file editing
     * Tracks file changes when editing.
     * Responses:
     *  - 200: File changes
     *  - 403: You don't have enough permission to perform the operation
     *
     * REST API Reference for trackEditFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/track-edit-file/
     *
     *
     * @param fileId The file ID to track editing changes.
     * @param tabId The tab ID to track editing changes. (optional)
     * @param docKeyForTrack The document key for tracking changes. (optional)
     * @param isFinish Specifies whether to finish file tracking or not. (optional)
     * @return [KeyValuePairBooleanStringWrapper]
     */
    @GET("api/2.0/files/file/{fileId}/trackeditfile")
    suspend fun trackEditFile(@Path("fileId") fileId: kotlin.Int, @Query("tabId") tabId: java.util.UUID? = null, @Query("docKeyForTrack") docKeyForTrack: kotlin.String? = null, @Query("isFinish") isFinish: kotlin.Boolean? = null): Response<KeyValuePairBooleanStringWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}
     * Update a file
     * Updates the information of the selected file with the parameters specified in the request.
     * Responses:
     *  - 200: Updated file information
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for updateFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-file/
     *
     *
     * @param fileId The file ID to update.
     * @param updateFile The parameters for updating a file.
     * @return [FileIntegerWrapper]
     */
    @PUT("api/2.0/files/file/{fileId}")
    suspend fun updateFile(@Path("fileId") fileId: kotlin.Int, @Body updateFile: UpdateFile): Response<FileIntegerWrapper>

}
