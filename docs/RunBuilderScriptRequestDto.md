
# RunBuilderScriptRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **script** | **kotlin.String** | The document builder script. It names a portal file by its id where the document builder documentation  writes an address - `builder.OpenFile(1234)`; an address written out in the script is refused. |  |
| **folderId** | **kotlin.Int** | The id of the folder for the produced files that `outputs` does not list, as reported by a folder listing  such as `GET api/2.0/files/{folderId}`. |  [optional] |
| **outputs** | [**kotlin.collections.Map&lt;kotlin.String, RunBuilderScriptOutputRequest&gt;**](RunBuilderScriptOutputRequest.md) | Destinations of the produced files, keyed by the name the script saves each one under - the second argument of  `builder.SaveFile(docx, result.docx)`. |  [optional] |
| **argument** | [**RunBuilderScriptRequestDtoArgument**](RunBuilderScriptRequestDtoArgument.md) |  |  [optional] |



