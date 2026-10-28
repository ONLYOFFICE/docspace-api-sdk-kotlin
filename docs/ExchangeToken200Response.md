
# ExchangeToken200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessToken** | **kotlin.String** | The token to send as a Bearer credential when calling the portal on the user behalf. |  [optional] |
| **tokenType** | **kotlin.String** | How the access token is to be presented. It is always Bearer. |  [optional] |
| **expiresIn** | **kotlin.Int** | How many seconds the access token stays valid, counted from the moment it was issued. |  [optional] |
| **refreshToken** | **kotlin.String** | The token that buys a new access token once the current one expires. It is present only when the client is registered for the refresh token grant. |  [optional] |



