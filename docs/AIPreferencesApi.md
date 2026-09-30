# AIPreferencesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiPreferencesClearDeepMode**](AIPreferencesApi.md#aiPreferencesClearDeepMode) | **DELETE** api/2.0/ai/preferences/clear-deep-mode | Clear deep mode |
| [**aiPreferencesGetDeepMode**](AIPreferencesApi.md#aiPreferencesGetDeepMode) | **GET** api/2.0/ai/preferences/get-deep-mode | Get deep mode |
| [**aiPreferencesGetReasoningLevel**](AIPreferencesApi.md#aiPreferencesGetReasoningLevel) | **GET** api/2.0/ai/preferences/get-reasoning-level | Get reasoning level |
| [**aiPreferencesIsDeepModeSet**](AIPreferencesApi.md#aiPreferencesIsDeepModeSet) | **GET** api/2.0/ai/preferences/is-deep-mode-set | Is deep mode set |
| [**aiPreferencesSetDeepMode**](AIPreferencesApi.md#aiPreferencesSetDeepMode) | **PUT** api/2.0/ai/preferences/set-deep-mode | Set deep mode |
| [**aiPreferencesSetReasoningLevel**](AIPreferencesApi.md#aiPreferencesSetReasoningLevel) | **PUT** api/2.0/ai/preferences/set-reasoning-level | Set reasoning level |



<a id="aiPreferencesClearDeepMode"></a>
# **aiPreferencesClearDeepMode**
> AiSuccessResponse aiPreferencesClearDeepMode (kotlin.String body)

Removes the stored extended-thinking setting of a scope (the depth and, with it, the deep-mode toggle), after which reads fall back to the configured default rather than to false. `entityId` picks a room and omitting it clears the portal-wide preference. Clearing a scope that has no stored value is not an error. This differs from storing false, which is an explicit choice a later read reports as set.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**| The ID of the room whose preference is cleared, as a bare JSON string. Send an empty body to clear the portal-wide preference. | |

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val body : kotlin.String = body_example // kotlin.String | The ID of the room whose preference is cleared, as a bare JSON string. Send an empty body to clear the portal-wide preference.

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

Returns the deep-mode toggle of a scope, as a bare boolean: whether the stored extended-thinking depth is above `off`. `entityId` picks a room and omitting it reads the portal-wide preference. A scope that has never had a value stored falls back to the configured default, so the answer never distinguishes off from unset - ask `GET api/2.0/ai/preferences/is-deep-mode-set` for that. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/).

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : kotlin.Boolean = webService.aiPreferencesGetDeepMode(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPreferencesGetReasoningLevel"></a>
# **aiPreferencesGetReasoningLevel**
> AiAiReasoningLevel aiPreferencesGetReasoningLevel (kotlin.String entityId)

Returns the effective extended-thinking depth of the scope: `off` while deep mode is off, otherwise the persisted depth (`low`, `medium`, `high`, `max`), falling back to the default depth (`medium`) when none has been stored. `entityId` picks a room and omitting it reads the portal-wide preference. Providers clamp the depth to what the model accepts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-reasoning-level/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entityId** | **kotlin.String**| The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. | [optional] |

### Return type

[**AiAiReasoningLevel**](AiAiReasoningLevel.md)

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

launch(Dispatchers.IO) {
    val result : AiAiReasoningLevel = webService.aiPreferencesGetReasoningLevel(entityId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiPreferencesIsDeepModeSet"></a>
# **aiPreferencesIsDeepModeSet**
> kotlin.Boolean aiPreferencesIsDeepModeSet (kotlin.String entityId)

Tells whether a scope has an explicitly persisted extended-thinking setting of its own, as opposed to inheriting the configured default. `entityId` picks a room and omitting it asks about the portal-wide preference. A true answer means a value was stored, whether that value is on or off - read the value itself with `GET api/2.0/ai/preferences/get-deep-mode`. This is the check a settings screen uses to show an explicit override rather than an inherited state.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/).

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val entityId : kotlin.String = 1234 // kotlin.String | The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope.

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

Stores the deep-mode toggle of a scope. `false` stores the `off` depth; `true` keeps the depth already stored and falls back to the default depth (`medium`) when none is. `value` has to be a real boolean: a string, a number or an absent value is rejected rather than coerced, so the string false cannot silently switch the setting on and an empty request cannot silently switch it off. `entityId` picks a room and omitting it writes the portal-wide preference. It is idempotent, so there is no need to read the current value first.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPreferencesSetDeepModeRequest** | [**AiPreferencesSetDeepModeRequest**](AiPreferencesSetDeepModeRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val aiPreferencesSetDeepModeRequest : AiPreferencesSetDeepModeRequest =  // AiPreferencesSetDeepModeRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPreferencesSetDeepMode(aiPreferencesSetDeepModeRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiPreferencesSetReasoningLevel"></a>
# **aiPreferencesSetReasoningLevel**
> AiSuccessResponse aiPreferencesSetReasoningLevel (AiPreferencesSetReasoningLevelRequest aiPreferencesSetReasoningLevelRequest)

Persists the extended-thinking depth of the scope as its single stored value: a depth turns deep mode on at that depth, `off` turns it off and replaces the stored depth (a later deep-mode `true` without a depth lands on `medium`). `entityId` picks a room and omitting it writes the portal-wide preference. Idempotent.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-reasoning-level/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiPreferencesSetReasoningLevelRequest** | [**AiPreferencesSetReasoningLevelRequest**](AiPreferencesSetReasoningLevelRequest.md)|  | |

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
val webService = apiClient.createWebservice(AIPreferencesApi::class.java)
val aiPreferencesSetReasoningLevelRequest : AiPreferencesSetReasoningLevelRequest =  // AiPreferencesSetReasoningLevelRequest | 

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiPreferencesSetReasoningLevel(aiPreferencesSetReasoningLevelRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

