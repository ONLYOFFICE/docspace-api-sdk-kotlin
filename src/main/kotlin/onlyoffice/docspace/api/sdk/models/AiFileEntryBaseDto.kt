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

import onlyoffice.docspace.api.sdk.models.AiApiDateTime
import onlyoffice.docspace.api.sdk.models.AiEmployeeDto
import onlyoffice.docspace.api.sdk.models.AiFileEntryType
import onlyoffice.docspace.api.sdk.models.AiFileShare
import onlyoffice.docspace.api.sdk.models.AiFolderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file entry information.
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
 */


data class AiFileEntryBaseDto (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "access")
    val access: AiFileShare? = null,

    @Json(name = "sharedBy")
    val sharedBy: AiEmployeeDto? = null,

    @Json(name = "ownedBy")
    val ownedBy: AiEmployeeDto? = null,

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
    val created: AiApiDateTime? = null,

    @Json(name = "createdBy")
    val createdBy: AiEmployeeDto? = null,

    @Json(name = "updated")
    val updated: AiApiDateTime? = null,

    @Json(name = "autoDelete")
    val autoDelete: AiApiDateTime? = null,

    @Json(name = "rootFolderType")
    val rootFolderType: AiFolderType? = null,

    @Json(name = "parentRoomType")
    val parentRoomType: AiFolderType? = null,

    @Json(name = "updatedBy")
    val updatedBy: AiEmployeeDto? = null,

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
    val fileEntryType: AiFileEntryType? = null

) {


}

