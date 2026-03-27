# GuestsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**approveGuestShareLink**](PeopleGuestsApi.md#approveGuestShareLink) | **POST** api/2.0/people/guests/share/approve | Approve a guest sharing link |
| [**deleteGuests**](PeopleGuestsApi.md#deleteGuests) | **DELETE** api/2.0/people/guests | Delete guests |



<a id="approveGuestShareLink"></a>
# **approveGuestShareLink**
> EmployeeFullWrapper approveGuestShareLink (EmailMemberRequestDto emailMemberRequestDto)

Approves a guest sharing link and returns the detailed information about a guest.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/approve-guest-share-link/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailMemberRequestDto** | [**EmailMemberRequestDto**](EmailMemberRequestDto.md)|  | [optional] |

### Return type

[**EmployeeFullWrapper**](EmployeeFullWrapper.md)

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
val emailMemberRequestDto : EmailMemberRequestDto =  // EmailMemberRequestDto | 

launch(Dispatchers.IO) {
    val result : EmployeeFullWrapper = webService.approveGuestShareLink(emailMemberRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteGuests"></a>
# **deleteGuests**
> void deleteGuests (UpdateMembersRequestDto updateMembersRequestDto)

Deletes guests from the list and excludes them from rooms to which they were invited.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-guests/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(GuestsApi::class.java)
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | 

launch(Dispatchers.IO) {
    webService.deleteGuests(updateMembersRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

