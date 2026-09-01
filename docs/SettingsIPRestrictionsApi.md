# IPRestrictionsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getIpRestrictions**](SettingsIPRestrictionsApi.md#getIpRestrictions) | **GET** api/2.0/settings/iprestrictions | Get the IP portal restrictions |
| [**readIpRestrictionsSettings**](SettingsIPRestrictionsApi.md#readIpRestrictionsSettings) | **GET** api/2.0/settings/iprestrictions/settings | Get the IP restriction settings |
| [**saveIpRestrictions**](SettingsIPRestrictionsApi.md#saveIpRestrictions) | **PUT** api/2.0/settings/iprestrictions | Update the IP restrictions |
| [**updateIpRestrictionsSettings**](SettingsIPRestrictionsApi.md#updateIpRestrictionsSettings) | **PUT** api/2.0/settings/iprestrictions/settings | Update the IP restriction settings |



<a id="getIpRestrictions"></a>
# **getIpRestrictions**
> IPRestrictionArrayWrapper getIpRestrictions ()

Returns the IP portal restrictions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ip-restrictions/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**IPRestrictionArrayWrapper**](IPRestrictionArrayWrapper.md)

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
val webService = apiClient.createWebservice(IPRestrictionsApi::class.java)

launch(Dispatchers.IO) {
    val result : IPRestrictionArrayWrapper = webService.getIpRestrictions()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="readIpRestrictionsSettings"></a>
# **readIpRestrictionsSettings**
> IPRestrictionsSettingsWrapper readIpRestrictionsSettings ()

Returns the IP restriction settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/read-ip-restrictions-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**IPRestrictionsSettingsWrapper**](IPRestrictionsSettingsWrapper.md)

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
val webService = apiClient.createWebservice(IPRestrictionsApi::class.java)

launch(Dispatchers.IO) {
    val result : IPRestrictionsSettingsWrapper = webService.readIpRestrictionsSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveIpRestrictions"></a>
# **saveIpRestrictions**
> IpRestrictionsWrapper saveIpRestrictions (IpRestrictionsDto ipRestrictionsDto)

Updates the IP restrictions with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ip-restrictions/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ipRestrictionsDto** | [**IpRestrictionsDto**](IpRestrictionsDto.md)|  | [optional] |

### Return type

[**IpRestrictionsWrapper**](IpRestrictionsWrapper.md)

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
val webService = apiClient.createWebservice(IPRestrictionsApi::class.java)
val ipRestrictionsDto : IpRestrictionsDto =  // IpRestrictionsDto | 

launch(Dispatchers.IO) {
    val result : IpRestrictionsWrapper = webService.saveIpRestrictions(ipRestrictionsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateIpRestrictionsSettings"></a>
# **updateIpRestrictionsSettings**
> IpRestrictionsWrapper updateIpRestrictionsSettings (IpRestrictionsDto ipRestrictionsDto)

Updates the IP restriction settings with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-ip-restrictions-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ipRestrictionsDto** | [**IpRestrictionsDto**](IpRestrictionsDto.md)|  | [optional] |

### Return type

[**IpRestrictionsWrapper**](IpRestrictionsWrapper.md)

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
val webService = apiClient.createWebservice(IPRestrictionsApi::class.java)
val ipRestrictionsDto : IpRestrictionsDto =  // IpRestrictionsDto | 

launch(Dispatchers.IO) {
    val result : IpRestrictionsWrapper = webService.updateIpRestrictionsSettings(ipRestrictionsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

