# ProfilesApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addMember**](PeopleProfilesApi.md#addMember) | **POST** api/2.0/people | Add a user |
| [**checkUserExistsByEmail**](PeopleProfilesApi.md#checkUserExistsByEmail) | **GET** api/2.0/people/exists | Check if a user exists by email |
| [**deleteMember**](PeopleProfilesApi.md#deleteMember) | **DELETE** api/2.0/people/{userid} | Delete a user |
| [**deleteProfile**](PeopleProfilesApi.md#deleteProfile) | **DELETE** api/2.0/people/@self | Delete my profile |
| [**getAllProfiles**](PeopleProfilesApi.md#getAllProfiles) | **GET** api/2.0/people | Get profiles |
| [**getClaims**](PeopleProfilesApi.md#getClaims) | **GET** api/2.0/people/tokendiagnostics | Get user claims |
| [**getProfileByEmail**](PeopleProfilesApi.md#getProfileByEmail) | **GET** api/2.0/people/email | Get a profile by user email |
| [**getProfileByUserId**](PeopleProfilesApi.md#getProfileByUserId) | **GET** api/2.0/people/{userid} | Get a profile by user ID |
| [**getSelfProfile**](PeopleProfilesApi.md#getSelfProfile) | **GET** api/2.0/people/@self | Get my profile |
| [**inviteUsers**](PeopleProfilesApi.md#inviteUsers) | **POST** api/2.0/people/invite | Invite users |
| [**removeUsers**](PeopleProfilesApi.md#removeUsers) | **PUT** api/2.0/people/delete | Delete users |
| [**resendUserInvites**](PeopleProfilesApi.md#resendUserInvites) | **PUT** api/2.0/people/invite | Resend activation emails |
| [**updateMember**](PeopleProfilesApi.md#updateMember) | **PUT** api/2.0/people/{userid} | Update a user |
| [**updateMemberCulture**](PeopleProfilesApi.md#updateMemberCulture) | **PUT** api/2.0/people/{userid}/culture | Update a user culture |



<a id="addMember"></a>
# **addMember**
> EmployeeFullWrapper addMember (MemberRequestDto memberRequestDto)

Adds a new portal user with the first name, last name, email address, and several optional parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/add-member/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **memberRequestDto** | [**MemberRequestDto**](MemberRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val memberRequestDto : MemberRequestDto =  // MemberRequestDto | 

val result : EmployeeFullWrapper = webService.addMember(memberRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="checkUserExistsByEmail"></a>
# **checkUserExistsByEmail**
> BooleanWrapper checkUserExistsByEmail (kotlin.String email, kotlin.String encemail, kotlin.String culture)

Returns a boolean indicating whether a user with the specified email exists on the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-user-exists-by-email/).

### Parameters
| **email** | **kotlin.String**| The user email address. | [optional] |
| **encemail** | **kotlin.String**| The user encrypted email address. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **culture** | **kotlin.String**| Culture | [optional] |

### Return type

[**BooleanWrapper**](BooleanWrapper.md)

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val email : kotlin.String = john.doe@example.com // kotlin.String | The user email address.
val encemail : kotlin.String = encrypted_email_string // kotlin.String | The user encrypted email address.
val culture : kotlin.String = en-US // kotlin.String | Culture

val result : BooleanWrapper = webService.checkUserExistsByEmail(email, encemail, culture)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteMember"></a>
# **deleteMember**
> EmployeeFullWrapper deleteMember (kotlin.String userid)

Deletes a user with the ID specified in the request from the portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-member/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.

val result : EmployeeFullWrapper = webService.deleteMember(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="deleteProfile"></a>
# **deleteProfile**
> EmployeeFullWrapper deleteProfile ()

Deletes the current user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-profile/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)

val result : EmployeeFullWrapper = webService.deleteProfile()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllProfiles"></a>
# **getAllProfiles**
> EmployeeFullArrayWrapper getAllProfiles (kotlin.Int count, kotlin.Int startIndex, kotlin.String filterBy, kotlin.String sortBy, SortOrder sortOrder, kotlin.String filterSeparator, kotlin.String filterValue)

Returns a list of profiles for all the portal users.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-profiles/).

### Parameters
| **count** | **kotlin.Int**| The maximum number of items to be retrieved in the response. | [optional] |
| **startIndex** | **kotlin.Int**| The zero-based index of the first item to be retrieved in a filtered result set. | [optional] |
| **filterBy** | **kotlin.String**| Specifies the filter criteria for user-related queries. | [optional] |
| **sortBy** | **kotlin.String**| Specifies the property or field name by which the results should be sorted. | [optional] |
| **sortOrder** | [**SortOrder**](.md)| The order in which the results are sorted. | [optional] [enum: 0, 1] |
| **filterSeparator** | **kotlin.String**| The character or string used to separate multiple filter values in a filtering query. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filterValue** | **kotlin.String**| The text value used as an additional filter criterion for profiles retrieval. | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val count : kotlin.Int = 25 // kotlin.Int | The maximum number of items to be retrieved in the response.
val startIndex : kotlin.Int = 0 // kotlin.Int | The zero-based index of the first item to be retrieved in a filtered result set.
val filterBy : kotlin.String = displayName // kotlin.String | Specifies the filter criteria for user-related queries.
val sortBy : kotlin.String = displayName // kotlin.String | Specifies the property or field name by which the results should be sorted.
val sortOrder : SortOrder = 0 // SortOrder | The order in which the results are sorted.
val filterSeparator : kotlin.String = , // kotlin.String | The character or string used to separate multiple filter values in a filtering query.
val filterValue : kotlin.String = John // kotlin.String | The text value used as an additional filter criterion for profiles retrieval.

val result : EmployeeFullArrayWrapper = webService.getAllProfiles(count, startIndex, filterBy, sortBy, sortOrder, filterSeparator, filterValue)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getClaims"></a>
# **getClaims**
> ObjectWrapper getClaims ()

Returns the user claims.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-claims/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ObjectWrapper**](ObjectWrapper.md)

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)

val result : ObjectWrapper = webService.getClaims()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProfileByEmail"></a>
# **getProfileByEmail**
> EmployeeFullWrapper getProfileByEmail (kotlin.String email, kotlin.String encemail, kotlin.String culture)

Returns the detailed information about a profile of the user with the email specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-email/).

### Parameters
| **email** | **kotlin.String**| The user email address. | [optional] |
| **encemail** | **kotlin.String**| The user encrypted email address. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **culture** | **kotlin.String**| Culture | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val email : kotlin.String = john.doe@example.com // kotlin.String | The user email address.
val encemail : kotlin.String = encrypted_email_string // kotlin.String | The user encrypted email address.
val culture : kotlin.String = en-US // kotlin.String | Culture

val result : EmployeeFullWrapper = webService.getProfileByEmail(email, encemail, culture)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProfileByUserId"></a>
# **getProfileByUserId**
> EmployeeFullWrapper getProfileByUserId (kotlin.String userid)

Returns the detailed information about a profile of the user with the ID specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-profile-by-user-id/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userid** | **kotlin.String**| The user ID. | |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.

val result : EmployeeFullWrapper = webService.getProfileByUserId(userid)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getSelfProfile"></a>
# **getSelfProfile**
> EmployeeFullWrapper getSelfProfile ()

Returns the detailed information about the current user profile.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-self-profile/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)

val result : EmployeeFullWrapper = webService.getSelfProfile()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="inviteUsers"></a>
# **inviteUsers**
> EmployeeArrayWrapper inviteUsers (InviteUsersRequestDto inviteUsersRequestDto)

Invites users specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/invite-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteUsersRequestDto** | [**InviteUsersRequestDto**](InviteUsersRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val inviteUsersRequestDto : InviteUsersRequestDto =  // InviteUsersRequestDto | 

val result : EmployeeArrayWrapper = webService.inviteUsers(inviteUsersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="removeUsers"></a>
# **removeUsers**
> EmployeeFullArrayWrapper removeUsers (UpdateMembersRequestDto updateMembersRequestDto)

Deletes a list of the users with the IDs specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/remove-users/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | 

val result : EmployeeFullArrayWrapper = webService.removeUsers(updateMembersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="resendUserInvites"></a>
# **resendUserInvites**
> EmployeeFullArrayWrapper resendUserInvites (UpdateMembersRequestDto updateMembersRequestDto)

Resends emails to the users who have not activated their emails.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/resend-user-invites/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMembersRequestDto** | [**UpdateMembersRequestDto**](UpdateMembersRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val updateMembersRequestDto : UpdateMembersRequestDto =  // UpdateMembersRequestDto | 

val result : EmployeeFullArrayWrapper = webService.resendUserInvites(updateMembersRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateMember"></a>
# **updateMember**
> EmployeeFullWrapper updateMember (kotlin.String userid, UpdateMemberRequestDto updateMemberRequestDto)

Updates the data for the selected portal user with the first name, last name, email address, and/or optional parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member/).

### Parameters
| **userid** | **kotlin.String**| The user ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMemberRequestDto** | [**UpdateMemberRequestDto**](UpdateMemberRequestDto.md)| The request parameters for updating the user information. | |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.
val updateMemberRequestDto : UpdateMemberRequestDto =  // UpdateMemberRequestDto | The request parameters for updating the user information.

val result : EmployeeFullWrapper = webService.updateMember(userid, updateMemberRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateMemberCulture"></a>
# **updateMemberCulture**
> EmployeeFullWrapper updateMemberCulture (kotlin.String userid, Culture culture)

Updates the user culture with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-member-culture/).

### Parameters
| **userid** | **kotlin.String**| The user ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **culture** | [**Culture**](Culture.md)| The culture name parameters. | [optional] |

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
val webService = apiClient.createWebservice(ProfilesApi::class.java)
val userid : kotlin.String = 00000000-0000-0000-0000-000000000000 // kotlin.String | The user ID.
val culture : Culture =  // Culture | The culture name parameters.

val result : EmployeeFullWrapper = webService.updateMemberCulture(userid, culture)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

