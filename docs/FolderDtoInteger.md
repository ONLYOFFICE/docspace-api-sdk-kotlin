
# FolderDtoInteger

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
| **parentId** | **kotlin.Int** | The parent folder ID of the folder. |  [optional] |
| **filesCount** | **kotlin.Int** | The number of files that the folder contains. |  [optional] |
| **foldersCount** | **kotlin.Int** | The number of folders that the folder contains. |  [optional] |
| **isShareable** | **kotlin.Boolean** | Specifies if the folder can be shared or not. |  [optional] |
| **new** | **kotlin.Int** | The new element index in the folder. |  [optional] |
| **mute** | **kotlin.Boolean** | Specifies if the folder notifications are enabled or not. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tags of the folder. |  [optional] |
| **logo** | [**Logo**](Logo.md) | The folder logo. |  [optional] |
| **pinned** | **kotlin.Boolean** | Specifies if the folder is pinned or not. |  [optional] |
| **roomType** | [**RoomType**](RoomType.md) | The room type of the folder. |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Specifies if the folder is private or not. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies if the folder is indexed or not. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies if the folder can be downloaded or not. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) | The room data lifetime settings of the folder. |  [optional] |
| **watermark** | [**WatermarkDto**](WatermarkDto.md) | The watermark settings of the folder. |  [optional] |
| **type** | [**FolderType**](FolderType.md) | The folder type. |  [optional] |
| **inRoom** | **kotlin.Boolean** | Specifies if the folder is placed in the room or not. |  [optional] |
| **quotaLimit** | **kotlin.Long** | The folder quota limit. |  [optional] |
| **isCustomQuota** | **kotlin.Boolean** | Specifies if the folder room has a custom quota or not. |  [optional] |
| **usedSpace** | **kotlin.Long** | How much folder space is used (counter). |  [optional] |
| **passwordProtected** | **kotlin.Boolean** | Specifies if the folder is password protected or not. |  [optional] |
| **expired** | **kotlin.Boolean** | Specifies if an external link to the folder is expired or not. |  [optional] |
| **chatSettings** | [**ChatSettingsDto**](ChatSettingsDto.md) | The AI chat settings for the folder room. Contains configuration for AI provider, model selection, and custom prompts.  Only applicable to rooms with AI chat functionality enabled. Null if the room does not have chat settings configured. |  [optional] |
| **rootRoomType** | [**RoomType**](RoomType.md) | The room type of the root folder. Indicates the type of the parent room if the current folder is nested within a room hierarchy.  This property helps identify the context in which a nested folder exists. |  [optional] |
| **saveFormAsXLSX** | **kotlin.Boolean** | Specifies whether to save form data as XLSX file. |  [optional] |
| **sendFormToExternalDB** | **kotlin.Boolean** | Specifies whether to send form data to external database. |  [optional] |
| **originalFormId** | **kotlin.Int** | The original form ID that corresponds to this FormFillingFolderDone folder. |  [optional] |



