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
import onlyoffice.docspace.api.sdk.models.FileDtoAllOfViewAccessibility
import onlyoffice.docspace.api.sdk.models.FileEntryType
import onlyoffice.docspace.api.sdk.models.FileShare
import onlyoffice.docspace.api.sdk.models.FileStatus
import onlyoffice.docspace.api.sdk.models.FileType
import onlyoffice.docspace.api.sdk.models.FolderType
import onlyoffice.docspace.api.sdk.models.FormFillingStatus
import onlyoffice.docspace.api.sdk.models.Size
import onlyoffice.docspace.api.sdk.models.ThirdPartyDraftLocation
import onlyoffice.docspace.api.sdk.models.Thumbnail
import onlyoffice.docspace.api.sdk.models.VectorizationStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A stored file as the calling account sees it: where it lives, which revision this is, how it can be opened and  what the portal is currently doing with it.
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
 * @param folderId The folder the file is stored in. When the file was reached through a share and the caller cannot open its  real parent, the identifier of the Shared with me section is reported instead, so this is where the file is  visible rather than where it physically sits.
 * @param version The revision this entry describes. It starts at 1 and moves to the next number each time new content is stored  over the file, except for an editing session opened against the file itself, which replaces the content and  keeps the number. `GET api/2.0/files/file/{fileId}/history` lists them all.
 * @param versionGroup Groups revisions that belong together, which is how a history can fold a long editing session into one entry:  versions saved inside one session share this number, and an upload over the file starts a new group.
 * @param contentLength The size already formatted for display, with a unit and the separators of the caller's language. Read  `pureContentLength` for a number to calculate with.
 * @param pureContentLength The size of the stored content in bytes, and null for an empty file.
 * @param fileStatus What the portal is currently doing with the file and how the caller stands towards it - open in the editor,  unread, being converted, and so on. The value is a bit mask that combines those states, so a file can report a  number that matches none of the published members on its own.
 * @param editingBy The accounts that have the file open in the editor at this moment, as account identifier to display name, and  empty when nobody has. The all-zero identifier stands for people who came in through an external link without  signing in, and its name carries their number in brackets when there is more than one.
 * @param mute Not a property of the file at all: it repeats, inverted, the calling account's own switch for new-item badges,  so it is the same in every entry of one answer. True means that account has badges turned off.
 * @param viewUrl The address that returns the bytes of the file - a download, in spite of the name; `webUrl` is the address a  person opens. When the file was reached through an external link the address carries the key of that link, so  it keeps working without signing in.
 * @param webUrl The page that opens the file in a browser: the editor for a format the portal edits, the media viewer for  pictures, audio and video, and the download address for a format it cannot show at all.
 * @param fileType The broad kind of content, worked out from the extension, which is what a client uses to pick an icon or a  viewer without parsing `fileExst` itself.
 * @param fileExst The extension of the stored file, leading dot included and always lower case. For a format the portal keeps in  a converted shape this is the extension it is served under, not the one it was uploaded with.
 * @param comment The note kept with this revision. The portal writes it itself for revisions it creates, an upload over an  existing file among them, and an editor stores the note a person typed when saving a version.
 * @param encrypted True for a file in a private room, whose content the server never sees and which therefore cannot be converted  or taken over by an upload. Null, rather than false, for an ordinary file.
 * @param thumbnailUrl The address of the generated preview image. It is filled in only while `thumbnailStatus` says the preview has  been created, and it carries a suffix that changes with the file, so an image cached for an earlier revision  is not reused.
 * @param thumbnailStatus How far the preview image has got. Only the created state means `thumbnailUrl` holds an address; the others  mean there is none, either because it is still being produced or because this format has no preview.
 * @param locked True while the file is held under a lock that stops anyone but its holder from editing it, and null rather  than false when there is no lock. `lockedBy` names the holder unless the caller is the holder.
 * @param lockedBy The display name of the account holding the lock, and null when the caller holds it - so `locked` true  together with no name here means the lock is the caller's own.
 * @param hasDraft For a fillable PDF form, whether the caller already has a filling draft of it, in which case `draftLocation`  says where that draft lives. Null for anything that is not a form.
 * @param formFillingStatus How far the filling of this form has got for the calling account, and whose turn it is now. It is worked out  only inside a virtual data room, where filling runs in steps; everywhere else it stays at the none value.
 * @param isForm Whether the file is a PDF, and so offered as a fillable form. It is null for any other file type.
 * @param customFilterEnabled True while a spreadsheet is in the mode where each person sorts and filters their own view without changing  what the others see, and null rather than false when it is not.
 * @param customFilterEnabledBy The display name of the account that turned that mode on, and null when the caller turned it on themselves.
 * @param startFilling For a form in a room for filling, whether it has been released for filling; until then it is still being  prepared and only the people running the room work with it. Null for a file this does not apply to.
 * @param isFillingPreparing True during the short window in which a released form is still being written out by the editor. Neither  filling nor editing is accepted while it lasts, so a client should wait and read the file again.
 * @param inProcessFolderId Left empty by the portal: the folder holding the caller's draft is reported in `draftLocation` instead.
 * @param inProcessFolderTitle Left empty by the portal, like the identifier beside it; the draft's folder is named in `draftLocation`.
 * @param resultsFolderId The folder that collects the completed copies of this form. It is filled in only for the original form of a  room for filling, and only for a caller allowed to work with that form; null everywhere else.
 * @param draftLocation Where the caller's own filling draft of this form is kept. Null when there is no draft yet, which is the same  thing `hasDraft` reports.
 * @param viewAccessibility 
 * @param lastOpened The moment the caller last opened the file. It is kept per account and is what orders the Recent section, so  it is null for a file this account has never opened. Written with the offset of the portal's time zone.
 * @param expired The moment the file falls under the lifetime rule of the room holding it and is removed. It is counted from  the first revision rather than the latest one, so editing a file does not postpone it, and it is null when the  room sets no lifetime. Written with the offset of the portal's time zone.
 * @param vectorizationStatus How far the indexing of the file's content for AI search has got. It is null for a file that has never been  queued for indexing, which is every file while the feature is off for the portal.
 * @param externalDbTableName The table collecting the submitted values of this form in the external database configured for its room. The  field is left out of the answer entirely when the form has no such table.
 * @param dimensions The pixel size of the picture, measured by reading the stored file rather than taken from any stored metadata.  Null for anything that is not a picture the portal can show, and also when the file could not be read.
 */


data class ThirdPartyFileDto (

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

    @Json(name = "folderId")
    val folderId: kotlin.String? = null,

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
    val draftLocation: ThirdPartyDraftLocation? = null,

    @Json(name = "viewAccessibility")
    val viewAccessibility: FileDtoAllOfViewAccessibility? = null,

    @Json(name = "lastOpened")
    val lastOpened: ApiDateTime? = null,

    @Json(name = "expired")
    val expired: ApiDateTime? = null,

    @Json(name = "vectorizationStatus")
    val vectorizationStatus: VectorizationStatus? = null,

    @Json(name = "externalDbTableName")
    val externalDbTableName: kotlin.String? = null,

    @Json(name = "dimensions")
    val dimensions: Size? = null

) {


}

