# GreetingSettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGreetingSettings**](SettingsGreetingSettingsApi.md#getGreetingSettings) | **GET** api/2.0/settings/greetingsettings | Get greeting settings |
| [**getIsDefaultGreetingSettings**](SettingsGreetingSettingsApi.md#getIsDefaultGreetingSettings) | **GET** api/2.0/settings/greetingsettings/isdefault | Check the default greeting settings |
| [**restoreGreetingSettings**](SettingsGreetingSettingsApi.md#restoreGreetingSettings) | **POST** api/2.0/settings/greetingsettings/restore | Restore the greeting settings |
| [**saveGreetingSettings**](SettingsGreetingSettingsApi.md#saveGreetingSettings) | **POST** api/2.0/settings/greetingsettings | Save the greeting settings |



<a id="getGreetingSettings"></a>
# **getGreetingSettings**
> ObjectWrapper getGreetingSettings ()

Returns the greeting settings for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-greeting-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : ObjectWrapper = webService.getGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsDefaultGreetingSettings"></a>
# **getIsDefaultGreetingSettings**
> BooleanWrapper getIsDefaultGreetingSettings ()

Checks if the greeting settings of the current portal are set to default or not.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-default-greeting-settings/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getIsDefaultGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="restoreGreetingSettings"></a>
# **restoreGreetingSettings**
> StringWrapper restoreGreetingSettings ()

Restores the current portal greeting settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/restore-greeting-settings/).

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.restoreGreetingSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveGreetingSettings"></a>
# **saveGreetingSettings**
> StringWrapper saveGreetingSettings (GreetingSettingsRequestsDto greetingSettingsRequestsDto)

Saves the greeting settings specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-greeting-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **greetingSettingsRequestsDto** | [**GreetingSettingsRequestsDto**](GreetingSettingsRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(GreetingSettingsApi::class.java)
val greetingSettingsRequestsDto : GreetingSettingsRequestsDto =  // GreetingSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.saveGreetingSettings(greetingSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

