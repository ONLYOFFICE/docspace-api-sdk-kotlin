
# AiExportTextToDocxRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | Document title (also the file name). |  |
| **content** | **kotlin.String** | Markdown content to convert. |  |
| **folderId** | [**AiExportTextToDocxRequestFolderId**](AiExportTextToDocxRequestFolderId.md) |  |  |
| **format** | [**inline**](#Format) | Output format: `Docx` (the default when omitted), `Pdf`, or `Md`, which stores the markdown verbatim instead of converting it. |  [optional] |


<a id="Format"></a>
## Enum: format
| Name | Value |
| ---- | ----- |
| format | Docx, Pdf, Md |



