# AIWebSearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiWebSearchClear**](AIWebSearchApi.md#aiWebSearchClear) | **DELETE** api/2.0/ai/web-search/clear | Clear the web-search configuration |
| [**aiWebSearchConfigure**](AIWebSearchApi.md#aiWebSearchConfigure) | **PUT** api/2.0/ai/web-search/configure | Configure and verify web search |
| [**aiWebSearchGetActiveConfig**](AIWebSearchApi.md#aiWebSearchGetActiveConfig) | **GET** api/2.0/ai/web-search/get-active-config | Get active config |
| [**aiWebSearchIsConfigured**](AIWebSearchApi.md#aiWebSearchIsConfigured) | **GET** api/2.0/ai/web-search/is-configured | Is configured |
| [**aiWebSearchPassthroughContents**](AIWebSearchApi.md#aiWebSearchPassthroughContents) | **POST** api/2.0/ai/websearch/v1/contents | Web page contents passthrough |
| [**aiWebSearchPassthroughSearch**](AIWebSearchApi.md#aiWebSearchPassthroughSearch) | **POST** api/2.0/ai/websearch/v1/search | Web search passthrough |
| [**aiWebSearchSetActiveConfig**](AIWebSearchApi.md#aiWebSearchSetActiveConfig) | **PUT** api/2.0/ai/web-search/set-active-config | Set active config |
| [**aiWebSearchTestConnection**](AIWebSearchApi.md#aiWebSearchTestConnection) | **POST** api/2.0/ai/web-search/test-connection | Test a web-search provider |



<a id="aiWebSearchClear"></a>
# **aiWebSearchClear**
> AiSuccessResponse aiWebSearchClear (kotlin.String body)

Removes the portal's web-search configuration, after which web search is unavailable everywhere it was not configured separately. This is not scoped: it takes no `entityId` and any body sent with it is ignored, so it cannot be used to clear one room's configuration. Clearing an already-unconfigured portal is not an error and the call answers success either way. The stored provider key is destroyed with the configuration and has to be entered again.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-clear/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| Ignored. The operation always clears the portal-wide configuration, so send an empty body; a value here does not scope it to a room. | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val body : kotlin.String = body_example // kotlin.String | Ignored. The operation always clears the portal-wide configuration, so send an empty body; a value here does not scope it to a room.

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

Validates a web-search configuration against the live provider and stores it only if the provider answers, which makes it the safe way to save a form in one step. `entityId` scopes the configuration to a room and has to name one the caller can open; omitting it configures the portal. A `baseUrl` pointing at a private network address is refused. Use `PUT api/2.0/ai/web-search/set-active-config` when the configuration should be stored without a provider round trip.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-configure/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

### Return type

[**AiWebSearchMutationResult**](AiWebSearchMutationResult.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
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

Returns the web-search configuration in force for a scope - the provider, its endpoint and its settings. `entityId` picks a room and has to name one the caller can open; omitting it reads the portal-wide configuration, and a room with none of its own falls back to that. An unconfigured scope answers an empty result rather than 404. The provider key is not part of the answer, so a client cannot read it back after storing it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-get-active-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiWebSearchConfig**](AiWebSearchConfig.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Tells whether web search is available in a scope, as a bare boolean, which is the cheap check for hiding or showing the feature. `entityId` picks a room and has to name one the caller can open. It reports the same state as `GET api/2.0/ai/web-search/get-active-config` without transferring the configuration itself. A true answer means a provider is stored, not that the provider is currently reachable - probe that with `POST api/2.0/ai/web-search/test-connection`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-is-configured/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

**kotlin.Boolean**

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiWebSearchIsConfigured(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiWebSearchPassthroughContents"></a>
# **aiWebSearchPassthroughContents**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt; aiWebSearchPassthroughContents (kotlin.collections.Map<kotlin.String, kotlin.Any?> requestBody)

Fetches the contents of web pages on behalf of the document editor's AI plugin, against the portal's active web-search provider, exactly as the search passthrough does — including the `entityId` / `entityKind` billing attribution. The portal-wide configuration is used and a portal without one answers 404. The provider's status, body and content type are relayed verbatim, so its 429 and its failures surface unchanged. This is the follow-up to `POST api/2.0/ai/websearch/v1/search`, which returns the results whose contents this operation retrieves.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-contents/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| A page-contents request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration. | |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | A page-contents request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.aiWebSearchPassthroughContents(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchPassthroughSearch"></a>
# **aiWebSearchPassthroughSearch**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt; aiWebSearchPassthroughSearch (kotlin.collections.Map<kotlin.String, kotlin.Any?> requestBody)

Runs a web search on behalf of the document editor's AI plugin, which holds only a placeholder configuration - the portal's active provider and its key are resolved here, so neither ever reaches the browser. The portal-wide configuration is used, and a portal without one answers 404. The `entityId` and `entityKind` query parameters name the document the search is billed to; with the ONLYOFFICE provider the entry is resolved under the caller's credentials and sent to the gateway as the request `metadata` (`source_id` / `source_type` / `source_title`), and an entry the caller cannot open sends none. The provider's own status, body and content type are relayed as they stand, so a provider that rate-limits answers 429 and one that is unreachable answers 502. Closing the connection aborts the upstream request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-passthrough-search/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| A search request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration and must not be sent here. | |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | A search request in the shape the portal's active web-search provider expects, forwarded to it unchanged. The endpoint and the key come from the stored configuration and must not be sent here.

launch(Dispatchers.IO) {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Any> = webService.aiWebSearchPassthroughSearch(requestBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiWebSearchSetActiveConfig"></a>
# **aiWebSearchSetActiveConfig**
> AiSuccessResponse aiWebSearchSetActiveConfig (AiWebSearchConfigureRequest aiWebSearchConfigureRequest)

Stores a web-search configuration without contacting the provider first, for a form that has already validated its input or for restoring a known-good configuration. `entityId` scopes it to a room and has to name one the caller can open. A `baseUrl` pointing at a private network address is still refused, because that check is local. Nothing guarantees the stored provider works: follow up with `POST api/2.0/ai/web-search/test-connection`, or use `PUT api/2.0/ai/web-search/configure` to have the store gated on a live probe.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-set-active-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfigureRequest** | [**AiWebSearchConfigureRequest**](AiWebSearchConfigureRequest.md)|  | |

### Return type

[**AiSuccessResponse**](AiSuccessResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
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

Probes a web-search configuration against the live provider and reports the outcome, storing nothing - this is what a Test button calls so that a failure commits no state. The configuration is taken from the request rather than from storage, so credentials that were never saved can be checked. A `baseUrl` pointing at a private network address is refused before any request leaves the portal. The verdict is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-web-search-test-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiWebSearchConfig** | [**AiWebSearchConfig**](AiWebSearchConfig.md)|  | |

### Return type

[**AiProfilesTestConnection200Response**](AiProfilesTestConnection200Response.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AIWebSearchApi::class.java)
val aiWebSearchConfig : AiWebSearchConfig =  // AiWebSearchConfig | 

launch(Dispatchers.IO) {
    val result : AiProfilesTestConnection200Response = webService.aiWebSearchTestConnection(aiWebSearchConfig)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

