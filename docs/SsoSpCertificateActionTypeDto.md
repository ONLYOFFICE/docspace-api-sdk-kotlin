
# SsoSpCertificateActionTypeDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signing** | **kotlin.String** | The key pair signs the requests the portal sends and nothing else. |  [optional] [readonly] |
| **encrypt** | **kotlin.String** | The key pair encrypts what the portal sends and decrypts what comes back, but signs nothing. |  [optional] [readonly] |
| **signingAndEncrypt** | **kotlin.String** | The key pair does both, which is what one pair configured on its own has to be set to. |  [optional] [readonly] |



