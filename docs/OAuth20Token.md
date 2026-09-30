
# OAuth20Token

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessToken** | **kotlin.String** | The token sent to the provider with every request made on behalf of the account. |  [optional] |
| **refreshToken** | **kotlin.String** | The token used to obtain a new access token when the current one expires. A provider that issues no refresh  token leaves it empty, and the account then has to be connected again to keep working. |  [optional] |
| **expiresIn** | **kotlin.Long** | How long the access token stays usable, in seconds counted from `timestamp`. Zero means the provider did not  say, and the token is then treated as expired. |  [optional] |
| **clientId** | **kotlin.String** | The OAuth 2.0 client ID of the application the token was issued to. |  [optional] |
| **clientSecret** | **kotlin.String** | The client secret of the application the token was issued to, needed when the token is refreshed. |  [optional] |
| **redirectUri** | [**java.net.URI**](java.net.URI.md) | The redirect URL the authorization code behind this token was obtained with; providers require the same value  again when the token is refreshed. |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the token was issued, in UTC. This is the point `expires_in` is counted from. |  [optional] |
| **isExpired** | **kotlin.Boolean** | Whether the access token can no longer be used and has to be refreshed. It is also true when the provider did  not say how long the token lives. |  [optional] [readonly] |



