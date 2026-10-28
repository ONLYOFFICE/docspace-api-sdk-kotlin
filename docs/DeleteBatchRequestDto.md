
# DeleteBatchRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **returnSingleOperation** | **kotlin.Boolean** | Which operations the answer carries: `true` returns the operation this call started and nothing else, `false`  returns every operation of the same kind that the caller has running or unread. When nothing was queued, which  happens for an empty selection, `true` falls back to the full list. |  [optional] |
| **folderIds** | [**kotlin.collections.List&lt;DeleteBatchRequestDtoAllOfFolderIds&gt;**](DeleteBatchRequestDtoAllOfFolderIds.md) | The folders to delete, by id, each with everything it contains. A number addresses a folder stored in the  portal itself, a string addresses a folder on a connected third-party account, and both kinds may be sent in  one list. |  [optional] |
| **fileIds** | [**kotlin.collections.List&lt;DeleteBatchRequestDtoAllOfFileIds&gt;**](DeleteBatchRequestDtoAllOfFileIds.md) | The files to delete, by id. A number addresses a file stored in the portal itself, a string addresses a file  on a connected third-party account, and both kinds may be sent in one list. |  [optional] |
| **deleteAfter** | **kotlin.Boolean** | Whether the finished operation is still reported: `false` keeps its final record readable through  `GET api/2.0/files/fileops` until it has been read once, `true` drops the record as soon as the work is done.  It does not postpone the deletion and does not delete anything of its own. |  [optional] |
| **immediately** | **kotlin.Boolean** | Where the deleted items go: `false` moves them to the Trash of the caller, from which they can be restored,  `true` removes them at once and for good. |  [optional] |



