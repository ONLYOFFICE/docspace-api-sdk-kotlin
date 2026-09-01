
# EditHistoryDataDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **kotlin.String** | The document identifier used to unambiguously identify the document file. |  |
| **url** | [**java.net.URI**](java.net.URI.md) | The URL address of the current document version. |  |
| **version** | **kotlin.Int** | The document version number. |  |
| **fileType** | **kotlin.String** | The document extension. |  |
| **changesUrl** | [**java.net.URI**](java.net.URI.md) | The URL address of the file with the document changes data. |  [optional] |
| **previous** | [**EditHistoryUrl**](EditHistoryUrl.md) | The object of the previous version of the document. |  [optional] |
| **token** | **kotlin.String** | The encrypted signature added to the parameter in the form of a token. |  [optional] |



