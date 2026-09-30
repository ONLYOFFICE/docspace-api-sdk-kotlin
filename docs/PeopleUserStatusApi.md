# UserStatusApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getByStatus**](PeopleUserStatusApi.md#getByStatus) | **GET** api/2.0/people/status/{status} | Get profiles by status |
| [**updateUserActivationStatus**](PeopleUserStatusApi.md#updateUserActivationStatus) | **PUT** api/2.0/people/activationstatus/{activationstatus} | Set my activation status |
| [**updateUserStatus**](PeopleUserStatusApi.md#updateUserStatus) | **PUT** api/2.0/people/status/{status} | Change a user status |



<a id="getByStatus"></a>
# **getByStatus**
> EmployeeFullArrayWrapper getByStatus (EmployeeStatus status, kotlin.String filterBy, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterSeparator, kotlin.String filterValue)

Returns a page of the accounts that are in one particular state - the status is taken from the route - with  the full profile of each of them.  The caller has to be a room admin, a DocSpace admin or a People module admin; a member or a guest gets 403.  The call is read-only, paged by `count` and `startIndex`, ordered by `sortBy` and `sortOrder`, and reports  the number of matches in the total count of the response.  Narrow it with `filterValue` on the name and the email; setting `filterBy` to `group` makes the same  `filterValue` the ID of the group to keep the members of, and because the value is then applied as the text  filter as well, that combination normally matches nothing - use `GET api/2.0/people/filter` with `groupId`  to filter by group.  `GET api/2.0/people` is the same operation fixed to the `Active` status.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-by-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**EmployeeStatus**](.md)| The account state to list, taken from the route: `Active` for working accounts, `Terminated` for disabled  ones, `Pending` for open invitations, or `All` for every state. | [enum: 1, 2, 4, 5, 7] |
| **filterBy** | **kotlin.String**| The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response. | [optional] |
| **sortBy** | **kotlin.String**| What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The direction of the ordering: `Ascending`, which is the default, or `Descending`. | [optional] [enum: 0, 1] |
| **filterSeparator** | **kotlin.String**| The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match. | [optional] |
| **filterValue** | **kotlin.String**| The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter. | [optional] |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val status : EmployeeStatus = Active // EmployeeStatus | The account state to list, taken from the route: `Active` for working accounts, `Terminated` for disabled  ones, `Pending` for open invitations, or `All` for every state.
val filterBy : kotlin.String = group // kotlin.String | The only recognised value is `group`, which makes `filterValue` the ID of the group to keep the members of.  Any other value, and omitting the field, applies no group filter.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matches to skip before the page starts. It defaults to 0, and the total number of matches is  reported in the total count of the response.
val sortBy : kotlin.String = DisplayName // kotlin.String | What to order the accounts by, compared without regard to case: `FirstName`, `LastName`, `DisplayName`,  `Type`, `Email`, `Department`, `UsedSpace`, `CreatedBy` or `RegistrationDate`.
val sortOrder : SortOrder = Ascending // SortOrder | The direction of the ordering: `Ascending`, which is the default, or `Descending`.
val filterSeparator : kotlin.String = , // kotlin.String | The character that splits `filterValue` into several terms, of which any one may match. Omit it to split  the value on spaces instead, in which case every term has to match.
val filterValue : kotlin.String = John // kotlin.String | The text to match against the name and the email of the account, case-insensitively. Omit it to apply no  text filter.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.getByStatus(status, filterBy, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="updateUserActivationStatus"></a>
# **updateUserActivationStatus**
> EmployeeFullArrayWrapper updateUserActivationStatus (EmployeeActivationStatus activationstatus, UpdateMembersRequestDto updateMembersRequestDto)

Sets the activation state of the calling account, which is how a person finishes confirming their email  address after following the link they were sent.  The request has to carry the confirmation token from that link rather than an ordinary session, and the  account must be allowed to edit its own profile.  Despite taking a list, it accepts exactly one ID and that ID has to be the calling account: an empty list,  more than one entry, or somebody else's ID is answered with 400, so it cannot be used to activate other  people.  Setting `Activated` on the portal owner sends the administrator welcome email, once per portal.  The change raises a `UserUpdated` webhook, and the answer holds the profile in its new state - or nothing at  all when the account has meanwhile disappeared, which is skipped without an error.  The account status is a different thing and is changed through `PUT api/2.0/people/status/{status}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-activation-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activationstatus** | [**EmployeeActivationStatus**](.md)| The activation state to set on the calling account, taken from the route: `NotActivated`, `Activated`,  `Pending` or `AutoGenerated`. | [enum: 0, 1, 2, 4] |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)| The account to change. Only `userIds` is read, it has to hold exactly one entry, and that entry has to be the  calling account; `resendAll` is ignored here. | |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val activationstatus : EmployeeActivationStatus = Activated // EmployeeActivationStatus | The activation state to set on the calling account, taken from the route: `NotActivated`, `Activated`,  `Pending` or `AutoGenerated`.
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | The account to change. Only `userIds` is read, it has to hold exactly one entry, and that entry has to be the  calling account; `resendAll` is ignored here.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.updateUserActivationStatus(activationstatus, updateMembersRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateUserStatus"></a>
# **updateUserStatus**
> EmployeeFullArrayWrapper updateUserStatus (EmployeeStatus status, UpdateMembersRequestDto updateMembersRequestDto)

Enables or disables several portal accounts at once, which is the way to suspend somebody without deleting  them and to bring them back later.  Only `Active` and `Terminated` are accepted in the route; any other status answers 400.  The caller needs the permission to edit users, and the whole list is checked before anything is applied: a  system account, an LDAP account, the portal owner, the caller themselves, or - unless the caller is the  portal owner - a DocSpace administrator rejects the entire call with 403 and changes nothing.  Disabling ends every session of the account and takes its seat back, while enabling takes a seat again and  can therefore answer 402 when the tariff or the user quota has none left; the accounts are then processed one  by one, so a quota failure partway through leaves the earlier ones enabled.  Enabling only affects accounts that were disabled, and an account that had never filled in its name comes  back as `Pending` rather than `Active` when it still has an unused invitation, so read the `status` in the  answer instead of assuming it matches the request.  Each changed account raises a `UserUpdated` webhook, and disabling is what  `DELETE api/2.0/people/{userid}` requires before it will delete an account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-user-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**EmployeeStatus**](.md)| The state to put the listed accounts into, taken from the route. Only `Active`, which enables an account,  and `Terminated`, which disables it, are accepted; any other value is rejected with 400. | [enum: 1, 2, 4, 5, 7] |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)| The accounts to enable or disable. Only `userIds` is read by this operation; `resendAll` belongs to the  invitation operations and is ignored here. | |

### Return type

[**EmployeeFullArrayWrapper**](EmployeeFullArrayWrapper.md)

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
val webService = apiClient.createWebservice(UserStatusApi::class.java)
val status : EmployeeStatus = Active // EmployeeStatus | The state to put the listed accounts into, taken from the route. Only `Active`, which enables an account,  and `Terminated`, which disables it, are accepted; any other value is rejected with 400.
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | The accounts to enable or disable. Only `userIds` is read by this operation; `resendAll` belongs to the  invitation operations and is ignored here.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.updateUserStatus(status, updateMembersRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

