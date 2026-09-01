
# FileLinkRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **linkId** | [**java.util.UUID**](java.util.UUID.md) | The external link ID. |  [optional] |
| **access** | [**FileShare**](FileShare.md) | The link sharing rights. |  [optional] |
| **expirationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The link expiration date. |  [optional] |
| **title** | **kotlin.String** | The link name. |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | The link scope, whether it is internal or not. |  [optional] |
| **primary** | **kotlin.Boolean** | Specifies whether the file link is primary or not. |  [optional] |
| **denyDownload** | **kotlin.Boolean** | Specifies whether to deny downloading the file or not. |  [optional] |
| **password** | **kotlin.String** | Password for access via link. |  [optional] |



