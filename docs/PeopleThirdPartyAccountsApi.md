# ThirdPartyAccountsApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getThirdPartyAuthProviders**](PeopleThirdPartyAccountsApi.md#getThirdPartyAuthProviders) | **GET** api/2.0/people/thirdparty/providers | Get third-party providers |
| [**linkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#linkThirdPartyAccount) | **PUT** api/2.0/people/thirdparty/linkaccount | Link a third-party account |
| [**signupThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#signupThirdPartyAccount) | **POST** api/2.0/people/thirdparty/signup | Sign up with a provider |
| [**unlinkThirdPartyAccount**](PeopleThirdPartyAccountsApi.md#unlinkThirdPartyAccount) | **DELETE** api/2.0/people/thirdparty/unlinkaccount | Unlink a third-party account |



<a id="getThirdPartyAuthProviders"></a>
# **getThirdPartyAuthProviders**
> AccountInfoArrayWrapper getThirdPartyAuthProviders (kotlin.Boolean inviteView, kotlin.Boolean settingsView, kotlin.String clientCallback, kotlin.String fromOnly)

Returns the third-party identity providers this portal has enabled, each with the URL that starts the login  with it, so a client can render the social sign-in buttons.  It needs no authentication and is the operation to call before showing a login or an invitation page; an  empty list means the portal has no provider configured, not that the call failed.  The call is read-only, and `linked` says whether the provider is already connected to the calling profile -  for an anonymous caller there is nothing to compare against, so every entry comes back with false.  The order is fixed by the portal, except that a caller located in China gets `weixin` first.  Pass `fromOnly` to keep a single provider, `inviteView` to leave out the providers that cannot be used on an  invitation page, and `settingsView` or `clientCallback` to get URLs that open in a popup instead of  redirecting the desktop application.  Use `PUT api/2.0/people/thirdparty/linkaccount` to connect one of these providers to an existing profile and  `POST api/2.0/people/thirdparty/signup` to create a profile through one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inviteView** | **kotlin.Boolean**| Set it to true when the list is rendered on an invitation page: the providers that cannot be used to accept an  invitation, `twitter` and `appleid`, are then left out. It defaults to false, which returns every enabled  provider. | [optional] |
| **settingsView** | **kotlin.Boolean**| Set it to true when the list is rendered on a settings page, to get login URLs that open in a popup window.  With the default false the URL still opens in a popup for a desktop browser, and switches to a redirect only  for a mobile browser or for the DocSpace desktop application. | [optional] |
| **clientCallback** | **kotlin.String**| The name of the client-side function the popup calls back when the provider authorization finishes. It is  placed into the returned URLs as they are, and it is only used by the popup mode. | [optional] |
| **fromOnly** | **kotlin.String**| Keeps only the named provider, compared case-insensitively against the lowercase provider names such as  `google` or `microsoft`; the special value `openid` selects `google`. Omit it to get every enabled provider. | [optional] |

### Return type

[**AccountInfoArrayWrapper**](AccountInfoArrayWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val inviteView : kotlin.Boolean = false // kotlin.Boolean | Set it to true when the list is rendered on an invitation page: the providers that cannot be used to accept an  invitation, `twitter` and `appleid`, are then left out. It defaults to false, which returns every enabled  provider.
val settingsView : kotlin.Boolean = false // kotlin.Boolean | Set it to true when the list is rendered on a settings page, to get login URLs that open in a popup window.  With the default false the URL still opens in a popup for a desktop browser, and switches to a redirect only  for a mobile browser or for the DocSpace desktop application.
val clientCallback : kotlin.String = onAuthCallback // kotlin.String | The name of the client-side function the popup calls back when the provider authorization finishes. It is  placed into the returned URLs as they are, and it is only used by the popup mode.
val fromOnly : kotlin.String = google // kotlin.String | Keeps only the named provider, compared case-insensitively against the lowercase provider names such as  `google` or `microsoft`; the special value `openid` selects `google`. Omit it to get every enabled provider.

launch(Dispatchers.IO) {
    val result : AccountInfoArrayWrapper = webService.getThirdPartyAuthProviders(inviteView, settingsView, clientCallback, fromOnly)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="linkThirdPartyAccount"></a>
# **linkThirdPartyAccount**
> void linkThirdPartyAccount (LinkAccountRequestDto linkAccountRequestDto)

Connects a third-party identity to the calling profile, so that the account can afterwards sign in through  that provider.  The profile has to come from a completed provider authorization: pass the serialized `LoginProfile` the login  flow started from `GET api/2.0/people/thirdparty/providers` handed back, not a hand-written object.  It acts on the authenticated account only, and the portal has to be a standalone installation or have a  tariff that includes third-party authorization, otherwise the operation answers 403.  The call returns no body and is not idempotent: one third-party identity can be linked to a single portal  profile, so repeating it, or linking an identity somebody else already uses, answers 400.  A profile whose authorization was cancelled by the user is accepted and ignored, so a cancelled login also  answers 200 and links nothing - read `GET api/2.0/people/thirdparty/providers` afterwards and check `linked`  to find out whether the link exists.  Use `DELETE api/2.0/people/thirdparty/unlinkaccount` to remove a link.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **linkAccountRequestDto** | [**LinkAccountRequestDto**](LinkAccountRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val linkAccountRequestDto : LinkAccountRequestDto =  // LinkAccountRequestDto | 

launch(Dispatchers.IO) {
    webService.linkThirdPartyAccount(linkAccountRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="signupThirdPartyAccount"></a>
# **signupThirdPartyAccount**
> EmployeeWrapper signupThirdPartyAccount (SignupAccountRequestDto signupAccountRequestDto)

Creates a portal profile from a third-party identity and joins the invitation the `key` belongs to, which is  how a person accepts an invitation by signing in with a provider instead of setting a password.  It needs no authentication, but it does need a valid invitation: `key` has to be the key of a live invitation  link, and `serializedProfile` has to be the profile a completed provider authorization produced.  The resulting type comes from the invitation link itself, and `employeeType` only says which type to look the  link up as, defaulting to `RoomAdmin`.  When the identity or its email already belongs to a portal profile, that existing profile is returned and the  provider is linked to it instead of a second account being created, so the call can be repeated safely.  The answer is the profile the caller ends up with - and it is empty, still with status 200, when the provider  authorization was cancelled or when the profile could not be created, so check for an empty body instead of  relying on the status alone.  A `weixin` or `nextcloud` identity carries no email address, so the portal generates one and the profile stays  in the `AutoGenerated` activation state; every other provider has to supply an email.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signupAccountRequestDto** | [**SignupAccountRequestDto**](SignupAccountRequestDto.md)|  | [optional] |

### Return type

[**EmployeeWrapper**](EmployeeWrapper.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### Example
```kotlin
// Import classes:
//import onlyoffice.docspace.api.sdk.*
//import onlyoffice.docspace.api.sdk.infrastructure.*
//import onlyoffice.docspace.api.sdk.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val signupAccountRequestDto : SignupAccountRequestDto =  // SignupAccountRequestDto | 

launch(Dispatchers.IO) {
    val result : EmployeeWrapper = webService.signupThirdPartyAccount(signupAccountRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="unlinkThirdPartyAccount"></a>
# **unlinkThirdPartyAccount**
> void unlinkThirdPartyAccount (kotlin.String provider)

Removes the link between the calling profile and the named third-party provider, so that the account can no  longer sign in through it.  It acts on the authenticated account only and takes the provider name in the query, using the same lowercase  values `GET api/2.0/people/thirdparty/providers` returns, such as `google` or `microsoft`.  The call returns no body and is idempotent: unlinking a provider that is not linked answers 200 and changes  nothing.  The portal profile itself is kept, together with its password, so the account stays usable through the  ordinary sign-in; only the third-party route is removed.  Link the provider again through `PUT api/2.0/people/thirdparty/linkaccount`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **provider** | **kotlin.String**| The name of the provider to unlink, in the lowercase form `GET api/2.0/people/thirdparty/providers` returns,  such as `google` or `microsoft`. A name that is not linked to the calling profile is accepted and changes  nothing. | [optional] |

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
val webService = apiClient.createWebservice(ThirdPartyAccountsApi::class.java)
val provider : kotlin.String = google // kotlin.String | The name of the provider to unlink, in the lowercase form `GET api/2.0/people/thirdparty/providers` returns,  such as `google` or `microsoft`. A name that is not linked to the calling profile is accepted and changes  nothing.

launch(Dispatchers.IO) {
    webService.unlinkThirdPartyAccount(provider)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

