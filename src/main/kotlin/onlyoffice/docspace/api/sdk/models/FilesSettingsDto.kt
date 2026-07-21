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
 * The file settings parameters.
 *
 * @param extsImagePreviewed The list of extensions of the viewed images.
 * @param extsMediaPreviewed The list of extensions of the viewed media files.
 * @param extsWebPreviewed The list of extensions of the viewed files.
 * @param extsWebEdited The list of extensions of the edited files.
 * @param extsWebEncrypt The list of extensions of the encrypted files.
 * @param extsWebReviewed The list of extensions of the reviewed files.
 * @param extsWebCustomFilterEditing The list of extensions of the custom filter files.
 * @param extsWebRestrictedEditing The list of extensions of the files that are restricted for editing.
 * @param extsWebCommented The list of extensions of the commented files.
 * @param extsWebTemplate The list of extensions of the template files.
 * @param extsMustConvert The list of extensions of the files that must be converted.
 * @param extsConvertible The list of the convertible extensions.
 * @param extsUploadable The list of the uploadable extensions.
 * @param extsArchive The list of extensions of the archive files.
 * @param extsVideo The list of the video extensions.
 * @param extsAudio The list of the audio extensions.
 * @param extsImage The list of the image extensions.
 * @param extsSpreadsheet The list of the spreadsheet extensions.
 * @param extsPresentation The list of the presentation extensions.
 * @param extsDocument The list of the text document extensions.
 * @param extsDiagram The list of the diagram extensions.
 * @param internalFormats 
 * @param masterFormExtension The master form extension.
 * @param paramVersion The URL parameter which specifies the file version.
 * @param paramOutType The URL parameter which specifies the output type of the converted file.
 * @param fileDownloadUrlString The URL to download a file.
 * @param fileWebViewerUrlString The URL to the file web viewer.
 * @param fileWebViewerExternalUrlString The external URL to the file web viewer.
 * @param fileWebEditorUrlString The URL to the file web editor.
 * @param fileWebEditorExternalUrlString The external URL to the file web editor.
 * @param fileRedirectPreviewUrlString The redirect URL to the file viewer.
 * @param fileThumbnailUrlString The URL to the file thumbnail.
 * @param confirmDelete Specifies whether to confirm the file deletion or not.
 * @param enableThirdParty Specifies whether to allow users to connect the third-party storages.
 * @param externalShare Specifies whether to enable sharing external links to the files.
 * @param externalShareSocialMedia Specifies whether to enable sharing files on social media.
 * @param storeOriginalFiles Specifies whether to enable storing original files.
 * @param keepNewFileName Specifies whether to keep the new file name.
 * @param displayFileExtension Specifies whether to display the file extension.
 * @param convertNotify Specifies whether to display the conversion notification.
 * @param hideConfirmCancelOperation Specifies whether to hide the confirmation dialog for the cancel operation.
 * @param hideConfirmConvertSave Specifies whether to hide the confirmation dialog  for saving the file copy in the original format when converting a file.
 * @param hideConfirmConvertOpen Specifies whether to hide the confirmation dialog  for opening the conversion result.
 * @param hideConfirmRoomLifetime Specifies whether to hide the confirmation dialog about the file lifetime in the room.
 * @param defaultOrder 
 * @param forcesave Specifies whether to forcesave the files or not.
 * @param storeForcesave Specifies whether to store the forcesaved file versions or not.
 * @param recentSection Specifies if the Recent section is displayed or not.
 * @param favoritesSection Specifies if the Favorites section is displayed or not.
 * @param templatesSection Specifies if the Templates section is displayed or not.
 * @param downloadTarGz Specifies whether to download the .tar.gz files or not.
 * @param automaticallyCleanUp 
 * @param canSearchByContent Specifies whether the file can be searched by its content or not.
 * @param defaultSharingAccessRights The default access rights in sharing settings.
 * @param maxUploadThreadCount The maximum number of upload threads.
 * @param chunkUploadSize The size of a large file that is uploaded in chunks.
 * @param openEditorInSameTab Specifies whether to open the editor in the same tab or not.
 * @param organizeRoomsGrouping Specifies whether the grouping of rooms is enabled or not.
 * @param defaultShareLinkInternal Specifies the default sharing link type: true = DocSpace users only (internal), false = Anyone with the link.
 * @param externalShareApplyToDocuments When external sharing is restricted, specifies whether the restriction applies to the My Documents section.
 * @param externalShareApplyToRooms When external sharing is restricted, specifies whether the restriction applies to the Rooms section.
 * @param blockExistingLinksOnRestrict When external sharing is restricted, specifies whether existing public links are blocked immediately.
 * @param extsFilesVectorized List of extensions available for vectorization
 * @param maxVectorizationFileSize The maximum file size for vectorization
 */


data class FilesSettingsDto (

    /* The list of extensions of the viewed images. */
    @Json(name = "extsImagePreviewed")
    val extsImagePreviewed: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the viewed media files. */
    @Json(name = "extsMediaPreviewed")
    val extsMediaPreviewed: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the viewed files. */
    @Json(name = "extsWebPreviewed")
    val extsWebPreviewed: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the edited files. */
    @Json(name = "extsWebEdited")
    val extsWebEdited: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the encrypted files. */
    @Json(name = "extsWebEncrypt")
    val extsWebEncrypt: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the reviewed files. */
    @Json(name = "extsWebReviewed")
    val extsWebReviewed: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the custom filter files. */
    @Json(name = "extsWebCustomFilterEditing")
    val extsWebCustomFilterEditing: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the files that are restricted for editing. */
    @Json(name = "extsWebRestrictedEditing")
    val extsWebRestrictedEditing: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the commented files. */
    @Json(name = "extsWebCommented")
    val extsWebCommented: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the template files. */
    @Json(name = "extsWebTemplate")
    val extsWebTemplate: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the files that must be converted. */
    @Json(name = "extsMustConvert")
    val extsMustConvert: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the convertible extensions. */
    @Json(name = "extsConvertible")
    val extsConvertible: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>?>? = null,

    /* The list of the uploadable extensions. */
    @Json(name = "extsUploadable")
    val extsUploadable: kotlin.collections.List<kotlin.String>? = null,

    /* The list of extensions of the archive files. */
    @Json(name = "extsArchive")
    val extsArchive: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the video extensions. */
    @Json(name = "extsVideo")
    val extsVideo: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the audio extensions. */
    @Json(name = "extsAudio")
    val extsAudio: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the image extensions. */
    @Json(name = "extsImage")
    val extsImage: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the spreadsheet extensions. */
    @Json(name = "extsSpreadsheet")
    val extsSpreadsheet: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the presentation extensions. */
    @Json(name = "extsPresentation")
    val extsPresentation: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the text document extensions. */
    @Json(name = "extsDocument")
    val extsDocument: kotlin.collections.List<kotlin.String>? = null,

    /* The list of the diagram extensions. */
    @Json(name = "extsDiagram")
    val extsDiagram: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "internalFormats")
    val internalFormats: FilesSettingsDtoInternalFormats? = null,

    /* The master form extension. */
    @Json(name = "masterFormExtension")
    val masterFormExtension: kotlin.String? = null,

    /* The URL parameter which specifies the file version. */
    @Json(name = "paramVersion")
    val paramVersion: kotlin.String? = null,

    /* The URL parameter which specifies the output type of the converted file. */
    @Json(name = "paramOutType")
    val paramOutType: kotlin.String? = null,

    /* The URL to download a file. */
    @Json(name = "fileDownloadUrlString")
    val fileDownloadUrlString: java.net.URI? = null,

    /* The URL to the file web viewer. */
    @Json(name = "fileWebViewerUrlString")
    val fileWebViewerUrlString: kotlin.String? = null,

    /* The external URL to the file web viewer. */
    @Json(name = "fileWebViewerExternalUrlString")
    val fileWebViewerExternalUrlString: java.net.URI? = null,

    /* The URL to the file web editor. */
    @Json(name = "fileWebEditorUrlString")
    val fileWebEditorUrlString: kotlin.String? = null,

    /* The external URL to the file web editor. */
    @Json(name = "fileWebEditorExternalUrlString")
    val fileWebEditorExternalUrlString: java.net.URI? = null,

    /* The redirect URL to the file viewer. */
    @Json(name = "fileRedirectPreviewUrlString")
    val fileRedirectPreviewUrlString: java.net.URI? = null,

    /* The URL to the file thumbnail. */
    @Json(name = "fileThumbnailUrlString")
    val fileThumbnailUrlString: java.net.URI? = null,

    /* Specifies whether to confirm the file deletion or not. */
    @Json(name = "confirmDelete")
    val confirmDelete: kotlin.Boolean? = null,

    /* Specifies whether to allow users to connect the third-party storages. */
    @Json(name = "enableThirdParty")
    val enableThirdParty: kotlin.Boolean? = null,

    /* Specifies whether to enable sharing external links to the files. */
    @Json(name = "externalShare")
    val externalShare: kotlin.Boolean? = null,

    /* Specifies whether to enable sharing files on social media. */
    @Json(name = "externalShareSocialMedia")
    val externalShareSocialMedia: kotlin.Boolean? = null,

    /* Specifies whether to enable storing original files. */
    @Json(name = "storeOriginalFiles")
    val storeOriginalFiles: kotlin.Boolean? = null,

    /* Specifies whether to keep the new file name. */
    @Json(name = "keepNewFileName")
    val keepNewFileName: kotlin.Boolean? = null,

    /* Specifies whether to display the file extension. */
    @Json(name = "displayFileExtension")
    val displayFileExtension: kotlin.Boolean? = null,

    /* Specifies whether to display the conversion notification. */
    @Json(name = "convertNotify")
    val convertNotify: kotlin.Boolean? = null,

    /* Specifies whether to hide the confirmation dialog for the cancel operation. */
    @Json(name = "hideConfirmCancelOperation")
    val hideConfirmCancelOperation: kotlin.Boolean? = null,

    /* Specifies whether to hide the confirmation dialog  for saving the file copy in the original format when converting a file. */
    @Json(name = "hideConfirmConvertSave")
    val hideConfirmConvertSave: kotlin.Boolean? = null,

    /* Specifies whether to hide the confirmation dialog  for opening the conversion result. */
    @Json(name = "hideConfirmConvertOpen")
    val hideConfirmConvertOpen: kotlin.Boolean? = null,

    /* Specifies whether to hide the confirmation dialog about the file lifetime in the room. */
    @Json(name = "hideConfirmRoomLifetime")
    val hideConfirmRoomLifetime: kotlin.Boolean? = null,

    @Json(name = "defaultOrder")
    val defaultOrder: OrderBy? = null,

    /* Specifies whether to forcesave the files or not. */
    @Json(name = "forcesave")
    val forcesave: kotlin.Boolean? = null,

    /* Specifies whether to store the forcesaved file versions or not. */
    @Json(name = "storeForcesave")
    val storeForcesave: kotlin.Boolean? = null,

    /* Specifies if the Recent section is displayed or not. */
    @Json(name = "recentSection")
    val recentSection: kotlin.Boolean? = null,

    /* Specifies if the Favorites section is displayed or not. */
    @Json(name = "favoritesSection")
    val favoritesSection: kotlin.Boolean? = null,

    /* Specifies if the Templates section is displayed or not. */
    @Json(name = "templatesSection")
    val templatesSection: kotlin.Boolean? = null,

    /* Specifies whether to download the .tar.gz files or not. */
    @Json(name = "downloadTarGz")
    val downloadTarGz: kotlin.Boolean? = null,

    @Json(name = "automaticallyCleanUp")
    val automaticallyCleanUp: AutoCleanUpData? = null,

    /* Specifies whether the file can be searched by its content or not. */
    @Json(name = "canSearchByContent")
    val canSearchByContent: kotlin.Boolean? = null,

    /* The default access rights in sharing settings. */
    @Json(name = "defaultSharingAccessRights")
    val defaultSharingAccessRights: kotlin.collections.List<FilesSettingsDto.DefaultSharingAccessRights>? = null,

    /* The maximum number of upload threads. */
    @Json(name = "maxUploadThreadCount")
    val maxUploadThreadCount: kotlin.Int? = null,

    /* The size of a large file that is uploaded in chunks. */
    @Json(name = "chunkUploadSize")
    val chunkUploadSize: kotlin.Long? = null,

    /* Specifies whether to open the editor in the same tab or not. */
    @Json(name = "openEditorInSameTab")
    val openEditorInSameTab: kotlin.Boolean? = null,

    /* Specifies whether the grouping of rooms is enabled or not. */
    @Json(name = "organizeRoomsGrouping")
    val organizeRoomsGrouping: kotlin.Boolean? = null,

    /* Specifies the default sharing link type: true = DocSpace users only (internal), false = Anyone with the link. */
    @Json(name = "defaultShareLinkInternal")
    val defaultShareLinkInternal: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether the restriction applies to the My Documents section. */
    @Json(name = "externalShareApplyToDocuments")
    val externalShareApplyToDocuments: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether the restriction applies to the Rooms section. */
    @Json(name = "externalShareApplyToRooms")
    val externalShareApplyToRooms: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether existing public links are blocked immediately. */
    @Json(name = "blockExistingLinksOnRestrict")
    val blockExistingLinksOnRestrict: kotlin.Boolean? = null,

    /* List of extensions available for vectorization */
    @Json(name = "extsFilesVectorized")
    val extsFilesVectorized: kotlin.collections.List<kotlin.String>? = null,

    /* The maximum file size for vectorization */
    @Json(name = "maxVectorizationFileSize")
    val maxVectorizationFileSize: kotlin.Long? = null

) {

    /**
     * The default access rights in sharing settings.
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

