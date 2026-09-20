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
import onlyoffice.docspace.api.sdk.models.ChatSettingsDto
import onlyoffice.docspace.api.sdk.models.EmployeeDto
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
 * The folder, with the fields that only a room carries filled in when the folder is a room.
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
 * @param parentId The folder this one is listed in. For a room it is the root of the section the room lives in, and for an entry  opened through a sharing link whose real parent the caller may not read it is the root of the section with the  entries shared with them.
 * @param filesCount How many files lie directly in the folder, without counting the subfolders. The roots of the `Rooms`, room  templates and default templates sections always report 0, because the number is not collected for them.
 * @param foldersCount How many subfolders lie directly in the folder. For an AI room the two service subfolders it always holds are  subtracted, so the number matches what a listing of it shows, and the roots of the `Rooms` and templates  sections report 0.
 * @param isShareable Whether the caller may hand out access to the folder. It is filled in only for the folder a folder-contents  answer is about, and is null in every other answer, so null says nothing about the sharing rights.
 * @param new How many entries inside the folder the caller has not opened yet, the number drawn as the badge on it. An  account that turned the badges off in its own settings always reads 0 here, so 0 alone does not prove that  everything has been seen.
 * @param mute Whether the caller silenced the notifications of this room: true means no message about its activity reaches  them. The choice belongs to the reading account rather than to the room, so two members of one room read  different values.
 * @param tags The names of the tags attached to the room. Empty for a folder that is not a room, since only rooms carry  tags, and the names are the ones from the portal tag catalogue.
 * @param logo The addresses of the room logo in four sizes, together with the colour and the built-in cover that are drawn  when no logo was uploaded. A room without a logo answers with four empty addresses rather than with null, and  the field is null for a folder that is not a room.
 * @param pinned Whether the caller pinned the room to the top of their own room list. Pinning is personal and is lost when the  room is archived.
 * @param roomType The kind of the room, which decides the default access rules of its members. Null for a folder that is not a  room.
 * @param `private` Whether the room is a private one, which limits it to the accounts invited into it and needs encryption keys  set up for each of them.
 * @param indexing Whether the contents of the room are kept in an explicit numbered order, the one reported as `order` on each  entry, instead of being left to the sorting the reader asks for.
 * @param denyDownload Whether downloading and printing the contents of the room is forbidden, which leaves its members with viewing  and editing in the editor.
 * @param lifetime The rule by which the files of the room are removed once they grow old. Null when the room has no such rule,  which is also what is reported after the rule is switched off, because switching it off erases it.
 * @param watermark The watermark stamped over the documents of the room while they are viewed and printed. Null when the room has  no watermark, and for every folder that is not a room.
 * @param type The part the folder plays inside its room: one of the service folders of the form-filling flow, or the  knowledge and result storages of an AI room. It stays null for an ordinary folder and for the room itself, so  it does not describe folders in general.
 * @param inRoom Whether the caller holds the room through an invitation of their own: true for the account that created it and  for a member invited personally, false when the access comes from a group they belong to, and null for a  folder that is not a room.
 * @param quotaLimit How much space the files of the room may take, in bytes. It is the limit set on this room, or the portal  default for rooms when none was set. Null when the tariff of the portal does not count room statistics, when  room quotas are switched off, when the room lies in the archive or the trash, or when the caller may only read  it.
 * @param isCustomQuota Whether `quotaLimit` is a limit set on this room (true) or the portal default for rooms (false). Null exactly  when `quotaLimit` is null.
 * @param usedSpace How much the files of the room take, in bytes, as of the last time the counter was recomputed. The counter is  refreshed when a file operation finishes, so a read right after an upload or a deletion can still report the  previous figure. Null for a folder that is not a room.
 * @param passwordProtected Whether the sharing link the folder was opened through asks for a password that has not been entered yet.  While it is true the contents stay unreadable; send the password to `POST api/2.0/files/share/{key}/password`  first. Null when the folder was not reached through a link.
 * @param expired Deprecated, read `isLinkExpired` instead: whether the sharing link the folder was opened through has run out  of its lifetime.
 * @param chatSettings The chat configuration of an AI room. Only the system prompt is reported here, whatever else the room stores,  and the field is null for every folder that is not an AI room.
 * @param rootRoomType The kind of the room the folder lies in. It is filled in only for the folder a folder-contents answer is  about, and only when that room is an AI room, so it is null in every other answer and for every other room  kind.
 * @param saveFormAsXLSX Whether the answers collected in this form-filling room are also gathered into a spreadsheet next to the  completed copies. Filled in for form-filling rooms only.
 * @param sendFormToExternalDB Whether the answers collected in this form-filling room are also pushed into the external database configured  for the portal. Filled in for form-filling rooms only.
 * @param originalFormId The form the completed copies in this folder were filled from, taken from the copy submitted last. Null while  the folder holds no completed copy, and for every folder that does not collect them.
 */


data class FolderDto (

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
    val isLinkExpired: kotlin.Boolean? = null,

    @Json(name = "parentId")
    val parentId: kotlin.Int? = null,

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

