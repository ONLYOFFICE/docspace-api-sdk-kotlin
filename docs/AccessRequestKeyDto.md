
# AccessRequestKeyDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The account that is to open the file with this key; it has to have read access to the file. |  [optional] |
| **publicKeyId** | [**java.util.UUID**](java.util.UUID.md) | The public key the file key was encrypted with, as reported for that account by  `GET api/2.0/files/file/{fileId}/publickeys`. |  [optional] |
| **privateKeyEnc** | **kotlin.String** | The key of the file itself, encrypted by the client with that public key, so that the plain key never reaches  the portal. |  [optional] |



