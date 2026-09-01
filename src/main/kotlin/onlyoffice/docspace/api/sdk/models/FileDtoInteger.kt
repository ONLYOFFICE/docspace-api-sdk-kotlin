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
 * @param access The access rights to the file entry.
 * @param sharedBy Provides information about the employee who shared the file or folder.
 * @param ownedBy The information about the employee who owns the file entry.
 * @param shared Specifies if the file entry is shared via link or not.
 * @param sharedForUser Specifies if the file entry is shared for user or not.
 * @param sharedExternal Specifies if the file entry is shared via a public (non-internal) external link.
 * @param parentShared Indicates whether the parent entity is shared.
 * @param shortWebUrl The short Web URL.
 * @param created The creation date and time of the file entry.
 * @param createdBy The file entry author.
 * @param updated The last date and time when the file entry was updated.
 * @param autoDelete The date and time when the file entry will be automatically deleted.
 * @param rootFolderType The root folder type of the file entry.
 * @param parentRoomType The parent room type of the file entry.
 * @param updatedBy The user who updated the file entry.
 * @param providerItem Specifies if the file entry provider is specified or not.
 * @param providerKey The provider key of the file entry.
 * @param providerId The provider ID of the file entry.
 * @param order The order of the file entry.
 * @param isFavorite Specifies if the file is a favorite or not.
 * @param fileEntryType The file entry type.
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
 * @param expirationDate Represents the expiration date of the file entry.
 * @param isLinkExpired Indicates whether the shareable link associated with the file or folder has expired.
 * @param folderId The folder ID where the file is located.
 * @param version The file version.
 * @param versionGroup The version group of the file.
 * @param contentLength The content length of the file.
 * @param pureContentLength The pure content length of the file.
 * @param fileStatus The current status of the file.
 * @param editingBy The list of users editing the file.
 * @param mute Specifies if the file is muted or not.
 * @param viewUrl The URL link to view the file.
 * @param webUrl The Web URL link to the file.
 * @param fileType The file type.
 * @param fileExst The file extension.
 * @param comment The comment to the file.
 * @param encrypted Specifies if the file is encrypted or not.
 * @param thumbnailUrl The thumbnail URL of the file.
 * @param thumbnailStatus The current thumbnail status of the file.
 * @param locked Specifies if the file is locked or not.
 * @param lockedBy The user ID of the person who locked the file.
 * @param hasDraft Specifies if the file has a draft or not.
 * @param formFillingStatus The status of the form filling process.
 * @param isForm Specifies if the file is a form or not.
 * @param customFilterEnabled Specifies if the Custom Filter editing mode is enabled for a file or not.
 * @param customFilterEnabledBy The name of the user who enabled a Custom Filter editing mode for a file.
 * @param startFilling Specifies if the filling has started or not.
 * @param isFillingPreparing Specifies if the form filling has started but the file is still being saved by the document editor. Filling and editing are not allowed.
 * @param inProcessFolderId The InProcess folder ID of the file.
 * @param inProcessFolderTitle The InProcess folder title of the file.
 * @param resultsFolderId The ID of the FormFillingFolderDone folder that corresponds to this original form.
 * @param draftLocation The file draft information with its location.
 * @param viewAccessibility 
 * @param lastOpened The time when the file was last opened.
 * @param expired The date when the file will be expired.
 * @param vectorizationStatus The vectorization status of the file.
 * @param externalDbTableName The name of the table in the external database that corresponds to this form.
 * @param dimensions The dimensions (width and height) of the image file in pixels.  This property is populated only for image files that can be viewed (supported formats like PNG, JPEG, GIF, BMP, etc.).  For non-image files, this property remains null.
 */


data class FileDtoInteger (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "access")
    val access: FileShare? = null,

    @Json(name = "sharedBy")
    val sharedBy: EmployeeDto? = null,

    @Json(name = "ownedBy")
    val ownedBy: EmployeeDto? = null,

    @Json(name = "shared")
    val shared: kotlin.Boolean? = null,

    @Json(name = "sharedForUser")
    val sharedForUser: kotlin.Boolean? = null,

    @Json(name = "sharedExternal")
    val sharedExternal: kotlin.Boolean? = null,

    @Json(name = "parentShared")
    val parentShared: kotlin.Boolean? = null,

    @Json(name = "shortWebUrl")
    val shortWebUrl: java.net.URI? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "createdBy")
    val createdBy: EmployeeDto? = null,

    @Json(name = "updated")
    val updated: java.time.OffsetDateTime? = null,

    @Json(name = "autoDelete")
    val autoDelete: java.time.OffsetDateTime? = null,

    @Json(name = "rootFolderType")
    val rootFolderType: FolderType? = null,

    @Json(name = "parentRoomType")
    val parentRoomType: FolderType? = null,

    @Json(name = "updatedBy")
    val updatedBy: EmployeeDto? = null,

    @Json(name = "providerItem")
    val providerItem: kotlin.Boolean? = null,

    @Json(name = "providerKey")
    val providerKey: kotlin.String? = null,

    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    @Json(name = "order")
    val order: kotlin.String? = null,

    @Json(name = "isFavorite")
    val isFavorite: kotlin.Boolean? = null,

    @Json(name = "fileEntryType")
    val fileEntryType: FileEntryType? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "rootFolderId")
    val rootFolderId: kotlin.Int? = null,

    @Json(name = "originId")
    val originId: kotlin.Int? = null,

    @Json(name = "originRoomId")
    val originRoomId: kotlin.Int? = null,

    @Json(name = "originTitle")
    val originTitle: kotlin.String? = null,

    @Json(name = "originRoomTitle")
    val originRoomTitle: kotlin.String? = null,

    @Json(name = "canShare")
    val canShare: kotlin.Boolean? = null,

    @Json(name = "shareSettings")
    val shareSettings: FileEntryDtoIntegerAllOfShareSettings? = null,

    @Json(name = "security")
    val security: FileEntryDtoIntegerAllOfSecurity? = null,

    @Json(name = "availableShareRights")
    val availableShareRights: FileEntryDtoIntegerAllOfAvailableShareRights? = null,

    @Json(name = "requestToken")
    val requestToken: kotlin.String? = null,

    @Json(name = "external")
    val `external`: kotlin.Boolean? = null,

    @Json(name = "expirationDate")
    val expirationDate: java.time.OffsetDateTime? = null,

    @Json(name = "isLinkExpired")
    val isLinkExpired: kotlin.Boolean? = null,

    @Json(name = "folderId")
    val folderId: kotlin.Int? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "versionGroup")
    val versionGroup: kotlin.Int? = null,

    @Json(name = "contentLength")
    val contentLength: kotlin.String? = null,

    @Json(name = "pureContentLength")
    val pureContentLength: kotlin.Long? = null,

    @Json(name = "fileStatus")
    val fileStatus: FileStatus? = null,

    @Json(name = "editingBy")
    val editingBy: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    @Json(name = "mute")
    val mute: kotlin.Boolean? = null,

    @Json(name = "viewUrl")
    val viewUrl: java.net.URI? = null,

    @Json(name = "webUrl")
    val webUrl: java.net.URI? = null,

    @Json(name = "fileType")
    val fileType: FileType? = null,

    @Json(name = "fileExst")
    val fileExst: kotlin.String? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean? = null,

    @Json(name = "thumbnailUrl")
    val thumbnailUrl: java.net.URI? = null,

    @Json(name = "thumbnailStatus")
    val thumbnailStatus: Thumbnail? = null,

    @Json(name = "locked")
    val locked: kotlin.Boolean? = null,

    @Json(name = "lockedBy")
    val lockedBy: kotlin.String? = null,

    @Json(name = "hasDraft")
    val hasDraft: kotlin.Boolean? = null,

    @Json(name = "formFillingStatus")
    val formFillingStatus: FormFillingStatus? = null,

    @Json(name = "isForm")
    val isForm: kotlin.Boolean? = null,

    @Json(name = "customFilterEnabled")
    val customFilterEnabled: kotlin.Boolean? = null,

    @Json(name = "customFilterEnabledBy")
    val customFilterEnabledBy: kotlin.String? = null,

    @Json(name = "startFilling")
    val startFilling: kotlin.Boolean? = null,

    @Json(name = "isFillingPreparing")
    val isFillingPreparing: kotlin.Boolean? = null,

    @Json(name = "inProcessFolderId")
    val inProcessFolderId: kotlin.Int? = null,

    @Json(name = "inProcessFolderTitle")
    val inProcessFolderTitle: kotlin.String? = null,

    @Json(name = "resultsFolderId")
    val resultsFolderId: kotlin.Int? = null,

    @Json(name = "draftLocation")
    val draftLocation: DraftLocationInteger? = null,

    @Json(name = "viewAccessibility")
    val viewAccessibility: FileDtoIntegerAllOfViewAccessibility? = null,

    @Json(name = "lastOpened")
    val lastOpened: java.time.OffsetDateTime? = null,

    @Json(name = "expired")
    val expired: java.time.OffsetDateTime? = null,

    @Json(name = "vectorizationStatus")
    val vectorizationStatus: VectorizationStatus? = null,

    @Json(name = "externalDbTableName")
    val externalDbTableName: kotlin.String? = null,

    @Json(name = "dimensions")
    val dimensions: Size? = null

) {


}

