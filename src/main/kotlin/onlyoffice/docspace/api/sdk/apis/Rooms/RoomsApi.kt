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


package onlyoffice.docspace.api.sdk.apis.Rooms

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ArchiveRoomRequest
import onlyoffice.docspace.api.sdk.models.BatchTagsRequestDto
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CoverRequestDto
import onlyoffice.docspace.api.sdk.models.CoversResultArrayWrapper
import onlyoffice.docspace.api.sdk.models.CreateRoomFromTemplateDto
import onlyoffice.docspace.api.sdk.models.CreateRoomRequestDto
import onlyoffice.docspace.api.sdk.models.CreateTagRequestDto
import onlyoffice.docspace.api.sdk.models.CreateThirdPartyRoom
import onlyoffice.docspace.api.sdk.models.DeleteRoomRequest
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.FileOperationWrapper
import onlyoffice.docspace.api.sdk.models.FileShareArrayWrapper
import onlyoffice.docspace.api.sdk.models.FileShareWrapper
import onlyoffice.docspace.api.sdk.models.FolderContentIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FolderIntegerWrapper
import onlyoffice.docspace.api.sdk.models.FolderStringWrapper
import onlyoffice.docspace.api.sdk.models.KeyValuePairStringStringValues
import onlyoffice.docspace.api.sdk.models.LinkType
import onlyoffice.docspace.api.sdk.models.LogoRequest
import onlyoffice.docspace.api.sdk.models.NewItemsFileEntryBaseArrayWrapper
import onlyoffice.docspace.api.sdk.models.NewItemsRoomNewItemsArrayWrapper
import onlyoffice.docspace.api.sdk.models.ObjectArrayWrapper
import onlyoffice.docspace.api.sdk.models.ProviderFilter
import onlyoffice.docspace.api.sdk.models.QuotaFilter
import onlyoffice.docspace.api.sdk.models.RoomFromTemplateStatusWrapper
import onlyoffice.docspace.api.sdk.models.RoomInvitationRequest
import onlyoffice.docspace.api.sdk.models.RoomLinkRequest
import onlyoffice.docspace.api.sdk.models.RoomSecurityWrapper
import onlyoffice.docspace.api.sdk.models.RoomTemplateDto
import onlyoffice.docspace.api.sdk.models.RoomTemplateStatusWrapper
import onlyoffice.docspace.api.sdk.models.RoomType
import onlyoffice.docspace.api.sdk.models.SearchArea
import onlyoffice.docspace.api.sdk.models.SetPublicDto
import onlyoffice.docspace.api.sdk.models.ShareFilterType
import onlyoffice.docspace.api.sdk.models.SortOrder
import onlyoffice.docspace.api.sdk.models.StorageFilter
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.SubjectFilter
import onlyoffice.docspace.api.sdk.models.UpdateRoomRequest
import onlyoffice.docspace.api.sdk.models.UpdateTagRequestDto
import onlyoffice.docspace.api.sdk.models.UploadResultWrapper
import onlyoffice.docspace.api.sdk.models.UserInvitation

interface RoomsApi {
    /**
     * PUT api/2.0/files/rooms/{id}/tags
     * Add the room tags
     * Adds the tags to a room with the ID specified in the request.
     * Responses:
     *  - 200: Room information
     *  - 403: You don't have permission to edit the room
     *  - 401: Unauthorized
     *
     * REST API Reference for addRoomTags Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-room-tags/
     *
     *
     * @param id The room Id.
     * @param batchTagsRequestDto The parameters for managing tags. (optional)
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/tags")
    fun addRoomTags(@Path("id") id: kotlin.Int, @Body batchTagsRequestDto: BatchTagsRequestDto? = null): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}/archive
     * Archive a room
     * Moves a room with the ID specified in the request to the Archive section.
     * Responses:
     *  - 200: File operation
     *  - 401: Unauthorized
     *
     * REST API Reference for archiveRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/archive-room/
     *
     *
     * @param id The room ID.
     * @param archiveRoomRequest The parameters for archiving a room. (optional)
     * @return [Call]<[FileOperationWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/archive")
    fun archiveRoom(@Path("id") id: kotlin.Int, @Body archiveRoomRequest: ArchiveRoomRequest? = null): Call<FileOperationWrapper>

    /**
     * POST api/2.0/files/rooms/{id}/cover
     * Change the room cover
     * Changes a cover of a room with the ID specified in the request.
     * Responses:
     *  - 200: Room cover
     *  - 403: You don't have permission to change cover
     *  - 404: The required room was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for changeRoomCover Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-room-cover/
     *
     *
     * @param id The room ID.
     * @param coverRequestDto The request parameters to change the room cover.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @POST("api/2.0/files/rooms/{id}/cover")
    fun changeRoomCover(@Path("id") id: kotlin.Int, @Body coverRequestDto: CoverRequestDto): Call<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/rooms
     * Create a room
     * Creates a room in the Rooms section.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room/
     *
     *
     * @param createRoomRequestDto  (optional)
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @POST("api/2.0/files/rooms")
    fun createRoom(@Body createRoomRequestDto: CreateRoomRequestDto? = null): Call<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/rooms/fromtemplate
     * Create a room from the template
     * Creates a room in the Rooms section based on the template.
     * Responses:
     *  - 200: Status
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoomFromTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-from-template/
     *
     *
     * @param createRoomFromTemplateDto  (optional)
     * @return [Call]<[RoomFromTemplateStatusWrapper]>
     */
    @POST("api/2.0/files/rooms/fromtemplate")
    fun createRoomFromTemplate(@Body createRoomFromTemplateDto: CreateRoomFromTemplateDto? = null): Call<RoomFromTemplateStatusWrapper>

    /**
     * POST api/2.0/files/rooms/{id}/logo
     * Create a room logo
     * Creates a logo for a room with the ID specified in the request.
     * Responses:
     *  - 200: Room information
     *  - 404: The required room was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoomLogo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-logo/
     *
     *
     * @param id The room ID.
     * @param logoRequest The logo request parameters.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @POST("api/2.0/files/rooms/{id}/logo")
    fun createRoomLogo(@Path("id") id: kotlin.Int, @Body logoRequest: LogoRequest): Call<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/tags
     * Create a room tag
     * Creates a custom room tag with the parameters specified in the request.
     * Responses:
     *  - 200: New tag name
     *  - 403: You don't have enough permission to perform the operation
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoomTag Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-tag/
     *
     *
     * @param createTagRequestDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/files/tags")
    fun createRoomTag(@Body createTagRequestDto: CreateTagRequestDto? = null): Call<StringWrapper>

    /**
     * POST api/2.0/files/roomtemplate
     * Start creating room template
     * Starts creating the room template.
     * Responses:
     *  - 200: Status
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoomTemplate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-template/
     *
     *
     * @param roomTemplateDto  (optional)
     * @return [Call]<[RoomTemplateStatusWrapper]>
     */
    @POST("api/2.0/files/roomtemplate")
    fun createRoomTemplate(@Body roomTemplateDto: RoomTemplateDto? = null): Call<RoomTemplateStatusWrapper>

    /**
     * POST api/2.0/files/rooms/thirdparty/{id}
     * Create a third-party room
     * Creates a room in the Rooms section stored in a third-party storage.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for createRoomThirdParty Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-room-third-party/
     *
     *
     * @param id The ID of the folder in the third-party storage in which the contents of the room will be stored.
     * @param createThirdPartyRoom The third-party room information.
     * @return [Call]<[FolderStringWrapper]>
     */
    @POST("api/2.0/files/rooms/thirdparty/{id}")
    fun createRoomThirdParty(@Path("id") id: kotlin.String, @Body createThirdPartyRoom: CreateThirdPartyRoom): Call<FolderStringWrapper>

    /**
     * DELETE api/2.0/files/tags
     * Delete the custom room tags
     * Deletes a bunch of custom tags specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 403: You don't have enough permission to perform the operation
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteCustomTags Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-custom-tags/
     *
     *
     * @param batchTagsRequestDto  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/2.0/files/tags")
    fun deleteCustomTags(@Body batchTagsRequestDto: BatchTagsRequestDto? = null): Call<Unit>

    /**
     * DELETE api/2.0/files/rooms/{id}
     * Remove a room
     * Removes a room with the ID specified in the request.
     * Responses:
     *  - 200: File operation
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room/
     *
     *
     * @param id The room ID.
     * @param deleteRoomRequest The parameters for deleting a room.
     * @return [Call]<[FileOperationWrapper]>
     */
    @DELETE("api/2.0/files/rooms/{id}")
    fun deleteRoom(@Path("id") id: kotlin.Int, @Body deleteRoomRequest: DeleteRoomRequest): Call<FileOperationWrapper>

    /**
     * DELETE api/2.0/files/rooms/{id}/logo
     * Remove a room logo
     * Removes a logo from a room with the ID specified in the request.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteRoomLogo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-logo/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @DELETE("api/2.0/files/rooms/{id}/logo")
    fun deleteRoomLogo(@Path("id") id: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * DELETE api/2.0/files/rooms/{id}/tags
     * Remove the room tags
     * Removes the tags from a room with the ID specified in the request.
     * Responses:
     *  - 200: Room information
     *  - 403: You don't have permission to edit the room
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteRoomTags Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-room-tags/
     *
     *
     * @param id The room Id.
     * @param batchTagsRequestDto The parameters for managing tags. (optional)
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @DELETE("api/2.0/files/rooms/{id}/tags")
    fun deleteRoomTags(@Path("id") id: kotlin.Int, @Body batchTagsRequestDto: BatchTagsRequestDto? = null): Call<FolderIntegerWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/news
     * Get the new room items
     * Returns a list of all the new items from a room with the ID specified in the request.
     * Responses:
     *  - 200: List of file entry information
     *  - 401: Unauthorized
     *
     * REST API Reference for getNewRoomItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-new-room-items/
     *
     *
     * @param id The room ID.
     * @return [Call]<[NewItemsFileEntryBaseArrayWrapper]>
     */
    @GET("api/2.0/files/rooms/{id}/news")
    fun getNewRoomItems(@Path("id") id: kotlin.Int): Call<NewItemsFileEntryBaseArrayWrapper>

    /**
     * GET api/2.0/files/roomtemplate/{id}/public
     * Get public settings
     * Returns the public settings of the room template with the ID specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for getPublicSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-public-settings/
     *
     *
     * @param id The room template ID.
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/files/roomtemplate/{id}/public")
    fun getPublicSettings(@Path("id") id: kotlin.Int): Call<BooleanWrapper>

    /**
     * GET api/2.0/files/rooms/covers
     * Get covers
     * Returns a list of all covers.
     * Responses:
     *  - 200: Gets room cover
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomCovers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-covers/
     *
     *
     * @return [Call]<[CoversResultArrayWrapper]>
     */
    @GET("api/2.0/files/rooms/covers")
    fun getRoomCovers(): Call<CoversResultArrayWrapper>

    /**
     * GET api/2.0/files/rooms/fromtemplate/status
     * Get the room creation progress
     * Returns the progress of creating a room from the template.
     * Responses:
     *  - 200: Status
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomCreatingStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-creating-status/
     *
     *
     * @return [Call]<[RoomFromTemplateStatusWrapper]>
     */
    @GET("api/2.0/files/rooms/fromtemplate/status")
    fun getRoomCreatingStatus(): Call<RoomFromTemplateStatusWrapper>

    /**
     * GET api/2.0/files/rooms/indexexport
     * Get the room index export
     * Returns the room index export.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomIndexExport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-index-export/
     *
     *
     * @return [Call]<[DocumentBuilderTaskWrapper]>
     */
    @GET("api/2.0/files/rooms/indexexport")
    fun getRoomIndexExport(): Call<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/files/rooms/{id}
     * Get room information
     * Returns the room information.
     * Responses:
     *  - 200: Room information
     *
     * REST API Reference for getRoomInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-info/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @GET("api/2.0/files/rooms/{id}")
    fun getRoomInfo(@Path("id") id: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/links
     * Get the room links
     * Returns the links of the room with the ID specified in the request.
     * Responses:
     *  - 200: Room security information
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-links/
     *
     *
     * @param id The room ID.
     * @param type The link type. (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/rooms/{id}/links")
    fun getRoomLinks(@Path("id") id: kotlin.Int, @Query("type") type: LinkType? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/share
     * Get the room access rights
     * Returns the access rights of a room with the ID specified in the request.
     * Responses:
     *  - 200: Security information of room files
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomSecurityInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-security-info/
     *
     *
     * @param id The room ID.
     * @param filterType The filter type of the access rights. (optional)
     * @param count The number of items to be retrieved or processed. (optional)
     * @param startIndex The starting index of the items to retrieve in a paginated request. (optional)
     * @param filterValue The text filter value used for filtering room security information. (optional)
     * @return [Call]<[FileShareArrayWrapper]>
     */
    @GET("api/2.0/files/rooms/{id}/share")
    fun getRoomSecurityInfo(@Path("id") id: kotlin.Int, @Query("filterType") filterType: ShareFilterType? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<FileShareArrayWrapper>

    /**
     * GET api/2.0/files/tags
     * Get the room tags
     * Returns a list of custom tags.
     * Responses:
     *  - 200: List of tag names
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomTagsInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-tags-info/
     *
     *
     * @param count Gets or sets the number of tag results to retrieve.  This property specifies the maximum amount of tag data to be included in the result set. (optional)
     * @param startIndex Represents the starting index from which the tags&#39; information will be retrieved.  This property is used to define the offset for pagination when retrieving a list of tags. It determines  the point in the data set from which the retrieval begins. (optional)
     * @param filterValue Gets or sets the text value used for searching tags.  This property is typically used as a filter value when retrieving tag information. (optional)
     * @return [Call]<[ObjectArrayWrapper]>
     */
    @GET("api/2.0/files/tags")
    fun getRoomTagsInfo(@Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<ObjectArrayWrapper>

    /**
     * GET api/2.0/files/roomtemplate/status
     * Get status of room template creation
     * Returns the progress status of the room template creation process.
     * Responses:
     *  - 200: Status
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomTemplateCreatingStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-room-template-creating-status/
     *
     *
     * @return [Call]<[RoomTemplateStatusWrapper]>
     */
    @GET("api/2.0/files/roomtemplate/status")
    fun getRoomTemplateCreatingStatus(): Call<RoomTemplateStatusWrapper>

    /**
     * GET api/2.0/files/rooms
     * Get rooms
     * Returns the contents of the Rooms section by the parameters specified in the request.
     * Responses:
     *  - 200: Returns the contents of the Rooms section
     *  - 403: You don't have enough permission to view the room content
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomsFolder Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-folder/
     *
     *
     * @param type The filter by room type. (optional)
     * @param subjectId The filter by user ID. (optional)
     * @param searchArea The room search area (Active, Archive, Any, Recent by links). (optional)
     * @param withoutTags Specifies whether to search by tags or not. (optional)
     * @param tags The tags in the serialized format. (optional)
     * @param excludeSubject Specifies whether to exclude search by user or group ID. (optional)
     * @param provider The filter by provider name (None, Box, DropBox, GoogleDrive, kDrive, OneDrive, SharePoint, WebDav, Yandex, Storage). (optional)
     * @param subjectFilter The filter by user (Owner - 0, Member - 1). (optional)
     * @param quotaFilter The filter by quota (All - 0, Default - 1, Custom - 2). (optional)
     * @param storageFilter The filter by storage (None - 0, Internal - 1, ThirdParty - 2). (optional)
     * @param count Specifies the maximum number of items to retrieve. (optional)
     * @param startIndex The index from which to start retrieving the room content. (optional)
     * @param sortBy Specifies the field by which the room content should be sorted. (optional)
     * @param sortOrder The order in which the results are sorted. (optional)
     * @param filterValue The text filter value used to refine search or query operations. (optional)
     * @param groupId The group ID (optional)
     * @return [Call]<[FolderContentIntegerWrapper]>
     */
    @GET("api/2.0/files/rooms")
    fun getRoomsFolder(@Query("type") type: CSVParams? = null, @Query("subjectId") subjectId: kotlin.String? = null, @Query("searchArea") searchArea: SearchArea? = null, @Query("withoutTags") withoutTags: kotlin.Boolean? = null, @Query("tags") tags: kotlin.String? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("provider") provider: ProviderFilter? = null, @Query("subjectFilter") subjectFilter: SubjectFilter? = null, @Query("quotaFilter") quotaFilter: QuotaFilter? = null, @Query("storageFilter") storageFilter: StorageFilter? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: SortOrder? = null, @Query("filterValue") filterValue: kotlin.String? = null, @Query("groupId") groupId: kotlin.Int? = null): Call<FolderContentIntegerWrapper>

    /**
     * GET api/2.0/files/rooms/news
     * Get the room new items
     * Returns the room new items.
     * Responses:
     *  - 200: List of new items
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomsNewItems Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-new-items/
     *
     *
     * @return [Call]<[NewItemsRoomNewItemsArrayWrapper]>
     */
    @GET("api/2.0/files/rooms/news")
    fun getRoomsNewItems(): Call<NewItemsRoomNewItemsArrayWrapper>

    /**
     * GET api/2.0/files/rooms/{id}/link
     * Get the room primary external link
     * Returns the primary external link of the room with the ID specified in the request.
     * Responses:
     *  - 200: Room security information
     *  - 404: Not Found
     *  - 401: Unauthorized
     *
     * REST API Reference for getRoomsPrimaryExternalLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-rooms-primary-external-link/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FileShareWrapper]>
     */
    @GET("api/2.0/files/rooms/{id}/link")
    fun getRoomsPrimaryExternalLink(@Path("id") id: kotlin.Int): Call<FileShareWrapper>

    /**
     * GET api/2.0/files/tags/{tagName}/haslinks
     * Has tag links
     * Checks if a specific custom tag has linked items.
     * Responses:
     *  - 200: True if tag has links, false otherwise
     *  - 404: Tag not found
     *  - 401: Unauthorized
     *
     * REST API Reference for hasTagLinks Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/has-tag-links/
     *
     *
     * @param tagName 
     * @return [Call]<[BooleanWrapper]>
     */
    @GET("api/2.0/files/tags/{tagName}/haslinks")
    fun hasTagLinks(@Path("tagName") tagName: kotlin.String): Call<BooleanWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}/pin
     * Pin a room
     * Pins a room with the ID specified in the request to the top of the list.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for pinRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/pin-room/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/pin")
    fun pinRoom(@Path("id") id: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}/reorder
     * Reorder the room
     * Reorders the room with ID specified in the request.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for reorderRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reorder-room/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/reorder")
    fun reorderRoom(@Path("id") id: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * POST api/2.0/files/rooms/{id}/resend
     * Resend the room invitations
     * Resends the email invitations to a room with the ID specified in the request to the selected users.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for resendEmailInvitations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-email-invitations/
     *
     *
     * @param id The room ID.
     * @param userInvitation The user invitation parameters.
     * @return [Call]<[Unit]>
     */
    @POST("api/2.0/files/rooms/{id}/resend")
    fun resendEmailInvitations(@Path("id") id: kotlin.Int, @Body userInvitation: UserInvitation): Call<Unit>

    /**
     * PUT api/2.0/files/roomtemplate/public
     * Set public settings
     * Sets the public settings for the room template with the ID specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for setPublicSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-public-settings/
     *
     *
     * @param setPublicDto  (optional)
     * @return [Call]<[Unit]>
     */
    @PUT("api/2.0/files/roomtemplate/public")
    fun setPublicSettings(@Body setPublicDto: SetPublicDto? = null): Call<Unit>

    /**
     * PUT api/2.0/files/rooms/{id}/links
     * Set the room external or invitation link
     * Sets the room external or invitation link with the ID specified in the request.
     * Responses:
     *  - 200: Room security information
     *  - 401: Unauthorized
     *
     * REST API Reference for setRoomLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-link/
     *
     *
     * @param id The room ID.
     * @param roomLinkRequest The room link parameters.
     * @return [Call]<[FileShareWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/links")
    fun setRoomLink(@Path("id") id: kotlin.Int, @Body roomLinkRequest: RoomLinkRequest): Call<FileShareWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}/share
     * Set the room access rights
     * Sets the access rights to the room with the ID specified in the request.
     * Responses:
     *  - 200: Room security information
     *  - 401: Unauthorized
     *
     * REST API Reference for setRoomSecurity Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-room-security/
     *
     *
     * @param id The room ID.
     * @param roomInvitationRequest The room invitation request.
     * @return [Call]<[RoomSecurityWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/share")
    fun setRoomSecurity(@Path("id") id: kotlin.Int, @Body roomInvitationRequest: RoomInvitationRequest): Call<RoomSecurityWrapper>

    /**
     * POST api/2.0/files/rooms/{id}/indexexport
     * Start the room index export
     * Starts the index export of a room with the ID specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 501: Folder indexing is turned off
     *  - 401: Unauthorized
     *
     * REST API Reference for startRoomIndexExport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-room-index-export/
     *
     *
     * @param id The room ID.
     * @return [Call]<[DocumentBuilderTaskWrapper]>
     */
    @POST("api/2.0/files/rooms/{id}/indexexport")
    fun startRoomIndexExport(@Path("id") id: kotlin.Int): Call<DocumentBuilderTaskWrapper>

    /**
     * DELETE api/2.0/files/rooms/indexexport
     * Terminate the room index export
     * Terminates the room index export.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for terminateRoomIndexExport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-room-index-export/
     *
     *
     * @return [Call]<[Unit]>
     */
    @DELETE("api/2.0/files/rooms/indexexport")
    fun terminateRoomIndexExport(): Call<Unit>

    /**
     * PUT api/2.0/files/rooms/{id}/unarchive
     * Unarchive a room
     * Moves a room with the ID specified in the request from the Archive section to the Rooms section.
     * Responses:
     *  - 200: File operation
     *  - 401: Unauthorized
     *
     * REST API Reference for unarchiveRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unarchive-room/
     *
     *
     * @param id The room ID.
     * @param archiveRoomRequest The parameters for archiving a room. (optional)
     * @return [Call]<[FileOperationWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/unarchive")
    fun unarchiveRoom(@Path("id") id: kotlin.Int, @Body archiveRoomRequest: ArchiveRoomRequest? = null): Call<FileOperationWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}/unpin
     * Unpin a room
     * Unpins a room with the ID specified in the request from the top of the list.
     * Responses:
     *  - 200: Room information
     *  - 401: Unauthorized
     *
     * REST API Reference for unpinRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unpin-room/
     *
     *
     * @param id The room ID.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}/unpin")
    fun unpinRoom(@Path("id") id: kotlin.Int): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/rooms/{id}
     * Update a room
     * Updates a room with the ID specified in the request.
     * Responses:
     *  - 200: Updated room information
     *  - 401: Unauthorized
     *
     * REST API Reference for updateRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room/
     *
     *
     * @param id The room ID.
     * @param updateRoomRequest The request parameters for updating a room.
     * @return [Call]<[FolderIntegerWrapper]>
     */
    @PUT("api/2.0/files/rooms/{id}")
    fun updateRoom(@Path("id") id: kotlin.Int, @Body updateRoomRequest: UpdateRoomRequest): Call<FolderIntegerWrapper>

    /**
     * PUT api/2.0/files/tags
     * Update tag
     * Updates the name of a custom tag.
     * Responses:
     *  - 200: Updated tag name
     *  - 403: You don't have enough permission to perform the operation
     *  - 401: Unauthorized
     *
     * REST API Reference for updateRoomTag Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-room-tag/
     *
     *
     * @param updateTagRequestDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @PUT("api/2.0/files/tags")
    fun updateRoomTag(@Body updateTagRequestDto: UpdateTagRequestDto? = null): Call<StringWrapper>

    /**
     * POST api/2.0/files/logos
     * Upload a room logo image
     * Uploads a temporary image to create a room logo.
     * Responses:
     *  - 200: Upload result
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for uploadRoomLogo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/upload-room-logo/
     *
     *
     * @param formCollection The image data. (optional)
     * @return [Call]<[UploadResultWrapper]>
     */
    @Multipart
    @POST("api/2.0/files/logos")
    fun uploadRoomLogo(@Part("FormCollection") formCollection: kotlin.collections.List<KeyValuePairStringStringValues>? = null): Call<UploadResultWrapper>

}
