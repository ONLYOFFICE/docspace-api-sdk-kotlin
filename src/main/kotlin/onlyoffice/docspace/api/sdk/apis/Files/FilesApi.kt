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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.BaseBatchRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ChangeHistory
import onlyoffice.docspace.api.sdk.models.CheckFillFormDraft
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
import onlyoffice.docspace.api.sdk.models.GetReferenceDataDtoInteger
import onlyoffice.docspace.api.sdk.models.HistoryArrayWrapper
import onlyoffice.docspace.api.sdk.models.KeyValuePairBooleanStringWrapper
import onlyoffice.docspace.api.sdk.models.LockFileParameters
import onlyoffice.docspace.api.sdk.models.ManageFormFillingDtoInteger
import onlyoffice.docspace.api.sdk.models.MentionWrapperArrayWrapper
import onlyoffice.docspace.api.sdk.models.NoContentResultWrapper
import onlyoffice.docspace.api.sdk.models.ObjectArrayWrapper
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.OrderRequestDto
import onlyoffice.docspace.api.sdk.models.OrdersRequestDtoInteger
import onlyoffice.docspace.api.sdk.models.SaveAsPdfInteger
import onlyoffice.docspace.api.sdk.models.SaveFormRoleMappingDtoInteger
import onlyoffice.docspace.api.sdk.models.StartEdit
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TemplatesRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateFile

import onlyoffice.docspace.api.sdk.models.*

import okhttp3.MultipartBody

interface FilesApi {
    /**
     * POST api/2.0/files/file/{fileId}/recent
     * 
     * 
     * Responses:
     *  - 200: New file information
     *
     * REST API Reference for addFileToRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-file-to-recent/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/file/{fileId}/recent")
    fun addFileToRecent(@Path("fileId") fileId: kotlin.Int): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/templates
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for addTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-templates/
     *
     *
     * @param templatesRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/files/templates")
    fun addTemplates(@Body templatesRequestDto: TemplatesRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/history
     * 
     * 
     * Responses:
     *  - 200: Updated information about file versions
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for changeVersionHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-version-history/
     *
     *
     * @param fileId The file Id to change its version history.
     * @param changeHistory The parameters for changing version history.
     * @return [Call]<[FileIntegerArrayWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/history")
    fun changeVersionHistory(@Path("fileId") fileId: kotlin.Int, @Body changeHistory: ChangeHistory): Call<FileIntegerArrayWrapper>

    /**
     * POST api/2.0/files/masterform/{fileId}/checkfillformdraft
     * 
     * 
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
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/files/masterform/{fileId}/checkfillformdraft")
    fun checkFillFormDraft(@Path("fileId") fileId: kotlin.Int, @Body checkFillFormDraft: CheckFillFormDraft): Call<StringWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/copyas
     * 
     * 
     * Responses:
     *  - 200: Copied file entry information
     *  - 400: No file id or folder id toFolderId determine provider
     *  - 403: You don't have enough permission to create
     *  - 404: File not found
     *
     * REST API Reference for copyFileAs Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/copy-file-as/
     *
     *
     * @param fileId The file ID to copy.
     * @param copyAsJsonElement The parameters for copying a file.
     * @return [Call]<[FileEntryBaseWrapper]>
     */
    @POST("api/2.0/files/file/{fileId}/copyas")
    fun copyFileAs(@Path("fileId") fileId: kotlin.Int, @Body copyAsJsonElement: CopyAsJsonElement): Call<FileEntryBaseWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/edit_session
     * 
     * 
     * Responses:
     *  - 200: Information about created session
     *  - 403: You don't have enough permission to edit the file
     *
     * REST API Reference for createEditSession Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-edit-session/
     *
     *
     * @param fileId The file ID.
     * @param fileSize The file size in bytes. (optional)
     * @return [Call]<[ObjectWrapper]>
     */
    @POST("api/2.0/files/file/{fileId}/edit_session")
    fun createEditSession(@Path("fileId") fileId: kotlin.Int, @Query("fileSize") fileSize: kotlin.Long? = null): Call<ObjectWrapper>

    /**
     * POST api/2.0/files/{folderId}/file
     * 
     * 
     * Responses:
     *  - 200: New file information
     *
     * REST API Reference for createFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file/
     *
     *
     * @param folderId The folder ID for the file creation.
     * @param createFileJsonElement The parameters for creating a file.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/{folderId}/file")
    fun createFile(@Path("folderId") folderId: kotlin.Int, @Body createFileJsonElement: CreateFileJsonElement): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/file
     * 
     * 
     * Responses:
     *  - 200: New file information
     *
     * REST API Reference for createFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-in-my-documents/
     *
     *
     * @param createFileJsonElement  (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/@my/file")
    fun createFileInMyDocuments(@Body createFileJsonElement: CreateFileJsonElement? = null): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{id}/link
     * 
     * 
     * Responses:
     *  - 200: File security information
     *  - 404: Not Found
     *
     * REST API Reference for createFilePrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-file-primary-external-link/
     *
     *
     * @param id The file ID.
     * @param fileLinkRequest The file external link parameters.
     * @return [Call]<[FileShareWrapper]>
     */
    @POST("api/2.0/files/file/{id}/link")
    fun createFilePrimaryExternalLink(@Path("id") id: kotlin.Int, @Body fileLinkRequest: FileLinkRequest): Call<FileShareWrapper>

    /**
     * POST api/2.0/files/{folderId}/html
     * 
     * 
     * Responses:
     *  - 200: New file information
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for createHtmlFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file/
     *
     *
     * @param folderId The folder ID to create the text or HTML file.
     * @param createTextOrHtmlFile The parameters for creating an HTML or text file.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/{folderId}/html")
    fun createHtmlFile(@Path("folderId") folderId: kotlin.Int, @Body createTextOrHtmlFile: CreateTextOrHtmlFile): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/html
     * 
     * 
     * Responses:
     *  - 200: New file information
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for createHtmlFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-html-file-in-my-documents/
     *
     *
     * @param createTextOrHtmlFile  (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/@my/html")
    fun createHtmlFileInMyDocuments(@Body createTextOrHtmlFile: CreateTextOrHtmlFile? = null): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/text
     * 
     * 
     * Responses:
     *  - 200: New file information
     *
     * REST API Reference for createTextFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file/
     *
     *
     * @param folderId The folder ID to create the text or HTML file.
     * @param createTextOrHtmlFile The parameters for creating an HTML or text file.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/{folderId}/text")
    fun createTextFile(@Path("folderId") folderId: kotlin.Int, @Body createTextOrHtmlFile: CreateTextOrHtmlFile): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/text
     * 
     * 
     * Responses:
     *  - 200: New file information
     *
     * REST API Reference for createTextFileInMyDocuments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-text-file-in-my-documents/
     *
     *
     * @param createTextOrHtmlFile  (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/@my/text")
    fun createTextFileInMyDocuments(@Body createTextOrHtmlFile: CreateTextOrHtmlFile? = null): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/thumbnails
     * 
     * 
     * Responses:
     *  - 200: List of file IDs
     *
     * REST API Reference for createThumbnails Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-thumbnails/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[ObjectArrayWrapper]>
     */
    @POST("api/2.0/files/thumbnails")
    fun createThumbnails(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<ObjectArrayWrapper>

    /**
     * DELETE api/2.0/files/file/{fileId}
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for deleteFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-file/
     *
     *
     * @param fileId The file ID to delete.
     * @param delete The parameters for deleting a file.
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @DELETE("api/2.0/files/file/{fileId}")
    fun deleteFile(@Path("fileId") fileId: kotlin.Int, @Body delete: Delete): Call<FileOperationArrayWrapper>

    /**
     * DELETE api/2.0/files/recent
     * 
     * 
     * Responses:
     *  - 200: No content
     *
     * REST API Reference for deleteRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-recent/
     *
     *
     * @param baseBatchRequestDto  (optional)
     * @return [Call]<[NoContentResultWrapper]>
     */
    @DELETE("api/2.0/files/recent")
    fun deleteRecent(@Body baseBatchRequestDto: BaseBatchRequestDto? = null): Call<NoContentResultWrapper>

    /**
     * DELETE api/2.0/files/templates
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *
     * REST API Reference for deleteTemplates Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-templates/
     *
     *
     * @param requestBody The file IDs. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @DELETE("api/2.0/files/templates")
    fun deleteTemplates(@Body requestBody: kotlin.collections.List<kotlin.Int>? = null): Call<BooleanWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/formroles
     * 
     * 
     * Responses:
     *  - 200: Successfully retrieved all roles for the form
     *  - 403: You do not have enough permissions to view the form roles
     *
     * REST API Reference for getAllFormRoles Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-form-roles/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[FormRoleArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/formroles")
    fun getAllFormRoles(@Path("fileId") fileId: kotlin.Int): Call<FormRoleArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/edit/diff
     * 
     * 
     * Responses:
     *  - 200: File version history data
     *
     * REST API Reference for getEditDiffUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-diff-url/
     *
     *
     * @param fileId The file ID.
     * @param version The file version. (optional)
     * @return [Call]<[EditHistoryDataWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/edit/diff")
    fun getEditDiffUrl(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null): Call<EditHistoryDataWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/edit/history
     * 
     * 
     * Responses:
     *  - 200: Version history data
     *
     * REST API Reference for getEditHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-edit-history/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[EditHistoryArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/edit/history")
    fun getEditHistory(@Path("fileId") fileId: kotlin.Int): Call<EditHistoryArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/log
     * 
     * 
     * Responses:
     *  - 200: List of actions performed on the file
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required file was not found
     *
     * REST API Reference for getFileHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-history/
     *
     *
     * @param fileId The file ID of the history request.
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param count The number of history entries to retrieve for the file log. (optional)
     * @param startIndex The starting index for retrieving a subset of file history entries. (optional)
     * @return [Call]<[HistoryArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/log")
    fun getFileHistory(@Path("fileId") fileId: kotlin.Int, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<HistoryArrayWrapper>

    /**
     * GET api/2.0/files/file/{fileId}
     * 
     * 
     * Responses:
     *  - 200: File information
     *
     * REST API Reference for getFileInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-info/
     *
     *
     * @param fileId The file ID.
     * @param version The file version. (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}")
    fun getFileInfo(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null): Call<FileIntegerWrapper>

    /**
     * GET api/2.0/files/file/{id}/links
     * 
     * 
     * Responses:
     *  - 200: File security information
     *
     * REST API Reference for getFileLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-links/
     *
     *
     * @param id The file unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/file/{id}/links")
    fun getFileLinks(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/file/{id}/link
     * 
     * 
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
     * @return [Call]<[FileShareWrapper]>
     */
    @GET("api/2.0/files/file/{id}/link")
    fun getFilePrimaryExternalLink(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<FileShareWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/history
     * 
     * 
     * Responses:
     *  - 200: Information about file versions: folder ID, version, version group, content length, pure content length, file status, URL to view a file, web URL, file type, file extension, comment, encrypted or not, thumbnail URL, thumbnail status, locked or not, user ID who locked a file, denies file downloading or not, denies file sharing or not, file accessibility
     *
     * REST API Reference for getFileVersionInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-file-version-info/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[FileIntegerArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/history")
    fun getFileVersionInfo(@Path("fileId") fileId: kotlin.Int): Call<FileIntegerArrayWrapper>

    /**
     * GET api/2.0/files/file/fillresult
     * 
     * 
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getFillResult Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-fill-result/
     *
     *
     * @param fillingSessionId The form-filling session ID. (optional)
     * @return [Call]<[FillingFormResultIntegerWrapper]>
     */
    @GET("api/2.0/files/file/fillresult")
    fun getFillResult(@Query("fillingSessionId") fillingSessionId: kotlin.String? = null): Call<FillingFormResultIntegerWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/presigned
     * 
     * 
     * Responses:
     *  - 200: File download link
     *
     * REST API Reference for getPresignedFileUri Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-file-uri/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[FileLinkWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/presigned")
    fun getPresignedFileUri(@Path("fileId") fileId: kotlin.Int): Call<FileLinkWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/presigneduri
     * 
     * 
     * Responses:
     *  - 200: File download link
     *
     * REST API Reference for getPresignedUri Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-presigned-uri/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/presigneduri")
    fun getPresignedUri(@Path("fileId") fileId: kotlin.Int): Call<StringWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/protectusers
     * 
     * 
     * Responses:
     *  - 200: List of users with their access rights to the protected file
     *
     * REST API Reference for getProtectedFileUsers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-protected-file-users/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[MentionWrapperArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/protectusers")
    fun getProtectedFileUsers(@Path("fileId") fileId: kotlin.Int): Call<MentionWrapperArrayWrapper>

    /**
     * POST api/2.0/files/file/referencedata
     * 
     * 
     * Responses:
     *  - 200: File reference data
     *
     * REST API Reference for getReferenceData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-reference-data/
     *
     *
     * @param getReferenceDataDtoInteger  (optional)
     * @return [Call]<[FileReferenceWrapper]>
     */
    @POST("api/2.0/files/file/referencedata")
    fun getReferenceData(@Body getReferenceDataDtoInteger: GetReferenceDataDtoInteger? = null): Call<FileReferenceWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/isformpdf
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true - the PDF file is form, false - the PDF file is not a form
     *
     * REST API Reference for isFormPDF Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/is-form-pdf/
     *
     *
     * @param fileId The file unique identifier.
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/isformpdf")
    fun isFormPDF(@Path("fileId") fileId: kotlin.Int): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/lock
     * 
     * 
     * Responses:
     *  - 200: Locked file information
     *
     * REST API Reference for lockFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/lock-file/
     *
     *
     * @param fileId The file ID for locking.
     * @param lockFileParameters The parameters for locking a file.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/lock")
    fun lockFile(@Path("fileId") fileId: kotlin.Int, @Body lockFileParameters: LockFileParameters): Call<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/manageformfilling
     * 
     * 
     * Responses:
     *  - 200: Successfully processed the form filling action
     *  - 403: You do not have enough permissions to perform this action
     *
     * REST API Reference for manageFormFilling Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/manage-form-filling/
     *
     *
     * @param fileId 
     * @param manageFormFillingDtoInteger  (optional)
     * @return [Call]<[Unit]>
     */
    @PUT("api/2.0/files/file/{fileId}/manageformfilling")
    fun manageFormFilling(@Path("fileId") fileId: kotlin.String, @Body manageFormFillingDtoInteger: ManageFormFillingDtoInteger? = null): Call<Unit>

    /**
     * GET api/2.0/files/file/{fileId}/openedit
     * 
     * 
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
     * @return [Call]<[ConfigurationIntegerWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/openedit")
    fun openEditFile(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null, @Query("view") view: kotlin.Boolean? = null, @Query("editorType") editorType: EditorType? = null, @Query("edit") edit: kotlin.Boolean? = null, @Query("fill") fill: kotlin.Boolean? = null): Call<ConfigurationIntegerWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/restoreversion
     * 
     * 
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
     * @return [Call]<[EditHistoryArrayWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/restoreversion")
    fun restoreFileVersion(@Path("fileId") fileId: kotlin.Int, @Query("version") version: kotlin.Int? = null, @Query("url") url: kotlin.String? = null): Call<EditHistoryArrayWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/saveediting
     * 
     * 
     * Responses:
     *  - 200: Saved file parameters
     *  - 400: No file id or folder id toFolderId determine provider
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for saveEditingFileFromForm Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-editing-file-from-form/
     *
     *
     * @param fileId The editing file ID from the request.
     * @param fileExtension The editing file extension from the request. (optional)
     * @param downloadUri The URI to download the editing file. (optional)
     * @param file The request file stream. (optional)
     * @param forcesave Specifies whether to force save the file or not. (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @Multipart
    @PUT("api/2.0/files/file/{fileId}/saveediting")
    fun saveEditingFileFromForm(@Path("fileId") fileId: kotlin.Int, @Part("FileExtension") fileExtension: kotlin.String? = null, @Part("DownloadUri") downloadUri: kotlin.String? = null, @Part file: MultipartBody.Part? = null, @Part("Forcesave") forcesave: kotlin.Boolean? = null): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{id}/saveaspdf
     * 
     * 
     * Responses:
     *  - 200: New file information
     *  - 404: File not found
     *
     * REST API Reference for saveFileAsPdf Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-file-as-pdf/
     *
     *
     * @param id The file ID to save as PDF.
     * @param saveAsPdfInteger The parameters for saving the file as PDF.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @POST("api/2.0/files/file/{id}/saveaspdf")
    fun saveFileAsPdf(@Path("id") id: kotlin.Int, @Body saveAsPdfInteger: SaveAsPdfInteger): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/formrolemapping
     * 
     * 
     * Responses:
     *  - 200: Updated information about form role mappings
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for saveFormRoleMapping Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-form-role-mapping/
     *
     *
     * @param fileId 
     * @param saveFormRoleMappingDtoInteger  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/2.0/files/file/{fileId}/formrolemapping")
    fun saveFormRoleMapping(@Path("fileId") fileId: kotlin.String, @Body saveFormRoleMappingDtoInteger: SaveFormRoleMappingDtoInteger? = null): Call<Unit>

    /**
     * PUT api/2.0/files/file/{fileId}/customfilter
     * 
     * 
     * Responses:
     *  - 200: File information
     *
     * REST API Reference for setCustomFilterTag Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-custom-filter-tag/
     *
     *
     * @param fileId The file ID.
     * @param customFilterParameters The parameters for setting the Custom Filter editing mode.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/customfilter")
    fun setCustomFilterTag(@Path("fileId") fileId: kotlin.Int, @Body customFilterParameters: CustomFilterParameters): Call<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/file/{id}/links
     * 
     * 
     * Responses:
     *  - 200: File security information
     *
     * REST API Reference for setFileExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-external-link/
     *
     *
     * @param id The file ID.
     * @param fileLinkRequest The file external link parameters.
     * @return [Call]<[FileShareWrapper]>
     */
    @PUT("api/2.0/files/file/{id}/links")
    fun setFileExternalLink(@Path("id") id: kotlin.Int, @Body fileLinkRequest: FileLinkRequest): Call<FileShareWrapper>

    /**
     * PUT api/2.0/files/{fileId}/order
     * 
     * 
     * Responses:
     *  - 200: Updated file information
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: Not Found
     *
     * REST API Reference for setFileOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-file-order/
     *
     *
     * @param fileId The file unique identifier.
     * @param orderRequestDto The file order information. (optional)
     * @return [Call]<[FileIntegerWrapper]>
     */
    @PUT("api/2.0/files/{fileId}/order")
    fun setFileOrder(@Path("fileId") fileId: kotlin.Int, @Body orderRequestDto: OrderRequestDto? = null): Call<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/order
     * 
     * 
     * Responses:
     *  - 200: Updated file entries information
     *
     * REST API Reference for setFilesOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-files-order/
     *
     *
     * @param ordersRequestDtoInteger  (optional)
     * @return [Call]<[FileEntryIntegerArrayWrapper]>
     */
    @PUT("api/2.0/files/order")
    fun setFilesOrder(@Body ordersRequestDtoInteger: OrdersRequestDtoInteger? = null): Call<FileEntryIntegerArrayWrapper>

    /**
     * POST api/2.0/files/file/{fileId}/startedit
     * 
     * 
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
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/files/file/{fileId}/startedit")
    fun startEditFile(@Path("fileId") fileId: kotlin.Int, @Body startEdit: StartEdit): Call<StringWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}/startfilling
     * 
     * 
     * Responses:
     *  - 200: File information
     *  - 403: You do not have enough permissions to edit the file
     *
     * REST API Reference for startFillingFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-filling-file/
     *
     *
     * @param fileId The file ID to start filling.
     * @return [Call]<[FileIntegerWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}/startfilling")
    fun startFillingFile(@Path("fileId") fileId: kotlin.Int): Call<FileIntegerWrapper>

    /**
     * GET api/2.0/files/favorites/{fileId}
     * 
     * 
     * Responses:
     *  - 200: Boolean value: true - the file is favorite, false - the file is not favorite
     *  - 403: You don't have enough permission to perform the operation
     *
     * REST API Reference for toggleFileFavorite Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/toggle-file-favorite/
     *
     *
     * @param fileId The file ID.
     * @param favorite Specifies if the file is marked as favorite or not. (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/files/favorites/{fileId}")
    fun toggleFileFavorite(@Path("fileId") fileId: kotlin.Int, @Query("favorite") favorite: kotlin.Boolean? = null): Call<BooleanWrapper>

    /**
     * GET api/2.0/files/file/{fileId}/trackeditfile
     * 
     * 
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
     * @return [Call]<[KeyValuePairBooleanStringWrapper]>
     */
    @GET("api/2.0/files/file/{fileId}/trackeditfile")
    fun trackEditFile(@Path("fileId") fileId: kotlin.Int, @Query("tabId") tabId: java.util.UUID? = null, @Query("docKeyForTrack") docKeyForTrack: kotlin.String? = null, @Query("isFinish") isFinish: kotlin.Boolean? = null): Call<KeyValuePairBooleanStringWrapper>

    /**
     * PUT api/2.0/files/file/{fileId}
     * 
     * 
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
     * @return [Call]<[FileIntegerWrapper]>
     */
    @PUT("api/2.0/files/file/{fileId}")
    fun updateFile(@Path("fileId") fileId: kotlin.Int, @Body updateFile: UpdateFile): Call<FileIntegerWrapper>

}
