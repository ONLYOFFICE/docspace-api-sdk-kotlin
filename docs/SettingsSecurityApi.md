# SecurityApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getEnabledModules**](SettingsSecurityApi.md#getEnabledModules) | **GET** api/2.0/settings/security/modules | Get enabled modules |
| [**getIsProductAdministrator**](SettingsSecurityApi.md#getIsProductAdministrator) | **GET** api/2.0/settings/security/administrator | Check product administrator |
| [**getPasswordSettings**](SettingsSecurityApi.md#getPasswordSettings) | **GET** api/2.0/settings/security/password | Get password settings |
| [**getProductAdministrators**](SettingsSecurityApi.md#getProductAdministrators) | **GET** api/2.0/settings/security/administrator/{productid} | Get product administrators |
| [**getWebItemSecurityInfo**](SettingsSecurityApi.md#getWebItemSecurityInfo) | **GET** api/2.0/settings/security/{id} | Check module availability |
| [**getWebItemSettingsSecurityInfo**](SettingsSecurityApi.md#getWebItemSettingsSecurityInfo) | **GET** api/2.0/settings/security | Get module access settings |
| [**setAccessToWebItems**](SettingsSecurityApi.md#setAccessToWebItems) | **PUT** api/2.0/settings/security/access | Set access to modules in bulk |
| [**setProductAdministrator**](SettingsSecurityApi.md#setProductAdministrator) | **PUT** api/2.0/settings/security/administrator | Set product administrator |
| [**setWebItemSecurity**](SettingsSecurityApi.md#setWebItemSecurity) | **PUT** api/2.0/settings/security | Set module access |
| [**updatePasswordSettings**](SettingsSecurityApi.md#updatePasswordSettings) | **PUT** api/2.0/settings/security/password | Update password settings |



<a id="getEnabledModules"></a>
# **getEnabledModules**
> EnabledModuleArrayWrapper getEnabledModules ()

Lists the portal modules the calling user can currently open, each as an `id` holding the module's product  class name and a `title` holding its display name, both HTML-encoded. Any signed-in member may call this;  anonymous callers are not admitted. The operation is read-only and takes no parameters, and the list is  specific to the caller: modules hidden for this portal, and modules whose access rules exclude the caller, are  left out, and sub-modules nested under another module are never listed. Entries follow the portal's own module  order rather than an alphabetical one. An empty list means the installation registers no such modules at all -  the case on DocSpace, where the classic modules do not exist - and is not a failure. The identifiers here are  display-oriented class names, not the GUIDs the access-settings operations work with, so do not feed them to  `GET api/2.0/settings/security/{id}`, which expects a module GUID.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-enabled-modules/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**EnabledModuleArrayWrapper**](EnabledModuleArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)

launch(Dispatchers.IO) {
    val result : EnabledModuleArrayWrapper = webService.getEnabledModules()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getIsProductAdministrator"></a>
# **getIsProductAdministrator**
> ProductAdministratorWrapper getIsProductAdministrator (java.util.UUID productid, java.util.UUID userid)

Reports whether one user administers one portal module, as the identifiers asked about plus an `administrator`  flag. Both `productid` and `userid` are query parameters and both are required; the all-zero product GUID asks  about the portal itself rather than about a single module. The caller needs the portal-settings right of a  DocSpace administrator, otherwise the call is refused. The operation is read-only. The flag is `true` when the  user belongs to the DocSpace administrator group or to the module's own group, so a portal-wide administrator  is reported as an administrator of every module, whatever the module identifier says. Identifiers that name no  user and no group are answered with `false` instead of a failure, so a `false` does not prove the user exists.  The verdict is read out of group membership alone and says nothing about whether the module is enabled for  this portal, which `GET api/2.0/settings/security/{id}` reports. Use  `GET api/2.0/settings/security/administrator/{productid}` to list everyone who administers a module, and  `PUT api/2.0/settings/security/administrator` to change the membership.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-is-product-administrator/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productid** | **java.util.UUID**| The module being asked about, by module GUID. The all-zero GUID asks about the portal itself rather than a  single module. | |
| **userid** | **java.util.UUID**| The account being asked about, by portal user ID. An ID that names no account is answered as a plain negative  rather than a failure, so a negative answer does not prove the account exists. | |

### Return type

[**ProductAdministratorWrapper**](ProductAdministratorWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val productid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The module being asked about, by module GUID. The all-zero GUID asks about the portal itself rather than a  single module.
val userid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The account being asked about, by portal user ID. An ID that names no account is answered as a plain negative  rather than a failure, so a negative answer does not prove the account exists.

launch(Dispatchers.IO) {
    val result : ProductAdministratorWrapper = webService.getIsProductAdministrator(productid, userid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPasswordSettings"></a>
# **getPasswordSettings**
> PasswordSettingsWrapper getPasswordSettings ()

Returns the password policy of the current portal: the minimum length together with the flags that demand an  uppercase letter, a digit and a special symbol, plus the regular expressions a client can check a password  against before sending it anywhere. Any signed-in member may read it, and it is also reachable with the  parameters of a confirmation link, so an invited user or one resetting a password can validate the new  password before having a session; a portal whose payment has lapsed still answers. The operation is read-only  and honours `If-Modified-Since`: send back the `Last-Modified` value of an earlier answer and an unchanged  policy comes back as an empty not-modified response rather than a body. A portal nobody has configured  requires 8 characters with all three flags off. Whatever the policy says, the portal refuses a password longer  than 30 characters, a ceiling this answer does not carry. Change the policy with  `PUT api/2.0/settings/security/password`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-password-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**PasswordSettingsWrapper**](PasswordSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)

launch(Dispatchers.IO) {
    val result : PasswordSettingsWrapper = webService.getPasswordSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getProductAdministrators"></a>
# **getProductAdministrators**
> EmployeeArrayWrapper getProductAdministrators (java.util.UUID productid)

Lists the users who administer the portal module identified by `productid` in the path. The all-zero GUID  stands for the portal itself: the answer then covers the DocSpace administrator group together with every  product group, and includes the portal owner, who administers everything by default. The caller needs the  portal-settings right of a DocSpace administrator, otherwise the call is refused. `productid` has to be a  GUID, and one that names no group is answered with an empty list rather than a failure. The operation is  read-only and returns whole user profiles, a heavier answer than a membership check, and a user who belongs to  more than one of the groups asked about is listed once per group. Entries arrive in group order, the DocSpace  administrator group first, the list is neither paged nor filterable, and a promotion made through the sibling  `PUT` shows up here at once. Use `GET api/2.0/settings/security/administrator` to test a single user against a  single module, and `PUT api/2.0/settings/security/administrator` to promote or demote somebody.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-product-administrators/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productid** | **java.util.UUID**| The module the operation acts on, by module GUID. The all-zero GUID stands for the portal itself rather than  for a single module, and a GUID that names no module group is answered with an empty result instead of a  failure. | |

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val productid : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | The module the operation acts on, by module GUID. The all-zero GUID stands for the portal itself rather than  for a single module, and a GUID that names no module group is answered with an empty result instead of a  failure.

launch(Dispatchers.IO) {
    val result : EmployeeArrayWrapper = webService.getProductAdministrators(productid)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebItemSecurityInfo"></a>
# **getWebItemSecurityInfo**
> BooleanWrapper getWebItemSecurityInfo (java.util.UUID id)

Answers whether the module with the given identifier is available to the calling user right now, as a single  boolean. `id` is the module GUID and travels in the path; a value that is not a GUID does not match the route  at all. Any signed-in member may call this; anonymous callers are not admitted. The operation is read-only and  its answer is specific to the caller: `true` means a module with that identifier is registered in this portal,  is visible, and the caller is allowed to read it, while `false` covers every other case - the module is not  registered here, it is hidden for this portal, or the caller is outside the users and groups allowed to open  it. A `false` therefore does not tell those apart, and an unknown identifier is reported as unavailable  instead of failing. Read the allow-list behind the decision with `GET api/2.0/settings/security`, list the  modules the caller can actually open with `GET api/2.0/settings/security/modules`, and change access with  `PUT api/2.0/settings/security`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found. | |

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val id : java.util.UUID = 1 // java.util.UUID | The identifier of the object the operation acts on, as the listing operation of that kind of object reports  it. It has to match the shape the route declares - a GUID where the route is typed as one - since a value of  another shape does not match the route at all and is answered as not found.

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.getWebItemSecurityInfo(id)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWebItemSettingsSecurityInfo"></a>
# **getWebItemSettingsSecurityInfo**
> SecurityArrayWrapper getWebItemSettingsSecurityInfo (kotlin.collections.List<kotlin.String> ids)

Reports how access to the portal's own modules is configured: for every module identifier sent in `ids`,  whether access is restricted at all and which users and groups are allowed to open the module. Send the  identifiers as repeated `ids` query values; each one has to be a GUID, and anything else is rejected as an  invalid request. Omitting `ids` asks about every module registered in the portal, which on a DocSpace  installation is none, so the answer is then an empty list rather than a failure. Any signed-in member may call  this; anonymous callers are not admitted. The operation is read-only and answers one entry per identifier, in  the order the identifiers were sent. `enabled` is `false` for a module nobody has ever configured, `groups`  and `users` name the subjects the rule was stored for, and `isSubItem` marks a module that hangs under another  one. Users the caller is not allowed to see are left out of `users`, so the same module can come back with  different lists for different callers. Change any of this with `PUT api/2.0/settings/security`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-web-item-settings-security-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The modules to report on, each given as a GUID and sent as a repeated query value. An entry that is not a  GUID fails the whole request as invalid. Leaving the list out asks about every module registered in the  portal, which on a DocSpace installation is none, so the answer is then empty rather than complete. | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val ids : kotlin.collections.List<kotlin.String> = ["00000000-0000-0000-0000-000000000000"] // kotlin.collections.List<kotlin.String> | The modules to report on, each given as a GUID and sent as a repeated query value. An entry that is not a  GUID fails the whole request as invalid. Leaving the list out asks about every module registered in the  portal, which on a DocSpace installation is none, so the answer is then empty rather than complete.

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.getWebItemSettingsSecurityInfo(ids)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="setAccessToWebItems"></a>
# **setAccessToWebItems**
> SecurityArrayWrapper setAccessToWebItems (WebItemsSecurityRequestsDto webItemsSecurityRequestsDto)

Switches several portal modules on or off in one call: `items` carries an entry per module, its `key` the  module GUID and its `value` the new enabled flag. The caller needs the portal-settings right of a DocSpace  administrator, and the call is answered with 403 on an open portal, where everyone is admitted and per-module  rules would mean nothing. Every key has to be a GUID; anything else is rejected as an invalid request, and a  module listed twice is applied once, from its first entry. This operation carries no subject list of its own:  switching a product module on restores the users and groups it was last restricted to, while every other case  is stored as a plain allow or deny for everyone, so use `PUT api/2.0/settings/security` when the allow-list  itself has to change. The batch is recorded in the audit trail as one list update rather than module by  module. The answer is the resulting configuration of every module listed, in the shape  `GET api/2.0/settings/security` returns.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-access-to-web-items/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webItemsSecurityRequestsDto** | [**WebItemsSecurityRequestsDto**](WebItemsSecurityRequestsDto.md)|  | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val webItemsSecurityRequestsDto : WebItemsSecurityRequestsDto =  // WebItemsSecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.setAccessToWebItems(webItemsSecurityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setProductAdministrator"></a>
# **setProductAdministrator**
> ProductAdministratorWrapper setProductAdministrator (SecurityRequestsDto securityRequestsDto)

Promotes a portal member to administrator of one module, or takes that role away, according to the  `administrator` flag; the all-zero product GUID targets the DocSpace administrator role, which covers the  whole portal. The caller needs the portal-settings right of a DocSpace administrator, and granting the  portal-wide role additionally requires being the portal owner - anyone else is refused with 403. A free cloud  plan does not offer the option at all and answers 402, as does a promotion for which no paid seat is left,  since promoting a guest or a plain member turns them into a paid one. Taking the portal-wide role away also  removes the member from every product group. The change is immediate, portal-wide, recorded in the audit  trail, and sending the same body twice changes nothing further; it never creates a user, so invite the member  first. The answer echoes the identifiers and the flag as stored - re-read membership with  `GET api/2.0/settings/security/administrator`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-product-administrator/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityRequestsDto** | [**SecurityRequestsDto**](SecurityRequestsDto.md)|  | [optional] |

### Return type

[**ProductAdministratorWrapper**](ProductAdministratorWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val securityRequestsDto : SecurityRequestsDto =  // SecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : ProductAdministratorWrapper = webService.setProductAdministrator(securityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setWebItemSecurity"></a>
# **setWebItemSecurity**
> SecurityArrayWrapper setWebItemSecurity (WebItemSecurityRequestsDto webItemSecurityRequestsDto)

Replaces the access rules of one portal module: `id` names the module, `enabled` says whether it may be  opened, and `subjects` lists the users and groups the rule is stored for. The caller needs the portal-settings  right of a DocSpace administrator, and the call is answered with 403 on an open portal, where everyone is  admitted and per-module rules would mean nothing. `id` has to be a GUID; anything else is rejected as an  invalid request. The rules stored before are dropped rather than extended, so send the full list of subjects  every time. Watch the empty cases: leaving `subjects` out applies `enabled` to everyone, while an empty  `subjects` array is stored as access for everyone whatever `enabled` says. The change is recorded in the audit  trail unless `subjects` was left out entirely. The answer is the module's resulting configuration as a  single-entry list, in the shape `GET api/2.0/settings/security` returns. To switch several modules at once use  `PUT api/2.0/settings/security/access`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-web-item-security/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webItemSecurityRequestsDto** | [**WebItemSecurityRequestsDto**](WebItemSecurityRequestsDto.md)|  | [optional] |

### Return type

[**SecurityArrayWrapper**](SecurityArrayWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val webItemSecurityRequestsDto : WebItemSecurityRequestsDto =  // WebItemSecurityRequestsDto | 

launch(Dispatchers.IO) {
    val result : SecurityArrayWrapper = webService.setWebItemSecurity(webItemSecurityRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updatePasswordSettings"></a>
# **updatePasswordSettings**
> PasswordSettingsWrapper updatePasswordSettings (PasswordSettingsRequestsDto passwordSettingsRequestsDto)

Replaces the password policy of the whole portal with the four values sent: `minLength` and the three flags  that demand an uppercase letter, a digit and a special symbol. There is no partial update - a flag left out of  the body is stored as `false` - so read the current policy with `GET api/2.0/settings/security/password` and  send it back with your change applied. The caller needs the portal-settings right of a DocSpace administrator,  otherwise the call is refused. `minLength` has to sit between the floor the installation is configured with, 8  characters unless it was changed, and the ceiling of 30; anything outside is rejected as an invalid request.  The new policy applies to passwords set from now on: existing passwords keep working until their owners change  them, and nobody is asked to renew. The change is portal-wide, recorded in the audit trail, and sending the  same body twice changes nothing further. The answer is the stored policy with its regular expressions.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-password-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **passwordSettingsRequestsDto** | [**PasswordSettingsRequestsDto**](PasswordSettingsRequestsDto.md)|  | [optional] |

### Return type

[**PasswordSettingsWrapper**](PasswordSettingsWrapper.md)

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
val webService = apiClient.createWebservice(SecurityApi::class.java)
val passwordSettingsRequestsDto : PasswordSettingsRequestsDto =  // PasswordSettingsRequestsDto | 

launch(Dispatchers.IO) {
    val result : PasswordSettingsWrapper = webService.updatePasswordSettings(passwordSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

