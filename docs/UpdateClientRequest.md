
# UpdateClientRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The display name shown to the user on the consent screen. It has to be between 3 and 256 characters long. |  |
| **logo** | **kotlin.String** | The client logo as a data URI carrying base64 image data, shown on the consent screen. Only png, jpeg, jpg and svg+xml are accepted. |  |
| **scopes** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The permissions the client may ask for, named as they appear in the tenant scope catalogue - for example files:read, rooms:write or openid. A client cannot request a scope that is not listed here. |  |
| **allowedOrigins** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The web origins allowed to call the portal on behalf of this client, used for the CORS check. The set holds between 1 and 12 addresses. |  |
| **redirectUris** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The URIs an authorization code may be delivered to. An authorization request naming any other URI is refused, and the set holds between 1 and 12 addresses. |  |
| **description** | **kotlin.String** | The free-text description shown next to the name on the consent screen, at most 255 characters. |  [optional] |
| **allowPkce** | **kotlin.Boolean** | Whether the client may use PKCE. Turning it on lets the client authenticate with the none method and prove itself with a code verifier instead of sending a secret, which is what a client that cannot keep a secret needs. |  [optional] |
| **isPublic** | **kotlin.Boolean** | Whether the client is offered to third-party tenants rather than only to the tenant that registers it. |  [optional] |



