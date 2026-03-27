# WebhooksApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebhook**](SettingsWebhooksApi.md#createWebhook) | **POST** api/2.0/settings/webhook | Create a webhook |
| [**enableWebhook**](SettingsWebhooksApi.md#enableWebhook) | **PUT** api/2.0/settings/webhook/enable | Enable a webhook |
| [**getTenantWebhooks**](SettingsWebhooksApi.md#getTenantWebhooks) | **GET** api/2.0/settings/webhook | Get webhooks |
| [**getWebhookTriggers**](SettingsWebhooksApi.md#getWebhookTriggers) | **GET** api/2.0/settings/webhook/triggers | Get webhook triggers |
| [**getWebhooksLogs**](SettingsWebhooksApi.md#getWebhooksLogs) | **GET** api/2.0/settings/webhooks/log | Get webhook logs |
| [**removeWebhook**](SettingsWebhooksApi.md#removeWebhook) | **DELETE** api/2.0/settings/webhook/{id} | Remove a webhook |
| [**retryWebhook**](SettingsWebhooksApi.md#retryWebhook) | **PUT** api/2.0/settings/webhook/{id}/retry | Retry a webhook |
| [**retryWebhooks**](SettingsWebhooksApi.md#retryWebhooks) | **PUT** api/2.0/settings/webhook/retry | Retry webhooks |
| [**updateWebhook**](SettingsWebhooksApi.md#updateWebhook) | **PUT** api/2.0/settings/webhook | Update a webhook |



<a id="createWebhook"></a>
# **createWebhook**
> WebhooksConfigWrapper createWebhook (CreateWebhooksConfigRequestsDto createWebhooksConfigRequestsDto)

Creates a new tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWebhooksConfigRequestsDto** | [**CreateWebhooksConfigRequestsDto**](CreateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val createWebhooksConfigRequestsDto : CreateWebhooksConfigRequestsDto =  // CreateWebhooksConfigRequestsDto | 

launch(Dispatchers.IO) {
    val result : WebhooksConfigWrapper = webService.createWebhook(createWebhooksConfigRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="enableWebhook"></a>
# **enableWebhook**
> WebhooksConfigWrapper enableWebhook (UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto)

Enables or disables a tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWebhooksConfigRequestsDto** | [**UpdateWebhooksConfigRequestsDto**](UpdateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val updateWebhooksConfigRequestsDto : UpdateWebhooksConfigRequestsDto =  // UpdateWebhooksConfigRequestsDto | 

launch(Dispatchers.IO) {
    val result : WebhooksConfigWrapper = webService.enableWebhook(updateWebhooksConfigRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getTenantWebhooks"></a>
# **getTenantWebhooks**
> WebhooksConfigWithStatusArrayWrapper getTenantWebhooks ()

Returns a list of the tenant webhooks.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-webhooks/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksConfigWithStatusArrayWrapper**](WebhooksConfigWithStatusArrayWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)

launch(Dispatchers.IO) {
    val result : WebhooksConfigWithStatusArrayWrapper = webService.getTenantWebhooks()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebhookTriggers"></a>
# **getWebhookTriggers**
> GetWebhookTriggers200Response getWebhookTriggers ()

Returns a list of triggers for a webhook.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWebhookTriggers200Response**](GetWebhookTriggers200Response.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)

launch(Dispatchers.IO) {
    val result : GetWebhookTriggers200Response = webService.getWebhookTriggers()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebhooksLogs"></a>
# **getWebhooksLogs**
> WebhooksLogArrayWrapper getWebhooksLogs (java.time.OffsetDateTime deliveryFrom, java.time.OffsetDateTime deliveryTo, kotlin.String hookUri, kotlin.Int configId, kotlin.Int eventId, WebhookGroupStatus groupStatus, java.util.UUID userId, WebhookTrigger trigger, kotlin.Int count, kotlin.Int startIndex)

Returns the logs of the webhook activities.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deliveryFrom** | **java.time.OffsetDateTime**| The delivery start time for filtering webhook logs. | [optional] |
| **deliveryTo** | **java.time.OffsetDateTime**| The delivery end time for filtering webhook logs. | [optional] |
| **hookUri** | **kotlin.String**| The destination URL where webhooks are delivered. | [optional] |
| **configId** | **kotlin.Int**| The webhook configuration identifier. | [optional] |
| **eventId** | **kotlin.Int**| The unique identifier of the event that triggered the webhook. | [optional] |
| **groupStatus** | [**WebhookGroupStatus**](.md)| The status of the webhook delivery group. | [optional] [enum: 0, 1, 2, 4, 8, 16] |
| **userId** | **java.util.UUID**| The identifier of the user associated with the webhook event. | [optional] |
| **trigger** | [**WebhookTrigger**](.md)| The type of event that triggered the webhook. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824] |
| **count** | **kotlin.Int**| The maximum number of webhook log records to return in the query response. | [optional] |
| **startIndex** | **kotlin.Int**| Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries. | [optional] |

### Return type

[**WebhooksLogArrayWrapper**](WebhooksLogArrayWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val deliveryFrom : java.time.OffsetDateTime = 2024-01-15T10:30Z // java.time.OffsetDateTime | The delivery start time for filtering webhook logs.
val deliveryTo : java.time.OffsetDateTime = 2024-01-15T10:30Z // java.time.OffsetDateTime | The delivery end time for filtering webhook logs.
val hookUri : kotlin.String = https://example.com/webhook // kotlin.String | The destination URL where webhooks are delivered.
val configId : kotlin.Int = 1 // kotlin.Int | The webhook configuration identifier.
val eventId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the event that triggered the webhook.
val groupStatus : WebhookGroupStatus = NotSent // WebhookGroupStatus | The status of the webhook delivery group.
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The identifier of the user associated with the webhook event.
val trigger : WebhookTrigger = 0 // WebhookTrigger | The type of event that triggered the webhook.
val count : kotlin.Int = 1 // kotlin.Int | The maximum number of webhook log records to return in the query response.
val startIndex : kotlin.Int = 1 // kotlin.Int | Specifies the starting index for retrieving webhook logs.  Used for pagination in the webhook delivery log queries.

launch(Dispatchers.IO) {
    val result : WebhooksLogArrayWrapper = webService.getWebhooksLogs(deliveryFrom, deliveryTo, hookUri, configId, eventId, groupStatus, userId, trigger, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeWebhook"></a>
# **removeWebhook**
> WebhooksConfigWrapper removeWebhook (kotlin.Int id)

Removes a tenant webhook with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID extracted from the route parameters. | |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The ID extracted from the route parameters.

launch(Dispatchers.IO) {
    val result : WebhooksConfigWrapper = webService.removeWebhook(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="retryWebhook"></a>
# **retryWebhook**
> WebhooksLogWrapper retryWebhook (kotlin.Int id)

Retries a webhook with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The ID extracted from the route parameters. | |

### Return type

[**WebhooksLogWrapper**](WebhooksLogWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val id : kotlin.Int = 1 // kotlin.Int | The ID extracted from the route parameters.

launch(Dispatchers.IO) {
    val result : WebhooksLogWrapper = webService.retryWebhook(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="retryWebhooks"></a>
# **retryWebhooks**
> WebhooksLogArrayWrapper retryWebhooks (WebhookRetryRequestsDto webhookRetryRequestsDto)

Retries all the webhooks with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhooks/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookRetryRequestsDto** | [**WebhookRetryRequestsDto**](WebhookRetryRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksLogArrayWrapper**](WebhooksLogArrayWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val webhookRetryRequestsDto : WebhookRetryRequestsDto =  // WebhookRetryRequestsDto | 

launch(Dispatchers.IO) {
    val result : WebhooksLogArrayWrapper = webService.retryWebhooks(webhookRetryRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateWebhook"></a>
# **updateWebhook**
> WebhooksConfigWrapper updateWebhook (UpdateWebhooksConfigRequestsDto updateWebhooksConfigRequestsDto)

Updates a tenant webhook with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWebhooksConfigRequestsDto** | [**UpdateWebhooksConfigRequestsDto**](UpdateWebhooksConfigRequestsDto.md)|  | [optional] |

### Return type

[**WebhooksConfigWrapper**](WebhooksConfigWrapper.md)

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
val webService = apiClient.createWebservice(WebhooksApi::class.java)
val updateWebhooksConfigRequestsDto : UpdateWebhooksConfigRequestsDto =  // UpdateWebhooksConfigRequestsDto | 

launch(Dispatchers.IO) {
    val result : WebhooksConfigWrapper = webService.updateWebhook(updateWebhooksConfigRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

