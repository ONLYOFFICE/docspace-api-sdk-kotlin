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

import onlyoffice.docspace.api.sdk.models.ChatSettingsDto
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfAvailableShareRights
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfSecurity
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfShareSettings
import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.FolderType
import onlyoffice.docspace.api.sdk.models.Logo
import onlyoffice.docspace.api.sdk.models.RoomDataLifetimeDto
import onlyoffice.docspace.api.sdk.models.RoomType
import onlyoffice.docspace.api.sdk.models.WatermarkDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The folder parameters.
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
 * @param parentId The parent folder ID of the folder.
 * @param filesCount The number of files that the folder contains.
 * @param foldersCount The number of folders that the folder contains.
 * @param isShareable Specifies if the folder can be shared or not.
 * @param new The new element index in the folder.
 * @param mute Specifies if the folder notifications are enabled or not.
 * @param tags The list of tags of the folder.
 * @param logo The folder logo.
 * @param pinned Specifies if the folder is pinned or not.
 * @param roomType The room type of the folder.
 * @param `private` Specifies if the folder is private or not.
 * @param indexing Specifies if the folder is indexed or not.
 * @param denyDownload Specifies if the folder can be downloaded or not.
 * @param lifetime The room data lifetime settings of the folder.
 * @param watermark The watermark settings of the folder.
 * @param type The folder type.
 * @param inRoom Specifies if the folder is placed in the room or not.
 * @param quotaLimit The folder quota limit.
 * @param isCustomQuota Specifies if the folder room has a custom quota or not.
 * @param usedSpace How much folder space is used (counter).
 * @param passwordProtected Specifies if the folder is password protected or not.
 * @param expired Specifies if an external link to the folder is expired or not.
 * @param chatSettings The AI chat settings for the folder room. Contains configuration for AI provider, model selection, and custom prompts.  Only applicable to rooms with AI chat functionality enabled. Null if the room does not have chat settings configured.
 * @param rootRoomType The room type of the root folder. Indicates the type of the parent room if the current folder is nested within a room hierarchy.  This property helps identify the context in which a nested folder exists.
 * @param saveFormAsXLSX Specifies whether to save form data as XLSX file.
 * @param sendFormToExternalDB Specifies whether to send form data to external database.
 * @param originalFormId The original form ID that corresponds to this FormFillingFolderDone folder.
 */


data class FolderDtoString (

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
    val id: kotlin.String? = null,

    @Json(name = "rootFolderId")
    val rootFolderId: kotlin.String? = null,

    @Json(name = "originId")
    val originId: kotlin.String? = null,

    @Json(name = "originRoomId")
    val originRoomId: kotlin.String? = null,

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

    @Json(name = "parentId")
    val parentId: kotlin.String? = null,

    @Json(name = "filesCount")
    val filesCount: kotlin.Int? = null,

    @Json(name = "foldersCount")
    val foldersCount: kotlin.Int? = null,

    @Json(name = "isShareable")
    val isShareable: kotlin.Boolean? = null,

    @Json(name = "new")
    val new: kotlin.Int? = null,

    @Json(name = "mute")
    val mute: kotlin.Boolean? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "logo")
    val logo: Logo? = null,

    @Json(name = "pinned")
    val pinned: kotlin.Boolean? = null,

    @Json(name = "roomType")
    val roomType: RoomType? = null,

    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "lifetime")
    val lifetime: RoomDataLifetimeDto? = null,

    @Json(name = "watermark")
    val watermark: WatermarkDto? = null,

    @Json(name = "type")
    val type: FolderType? = null,

    @Json(name = "inRoom")
    val inRoom: kotlin.Boolean? = null,

    @Json(name = "quotaLimit")
    val quotaLimit: kotlin.Long? = null,

    @Json(name = "isCustomQuota")
    val isCustomQuota: kotlin.Boolean? = null,

    @Json(name = "usedSpace")
    val usedSpace: kotlin.Long? = null,

    @Json(name = "passwordProtected")
    val passwordProtected: kotlin.Boolean? = null,

    @Json(name = "expired")
    @Deprecated(message = "This property is deprecated.")
    val expired: kotlin.Boolean? = null,

    @Json(name = "chatSettings")
    val chatSettings: ChatSettingsDto? = null,

    @Json(name = "rootRoomType")
    val rootRoomType: RoomType? = null,

    @Json(name = "saveFormAsXLSX")
    val saveFormAsXLSX: kotlin.Boolean? = null,

    @Json(name = "sendFormToExternalDB")
    val sendFormToExternalDB: kotlin.Boolean? = null,

    @Json(name = "originalFormId")
    val originalFormId: kotlin.Int? = null

) {


}

