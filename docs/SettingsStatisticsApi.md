# StatisticsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSpaceUsageStatistics**](SettingsStatisticsApi.md#getSpaceUsageStatistics) | **GET** api/2.0/settings/statistics/spaceusage/{id} | Get the space usage statistics |



<a id="getSpaceUsageStatistics"></a>
# **getSpaceUsageStatistics**
> UsageSpaceStatItemArrayWrapper getSpaceUsageStatistics (java.util.UUID id)

Returns the space usage statistics for the module with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-space-usage-statistics/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID extracted from the route parameters. | |

### Return type

[**UsageSpaceStatItemArrayWrapper**](UsageSpaceStatItemArrayWrapper.md)

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
val webService = apiClient.createWebservice(StatisticsApi::class.java)
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The ID extracted from the route parameters.

val result : UsageSpaceStatItemArrayWrapper = webService.getSpaceUsageStatistics(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

