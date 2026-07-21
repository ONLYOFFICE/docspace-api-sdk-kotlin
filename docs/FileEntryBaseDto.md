
# FileEntryBaseDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The file entry title. |  [optional] |
| **access** | [**FileShare**](FileShare.md) |  |  [optional] |
| **sharedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **ownedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
| **sharedForUser** | **kotlin.Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
| **sharedExternal** | **kotlin.Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
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



