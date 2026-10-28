
# SsoSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp indicating when the settings were last modified. |  [optional] |
| **enableSso** | **kotlin.Boolean** | Specifies if the SSO settings are enabled or not. |  [optional] |
| **idpSettings** | [**SsoIdpSettingsDto**](SsoIdpSettingsDto.md) | The SSO IdP settings. |  [optional] |
| **idpCertificates** | [**kotlin.collections.List&lt;SsoCertificateDto&gt;**](SsoCertificateDto.md) | The list of the IdP certificates. |  [optional] |
| **idpCertificateAdvanced** | [**SsoIdpCertificateAdvancedDto**](SsoIdpCertificateAdvancedDto.md) | The IdP advanced certificate. |  [optional] |
| **spLoginLabel** | **kotlin.String** | The SP login label. |  [optional] |
| **spCertificates** | [**kotlin.collections.List&lt;SsoCertificateDto&gt;**](SsoCertificateDto.md) | The list of the SP certificates. |  [optional] |
| **spCertificateAdvanced** | [**SsoSpCertificateAdvancedDto**](SsoSpCertificateAdvancedDto.md) | The SP advanced certificate. |  [optional] |
| **fieldMapping** | [**SsoFieldMappingDto**](SsoFieldMappingDto.md) | The SSO field mapping. |  [optional] |
| **hideAuthPage** | **kotlin.Boolean** | Specifies if the authentication page will be hidden or not. |  [optional] |
| **usersType** | **kotlin.Int** | The user type. |  [optional] |
| **disableEmailVerification** | **kotlin.Boolean** | Specifies if the email verification is disabled or not. |  [optional] |



