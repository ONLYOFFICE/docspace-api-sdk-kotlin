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

import onlyoffice.docspace.api.sdk.models.AiFileEntryDtoAllOfAvailableShareRights
import onlyoffice.docspace.api.sdk.models.AiFileEntryDtoAllOfSecurity
import onlyoffice.docspace.api.sdk.models.AiFileEntryDtoAllOfShareSettings
import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.EmployeeDto
import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.FolderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The part of a file or folder that depends on how the entry is identified: by a number on the portal, or by a  string on a connected third-party account.
 *
 * @param title The name shown for the entry. For a file it carries the extension, which is how the format is recognised, and  for a room it is the room name.
 * @param access The level the calling account holds on this entry, resolved from its own rights, the groups it belongs to and  any link it came in through. It is the level itself, not what the account may do with it - the action flags  below answer that.
 * @param sharedBy Who gave the calling account the access it is using. It is filled in only while the entry is being read  through a share, and never for a caller without an account.
 * @param ownedBy Who owns the place the entry is shared from - the creator of the room it lies in, or of the personal section  that holds it. It is filled in only while the entry is being read through a share, and never for a caller  without an account.
 * @param shared Whether at least one external link exists for the entry, whichever kind. It says nothing about accounts and  groups - those are counted by the flag for members below.
 * @param sharedForUser Whether at least one account or group has been given rights on the entry directly, as opposed to reaching it  through a link or through the room around it.
 * @param sharedExternal Whether one of the entry's links is open to people outside the portal, as opposed to a link that only its own  members can follow. This is the flag to watch when the concern is who can reach the content from outside.
 * @param parentShared Whether the entry is reachable because the room or folder around it is shared, rather than through rights of  its own. A copy or a move takes the entry out of that scope.
 * @param shortWebUrl A shortened address that opens the entry through the link it is being read with. It is an empty string  whenever no link applies, which is the usual case for a member browsing their own rooms.
 * @param created When the entry was created, written with the offset of the portal's time zone. For a file restored from an  older version this is still the moment the file first appeared.
 * @param createdBy Who created the entry. It is null for a caller without an account, who is told nothing about the portal's  members.
 * @param updated When the entry last changed, written with the offset of the portal's time zone. It is never reported as  earlier than the creation moment, so the two can be compared safely.
 * @param autoDelete When the entry will disappear on its own, written with the offset of the portal's time zone. It is filled in  only where a removal is actually scheduled - something in the trash while the portal cleans it up  automatically, or a guest's own documents - so a null means nothing is scheduled rather than that the entry is  permanent.
 * @param rootFolderType The section the entry ultimately belongs to, which is what tells a personal document from one inside a room,  from a template and from something in the trash or the archive.
 * @param parentRoomType The kind of room the entry lies in, which decides what the room allows - filling forms, public links,  indexing. It is null for an entry that is not inside a room at all.
 * @param updatedBy Who changed the entry last. It is null for a caller without an account.
 * @param providerItem Set when the entry is stored on a connected third-party account rather than on the portal, and null when it is  stored on the portal. Such an entry is identified by a string rather than a number, and some operations skip  it.
 * @param providerKey Which third-party service holds the entry, matching the keys accepted by the third-party operations. It is  null for an entry stored on the portal.
 * @param providerId The connected account the entry comes from, for telling apart two connections to the same service. It is null  for an entry stored on the portal.
 * @param order The place of the entry in a room where the members arrange the content themselves, given as the position of  the entry preceded by the positions of the folders leading to it, separated by dots. It is empty when nothing  has been arranged.
 * @param isFavorite Set when the calling account has marked the entry as a favorite, which is what puts it into the favorites  listing. For a file that is not marked it is null rather than false.
 * @param fileEntryType Tells a folder from a file, and so which of the two shapes the rest of the object has. A room is reported as a  folder here.
 * @param id The identifier to pass back to the other operations of this entry. It is a number for storage on the portal  and a string for a connected third-party account, and it is unique only within its own kind, so files and  folders may carry the same value.
 * @param rootFolderId The section the entry ultimately lies in, as an identifier that can be listed like any other folder. For an  entry inside a room this is the rooms section, not the room.
 * @param originId The folder the entry was deleted from, which is where restoring it puts it back. It is left out of the answer  unless the entry is in the trash.
 * @param originRoomId The room the entry was deleted from, left out of the answer for anything that was not deleted out of a room.
 * @param originTitle The name of the folder the entry was deleted from, for showing where it would be restored to. It is null for  an entry that is not in the trash.
 * @param originRoomTitle The name of the room the entry was deleted from, null for anything that was not deleted out of a room.
 * @param canShare Whether the calling account may change who has access to the entry, and so whether offering a sharing dialog  for it makes sense. It is false in rooms whose access is fixed by the room itself, such as a private one, even  for its manager.
 * @param shareSettings 
 * @param security 
 * @param availableShareRights 
 * @param requestToken The token of the link the entry is being read through, which is the value the external-share operations expect  and which also has to be carried by the download and preview addresses. It is null whenever the entry is not  being read through a link.
 * @param `external` Set when the link being used was made for this very entry, and false when the entry is reached through a link  to the room around it. It is null when no link is involved.
 * @param expirationDate When the link being used stops working, written with the offset of the portal's time zone. It is null for a  link that never expires and whenever no link is involved.
 * @param isLinkExpired Set when the link being used has already passed its expiration date, which is why the entry cannot be opened  even though it is described here. It is null when no link is involved.
 */


data class FileEntryDto (

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
    val shareSettings: AiFileEntryDtoAllOfShareSettings? = null,

    @Json(name = "security")
    val security: AiFileEntryDtoAllOfSecurity? = null,

    @Json(name = "availableShareRights")
    val availableShareRights: AiFileEntryDtoAllOfAvailableShareRights? = null,

    @Json(name = "requestToken")
    val requestToken: kotlin.String? = null,

    @Json(name = "external")
    val `external`: kotlin.Boolean? = null,

    @Json(name = "expirationDate")
    val expirationDate: ApiDateTime? = null,

    @Json(name = "isLinkExpired")
    val isLinkExpired: kotlin.Boolean? = null

) {


}

