
# CookieSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lifeTime** | **kotlin.Int** | How long, in minutes, a session issued from now on remains valid. It is `1440` on a portal that has never  stored a limit, and that stored number is reported whether or not `enabled` puts it to use. |  |
| **enabled** | **kotlin.Boolean** | Whether the stored lifetime is applied at all. While it is `false` the number above is ignored and an  issued session is honoured for a year. |  |



