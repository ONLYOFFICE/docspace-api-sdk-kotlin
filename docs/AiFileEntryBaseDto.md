
# AiFileEntryBaseDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The file entry title. |  [optional] |
| **access** | [**AiFileShare**](AiFileShare.md) | The access rights to the file entry. |  [optional] |
| **sharedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | Provides information about the employee who shared the file or folder. |  [optional] |
| **ownedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The information about the employee who owns the file entry. |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies if the file entry is shared via link or not. |  [optional] |
| **sharedForUser** | **kotlin.Boolean** | Specifies if the file entry is shared for user or not. |  [optional] |
| **sharedExternal** | **kotlin.Boolean** | Specifies if the file entry is shared via a public (non-internal) external link. |  [optional] |
| **parentShared** | **kotlin.Boolean** | Indicates whether the parent entity is shared. |  [optional] |
| **shortWebUrl** | [**java.net.URI**](java.net.URI.md) | The short Web URL. |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The creation date and time of the file entry. |  [optional] |
| **createdBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The file entry author. |  [optional] |
| **updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last date and time when the file entry was updated. |  [optional] |
| **autoDelete** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the file entry will be automatically deleted. |  [optional] |
| **rootFolderType** | [**AiFolderType**](AiFolderType.md) | The root folder type of the file entry. |  [optional] |
| **parentRoomType** | [**AiFolderType**](AiFolderType.md) | The parent room type of the file entry. |  [optional] |
| **updatedBy** | [**AiEmployeeDto**](AiEmployeeDto.md) | The user who updated the file entry. |  [optional] |
| **providerItem** | **kotlin.Boolean** | Specifies if the file entry provider is specified or not. |  [optional] |
| **providerKey** | **kotlin.String** | The provider key of the file entry. |  [optional] |
| **providerId** | **kotlin.Int** | The provider ID of the file entry. |  [optional] |
| **order** | **kotlin.String** | The order of the file entry. |  [optional] |
| **isFavorite** | **kotlin.Boolean** | Specifies if the file is a favorite or not. |  [optional] |
| **fileEntryType** | [**AiFileEntryType**](AiFileEntryType.md) | The file entry type. |  [optional] |



