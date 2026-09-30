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

import onlyoffice.docspace.api.sdk.models.AutoCleanUpData
import onlyoffice.docspace.api.sdk.models.FilesSettingsDtoInternalFormats
import onlyoffice.docspace.api.sdk.models.OrderBy

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Everything a client needs to work with documents in this portal: the format tables, the address templates, the  upload limits, the portal-wide switches and the preferences of the calling account.
 *
 * @param extsImagePreviewed Images the portal can show in its own viewer. Anything outside the list has to be downloaded to be seen.
 * @param extsMediaPreviewed Audio and video the portal can play in its own player.
 * @param extsWebPreviewed Documents the editor can open read-only. A format that is here but not in the edited list can be viewed and  not changed.
 * @param extsWebEdited Documents the editor can open for editing. Uploading a format outside this list and outside the convertible  list leaves a file that can only be downloaded.
 * @param extsWebEncrypt Documents that can be edited inside a private room, where the content is encrypted on the client.
 * @param extsWebReviewed Documents that support the reviewing mode, so that granting review access to them is meaningful.
 * @param extsWebCustomFilterEditing Spreadsheets that support the custom filter mode, where a filter applied by one editor does not disturb the  others.
 * @param extsWebRestrictedEditing Documents that can only be filled in or commented on rather than edited freely, whatever access the caller  holds.
 * @param extsWebCommented Documents that support comments, so that granting comment access to them is meaningful.
 * @param extsWebTemplate Documents the portal treats as templates to create new files from.
 * @param extsMustConvert Formats that cannot be edited as they are and are converted on upload or on first opening. Which target each  one has is in the convertible table below.
 * @param extsConvertible The conversion map of the portal: for each source extension, the extensions it can be converted into. Use it  to fill the target format of a conversion request instead of guessing one.
 * @param extsUploadable Formats the portal offers to create and upload as documents. It is not an upload filter: files of other  formats are stored as they are.
 * @param extsArchive Formats recognised as archives, which is what decides the archive icon and the offer to unpack.
 * @param extsVideo Formats classified as video. The classification lists drive icons and the media filters of the listing  operations, and are wider than what the built-in player can show.
 * @param extsAudio Formats classified as audio.
 * @param extsImage Formats classified as images.
 * @param extsSpreadsheet Formats classified as spreadsheets.
 * @param extsPresentation Formats classified as presentations.
 * @param extsDocument Formats classified as text documents.
 * @param extsDiagram Formats classified as diagrams.
 * @param internalFormats 
 * @param masterFormExtension The extension of a fillable form template in this portal. It is configurable, so read it rather than assuming  the product default.
 * @param paramVersion The name of the query parameter that pins a document address to one version. Append it to the addresses below  instead of composing a version address by hand.
 * @param paramOutType The name of the query parameter that asks a download address for a converted copy in another format.
 * @param fileDownloadUrlString The template of the address a file is downloaded from: substitute the file identifier for the `{0}`  placeholder. Add the version and output-type parameters named above for a particular version or format.
 * @param fileWebViewerUrlString The template of the address that opens a file in the viewer inside the portal, with `{0}` for the file  identifier. It is a portal-relative address, meant to be opened in a browser rather than called as an API.
 * @param fileWebViewerExternalUrlString The same viewer address as an absolute one, for a message or a page outside the portal.
 * @param fileWebEditorUrlString The template of the address that opens a file for editing inside the portal, with `{0}` for the file  identifier. Whether the session really becomes editable still depends on the access the caller holds.
 * @param fileWebEditorExternalUrlString The same editing address as an absolute one, for use outside the portal.
 * @param fileRedirectPreviewUrlString The template of the address that sends the browser on to whichever viewer or editor suits the file, with `{0}`  for the file identifier. Use it when the kind of the file is not known in advance.
 * @param fileThumbnailUrlString The template of the address a file thumbnail is fetched from, with `{0}` for the file identifier. A thumbnail  is built in the background, so the address can answer with nothing for a while after the file appears.
 * @param confirmDelete Whether the caller asked to be prompted before a deletion. Written by `PUT api/2.0/files/changedeleteconfrim`.
 * @param enableThirdParty Whether this portal allows third-party storages to be connected at all. It is set portal-wide by an  administrator, so a member sees it as read-only.
 * @param externalShare Whether links that open an entry without a portal account may be created in this portal. Set portal-wide by an  administrator.
 * @param externalShareSocialMedia Whether the share-to-network buttons are offered next to an external link. It is reported as false whenever  external sharing itself is off.
 * @param storeOriginalFiles Whether the caller's uploads keep the original file when the portal converts them. With false the conversion  replaces the uploaded file with a new version of it.
 * @param keepNewFileName Whether the caller asked for new documents to be created with the default name instead of being prompted for  one.
 * @param displayFileExtension Whether the caller asked to see extensions in file titles. Stored titles always carry the extension whatever  this says.
 * @param showQuickActions Specifies whether to display the quick action buttons.
 * @param convertNotify Whether the caller is told about the result of a conversion. There is no operation in this document that  writes it.
 * @param hideConfirmCancelOperation Whether the prompt shown before a running operation is abandoned is hidden for the caller.
 * @param hideConfirmConvertSave Whether the prompt that offers to keep a copy in the original format on conversion is hidden for the caller.  Once true it cannot be turned back through the API.
 * @param hideConfirmConvertOpen Whether the prompt that offers to open the conversion result is hidden for the caller. Once true it cannot be  turned back through the API.
 * @param hideConfirmRoomLifetime Whether the warning shown before the lifetime settings of a room are changed is hidden for the caller.
 * @param defaultOrder The ordering the listing operations fall back to when a request names none. It follows the last order the  caller asked a listing for, so it changes on its own as the account is used.
 * @param forcesave Whether the editor writes a document back to storage while the session is still open. It is on for every  portal and cannot be switched off.
 * @param storeForcesave Whether those intermediate saves are kept as separate versions. They are not, in any portal: they update the  current version instead.
 * @param recentSection Whether the Recent section is offered to the caller among the section roots.
 * @param favoritesSection Whether the Favorites section is offered to the caller among the section roots.
 * @param templatesSection Whether the Templates section is offered to the caller among the section roots.
 * @param downloadTarGz The archive format the caller's multi-item downloads are packed into: true for `.tar.gz`, false for `.zip`.
 * @param automaticallyCleanUp The trash auto-clearing setting of the caller, the same pair `GET api/2.0/files/settings/autocleanup` returns.
 * @param canSearchByContent Whether documents in this portal can be searched by what is inside them and not only by title. It depends on  the full-text search service being configured and having indexed the portal.
 * @param defaultSharingAccessRights The access rights the sharing dialog offers the caller by default. The portal normalises the set it stores, so  this can be shorter than what was last sent.
 * @param maxUploadThreadCount How many upload requests the portal accepts from one account at a time. Sending more than this in parallel  gets the extra ones refused rather than queued.
 * @param chunkUploadSize The size in bytes of one chunk of a chunked upload. Split a large file exactly along this size: a chunk that  does not match is refused by the upload session.
 * @param openEditorInSameTab Whether the caller asked for documents to open in the current browser tab.
 * @param organizeRoomsGrouping Whether the caller asked to see rooms arranged by the groups they belong to.
 * @param defaultShareLinkInternal The kind of external link this portal offers first: true for a link only its own accounts can open, false for  one anyone holding it can open.
 * @param externalShareApplyToDocuments Whether the external sharing restriction covers personal documents. It matters only while external sharing is  off.
 * @param externalShareApplyToRooms Whether the external sharing restriction covers rooms, including making a new one public. It matters only  while external sharing is off.
 * @param blockExistingLinksOnRestrict Whether links created before the restriction stop opening as well, rather than only new ones being refused.
 * @param extsFilesVectorized Formats whose content can be indexed for the AI features of the portal. A file outside the list is left out of  that index.
 * @param maxVectorizationFileSize The largest file size in bytes that is indexed for the AI features. A larger file is skipped even when its  format is listed above.
 */


data class FilesSettingsDto (

    @Json(name = "extsImagePreviewed")
    val extsImagePreviewed: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsMediaPreviewed")
    val extsMediaPreviewed: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebPreviewed")
    val extsWebPreviewed: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebEdited")
    val extsWebEdited: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebEncrypt")
    val extsWebEncrypt: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebReviewed")
    val extsWebReviewed: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebCustomFilterEditing")
    val extsWebCustomFilterEditing: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebRestrictedEditing")
    val extsWebRestrictedEditing: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebCommented")
    val extsWebCommented: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsWebTemplate")
    val extsWebTemplate: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsMustConvert")
    val extsMustConvert: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsConvertible")
    val extsConvertible: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>?>? = null,

    @Json(name = "extsUploadable")
    val extsUploadable: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsArchive")
    val extsArchive: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsVideo")
    val extsVideo: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsAudio")
    val extsAudio: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsImage")
    val extsImage: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsSpreadsheet")
    val extsSpreadsheet: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsPresentation")
    val extsPresentation: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsDocument")
    val extsDocument: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extsDiagram")
    val extsDiagram: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "internalFormats")
    val internalFormats: FilesSettingsDtoInternalFormats? = null,

    @Json(name = "masterFormExtension")
    val masterFormExtension: kotlin.String? = null,

    @Json(name = "paramVersion")
    val paramVersion: kotlin.String? = null,

    @Json(name = "paramOutType")
    val paramOutType: kotlin.String? = null,

    @Json(name = "fileDownloadUrlString")
    val fileDownloadUrlString: java.net.URI? = null,

    @Json(name = "fileWebViewerUrlString")
    val fileWebViewerUrlString: kotlin.String? = null,

    @Json(name = "fileWebViewerExternalUrlString")
    val fileWebViewerExternalUrlString: java.net.URI? = null,

    @Json(name = "fileWebEditorUrlString")
    val fileWebEditorUrlString: kotlin.String? = null,

    @Json(name = "fileWebEditorExternalUrlString")
    val fileWebEditorExternalUrlString: java.net.URI? = null,

    @Json(name = "fileRedirectPreviewUrlString")
    val fileRedirectPreviewUrlString: java.net.URI? = null,

    @Json(name = "fileThumbnailUrlString")
    val fileThumbnailUrlString: java.net.URI? = null,

    @Json(name = "confirmDelete")
    val confirmDelete: kotlin.Boolean? = null,

    @Json(name = "enableThirdParty")
    val enableThirdParty: kotlin.Boolean? = null,

    @Json(name = "externalShare")
    val externalShare: kotlin.Boolean? = null,

    @Json(name = "externalShareSocialMedia")
    val externalShareSocialMedia: kotlin.Boolean? = null,

    @Json(name = "storeOriginalFiles")
    val storeOriginalFiles: kotlin.Boolean? = null,

    @Json(name = "keepNewFileName")
    val keepNewFileName: kotlin.Boolean? = null,

    @Json(name = "displayFileExtension")
    val displayFileExtension: kotlin.Boolean? = null,

    @Json(name = "showQuickActions")
    val showQuickActions: kotlin.Boolean? = null,

    @Json(name = "convertNotify")
    val convertNotify: kotlin.Boolean? = null,

    @Json(name = "hideConfirmCancelOperation")
    val hideConfirmCancelOperation: kotlin.Boolean? = null,

    @Json(name = "hideConfirmConvertSave")
    val hideConfirmConvertSave: kotlin.Boolean? = null,

    @Json(name = "hideConfirmConvertOpen")
    val hideConfirmConvertOpen: kotlin.Boolean? = null,

    @Json(name = "hideConfirmRoomLifetime")
    val hideConfirmRoomLifetime: kotlin.Boolean? = null,

    @Json(name = "defaultOrder")
    val defaultOrder: OrderBy? = null,

    @Json(name = "forcesave")
    val forcesave: kotlin.Boolean? = null,

    @Json(name = "storeForcesave")
    val storeForcesave: kotlin.Boolean? = null,

    @Json(name = "recentSection")
    val recentSection: kotlin.Boolean? = null,

    @Json(name = "favoritesSection")
    val favoritesSection: kotlin.Boolean? = null,

    @Json(name = "templatesSection")
    val templatesSection: kotlin.Boolean? = null,

    @Json(name = "downloadTarGz")
    val downloadTarGz: kotlin.Boolean? = null,

    @Json(name = "automaticallyCleanUp")
    val automaticallyCleanUp: AutoCleanUpData? = null,

    @Json(name = "canSearchByContent")
    val canSearchByContent: kotlin.Boolean? = null,

    @Json(name = "defaultSharingAccessRights")
    val defaultSharingAccessRights: kotlin.collections.List<FilesSettingsDto.DefaultSharingAccessRights>? = null,

    @Json(name = "maxUploadThreadCount")
    val maxUploadThreadCount: kotlin.Int? = null,

    @Json(name = "chunkUploadSize")
    val chunkUploadSize: kotlin.Long? = null,

    @Json(name = "openEditorInSameTab")
    val openEditorInSameTab: kotlin.Boolean? = null,

    @Json(name = "organizeRoomsGrouping")
    val organizeRoomsGrouping: kotlin.Boolean? = null,

    @Json(name = "defaultShareLinkInternal")
    val defaultShareLinkInternal: kotlin.Boolean? = null,

    @Json(name = "externalShareApplyToDocuments")
    val externalShareApplyToDocuments: kotlin.Boolean? = null,

    @Json(name = "externalShareApplyToRooms")
    val externalShareApplyToRooms: kotlin.Boolean? = null,

    @Json(name = "blockExistingLinksOnRestrict")
    val blockExistingLinksOnRestrict: kotlin.Boolean? = null,

    @Json(name = "extsFilesVectorized")
    val extsFilesVectorized: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "maxVectorizationFileSize")
    val maxVectorizationFileSize: kotlin.Long? = null

) {

    /**
     * The access rights the sharing dialog offers the caller by default. The portal normalises the set it stores, so  this can be shorter than what was last sent.
     *
     * Values: None,ReadWrite,Read,Restrict,Varies,Review,Comment,FillForms,CustomFilter,RoomManager,Editing,ContentCreator
     */
    @JsonClass(generateAdapter = false)
    enum class DefaultSharingAccessRights(val value: kotlin.Int) {
        @Json(name = "0") None(0),
        @Json(name = "1") ReadWrite(1),
        @Json(name = "2") Read(2),
        @Json(name = "3") Restrict(3),
        @Json(name = "4") Varies(4),
        @Json(name = "5") Review(5),
        @Json(name = "6") Comment(6),
        @Json(name = "7") FillForms(7),
        @Json(name = "8") CustomFilter(8),
        @Json(name = "9") RoomManager(9),
        @Json(name = "10") Editing(10),
        @Json(name = "11") ContentCreator(11);
    }

}

