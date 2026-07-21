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
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfAvailableShareRights
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfSecurity
import onlyoffice.docspace.api.sdk.models.FileEntryDtoIntegerAllOfShareSettings
import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.FolderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The generic file entry information.
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
 */


data class FileEntryDtoInteger (

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
    val isLinkExpired: kotlin.Boolean? = null

) {


}

