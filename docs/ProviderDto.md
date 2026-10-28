
# ProviderDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The display name of the service, and the only thing that tells the WebDAV presets apart: `kDrive`, `Yandex`,  `WebDav`, `Nextcloud` and `ownCloud` all report the same key. |  [optional] |
| **key** | **kotlin.String** | The value to send as `providerKey` when an account of this service is connected. |  [optional] |
| **connected** | **kotlin.Boolean** | Whether the service can be used on this portal: it is enabled in the configuration and, for an OAuth service,  its application is registered. It says nothing about whether an account of it is connected. |  [optional] |
| **oauth** | **kotlin.Boolean** | Whether an account of this service is connected with an OAuth 2.0 authorization code in `token`; when false,  it is connected with `login` and `password`. |  [optional] |
| **redirectUrl** | **kotlin.String** | The redirect URL this portal is registered with at the service, to build the consent screen URL from. It comes  back as null for the services that do not use OAuth. |  [optional] |
| **requiredConnectionUrl** | **kotlin.Boolean** | Whether an account of this service cannot be connected without `url`, which is the case for the WebDAV servers  whose address is not known in advance. The presets with a fixed address and the OAuth services do not need it. |  [optional] |
| **clientId** | **kotlin.String** | The OAuth 2.0 client ID this portal is registered with at the service, to build the consent screen URL from.  It comes back as null for the services that do not use OAuth. |  [optional] |



