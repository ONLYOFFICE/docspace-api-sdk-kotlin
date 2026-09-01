
# AuthenticationTokenDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **token** | **kotlin.String** | The authentication token. |  [optional] |
| **expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The token expiration time. |  [optional] |
| **sms** | **kotlin.Boolean** | Specifies if the authentication code is sent by SMS or not. |  [optional] |
| **phoneNoise** | **kotlin.String** | The phone number. |  [optional] |
| **tfa** | **kotlin.Boolean** | Specifies if the two-factor application is used or not. |  [optional] |
| **tfaKey** | **kotlin.String** | The two-factor authentication key. |  [optional] |
| **confirmUrl** | [**java.net.URI**](java.net.URI.md) | The confirmation email URL. |  [optional] |



