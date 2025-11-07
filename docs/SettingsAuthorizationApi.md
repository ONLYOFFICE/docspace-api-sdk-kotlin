# AuthorizationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAuthServices**](SettingsAuthorizationApi.md#getAuthServices) | **GET** api/2.0/settings/authservice | Get the authorization services |
| [**saveAuthKeys**](SettingsAuthorizationApi.md#saveAuthKeys) | **POST** api/2.0/settings/authservice | Save the authorization keys |



<a id="getAuthServices"></a>
# **getAuthServices**
> AuthServiceRequestsArrayWrapper getAuthServices ()

Returns the authorization services.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-auth-services/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthServiceRequestsArrayWrapper**](AuthServiceRequestsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AuthorizationApi::class.java)

val result : AuthServiceRequestsArrayWrapper = webService.getAuthServices()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAuthKeys"></a>
# **saveAuthKeys**
> BooleanWrapper saveAuthKeys (AuthServiceRequestsDto authServiceRequestsDto)

Saves the authorization keys.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-auth-keys/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authServiceRequestsDto** | [**AuthServiceRequestsDto**](AuthServiceRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(AuthorizationApi::class.java)
val authServiceRequestsDto : AuthServiceRequestsDto =  // AuthServiceRequestsDto | 

val result : BooleanWrapper = webService.saveAuthKeys(authServiceRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

