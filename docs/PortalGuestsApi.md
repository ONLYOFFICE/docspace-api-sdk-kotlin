# GuestsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGuestSharingLink**](PortalGuestsApi.md#getGuestSharingLink) | **GET** api/2.0/people/guests/{userid}/share | Get a guest sharing link |



<a id="getGuestSharingLink"></a>
# **getGuestSharingLink**
> StringWrapper getGuestSharingLink (java.util.UUID userid)

Returns a link to share a guest with another user.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-guest-sharing-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The user ID. | |

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
val webService = apiClient.createWebservice(GuestsApi::class.java)
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The user ID.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getGuestSharingLink(userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

