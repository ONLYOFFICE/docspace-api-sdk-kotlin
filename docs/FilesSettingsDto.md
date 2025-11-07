
# FilesSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **extsImagePreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the viewed images. |  [optional] |
| **extsMediaPreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the viewed media files. |  [optional] |
| **extsWebPreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the viewed files. |  [optional] |
| **extsWebEdited** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the edited files. |  [optional] |
| **extsWebEncrypt** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the encrypted files. |  [optional] |
| **extsWebReviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the reviewed files. |  [optional] |
| **extsWebCustomFilterEditing** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the custom filter files. |  [optional] |
| **extsWebRestrictedEditing** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the files that are restricted for editing. |  [optional] |
| **extsWebCommented** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the commented files. |  [optional] |
| **extsWebTemplate** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the template files. |  [optional] |
| **extsMustConvert** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the files that must be converted. |  [optional] |
| **extsConvertible** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;** | The list of the convertible extensions. |  [optional] |
| **extsUploadable** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the uploadable extensions. |  [optional] |
| **extsArchive** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of extensions of the archive files. |  [optional] |
| **extsVideo** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the video extensions. |  [optional] |
| **extsAudio** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the audio extensions. |  [optional] |
| **extsImage** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the image extensions. |  [optional] |
| **extsSpreadsheet** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the spreadsheet extensions. |  [optional] |
| **extsPresentation** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the presentation extensions. |  [optional] |
| **extsDocument** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the text document extensions. |  [optional] |
| **extsDiagram** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of the diagram extensions. |  [optional] |
| **internalFormats** | [**FilesSettingsDtoInternalFormats**](FilesSettingsDtoInternalFormats.md) |  |  [optional] |
| **masterFormExtension** | **kotlin.String** | The master form extension. |  [optional] |
| **paramVersion** | **kotlin.String** | The URL parameter which specifies the file version. |  [optional] |
| **paramOutType** | **kotlin.String** | The URL parameter which specifies the output type of the converted file. |  [optional] |
| **fileDownloadUrlString** | [**java.net.URI**](java.net.URI.md) | The URL to download a file. |  [optional] |
| **fileWebViewerUrlString** | **kotlin.String** | The URL to the file web viewer. |  [optional] |
| **fileWebViewerExternalUrlString** | [**java.net.URI**](java.net.URI.md) | The external URL to the file web viewer. |  [optional] |
| **fileWebEditorUrlString** | **kotlin.String** | The URL to the file web editor. |  [optional] |
| **fileWebEditorExternalUrlString** | [**java.net.URI**](java.net.URI.md) | The external URL to the file web editor. |  [optional] |
| **fileRedirectPreviewUrlString** | [**java.net.URI**](java.net.URI.md) | The redirect URL to the file viewer. |  [optional] |
| **fileThumbnailUrlString** | [**java.net.URI**](java.net.URI.md) | The URL to the file thumbnail. |  [optional] |
| **confirmDelete** | **kotlin.Boolean** | Specifies whether to confirm the file deletion or not. |  [optional] |
| **enableThirdParty** | **kotlin.Boolean** | Specifies whether to allow users to connect the third-party storages. |  [optional] |
| **externalShare** | **kotlin.Boolean** | Specifies whether to enable sharing external links to the files. |  [optional] |
| **externalShareSocialMedia** | **kotlin.Boolean** | Specifies whether to enable sharing files on social media. |  [optional] |
| **storeOriginalFiles** | **kotlin.Boolean** | Specifies whether to enable storing original files. |  [optional] |
| **keepNewFileName** | **kotlin.Boolean** | Specifies whether to keep the new file name. |  [optional] |
| **displayFileExtension** | **kotlin.Boolean** | Specifies whether to display the file extension. |  [optional] |
| **convertNotify** | **kotlin.Boolean** | Specifies whether to display the conversion notification. |  [optional] |
| **hideConfirmCancelOperation** | **kotlin.Boolean** | Specifies whether to hide the confirmation dialog for the cancel operation. |  [optional] |
| **hideConfirmConvertSave** | **kotlin.Boolean** | Specifies whether to hide the confirmation dialog  for saving the file copy in the original format when converting a file. |  [optional] |
| **hideConfirmConvertOpen** | **kotlin.Boolean** | Specifies whether to hide the confirmation dialog  for opening the conversion result. |  [optional] |
| **hideConfirmRoomLifetime** | **kotlin.Boolean** | Specifies whether to hide the confirmation dialog about the file lifetime in the room. |  [optional] |
| **defaultOrder** | [**OrderBy**](OrderBy.md) |  |  [optional] |
| **forcesave** | **kotlin.Boolean** | Specifies whether to forcesave the files or not. |  [optional] |
| **storeForcesave** | **kotlin.Boolean** | Specifies whether to store the forcesaved file versions or not. |  [optional] |
| **recentSection** | **kotlin.Boolean** | Specifies if the Recent section is displayed or not. |  [optional] |
| **favoritesSection** | **kotlin.Boolean** | Specifies if the Favorites section is displayed or not. |  [optional] |
| **templatesSection** | **kotlin.Boolean** | Specifies if the Templates section is displayed or not. |  [optional] |
| **downloadTarGz** | **kotlin.Boolean** | Specifies whether to download the .tar.gz files or not. |  [optional] |
| **automaticallyCleanUp** | [**AutoCleanUpData**](AutoCleanUpData.md) |  |  [optional] |
| **canSearchByContent** | **kotlin.Boolean** | Specifies whether the file can be searched by its content or not. |  [optional] |
| **defaultSharingAccessRights** | [**inline**](#kotlin.collections.List&lt;DefaultSharingAccessRights&gt;) | The default access rights in sharing settings. |  [optional] |
| **maxUploadThreadCount** | **kotlin.Int** | The maximum number of upload threads. |  [optional] |
| **chunkUploadSize** | **kotlin.Long** | The size of a large file that is uploaded in chunks. |  [optional] |
| **openEditorInSameTab** | **kotlin.Boolean** | Specifies whether to open the editor in the same tab or not. |  [optional] |
| **extsFilesVectorized** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of extensions available for vectorization |  [optional] |
| **maxVectorizationFileSize** | **kotlin.Long** | The maximum file size for vectorization |  [optional] |


<a id="kotlin.collections.List<DefaultSharingAccessRights>"></a>
## Enum: defaultSharingAccessRights
| Name | Value |
| ---- | ----- |
| defaultSharingAccessRights | 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 |



