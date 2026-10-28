# StatisticsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSpaceUsageStatistics**](SettingsStatisticsApi.md#getSpaceUsageStatistics) | **GET** api/2.0/settings/statistics/spaceusage/{id} | Get the space usage statistics |



<a id="getSpaceUsageStatistics"></a>
# **getSpaceUsageStatistics**
> UsageSpaceStatItemArrayWrapper getSpaceUsageStatistics (java.util.UUID id)

Returns the storage space used by one portal module, broken down per data category the module tracks (for  example per room type), together with a human-readable size and whether the category is disabled. Requires  Owner or DocSpaceAdmin (the EditPortalSettings permission). `id` identifies the module by the same GUID the  portal's module catalog uses; a module that does not exist, or one that does not report space usage at all,  returns an empty list rather than an error. This is a read-only, idempotent call, and the list is not  paginated. Sizes are already formatted as display strings (for example `1.5 GB`), not raw byte counts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-space-usage-statistics/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found. | |

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
val id : java.util.UUID = 1 // java.util.UUID | The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found.

launch(Dispatchers.IO) {
    val result : UsageSpaceStatItemArrayWrapper = webService.getSpaceUsageStatistics(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

