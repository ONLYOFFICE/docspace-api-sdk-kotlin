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
import onlyoffice.docspace.api.sdk.models.ApplyFilterOption
import onlyoffice.docspace.api.sdk.models.CheckUploadRequest
import onlyoffice.docspace.api.sdk.models.CreateFolder
import onlyoffice.docspace.api.sdk.models.DeleteFolder
import onlyoffice.docspace.api.sdk.models.FileEntryBaseArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileShareWrapper
import onlyoffice.docspace.api.sdk.models.FilesStatisticsResultWrapper
import onlyoffice.docspace.api.sdk.models.FilterType
import onlyoffice.docspace.api.sdk.models.FolderContentIntegerArrayWrapper
import onlyoffice.docspace.api.sdk.models.FolderContentIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FolderIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FolderLinkRequest
import onlyoffice.docspace.api.sdk.models.FormsItemArrayWrapper
import onlyoffice.docspace.api.sdk.models.HistoryArrayWrapper
import onlyoffice.docspace.api.sdk.models.Location
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.OrderRequestDto
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.SearchArea
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.UploadRequestDto

import okhttp3.MultipartBody

interface FoldersApi {
    /**
     * POST api/2.0/files/{folderId}/upload/check
     * Check file uploads
     * Checks the file uploads to the folder with the ID specified in the request.
     * Responses:
     *  - 200: Inserted file
     *  - 401: Unauthorized
     *
     * REST API Reference for checkUpload Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
     *
     *
     * @param folderId The folder ID.
     * @param checkUploadRequest The request parameters for checking file uploads.
     * @return [STRINGArrayWrapper]
     */
    @POST("api/2.0/files/{folderId}/upload/check")
    suspend fun checkUpload(@Path("folderId") folderId: kotlin.Int, @Body checkUploadRequest: CheckUploadRequest): Response<STRINGArrayWrapper>

    /**
     * POST api/2.0/files/folder/{folderId}
     * Create a folder
     * Creates a new folder with the title specified in the request. The parent folder ID can be also specified.
     * Responses:
     *  - 200: New folder parameters
     *  - 401: Unauthorized
     *
     * REST API Reference for createFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
     *
     *
     * @param folderId The folder ID for the folder creation.
     * @param createFolder The parameters for creating a folder.
     * @return [FolderIntegerWrapper]
     */
    @POST("api/2.0/files/folder/{folderId}")
    suspend fun createFolder(@Path("folderId") folderId: kotlin.Int, @Body createFolder: CreateFolder): Response<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/folder/{id}/link
     * Create primary external link
     * Creates a primary external link by the identifier specified in the request.
     * Responses:
     *  - 200: Folders security information
     *  - 404: Not Found
     *  - 401: Unauthorized
     *
     * REST API Reference for createFolderPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
     *
     *
     * @param id The folder ID.
     * @param folderLinkRequest The folder link parameters.
     * @return [FileShareWrapper]
     */
    @POST("api/2.0/files/folder/{id}/link")
    suspend fun createFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Body folderLinkRequest: FolderLinkRequest): Response<FileShareWrapper>

    /**
     * POST api/2.0/files/folder/{folderId}/log/report
     * Generates folder history
     * Generates the activity history of a folder.
     * Responses:
     *  - 200: URL to the report file
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for createReportFolderHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
     *
     *
     * @param folderId 
     * @return [StringWrapper]
     */
    @POST("api/2.0/files/folder/{folderId}/log/report")
    suspend fun createReportFolderHistory(@Path("folderId") folderId: kotlin.Int): Response<StringWrapper>

    /**
     * DELETE api/2.0/files/folder/{folderId}
     * Delete a folder
     * Deletes a folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
     *
     *
     * @param folderId The folder ID to delete.
     * @param deleteFolder The parameters for deleting a folder.
     * @return [FileOperationArrayWrapper]
     */
    @DELETE("api/2.0/files/folder/{folderId}")
    suspend fun deleteFolder(@Path("folderId") folderId: kotlin.Int, @Body deleteFolder: DeleteFolder): Response<FileOperationArrayWrapper>

    /**
     * POST api/2.0/files/folder/{folderId}/xlsx
     * Generate XLSX report by folder
     * Triggers asynchronous XLSX report generation for the specified form results folder.
     * Responses:
     *  - 200: Original form file information
     *  - 403: You do not have enough permissions to perform this action
     *  - 404: Form results folder not found
     *  - 401: Unauthorized
     *
     * REST API Reference for generateXlsxByFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/generate-xlsx-by-folder/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FileIntegerWrapper]
     */
    @POST("api/2.0/files/folder/{folderId}/xlsx")
    suspend fun generateXlsxByFolder(@Path("folderId") folderId: kotlin.Int): Response<FileIntegerWrapper>

    /**
     * GET api/2.0/files/@favorites
     * Get the Favorites section
     * Returns the detailed list of files and folders located in the Favorites section.
     * Responses:
     *  - 200: The Favorites section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getFavoritesFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-favorites-folder/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param count The maximum number of items to retrieve in the request. (optional)
     * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
     * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/@favorites")
    suspend fun getFavoritesFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/filesusedspace
     * Get used space of files
     * Returns the used space of files in the root folders.
     * Responses:
     *  - 200: Used space of files in the root folders
     *  - 401: Unauthorized
     *
     * REST API Reference for getFilesUsedSpace Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/
     *
     *
     * @return [FilesStatisticsResultWrapper]
     */
    @GET("api/2.0/files/filesusedspace")
    suspend fun getFilesUsedSpace(): Response<FilesStatisticsResultWrapper>

    /**
     * GET api/2.0/files/{folderId}/formfilter
     * Get folder form filter
     * Returns the form filter of a folder with the ID specified in the request.
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FormsItemArrayWrapper]
     */
    @GET("api/2.0/files/{folderId}/formfilter")
    suspend fun getFolder(@Path("folderId") folderId: kotlin.Int): Response<FormsItemArrayWrapper>

    /**
     * GET api/2.0/files/{folderId}
     * Get a folder by ID
     * Returns the detailed list of files and folders located in the folder with the ID specified in the request.
     * Responses:
     *  - 200: Folder contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *
     * REST API Reference for getFolderByFolderId Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-by-folder-id/
     *
     *
     * @param folderId The folder ID.
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param sharedBy The identifier of the user who shared the folder or file. (optional)
     * @param filterType The filter type. (optional)
     * @param roomId The room ID. (optional)
     * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
     * @param applyFilterOption Specifies whether to return only files, only folders, or all elements from the specified folder. (optional)
     * @param extension Specifies whether to search for the specific file extension. (optional)
     * @param searchArea The search area. (optional)
     * @param formsItemKey The forms item key. (optional)
     * @param formsItemType The forms item type. (optional)
     * @param count The maximum number of items to retrieve in the request. (optional)
     * @param startIndex The zero-based index of the first item to retrieve in a paginated request. (optional)
     * @param sortBy The property used for sorting the folder request results. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text value used as a filter parameter for folder content queries. (optional)
     * @param location The location context of the request, specifying the area  where the operation is performed, such as a room, documents, or a link. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/{folderId}")
    suspend fun getFolderByFolderId(@Path("folderId") folderId: kotlin.Int, @Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("sharedBy") sharedBy: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("roomId") roomId: kotlin.Int? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("extension") extension: kotlin.String? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("formsItemKey") formsItemKey: kotlin.String? = null, @Query("formsItemType") formsItemType: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null, @Query("Location") location: Location? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/log
     * Get folder history
     * Returns the activity history of a folder with a specified identifier.
     * Responses:
     *  - 200: List of actions in the folder
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getFolderHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
     *
     *
     * @param folderId The folder ID of the history request.
     * @param fromDate The start date of the history request. (optional)
     * @param toDate The end date of the history request. (optional)
     * @param count The number of records to retrieve for the folder history. (optional)
     * @param startIndex The starting index from which the history records are retrieved in the request. (optional)
     * @return [HistoryArrayWrapper]
     */
    @GET("api/2.0/files/folder/{folderId}/log")
    suspend fun getFolderHistory(@Path("folderId") folderId: kotlin.Int, @Query("fromDate") fromDate: ApiDateTime? = null, @Query("toDate") toDate: ApiDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<HistoryArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}
     * Get folder information
     * Returns the detailed information about a folder with the ID specified in the request.
     * Responses:
     *  - 200: Folder parameters
     *
     * REST API Reference for getFolderInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FolderIntegerWrapper]
     */
    @GET("api/2.0/files/folder/{folderId}")
    suspend fun getFolderInfo(@Path("folderId") folderId: kotlin.Int): Response<FolderIntegerWrapper>

    /**
     * GET api/2.0/files/folder/{id}/links
     * Get the folder links
     * Returns the links of the folder with the ID specified in the request.
     * Responses:
     *  - 200: Folder security information
     *  - 401: Unauthorized
     *
     * REST API Reference for getFolderLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
     *
     *
     * @param id The folder ID.
     * @return [FileShareArrayWrapper]
     */
    @GET("api/2.0/files/folder/{id}/links")
    suspend fun getFolderLinks(@Path("id") id: kotlin.Int): Response<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/path
     * Get the folder path
     * Returns a path to the folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *  - 401: Unauthorized
     *
     * REST API Reference for getFolderPath Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FileEntryBaseArrayWrapper]
     */
    @GET("api/2.0/files/folder/{folderId}/path")
    suspend fun getFolderPath(@Path("folderId") folderId: kotlin.Int): Response<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/folder/{id}/link
     * Get primary external link
     * Returns the primary external link by the identifier specified in the request.
     * Responses:
     *  - 200: Folder security information
     *  - 404: Not Found
     *
     * REST API Reference for getFolderPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-primary-external-link/
     *
     *
     * @param id The folder unique identifier.
     * @param count The number of items to retrieve in the request. (optional)
     * @param startIndex The starting index for the query results. (optional)
     * @return [FileShareWrapper]
     */
    @GET("api/2.0/files/folder/{id}/link")
    suspend fun getFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<FileShareWrapper>

    /**
     * GET api/2.0/files/{folderId}/subfolders
     * Get subfolders
     * Returns a list of all the subfolders from a folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *  - 401: Unauthorized
     *
     * REST API Reference for getFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FileEntryBaseArrayWrapper]
     */
    @GET("api/2.0/files/{folderId}/subfolders")
    suspend fun getFolders(@Path("folderId") folderId: kotlin.Int): Response<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/@my
     * Get the My documents section
     * Returns the detailed list of files and folders located in the My documents section.
     * Responses:
     *  - 200: The My documents section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getMyFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-my-folder/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
     * @param count The maximum number of items to retrieve in the response. (optional)
     * @param startIndex The starting position of the items to be retrieved. (optional)
     * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used for filtering or searching folder contents. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/@my")
    suspend fun getMyFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/{folderId}/news
     * Get new folder items
     * Returns a list of all the new items from a folder with the ID specified in the request.
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *  - 401: Unauthorized
     *
     * REST API Reference for getNewFolderItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [FileEntryBaseArrayWrapper]
     */
    @GET("api/2.0/files/{folderId}/news")
    suspend fun getNewFolderItems(@Path("folderId") folderId: kotlin.Int): Response<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/@privacy
     * Get the Private Room section
     * Returns the detailed list of files and folders located in the Private Room section.
     * Responses:
     *  - 200: The Private Room section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getPrivacyFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-privacy-folder/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param count The maximum number of items to retrieve in the request. (optional)
     * @param startIndex The zero-based index of the first item to retrieve in a paginated list. (optional)
     * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used as a filter or search criterion for folder content queries. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/@privacy")
    suspend fun getPrivacyFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/recent
     * Get the Recent section
     * Returns the detailed list of files located in the Recent section.
     * Responses:
     *  - 200: The Recent section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getRecentFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-recent-folder/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
     * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
     * @param searchArea The search area. (optional)
     * @param extension Specifies whether to search for a specific file extension in the Recent folder. (optional)
     * @param count The maximum number of items to return. (optional)
     * @param startIndex The starting position of the results to be returned in the query response. (optional)
     * @param sortBy Specifies the sorting criteria for the folder request. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used for filtering or searching folder contents. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/recent")
    suspend fun getRecentFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("extension") extension: CSVParams? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/@root
     * Get filtered sections
     * Returns all the sections matching the parameters specified in the request.
     * Responses:
     *  - 200: List of section contents with the following parameters
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getRootFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-root-folders/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param withoutTrash Specifies whether to return the Trash section or not. (optional)
     * @param count The maximum number of items to retrieve in the response. (optional)
     * @param startIndex The starting position of the items to be retrieved. (optional)
     * @param sortBy Specifies the field by which the folder content should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used as a filter for searching or retrieving folder contents. (optional)
     * @return [FolderContentIntegerArrayWrapper]
     */
    @GET("api/2.0/files/@root")
    suspend fun getRootFolders(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("withoutTrash") withoutTrash: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerArrayWrapper>

    /**
     * GET api/2.0/files/@trash
     * Get the Trash section
     * Returns the detailed list of files and folders located in the Trash section.
     * Responses:
     *  - 200: The Trash section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for getTrashFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-trash-folder/
     *
     *
     * @param userIdOrGroupId The user or group ID. (optional)
     * @param filterType The filter type. (optional)
     * @param applyFilterOption Specifies whether to return only files, only folders or all elements. (optional)
     * @param count The maximum number of items to retrieve in the response. (optional)
     * @param startIndex The starting position of the items to be retrieved. (optional)
     * @param sortBy The property used to specify the sorting criteria for folder contents. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text used for filtering or searching folder contents. (optional)
     * @return [FolderContentIntegerWrapper]
     */
    @GET("api/2.0/files/@trash")
    suspend fun getTrashFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Response<FolderContentIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/insert
     * Insert a file
     * Inserts a file specified in the request to the selected folder by single file uploading.
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
     *  - 401: Unauthorized
     *
     * REST API Reference for insertFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file/
     *
     *
     * @param folderId The folder ID for inserting a file.
     * @param insertFileFile The file to be inserted. (optional)
     * @param insertFileTitle The file title to be inserted. (optional)
     * @param insertFileCreateNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
     * @param insertFileKeepConvertStatus Specifies whether to keep the file converting status or not. (optional)
     * @param insertFileStreamCanRead  (optional)
     * @param insertFileStreamCanWrite  (optional)
     * @param insertFileStreamCanSeek  (optional)
     * @param insertFileStreamCanTimeout  (optional)
     * @param insertFileStreamLength  (optional)
     * @param insertFileStreamPosition  (optional)
     * @param insertFileStreamReadTimeout  (optional)
     * @param insertFileStreamWriteTimeout  (optional)
     * @return [FileIntegerWrapper]
     */
    @Multipart
    @POST("api/2.0/files/{folderId}/insert")
    suspend fun insertFile(@Path("folderId") folderId: kotlin.Int, @Part insertFileFile: MultipartBody.Part? = null, @Part("InsertFile.Title") insertFileTitle: kotlin.String? = null, @Part("InsertFile.CreateNewIfExist") insertFileCreateNewIfExist: kotlin.Boolean? = null, @Part("InsertFile.KeepConvertStatus") insertFileKeepConvertStatus: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanRead") insertFileStreamCanRead: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanWrite") insertFileStreamCanWrite: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanSeek") insertFileStreamCanSeek: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanTimeout") insertFileStreamCanTimeout: kotlin.Boolean? = null, @Part("InsertFile.Stream.Length") insertFileStreamLength: kotlin.Long? = null, @Part("InsertFile.Stream.Position") insertFileStreamPosition: kotlin.Long? = null, @Part("InsertFile.Stream.ReadTimeout") insertFileStreamReadTimeout: kotlin.Int? = null, @Part("InsertFile.Stream.WriteTimeout") insertFileStreamWriteTimeout: kotlin.Int? = null): Response<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/insert
     * Insert a file to the My documents section
     * Inserts a file specified in the request to the My documents section by single file uploading.
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
     *  - 401: Unauthorized
     *
     * REST API Reference for insertFileToMyFromBody Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/insert-file-to-my-from-body/
     *
     *
     * @param file The file to be inserted. (optional)
     * @param title The file title to be inserted. (optional)
     * @param createNewIfExist Specifies whether to create a new file if it already exists or not. (optional)
     * @param keepConvertStatus Specifies whether to keep the file converting status or not. (optional)
     * @param streamCanRead  (optional)
     * @param streamCanWrite  (optional)
     * @param streamCanSeek  (optional)
     * @param streamCanTimeout  (optional)
     * @param streamLength  (optional)
     * @param streamPosition  (optional)
     * @param streamReadTimeout  (optional)
     * @param streamWriteTimeout  (optional)
     * @return [FileIntegerWrapper]
     */
    @Multipart
    @POST("api/2.0/files/@my/insert")
    suspend fun insertFileToMyFromBody(@Part file: MultipartBody.Part? = null, @Part("Title") title: kotlin.String? = null, @Part("CreateNewIfExist") createNewIfExist: kotlin.Boolean? = null, @Part("KeepConvertStatus") keepConvertStatus: kotlin.Boolean? = null, @Part("Stream.CanRead") streamCanRead: kotlin.Boolean? = null, @Part("Stream.CanWrite") streamCanWrite: kotlin.Boolean? = null, @Part("Stream.CanSeek") streamCanSeek: kotlin.Boolean? = null, @Part("Stream.CanTimeout") streamCanTimeout: kotlin.Boolean? = null, @Part("Stream.Length") streamLength: kotlin.Long? = null, @Part("Stream.Position") streamPosition: kotlin.Long? = null, @Part("Stream.ReadTimeout") streamReadTimeout: kotlin.Int? = null, @Part("Stream.WriteTimeout") streamWriteTimeout: kotlin.Int? = null): Response<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}
     * Rename a folder
     * Renames the selected folder with a new title specified in the request.
     * Responses:
     *  - 200: Folder parameters
     *  - 403: You don't have enough permission to rename the folder
     *  - 401: Unauthorized
     *
     * REST API Reference for renameFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
     *
     *
     * @param folderId The folder ID for the folder creation.
     * @param createFolder The parameters for creating a folder.
     * @return [FolderIntegerWrapper]
     */
    @PUT("api/2.0/files/folder/{folderId}")
    suspend fun renameFolder(@Path("folderId") folderId: kotlin.Int, @Body createFolder: CreateFolder): Response<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}/order
     * Set folder order
     * Sets the order of a folder with ID specified in the request.
     * Responses:
     *  - 200: List of file operations
     *  - 401: Unauthorized
     *
     * REST API Reference for setFolderOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
     *
     *
     * @param folderId The folder unique identifier.
     * @param orderRequestDto The folder order information. (optional)
     * @return [FolderIntegerWrapper]
     */
    @PUT("api/2.0/files/folder/{folderId}/order")
    suspend fun setFolderOrder(@Path("folderId") folderId: kotlin.Int, @Body orderRequestDto: OrderRequestDto? = null): Response<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{id}/links
     * Set the folder external link
     * Sets the folder external link with the ID specified in the request.
     * Responses:
     *  - 200: Folder information
     *  - 401: Unauthorized
     *
     * REST API Reference for setFolderPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
     *
     *
     * @param id The folder ID.
     * @param folderLinkRequest The folder link parameters.
     * @return [FileShareWrapper]
     */
    @PUT("api/2.0/files/folder/{id}/links")
    suspend fun setFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Body folderLinkRequest: FolderLinkRequest): Response<FileShareWrapper>

    /**
     * POST api/2.0/files/{folderId}/upload
     * Upload a file
     * Uploads a file specified in the request to the selected folder by single file uploading or standart multipart/form-data method.
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
     *  - 401: Unauthorized
     *
     * REST API Reference for uploadFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
     *
     *
     * @param folderId The folder ID to upload a file.
     * @param uploadRequestDto The request parameters for uploading a file. (optional)
     * @return [ObjectWrapper]
     */
    @POST("api/2.0/files/{folderId}/upload")
    suspend fun uploadFile(@Path("folderId") folderId: kotlin.Int, @Body uploadRequestDto: UploadRequestDto? = null): Response<ObjectWrapper>

    /**
     * POST api/2.0/files/@my/upload
     * Upload a file to the My documents section
     * Uploads a file specified in the request to the My documents section by single file uploading or standart multipart/form-data method.
     * Responses:
     *  - 200: Uploaded file(s)
     *  - 403: You don't have enough permission to create
     *  - 404: File not found
     *  - 401: Unauthorized
     *
     * REST API Reference for uploadFileToMy Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
     *
     *
     * @param inDto The request parameters for uploading a file. (optional)
     * @return [ObjectWrapper]
     */
    @POST("api/2.0/files/@my/upload")
    suspend fun uploadFileToMy(@Query("inDto") inDto: UploadRequestDto? = null): Response<ObjectWrapper>

}
