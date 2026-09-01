# SecurityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getEnabledModules**](SettingsSecurityApi.md#getEnabledModules) | **GET** api/2.0/settings/security/modules | Get the enabled modules |
| [**getIsProductAdministrator**](SettingsSecurityApi.md#getIsProductAdministrator) | **GET** api/2.0/settings/security/administrator | Check a product administrator |
| [**getPasswordSettings**](SettingsSecurityApi.md#getPasswordSettings) | **GET** api/2.0/settings/security/password | Get the password settings |
| [**getProductAdministrators**](SettingsSecurityApi.md#getProductAdministrators) | **GET** api/2.0/settings/security/administrator/{productid} | Get the product administrators |
| [**getWebItemSecurityInfo**](SettingsSecurityApi.md#getWebItemSecurityInfo) | **GET** api/2.0/settings/security/{id} | Get the module availability |
| [**getWebItemSettingsSecurityInfo**](SettingsSecurityApi.md#getWebItemSettingsSecurityInfo) | **GET** api/2.0/settings/security | Get the security settings |
| [**setAccessToWebItems**](SettingsSecurityApi.md#setAccessToWebItems) | **PUT** api/2.0/settings/security/access | Set the security settings to modules |
| [**setProductAdministrator**](SettingsSecurityApi.md#setProductAdministrator) | **PUT** api/2.0/settings/security/administrator | Set a product administrator |
| [**setWebItemSecurity**](SettingsSecurityApi.md#setWebItemSecurity) | **PUT** api/2.0/settings/security | Set the module security settings |
| [**updatePasswordSettings**](SettingsSecurityApi.md#updatePasswordSettings) | **PUT** api/2.0/settings/security/password | Set the password settings |



<a id="getEnabledModules"></a>
# **getEnabledModules**
> ObjectWrapper getEnabledModules ()

Returns a list of all the enabled modules.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enabled-modules/).

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
val webService = apiClient.createWebservice(SecurityApi::class.java)

launch(Dispatchers.IO) {
    val result : ObjectWrapper = webService.getEnabledModules()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsProductAdministrator"></a>
# **getIsProductAdministrator**
> ProductAdministratorWrapper getIsProductAdministrator (java.util.UUID productid, java.util.UUID userid)

Checks if the selected user is an administrator of a product with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-product-administrator/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productid** | **java.util.UUID**| The ID of the product extracted from the query parameters. | |
| **userid** | **java.util.UUID**| The user ID extracted from the query parameters. | |

### Return type

[**ProductAdministratorWrapper**](ProductAdministratorWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val productid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the product extracted from the query parameters.
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID extracted from the query parameters.

launch(Dispatchers.IO) {
    val result : ProductAdministratorWrapper = webService.getIsProductAdministrator(productid, userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPasswordSettings"></a>
# **getPasswordSettings**
> PasswordSettingsWrapper getPasswordSettings ()

Returns the portal password settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-password-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**PasswordSettingsWrapper**](PasswordSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)

launch(Dispatchers.IO) {
    val result : PasswordSettingsWrapper = webService.getPasswordSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProductAdministrators"></a>
# **getProductAdministrators**
> EmployeeArrayWrapper getProductAdministrators (java.util.UUID productid)

Returns a list of all the administrators of a product with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-product-administrators/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productid** | **java.util.UUID**| The ID of the product extracted from the route parameters. | |

### Return type

[**EmployeeArrayWrapper**](EmployeeArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val productid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the product extracted from the route parameters.

launch(Dispatchers.IO) {
    val result : EmployeeArrayWrapper = webService.getProductAdministrators(productid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebItemSecurityInfo"></a>
# **getWebItemSecurityInfo**
> BooleanWrapper getWebItemSecurityInfo (java.util.UUID id)

Returns the availability of the module with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID extracted from the route parameters. | |

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val id : java.util.UUID = 1 // java.util.UUID | The ID extracted from the route parameters.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getWebItemSecurityInfo(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebItemSettingsSecurityInfo"></a>
# **getWebItemSettingsSecurityInfo**
> SecurityArrayWrapper getWebItemSettingsSecurityInfo (kotlin.collections.List<kotlin.String> ids)

Returns the security settings for the modules specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-settings-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The list of module identifiers for which to retrieve the security settings. | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val ids : kotlin.collections.List<kotlin.String> = ["item1","item2"] // kotlin.collections.List<kotlin.String> | The list of module identifiers for which to retrieve the security settings.

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.getWebItemSettingsSecurityInfo(ids)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setAccessToWebItems"></a>
# **setAccessToWebItems**
> SecurityArrayWrapper setAccessToWebItems (WebItemsSecurityRequestsDto webItemsSecurityRequestsDto)

Sets the security settings to the modules with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-access-to-web-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webItemsSecurityRequestsDto** | [**WebItemsSecurityRequestsDto**](WebItemsSecurityRequestsDto.md)|  | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val webItemsSecurityRequestsDto : WebItemsSecurityRequestsDto =  // WebItemsSecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.setAccessToWebItems(webItemsSecurityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setProductAdministrator"></a>
# **setProductAdministrator**
> ProductAdministratorWrapper setProductAdministrator (SecurityRequestsDto securityRequestsDto)

Sets the selected user as an administrator of a product with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-product-administrator/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityRequestsDto** | [**SecurityRequestsDto**](SecurityRequestsDto.md)|  | [optional] |

### Return type

[**ProductAdministratorWrapper**](ProductAdministratorWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val securityRequestsDto : SecurityRequestsDto =  // SecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : ProductAdministratorWrapper = webService.setProductAdministrator(securityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setWebItemSecurity"></a>
# **setWebItemSecurity**
> SecurityArrayWrapper setWebItemSecurity (WebItemSecurityRequestsDto webItemSecurityRequestsDto)

Sets the security settings to the module with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-item-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webItemSecurityRequestsDto** | [**WebItemSecurityRequestsDto**](WebItemSecurityRequestsDto.md)|  | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val webItemSecurityRequestsDto : WebItemSecurityRequestsDto =  // WebItemSecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.setWebItemSecurity(webItemSecurityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updatePasswordSettings"></a>
# **updatePasswordSettings**
> PasswordSettingsWrapper updatePasswordSettings (PasswordSettingsRequestsDto passwordSettingsRequestsDto)

Sets the portal password settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-password-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **passwordSettingsRequestsDto** | [**PasswordSettingsRequestsDto**](PasswordSettingsRequestsDto.md)|  | [optional] |

### Return type

[**PasswordSettingsWrapper**](PasswordSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val passwordSettingsRequestsDto : PasswordSettingsRequestsDto =  // PasswordSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : PasswordSettingsWrapper = webService.updatePasswordSettings(passwordSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

