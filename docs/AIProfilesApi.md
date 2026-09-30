# AIProfilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiProfilesCreate**](AIProfilesApi.md#aiProfilesCreate) | **POST** api/2.0/ai/profiles/create | Create a provider profile |
| [**aiProfilesDelete**](AIProfilesApi.md#aiProfilesDelete) | **DELETE** api/2.0/ai/profiles/delete | Delete a provider profile |
| [**aiProfilesGetById**](AIProfilesApi.md#aiProfilesGetById) | **GET** api/2.0/ai/profiles/get-by-id | Get a provider profile |
| [**aiProfilesList**](AIProfilesApi.md#aiProfilesList) | **GET** api/2.0/ai/profiles/list | List provider profiles |
| [**aiProfilesListModels**](AIProfilesApi.md#aiProfilesListModels) | **GET** api/2.0/ai/profiles/list-models | List models |
| [**aiProfilesListProviderModels**](AIProfilesApi.md#aiProfilesListProviderModels) | **POST** api/2.0/ai/profiles/list-provider-models | List provider models |
| [**aiProfilesTestConnection**](AIProfilesApi.md#aiProfilesTestConnection) | **POST** api/2.0/ai/profiles/test-connection | Test a profile's provider |
| [**aiProfilesUpdate**](AIProfilesApi.md#aiProfilesUpdate) | **PUT** api/2.0/ai/profiles/update | Update a provider profile |



<a id="aiProfilesCreate"></a>
# **aiProfilesCreate**
> AiProfileMutationResult aiProfilesCreate (AiCreateProfileInput aiCreateProfileInput)

Creates an AI provider profile - the endpoint, credentials and model that a chat round runs on - and returns it. The name has to be unique, the credentials are probed against the live provider before anything is stored, and the portal's first profile also takes the `Default` assignment slot. Two inputs are refused outright: a `baseUrl` pointing at a private network address, and `providerType: external`, which delegates transport to the host application and therefore cannot work for a profile the server manages. On a portal running the AI gateway, profiles are managed centrally and this operation answers 403.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiCreateProfileInput** | [**AiCreateProfileInput**](AiCreateProfileInput.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

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

Deletes an AI provider profile and cleans up every assignment pointing at it: the `Default` slot moves to the first remaining profile and the other slots are left unbound. The ID is required and may be sent in the body or as a query parameter. An unknown ID is not reported - the call answers success without deleting anything. Threads already bound to the profile keep the stored reference, so a round on such a thread falls back to whatever the scope resolves to.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the profile to delete, as a bare JSON string. | |

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the profile to delete, as a bare JSON string.

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

Returns one AI provider profile by its ID, with its secrets stripped: neither the API key nor the custom headers are ever sent back, on any portal. The ID is required and is read from the query, and an unknown one answers 404. The `baseUrl` in the answer is the one that was stored, not the internal gateway address a round actually dials, so it cannot be used to reach the provider directly. Use `GET api/2.0/ai/profiles/list` to enumerate profiles instead of reading them one by one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| The AI provider profile identifier. | |

### Return type

[**AiProfilesGetById200Response**](AiProfilesGetById200Response.md)

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val id : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The AI provider profile identifier.

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

Lists the portal's AI provider profiles with their secrets stripped, the same way the single-profile read does. It takes no parameters and is not paginated, because a portal holds few profiles. On a portal running the AI gateway the answer is synthesised from the gateway's own catalogue rather than from stored records. The IDs in the answer are what the assignment operations and every round's `profileId` accept.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;AiProfile&gt;**](AiProfile.md)

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

Lists the models a stored profile's provider currently offers, asking the provider itself rather than reading a cached list. `profileId` is required and is read from the query. A failure is reported with the provider's own verdict: an unusable key comes back as 400 and a provider that is unreachable or broken as 502, while a missing profile or a caller without access keeps the status the portal gave it. Use `POST api/2.0/ai/profiles/list-provider-models` to probe an endpoint that has no profile yet.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileId** | **kotlin.String**| The AI provider profile identifier. | |

### Return type

[**kotlin.collections.List&lt;AiModel&gt;**](AiModel.md)

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val profileId : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The AI provider profile identifier.

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

Lists the models an endpoint offers for credentials supplied in the request, before any profile exists - this is what a provider-setup form calls to fill its model picker. `providerType` and `baseUrl` are both required, and a 400 for either names the offending input in a `field` member so the form can highlight it; a `baseUrl` pointing at a private network address is refused as well. For `providerType: onlyoffice` the answer comes from the portal gateway's catalogue, which carries richer capability data than the provider's own listing and matches what `GET api/2.0/ai/profiles/list` reports; a portal without that gateway falls back to asking the provider. A provider that is unreachable or broken is reported as 502, and one that rejects the key as 400.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiProfilesListProviderModelsRequest** | [**AiProfilesListProviderModelsRequest**](AiProfilesListProviderModelsRequest.md)|  | |

### Return type

[**kotlin.collections.List&lt;AiModel&gt;**](AiModel.md)

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

Probes a stored profile's credentials against its provider and reports the outcome in the answer, writing nothing - this is what a Test button calls so that a failure does not commit anything. `profileId` is required and may be sent in the body or as a query parameter. The result is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload. To validate credentials that are not stored yet, use `POST api/2.0/ai/profiles/list-provider-models`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the profile to probe, as a bare JSON string. | |

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the profile to probe, as a bare JSON string.

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

Replaces a stored AI provider profile and returns it, re-checking name uniqueness and probing the credentials against the live provider again. The same two inputs are refused as on create - a private-network `baseUrl` and `providerType: external` - and the whole profile is overwritten by the one supplied rather than merged. On a portal running the AI gateway this answers 403, because profiles are managed centrally there. A profile that is bound to an action or an agent keeps those bindings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiProfile** | [**AiProfile**](AiProfile.md)|  | |

### Return type

[**AiProfileMutationResult**](AiProfileMutationResult.md)

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
val webService = apiClient.createWebservice(AIProfilesApi::class.java)
val aiProfile : AiProfile =  // AiProfile | 

launch(Dispatchers.IO) {
    val result : AiProfileMutationResult = webService.aiProfilesUpdate(aiProfile)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

