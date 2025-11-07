
# UploadRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **file** | [**java.io.File**](java.io.File.md) | The file to be uploaded. |  [optional] |
| **contentType** | [**ContentType**](ContentType.md) |  |  [optional] |
| **contentDisposition** | [**ContentDisposition**](ContentDisposition.md) |  |  [optional] |
| **files** | [**kotlin.collections.List&lt;java.io.File&gt;**](java.io.File.md) | The list of files when specified as multipart/form-data. |  [optional] |
| **createNewIfExist** | **kotlin.Boolean** | Specifies whether to create the new file if it already exists or not. |  [optional] |
| **storeOriginalFileFlag** | **kotlin.Boolean** | Specifies whether to upload documents in the original formats as well or not. |  [optional] |
| **keepConvertStatus** | **kotlin.Boolean** | Specifies whether to keep the file converting status or not. |  [optional] |
| **stream** | [**java.io.File**](java.io.File.md) | The request input stream. |  [optional] |



