
# SessionRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | **kotlin.String** | The name to store the file under, extension included. Characters a title cannot hold are replaced and the name  is truncated, so the stored title can differ from the one sent. |  |
| **fileSize** | **kotlin.Long** | The exact number of bytes that will be sent. The size is reserved when the session opens and compared with the  parts as they arrive; below the portal chunk size the session takes the whole payload in one part, and above  the portal limit for chunked uploads it is refused. |  [optional] |
| **relativePath** | **kotlin.String** | A slash-separated chain of folder titles under the target folder to store the file in; folders in the chain  that do not exist yet are created. Leave it empty to store the file in the folder from the path itself. |  [optional] |
| **createOn** | [**ApiDateTime**](ApiDateTime.md) | The creation time to stamp on a newly created file instead of the moment the upload finishes. It is ignored  when the upload lands on a file that already exists. |  [optional] |
| **encrypted** | **kotlin.Boolean** | Marks the stored file as client-side encrypted, which is how content uploaded into a private room is kept;  with false the bytes are stored as they arrive. |  [optional] |
| **createNewIfExist** | **kotlin.Boolean** | Settles the clash when the folder already holds a file with this name: true stores the upload beside it under  a name with a numeric suffix, false takes the existing file over and adds the content to it as a new version. |  [optional] |



