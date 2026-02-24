# AuditTrailDataApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAuditTrailReport**](SecurityAuditTrailDataApi.md#createAuditTrailReport) | **POST** api/2.0/security/audit/events/report | Generate the audit trail report |
| [**getAuditEventsByFilter**](SecurityAuditTrailDataApi.md#getAuditEventsByFilter) | **GET** api/2.0/security/audit/events/filter | Get filtered audit trail data |
| [**getAuditSettings**](SecurityAuditTrailDataApi.md#getAuditSettings) | **GET** api/2.0/security/audit/settings/lifetime | Get the audit trail settings |
| [**getAuditTrailMappers**](SecurityAuditTrailDataApi.md#getAuditTrailMappers) | **GET** api/2.0/security/audit/mappers | Get audit trail mappers |
| [**getAuditTrailTypes**](SecurityAuditTrailDataApi.md#getAuditTrailTypes) | **GET** api/2.0/security/audit/types | Get audit trail types |
| [**getLastAuditEvents**](SecurityAuditTrailDataApi.md#getLastAuditEvents) | **GET** api/2.0/security/audit/events/last | Get audit trail data |
| [**setAuditSettings**](SecurityAuditTrailDataApi.md#setAuditSettings) | **POST** api/2.0/security/audit/settings/lifetime | Set the audit trail settings |



<a id="createAuditTrailReport"></a>
# **createAuditTrailReport**
> StringWrapper createAuditTrailReport ()

Generates the audit trail report.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)

val result : StringWrapper = webService.createAuditTrailReport()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditEventsByFilter"></a>
# **getAuditEventsByFilter**
> AuditEventArrayWrapper getAuditEventsByFilter (java.util.UUID userId, LocationType moduleType, ActionType actionType, MessageAction action, EntryType entryType, kotlin.String target, ApiDateTime from, ApiDateTime to, kotlin.Int count, kotlin.Int startIndex)

Returns a list of the audit events by the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-events-by-filter/).

### Parameters
| **userId** | **java.util.UUID**| The ID of the user who triggered the audit event. | [optional] |
| **moduleType** | [**LocationType**](.md)| The location where the audit event occurred. | [optional] [enum: 0, 1, 2, 3, 27, 29, 30, 31] |
| **actionType** | [**ActionType**](.md)| The type of action performed in the audit event (e.g., Create, Update, Delete). | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19] |
| **action** | [**MessageAction**](.md)| The specific action that occurred within the audit event. | [optional] [enum: 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 4000, 4001, 4002, 4003, 4004, 4005, 4006, 4007, 4008, 4009, 4010, 4011, 4012, 4013, 4014, 4015, 4016, 4017, 4018, 4019, 4020, 4021, 4022, 4023, 4024, 4025, 4026, 4027, 4028, 4029, 4030, 4031, 4032, 4033, 4034, 4035, 4036, 4037, 5000, 5001, 5002, 5003, 5004, 5005, 5006, 5007, 5008, 5009, 5010, 5011, 5012, 5013, 5014, 5015, 5016, 5017, 5018, 5019, 5020, 5021, 5022, 5023, 5024, 5025, 5026, 5027, 5028, 5029, 5030, 5031, 5032, 5033, 5034, 5035, 5036, 5037, 5038, 5039, 5040, 5041, 5042, 5043, 5044, 5045, 5046, 5047, 5048, 5049, 5050, 5051, 5052, 5053, 5054, 5055, 5056, 5057, 5058, 5059, 5060, 5061, 5062, 5063, 5064, 5065, 5066, 5068, 5069, 5070, 5071, 5072, 5073, 5074, 5075, 5076, 5077, 5078, 5079, 5080, 5081, 5082, 5083, 5084, 5085, 5086, 5087, 5088, 5089, 5090, 5091, 5092, 5093, 5094, 5095, 5096, 5097, 5098, 5099, 5100, 5101, 5102, 5103, 5104, 5105, 5106, 5107, 5108, 5109, 5110, 5111, 5112, 5113, 5114, 5115, 5116, 5117, 5118, 5119, 5120, 5121, 5122, 5123, 5124, 5125, 5126, 5127, 5128, 5129, 5130, 5131, 5132, 5133, 5150, 5151, 5152, 5153, 5154, 5155, 5156, 5157, 5158, 5159, 5160, 5201, 5202, 5203, 5204, 5501, 5502, 5503, 6000, 6001, 6002, 6003, 6004, 6005, 6006, 6007, 6008, 6009, 6010, 6011, 6012, 6013, 6014, 6015, 6016, 6017, 6018, 6019, 6020, 6021, 6022, 6023, 6024, 6025, 6026, 6027, 6028, 6029, 6030, 6031, 6032, 6033, 6034, 6035, 6036, 6037, 6038, 6039, 6040, 6041, 6042, 6043, 6044, 6045, 6046, 6047, 6048, 6049, 6050, 6051, 6052, 6053, 6054, 6055, 6056, 6057, 6058, 6059, 6060, 6061, 6062, 6063, 6064, 6065, 6066, 6067, 6068, 6069, 6070, 6071, 6072, 6073, 6074, 6075, 6076, 6077, 6078, 6079, 6080, 6081, 6082, 6083, 6084, 6085, 6086, 6087, 6088, 6089, 6090, 6091, 6092, 6093, 6094, 6095, 6096, 7000, 7001, 7002, 7003, 7004, 9901, 9902, 9903, 9904, 9905, 9906, 9907, 9908, 9909, -1] |
| **entryType** | [**EntryType**](.md)| The type of audit entry (e.g., Folder, User, File). | [optional] [enum: 0, 1, 2, 23, 24, 25, 26, 27] |
| **target** | **kotlin.String**| The target object affected by the audit event (e.g., document ID, user account). | [optional] |
| **from** | [**ApiDateTime**](.md)| The starting date and time for filtering audit events. | [optional] |
| **to** | [**ApiDateTime**](.md)| The ending date and time for filtering audit events. | [optional] |
| **count** | **kotlin.Int**| The maximum number of audit event records to retrieve. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startIndex** | **kotlin.Int**| The index of the first audit event record to retrieve in a paged query. | [optional] |

### Return type

[**AuditEventArrayWrapper**](AuditEventArrayWrapper.md)

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)
val userId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the user who triggered the audit event.
val moduleType : LocationType =  // LocationType | The location where the audit event occurred.
val actionType : ActionType =  // ActionType | The type of action performed in the audit event (e.g., Create, Update, Delete).
val action : MessageAction =  // MessageAction | The specific action that occurred within the audit event.
val entryType : EntryType =  // EntryType | The type of audit entry (e.g., Folder, User, File).
val target : kotlin.String = some text // kotlin.String | The target object affected by the audit event (e.g., document ID, user account).
val from : ApiDateTime =  // ApiDateTime | The starting date and time for filtering audit events.
val to : ApiDateTime =  // ApiDateTime | The ending date and time for filtering audit events.
val count : kotlin.Int = 1234 // kotlin.Int | The maximum number of audit event records to retrieve.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The index of the first audit event record to retrieve in a paged query.

val result : AuditEventArrayWrapper = webService.getAuditEventsByFilter(userId, moduleType, actionType, action, entryType, target, from, to, count, startIndex)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditSettings"></a>
# **getAuditSettings**
> TenantAuditSettingsWrapper getAuditSettings ()

Returns the audit trail settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantAuditSettingsWrapper**](TenantAuditSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)

val result : TenantAuditSettingsWrapper = webService.getAuditSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditTrailMappers"></a>
# **getAuditTrailMappers**
> ObjectWrapper getAuditTrailMappers (ProductType productType, LocationType moduleType)

Returns the mappers for the audit trail types.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/).

### Parameters
| **productType** | [**ProductType**](.md)| The type of product related to the audit trail. | [optional] [enum: 2, 3, 7, 8] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **moduleType** | [**LocationType**](.md)| The location associated with the audit trail. | [optional] [enum: 0, 1, 2, 3, 27, 29, 30, 31] |

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)
val productType : ProductType =  // ProductType | The type of product related to the audit trail.
val moduleType : LocationType =  // LocationType | The location associated with the audit trail.

val result : ObjectWrapper = webService.getAuditTrailMappers(productType, moduleType)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditTrailTypes"></a>
# **getAuditTrailTypes**
> ObjectWrapper getAuditTrailTypes ()

Returns all the available audit trail types.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

### Authorization

No authorization required

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)

val result : ObjectWrapper = webService.getAuditTrailTypes()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getLastAuditEvents"></a>
# **getLastAuditEvents**
> AuditEventArrayWrapper getLastAuditEvents ()

Returns a list of the latest changes (creation, modification, deletion, etc.) made by users to the entities on the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-audit-events/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditEventArrayWrapper**](AuditEventArrayWrapper.md)

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)

val result : AuditEventArrayWrapper = webService.getLastAuditEvents()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setAuditSettings"></a>
# **setAuditSettings**
> TenantAuditSettingsWrapper setAuditSettings (TenantAuditSettingsWrapper tenantAuditSettingsWrapper)

Sets the audit trail settings for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantAuditSettingsWrapper** | [**TenantAuditSettingsWrapper**](TenantAuditSettingsWrapper.md)|  | [optional] |

### Return type

[**TenantAuditSettingsWrapper**](TenantAuditSettingsWrapper.md)

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)
val tenantAuditSettingsWrapper : TenantAuditSettingsWrapper =  // TenantAuditSettingsWrapper | 

val result : TenantAuditSettingsWrapper = webService.setAuditSettings(tenantAuditSettingsWrapper)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

