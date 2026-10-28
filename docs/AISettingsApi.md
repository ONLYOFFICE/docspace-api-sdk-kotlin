# AISettingsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aiSettingsGet**](AISettingsApi.md#aiSettingsGet) | **GET** api/2.0/ai/config | Get AI settings |
| [**aiSettingsGetToolMode**](AISettingsApi.md#aiSettingsGetToolMode) | **GET** api/2.0/ai/config/tool-mode | Get the tool permission mode |
| [**aiSettingsGetUser**](AISettingsApi.md#aiSettingsGetUser) | **GET** api/2.0/ai/config/user | Get user AI settings |
| [**aiSettingsGetVectorization**](AISettingsApi.md#aiSettingsGetVectorization) | **GET** api/2.0/ai/config/vectorization | Get vectorization settings |
| [**aiSettingsSetToolMode**](AISettingsApi.md#aiSettingsSetToolMode) | **PUT** api/2.0/ai/config/tool-mode | Set the tool permission mode |
| [**aiSettingsSetUser**](AISettingsApi.md#aiSettingsSetUser) | **PUT** api/2.0/ai/config/user | Update user AI settings |
| [**aiSettingsSetVectorization**](AISettingsApi.md#aiSettingsSetVectorization) | **PUT** api/2.0/ai/config/vectorization | Update vectorization settings |



<a id="aiSettingsGet"></a>
# **aiSettingsGet**
> AiSettingsWrapper aiSettingsGet ()

Reports the portal's AI configuration and whether AI is usable at all, which is the first call a client makes before offering any AI feature. It takes no parameters and is proxied unchanged to the DocSpace AI service, so the answer is that service's settings payload. Among other things it says whether the portal runs on the central AI gateway, which decides whether provider profiles can be edited here at all. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiSettingsWrapper**](AiSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiSettingsWrapper = webService.aiSettingsGet()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsGetToolMode"></a>
# **aiSettingsGetToolMode**
> AiSuccessResponse aiSettingsGetToolMode ()

Returns the calling user's tool permission mode as the DocSpace AI service spells it - `{ mode }` with the service's `ToolPermissionMode` enum (`Ask`, `Auto`, `Allow`), proxied unchanged. The chat reads the same value in its own spelling through `GET api/2.0/ai/preferences/get-tool-permission-mode`. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-tool-mode/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiSettingsGetToolMode()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsGetUser"></a>
# **aiSettingsGetUser**
> AiUserSettingsWrapper aiSettingsGetUser ()

Returns the AI settings of the calling user, as opposed to the portal-wide ones. It takes no parameters - the user is the authenticated caller, and there is no way to read somebody else's settings - and is proxied unchanged to the DocSpace AI service. Use `GET api/2.0/ai/config` for the portal-wide configuration. This is a read-only operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-user/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiUserSettingsWrapper**](AiUserSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiUserSettingsWrapper = webService.aiSettingsGetUser()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsGetVectorization"></a>
# **aiSettingsGetVectorization**
> AiVectorizationSettingsWrapper aiSettingsGetVectorization ()

Returns the portal's vectorization settings - the embedding provider and the options used when portal content is indexed for retrieval. It takes no parameters and is proxied unchanged to the DocSpace AI service. Vectorization is a portal-wide setting, so there is no room-scoped form of it. Change it with `PUT api/2.0/ai/config/vectorization`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-get-vectorization/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)

launch(Dispatchers.IO) {
    val result : AiVectorizationSettingsWrapper = webService.aiSettingsGetVectorization()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="aiSettingsSetToolMode"></a>
# **aiSettingsSetToolMode**
> AiSuccessResponse aiSettingsSetToolMode (kotlin.collections.Map<kotlin.String, kotlin.Any?> aiSettingsSetToolModeRequest)

Stores the calling user's tool permission mode and returns the stored result. The body (`{ mode }`) is proxied unchanged to the DocSpace AI service, which rejects a value outside its `ToolPermissionMode` enum. The mode applies to every chat of the user in the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-tool-mode/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiSettingsSetToolModeRequest** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| `{ mode }` with the AI service's `ToolPermissionMode` enum, proxied unchanged; the service rejects anything outside the enum. | |

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val aiSettingsSetToolModeRequest : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | `{ mode }` with the AI service's `ToolPermissionMode` enum, proxied unchanged; the service rejects anything outside the enum.

launch(Dispatchers.IO) {
    val result : AiSuccessResponse = webService.aiSettingsSetToolMode(aiSettingsSetToolModeRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiSettingsSetUser"></a>
# **aiSettingsSetUser**
> AiUserSettingsWrapper aiSettingsSetUser (kotlin.collections.Map<kotlin.String, kotlin.Any?> aiSettingsSetUserRequest)

Replaces the AI settings of the calling user and returns the stored result. `chatRecommendedModelVisible` is required and has to be a real boolean - a body the JSON parser cannot read, such as one sent as text/plain, used to arrive empty and answer 200 having stored nothing. The body is then proxied to the DocSpace AI service, which validates the rest, so a rejected value comes back with that service's verdict. Only the caller's own settings can be written. Portal-wide configuration is not touched by this operation.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-user/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiSettingsSetUserRequest** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| The user's AI settings: `chatRecommendedModelVisible` as a boolean, required. Read the current one with `GET api/2.0/ai/config/user` and send it back changed. | |

### Return type

[**AiUserSettingsWrapper**](AiUserSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val aiSettingsSetUserRequest : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | The user's AI settings: `chatRecommendedModelVisible` as a boolean, required. Read the current one with `GET api/2.0/ai/config/user` and send it back changed.

launch(Dispatchers.IO) {
    val result : AiUserSettingsWrapper = webService.aiSettingsSetUser(aiSettingsSetUserRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="aiSettingsSetVectorization"></a>
# **aiSettingsSetVectorization**
> AiVectorizationSettingsWrapper aiSettingsSetVectorization (kotlin.collections.Map<kotlin.String, kotlin.Any?> aiSettingsSetVectorizationRequest)

Replaces the portal's vectorization settings and returns the stored result. The body is proxied unchanged to the DocSpace AI service, which validates it, so a rejected value is reported with that service's own verdict rather than being checked here. Changing the embedding provider does not re-index anything already indexed - start that separately with `POST api/2.0/ai/vectorization/tasks`. This is a portal-wide setting and requires the permissions the AI service demands for it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-settings-set-vectorization/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **aiSettingsSetVectorizationRequest** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any?&gt;**](kotlin.Any.md)| The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed. | |

### Return type

[**AiVectorizationSettingsWrapper**](AiVectorizationSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AISettingsApi::class.java)
val aiSettingsSetVectorizationRequest : kotlin.collections.Map<kotlin.String, kotlin.Any?> = Object // kotlin.collections.Map<kotlin.String, kotlin.Any?> | The portal's vectorization settings, proxied unchanged to the DocSpace AI service, which owns and validates the shape. Read the current one with `GET api/2.0/ai/config/vectorization` and send it back changed.

launch(Dispatchers.IO) {
    val result : AiVectorizationSettingsWrapper = webService.aiSettingsSetVectorization(aiSettingsSetVectorizationRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

