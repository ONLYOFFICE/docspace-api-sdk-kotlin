
# EncryptionKeyDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The identifier of the key pair. |  [optional] |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The identifier of the user the key pair belongs to. |  [optional] |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the key pair was created. |  [optional] |
| **publicKey** | **kotlin.String** | The public key of the pair, used to encrypt the file keys. |  [optional] |
| **privateKeyEnc** | **kotlin.String** | The private key of the pair, encrypted with the user password. |  [optional] |
| **cryptoEngineId** | **kotlin.String** | The identifier of the crypto engine the key pair was issued for. |  [optional] |



