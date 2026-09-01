
# FileDtoInteger

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The file entry title. |  [optional] |
| **access** | [**FileShare**](FileShare.md) | The access rights to the file entry. |  [optional] |
| **sharedBy** | [**EmployeeDto**](EmployeeDto.md) | Provides information about the employee who shared the file or folder. |  [optional] |
| **ownedBy** | [**EmployeeDto**](EmployeeDto.md) | The information about the employee who owns the file entry. |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
| **sharedForUser** | **kotlin.Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
| **sharedExternal** | **kotlin.Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
| **parentShared** | **kotlin.Boolean** | Indicates whether the parent entity is shared. |  [optional] |
| **shortWebUrl** | [**java.net.URI**](java.net.URI.md) | The short Web URL. |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The creation date and time of the file entry. |  [optional] |
| **createdBy** | [**EmployeeDto**](EmployeeDto.md) | The file entry author. |  [optional] |
| **updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last date and time when the file entry was updated. |  [optional] |
| **autoDelete** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the file entry will be automatically deleted. |  [optional] |
| **rootFolderType** | [**FolderType**](FolderType.md) | The root folder type of the file entry. |  [optional] |
| **parentRoomType** | [**FolderType**](FolderType.md) | The parent room type of the file entry. |  [optional] |
| **updatedBy** | [**EmployeeDto**](EmployeeDto.md) | The user who updated the file entry. |  [optional] |
| **providerItem** | **kotlin.Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
| **providerKey** | **kotlin.String** | The provider key of the file entry. |  [optional] |
| **providerId** | **kotlin.Int** | The provider ID of the file entry. |  [optional] |
| **order** | **kotlin.String** | The order of the file entry. |  [optional] |
| **isFavorite** | **kotlin.Boolean** | Specifies if the file is a favorite or not. |  [optional] |
| **fileEntryType** | [**FileEntryType**](FileEntryType.md) | The file entry type. |  [optional] |
| **id** | **kotlin.Int** | The file entry ID. |  [optional] |
| **rootFolderId** | **kotlin.Int** | The root folder ID of the file entry. |  [optional] |
| **originId** | **kotlin.Int** | The origin ID of the file entry. |  [optional] |
| **originRoomId** | **kotlin.Int** | The origin room ID of the file entry. |  [optional] |
| **originTitle** | **kotlin.String** | The origin title of the file entry. |  [optional] |
| **originRoomTitle** | **kotlin.String** | The origin room title of the file entry. |  [optional] |
| **canShare** | **kotlin.Boolean** | Specifies if the file entry can be shared or not. |  [optional] |
| **shareSettings** | [**FileEntryDtoIntegerAllOfShareSettings**](FileEntryDtoIntegerAllOfShareSettings.md) |  |  [optional] |
| **security** | [**FileEntryDtoIntegerAllOfSecurity**](FileEntryDtoIntegerAllOfSecurity.md) |  |  [optional] |
| **availableShareRights** | [**FileEntryDtoIntegerAllOfAvailableShareRights**](FileEntryDtoIntegerAllOfAvailableShareRights.md) |  |  [optional] |
| **requestToken** | **kotlin.String** | The request token of the file entry. |  [optional] |
| **&#x60;external&#x60;** | **kotlin.Boolean** | Specifies if the folder can be accessed via an external link or not. |  [optional] |
| **expirationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Represents the expiration date of the file entry. |  [optional] |
| **isLinkExpired** | **kotlin.Boolean** | Indicates whether the shareable link associated with the file or folder has expired. |  [optional] |
| **folderId** | **kotlin.Int** | The folder ID where the file is located. |  [optional] |
| **version** | **kotlin.Int** | The file version. |  [optional] |
| **versionGroup** | **kotlin.Int** | The version group of the file. |  [optional] |
| **contentLength** | **kotlin.String** | The content length of the file. |  [optional] |
| **pureContentLength** | **kotlin.Long** | The pure content length of the file. |  [optional] |
| **fileStatus** | [**FileStatus**](FileStatus.md) | The current status of the file. |  [optional] |
| **editingBy** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String?&gt;** | The list of users editing the file. |  [optional] |
| **mute** | **kotlin.Boolean** | Specifies if the file is muted or not. |  [optional] |
| **viewUrl** | [**java.net.URI**](java.net.URI.md) | The URL link to view the file. |  [optional] |
| **webUrl** | [**java.net.URI**](java.net.URI.md) | The Web URL link to the file. |  [optional] |
| **fileType** | [**FileType**](FileType.md) | The file type. |  [optional] |
| **fileExst** | **kotlin.String** | The file extension. |  [optional] |
| **comment** | **kotlin.String** | The comment to the file. |  [optional] |
| **encrypted** | **kotlin.Boolean** | Specifies if the file is encrypted or not. |  [optional] |
| **thumbnailUrl** | [**java.net.URI**](java.net.URI.md) | The thumbnail URL of the file. |  [optional] |
| **thumbnailStatus** | [**Thumbnail**](Thumbnail.md) | The current thumbnail status of the file. |  [optional] |
| **locked** | **kotlin.Boolean** | Specifies if the file is locked or not. |  [optional] |
| **lockedBy** | **kotlin.String** | The user ID of the person who locked the file. |  [optional] |
| **hasDraft** | **kotlin.Boolean** | Specifies if the file has a draft or not. |  [optional] |
| **formFillingStatus** | [**FormFillingStatus**](FormFillingStatus.md) | The status of the form filling process. |  [optional] |
| **isForm** | **kotlin.Boolean** | Specifies if the file is a form or not. |  [optional] |
| **customFilterEnabled** | **kotlin.Boolean** | Specifies if the Custom Filter editing mode is enabled for a file or not. |  [optional] |
| **customFilterEnabledBy** | **kotlin.String** | The name of the user who enabled a Custom Filter editing mode for a file. |  [optional] |
| **startFilling** | **kotlin.Boolean** | Specifies if the filling has started or not. |  [optional] |
| **isFillingPreparing** | **kotlin.Boolean** | Specifies if the form filling has started but the file is still being saved by the document editor. Filling and editing are not allowed. |  [optional] |
| **inProcessFolderId** | **kotlin.Int** | The InProcess folder ID of the file. |  [optional] |
| **inProcessFolderTitle** | **kotlin.String** | The InProcess folder title of the file. |  [optional] |
| **resultsFolderId** | **kotlin.Int** | The ID of the FormFillingFolderDone folder that corresponds to this original form. |  [optional] |
| **draftLocation** | [**DraftLocationInteger**](DraftLocationInteger.md) | The file draft information with its location. |  [optional] |
| **viewAccessibility** | [**FileDtoIntegerAllOfViewAccessibility**](FileDtoIntegerAllOfViewAccessibility.md) |  |  [optional] |
| **lastOpened** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time when the file was last opened. |  [optional] |
| **expired** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the file will be expired. |  [optional] |
| **vectorizationStatus** | [**VectorizationStatus**](VectorizationStatus.md) | The vectorization status of the file. |  [optional] |
| **externalDbTableName** | **kotlin.String** | The name of the table in the external database that corresponds to this form. |  [optional] |
| **dimensions** | [**Size**](Size.md) | The dimensions (width and height) of the image file in pixels.  This property is populated only for image files that can be viewed (supported formats like PNG, JPEG, GIF, BMP, etc.).  For non-image files, this property remains null. |  [optional] |



