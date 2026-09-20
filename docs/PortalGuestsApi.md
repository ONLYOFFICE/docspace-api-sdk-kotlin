# GuestsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGuestSharingLink**](PortalGuestsApi.md#getGuestSharingLink) | **GET** api/2.0/people/guests/{userid}/share | Get a guest sharing link |



<a id="getGuestSharingLink"></a>
# **getGuestSharingLink**
> StringWrapper getGuestSharingLink (java.util.UUID userid)

Builds a link that lets another member of the portal take over the caller's guest, so that the guest becomes  visible to them as well.  The account in the route has to exist and be a guest - any other type is rejected with 400 - and the caller  has to be able to see it and must not be a guest itself.  The call is read-only: it only mints the link and changes nothing, and it can be repeated as often as needed.  The answer is a shortened confirmation URL as plain text; hand it to the person who should get the guest, and  their client completes the hand-over with `POST api/2.0/people/guests/share/approve`.  The link carries a confirmation token and therefore expires, so mint it when it is about to be used rather  than storing it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-guest-sharing-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The ID of the guest to be handed over, taken from the route. The account has to exist, has to be a guest, and  has to be one the caller can see. | |

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
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the guest to be handed over, taken from the route. The account has to exist, has to be a guest, and  has to be one the caller can see.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getGuestSharingLink(userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

