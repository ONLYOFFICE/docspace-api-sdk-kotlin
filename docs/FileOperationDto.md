
# FileOperationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The file operation ID. |  |
| **operation** | [**FileOperationType**](FileOperationType.md) |  |  |
| **progress** | **kotlin.Int** | The file operation progress in percentage. |  |
| **error** | **kotlin.String** | The file operation error message. |  |
| **processed** | **kotlin.String** | The file operation processing status. |  |
| **finished** | **kotlin.Boolean** | Specifies if the file operation is finished or not. |  |
| **url** | [**java.net.URI**](java.net.URI.md) | The file operation URL. |  [optional] |
| **files** | [**kotlin.collections.List&lt;FileEntryBaseDto&gt;**](FileEntryBaseDto.md) | The list of files of the file operation. |  [optional] |
| **folders** | [**kotlin.collections.List&lt;FileEntryBaseDto&gt;**](FileEntryBaseDto.md) | The list of folders of the file operation. |  [optional] |



