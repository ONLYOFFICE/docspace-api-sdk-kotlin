# AISettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiSettingsGet**](AISettingsApi.md#aiSettingsGet) | **GET** api/2.0/ai/config | Get AI settings |
| [**aiSettingsGetUser**](AISettingsApi.md#aiSettingsGetUser) | **GET** api/2.0/ai/config/user | Get user AI settings |
| [**aiSettingsGetVectorization**](AISettingsApi.md#aiSettingsGetVectorization) | **GET** api/2.0/ai/config/vectorization | Get vectorization settings |
| [**aiSettingsSetUser**](AISettingsApi.md#aiSettingsSetUser) | **PUT** api/2.0/ai/config/user | Update user AI settings |
| [**aiSettingsSetVectorization**](AISettingsApi.md#aiSettingsSetVectorization) | **PUT** api/2.0/ai/config/vectorization | Update vectorization settings |



<a id="aiSettingsGet"></a>
# **aiSettingsGet**
> AiAiSettingsWrapper aiSettingsGet ()

Reports the portal's combined AI configuration and readiness.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiAiSettingsWrapper**](AiAiSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiAiSettingsWrapper = webService.aiSettingsGet()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsGetUser"></a>
# **aiSettingsGetUser**
> AiAiUserSettingsWrapper aiSettingsGetUser ()

Returns the current user's AI settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiAiUserSettingsWrapper**](AiAiUserSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiAiUserSettingsWrapper = webService.aiSettingsGetUser()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsGetVectorization"></a>
# **aiSettingsGetVectorization**
> AiVectorizationSettingsWrapper aiSettingsGetVectorization ()

Returns the portal's vectorization settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiVectorizationSettingsWrapper = webService.aiSettingsGetVectorization()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsSetUser"></a>
# **aiSettingsSetUser**
> AiAiUserSettingsWrapper aiSettingsSetUser (kotlin.collections.Map<kotlin.String, kotlin.Any> requestBody)

Updates the current user's AI settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  | |

### Return type

[**AiAiUserSettingsWrapper**](AiAiUserSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 

launch(Dispatchers.IO) {
    val result : AiAiUserSettingsWrapper = webService.aiSettingsSetUser(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiSettingsSetVectorization"></a>
# **aiSettingsSetVectorization**
> AiVectorizationSettingsWrapper aiSettingsSetVectorization (kotlin.collections.Map<kotlin.String, kotlin.Any?> requestBody)

Updates the portal's vectorization settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)|  | |

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | 

launch(Dispatchers.IO) {
    val result : AiVectorizationSettingsWrapper = webService.aiSettingsSetVectorization(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

