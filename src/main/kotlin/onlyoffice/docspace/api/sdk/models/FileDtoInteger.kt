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

package onlyoffice.docspace.api.sdk.models

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.DraftLocationInteger
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.FileDtoIntegerAllOfViewAccessibility
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfAvailableShareRights
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfSecurity
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfShareSettings
import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.FileStatus
import onlyoffice.docspace.api.sdk.models.FileType
import onlyoffice.docspace.api.sdk.models.FolderType
import onlyoffice.docspace.api.sdk.models.FormFillingStatus
import onlyoffice.docspace.api.sdk.models.Size
import onlyoffice.docspace.api.sdk.models.Thumbnail
import onlyoffice.docspace.api.sdk.models.VectorizationStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file parameters.
 *
 * @param title The file entry title.
 * @param access 
 * @param sharedBy 
 * @param ownedBy 
 * @param shared Specifies if the file entry is shared via link or not.
 * @param sharedForUser Specifies if the file entry is shared for user or not.
 * @param sharedExternal Specifies if the file entry is shared via a public (non-internal) external link.
 * @param parentShared Indicates whether the parent entity is shared.
 * @param shortWebUrl The short Web URL.
 * @param created 
 * @param createdBy 
 * @param updated 
 * @param autoDelete 
 * @param rootFolderType 
 * @param parentRoomType 
 * @param updatedBy 
 * @param providerItem Specifies if the file entry provider is specified or not.
 * @param providerKey The provider key of the file entry.
 * @param providerId The provider ID of the file entry.
 * @param order The order of the file entry.
 * @param isFavorite Specifies if the file is a favorite or not.
 * @param fileEntryType 
 * @param id The file entry ID.
 * @param rootFolderId The root folder ID of the file entry.
 * @param originId The origin ID of the file entry.
 * @param originRoomId The origin room ID of the file entry.
 * @param originTitle The origin title of the file entry.
 * @param originRoomTitle The origin room title of the file entry.
 * @param canShare Specifies if the file entry can be shared or not.
 * @param shareSettings 
 * @param security 
 * @param availableShareRights 
 * @param requestToken The request token of the file entry.
 * @param `external` Specifies if the folder can be accessed via an external link or not.
 * @param expirationDate 
 * @param isLinkExpired Indicates whether the shareable link associated with the file or folder has expired.
 * @param folderId The folder ID where the file is located.
 * @param version The file version.
 * @param versionGroup The version group of the file.
 * @param contentLength The content length of the file.
 * @param pureContentLength The pure content length of the file.
 * @param fileStatus 
 * @param editingBy The list of users editing the file.
 * @param mute Specifies if the file is muted or not.
 * @param viewUrl The URL link to view the file.
 * @param webUrl The Web URL link to the file.
 * @param fileType 
 * @param fileExst The file extension.
 * @param comment The comment to the file.
 * @param encrypted Specifies if the file is encrypted or not.
 * @param thumbnailUrl The thumbnail URL of the file.
 * @param thumbnailStatus 
 * @param locked Specifies if the file is locked or not.
 * @param lockedBy The user ID of the person who locked the file.
 * @param hasDraft Specifies if the file has a draft or not.
 * @param formFillingStatus 
 * @param isForm Specifies if the file is a form or not.
 * @param customFilterEnabled Specifies if the Custom Filter editing mode is enabled for a file or not.
 * @param customFilterEnabledBy The name of the user who enabled a Custom Filter editing mode for a file.
 * @param startFilling Specifies if the filling has started or not.
 * @param isFillingPreparing Specifies if the form filling has started but the file is still being saved by the document editor. Filling and editing are not allowed.
 * @param inProcessFolderId The InProcess folder ID of the file.
 * @param inProcessFolderTitle The InProcess folder title of the file.
 * @param resultsFolderId The ID of the FormFillingFolderDone folder that corresponds to this original form.
 * @param draftLocation 
 * @param viewAccessibility 
 * @param lastOpened 
 * @param expired 
 * @param vectorizationStatus 
 * @param externalDbTableName The name of the table in the external database that corresponds to this form.
 * @param dimensions 
 */


data class FileDtoInteger (

    /* The file entry title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "sharedBy")
    val sharedBy: EmployeeDto? = null,

    @Json(name = "ownedBy")
    val ownedBy: EmployeeDto? = null,

    /* Specifies if the file entry is shared via link or not. */
    @Json(name = "shared")
    val shared: kotlin.Boolean? = null,

    /* Specifies if the file entry is shared for user or not. */
    @Json(name = "sharedForUser")
    val sharedForUser: kotlin.Boolean? = null,

    /* Specifies if the file entry is shared via a public (non-internal) external link. */
    @Json(name = "sharedExternal")
    val sharedExternal: kotlin.Boolean? = null,

    /* Indicates whether the parent entity is shared. */
    @Json(name = "parentShared")
    val parentShared: kotlin.Boolean? = null,

    /* The short Web URL. */
    @Json(name = "shortWebUrl")
    val shortWebUrl: java.net.URI? = null,

    @Json(name = "created")
    val created: ApiDateTime? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    @Json(name = "updated")
    val updated: ApiDateTime? = null,

    @Json(name = "autoDelete")
    val autoDelete: ApiDateTime? = null,

    @Json(name = "rootFolderType")
    val rootFolderType: FolderType? = null,

    @Json(name = "parentRoomType")
    val parentRoomType: FolderType? = null,

    @Json(name = "updatedBy")
    val updatedBy: EmployeeDto? = null,

    /* Specifies if the file entry provider is specified or not. */
    @Json(name = "providerItem")
    val providerItem: kotlin.Boolean? = null,

    /* The provider key of the file entry. */
    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null,

    /* The provider ID of the file entry. */
    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    /* The order of the file entry. */
    @Json(name = "order")
    val order: kotlin.String? = null,

    /* Specifies if the file is a favorite or not. */
    @Json(name = "isFavorite")
    val isFavorite: kotlin.Boolean? = null,

    @Json(name = "fileEntryType")
    val fileEntryType: FileEntryType? = null,

    /* The file entry ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The root folder ID of the file entry. */
    @Json(name = "rootFolderId")
    val rootFolderId: kotlin.Int? = null,

    /* The origin ID of the file entry. */
    @Json(name = "originId")
    val originId: kotlin.Int? = null,

    /* The origin room ID of the file entry. */
    @Json(name = "originRoomId")
    val originRoomId: kotlin.Int? = null,

    /* The origin title of the file entry. */
    @Json(name = "originTitle")
    val originTitle: kotlin.String? = null,

    /* The origin room title of the file entry. */
    @Json(name = "originRoomTitle")
    val originRoomTitle: kotlin.String? = null,

    /* Specifies if the file entry can be shared or not. */
    @Json(name = "canShare")
    val canShare: kotlin.Boolean? = null,

    @Json(name = "shareSettings")
    val shareSettings: FileEntryDtoIntegerAllOfShareSettings? = null,

    @Json(name = "security")
    val security: FileEntryDtoIntegerAllOfSecurity? = null,

    @Json(name = "availableShareRights")
    val availableShareRights: FileEntryDtoIntegerAllOfAvailableShareRights? = null,

    /* The request token of the file entry. */
    @Json(name = "requestToken")
    val requestToken: kotlin.String? = null,

    /* Specifies if the folder can be accessed via an external link or not. */
    @Json(name = "external")
    val `external`: kotlin.Boolean? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    /* Indicates whether the shareable link associated with the file or folder has expired. */
    @Json(name = "isLinkExpired")
    val isLinkExpired: kotlin.Boolean? = null,

    /* The folder ID where the file is located. */
    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    /* The file version. */
    @Json(name = "version")
    val version: kotlin.Int? = null,

    /* The version group of the file. */
    @Json(name = "versionGroup")
    val versionGroup: kotlin.Int? = null,

    /* The content length of the file. */
    @Json(name = "contentLength")
    val contentLength: kotlin.String? = null,

    /* The pure content length of the file. */
    @Json(name = "pureContentLength")
    val pureContentLength: kotlin.Long? = null,

    @Json(name = "fileStatus")
    val fileStatus: FileStatus? = null,

    /* The list of users editing the file. */
    @Json(name = "editingBy")
    val editingBy: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    /* Specifies if the file is muted or not. */
    @Json(name = "mute")
    val mute: kotlin.Boolean? = null,

    /* The URL link to view the file. */
    @Json(name = "viewUrl")
    val viewUrl: java.net.URI? = null,

    /* The Web URL link to the file. */
    @Json(name = "webUrl")
    val webUrl: java.net.URI? = null,

    @Json(name = "fileType")
    val fileType: FileType? = null,

    /* The file extension. */
    @Json(name = "fileExst")
    val fileExst: kotlin.String? = null,

    /* The comment to the file. */
    @Json(name = "comment")
    val comment: kotlin.String? = null,

    /* Specifies if the file is encrypted or not. */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean? = null,

    /* The thumbnail URL of the file. */
    @Json(name = "thumbnailUrl")
    val thumbnailUrl: java.net.URI? = null,

    @Json(name = "thumbnailStatus")
    val thumbnailStatus: Thumbnail? = null,

    /* Specifies if the file is locked or not. */
    @Json(name = "locked")
    val locked: kotlin.Boolean? = null,

    /* The user ID of the person who locked the file. */
    @Json(name = "lockedBy")
    val lockedBy: kotlin.String? = null,

    /* Specifies if the file has a draft or not. */
    @Json(name = "hasDraft")
    val hasDraft: kotlin.Boolean? = null,

    @Json(name = "formFillingStatus")
    val formFillingStatus: FormFillingStatus? = null,

    /* Specifies if the file is a form or not. */
    @Json(name = "isForm")
    val isForm: kotlin.Boolean? = null,

    /* Specifies if the Custom Filter editing mode is enabled for a file or not. */
    @Json(name = "customFilterEnabled")
    val customFilterEnabled: kotlin.Boolean? = null,

    /* The name of the user who enabled a Custom Filter editing mode for a file. */
    @Json(name = "customFilterEnabledBy")
    val customFilterEnabledBy: kotlin.String? = null,

    /* Specifies if the filling has started or not. */
    @Json(name = "startFilling")
    val startFilling: kotlin.Boolean? = null,

    /* Specifies if the form filling has started but the file is still being saved by the document editor. Filling and editing are not allowed. */
    @Json(name = "isFillingPreparing")
    val isFillingPreparing: kotlin.Boolean? = null,

    /* The InProcess folder ID of the file. */
    @Json(name = "inProcessFolderId")
    val inProcessFolderId: kotlin.Int? = null,

    /* The InProcess folder title of the file. */
    @Json(name = "inProcessFolderTitle")
    val inProcessFolderTitle: kotlin.String? = null,

    /* The ID of the FormFillingFolderDone folder that corresponds to this original form. */
    @Json(name = "resultsFolderId")
    val resultsFolderId: kotlin.Int? = null,

    @Json(name = "draftLocation")
    val draftLocation: DraftLocationInteger? = null,

    @Json(name = "viewAccessibility")
    val viewAccessibility: FileDtoIntegerAllOfViewAccessibility? = null,

    @Json(name = "lastOpened")
    val lastOpened: ApiDateTime? = null,

    @Json(name = "expired")
    val expired: ApiDateTime? = null,

    @Json(name = "vectorizationStatus")
    val vectorizationStatus: VectorizationStatus? = null,

    /* The name of the table in the external database that corresponds to this form. */
    @Json(name = "externalDbTableName")
    val externalDbTableName: kotlin.String? = null,

    @Json(name = "dimensions")
    val dimensions: Size? = null

) {


}

