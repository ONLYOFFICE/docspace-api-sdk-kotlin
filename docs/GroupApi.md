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

Creates a group with the given name and, optionally, a manager and a first set of members.  The caller needs the permissions to edit groups and to add and remove users.  The name is required and cannot be blank, and unlike the operations that add members later, this one checks  every listed account upfront and rejects the whole call with 400 if any of them is unusable - a guest, a  disabled account or an ID that matches nobody.  The call is not idempotent: names are not unique, so repeating it creates a second group with the same name.  Creating a group raises a `GroupCreated` webhook, and the answer holds the new group with its members  included.  Members can be changed afterwards through `PUT api/2.0/group/{id}` or the dedicated member operations.

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

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.addGroup(groupRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="addMembersTo"></a>
# **addMembersTo**
> GroupWrapper addMembersTo (java.util.UUID id, MembersRequest membersRequest)

Adds the listed accounts to a group, keeping the members it already has.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Accounts that cannot be group members - a guest, a disabled account or an ID that matches nobody - are  silently skipped instead of failing the call, so compare the members in the answer with what was sent to see  what was actually applied.  The call is idempotent for an account that is already a member, and it does not change who manages the group;  use `PUT api/2.0/group/{id}/manager` for that.  The answer is the group with its members after the addition.  To replace the whole list instead of extending it, use `POST api/2.0/group/{id}/members`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-members-to/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. | |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The accounts to add, replace with, or remove. | |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
val membersRequest : MembersRequest =  // MembersRequest | The accounts to add, replace with, or remove.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.addMembersTo(id, membersRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="deleteGroup"></a>
# **deleteGroup**
> void deleteGroup (java.util.UUID id)

Deletes a group and withdraws the access it had been granted to rooms, folders and files.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The removal is permanent and cannot be undone, and it affects sharing: everything that was shared with the  group loses that share, so members who had access only through this group lose it too.  The accounts themselves are kept - only their membership disappears.  The call answers 204 with no body and raises a `GroupDeleted` webhook; a second call with the same ID answers  404 rather than succeeding again.  To empty a group without deleting it, move its members away with  `PUT api/2.0/group/{fromId}/members/{toId}` or remove them through `DELETE api/2.0/group/{id}/members`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group to delete, taken from the route. It has to be a group that has not been deleted already,  otherwise the operation answers 404. | |

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
val webService = apiClient.createWebservice(GroupApi::class.java)
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group to delete, taken from the route. It has to be a group that has not been deleted already,  otherwise the operation answers 404.

launch(Dispatchers.IO) {
    webService.deleteGroup(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroup"></a>
# **getGroup**
> GroupWrapper getGroup (java.util.UUID id, kotlin.Boolean includeMembers)

Returns one group by its ID, with its name, its manager and - when asked for - the accounts that belong to  it.  The caller needs the permission to read groups, and the ID has to belong to a group that has not been  deleted, otherwise the operation answers 404.  The call is read-only, and the member list is left out unless `includeMembers` is set to true, so ask for it  only when the members are actually needed.  Use `GET api/2.0/group` to look a group up by name or to page through them all.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group to read, taken from the route. It has to be a group that has not been deleted, otherwise  the operation answers 404. | |
| **includeMembers** | **kotlin.Boolean**| Whether to fill in the member list of the group. It defaults to true, so set it to false when only the name  and the manager are needed and the group may be large. | [optional] |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group to read, taken from the route. It has to be a group that has not been deleted, otherwise  the operation answers 404.
val includeMembers : kotlin.Boolean = true // kotlin.Boolean | Whether to fill in the member list of the group. It defaults to true, so set it to false when only the name  and the manager are needed and the group may be large.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.getGroup(id, includeMembers)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroupByUserId"></a>
# **getGroupByUserId**
> GroupSummaryArrayWrapper getGroupByUserId (java.util.UUID userid)

Returns every group the account with the ID in the route belongs to, as a flat list of ID and name pairs.  The caller needs the permission to read groups.  The call is read-only, is not paged, and answers an empty list both for an account that belongs to no group  and for an ID that matches no account, so an empty answer does not prove the account exists.  The entries are summaries and carry neither the manager nor the members - read `GET api/2.0/group/{id}` for  the full picture of one of them.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-group-by-user-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **java.util.UUID**| The ID of the account whose groups are listed, taken from the route. An ID that matches no account yields an  empty list rather than 404. | |

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
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the account whose groups are listed, taken from the route. An ID that matches no account yields an  empty list rather than 404.

launch(Dispatchers.IO) {
    val result : GroupSummaryArrayWrapper = webService.getGroupByUserId(userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getGroups"></a>
# **getGroups**
> GroupArrayWrapper getGroups (java.util.UUID userId, kotlin.Boolean manager, kotlin.Int count, kotlin.Int startIndex, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterValue)

Returns the groups of the portal, one page at a time, with the summary information about each of them - the  ID, the name and the manager - but without the member list.  The caller needs the permission to read groups.  The call is read-only, and the number of groups that match the filters is reported in the total count of the  response, so a client can page through them with `count` and `startIndex`.  Narrow the result with `filterValue` on the group name, with `userId` to keep only the groups that account  belongs to, and with `manager` set to true to keep only the groups it manages; order it with `sortBy` and  `sortOrder`, and an unknown `sortBy` falls back to sorting by title.  The entries carry no members - read `GET api/2.0/group/{id}` with `includeMembers` for one group, or  `GET api/2.0/group/user/{userid}` to find the groups of a single account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **java.util.UUID**| Keeps only the groups the account with this ID takes part in. Omit it to search every group of the portal. | [optional] |
| **manager** | **kotlin.Boolean**| Narrows `userId` down to the groups that account manages, instead of every group it belongs to. It has no  effect on its own and defaults to false. | [optional] |
| **count** | **kotlin.Int**| The size of the page. It defaults to 100, which is also the largest value the operation accepts. | [optional] |
| **startIndex** | **kotlin.Int**| The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response. | [optional] |
| **sortBy** | **kotlin.String**| What to order the groups by: `Title`, `Manager` or `MembersCount`, compared without regard to case. Any other  value, and omitting the field, orders by title. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The direction of the ordering: `Ascending`, which is the default, or `Descending`. | [optional] [enum: 0, 1] |
| **filterValue** | **kotlin.String**| The text to match against the group name. Omit it to get every group. | [optional] |

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
val userId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | Keeps only the groups the account with this ID takes part in. Omit it to search every group of the portal.
val manager : kotlin.Boolean = false // kotlin.Boolean | Narrows `userId` down to the groups that account manages, instead of every group it belongs to. It has no  effect on its own and defaults to false.
val count : kotlin.Int = 25 // kotlin.Int | The size of the page. It defaults to 100, which is also the largest value the operation accepts.
val startIndex : kotlin.Int = 0 // kotlin.Int | The number of matching groups to skip before the page starts. It defaults to 0, and the total number of  matches is reported in the total count of the response.
val sortBy : kotlin.String = Title // kotlin.String | What to order the groups by: `Title`, `Manager` or `MembersCount`, compared without regard to case. Any other  value, and omitting the field, orders by title.
val sortOrder : SortOrder = Ascending // SortOrder | The direction of the ordering: `Ascending`, which is the default, or `Descending`.
val filterValue : kotlin.String = Marketing // kotlin.String | The text to match against the group name. Omit it to get every group.

launch(Dispatchers.IO) {
    val result : GroupArrayWrapper = webService.getGroups(userId, manager, count, startIndex, sortBy, sortOrder, filterValue)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="moveMembersTo"></a>
# **moveMembersTo**
> GroupWrapper moveMembersTo (java.util.UUID fromId, java.util.UUID toId)

Moves every member of one group into another group, emptying the first one.  The caller needs the permissions to edit groups and to add and remove users, and both IDs have to belong to  groups that have not been deleted, otherwise the operation answers 404.  The source group is kept, only without members, so delete it separately through  `DELETE api/2.0/group/{id}` if it is no longer needed.  Members that cannot be group members any more are silently skipped rather than failing the call, and an  account that already belongs to the destination is simply left there.  The answer is the destination group with its members, not the source one.  To move a chosen few instead of everybody, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-members-to/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fromId** | **java.util.UUID**| The ID of the group the members are taken from. It is emptied but not deleted, and it has to be a group that  has not been deleted already. | |
| **toId** | **java.util.UUID**| The ID of the group the members are moved into. It is the group the answer describes, and it has to be a  group that has not been deleted already. | |

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
val fromId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group the members are taken from. It is emptied but not deleted, and it has to be a group that  has not been deleted already.
val toId : java.util.UUID = 11111111-1111-1111-1111-111111111111 // java.util.UUID | The ID of the group the members are moved into. It is the group the answer describes, and it has to be a  group that has not been deleted already.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.moveMembersTo(fromId, toId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="removeMembersFrom"></a>
# **removeMembersFrom**
> GroupWrapper removeMembersFrom (java.util.UUID id, MembersRequest membersRequest)

Removes the listed accounts from a group, leaving the rest of its members in place.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  The accounts themselves are kept; only their membership in this group ends, together with the access they had  through it.  The call is idempotent and forgiving: an ID that is not a member, and one that matches no account at all, are  both skipped without an error, and an empty list simply changes nothing.  The answer is the group with the members that remain.  Emptying a group cannot be done through `POST api/2.0/group/{id}/members`, which needs at least one valid  account, so list every member here, or move them away with `PUT api/2.0/group/{fromId}/members/{toId}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-members-from/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. | |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The accounts to add, replace with, or remove. | |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
val membersRequest : MembersRequest =  // MembersRequest | The accounts to add, replace with, or remove.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.removeMembersFrom(id, membersRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setGroupManager"></a>
# **setGroupManager**
> GroupWrapper setGroupManager (java.util.UUID id, SetManagerRequest setManagerRequest)

Makes an account the manager of a group, replacing whoever managed it before.  The caller needs the permissions to edit groups and to add and remove users.  Both the group and the account have to exist: the operation answers 404 when the ID in the route matches no  live group and also when `userId` matches no account, so the message of the error says which of the two was  not found.  The account is added to the group at the same time, so a manager does not have to be a member beforehand, and  the previous manager stays in the group as an ordinary member.  A group has one manager, which makes the call idempotent when it names the account that manages it already.  The answer is the group with its new manager.  To change the members rather than the manager, use `PUT api/2.0/group/{id}/members`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-group-manager/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group whose manager is set, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. | |
| **setManagerRequest** | [**SetManagerRequest**](SetManagerRequest.md)| The account to make the manager of the group. | |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group whose manager is set, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
val setManagerRequest : SetManagerRequest =  // SetManagerRequest | The account to make the manager of the group.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.setGroupManager(id, setManagerRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setMembersTo"></a>
# **setMembersTo**
> GroupWrapper setMembersTo (java.util.UUID id, MembersRequest membersRequest)

Replaces the whole member list of a group with the accounts given in the request, removing everybody who is  not in that list.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  At least one of the listed accounts has to be usable as a group member, otherwise the call is rejected with  400 and the group is left untouched; the accounts that cannot be members - a guest, a disabled account or an  ID that matches nobody - are then silently skipped while the rest are applied.  The replacement is not atomic: the current members are removed first and the new ones added afterwards, so a  failure in between can leave the group empty.  The answer is the group with the members it ends up with, which is why it should be read instead of assuming  the request was applied verbatim.  To add or remove a few accounts without touching the others, use `PUT api/2.0/group/{id}/members` and  `DELETE api/2.0/group/{id}/members`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-members-to/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404. | |
| **membersRequest** | [**MembersRequest**](MembersRequest.md)| The accounts to add, replace with, or remove. | |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group whose members are changed, taken from the route. It has to be a group that has not been  deleted, otherwise the operation answers 404.
val membersRequest : MembersRequest =  // MembersRequest | The accounts to add, replace with, or remove.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.setMembersTo(id, membersRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateGroup"></a>
# **updateGroup**
> GroupWrapper updateGroup (java.util.UUID id, UpdateGroupRequest updateGroupRequest)

Changes the name and the manager of a group and adds or removes members, in one call.  The caller needs the permissions to edit groups and to add and remove users, and the ID has to belong to a  group that has not been deleted, otherwise the operation answers 404.  Every field is optional and the ones that are left out are kept: omitting `groupName` keeps the current name,  and omitting `groupManager` keeps the current manager rather than clearing it.  Accounts in `membersToAdd` that cannot be group members - a guest, a disabled account or an ID that matches  nobody - are silently skipped instead of failing the call, so compare the members in the answer with what was  sent to see what was actually applied.  Members are added first and removed afterwards, an account listed in both lists therefore ends up removed,  and removing an account that is not a member changes nothing.  The change raises a `GroupUpdated` webhook, and the answer holds the group as it is after the update.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-group/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The ID of the group to update, taken from the route. It has to be a group that has not been deleted,  otherwise the operation answers 404. | |
| **updateGroupRequest** | [**UpdateGroupRequest**](UpdateGroupRequest.md)| The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing. | |

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
val id : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The ID of the group to update, taken from the route. It has to be a group that has not been deleted,  otherwise the operation answers 404.
val updateGroupRequest : UpdateGroupRequest =  // UpdateGroupRequest | The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing.

launch(Dispatchers.IO) {
    val result : GroupWrapper = webService.updateGroup(id, updateGroupRequest)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

