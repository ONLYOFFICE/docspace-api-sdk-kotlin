
# SsoSettingsV2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp indicating when the settings were last modified. |  [optional] |
| **enableSso** | **kotlin.Boolean** | Specifies if the SSO settings are enabled or not. |  [optional] |
| **idpSettings** | [**SsoIdpSettings**](SsoIdpSettings.md) |  |  [optional] |
| **idpCertificates** | [**kotlin.collections.List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the IdP certificates. |  [optional] |
| **idpCertificateAdvanced** | [**SsoIdpCertificateAdvanced**](SsoIdpCertificateAdvanced.md) |  |  [optional] |
| **spLoginLabel** | **kotlin.String** | The SP login label. |  [optional] |
| **spCertificates** | [**kotlin.collections.List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the SP certificates. |  [optional] |
| **spCertificateAdvanced** | [**SsoSpCertificateAdvanced**](SsoSpCertificateAdvanced.md) |  |  [optional] |
| **fieldMapping** | [**SsoFieldMapping**](SsoFieldMapping.md) |  |  [optional] |
| **hideAuthPage** | **kotlin.Boolean** | Specifies if the authentication page will be hidden or not. |  [optional] |
| **usersType** | **kotlin.Int** | The user type. |  [optional] |
| **disableEmailVerification** | **kotlin.Boolean** | Specifies if the email verification is disabled or not. |  [optional] |



