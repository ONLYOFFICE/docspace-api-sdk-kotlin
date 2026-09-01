# AIWebSearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiWebSearchClear**](AIWebSearchApi.md#aiWebSearchClear) | **DELETE** api/2.0/ai/web-search/clear | Clear |
| [**aiWebSearchConfigure**](AIWebSearchApi.md#aiWebSearchConfigure) | **PUT** api/2.0/ai/web-search/configure | Configure |
| [**aiWebSearchGetActiveConfig**](AIWebSearchApi.md#aiWebSearchGetActiveConfig) | **GET** api/2.0/ai/web-search/get-active-config | Get active config |
| [**aiWebSearchIsConfigured**](AIWebSearchApi.md#aiWebSearchIsConfigured) | **GET** api/2.0/ai/web-search/is-configured | Is configured |
| [**aiWebSearchPassthroughContents**](AIWebSearchApi.md#aiWebSearchPassthroughContents) | **POST** api/2.0/ai/websearch/v1/contents | Web page contents proxied to the portal's active web-search provider |
| [**aiWebSearchPassthroughSearch**](AIWebSearchApi.md#aiWebSearchPassthroughSearch) | **POST** api/2.0/ai/websearch/v1/search | Web search proxied to the portal's active web-search provider |
| [**aiWebSearchSetActiveConfig**](AIWebSearchApi.md#aiWebSearchSetActiveConfig) | **PUT** api/2.0/ai/web-search/set-active-config | Set active config |
| [**aiWebSearchTestConnection**](AIWebSearchApi.md#aiWebSearchTestConnection) | **POST** api/2.0/ai/web-search/test-connection | Test connection |



<a id="aiWebSearchClear"></a>
# **aiWebSearchClear**
> AiSuccessResponse aiWebSearchClear (kotlin.String body)

Removes the web-search configuration of the scope. Does nothing when web search was not configured there.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/).

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
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiWebSearchClear(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchConfigure"></a>
# **aiWebSearchConfigure**
> AiWebSearchMutationResult aiWebSearchConfigure (AiWebSearchConfigureRequest aiWebSearchConfigureRequest)

Validates a web-search configuration against the live provider and stores it only when the provider answers, replacing the previous one in a single write.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

### Return type

[**AiWebSearchMutationResult**](AiWebSearchMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val aiWebSearchConfigureRequest : AiWebSearchConfigureRequest =  // AiWebSearchConfigureRequest | 

launch(Dispatchers.IO) {
    val result : AiWebSearchMutationResult = webService.aiWebSearchConfigure(aiWebSearchConfigureRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchGetActiveConfig"></a>
# **aiWebSearchGetActiveConfig**
> AiWebSearchConfig aiWebSearchGetActiveConfig (kotlin.String entityId)

Returns the web-search configuration active in the scope, or an empty result when web search is not configured.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiWebSearchConfig**](AiWebSearchConfig.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : AiWebSearchConfig = webService.aiWebSearchGetActiveConfig(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiWebSearchIsConfigured"></a>
# **aiWebSearchIsConfigured**
> kotlin.Boolean aiWebSearchIsConfigured (kotlin.String entityId)

Tells whether web search is configured in the scope.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

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
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val entityId : kotlin.String = entityId_example // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiWebSearchIsConfigured(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiWebSearchPassthroughContents"></a>
# **aiWebSearchPassthroughContents**
> AiSuccessResponse aiWebSearchPassthroughContents (kotlin.collections.Map<kotlin.String, kotlin.Any> requestBody)

Fetches web page contents on behalf of the document editor's AI plugin, against the portal's active web-search provider, the same way as the search passthrough.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  | |

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
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiWebSearchPassthroughContents(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchPassthroughSearch"></a>
# **aiWebSearchPassthroughSearch**
> AiSuccessResponse aiWebSearchPassthroughSearch (kotlin.collections.Map<kotlin.String, kotlin.Any> requestBody)

Runs a web search on behalf of the document editor's AI plugin. The plugin only holds a placeholder configuration; the portal's active provider and its key are resolved here and never reach the browser.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  | |

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
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any> | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiWebSearchPassthroughSearch(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchSetActiveConfig"></a>
# **aiWebSearchSetActiveConfig**
> AiSuccessResponse aiWebSearchSetActiveConfig (AiWebSearchConfigureRequest aiWebSearchConfigureRequest)

Stores a web-search configuration without contacting the provider first, for forms that validate locally.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val aiWebSearchConfigureRequest : AiWebSearchConfigureRequest =  // AiWebSearchConfigureRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiWebSearchSetActiveConfig(aiWebSearchConfigureRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchTestConnection"></a>
# **aiWebSearchTestConnection**
> AiProfilesTestConnection200Response aiWebSearchTestConnection (AiWebSearchConfig aiWebSearchConfig)

Checks a web-search configuration against the live provider without storing it - for a Test button that must not commit on success.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfig** | [**AiWebSearchConfig**](AiWebSearchConfig.md)|  | |

### Return type

[**AiProfilesTestConnection200Response**](AiProfilesTestConnection200Response.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val aiWebSearchConfig : AiWebSearchConfig =  // AiWebSearchConfig | 

launch(Dispatchers.IO) {
    val result : AiProfilesTestConnection200Response = webService.aiWebSearchTestConnection(aiWebSearchConfig)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

