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
import onlyoffice.docspace.api.sdk.models.ChatSettings
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
 * @param access 
 * @param sharedBy 
 * @param ownedBy 
 * @param shared Specifies if the file entry is shared via link or not.
 * @param sharedForUser Specifies if the file entry is shared for user or not.
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
 * @param parentId The parent folder ID of the folder.
 * @param filesCount The number of files that the folder contains.
 * @param foldersCount The number of folders that the folder contains.
 * @param isShareable Specifies if the folder can be shared or not.
 * @param new The new element index in the folder.
 * @param mute Specifies if the folder notifications are enabled or not.
 * @param tags The list of tags of the folder.
 * @param logo 
 * @param pinned Specifies if the folder is pinned or not.
 * @param roomType 
 * @param `private` Specifies if the folder is private or not.
 * @param indexing Specifies if the folder is indexed or not.
 * @param denyDownload Specifies if the folder can be downloaded or not.
 * @param lifetime 
 * @param watermark 
 * @param type 
 * @param inRoom Specifies if the folder is placed in the room or not.
 * @param quotaLimit The folder quota limit.
 * @param isCustomQuota Specifies if the folder room has a custom quota or not.
 * @param usedSpace How much folder space is used (counter).
 * @param passwordProtected Specifies if the folder is password protected or not.
 * @param expired Specifies if an external link to the folder is expired or not.
 * @param chatSettings 
 * @param rootRoomType 
 */


data class FolderDtoInteger (

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

    /* The parent folder ID of the folder. */
    @Json(name = "parentId")
    val parentId: kotlin.Int? = null,

    /* The number of files that the folder contains. */
    @Json(name = "filesCount")
    val filesCount: kotlin.Int? = null,

    /* The number of folders that the folder contains. */
    @Json(name = "foldersCount")
    val foldersCount: kotlin.Int? = null,

    /* Specifies if the folder can be shared or not. */
    @Json(name = "isShareable")
    val isShareable: kotlin.Boolean? = null,

    /* The new element index in the folder. */
    @Json(name = "new")
    val new: kotlin.Int? = null,

    /* Specifies if the folder notifications are enabled or not. */
    @Json(name = "mute")
    val mute: kotlin.Boolean? = null,

    /* The list of tags of the folder. */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "logo")
    val logo: Logo? = null,

    /* Specifies if the folder is pinned or not. */
    @Json(name = "pinned")
    val pinned: kotlin.Boolean? = null,

    @Json(name = "roomType")
    val roomType: RoomType? = null,

    /* Specifies if the folder is private or not. */
    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    /* Specifies if the folder is indexed or not. */
    @Json(name = "indexing")
    val indexing: kotlin.Boolean? = null,

    /* Specifies if the folder can be downloaded or not. */
    @Json(name = "denyDownload")
    val denyDownload: kotlin.Boolean? = null,

    @Json(name = "lifetime")
    val lifetime: RoomDataLifetimeDto? = null,

    @Json(name = "watermark")
    val watermark: WatermarkDto? = null,

    @Json(name = "type")
    val type: FolderType? = null,

    /* Specifies if the folder is placed in the room or not. */
    @Json(name = "inRoom")
    val inRoom: kotlin.Boolean? = null,

    /* The folder quota limit. */
    @Json(name = "quotaLimit")
    val quotaLimit: kotlin.Long? = null,

    /* Specifies if the folder room has a custom quota or not. */
    @Json(name = "isCustomQuota")
    val isCustomQuota: kotlin.Boolean? = null,

    /* How much folder space is used (counter). */
    @Json(name = "usedSpace")
    val usedSpace: kotlin.Long? = null,

    /* Specifies if the folder is password protected or not. */
    @Json(name = "passwordProtected")
    val passwordProtected: kotlin.Boolean? = null,

    /* Specifies if an external link to the folder is expired or not. */
    @Json(name = "expired")
    @Deprecated(message = "This property is deprecated.")
    val expired: kotlin.Boolean? = null,

    @Json(name = "chatSettings")
    val chatSettings: ChatSettings? = null,

    @Json(name = "rootRoomType")
    val rootRoomType: RoomType? = null

) {


}

