# AIProvidersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addProvider**](AIProvidersApi.md#addProvider) | **POST** api/2.0/ai/providers | Add an AI provider |
| [**deleteProviders**](AIProvidersApi.md#deleteProviders) | **DELETE** api/2.0/ai/providers | Delete AI providers |
| [**getAvailableProviders**](AIProvidersApi.md#getAvailableProviders) | **GET** api/2.0/ai/providers/available | Get available AI provider types |
| [**getDefaultProvider**](AIProvidersApi.md#getDefaultProvider) | **GET** api/2.0/ai/providers/default | Get the default AI provider |
| [**getProviderModels**](AIProvidersApi.md#getProviderModels) | **GET** api/2.0/ai/providers/{providerId}/models | Get all models for a provider with their settings |
| [**getProviders**](AIProvidersApi.md#getProviders) | **GET** api/2.0/ai/providers | Get AI providers |
| [**previewProviderModels**](AIProvidersApi.md#previewProviderModels) | **POST** api/2.0/ai/providers/models/preview | Preview models for a new AI provider |
| [**setDefaultProvider**](AIProvidersApi.md#setDefaultProvider) | **PUT** api/2.0/ai/providers/default | Set the default AI provider |
| [**updateProvider**](AIProvidersApi.md#updateProvider) | **PUT** api/2.0/ai/providers/{id} | Update an AI provider |



<a id="addProvider"></a>
# **addProvider**
> AiProviderWrapper addProvider (CreateProviderRequestDto createProviderRequestDto)

Registers a new AI provider for the current tenant by specifying its type, display title, API endpoint URL, and authentication key.  The provider becomes available for AI chat conversations after creation. This action is rate-limited.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-provider/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProviderRequestDto** | [**CreateProviderRequestDto**](CreateProviderRequestDto.md)|  | [optional] |

### Return type

[**AiProviderWrapper**](AiProviderWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val createProviderRequestDto : CreateProviderRequestDto =  // CreateProviderRequestDto | 

launch(Dispatchers.IO) {
    val result : AiProviderWrapper = webService.addProvider(createProviderRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteProviders"></a>
# **deleteProviders**
> void deleteProviders (RemoveProviderRequestDto removeProviderRequestDto)

Permanently deletes one or more AI providers by their identifiers.  All specified providers are removed from the current tenant. This action cannot be undone.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-providers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **removeProviderRequestDto** | [**RemoveProviderRequestDto**](RemoveProviderRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val removeProviderRequestDto : RemoveProviderRequestDto =  // RemoveProviderRequestDto | 

launch(Dispatchers.IO) {
    webService.deleteProviders(removeProviderRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="getAvailableProviders"></a>
# **getAvailableProviders**
> ProviderSettingsArrayWrapper getAvailableProviders ()

Returns the list of AI provider types that are available for configuration on the current instance.  Each entry includes the provider type identifier and the default API endpoint URL.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-providers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProviderSettingsArrayWrapper**](ProviderSettingsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)

launch(Dispatchers.IO) {
    val result : ProviderSettingsArrayWrapper = webService.getAvailableProviders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getDefaultProvider"></a>
# **getDefaultProvider**
> DefaultProviderWrapper getDefaultProvider ()

Returns the default AI provider and model configured for the current tenant.  Returns null if the tenant does not have any registered providers.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-provider/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefaultProviderWrapper**](DefaultProviderWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)

launch(Dispatchers.IO) {
    val result : DefaultProviderWrapper = webService.getDefaultProvider()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProviderModels"></a>
# **getProviderModels**
> ModelSettingsArrayWrapper getProviderModels (kotlin.Int providerId)

Returns the full list of AI models available from a provider, including both recommended and additional models.  Each model includes its current settings: enabled state, display alias, and capabilities (vision, tool calling, thinking).  Recommended models are enabled by default and their alias and capabilities come from configuration.  Additional models are disabled by default and can be configured by the admin.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-provider-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **kotlin.Int**| The identifier of the AI provider. | |

### Return type

[**ModelSettingsArrayWrapper**](ModelSettingsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val providerId : kotlin.Int = 1 // kotlin.Int | The identifier of the AI provider.

launch(Dispatchers.IO) {
    val result : ModelSettingsArrayWrapper = webService.getProviderModels(providerId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProviders"></a>
# **getProviders**
> AiProviderArrayWrapper getProviders (kotlin.Int startIndex, kotlin.Int count)

Returns a paginated list of AI providers configured for the current tenant.  Supports pagination via the startIndex and count query parameters. The total number of providers is included in the response metadata.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-providers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| **count** | **kotlin.Int**| The maximum number of items to return per page. Defaults to 100. | [optional] |

### Return type

[**AiProviderArrayWrapper**](AiProviderArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 100 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

launch(Dispatchers.IO) {
    val result : AiProviderArrayWrapper = webService.getProviders(startIndex, count)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="previewProviderModels"></a>
# **previewProviderModels**
> ModelSettingsArrayWrapper previewProviderModels (PreviewProviderModelsRequestDto previewProviderModelsRequestDto)

Connects to the specified AI provider using the provided credentials and returns the available models  with their default settings. This is used to preview models before saving the provider.  Recommended models are enabled by default with configuration-defined settings.  Additional models are disabled by default with empty capabilities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/preview-provider-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **previewProviderModelsRequestDto** | [**PreviewProviderModelsRequestDto**](PreviewProviderModelsRequestDto.md)|  | [optional] |

### Return type

[**ModelSettingsArrayWrapper**](ModelSettingsArrayWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val previewProviderModelsRequestDto : PreviewProviderModelsRequestDto =  // PreviewProviderModelsRequestDto | 

launch(Dispatchers.IO) {
    val result : ModelSettingsArrayWrapper = webService.previewProviderModels(previewProviderModelsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setDefaultProvider"></a>
# **setDefaultProvider**
> DefaultProviderWrapper setDefaultProvider (SetDefaultProviderRequestDto setDefaultProviderRequestDto)

Sets the default AI provider and model for the current tenant.  The specified provider and model will be used as the default for all new AI chat sessions within the tenant.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-provider/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setDefaultProviderRequestDto** | [**SetDefaultProviderRequestDto**](SetDefaultProviderRequestDto.md)|  | [optional] |

### Return type

[**DefaultProviderWrapper**](DefaultProviderWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val setDefaultProviderRequestDto : SetDefaultProviderRequestDto =  // SetDefaultProviderRequestDto | 

launch(Dispatchers.IO) {
    val result : DefaultProviderWrapper = webService.setDefaultProvider(setDefaultProviderRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateProvider"></a>
# **updateProvider**
> AiProviderWrapper updateProvider (kotlin.Int id, UpdateProviderBody updateProviderBody)

Updates the configuration of an existing AI provider, including its display title, API endpoint URL, and authentication key.  Only the fields provided in the request body will be updated. This action is rate-limited.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-provider/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The identifier of the AI provider to update. | |
| **updateProviderBody** | [**UpdateProviderBody**](UpdateProviderBody.md)| The AI provider configuration parameters to update. | |

### Return type

[**AiProviderWrapper**](AiProviderWrapper.md)

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
val webService = apiClient.createWebservice(AIProvidersApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The identifier of the AI provider to update.
val updateProviderBody : UpdateProviderBody =  // UpdateProviderBody | The AI provider configuration parameters to update.

launch(Dispatchers.IO) {
    val result : AiProviderWrapper = webService.updateProvider(id, updateProviderBody)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

