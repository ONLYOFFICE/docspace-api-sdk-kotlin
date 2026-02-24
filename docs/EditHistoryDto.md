
# EditHistoryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The document ID. |  [optional] |
| **key** | **kotlin.String** | The document identifier used to unambiguously identify the document file. |  [optional] |
| **version** | **kotlin.Int** | The document version number. |  [optional] |
| **versionGroup** | **kotlin.Int** | The document version group. |  [optional] |
| **user** | [**EditHistoryAuthor**](EditHistoryAuthor.md) |  |  [optional] |
| **created** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **changesHistory** | **kotlin.String** | The file history changes in the string format. |  [optional] |
| **changes** | [**kotlin.collections.List&lt;EditHistoryChangesWrapper&gt;**](EditHistoryChangesWrapper.md) | The list of file history changes. |  [optional] |
| **serverVersion** | **kotlin.String** | The current server version number. |  [optional] |



