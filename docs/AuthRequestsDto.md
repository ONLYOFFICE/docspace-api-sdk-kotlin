
# AuthRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userName** | **kotlin.String** | The username or email used for authentication. |  [optional] |
| **password** | **kotlin.String** | The password in plain text for user authentication. |  [optional] |
| **passwordHash** | **kotlin.String** | The hashed password for secure verification. |  [optional] |
| **provider** | **kotlin.String** | The type of authentication provider (e.g., internal, Google, Azure). |  [optional] |
| **accessToken** | **kotlin.String** | The access token used for authentication with external providers. |  [optional] |
| **serializedProfile** | **kotlin.String** | The serialized user profile data, if applicable. |  [optional] |
| **codeOAuth** | **kotlin.String** | The authorization code used for obtaining OAuth tokens. |  [optional] |
| **session** | **kotlin.Boolean** | Specifies whether the authentication is session-based. |  [optional] |
| **confirmData** | [**ConfirmData**](ConfirmData.md) |  |  [optional] |
| **recaptchaType** | [**RecaptchaType**](RecaptchaType.md) |  |  [optional] |
| **recaptchaResponse** | **kotlin.String** | The user&#39;s response to the CAPTCHA challenge. |  [optional] |
| **culture** | **kotlin.String** | The culture code for localization during authentication. |  [optional] |



