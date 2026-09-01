
# FileShareLink

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The unique identifier of the shared link. |  [optional] |
| **title** | **kotlin.String** | The title of the shared content. |  [optional] |
| **shareLink** | **kotlin.String** | The URL for accessing the shared content. |  [optional] |
| **expirationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the shared link expires. |  [optional] |
| **linkType** | [**LinkType**](LinkType.md) | The sharing link type (e.g., Invitation). |  [optional] |
| **password** | **kotlin.String** | The password protection for accessing the shared content. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Indicates whether downloading of the shared content is prohibited. |  [optional] |
| **isExpired** | **kotlin.Boolean** | Indicates whether the shared link has expired. |  [optional] |
| **primary** | **kotlin.Boolean** | Indicates whether this is the primary shared link. |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | Indicates whether the link is for the internal sharing only. |  [optional] |
| **requestToken** | **kotlin.String** | The token for validating access requests. |  [optional] |
| **maxUseCount** | **kotlin.Int** | The maximum number of times the invitation link can be used. |  [optional] |
| **currentUseCount** | **kotlin.Int** | The current number of times the invitation link has been used. |  [optional] |



