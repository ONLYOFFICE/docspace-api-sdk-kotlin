# GroupApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addGroup**](GroupApi.md#addGroup) | **POST** api/2.0/group | Add a new group |
| [**addMembersTo**](GroupApi.md#addMembersTo) | **PUT** api/2.0/group/{id}/members | Add group members |
| [**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** api/2.0/group/{id} | Delete a group |
| [**getGroup**](GroupApi.md#getGroup) | **GET** api/2.0/group/{id} | Get a group |
| [**getGroupByUserId**](GroupApi.md#getGroupByUserId) | **GET** api/2.0/group/user/{userid} | Get user groups |
| [**getGroups**](GroupApi.md#getGroups) | **GET** api/2.0/group | Get groups |
| [**moveMembersTo**](GroupApi.md#moveMembersTo) | **PUT** api/2.0/group/{fromId}/members/{toId} | Move group members |
| [**removeMembersFrom**](GroupApi.md#removeMembersFrom) | **DELETE** api/2.0/group/{id}/members | Remove group members |
| [**setGroupManager**](GroupApi.md#setGroupManager) | **PUT** api/2.0/group/{id}/manager | Set a group manager |
| [**setMembersTo**](GroupApi.md#setMembersTo) | **POST** api/2.0/group/{id}/members | Replace group members |
| [**updateGroup**](GroupApi.md#updateGroup) | **PUT** api/2.0/group/{id} | Update a group |



<a id="addGroup"></a>
# **addGroup**
> GroupWrapper addGroup (GroupRequestDto groupRequestDto)

Adds a new group with the group manager, name, and members specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupRequestDto** | [**GroupRequestDto**](GroupRequestDto.md)|  | [optional] |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val groupRequestDto : GroupRequestDto =  // GroupRequestDto | 

val result : GroupWrapper = webService.addGroup(groupRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="addMembersTo"></a>
# **addMembersTo**
> GroupWrapper addMembersTo (java.util.UUID id, MembersRequest membersRequest)

Adds new group members to the group with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The member request. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val membersRequest : MembersRequest =  // MembersRequest | The member request.

val result : GroupWrapper = webService.addMembersTo(id, membersRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteGroup"></a>
# **deleteGroup**
> NoContentResultWrapper deleteGroup (java.util.UUID id)

Deletes a group with the ID specified in the request from the list of groups on the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The group ID. | |

### Return type

[**NoContentResultWrapper**](NoContentResultWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.

val result : NoContentResultWrapper = webService.deleteGroup(id)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroup"></a>
# **getGroup**
> GroupWrapper getGroup (java.util.UUID id, kotlin.Boolean includeMembers)

Returns the detailed information about the selected group.   **Note**: This method returns full group information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeMembers** | **kotlin.Boolean**| Specifies whether to include the group members or not. | [optional] |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include the group members or not.

val result : GroupWrapper = webService.getGroup(id, includeMembers)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupByUserId"></a>
# **getGroupByUserId**
> GroupSummaryArrayWrapper getGroupByUserId (java.util.UUID userid)

Returns a list of groups for the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The user ID. | |

### Return type

[**GroupSummaryArrayWrapper**](GroupSummaryArrayWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val userid : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID.

val result : GroupSummaryArrayWrapper = webService.getGroupByUserId(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroups"></a>
# **getGroups**
> GroupArrayWrapper getGroups (java.util.UUID userId, kotlin.Boolean manager, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the general information about all the groups, such as group ID and group manager.   **Note**: This method returns partial group information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/).

### Parameters
| **userId** | **java.util.UUID**| The user ID. | [optional] |
| **manager** | **kotlin.Boolean**| Specifies if the user is a manager or not. | [optional] |
| **count** | **kotlin.Int**| The number of records to retrieve. | [optional] |
| **startIndex** | **kotlin.Int**| The starting index for paginated results. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the property used to sort the query results. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text used for filtering or searching group data. | [optional] |

### Return type

[**GroupArrayWrapper**](GroupArrayWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val userId : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The user ID.
val manager : kotlin.Boolean = true // kotlin.Boolean | Specifies if the user is a manager or not.
val count : kotlin.Int = 1234 // kotlin.Int | The number of records to retrieve.
val startIndex : kotlin.Int = 1234 // kotlin.Int | The starting index for paginated results.
val sortBy : kotlin.String = some text // kotlin.String | Specifies the property used to sort the query results.
val sortOrder : SortOrder =  // SortOrder | The order in which the results are sorted.
val filterValue : kotlin.String = some text // kotlin.String | The text used for filtering or searching group data.

val result : GroupArrayWrapper = webService.getGroups(userId, manager, count, startIndex, sortBy, sortOrder, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="moveMembersTo"></a>
# **moveMembersTo**
> GroupWrapper moveMembersTo (java.util.UUID fromId, java.util.UUID toId)

Moves all the members from the selected group to another one specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/).

### Parameters
| **fromId** | **java.util.UUID**| The group ID to move from. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toId** | **java.util.UUID**| The group ID to move to. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val fromId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The group ID to move from.
val toId : java.util.UUID = 75a5f745-f697-4418-b38d-0fe0d277e258 // java.util.UUID | The group ID to move to.

val result : GroupWrapper = webService.moveMembersTo(fromId, toId)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeMembersFrom"></a>
# **removeMembersFrom**
> GroupWrapper removeMembersFrom (java.util.UUID id, MembersRequest membersRequest)

Removes the group members specified in the request from the selected group.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The member request. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val membersRequest : MembersRequest =  // MembersRequest | The member request.

val result : GroupWrapper = webService.removeMembersFrom(id, membersRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setGroupManager"></a>
# **setGroupManager**
> GroupWrapper setGroupManager (java.util.UUID id, SetManagerRequest setManagerRequest)

Sets a user with the ID specified in the request as a group manager.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setManagerRequest** | [**SetManagerRequest**](SetManagerRequest.md)| The request for setting a group manager. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val setManagerRequest : SetManagerRequest =  // SetManagerRequest | The request for setting a group manager.

val result : GroupWrapper = webService.setGroupManager(id, setManagerRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setMembersTo"></a>
# **setMembersTo**
> GroupWrapper setMembersTo (java.util.UUID id, MembersRequest membersRequest)

Replaces the group members with those specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The member request. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val membersRequest : MembersRequest =  // MembersRequest | The member request.

val result : GroupWrapper = webService.setMembersTo(id, membersRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateGroup"></a>
# **updateGroup**
> GroupWrapper updateGroup (java.util.UUID id, UpdateGroupRequest updateGroupRequest)

Updates the existing group changing the group manager, name, and/or members.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/).

### Parameters
| **id** | **java.util.UUID**| The group ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateGroupRequest** | [**UpdateGroupRequest**](UpdateGroupRequest.md)| The request for updating a group. | |

### Return type

[**GroupWrapper**](GroupWrapper.md)

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = aae1e103-bca5-9fa1-ba8c-42058b4abf28 // java.util.UUID | The group ID.
val updateGroupRequest : UpdateGroupRequest =  // UpdateGroupRequest | The request for updating a group.

val result : GroupWrapper = webService.updateGroup(id, updateGroupRequest)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

