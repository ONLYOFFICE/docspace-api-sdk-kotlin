
# FileEntryDtoInteger

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



