# ProvidersApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addProvider**](AIProvidersApi.md#addProvider) | **POST** api/2.0/ai/providers | Add an AI provider |
| [**deleteProviders**](AIProvidersApi.md#deleteProviders) | **DELETE** api/2.0/ai/providers | Delete AI providers |
| [**getAvailableProviders**](AIProvidersApi.md#getAvailableProviders) | **GET** api/2.0/ai/providers/available | Get available AI provider types |
| [**getDefaultProvider**](AIProvidersApi.md#getDefaultProvider) | **GET** api/2.0/ai/providers/default | Get the default AI provider |
| [**getProviders**](AIProvidersApi.md#getProviders) | **GET** api/2.0/ai/providers | Get AI providers |
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)
val createProviderRequestDto : CreateProviderRequestDto =  // CreateProviderRequestDto | 

val result : AiProviderWrapper = webService.addProvider(createProviderRequestDto)
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)
val removeProviderRequestDto : RemoveProviderRequestDto =  // RemoveProviderRequestDto | 

webService.deleteProviders(removeProviderRequestDto)
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)

val result : ProviderSettingsArrayWrapper = webService.getAvailableProviders()
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)

val result : DefaultProviderWrapper = webService.getDefaultProvider()
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
| **startIndex** | **kotlin.Int**| The number of items to skip before returning results (zero-based offset). Defaults to 0. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)
val startIndex : kotlin.Int = 1234 // kotlin.Int | The number of items to skip before returning results (zero-based offset). Defaults to 0.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to return per page. Defaults to 100.

val result : AiProviderArrayWrapper = webService.getProviders(startIndex, count)
```

### HTTP request headers

 - **Content-Type**: Not defined
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)
val setDefaultProviderRequestDto : SetDefaultProviderRequestDto =  // SetDefaultProviderRequestDto | 

val result : DefaultProviderWrapper = webService.setDefaultProvider(setDefaultProviderRequestDto)
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
| **id** | **kotlin.Int**| The identifier of the AI provider to update. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
val webService = apiClient.createWebservice(ProvidersApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The identifier of the AI provider to update.
val updateProviderBody : UpdateProviderBody =  // UpdateProviderBody | The AI provider configuration parameters to update.

val result : AiProviderWrapper = webService.updateProvider(id, updateProviderBody)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

