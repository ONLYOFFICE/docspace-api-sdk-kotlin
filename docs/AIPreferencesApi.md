# AIPreferencesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiPreferencesClearDeepMode**](AIPreferencesApi.md#aiPreferencesClearDeepMode) | **DELETE** api/2.0/ai/preferences/clear-deep-mode | Clear deep mode |
| [**aiPreferencesGetDeepMode**](AIPreferencesApi.md#aiPreferencesGetDeepMode) | **GET** api/2.0/ai/preferences/get-deep-mode | Get deep mode |
| [**aiPreferencesIsDeepModeSet**](AIPreferencesApi.md#aiPreferencesIsDeepModeSet) | **GET** api/2.0/ai/preferences/is-deep-mode-set | Is deep mode set |
| [**aiPreferencesSetDeepMode**](AIPreferencesApi.md#aiPreferencesSetDeepMode) | **PUT** api/2.0/ai/preferences/set-deep-mode | Set deep mode |



<a id="aiPreferencesClearDeepMode"></a>
# **aiPreferencesClearDeepMode**
> AiSuccessResponse aiPreferencesClearDeepMode (kotlin.String body)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPreferencesClearDeepMode(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPreferencesGetDeepMode"></a>
# **aiPreferencesGetDeepMode**
> kotlin.Boolean aiPreferencesGetDeepMode (kotlin.String entityId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**|  | |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiPreferencesGetDeepMode(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPreferencesIsDeepModeSet"></a>
# **aiPreferencesIsDeepModeSet**
> kotlin.Boolean aiPreferencesIsDeepModeSet (kotlin.String entityId)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**|  | |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiPreferencesIsDeepModeSet(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPreferencesSetDeepMode"></a>
# **aiPreferencesSetDeepMode**
> AiSuccessResponse aiPreferencesSetDeepMode (AiPreferencesSetDeepModeRequest aiPreferencesSetDeepModeRequest)



For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPreferencesSetDeepModeRequest** | [**AiPreferencesSetDeepModeRequest**](AiPreferencesSetDeepModeRequest.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val aiPreferencesSetDeepModeRequest : AiPreferencesSetDeepModeRequest =  // AiPreferencesSetDeepModeRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPreferencesSetDeepMode(aiPreferencesSetDeepModeRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

