
# FilesSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **extsImagePreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | Images the portal can show in its own viewer. Anything outside the list has to be downloaded to be seen. |  [optional] |
| **extsMediaPreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | Audio and video the portal can play in its own player. |  [optional] |
| **extsWebPreviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents the editor can open read-only. A format that is here but not in the edited list can be viewed and  not changed. |  [optional] |
| **extsWebEdited** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents the editor can open for editing. Uploading a format outside this list and outside the convertible  list leaves a file that can only be downloaded. |  [optional] |
| **extsWebEncrypt** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents that can be edited inside a private room, where the content is encrypted on the client. |  [optional] |
| **extsWebReviewed** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents that support the reviewing mode, so that granting review access to them is meaningful. |  [optional] |
| **extsWebCustomFilterEditing** | **kotlin.collections.List&lt;kotlin.String&gt;** | Spreadsheets that support the custom filter mode, where a filter applied by one editor does not disturb the  others. |  [optional] |
| **extsWebRestrictedEditing** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents that can only be filled in or commented on rather than edited freely, whatever access the caller  holds. |  [optional] |
| **extsWebCommented** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents that support comments, so that granting comment access to them is meaningful. |  [optional] |
| **extsWebTemplate** | **kotlin.collections.List&lt;kotlin.String&gt;** | Documents the portal treats as templates to create new files from. |  [optional] |
| **extsMustConvert** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats that cannot be edited as they are and are converted on upload or on first opening. Which target each  one has is in the convertible table below. |  [optional] |
| **extsConvertible** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;?&gt;** | The conversion map of the portal: for each source extension, the extensions it can be converted into. Use it  to fill the target format of a conversion request instead of guessing one. |  [optional] |
| **extsUploadable** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats the portal offers to create and upload as documents. It is not an upload filter: files of other  formats are stored as they are. |  [optional] |
| **extsArchive** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats recognised as archives, which is what decides the archive icon and the offer to unpack. |  [optional] |
| **extsVideo** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as video. The classification lists drive icons and the media filters of the listing  operations, and are wider than what the built-in player can show. |  [optional] |
| **extsAudio** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as audio. |  [optional] |
| **extsImage** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as images. |  [optional] |
| **extsSpreadsheet** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as spreadsheets. |  [optional] |
| **extsPresentation** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as presentations. |  [optional] |
| **extsDocument** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as text documents. |  [optional] |
| **extsDiagram** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats classified as diagrams. |  [optional] |
| **internalFormats** | [**FilesSettingsDtoInternalFormats**](FilesSettingsDtoInternalFormats.md) |  |  [optional] |
| **masterFormExtension** | **kotlin.String** | The extension of a fillable form template in this portal. It is configurable, so read it rather than assuming  the product default. |  [optional] |
| **paramVersion** | **kotlin.String** | The name of the query parameter that pins a document address to one version. Append it to the addresses below  instead of composing a version address by hand. |  [optional] |
| **paramOutType** | **kotlin.String** | The name of the query parameter that asks a download address for a converted copy in another format. |  [optional] |
| **fileDownloadUrlString** | [**java.net.URI**](java.net.URI.md) | The template of the address a file is downloaded from: substitute the file identifier for the `{0}`  placeholder. Add the version and output-type parameters named above for a particular version or format. |  [optional] |
| **fileWebViewerUrlString** | **kotlin.String** | The template of the address that opens a file in the viewer inside the portal, with `{0}` for the file  identifier. It is a portal-relative address, meant to be opened in a browser rather than called as an API. |  [optional] |
| **fileWebViewerExternalUrlString** | [**java.net.URI**](java.net.URI.md) | The same viewer address as an absolute one, for a message or a page outside the portal. |  [optional] |
| **fileWebEditorUrlString** | **kotlin.String** | The template of the address that opens a file for editing inside the portal, with `{0}` for the file  identifier. Whether the session really becomes editable still depends on the access the caller holds. |  [optional] |
| **fileWebEditorExternalUrlString** | [**java.net.URI**](java.net.URI.md) | The same editing address as an absolute one, for use outside the portal. |  [optional] |
| **fileRedirectPreviewUrlString** | [**java.net.URI**](java.net.URI.md) | The template of the address that sends the browser on to whichever viewer or editor suits the file, with `{0}`  for the file identifier. Use it when the kind of the file is not known in advance. |  [optional] |
| **fileThumbnailUrlString** | [**java.net.URI**](java.net.URI.md) | The template of the address a file thumbnail is fetched from, with `{0}` for the file identifier. A thumbnail  is built in the background, so the address can answer with nothing for a while after the file appears. |  [optional] |
| **confirmDelete** | **kotlin.Boolean** | Whether the caller asked to be prompted before a deletion. Written by `PUT api/2.0/files/changedeleteconfrim`. |  [optional] |
| **enableThirdParty** | **kotlin.Boolean** | Whether this portal allows third-party storages to be connected at all. It is set portal-wide by an  administrator, so a member sees it as read-only. |  [optional] |
| **externalShare** | **kotlin.Boolean** | Whether links that open an entry without a portal account may be created in this portal. Set portal-wide by an  administrator. |  [optional] |
| **externalShareSocialMedia** | **kotlin.Boolean** | Whether the share-to-network buttons are offered next to an external link. It is reported as false whenever  external sharing itself is off. |  [optional] |
| **storeOriginalFiles** | **kotlin.Boolean** | Whether the caller's uploads keep the original file when the portal converts them. With false the conversion  replaces the uploaded file with a new version of it. |  [optional] |
| **keepNewFileName** | **kotlin.Boolean** | Whether the caller asked for new documents to be created with the default name instead of being prompted for  one. |  [optional] |
| **displayFileExtension** | **kotlin.Boolean** | Whether the caller asked to see extensions in file titles. Stored titles always carry the extension whatever  this says. |  [optional] |
| **showQuickActions** | **kotlin.Boolean** | Specifies whether to display the quick action buttons. |  [optional] |
| **convertNotify** | **kotlin.Boolean** | Whether the caller is told about the result of a conversion. There is no operation in this document that  writes it. |  [optional] |
| **hideConfirmCancelOperation** | **kotlin.Boolean** | Whether the prompt shown before a running operation is abandoned is hidden for the caller. |  [optional] |
| **hideConfirmConvertSave** | **kotlin.Boolean** | Whether the prompt that offers to keep a copy in the original format on conversion is hidden for the caller.  Once true it cannot be turned back through the API. |  [optional] |
| **hideConfirmConvertOpen** | **kotlin.Boolean** | Whether the prompt that offers to open the conversion result is hidden for the caller. Once true it cannot be  turned back through the API. |  [optional] |
| **hideConfirmRoomLifetime** | **kotlin.Boolean** | Whether the warning shown before the lifetime settings of a room are changed is hidden for the caller. |  [optional] |
| **defaultOrder** | [**OrderBy**](OrderBy.md) | The ordering the listing operations fall back to when a request names none. It follows the last order the  caller asked a listing for, so it changes on its own as the account is used. |  [optional] |
| **forcesave** | **kotlin.Boolean** | Whether the editor writes a document back to storage while the session is still open. It is on for every  portal and cannot be switched off. |  [optional] |
| **storeForcesave** | **kotlin.Boolean** | Whether those intermediate saves are kept as separate versions. They are not, in any portal: they update the  current version instead. |  [optional] |
| **recentSection** | **kotlin.Boolean** | Whether the Recent section is offered to the caller among the section roots. |  [optional] |
| **favoritesSection** | **kotlin.Boolean** | Whether the Favorites section is offered to the caller among the section roots. |  [optional] |
| **templatesSection** | **kotlin.Boolean** | Whether the Templates section is offered to the caller among the section roots. |  [optional] |
| **downloadTarGz** | **kotlin.Boolean** | The archive format the caller's multi-item downloads are packed into: true for `.tar.gz`, false for `.zip`. |  [optional] |
| **automaticallyCleanUp** | [**AutoCleanUpData**](AutoCleanUpData.md) | The trash auto-clearing setting of the caller, the same pair `GET api/2.0/files/settings/autocleanup` returns. |  [optional] |
| **canSearchByContent** | **kotlin.Boolean** | Whether documents in this portal can be searched by what is inside them and not only by title. It depends on  the full-text search service being configured and having indexed the portal. |  [optional] |
| **defaultSharingAccessRights** | [**inline**](#kotlin.collections.List&lt;DefaultSharingAccessRights&gt;) | The access rights the sharing dialog offers the caller by default. The portal normalises the set it stores, so  this can be shorter than what was last sent. |  [optional] |
| **maxUploadThreadCount** | **kotlin.Int** | How many upload requests the portal accepts from one account at a time. Sending more than this in parallel  gets the extra ones refused rather than queued. |  [optional] |
| **chunkUploadSize** | **kotlin.Long** | The size in bytes of one chunk of a chunked upload. Split a large file exactly along this size: a chunk that  does not match is refused by the upload session. |  [optional] |
| **openEditorInSameTab** | **kotlin.Boolean** | Whether the caller asked for documents to open in the current browser tab. |  [optional] |
| **organizeRoomsGrouping** | **kotlin.Boolean** | Whether the caller asked to see rooms arranged by the groups they belong to. |  [optional] |
| **defaultShareLinkInternal** | **kotlin.Boolean** | The kind of external link this portal offers first: true for a link only its own accounts can open, false for  one anyone holding it can open. |  [optional] |
| **externalShareApplyToDocuments** | **kotlin.Boolean** | Whether the external sharing restriction covers personal documents. It matters only while external sharing is  off. |  [optional] |
| **externalShareApplyToRooms** | **kotlin.Boolean** | Whether the external sharing restriction covers rooms, including making a new one public. It matters only  while external sharing is off. |  [optional] |
| **blockExistingLinksOnRestrict** | **kotlin.Boolean** | Whether links created before the restriction stop opening as well, rather than only new ones being refused. |  [optional] |
| **extsFilesVectorized** | **kotlin.collections.List&lt;kotlin.String&gt;** | Formats whose content can be indexed for the AI features of the portal. A file outside the list is left out of  that index. |  [optional] |
| **maxVectorizationFileSize** | **kotlin.Long** | The largest file size in bytes that is indexed for the AI features. A larger file is skipped even when its  format is listed above. |  [optional] |


<a id="kotlin.collections.List<DefaultSharingAccessRights>"></a>
## Enum: defaultSharingAccessRights
| Name | Value |
| ---- | ----- |
| defaultSharingAccessRights | 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 |



