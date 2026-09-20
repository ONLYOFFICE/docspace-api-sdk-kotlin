# GuestsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**approveGuestShareLink**](PeopleGuestsApi.md#approveGuestShareLink) | **POST** api/2.0/people/guests/share/approve | Approve a guest sharing link |
| [**deleteGuests**](PeopleGuestsApi.md#deleteGuests) | **DELETE** api/2.0/people/guests | Remove guest relations |



<a id="approveGuestShareLink"></a>
# **approveGuestShareLink**
> EmployeeFullWrapper approveGuestShareLink (EmailMemberRequestDto emailMemberRequestDto)

Accepts a guest that another member shared, which links that guest to the calling account and makes it  visible in the caller's list of guests.  Everything the operation needs comes from the confirmation token of the link produced by  `GET api/2.0/people/guests/{userid}/share`: the request body is not read at all, so there is nothing to fill  in, and an expired or already used token is answered with 401.  The caller has to be a room admin or a DocSpace admin; a member or a guest gets 403.  The account the token names has to exist and still be a guest, otherwise the operation answers 404 or 400.  The call is idempotent: a guest that is already linked to the caller is simply returned again.  The answer is the full profile of the guest.

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

Removes the listed guests from the caller's own list of guests and withdraws the access the caller had  granted them.  It does not delete the accounts: each guest keeps its profile and any access other members gave it, and only  the link to the caller and the caller's own shares disappear.  The caller has to be a room admin or a DocSpace admin, and every listed account has to exist, be an active  guest and be one of the caller's own guests - a single entry that is not rejects the whole call with 403 and  changes nothing.  The call returns no body; read `GET api/2.0/people/filter` with `area` set to `Guests` to see what is left.  To delete a guest account for good, disable it and then use `DELETE api/2.0/people/{userid}`.

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
 - **Accept**: application/json

