
# SsoSettingsV2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp indicating when the settings were last modified. |  [optional] |
| **enableSso** | **kotlin.Boolean** | Specifies if the SSO settings are enabled or not. |  [optional] |
| **idpSettings** | [**SsoIdpSettings**](SsoIdpSettings.md) | The SSO IdP settings. |  [optional] |
| **idpCertificates** | [**kotlin.collections.List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the IdP certificates. |  [optional] |
| **idpCertificateAdvanced** | [**SsoIdpCertificateAdvanced**](SsoIdpCertificateAdvanced.md) | The IdP advanced certificate. |  [optional] |
| **spLoginLabel** | **kotlin.String** | The SP login label. |  [optional] |
| **spCertificates** | [**kotlin.collections.List&lt;SsoCertificate&gt;**](SsoCertificate.md) | The list of the SP certificates. |  [optional] |
| **spCertificateAdvanced** | [**SsoSpCertificateAdvanced**](SsoSpCertificateAdvanced.md) | The SP advanced certificate. |  [optional] |
| **fieldMapping** | [**SsoFieldMapping**](SsoFieldMapping.md) | The SSO field mapping. |  [optional] |
| **hideAuthPage** | **kotlin.Boolean** | Specifies if the authentication page will be hidden or not. |  [optional] |
| **usersType** | **kotlin.Int** | The user type. |  [optional] |
| **disableEmailVerification** | **kotlin.Boolean** | Specifies if the email verification is disabled or not. |  [optional] |



