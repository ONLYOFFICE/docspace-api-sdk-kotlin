# AuditTrailDataApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAuditTrailReport**](SecurityAuditTrailDataApi.md#createAuditTrailReport) | **POST** api/2.0/security/audit/events/report | Start audit trail report |
| [**getAuditEventsByFilter**](SecurityAuditTrailDataApi.md#getAuditEventsByFilter) | **GET** api/2.0/security/audit/events/filter | Get filtered audit events |
| [**getAuditSettings**](SecurityAuditTrailDataApi.md#getAuditSettings) | **GET** api/2.0/security/audit/settings/lifetime | Get audit lifetime settings |
| [**getAuditTrailMappers**](SecurityAuditTrailDataApi.md#getAuditTrailMappers) | **GET** api/2.0/security/audit/mappers | Get audit trail mappers |
| [**getAuditTrailReport**](SecurityAuditTrailDataApi.md#getAuditTrailReport) | **GET** api/2.0/security/audit/events/report | Get audit trail report status |
| [**getAuditTrailTypes**](SecurityAuditTrailDataApi.md#getAuditTrailTypes) | **GET** api/2.0/security/audit/types | Get audit trail types |
| [**getLastAuditEvents**](SecurityAuditTrailDataApi.md#getLastAuditEvents) | **GET** api/2.0/security/audit/events/last | Get recent audit events |
| [**setAuditSettings**](SecurityAuditTrailDataApi.md#setAuditSettings) | **POST** api/2.0/security/audit/settings/lifetime | Set audit lifetime settings |
| [**terminateAuditTrailReport**](SecurityAuditTrailDataApi.md#terminateAuditTrailReport) | **DELETE** api/2.0/security/audit/events/report | Terminate audit trail report |



<a id="createAuditTrailReport"></a>
# **createAuditTrailReport**
> DocumentBuilderTaskWrapper createAuditTrailReport (AuditReportFormat format)

Queues a report of the portal's audit trail and returns the state of the background job that builds it. The  report covers the period reaching from now back by the audit trail lifetime that  `GET api/2.0/security/audit/settings/lifetime` reports and is never filtered: the query parameters of  `GET api/2.0/security/audit/events/filter` do not apply here. The caller needs the portal-settings right of a  DocSpace administrator plus the audit option of the portal's pricing plan, otherwise the call is answered with  402. The file is not ready when the response arrives - poll `GET api/2.0/security/audit/events/report` until  `isCompleted` is true, then take `resultFileUrl`, and treat a non-empty `error` as a failed build. The  finished file is saved to the caller's My documents section, as an XLSX workbook by default or as CSV when  `format=Csv`, in which case `resultFileId` stays empty and only the name and the URL identify it. One job runs  per caller and kind: calling again while the previous one is still building returns that job instead of  starting a second, and `DELETE api/2.0/security/audit/events/report` cancels it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**AuditReportFormat**](.md)| The format the report file is written in. The workbook format is the default and is the only one that leaves  the finished file addressable by ID: a report asked for as CSV comes back with an empty `resultFileId`, so it  can only be reached through `resultFileName` and `resultFileUrl`. | [optional] [enum: 0, 1] |

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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
val format : AuditReportFormat = Xlsx // AuditReportFormat | The format the report file is written in. The workbook format is the default and is the only one that leaves  the finished file addressable by ID: a report asked for as CSV comes back with an empty `resultFileId`, so it  can only be reached through `resultFileName` and `resultFileUrl`.

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.createAuditTrailReport(format)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditEventsByFilter"></a>
# **getAuditEventsByFilter**
> AuditEventArrayWrapper getAuditEventsByFilter (java.util.UUID userId, LocationType moduleType, ActionType actionType, MessageAction action, EntryType entryType, kotlin.String target, java.time.OffsetDateTime from, java.time.OffsetDateTime to, kotlin.Int count, kotlin.Int startIndex)

Returns the portal's audit events that match the filters in the query - by the user who acted, the module the  action belongs to, the action and its type, the entity type and target, and the period - and is the operation  behind the audit trail page. The caller needs the portal-settings right of a DocSpace administrator plus the  audit option of the portal's pricing plan; when that option is missing the filters are silently ignored and  the answer is the same twenty most recent events that `GET api/2.0/security/audit/events/last` returns, and  when the login history and audit trail section is disabled altogether the call is answered with 402. Take the  values accepted by `action`, `actionType`, `moduleType` and `entryType` from  `GET api/2.0/security/audit/types`, and the tree they belong to from `GET api/2.0/security/audit/mappers`. A  non-default `action` matches only that action and, combined with `target`, only its exact value; it also  stops `moduleType` and `actionType` from narrowing the result, so combine `target` with `entryType` instead of  `action` when filtering by target without pinning a single action. `from` and `to` are read as UTC instants  while `date` comes back in the portal time zone, `count` defaults to 100 and cannot exceed it, and the filters  are applied before the page window, so a full page means there may be more matching events beyond it. The  operation is read-only.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-events-by-filter/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **java.util.UUID**| The user who performed the action, given by portal user ID. Leave it at the empty GUID to keep the events of  every user. | [optional] |
| **moduleType** | [**LocationType**](.md)| The module the recorded action belongs to, spelled as `GET api/2.0/security/audit/types` lists it under  `moduleTypes`. `GET api/2.0/security/audit/mappers` shows which module records which action. The default  value keeps every module. | [optional] [enum: 0, 1, 2, 3, 27, 29, 30, 31] |
| **actionType** | [**ActionType**](.md)| The kind of change the action made, spelled as `GET api/2.0/security/audit/types` lists it under  `actionTypes`. The default value keeps every kind. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19] |
| **action** | [**MessageAction**](.md)| The exact action recorded, spelled as the `messageAction` of `GET api/2.0/security/audit/mappers`. Naming  one narrows the answer to that single action and overrides `moduleType` and `actionType`, which stop  narrowing anything once it is set. | [optional] [enum: 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 4000, 4001, 4002, 4003, 4004, 4005, 4006, 4007, 4008, 4009, 4010, 4011, 4012, 4013, 4014, 4015, 4016, 4017, 4018, 4019, 4020, 4021, 4022, 4023, 4024, 4025, 4026, 4027, 4028, 4029, 4030, 4031, 4032, 4033, 4034, 4035, 4036, 4037, 5000, 5001, 5002, 5003, 5004, 5005, 5006, 5007, 5008, 5009, 5010, 5011, 5012, 5013, 5014, 5015, 5016, 5017, 5018, 5019, 5020, 5021, 5022, 5023, 5024, 5025, 5026, 5027, 5028, 5029, 5030, 5031, 5032, 5033, 5034, 5035, 5036, 5037, 5038, 5039, 5040, 5041, 5042, 5043, 5044, 5045, 5046, 5047, 5048, 5049, 5050, 5053, 5054, 5055, 5056, 5057, 5058, 5059, 5060, 5061, 5062, 5063, 5064, 5065, 5066, 5068, 5069, 5070, 5071, 5072, 5073, 5074, 5075, 5076, 5077, 5078, 5079, 5080, 5081, 5082, 5083, 5084, 5085, 5086, 5087, 5088, 5089, 5090, 5091, 5092, 5093, 5094, 5095, 5096, 5097, 5098, 5099, 5100, 5101, 5102, 5103, 5104, 5105, 5106, 5107, 5108, 5109, 5110, 5111, 5112, 5113, 5114, 5115, 5116, 5117, 5118, 5119, 5120, 5121, 5122, 5123, 5124, 5125, 5126, 5127, 5128, 5129, 5130, 5131, 5132, 5133, 5150, 5151, 5152, 5153, 5154, 5155, 5156, 5157, 5158, 5159, 5160, 5161, 5162, 5163, 5201, 5202, 5203, 5204, 5205, 5206, 5207, 5501, 5502, 5503, 6000, 6001, 6002, 6003, 6004, 6005, 6006, 6007, 6008, 6009, 6010, 6011, 6012, 6013, 6014, 6015, 6016, 6017, 6018, 6019, 6020, 6021, 6022, 6023, 6024, 6025, 6026, 6027, 6028, 6029, 6030, 6031, 6032, 6033, 6034, 6035, 6036, 6037, 6038, 6039, 6040, 6041, 6042, 6043, 6044, 6045, 6046, 6047, 6048, 6049, 6050, 6051, 6052, 6053, 6054, 6055, 6056, 6057, 6058, 6059, 6060, 6061, 6062, 6063, 6064, 6065, 6066, 6067, 6068, 6069, 6070, 6071, 6072, 6073, 6074, 6075, 6076, 6077, 6078, 6079, 6080, 6081, 6082, 6083, 6084, 6085, 6086, 6087, 6088, 6089, 6090, 6091, 6092, 6093, 6094, 6095, 6096, 6097, 6098, 6099, 6100, 6101, 6102, 6103, 6104, 6105, 6106, 6107, 6108, 6109, 7000, 7001, 7002, 7003, 7004, 7005, 9901, 9902, 9903, 9904, 9905, 9906, 9907, 9908, 9909, -1] |
| **entryType** | [**EntryType**](.md)| The kind of object the action was performed on, spelled as `GET api/2.0/security/audit/types` lists it under  `entryTypes`. Pair it with `target` to filter by object without pinning a single action. | [optional] [enum: 0, 1, 2, 23, 24, 25, 26, 27] |
| **target** | **kotlin.String**| The object the action was performed on, as the audit trail recorded it - a file name, a user account, a room  title. It is matched in full and exactly as stored, so it narrows the answer only when `action` or  `entryType` is set as well. | [optional] |
| **from** | **java.time.OffsetDateTime**| The earliest moment an event may have been recorded at, read as a UTC instant. The `date` of the events that  come back is in the portal time zone instead, so the two do not line up on a portal that is not on UTC. | [optional] |
| **to** | **java.time.OffsetDateTime**| The latest moment an event may have been recorded at, read as a UTC instant in the same way as `from`. | [optional] |
| **count** | **kotlin.Int**| How many events one page may hold. The maximum is also the default, so a client that wants shorter pages has  to ask for them; a full page means there may be further matches beyond it. | [optional] |
| **startIndex** | **kotlin.Int**| How many matching events to skip before the page begins, counting from the newest. Advance it by `count` to  walk backwards through the trail. | [optional] |

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
val userId : java.util.UUID = 00000000-0000-0000-0000-000000000001 // java.util.UUID | The user who performed the action, given by portal user ID. Leave it at the empty GUID to keep the events of  every user.
val moduleType : LocationType = Files // LocationType | The module the recorded action belongs to, spelled as `GET api/2.0/security/audit/types` lists it under  `moduleTypes`. `GET api/2.0/security/audit/mappers` shows which module records which action. The default  value keeps every module.
val actionType : ActionType = Create // ActionType | The kind of change the action made, spelled as `GET api/2.0/security/audit/types` lists it under  `actionTypes`. The default value keeps every kind.
val action : MessageAction = FileCreated // MessageAction | The exact action recorded, spelled as the `messageAction` of `GET api/2.0/security/audit/mappers`. Naming  one narrows the answer to that single action and overrides `moduleType` and `actionType`, which stop  narrowing anything once it is set.
val entryType : EntryType = File // EntryType | The kind of object the action was performed on, spelled as `GET api/2.0/security/audit/types` lists it under  `entryTypes`. Pair it with `target` to filter by object without pinning a single action.
val target : kotlin.String = document.docx // kotlin.String | The object the action was performed on, as the audit trail recorded it - a file name, a user account, a room  title. It is matched in full and exactly as stored, so it narrows the answer only when `action` or  `entryType` is set as well.
val from : java.time.OffsetDateTime = 2024-01-01T00:00:00Z // java.time.OffsetDateTime | The earliest moment an event may have been recorded at, read as a UTC instant. The `date` of the events that  come back is in the portal time zone instead, so the two do not line up on a portal that is not on UTC.
val to : java.time.OffsetDateTime = 2024-01-31T23:59:59Z // java.time.OffsetDateTime | The latest moment an event may have been recorded at, read as a UTC instant in the same way as `from`.
val count : kotlin.Int = 100 // kotlin.Int | How many events one page may hold. The maximum is also the default, so a client that wants shorter pages has  to ask for them; a full page means there may be further matches beyond it.
val startIndex : kotlin.Int = 0 // kotlin.Int | How many matching events to skip before the page begins, counting from the newest. Advance it by `count` to  walk backwards through the trail.

launch(Dispatchers.IO) {
    val result : AuditEventArrayWrapper = webService.getAuditEventsByFilter(userId, moduleType, actionType, action, entryType, target, from, to, count, startIndex)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditSettings"></a>
# **getAuditSettings**
> TenantAuditSettingsResponseWrapper getAuditSettings ()

Returns how long this portal keeps its two security logs: `loginHistoryLifeTime` for login events and  `auditTrailLifeTime` for audit events, both counted in days, together with `lastModified`, the moment the pair  was last saved. The caller needs the portal-settings right of a DocSpace administrator, and in a cloud  installation the login history and audit trail section must be enabled for the portal, otherwise the call is  answered with 402; the audit option of the pricing plan is not required to read the values. Both numbers lie  between 1 and 180 days, and a portal that never changed them reports the default of 180. They define the  window the rest of the audit operations work in: `GET api/2.0/security/audit/events/last` looks exactly this  far back, and the reports started by `POST api/2.0/security/audit/login/report` and  `POST api/2.0/security/audit/events/report` cover exactly this period. The operation is read-only; change the  values with `POST api/2.0/security/audit/settings/lifetime`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantAuditSettingsResponseWrapper**](TenantAuditSettingsResponseWrapper.md)

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

launch(Dispatchers.IO) {
    val result : TenantAuditSettingsResponseWrapper = webService.getAuditSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditTrailMappers"></a>
# **getAuditTrailMappers**
> AuditTrailProductMapperArrayWrapper getAuditTrailMappers (ProductType productType, LocationType moduleType)

Returns the audit vocabulary as the tree it really is: every product, the modules inside it, and for each  module the actions it can record together with the type of change and the entity each of them applies to. Pass  `productType` to keep a single product and `moduleType` to keep a single module inside the products that  remain; omit both to get the whole tree. The caller needs the portal-settings right of a DocSpace  administrator; the audit option of the pricing plan is not required, and the call is read-only and safe to  repeat. Each action carries `messageAction`, the name to send as the `action` filter of  `GET api/2.0/security/audit/events/filter`, next to `actionType` and `entity`, the values its `actionType` and  `entryType` filters accept - this is where a caller learns which action belongs to which module instead of  guessing. A filter that matches nothing yields an empty list rather than an error. Use  `GET api/2.0/security/audit/types` for the flat lists of the same names.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productType** | [**ProductType**](.md)| The product to keep, spelled as `GET api/2.0/security/audit/types` lists it under `productTypes`. Omitting  it keeps every product; a value no product matches yields an empty list rather than an error. | [optional] [enum: 2, 3, 7, 8] |
| **moduleType** | [**LocationType**](.md)| The module to keep inside the products that survive `productType`, spelled as  `GET api/2.0/security/audit/types` lists it under `moduleTypes`. Omitting it keeps every module of those  products. | [optional] [enum: 0, 1, 2, 3, 27, 29, 30, 31] |

### Return type

[**AuditTrailProductMapperArrayWrapper**](AuditTrailProductMapperArrayWrapper.md)

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
val productType : ProductType = Documents // ProductType | The product to keep, spelled as `GET api/2.0/security/audit/types` lists it under `productTypes`. Omitting  it keeps every product; a value no product matches yields an empty list rather than an error.
val moduleType : LocationType = Files // LocationType | The module to keep inside the products that survive `productType`, spelled as  `GET api/2.0/security/audit/types` lists it under `moduleTypes`. Omitting it keeps every module of those  products.

launch(Dispatchers.IO) {
    val result : AuditTrailProductMapperArrayWrapper = webService.getAuditTrailMappers(productType, moduleType)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditTrailReport"></a>
# **getAuditTrailReport**
> DocumentBuilderTaskWrapper getAuditTrailReport ()

Returns the state of the audit trail report the calling user has started, and is the operation to poll after  `POST api/2.0/security/audit/events/report`. The caller needs the portal-settings right of a DocSpace  administrator plus the audit option of the portal's pricing plan, otherwise the call is answered with 402.  Jobs are kept per user and per report kind: this operation never shows another administrator's report, nor the  login history report, which has its own status at `GET api/2.0/security/audit/login/report`. The answer is  empty when no report of this kind is known for the caller; otherwise `percentage` grows towards 100,  `isCompleted` turns true when the build has ended, `error` carries the failure message when it ended badly,  and `resultFileName` and `resultFileUrl` point at the file saved to the caller's My documents section, while  `resultFileId` is filled for an XLSX report only. The operation is read-only and safe to poll every few  seconds; a finished job is dropped as soon as the next report of this kind is started.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-report/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.getAuditTrailReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAuditTrailTypes"></a>
# **getAuditTrailTypes**
> AuditTrailTypesWrapper getAuditTrailTypes ()

Returns the vocabularies the audit filters are built from: `actions` lists every action the portal can record,  `actionTypes` the kinds of change they stand for, `productTypes` the products they belong to, `moduleTypes`  the locations inside those products, and `entryTypes` the kinds of entity an action can be applied to. The  caller needs the portal-settings right of a DocSpace administrator; the audit option of the pricing plan is  not required, so the lists can be read on any portal. The operation is read-only, takes no parameters and  depends on nothing else. Every value is the name to send in the matching query parameter of  `GET api/2.0/security/audit/events/filter` or `GET api/2.0/security/audit/login/filter`, so read this  operation once and reuse the answer instead of guessing spellings. The response is an untyped object holding  those five arrays of names, and it changes only with the portal version. Use  `GET api/2.0/security/audit/mappers` when the relations between products, modules and actions are needed  rather than the flat lists.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditTrailTypesWrapper**](AuditTrailTypesWrapper.md)

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

launch(Dispatchers.IO) {
    val result : AuditTrailTypesWrapper = webService.getAuditTrailTypes()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getLastAuditEvents"></a>
# **getLastAuditEvents**
> AuditEventArrayWrapper getLastAuditEvents ()

Returns the twenty most recent audit events of the portal - the creations, changes, deletions, sharing and  settings updates its members made - as the short summary a settings page shows before anyone asks for the full  trail. The caller needs the portal-settings right of a DocSpace administrator, and in a cloud installation the  login history and audit trail section must be enabled for the portal, otherwise the call is answered with 402.  The operation is read-only and takes no parameters: it looks back exactly as far as the audit trail lifetime  that `GET api/2.0/security/audit/settings/lifetime` reports, returns at most twenty events ordered newest  first, and cannot be filtered. `date` is given in the portal time zone, `actionText` is the readable sentence  describing the event with every substituted value shortened to fifty characters here, and `target` names the  entity the action was applied to. An empty list means nothing was recorded inside that period. Use  `GET api/2.0/security/audit/events/filter` to filter by user, module, action or period.

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

launch(Dispatchers.IO) {
    val result : AuditEventArrayWrapper = webService.getLastAuditEvents()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setAuditSettings"></a>
# **setAuditSettings**
> TenantAuditSettingsResponseWrapper setAuditSettings (TenantAuditSettingsWrapper tenantAuditSettingsWrapper)

Sets how long this portal keeps its login history and its audit trail, in days, and returns the pair as it was  stored. The caller needs the portal-settings right of a DocSpace administrator plus the audit option of the  portal's pricing plan, otherwise the call is answered with 402. Send both numbers inside `settings`: each has  to be between 1 and 180 days, and a value outside that range is refused with 400 without either number being  saved, so read the current pair from `GET api/2.0/security/audit/settings/lifetime` and resend the one that  should stay as it is. The call replaces the stored settings rather than merging them, is idempotent, and takes  effect at once: the period covered by `GET api/2.0/security/audit/events/last` and by both audit reports  shrinks or grows with it, and events older than the new lifetime stop being reported. The change is itself  recorded in the audit trail.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantAuditSettingsWrapper** | [**TenantAuditSettingsWrapper**](TenantAuditSettingsWrapper.md)|  | [optional] |

### Return type

[**TenantAuditSettingsResponseWrapper**](TenantAuditSettingsResponseWrapper.md)

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

launch(Dispatchers.IO) {
    val result : TenantAuditSettingsResponseWrapper = webService.setAuditSettings(tenantAuditSettingsWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateAuditTrailReport"></a>
# **terminateAuditTrailReport**
> void terminateAuditTrailReport ()

Cancels the audit trail report the calling user has running and drops it from the build queue. The caller  needs the portal-settings right of a DocSpace administrator plus the audit option of the portal's pricing  plan, otherwise the call is answered with 402. Cancellation is handed to the same background service that  builds the report, so a successful answer means the request was accepted rather than that the job has already  stopped: poll `GET api/2.0/security/audit/events/report` to watch it disappear. The operation returns no  content and touches only the caller's own audit trail report - the login history report is cancelled by  `DELETE api/2.0/security/audit/login/report`, and no report of another user can be reached from here. It is  idempotent: cancelling when nothing is running is not an error. A job stopped before it finished writing  leaves nothing in My documents, and a report cancelled by mistake has to be built again with  `POST api/2.0/security/audit/events/report`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-audit-trail-report/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(AuditTrailDataApi::class.java)

launch(Dispatchers.IO) {
    webService.terminateAuditTrailReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

