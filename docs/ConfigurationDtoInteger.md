
# ConfigurationDtoInteger

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **document** | [**DocumentConfigDto**](DocumentConfigDto.md) | The document configuration. |  |
| **documentType** | **kotlin.String** | The document type. |  |
| **editorConfig** | [**EditorConfigurationDto**](EditorConfigurationDto.md) | The editor configuration. |  |
| **editorType** | [**EditorType**](EditorType.md) | The editor type. |  |
| **editorUrl** | [**java.net.URI**](java.net.URI.md) | The editor URL. |  |
| **file** | [**FileDtoInteger**](FileDtoInteger.md) | The file parameters. |  |
| **token** | **kotlin.String** | The token of the file configuration. |  [optional] |
| **type** | **kotlin.String** | The platform type. |  [optional] |
| **errorMessage** | **kotlin.String** | The error message. |  [optional] |
| **startFilling** | **kotlin.Boolean** | Specifies if the file filling has started or not. |  [optional] |
| **fillingStatus** | **kotlin.Boolean** | The file filling status. |  [optional] |
| **startFillingMode** | [**StartFillingMode**](StartFillingMode.md) | The start filling mode. |  [optional] |
| **fillingSessionId** | **kotlin.String** | The file filling session ID. |  [optional] |
| **quotaExceededScope** | [**QuotaScope**](QuotaScope.md) | Indicates which quota scope has been exceeded. |  [optional] |
| **generationToolCallState** | [**EditorToolCallStateDto**](EditorToolCallStateDto.md) | The generation tool call state. Used to run the agent flow in the editor. |  [optional] |



