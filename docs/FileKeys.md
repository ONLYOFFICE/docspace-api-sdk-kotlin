
# FileKeys

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The identifier of the user the file key was issued to. |  [optional] |
| **publicKeyId** | [**java.util.UUID**](java.util.UUID.md) | The identifier of the key pair the file key is encrypted for. |  [optional] |
| **privateKeyEnc** | **kotlin.String** | The file key, encrypted with the public key of the pair. |  [optional] |
| **tenantId** | **kotlin.Int** | The identifier of the portal the file belongs to. |  [optional] |
| **fileId** | **kotlin.Int** | The identifier of the file the key unlocks. |  [optional] |
| **createOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the file key was issued. |  [optional] |



