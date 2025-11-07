
# DeleteBatchRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **returnSingleOperation** | **kotlin.Boolean** | Specifies whether to return only the current operation |  [optional] |
| **folderIds** | [**kotlin.collections.List&lt;DeleteBatchRequestDtoAllOfFolderIds&gt;**](DeleteBatchRequestDtoAllOfFolderIds.md) | The list of folder IDs to be deleted. |  [optional] |
| **fileIds** | [**kotlin.collections.List&lt;DeleteBatchRequestDtoAllOfFileIds&gt;**](DeleteBatchRequestDtoAllOfFileIds.md) | The list of file IDs to be deleted. |  [optional] |
| **deleteAfter** | **kotlin.Boolean** | Specifies whether to delete a file after the editing session is finished or not |  [optional] |
| **immediately** | **kotlin.Boolean** | Specifies whether to move a file to the \\Trash\\ folder or delete it immediately. |  [optional] |



