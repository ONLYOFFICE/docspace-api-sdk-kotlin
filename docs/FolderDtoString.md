
# FolderDtoString

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The file entry title. |  [optional] |
| **access** | [**FileShare**](FileShare.md) |  |  [optional] |
| **sharedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **ownedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
| **sharedForUser** | **kotlin.Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
| **parentShared** | **kotlin.Boolean** | Indicates whether the parent entity is shared. |  [optional] |
| **shortWebUrl** | [**java.net.URI**](java.net.URI.md) | The short Web URL. |  [optional] |
| **created** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **createdBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **updated** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **autoDelete** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **rootFolderType** | [**FolderType**](FolderType.md) |  |  [optional] |
| **parentRoomType** | [**FolderType**](FolderType.md) |  |  [optional] |
| **updatedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **providerItem** | **kotlin.Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
| **providerKey** | **kotlin.String** | The provider key of the file entry. |  [optional] |
| **providerId** | **kotlin.Int** | The provider ID of the file entry. |  [optional] |
| **order** | **kotlin.String** | The order of the file entry. |  [optional] |
| **isFavorite** | **kotlin.Boolean** | Specifies if the file is a favorite or not. |  [optional] |
| **fileEntryType** | [**FileEntryType**](FileEntryType.md) |  |  [optional] |
| **id** | **kotlin.String** | The file entry ID. |  [optional] |
| **rootFolderId** | **kotlin.String** | The root folder ID of the file entry. |  [optional] |
| **originId** | **kotlin.String** | The origin ID of the file entry. |  [optional] |
| **originRoomId** | **kotlin.String** | The origin room ID of the file entry. |  [optional] |
| **originTitle** | **kotlin.String** | The origin title of the file entry. |  [optional] |
| **originRoomTitle** | **kotlin.String** | The origin room title of the file entry. |  [optional] |
| **canShare** | **kotlin.Boolean** | Specifies if the file entry can be shared or not. |  [optional] |
| **shareSettings** | [**FileEntryDtoIntegerAllOfShareSettings**](FileEntryDtoIntegerAllOfShareSettings.md) |  |  [optional] |
| **security** | [**FileEntryDtoIntegerAllOfSecurity**](FileEntryDtoIntegerAllOfSecurity.md) |  |  [optional] |
| **availableShareRights** | [**FileEntryDtoIntegerAllOfAvailableShareRights**](FileEntryDtoIntegerAllOfAvailableShareRights.md) |  |  [optional] |
| **requestToken** | **kotlin.String** | The request token of the file entry. |  [optional] |
| **&#x60;external&#x60;** | **kotlin.Boolean** | Specifies if the folder can be accessed via an external link or not. |  [optional] |
| **expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **isLinkExpired** | **kotlin.Boolean** | Indicates whether the shareable link associated with the file or folder has expired. |  [optional] |
| **parentId** | **kotlin.String** | The parent folder ID of the folder. |  [optional] |
| **filesCount** | **kotlin.Int** | The number of files that the folder contains. |  [optional] |
| **foldersCount** | **kotlin.Int** | The number of folders that the folder contains. |  [optional] |
| **isShareable** | **kotlin.Boolean** | Specifies if the folder can be shared or not. |  [optional] |
| **new** | **kotlin.Int** | The new element index in the folder. |  [optional] |
| **mute** | **kotlin.Boolean** | Specifies if the folder notifications are enabled or not. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of tags of the folder. |  [optional] |
| **logo** | [**Logo**](Logo.md) |  |  [optional] |
| **pinned** | **kotlin.Boolean** | Specifies if the folder is pinned or not. |  [optional] |
| **roomType** | [**RoomType**](RoomType.md) |  |  [optional] |
| **&#x60;private&#x60;** | **kotlin.Boolean** | Specifies if the folder is private or not. |  [optional] |
| **indexing** | **kotlin.Boolean** | Specifies if the folder is indexed or not. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies if the folder can be downloaded or not. |  [optional] |
| **lifetime** | [**RoomDataLifetimeDto**](RoomDataLifetimeDto.md) |  |  [optional] |
| **watermark** | [**WatermarkDto**](WatermarkDto.md) |  |  [optional] |
| **type** | [**FolderType**](FolderType.md) |  |  [optional] |
| **inRoom** | **kotlin.Boolean** | Specifies if the folder is placed in the room or not. |  [optional] |
| **quotaLimit** | **kotlin.Long** | The folder quota limit. |  [optional] |
| **isCustomQuota** | **kotlin.Boolean** | Specifies if the folder room has a custom quota or not. |  [optional] |
| **usedSpace** | **kotlin.Long** | How much folder space is used (counter). |  [optional] |
| **passwordProtected** | **kotlin.Boolean** | Specifies if the folder is password protected or not. |  [optional] |
| **expired** | **kotlin.Boolean** | Specifies if an external link to the folder is expired or not. |  [optional] |
| **chatSettings** | [**ChatSettings**](ChatSettings.md) |  |  [optional] |
| **rootRoomType** | [**RoomType**](RoomType.md) |  |  [optional] |



