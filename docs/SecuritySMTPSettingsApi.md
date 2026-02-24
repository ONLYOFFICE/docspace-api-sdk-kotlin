# SMTPSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSmtpOperationStatus**](SecuritySMTPSettingsApi.md#getSmtpOperationStatus) | **GET** api/2.0/smtpsettings/smtp/test/status | Get the SMTP testing process status |
| [**getSmtpSettings**](SecuritySMTPSettingsApi.md#getSmtpSettings) | **GET** api/2.0/smtpsettings/smtp | Get the SMTP settings |
| [**resetSmtpSettings**](SecuritySMTPSettingsApi.md#resetSmtpSettings) | **DELETE** api/2.0/smtpsettings/smtp | Reset the SMTP settings |
| [**saveSmtpSettings**](SecuritySMTPSettingsApi.md#saveSmtpSettings) | **POST** api/2.0/smtpsettings/smtp | Save the SMTP settings |
| [**testSmtpSettings**](SecuritySMTPSettingsApi.md#testSmtpSettings) | **GET** api/2.0/smtpsettings/smtp/test | Test the SMTP settings |



<a id="getSmtpOperationStatus"></a>
# **getSmtpOperationStatus**
> SmtpOperationStatusRequestsWrapper getSmtpOperationStatus ()

Returns the status of the SMTP testing process.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-operation-status/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpOperationStatusRequestsWrapper**](SmtpOperationStatusRequestsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

val result : SmtpOperationStatusRequestsWrapper = webService.getSmtpOperationStatus()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSmtpSettings"></a>
# **getSmtpSettings**
> SmtpSettingsWrapper getSmtpSettings ()

Returns the current portal SMTP settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

val result : SmtpSettingsWrapper = webService.getSmtpSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="resetSmtpSettings"></a>
# **resetSmtpSettings**
> SmtpSettingsWrapper resetSmtpSettings ()

Resets the SMTP settings of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

val result : SmtpSettingsWrapper = webService.resetSmtpSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveSmtpSettings"></a>
# **saveSmtpSettings**
> SmtpSettingsWrapper saveSmtpSettings (SmtpSettingsDto smtpSettingsDto)

Saves the SMTP settings for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-smtp-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **smtpSettingsDto** | [**SmtpSettingsDto**](SmtpSettingsDto.md)|  | [optional] |

### Return type

[**SmtpSettingsWrapper**](SmtpSettingsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)
val smtpSettingsDto : SmtpSettingsDto =  // SmtpSettingsDto | 

val result : SmtpSettingsWrapper = webService.saveSmtpSettings(smtpSettingsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="testSmtpSettings"></a>
# **testSmtpSettings**
> SmtpOperationStatusRequestsWrapper testSmtpSettings ()

Tests the SMTP settings for the current portal (sends test message to the user email).

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/test-smtp-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmtpOperationStatusRequestsWrapper**](SmtpOperationStatusRequestsWrapper.md)

### Authorization


Configure Basic:
    ApiClient().setCredentials("USERNAME", "PASSWORD")
Configure Bearer:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SMTPSettingsApi::class.java)

val result : SmtpOperationStatusRequestsWrapper = webService.testSmtpSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

