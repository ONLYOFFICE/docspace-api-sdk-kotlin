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

import onlyoffice.docspace.api.sdk.models.*

import okhttp3.MultipartBody

interface FoldersApi {
    /**
     * POST api/2.0/files/{folderId}/upload/check
     * 
     * 
     * Responses:
     *  - 200: Inserted file
     *
     * REST API Reference for checkUpload Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/check-upload/
     *
     *
     * @param folderId The folder ID.
     * @param checkUploadRequest The request parameters for checking file uploads.
     * @return [Call]<[STRINGArrayWrapper]>
     */
    @POST("api/2.0/files/{folderId}/upload/check")
    fun checkUpload(@Path("folderId") folderId: kotlin.Int, @Body checkUploadRequest: CheckUploadRequest): Call<STRINGArrayWrapper>

    /**
     * POST api/2.0/files/folder/{folderId}
     * 
     * 
     * Responses:
     *  - 200: New folder parameters
     *
     * REST API Reference for createFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder/
     *
     *
     * @param folderId The folder ID for the folder creation.
     * @param createFolder The parameters for creating a folder.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @POST("api/2.0/files/folder/{folderId}")
    fun createFolder(@Path("folderId") folderId: kotlin.Int, @Body createFolder: CreateFolder): Call<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/folder/{id}/link
     * 
     * 
     * Responses:
     *  - 200: Folders security information
     *  - 404: Not Found
     *
     * REST API Reference for createFolderPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-folder-primary-external-link/
     *
     *
     * @param id The folder ID.
     * @param folderLinkRequest The folder link parameters.
     * @return [Call]<[FileShareWrapper]>
     */
    @POST("api/2.0/files/folder/{id}/link")
    fun createFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Body folderLinkRequest: FolderLinkRequest): Call<FileShareWrapper>

    /**
     * POST api/2.0/files/folder/{folderId}/log/report
     * 
     * 
     * Responses:
     *  - 200: URL to the report file
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required folder was not found
     *
     * REST API Reference for createReportFolderHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-report-folder-history/
     *
     *
     * @param folderId 
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/files/folder/{folderId}/log/report")
    fun createReportFolderHistory(@Path("folderId") folderId: kotlin.Int): Call<StringWrapper>

    /**
     * DELETE api/2.0/files/folder/{folderId}
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for deleteFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-folder/
     *
     *
     * @param folderId The folder ID to delete.
     * @param deleteFolder The parameters for deleting a folder.
     * @return [Call]<[FileOperationArrayWrapper]>
     */
    @DELETE("api/2.0/files/folder/{folderId}")
    fun deleteFolder(@Path("folderId") folderId: kotlin.Int, @Body deleteFolder: DeleteFolder): Call<FileOperationArrayWrapper>

    /**
     * GET api/2.0/files/@favorites
     * 
     * 
     * Responses:
     *  - 200: The Favorites section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/@favorites")
    fun getFavoritesFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/filesusedspace
     * 
     * 
     * Responses:
     *  - 200: Used space of files in the root folders
     *
     * REST API Reference for getFilesUsedSpace Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-files-used-space/
     *
     *
     * @return [Call]<[FilesStatisticsResultWrapper]>
     */
    @GET("api/2.0/files/filesusedspace")
    fun getFilesUsedSpace(): Call<FilesStatisticsResultWrapper>

    /**
     * GET api/2.0/files/{folderId}/formfilter
     * 
     * 
     * Responses:
     *  - 200: Ok
     *
     * REST API Reference for getFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [Call]<[FormsItemArrayWrapper]>
     */
    @GET("api/2.0/files/{folderId}/formfilter")
    fun getFolder(@Path("folderId") folderId: kotlin.Int): Call<FormsItemArrayWrapper>

    /**
     * GET api/2.0/files/{folderId}
     * 
     * 
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/{folderId}")
    fun getFolderByFolderId(@Path("folderId") folderId: kotlin.Int, @Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("roomId") roomId: kotlin.Int? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("extension") extension: kotlin.String? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("formsItemKey") formsItemKey: kotlin.String? = null, @Query("formsItemType") formsItemType: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null, @Query("Location") location: Location? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/log
     * 
     * 
     * Responses:
     *  - 200: List of actions in the folder
     *  - 403: You don't have enough permission to perform the operation
     *  - 404: The required folder was not found
     *
     * REST API Reference for getFolderHistory Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-history/
     *
     *
     * @param folderId The folder ID of the history request.
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param count The number of records to retrieve for the folder history. (optional)
     * @param startIndex The starting index from which the history records are retrieved in the request. (optional)
     * @return [Call]<[HistoryArrayWrapper]>
     */
    @GET("api/2.0/files/folder/{folderId}/log")
    fun getFolderHistory(@Path("folderId") folderId: kotlin.Int, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<HistoryArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}
     * 
     * 
     * Responses:
     *  - 200: Folder parameters
     *
     * REST API Reference for getFolderInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-info/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @GET("api/2.0/files/folder/{folderId}")
    fun getFolderInfo(@Path("folderId") folderId: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * GET api/2.0/files/folder/{id}/links
     * 
     * 
     * Responses:
     *  - 200: Folder security information
     *
     * REST API Reference for getFolderLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-links/
     *
     *
     * @param id The folder ID.
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/folder/{id}/links")
    fun getFolderLinks(@Path("id") id: kotlin.Int): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/folder/{folderId}/path
     * 
     * 
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *
     * REST API Reference for getFolderPath Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-path/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [Call]<[FileEntryBaseArrayWrapper]>
     */
    @GET("api/2.0/files/folder/{folderId}/path")
    fun getFolderPath(@Path("folderId") folderId: kotlin.Int): Call<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/folder/{id}/link
     * 
     * 
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
     * @return [Call]<[FileShareWrapper]>
     */
    @GET("api/2.0/files/folder/{id}/link")
    fun getFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<FileShareWrapper>

    /**
     * GET api/2.0/files/recent
     * 
     * 
     * Responses:
     *  - 200: The Recent section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
     *
     * REST API Reference for getFolderRecent Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folder-recent/
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/recent")
    fun getFolderRecent(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("extension") extension: CSVParams? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/{folderId}/subfolders
     * 
     * 
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *
     * REST API Reference for getFolders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-folders/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [Call]<[FileEntryBaseArrayWrapper]>
     */
    @GET("api/2.0/files/{folderId}/subfolders")
    fun getFolders(@Path("folderId") folderId: kotlin.Int): Call<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/@my
     * 
     * 
     * Responses:
     *  - 200: The My documents section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/@my")
    fun getMyFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/{folderId}/news
     * 
     * 
     * Responses:
     *  - 200: List of file entry information
     *  - 403: You don't have enough permission to view the folder content
     *
     * REST API Reference for getNewFolderItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-folder-items/
     *
     *
     * @param folderId The folder unique identifier.
     * @return [Call]<[FileEntryBaseArrayWrapper]>
     */
    @GET("api/2.0/files/{folderId}/news")
    fun getNewFolderItems(@Path("folderId") folderId: kotlin.Int): Call<FileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/@privacy
     * 
     * 
     * Responses:
     *  - 200: The Private Room section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/@privacy")
    fun getPrivacyFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/@recent
     * 
     * 
     * Responses:
     *  - 200: The Recent section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/@recent")
    fun getRecentFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("extension") extension: CSVParams? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/@root
     * 
     * 
     * Responses:
     *  - 200: List of section contents with the following parameters
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerArrayWrapper]>
     */
    @GET("api/2.0/files/@root")
    fun getRootFolders(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("withoutTrash") withoutTrash: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerArrayWrapper>

    /**
     * GET api/2.0/files/@trash
     * 
     * 
     * Responses:
     *  - 200: The Trash section contents
     *  - 403: You don't have enough permission to view the folder content
     *  - 404: The required folder was not found
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
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/@trash")
    fun getTrashFolder(@Query("userIdOrGroupId") userIdOrGroupId: java.util.UUID? = null, @Query("filterType") filterType: FilterType? = null, @Query("applyFilterOption") applyFilterOption: ApplyFilterOption? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FolderContentIntegerWrapper>

    /**
     * POST api/2.0/files/{folderId}/insert
     * 
     * 
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
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
     * @return [Call]<[FileIntegerWrapper]>
     */
    @Multipart
    @POST("api/2.0/files/{folderId}/insert")
    fun insertFile(@Path("folderId") folderId: kotlin.Int, @Part insertFileFile: MultipartBody.Part? = null, @Part("InsertFile.Title") insertFileTitle: kotlin.String? = null, @Part("InsertFile.CreateNewIfExist") insertFileCreateNewIfExist: kotlin.Boolean? = null, @Part("InsertFile.KeepConvertStatus") insertFileKeepConvertStatus: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanRead") insertFileStreamCanRead: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanWrite") insertFileStreamCanWrite: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanSeek") insertFileStreamCanSeek: kotlin.Boolean? = null, @Part("InsertFile.Stream.CanTimeout") insertFileStreamCanTimeout: kotlin.Boolean? = null, @Part("InsertFile.Stream.Length") insertFileStreamLength: kotlin.Long? = null, @Part("InsertFile.Stream.Position") insertFileStreamPosition: kotlin.Long? = null, @Part("InsertFile.Stream.ReadTimeout") insertFileStreamReadTimeout: kotlin.Int? = null, @Part("InsertFile.Stream.WriteTimeout") insertFileStreamWriteTimeout: kotlin.Int? = null): Call<FileIntegerWrapper>

    /**
     * POST api/2.0/files/@my/insert
     * 
     * 
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
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
     * @return [Call]<[FileIntegerWrapper]>
     */
    @Multipart
    @POST("api/2.0/files/@my/insert")
    fun insertFileToMyFromBody(@Part file: MultipartBody.Part? = null, @Part("Title") title: kotlin.String? = null, @Part("CreateNewIfExist") createNewIfExist: kotlin.Boolean? = null, @Part("KeepConvertStatus") keepConvertStatus: kotlin.Boolean? = null, @Part("Stream.CanRead") streamCanRead: kotlin.Boolean? = null, @Part("Stream.CanWrite") streamCanWrite: kotlin.Boolean? = null, @Part("Stream.CanSeek") streamCanSeek: kotlin.Boolean? = null, @Part("Stream.CanTimeout") streamCanTimeout: kotlin.Boolean? = null, @Part("Stream.Length") streamLength: kotlin.Long? = null, @Part("Stream.Position") streamPosition: kotlin.Long? = null, @Part("Stream.ReadTimeout") streamReadTimeout: kotlin.Int? = null, @Part("Stream.WriteTimeout") streamWriteTimeout: kotlin.Int? = null): Call<FileIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}
     * 
     * 
     * Responses:
     *  - 200: Folder parameters
     *  - 403: You don't have enough permission to rename the folder
     *
     * REST API Reference for renameFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/rename-folder/
     *
     *
     * @param folderId The folder ID for the folder creation.
     * @param createFolder The parameters for creating a folder.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/folder/{folderId}")
    fun renameFolder(@Path("folderId") folderId: kotlin.Int, @Body createFolder: CreateFolder): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{folderId}/order
     * 
     * 
     * Responses:
     *  - 200: List of file operations
     *
     * REST API Reference for setFolderOrder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-order/
     *
     *
     * @param folderId The folder unique identifier.
     * @param orderRequestDto The folder order information. (optional)
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/folder/{folderId}/order")
    fun setFolderOrder(@Path("folderId") folderId: kotlin.Int, @Body orderRequestDto: OrderRequestDto? = null): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/folder/{id}/links
     * 
     * 
     * Responses:
     *  - 200: Folder information
     *
     * REST API Reference for setFolderPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-folder-primary-external-link/
     *
     *
     * @param id The folder ID.
     * @param folderLinkRequest The folder link parameters.
     * @return [Call]<[FileShareWrapper]>
     */
    @PUT("api/2.0/files/folder/{id}/links")
    fun setFolderPrimaryExternalLink(@Path("id") id: kotlin.Int, @Body folderLinkRequest: FolderLinkRequest): Call<FileShareWrapper>

    /**
     * POST api/2.0/files/{folderId}/upload
     * 
     * 
     * Responses:
     *  - 200: Inserted file
     *  - 403: You don't have enough permission to create
     *  - 404: Folder not found
     *
     * REST API Reference for uploadFile Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file/
     *
     *
     * @param folderId The folder ID to upload a file.
     * @param uploadRequestDto The request parameters for uploading a file. (optional)
     * @return [Call]<[ObjectWrapper]>
     */
    @POST("api/2.0/files/{folderId}/upload")
    fun uploadFile(@Path("folderId") folderId: kotlin.Int, @Body uploadRequestDto: UploadRequestDto? = null): Call<ObjectWrapper>

    /**
     * POST api/2.0/files/@my/upload
     * 
     * 
     * Responses:
     *  - 200: Uploaded file(s)
     *  - 403: You don't have enough permission to create
     *  - 404: File not found
     *
     * REST API Reference for uploadFileToMy Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-file-to-my/
     *
     *
     * @param file The file to be uploaded. (optional)
     * @param contentType  (optional)
     * @param contentDisposition  (optional)
     * @param files The list of files when specified as multipart/form-data. (optional)
     * @param createNewIfExist Specifies whether to create the new file if it already exists or not. (optional)
     * @param storeOriginalFileFlag Specifies whether to upload documents in the original formats as well or not. (optional)
     * @param keepConvertStatus Specifies whether to keep the file converting status or not. (optional)
     * @param stream The request input stream. (optional)
     * @return [Call]<[ObjectWrapper]>
     */
    @POST("api/2.0/files/@my/upload")
    fun uploadFileToMy(@Query("file") file: java.io.File? = null, @Query("contentType") contentType: ContentType? = null, @Query("contentDisposition") contentDisposition: ContentDisposition? = null, @Query("files") files: kotlin.collections.List<java.io.File>? = null, @Query("createNewIfExist") createNewIfExist: kotlin.Boolean? = null, @Query("storeOriginalFileFlag") storeOriginalFileFlag: kotlin.Boolean? = null, @Query("keepConvertStatus") keepConvertStatus: kotlin.Boolean? = null, @Query("stream") stream: java.io.File? = null): Call<ObjectWrapper>

}
