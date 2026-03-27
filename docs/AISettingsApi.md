# AISettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAiSettings**](AISettingsApi.md#getAiSettings) | **GET** api/2.0/ai/config | Get AI settings |
| [**getVectorizationSettings**](AISettingsApi.md#getVectorizationSettings) | **GET** api/2.0/ai/config/vectorization | Get vectorization settings |
| [**getWebSearchSettings**](AISettingsApi.md#getWebSearchSettings) | **GET** api/2.0/ai/config/web-search | Get web search settings |
| [**setVectorizationSettings**](AISettingsApi.md#setVectorizationSettings) | **PUT** api/2.0/ai/config/vectorization | Update vectorization settings |
| [**setWebSearchSettings**](AISettingsApi.md#setWebSearchSettings) | **PUT** api/2.0/ai/config/web-search | Update web search settings |



<a id="getAiSettings"></a>
# **getAiSettings**
> AiSettingsWrapper getAiSettings ()

Retrieves the combined AI configuration for the current portal, including the status of web search,  vectorization, and AI readiness, along with tool names and the portal MCP server identifier.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiSettingsWrapper**](AiSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

val result : AiSettingsWrapper = webService.getAiSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getVectorizationSettings"></a>
# **getVectorizationSettings**
> VectorizationSettingsWrapper getVectorizationSettings ()

Retrieves the current embedding provider settings used for document vectorization,  including the configured provider type and whether the API key needs to be reset.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-vectorization-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**VectorizationSettingsWrapper**](VectorizationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

val result : VectorizationSettingsWrapper = webService.getVectorizationSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebSearchSettings"></a>
# **getWebSearchSettings**
> WebSearchSettingsWrapper getWebSearchSettings ()

Retrieves the current web search integration settings for AI chat sessions,  including whether web search is enabled, the configured search engine type, and whether the API key needs to be reset.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-search-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebSearchSettingsWrapper**](WebSearchSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

val result : WebSearchSettingsWrapper = webService.getWebSearchSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setVectorizationSettings"></a>
# **setVectorizationSettings**
> VectorizationSettingsWrapper setVectorizationSettings (SetEmbeddingConfigRequestBody setEmbeddingConfigRequestBody)

Configures the embedding provider used for document vectorization at the portal level.  Vectorization enables semantic search and knowledge retrieval capabilities in AI chat sessions.  Allows selecting the embedding provider type and providing the API key for the chosen provider.  Only portal administrators can modify these settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-vectorization-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setEmbeddingConfigRequestBody** | [**SetEmbeddingConfigRequestBody**](SetEmbeddingConfigRequestBody.md)| The embedding provider configuration parameters. | |

### Return type

[**VectorizationSettingsWrapper**](VectorizationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val setEmbeddingConfigRequestBody : SetEmbeddingConfigRequestBody =  // SetEmbeddingConfigRequestBody | The embedding provider configuration parameters.

val result : VectorizationSettingsWrapper = webService.setVectorizationSettings(setEmbeddingConfigRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setWebSearchSettings"></a>
# **setWebSearchSettings**
> WebSearchSettingsWrapper setWebSearchSettings (SetWebSearchSettingsRequestBody setWebSearchSettingsRequestBody)

Configures the web search integration for AI chat sessions at the portal level.  Allows enabling or disabling web search, selecting the search engine type, and providing the API key for the chosen engine.  Only portal administrators can modify these settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-search-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setWebSearchSettingsRequestBody** | [**SetWebSearchSettingsRequestBody**](SetWebSearchSettingsRequestBody.md)| The web search configuration parameters. | |

### Return type

[**WebSearchSettingsWrapper**](WebSearchSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val setWebSearchSettingsRequestBody : SetWebSearchSettingsRequestBody =  // SetWebSearchSettingsRequestBody | The web search configuration parameters.

val result : WebSearchSettingsWrapper = webService.setWebSearchSettings(setWebSearchSettingsRequestBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

