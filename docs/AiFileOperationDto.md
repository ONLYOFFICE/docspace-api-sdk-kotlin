
# AiFileOperationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier of the operation, the one to pass to `PUT api/2.0/files/fileops/terminate/{id}` to stop it.  Operations belong to the account that started them, so an identifier of somebody else is never listed here. |  |
| **operation** | [**AiFileOperationType**](AiFileOperationType.md) | What the operation does with the entries, which also decides what else is reported: only a download fills  `url`, and a deletion leaves `files` and `folders` empty. |  |
| **progress** | **kotlin.Int** | How far the operation has come, from 0 to 100. Reaching 100 only means it stopped; whether it did what it was  asked for is told by `error`. |  |
| **error** | **kotlin.String** | The reason the operation could not finish its work, in the language of the request. Empty when nothing went  wrong, which is the only way to tell a successful operation from a failed one. |  |
| **processed** | **kotlin.String** | How many entries the operation has handled so far, written as a decimal number in a string. It counts items,  not percent, and stays behind `progress` on operations that walk into subfolders. |  |
| **finished** | **kotlin.Boolean** | Whether the operation has stopped running. A finished operation is reported once and then dropped, so the next  read of the operation list no longer contains it. |  |
| **url** | [**java.net.URI**](java.net.URI.md) | The address the packed archive can be downloaded from once a bulk download has finished. Empty for every other  kind of operation. |  [optional] |
| **files** | [**kotlin.collections.List&lt;AiFileEntryBaseDto&gt;**](AiFileEntryBaseDto.md) | The files the operation produced or moved, in the order it wrote them down. Empty while nothing has been  written yet and for a deletion, which reports no entries at all. |  [optional] |
| **folders** | [**kotlin.collections.List&lt;AiFileEntryBaseDto&gt;**](AiFileEntryBaseDto.md) | The folders the operation produced or moved, in the order it wrote them down. Empty while nothing has been  written yet and for a deletion. |  [optional] |
| **status** | [**AiDistributedTaskStatus**](AiDistributedTaskStatus.md) | The state of the background task behind the operation, which tells a task that was cancelled or that crashed  from one that ran to its end. |  [optional] |



