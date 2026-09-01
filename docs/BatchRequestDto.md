
# BatchRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **returnSingleOperation** | **kotlin.Boolean** | Specifies whether to return only the current operation |  [optional] |
| **folderIds** | [**kotlin.collections.List&lt;BatchRequestDtoAllOfFolderIds&gt;**](BatchRequestDtoAllOfFolderIds.md) | The list of folder IDs to be copied/moved. |  [optional] |
| **fileIds** | [**kotlin.collections.List&lt;BatchRequestDtoAllOfFileIds&gt;**](BatchRequestDtoAllOfFileIds.md) | The list of file IDs to be copied/moved. |  [optional] |
| **destFolderId** | [**BatchRequestDtoAllOfDestFolderId**](BatchRequestDtoAllOfDestFolderId.md) |  |  [optional] |
| **conflictResolveType** | [**FileConflictResolveType**](FileConflictResolveType.md) | The overwriting behavior of the file copying or moving. |  [optional] |
| **deleteAfter** | **kotlin.Boolean** | Specifies whether to delete the source files/folders after they are moved or copied to the destination folder. |  [optional] |
| **content** | **kotlin.Boolean** | Specifies whether to copy or move the folder content or not. |  [optional] |
| **toFillOut** | **kotlin.Boolean** | Specifies whether the file is copied for filling out |  [optional] |



