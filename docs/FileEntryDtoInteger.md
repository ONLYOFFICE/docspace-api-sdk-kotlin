
# FileEntryDtoInteger

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
| **id** | **kotlin.Int** | The file entry ID. |  [optional] |
| **rootFolderId** | **kotlin.Int** | The root folder ID of the file entry. |  [optional] |
| **originId** | **kotlin.Int** | The origin ID of the file entry. |  [optional] |
| **originRoomId** | **kotlin.Int** | The origin room ID of the file entry. |  [optional] |
| **originTitle** | **kotlin.String** | The origin title of the file entry. |  [optional] |
| **originRoomTitle** | **kotlin.String** | The origin room title of the file entry. |  [optional] |
| **canShare** | **kotlin.Boolean** | Specifies if the file entry can be shared or not. |  [optional] |
| **shareSettings** | [**FolderDtoIntegerShareSettings**](FolderDtoIntegerShareSettings.md) |  |  [optional] |
| **security** | [**FolderDtoIntegerSecurity**](FolderDtoIntegerSecurity.md) |  |  [optional] |
| **availableShareRights** | [**FolderDtoIntegerAvailableShareRights**](FolderDtoIntegerAvailableShareRights.md) |  |  [optional] |
| **requestToken** | **kotlin.String** | The request token of the file entry. |  [optional] |
| **&#x60;external&#x60;** | **kotlin.Boolean** | Specifies if the folder can be accessed via an external link or not. |  [optional] |
| **expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **isLinkExpired** | **kotlin.Boolean** | Indicates whether the shareable link associated with the file or folder has expired. |  [optional] |



