
# RoomLinkRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **linkId** | [**java.util.UUID**](java.util.UUID.md) | The room link ID. |  [optional] |
| **access** | [**FileShare**](FileShare.md) |  |  [optional] |
| **expirationDate** | [**ApiDateTime**](ApiDateTime.md) |  |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | The link scope, whether it is internal or not. |  [optional] |
| **title** | **kotlin.String** | The link name. |  [optional] |
| **linkType** | [**LinkType**](LinkType.md) |  |  [optional] |
| **password** | **kotlin.String** | The link password. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies if downloading the file from the link is disabled or not. |  [optional] |
| **maxUseCount** | **kotlin.Int** | The maximum number of times the invitation link can be used. |  [optional] |
| **currentUseCount** | **kotlin.Int** | The current number of times the invitation link has been used. |  [optional] |



