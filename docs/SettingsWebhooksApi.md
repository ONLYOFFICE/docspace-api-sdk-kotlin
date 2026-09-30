# WebhooksApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebhook**](SettingsWebhooksApi.md#createWebhook) | **POST** api/2.0/settings/webhook | Create a webhook |
| [**enableWebhook**](SettingsWebhooksApi.md#enableWebhook) | **PUT** api/2.0/settings/webhook/enable | Switch a webhook on or off |
| [**getTenantWebhooks**](SettingsWebhooksApi.md#getTenantWebhooks) | **GET** api/2.0/settings/webhook | Get the portal webhooks |
| [**getWebhookTriggers**](SettingsWebhooksApi.md#getWebhookTriggers) | **GET** api/2.0/settings/webhook/triggers | Get the webhook triggers |
| [**getWebhooksLogs**](SettingsWebhooksApi.md#getWebhooksLogs) | **GET** api/2.0/settings/webhooks/log | Get the webhook delivery log |
| [**removeWebhook**](SettingsWebhooksApi.md#removeWebhook) | **DELETE** api/2.0/settings/webhook/{id} | Remove a webhook |
| [**retryWebhook**](SettingsWebhooksApi.md#retryWebhook) | **PUT** api/2.0/settings/webhook/{id}/retry | Retry a webhook delivery |
| [**retryWebhooks**](SettingsWebhooksApi.md#retryWebhooks) | **PUT** api/2.0/settings/webhook/retry | Retry webhook deliveries |
| [**updateWebhook**](SettingsWebhooksApi.md#updateWebhook) | **PUT** api/2.0/settings/webhook | Update a webhook |



<a id="createWebhook"></a>
# **createWebhook**
> WebhooksConfigWrapper createWebhook (CreateWebhooksConfigRequestsDto createWebhooksConfigRequestsDto)

Creates a webhook subscription for the current portal: a target URL that the portal calls with a signed JSON  payload whenever one of the subscribed events happens. The target is checked before anything is stored, so it  has to be an absolute `http` or `https` address outside the installation's own network, and it has to answer a  HEAD request with a success code, redirects not being followed. `secretKey` is mandatory here, has to satisfy  the portal password rules published by `GET api/2.0/settings/security/password`, and signs the payloads; it  does not appear in any response. `triggers` is a bitmask of the subscribed events with 0 standing for all of  them; a flag the caller's role may not use is rejected, so take the allowed set from  `GET api/2.0/settings/webhook/triggers`. `ssl=true` additionally demands an `https` target with a valid  certificate, while `ssl=false` leaves the certificate unchecked. Set `targetId` to deliver events about a  single entity only. A subscription fires only for events its creator is allowed to see, and only while it is  enabled. Any role except `Guest` may create one, and each call adds another subscription rather than replacing  an existing one.

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

Switches one webhook subscription on or off, leaving the rest of its parameters as they are. Only `id` and  `enabled` are read from the body: `name`, `uri`, `secretKey`, `ssl`, `triggers` and `targetId` are demanded by  the schema but ignored here, so change any of them with `PUT api/2.0/settings/webhook` instead. Switching a  subscription on re-checks what is already stored, probing the saved URL with a HEAD request and re-validating  the saved secret against the current portal password rules, and the call is refused with 400 when either  fails: a subscription whose target has gone away, or whose secret predates a tightening of the password rules,  cannot be switched on until it is updated. Switching one off is not validated. While a subscription is off its  events are dropped rather than queued, so nothing arrives from that period once it is switched on again. A  `DocSpaceAdmin` may switch any subscription in the portal, anyone else only their own, and a `Guest` is  refused. The response carries the subscription in its new state, and repeating the call changes nothing  further.

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

Returns the webhook subscriptions of the current portal, each together with the outcome of its most recent  delivery. The portal owner and a `DocSpaceAdmin` see every subscription in the portal, while a `RoomAdmin` or  a `User` sees only the ones they created themselves, so the same call answers differently depending on who  asks. A `Guest` may not use webhooks at all and is refused, and so is any non-admin caller while the portal  keeps the developer tools restricted, which `GET api/2.0/settings/devtoolsaccess` reports. Every entry pairs  the stored configuration with `status`, the HTTP status code the target answered on the last attempt, where 0  means nothing has been delivered yet, while the secret key is not part of the response. The list is neither  paginated nor ordered, and an empty list simply means no subscription exists for the caller. Nothing is  written and the call is safe to repeat. Create a subscription with `POST api/2.0/settings/webhook`, and  inspect single deliveries with `GET api/2.0/settings/webhooks/log`.

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
> WebhookTriggerArrayWrapper getWebhookTriggers ()

Returns the catalogue of events a webhook subscription can listen to, in the order the portal presents them:  user events, then group, file, folder, room, form and agent ones. Each entry carries the event name as it  appears in a payload, such as `file.created`, the bit value to put into the `triggers` bitmask of a  subscription, and `available`, telling whether the caller's own role may subscribe to that event at all: a  `User` cannot subscribe to the creation of users, groups or rooms, for instance, while a `RoomAdmin` can. Add  the bit values of the wanted events together to build `triggers`; the entry named `*` has the value 0 and  stands for every event, so it is used on its own rather than added. Events unavailable to the caller are  listed all the same, but passing one to `POST api/2.0/settings/webhook` or `PUT api/2.0/settings/webhook` is  rejected as an invalid request. This is fixed reference data: the same for every portal, not paginated,  changing only with the product version, and readable by any authenticated caller, a `Guest` included. Nothing  is written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhook-triggers/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookTriggerArrayWrapper**](WebhookTriggerArrayWrapper.md)

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
    val result : WebhookTriggerArrayWrapper = webService.getWebhookTriggers()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebhooksLogs"></a>
# **getWebhooksLogs**
> WebhooksLogArrayWrapper getWebhooksLogs (java.time.OffsetDateTime deliveryFrom, java.time.OffsetDateTime deliveryTo, kotlin.String hookUri, kotlin.Int configId, kotlin.Int eventId, WebhookGroupStatus groupStatus, java.util.UUID userId, WebhookTrigger trigger, kotlin.Int count, kotlin.Int startIndex)

Returns the delivery records of the portal webhooks, one record per attempt, carrying the trigger, the request  and response headers and bodies, the HTTP `status` the target answered and the `delivery` moment, the last two  staying empty while an attempt is still on its way. Records come newest first and are paged with `startIndex`  and `count`, at most 100 at a time, while the number of records matching the filter is reported as `total`  beside the response. Filters combine with AND: `deliveryFrom` and `deliveryTo` bound the delivery moment,  `hookUri` matches the subscription URL exactly, `configId` picks one subscription, `eventId` one single  record, `groupStatus` keeps only the answered status classes it names with 0 meaning no status filter, and  `trigger` narrows to one event with 0 meaning all of them. `userId` filters by who created the subscription  rather than by who caused the event, and for a caller who is not a `DocSpaceAdmin` it is forced to the caller,  so a non-admin only ever sees deliveries of their own subscriptions. A `Guest` is refused. Nothing is written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-webhooks-logs/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deliveryFrom** | **java.time.OffsetDateTime**| The earliest delivery moment a record may carry. Records of attempts still on their way have no delivery  moment yet and fall outside any bound set here. | [optional] |
| **deliveryTo** | **java.time.OffsetDateTime**| The latest delivery moment a record may carry. All the filters combine with AND, so it narrows whatever the  other ones already kept. | [optional] |
| **hookUri** | **kotlin.String**| The subscription target address, matched in full rather than as a prefix. Filtering by `configId` is the  reliable way to pick one subscription, since several may share an address. | [optional] |
| **configId** | **kotlin.Int**| The subscription whose deliveries are kept, by the `id` that `GET api/2.0/settings/webhook` reports. | [optional] |
| **eventId** | **kotlin.Int**| A single delivery record, by its own identifier. It narrows the answer to that one record, which is how a  client follows up a retry it queued earlier. | [optional] |
| **groupStatus** | [**WebhookGroupStatus**](.md)| The classes of answered status to keep, as a bitmask; 0 keeps every record whatever the target answered. | [optional] [enum: 0, 1, 2, 4, 8, 16] |
| **userId** | **java.util.UUID**| The member whose subscriptions the records belong to, by portal user ID - who created the subscription, not  who caused the event. For a caller who is not a DocSpace administrator it is overwritten with the caller own  ID, so such a caller never sees another member deliveries whatever is sent here. | [optional] |
| **trigger** | [**WebhookTrigger**](.md)| The single event kind to keep; 0 keeps every kind. It names one trigger rather than a mask of several, unlike  the `triggers` a subscription is created with. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824] |
| **count** | **kotlin.Int**| How many records one page may hold. The maximum is also the default, so a client that wants shorter pages has  to ask for them; the number of records matching the filter comes back as `total` beside the page. | [optional] |
| **startIndex** | **kotlin.Int**| How many matching records to skip before the page begins, counting from the newest. Advance it by `count` to  walk back through the log. | [optional] |

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
val deliveryFrom : java.time.OffsetDateTime = 2024-01-15T10:30:00Z // java.time.OffsetDateTime | The earliest delivery moment a record may carry. Records of attempts still on their way have no delivery  moment yet and fall outside any bound set here.
val deliveryTo : java.time.OffsetDateTime = 2024-01-15T10:30:00Z // java.time.OffsetDateTime | The latest delivery moment a record may carry. All the filters combine with AND, so it narrows whatever the  other ones already kept.
val hookUri : kotlin.String = https://example.com/webhook // kotlin.String | The subscription target address, matched in full rather than as a prefix. Filtering by `configId` is the  reliable way to pick one subscription, since several may share an address.
val configId : kotlin.Int = 1 // kotlin.Int | The subscription whose deliveries are kept, by the `id` that `GET api/2.0/settings/webhook` reports.
val eventId : kotlin.Int = 1 // kotlin.Int | A single delivery record, by its own identifier. It narrows the answer to that one record, which is how a  client follows up a retry it queued earlier.
val groupStatus : WebhookGroupStatus = NotSent // WebhookGroupStatus | The classes of answered status to keep, as a bitmask; 0 keeps every record whatever the target answered.
val userId : java.util.UUID = {} // java.util.UUID | The member whose subscriptions the records belong to, by portal user ID - who created the subscription, not  who caused the event. For a caller who is not a DocSpace administrator it is overwritten with the caller own  ID, so such a caller never sees another member deliveries whatever is sent here.
val trigger : WebhookTrigger = 0 // WebhookTrigger | The single event kind to keep; 0 keeps every kind. It names one trigger rather than a mask of several, unlike  the `triggers` a subscription is created with.
val count : kotlin.Int = 1 // kotlin.Int | How many records one page may hold. The maximum is also the default, so a client that wants shorter pages has  to ask for them; the number of records matching the filter comes back as `total` beside the page.
val startIndex : kotlin.Int = 1 // kotlin.Int | How many matching records to skip before the page begins, counting from the newest. Advance it by `count` to  walk back through the log.

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

Removes one webhook subscription from the current portal for good, addressed by `id` in the path. Deliveries  stop with it: matching events are no longer queued, and there is no undo, so a subscription dropped by mistake  has to be created again with `POST api/2.0/settings/webhook`, which gives it a new identifier and needs a new  secret key. To pause deliveries without losing the configuration, switch the subscription off with  `PUT api/2.0/settings/webhook/enable` instead. A `DocSpaceAdmin` may remove any subscription in the portal,  anyone else only the ones they created, and a `Guest` may not use webhooks at all. The response repeats the  subscription as it was just before the removal, so the caller can record what disappeared, again without the  secret key. An identifier that no longer exists gives 404, which is what a second removal of the same  subscription answers as well, so a repeated call is harmless but reports the state truthfully rather than  pretending to succeed.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found. | |

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
val id : kotlin.Int = 1 // kotlin.Int | The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found.

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

Sends one past webhook delivery again. The `id` in the path is that of a delivery record from  `GET api/2.0/settings/webhooks/log`, not of a subscription, and the payload kept in that record is sent once  more to the subscription it belongs to. The work is asynchronous: a fresh delivery record is created and  queued at once, and the response describes that new record, with an identifier of its own and with `status`  and `delivery` not filled in yet. To learn the outcome, read `GET api/2.0/settings/webhooks/log` with  `eventId` set to the returned identifier until `delivery` appears. The original record stays as it is, and  every call queues one more attempt, so this is not safe to repeat blindly. A `DocSpaceAdmin` may retry any  delivery in the portal, anyone else only deliveries of the subscriptions they created, and a `Guest` is  refused. An `id` of 0 is rejected as an invalid request and an unknown one gives 404. The operation is rate  limited, so a burst of calls is answered with 429; to retry several records use  `PUT api/2.0/settings/webhook/retry`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/retry-webhook/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found. | |

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
val id : kotlin.Int = 1 // kotlin.Int | The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found.

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

Sends a batch of past webhook deliveries again. `ids` holds the identifiers of delivery records from  `GET api/2.0/settings/webhooks/log`; each of them is sent once more to the subscription it belongs to as a  fresh delivery record, queued for asynchronous delivery, and the response lists those new records with  `status` and `delivery` not filled in yet. Records that do not exist, and records of another member's  subscription when the caller is not a `DocSpaceAdmin`, are skipped in silence instead of failing the call, so  a response shorter than `ids` is the only sign that something was left out: compare the counts rather than  assuming everything was queued. An empty `ids` list is accepted and queues nothing. Read the outcomes from  `GET api/2.0/settings/webhooks/log`, matching the returned identifiers with `eventId`. Every call queues  another round of attempts, and the original records stay as they are. A `Guest` is refused. The operation is  rate limited, so a burst of calls is answered with 429. For a single record  `PUT api/2.0/settings/webhook/{id}/retry` reports a missing or forbidden record instead of skipping it.

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

Replaces the stored parameters of one webhook subscription, which is addressed by `id` in the body rather than  in the path. Every field of the request overwrites the stored one, so a payload that leaves out `enabled`,  `ssl`, `triggers` or `targetId` resets them to off, all events and no target: read the current values with  `GET api/2.0/settings/webhook` first and send back whatever should stay. `secretKey` is the one exception, an  empty value keeping the existing secret and a new one having to satisfy the portal password rules. The new  target is validated exactly as on creation, that is it must sit outside the installation's own network and  answer a HEAD request, and trigger flags the caller's role may not use are rejected. That validation runs  before the subscription is looked up, so an unusable payload is refused with 400 even when no subscription  with this `id` exists. A `DocSpaceAdmin` may update any subscription in the portal, anyone else only their  own, and a `Guest` is refused. Sending the same payload twice leaves the same state. Use  `PUT api/2.0/settings/webhook/enable` to switch a subscription on or off without touching anything else.

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

