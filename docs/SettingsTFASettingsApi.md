# TFASettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTfaAppCodes**](SettingsTFASettingsApi.md#getTfaAppCodes) | **GET** api/2.0/settings/tfaappcodes | Get the TFA codes |
| [**getTfaConfirmUrl**](SettingsTFASettingsApi.md#getTfaConfirmUrl) | **GET** api/2.0/settings/tfaapp/confirm | Get TFA confirmation URL |
| [**getTfaSettings**](SettingsTFASettingsApi.md#getTfaSettings) | **GET** api/2.0/settings/tfaapp | Get the TFA settings |
| [**tfaAppGenerateSetupCode**](SettingsTFASettingsApi.md#tfaAppGenerateSetupCode) | **GET** api/2.0/settings/tfaapp/setup | Generate setup code |
| [**tfaValidateAuthCode**](SettingsTFASettingsApi.md#tfaValidateAuthCode) | **POST** api/2.0/settings/tfaapp/validate | Validate the TFA code |
| [**unlinkTfaApp**](SettingsTFASettingsApi.md#unlinkTfaApp) | **PUT** api/2.0/settings/tfaappnewapp | Unlink the TFA application |
| [**updateTfaAppCodes**](SettingsTFASettingsApi.md#updateTfaAppCodes) | **PUT** api/2.0/settings/tfaappnewcodes | Update the TFA codes |
| [**updateTfaSettings**](SettingsTFASettingsApi.md#updateTfaSettings) | **PUT** api/2.0/settings/tfaapp | Update the TFA settings |
| [**updateTfaSettingsLink**](SettingsTFASettingsApi.md#updateTfaSettingsLink) | **PUT** api/2.0/settings/tfaappwithlink | Updates TFA settings |



<a id="getTfaAppCodes"></a>
# **getTfaAppCodes**
> TfaAppCodeArrayWrapper getTfaAppCodes ()

Returns the two-factor authentication application codes.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-app-codes/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TfaAppCodeArrayWrapper**](TfaAppCodeArrayWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : TfaAppCodeArrayWrapper = webService.getTfaAppCodes()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTfaConfirmUrl"></a>
# **getTfaConfirmUrl**
> StringWrapper getTfaConfirmUrl ()

Returns the confirmation URL for authorization via SMS or TFA application.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-confirm-url/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getTfaConfirmUrl()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTfaSettings"></a>
# **getTfaSettings**
> TfaSettingsArrayWrapper getTfaSettings ()

Returns the current two-factor authentication settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TfaSettingsArrayWrapper**](TfaSettingsArrayWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : TfaSettingsArrayWrapper = webService.getTfaSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="tfaAppGenerateSetupCode"></a>
# **tfaAppGenerateSetupCode**
> SetupCodeWrapper tfaAppGenerateSetupCode ()

Generates the setup TFA code for the current user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-app-generate-setup-code/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SetupCodeWrapper**](SetupCodeWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : SetupCodeWrapper = webService.tfaAppGenerateSetupCode()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="tfaValidateAuthCode"></a>
# **tfaValidateAuthCode**
> BooleanWrapper tfaValidateAuthCode (TfaValidateRequestsDto tfaValidateRequestsDto)

Validates the two-factor authentication code specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-validate-auth-code/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tfaValidateRequestsDto** | [**TfaValidateRequestsDto**](TfaValidateRequestsDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)
val tfaValidateRequestsDto : TfaValidateRequestsDto =  // TfaValidateRequestsDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.tfaValidateAuthCode(tfaValidateRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unlinkTfaApp"></a>
# **unlinkTfaApp**
> StringWrapper unlinkTfaApp (TfaRequestsDto tfaRequestsDto)

Unlinks the current two-factor authentication application from the user account specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-tfa-app/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tfaRequestsDto** | [**TfaRequestsDto**](TfaRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)
val tfaRequestsDto : TfaRequestsDto =  // TfaRequestsDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.unlinkTfaApp(tfaRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateTfaAppCodes"></a>
# **updateTfaAppCodes**
> TfaAppCodeArrayWrapper updateTfaAppCodes ()

Requests the new backup codes for the two-factor authentication application.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-app-codes/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TfaAppCodeArrayWrapper**](TfaAppCodeArrayWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : TfaAppCodeArrayWrapper = webService.updateTfaAppCodes()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateTfaSettings"></a>
# **updateTfaSettings**
> BooleanWrapper updateTfaSettings (TfaRequestsDto tfaRequestsDto)

Updates the two-factor authentication settings with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tfaRequestsDto** | [**TfaRequestsDto**](TfaRequestsDto.md)|  | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)
val tfaRequestsDto : TfaRequestsDto =  // TfaRequestsDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.updateTfaSettings(tfaRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateTfaSettingsLink"></a>
# **updateTfaSettingsLink**
> StringWrapper updateTfaSettingsLink (TfaRequestsDto tfaRequestsDto)

Updates TFA settings and returns the confirmation URL for authorization via SMS or TFA application.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tfaRequestsDto** | [**TfaRequestsDto**](TfaRequestsDto.md)|  | [optional] |

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(TFASettingsApi::class.java)
val tfaRequestsDto : TfaRequestsDto =  // TfaRequestsDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.updateTfaSettingsLink(tfaRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

