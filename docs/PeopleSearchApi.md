# SearchApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAccountsEntriesWithFilesShared**](PeopleSearchApi.md#getAccountsEntriesWithFilesShared) | **GET** api/2.0/accounts/file/{id}/search | Get account entries with file sharing settings |
| [**getAccountsEntriesWithFoldersShared**](PeopleSearchApi.md#getAccountsEntriesWithFoldersShared) | **GET** api/2.0/accounts/folder/{id}/search | Get account entries with folder sharing settings |
| [**getAccountsEntriesWithRoomsShared**](PeopleSearchApi.md#getAccountsEntriesWithRoomsShared) | **GET** api/2.0/accounts/room/{id}/search | Get account entries |
| [**getSearch**](PeopleSearchApi.md#getSearch) | **GET** api/2.0/people/@search/{query} | Search users |
| [**getSimpleByFilter**](PeopleSearchApi.md#getSimpleByFilter) | **GET** api/2.0/people/simple/filter | Search users by extended filter |
| [**getUsersWithFilesShared**](PeopleSearchApi.md#getUsersWithFilesShared) | **GET** api/2.0/people/file/{id} | Get users with file sharing settings |
| [**getUsersWithFoldersShared**](PeopleSearchApi.md#getUsersWithFoldersShared) | **GET** api/2.0/people/folder/{id} | Get users with folder sharing settings |
| [**getUsersWithRoomShared**](PeopleSearchApi.md#getUsersWithRoomShared) | **GET** api/2.0/people/room/{id} | Get users with room sharing settings |
| [**searchUsersByExtendedFilter**](PeopleSearchApi.md#searchUsersByExtendedFilter) | **GET** api/2.0/people/filter | Search users with detailed information by extended filter |
| [**searchUsersByQuery**](PeopleSearchApi.md#searchUsersByQuery) | **GET** api/2.0/people/search | Search users (using query parameters) |
| [**searchUsersByStatus**](PeopleSearchApi.md#searchUsersByStatus) | **GET** api/2.0/people/status/{status}/search | Search users by status filter |



<a id="getAccountsEntriesWithFilesShared"></a>
# **getAccountsEntriesWithFilesShared**
> ObjectArrayWrapper getAccountsEntriesWithFilesShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the account entries with their sharing settings for a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-files-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **kotlin.Int**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for the query results. | [optional] |
| **filterSeparator** | **kotlin.String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **kotlin.String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the account sharing settings from the response.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the account sharing settings in the response.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user is invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The area of the account entries.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1, 2] // kotlin.collections.List<EmployeeType> | The list of the user types.
val count : kotlin.Int = 25 // kotlin.Int | The number of items to retrieve in a request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index for the query results.
val filterSeparator : kotlin.String = , // kotlin.String | Specifies the separator used in filter expressions.
val filterValue : kotlin.String = John // kotlin.String | The text filter applied to the accounts search query.

launch(Dispatchers.IO) {
    val result : ObjectArrayWrapper = webService.getAccountsEntriesWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAccountsEntriesWithFoldersShared"></a>
# **getAccountsEntriesWithFoldersShared**
> ObjectArrayWrapper getAccountsEntriesWithFoldersShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the account entries with their sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-folders-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **kotlin.Int**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for the query results. | [optional] |
| **filterSeparator** | **kotlin.String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **kotlin.String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the account sharing settings from the response.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the account sharing settings in the response.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user is invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The area of the account entries.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1, 2] // kotlin.collections.List<EmployeeType> | The list of the user types.
val count : kotlin.Int = 25 // kotlin.Int | The number of items to retrieve in a request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index for the query results.
val filterSeparator : kotlin.String = , // kotlin.String | Specifies the separator used in filter expressions.
val filterValue : kotlin.String = John // kotlin.String | The text filter applied to the accounts search query.

launch(Dispatchers.IO) {
    val result : ObjectArrayWrapper = webService.getAccountsEntriesWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAccountsEntriesWithRoomsShared"></a>
# **getAccountsEntriesWithRoomsShared**
> ObjectArrayWrapper getAccountsEntriesWithRoomsShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the account entries with their sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounts-entries-with-rooms-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the account sharing settings from the response. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the account sharing settings in the response. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The area of the account entries. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of the user types. | [optional] |
| **count** | **kotlin.Int**| The number of items to retrieve in a request. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for the query results. | [optional] |
| **filterSeparator** | **kotlin.String**| Specifies the separator used in filter expressions. | [optional] |
| **filterValue** | **kotlin.String**| The text filter applied to the accounts search query. | [optional] |

### Return type

[**ObjectArrayWrapper**](ObjectArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the account sharing settings from the response.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the account sharing settings in the response.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user is invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The area of the account entries.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1,2] // kotlin.collections.List<EmployeeType> | The list of the user types.
val count : kotlin.Int = 25 // kotlin.Int | The number of items to retrieve in a request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The starting index for the query results.
val filterSeparator : kotlin.String = , // kotlin.String | Specifies the separator used in filter expressions.
val filterValue : kotlin.String = John // kotlin.String | The text filter applied to the accounts search query.

launch(Dispatchers.IO) {
    val result : ObjectArrayWrapper = webService.getAccountsEntriesWithRoomsShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSearch"></a>
# **getSearch**
> EmployeeFullArrayWrapper getSearch (kotlin.String query, kotlin.String filterBy, kotlin.String filterValue)

Returns a list of users matching the search query.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-search/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| The search query. | |
| **filterBy** | **kotlin.String**| Specifies a filter criteria for the user search query. | [optional] |
| **filterValue** | **kotlin.String**| The value used for filtering users, allowing additional constraints for the query. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val query : kotlin.String = John // kotlin.String | The search query.
val filterBy : kotlin.String = displayName // kotlin.String | Specifies a filter criteria for the user search query.
val filterValue : kotlin.String = John // kotlin.String | The value used for filtering users, allowing additional constraints for the query.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.getSearch(query, filterBy, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSimpleByFilter"></a>
# **getSimpleByFilter**
> EmployeeArrayWrapper getSimpleByFilter (EmployeeStatus employeeStatus, java.util.UUID groupId, EmployeeActivationStatus activationStatus, EmployeeType employeeType, kotlin.collections.List<kotlin.Int> employeeTypes, kotlin.Boolean isAdministrator, Payments payments, AccountLoginType accountLoginType, QuotaFilter quotaFilter, kotlin.Boolean withoutGroup, kotlin.Boolean excludeGroup, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterSeparator, kotlin.String filterValue)

Returns a list of users matching the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-simple-by-filter/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **java.util.UUID**| The group ID. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| The user type. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| The list of user types. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **kotlin.Boolean**| Specifies if the user is an administrator or not. | [optional] |
| **payments** | [**Payments**](.md)| The user payment status. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| The account login type. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| The quota filter (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **kotlin.Boolean**| Specifies whether the user should be a member of a group or not. | [optional] |
| **excludeGroup** | **kotlin.Boolean**| Specifies whether the user should be a member of the group with the specified ID. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The filter area. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to be retrieved in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to be retrieved in a filtered result set. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **kotlin.String**| Represents the separator used to split filter criteria in query parameters. | [optional] |
| **filterValue** | **kotlin.String**| The search text used to filter results based on user input. | [optional] |

### Return type

[**EmployeeArrayWrapper**](EmployeeArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val groupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The group ID.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val employeeType : EmployeeType = 1 // EmployeeType | The user type.
val employeeTypes : kotlin.collections.List<kotlin.Int> = [1, 2] // kotlin.collections.List<kotlin.Int> | The list of user types.
val isAdministrator : kotlin.Boolean = false // kotlin.Boolean | Specifies if the user is an administrator or not.
val payments : Payments = 0 // Payments | The user payment status.
val accountLoginType : AccountLoginType = 0 // AccountLoginType | The account login type.
val quotaFilter : QuotaFilter = 0 // QuotaFilter | The quota filter (All - 0, Default - 1, Custom - 2).
val withoutGroup : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user should be a member of a group or not.
val excludeGroup : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user should be a member of the group with the specified ID.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user is invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The filter area.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to be retrieved in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to be retrieved in a filtered result set.
val sortBy : kotlin.String = displayName // kotlin.String | Specifies the property or field name by which the results should be sorted.
val sortOrder : SortOrder = 0 // SortOrder | The order in which the results are sorted.
val filterSeparator : kotlin.String = , // kotlin.String | Represents the separator used to split filter criteria in query parameters.
val filterValue : kotlin.String = John // kotlin.String | The search text used to filter results based on user input.

launch(Dispatchers.IO) {
    val result : EmployeeArrayWrapper = webService.getSimpleByFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUsersWithFilesShared"></a>
# **getUsersWithFilesShared**
> EmployeeFullArrayWrapper getUsersWithFilesShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the users with the sharing settings in a file with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-files-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **kotlin.Int**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **kotlin.String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **kotlin.String**| The filter text value used for searching or filtering user results. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the user sharing settings or not.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the user sharing settings or not.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user was invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The user area.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1, 2] // kotlin.collections.List<EmployeeType> | The list of user types.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of users to be retrieved in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first record to retrieve in a paged query.
val filterSeparator : kotlin.String = , // kotlin.String | The character or string used to separate multiple filter values in a filtering query.
val filterValue : kotlin.String = John // kotlin.String | The filter text value used for searching or filtering user results.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.getUsersWithFilesShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUsersWithFoldersShared"></a>
# **getUsersWithFoldersShared**
> EmployeeFullArrayWrapper getUsersWithFoldersShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the users with the sharing settings in a folder with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-folders-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **kotlin.Int**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **kotlin.String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **kotlin.String**| The filter text value used for searching or filtering user results. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the user sharing settings or not.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the user sharing settings or not.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user was invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The user area.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1, 2] // kotlin.collections.List<EmployeeType> | The list of user types.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of users to be retrieved in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first record to retrieve in a paged query.
val filterSeparator : kotlin.String = , // kotlin.String | The character or string used to separate multiple filter values in a filtering query.
val filterValue : kotlin.String = John // kotlin.String | The filter text value used for searching or filtering user results.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.getUsersWithFoldersShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getUsersWithRoomShared"></a>
# **getUsersWithRoomShared**
> EmployeeFullArrayWrapper getUsersWithRoomShared (kotlin.Int id, EmployeeStatus employeeStatus, EmployeeActivationStatus activationStatus, kotlin.Boolean excludeShared, kotlin.Boolean includeShared, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.collections.List<EmployeeType> employeeTypes, kotlin.Int count, kotlin.Int startIndex, kotlin.String filterSeparator, kotlin.String filterValue)

Returns the users with the sharing settings in a room with the ID specified in request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-users-with-room-shared/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| The user ID. | |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **excludeShared** | **kotlin.Boolean**| Specifies whether to exclude the user sharing settings or not. | [optional] |
| **includeShared** | **kotlin.Boolean**| Specifies whether to include the user sharing settings or not. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user was invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The user area. | [optional] [enum: 0, 1, 2] |
| **employeeTypes** | [**kotlin.collections.List&lt;EmployeeType&gt;**](EmployeeType.md)| The list of user types. | [optional] |
| **count** | **kotlin.Int**| The maximum number of users to be retrieved in the request. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first record to retrieve in a paged query. | [optional] |
| **filterSeparator** | **kotlin.String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| **filterValue** | **kotlin.String**| The filter text value used for searching or filtering user results. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val id : kotlin.Int = 00000000-0000-0000-0000-000000000000 // kotlin.Int | The user ID.
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val excludeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to exclude the user sharing settings or not.
val includeShared : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include the user sharing settings or not.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user was invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The user area.
val employeeTypes : kotlin.collections.List<EmployeeType> = [1, 2] // kotlin.collections.List<EmployeeType> | The list of user types.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of users to be retrieved in the request.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first record to retrieve in a paged query.
val filterSeparator : kotlin.String = , // kotlin.String | The character or string used to separate multiple filter values in a filtering query.
val filterValue : kotlin.String = John // kotlin.String | The filter text value used for searching or filtering user results.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.getUsersWithRoomShared(id, employeeStatus, activationStatus, excludeShared, includeShared, invitedByMe, inviterId, area, employeeTypes, count, startIndex, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="searchUsersByExtendedFilter"></a>
# **searchUsersByExtendedFilter**
> EmployeeFullArrayWrapper searchUsersByExtendedFilter (EmployeeStatus employeeStatus, java.util.UUID groupId, EmployeeActivationStatus activationStatus, EmployeeType employeeType, kotlin.collections.List<kotlin.Int> employeeTypes, kotlin.Boolean isAdministrator, Payments payments, AccountLoginType accountLoginType, QuotaFilter quotaFilter, kotlin.Boolean withoutGroup, kotlin.Boolean excludeGroup, kotlin.Boolean invitedByMe, java.util.UUID inviterId, Area area, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterSeparator, kotlin.String filterValue)

Returns a list of users with full information about them matching the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-extended-filter/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeStatus** | [**EmployeeStatus**](.md)| The user status. | [optional] [enum: 1, 2, 4, 5, 7] |
| **groupId** | **java.util.UUID**| The group ID. | [optional] |
| **activationStatus** | [**EmployeeActivationStatus**](.md)| The user activation status. | [optional] [enum: 0, 1, 2, 4] |
| **employeeType** | [**EmployeeType**](.md)| The user type. | [optional] [enum: All, RoomAdmin, Guest, DocSpaceAdmin, User] |
| **employeeTypes** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| The list of user types. | [optional] [enum: 0, 1, 2, 3, 4] |
| **isAdministrator** | **kotlin.Boolean**| Specifies if the user is an administrator or not. | [optional] |
| **payments** | [**Payments**](.md)| The user payment status. | [optional] [enum: 0, 1] |
| **accountLoginType** | [**AccountLoginType**](.md)| The account login type. | [optional] [enum: 0, 1, 2] |
| **quotaFilter** | [**QuotaFilter**](.md)| The quota filter (All - 0, Default - 1, Custom - 2). | [optional] [enum: 0, 1, 2] |
| **withoutGroup** | **kotlin.Boolean**| Specifies whether the user should be a member of a group or not. | [optional] |
| **excludeGroup** | **kotlin.Boolean**| Specifies whether the user should be a member of the group with the specified ID. | [optional] |
| **invitedByMe** | **kotlin.Boolean**| Specifies whether the user is invited by the current user or not. | [optional] |
| **inviterId** | **java.util.UUID**| The inviter ID. | [optional] |
| **area** | [**Area**](.md)| The filter area. | [optional] [enum: 0, 1, 2] |
| **count** | **kotlin.Int**| The maximum number of items to be retrieved in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to be retrieved in a filtered result set. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **kotlin.String**| Represents the separator used to split filter criteria in query parameters. | [optional] |
| **filterValue** | **kotlin.String**| The search text used to filter results based on user input. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val employeeStatus : EmployeeStatus = 1 // EmployeeStatus | The user status.
val groupId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The group ID.
val activationStatus : EmployeeActivationStatus = 1 // EmployeeActivationStatus | The user activation status.
val employeeType : EmployeeType = 1 // EmployeeType | The user type.
val employeeTypes : kotlin.collections.List<kotlin.Int> = [1,2] // kotlin.collections.List<kotlin.Int> | The list of user types.
val isAdministrator : kotlin.Boolean = false // kotlin.Boolean | Specifies if the user is an administrator or not.
val payments : Payments = 0 // Payments | The user payment status.
val accountLoginType : AccountLoginType = 0 // AccountLoginType | The account login type.
val quotaFilter : QuotaFilter = 0 // QuotaFilter | The quota filter (All - 0, Default - 1, Custom - 2).
val withoutGroup : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user should be a member of a group or not.
val excludeGroup : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user should be a member of the group with the specified ID.
val invitedByMe : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the user is invited by the current user or not.
val inviterId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The inviter ID.
val area : Area = 0 // Area | The filter area.
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to be retrieved in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to be retrieved in a filtered result set.
val sortBy : kotlin.String = displayName // kotlin.String | Specifies the property or field name by which the results should be sorted.
val sortOrder : SortOrder = 0 // SortOrder | The order in which the results are sorted.
val filterSeparator : kotlin.String = , // kotlin.String | Represents the separator used to split filter criteria in query parameters.
val filterValue : kotlin.String = John // kotlin.String | The search text used to filter results based on user input.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.searchUsersByExtendedFilter(employeeStatus, groupId, activationStatus, employeeType, employeeTypes, isAdministrator, payments, accountLoginType, quotaFilter, withoutGroup, excludeGroup, invitedByMe, inviterId, area, count, startIndex, sortBy, sortOrder, filterSeparator, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="searchUsersByQuery"></a>
# **searchUsersByQuery**
> EmployeeArrayWrapper searchUsersByQuery (kotlin.String query)

Returns a list of users matching the search query. This method uses the query parameters.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-query/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **kotlin.String**| The search query. | [optional] |

### Return type

[**EmployeeArrayWrapper**](EmployeeArrayWrapper.md)

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val query : kotlin.String = John // kotlin.String | The search query.

launch(Dispatchers.IO) {
    val result : EmployeeArrayWrapper = webService.searchUsersByQuery(query)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="searchUsersByStatus"></a>
# **searchUsersByStatus**
> EmployeeFullArrayWrapper searchUsersByStatus (EmployeeStatus status, kotlin.String query, kotlin.String filterBy, kotlin.String filterValue)

Returns a list of users matching the status filter and search query.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/search-users-by-status/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**EmployeeStatus**](.md)| The user status. | [enum: 1, 2, 4, 5, 7] |
| **query** | **kotlin.String**| The advanced search query. | [optional] |
| **filterBy** | **kotlin.String**| Specifies the criteria used to filter search results in advanced queries. | [optional] |
| **filterValue** | **kotlin.String**| The value used to filter the search query. | [optional] |

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
val webService = apiClient.createWebservice(SearchApi::class.java)
val status : EmployeeStatus = 1 // EmployeeStatus | The user status.
val query : kotlin.String = John // kotlin.String | The advanced search query.
val filterBy : kotlin.String = displayName // kotlin.String | Specifies the criteria used to filter search results in advanced queries.
val filterValue : kotlin.String = John // kotlin.String | The value used to filter the search query.

launch(Dispatchers.IO) {
    val result : EmployeeFullArrayWrapper = webService.searchUsersByStatus(status, query, filterBy, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

