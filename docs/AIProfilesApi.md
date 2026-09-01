# AIProfilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiProfilesCreate**](AIProfilesApi.md#aiProfilesCreate) | **POST** api/2.0/ai/profiles/create | Create |
| [**aiProfilesDelete**](AIProfilesApi.md#aiProfilesDelete) | **DELETE** api/2.0/ai/profiles/delete | Delete |
| [**aiProfilesGetById**](AIProfilesApi.md#aiProfilesGetById) | **GET** api/2.0/ai/profiles/get-by-id | Get by id |
| [**aiProfilesList**](AIProfilesApi.md#aiProfilesList) | **GET** api/2.0/ai/profiles/list | List |
| [**aiProfilesListModels**](AIProfilesApi.md#aiProfilesListModels) | **GET** api/2.0/ai/profiles/list-models | List models |
| [**aiProfilesListProviderModels**](AIProfilesApi.md#aiProfilesListProviderModels) | **POST** api/2.0/ai/profiles/list-provider-models | List provider models |
| [**aiProfilesTestConnection**](AIProfilesApi.md#aiProfilesTestConnection) | **POST** api/2.0/ai/profiles/test-connection | Test connection |
| [**aiProfilesUpdate**](AIProfilesApi.md#aiProfilesUpdate) | **PUT** api/2.0/ai/profiles/update | Update |



<a id="aiProfilesCreate"></a>
# **aiProfilesCreate**
> AiProfileMutationResult aiProfilesCreate (AiCreateProfileInput aiCreateProfileInput)

Creates an AI provider profile. The name must be unique and the credentials are validated against the provider before the profile is stored; the portal's first profile also takes the `Default` assignment slot.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiCreateProfileInput** | [**AiCreateProfileInput**](AiCreateProfileInput.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val aiCreateProfileInput : AiCreateProfileInput =  // AiCreateProfileInput | 

launch(Dispatchers.IO) {
    val result : AiProfileMutationResult = webService.aiProfilesCreate(aiCreateProfileInput)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiProfilesDelete"></a>
# **aiProfilesDelete**
> AiSuccessResponse aiProfilesDelete (kotlin.String body)

Deletes an AI provider profile and cleans up the assignments pointing at it - the `Default` slot moves to the first remaining profile, the other slots are unbound.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/).

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiProfilesDelete(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiProfilesGetById"></a>
# **aiProfilesGetById**
> AiProfilesGetById200Response aiProfilesGetById (kotlin.String id)

Returns one AI provider profile, or an empty result when the identifier is unknown.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The AI provider profile identifier. | |

### Return type

[**AiProfilesGetById200Response**](AiProfilesGetById200Response.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The AI provider profile identifier.

launch(Dispatchers.IO) {
    val result : AiProfilesGetById200Response = webService.aiProfilesGetById(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiProfilesList"></a>
# **aiProfilesList**
> kotlin.collections.List&lt;AiProfile&gt; aiProfilesList ()

Lists the portal's AI provider profiles.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiProfile&gt;**](AiProfile.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiProfile> = webService.aiProfilesList()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiProfilesListModels"></a>
# **aiProfilesListModels**
> kotlin.collections.List&lt;AiModel&gt; aiProfilesListModels (kotlin.String profileId)

Lists the models the given profile's provider offers, as reported by the provider itself.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String**| The AI provider profile identifier. | |

### Return type

[**kotlin.collections.List&lt;AiModel&gt;**](AiModel.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val profileId : kotlin.String = profileId_example // kotlin.String | The AI provider profile identifier.

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiModel> = webService.aiProfilesListModels(profileId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiProfilesListProviderModels"></a>
# **aiProfilesListProviderModels**
> kotlin.collections.List&lt;AiModel&gt; aiProfilesListProviderModels (AiProfilesListProviderModelsRequest aiProfilesListProviderModelsRequest)

Lists the models a provider offers for the supplied endpoint and key, before any profile is created from them.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiProfilesListProviderModelsRequest** | [**AiProfilesListProviderModelsRequest**](AiProfilesListProviderModelsRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;AiModel&gt;**](AiModel.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val aiProfilesListProviderModelsRequest : AiProfilesListProviderModelsRequest =  // AiProfilesListProviderModelsRequest | 

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<AiModel> = webService.aiProfilesListProviderModels(aiProfilesListProviderModelsRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiProfilesTestConnection"></a>
# **aiProfilesTestConnection**
> AiProfilesTestConnection200Response aiProfilesTestConnection (kotlin.String body)

Checks a stored profile's credentials against its provider and reports the provider's own error when the call fails. Nothing is written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | |

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : AiProfilesTestConnection200Response = webService.aiProfilesTestConnection(body)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiProfilesUpdate"></a>
# **aiProfilesUpdate**
> AiProfileMutationResult aiProfilesUpdate (AiProfile aiProfile)

Updates an AI provider profile, re-checking name uniqueness and the provider credentials.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiProfile** | [**AiProfile**](AiProfile.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val aiProfile : AiProfile =  // AiProfile | 

launch(Dispatchers.IO) {
    val result : AiProfileMutationResult = webService.aiProfilesUpdate(aiProfile)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

