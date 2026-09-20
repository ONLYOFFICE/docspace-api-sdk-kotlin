# ThirdPartyIntegrationApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteThirdParty**](FilesThirdPartyIntegrationApi.md#deleteThirdParty) | **DELETE** api/2.0/files/thirdparty/{providerId} | Remove a third-party account |
| [**getAllProviders**](FilesThirdPartyIntegrationApi.md#getAllProviders) | **GET** api/2.0/files/thirdparty/providers | Get all third-party providers |
| [**getBackupThirdPartyAccount**](FilesThirdPartyIntegrationApi.md#getBackupThirdPartyAccount) | **GET** api/2.0/files/thirdparty/backup | Get the third-party backup folder |
| [**getCapabilities**](FilesThirdPartyIntegrationApi.md#getCapabilities) | **GET** api/2.0/files/thirdparty/capabilities | Get third-party provider capabilities |
| [**getCommonThirdPartyFolders**](FilesThirdPartyIntegrationApi.md#getCommonThirdPartyFolders) | **GET** api/2.0/files/thirdparty/common | Get common third-party folders |
| [**getThirdPartyAccounts**](FilesThirdPartyIntegrationApi.md#getThirdPartyAccounts) | **GET** api/2.0/files/thirdparty | Get the third-party accounts |
| [**saveThirdParty**](FilesThirdPartyIntegrationApi.md#saveThirdParty) | **POST** api/2.0/files/thirdparty | Connect a third-party account |
| [**saveThirdPartyBackup**](FilesThirdPartyIntegrationApi.md#saveThirdPartyBackup) | **POST** api/2.0/files/thirdparty/backup | Connect the third-party backup storage |



<a id="deleteThirdParty"></a>
# **deleteThirdParty**
> StringWrapper deleteThirdParty (kotlin.Int providerId)

Disconnects a third-party storage account from the portal and returns the ID of the folder that stood for it,  in the `provider-accountId` form the Files operations use for third-party entries. Take `providerId` from  `GET api/2.0/files/thirdparty`: it is the numeric account ID, not that composed folder ID. The member who  connected the account can remove it; another member's request is refused unless they hold delete rights on the  folder it stands for. Nothing is deleted at the storage service: the files stay with the provider, and what  goes away is the portal's link to them together with the stored credentials, the sharing records and the tags  kept for its entries. A room that was created on this account stops being available. When the account being  removed is the one connected for backups by `POST api/2.0/files/thirdparty/backup`, its backup schedule is  deleted as well. The removal cannot be repeated: once the account is gone the same ID is refused rather than  confirmed, so treat the first successful answer as the record of it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerId** | **kotlin.Int**| The ID of the connected third-party storage account, as `providerId` of `GET api/2.0/files/thirdparty`. | |

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val providerId : kotlin.Int = 12 // kotlin.Int | The ID of the connected third-party storage account, as `providerId` of `GET api/2.0/files/thirdparty`.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.deleteThirdParty(providerId)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAllProviders"></a>
# **getAllProviders**
> ProviderArrayWrapper getAllProviders (kotlin.Boolean excludewebdav)

Lists the third-party storage services this portal can connect, with everything a connection form needs: the  display name, the key to send as `providerKey`, whether the service authenticates through OAuth 2.0, the OAuth  client ID and redirect URL where it does, and whether the caller has to supply the server address. Several  WebDAV presets share the key `WebDav` and are told apart by their names, so keep the name the caller chose  next to the key when building the request. Pass `excludewebdav=true` to drop the whole WebDAV family,  including the kDrive and Yandex presets, and keep only the OAuth services. The call is read-only. An empty  array is a normal answer: it is what a guest gets, and what everyone gets while the portal-wide third-party  switch is off (`PUT api/2.0/files/thirdparty`). The `connected` flag of an element says the service is  available on this portal, not that an account of it exists - the caller's own accounts are listed by  `GET api/2.0/files/thirdparty`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-providers/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **excludewebdav** | **kotlin.Boolean**| Set to true to leave out the whole WebDAV family, the kDrive and Yandex presets included, and keep only the  services that authenticate through OAuth 2.0; false lists all of them. | [optional] |

### Return type

[**ProviderArrayWrapper**](ProviderArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val excludewebdav : kotlin.Boolean = false // kotlin.Boolean | Set to true to leave out the whole WebDAV family, the kDrive and Yandex presets included, and keep only the  services that authenticate through OAuth 2.0; false lists all of them.

launch(Dispatchers.IO) {
    val result : ProviderArrayWrapper = webService.getAllProviders(excludewebdav)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getBackupThirdPartyAccount"></a>
# **getBackupThirdPartyAccount**
> ThirdPartyFolderWrapper getBackupThirdPartyAccount ()

Returns the folder of the third-party storage account the portal keeps for backups, so a caller can check  where scheduled and manual backups are written. There is at most one such account per portal, connected by an  administrator through `POST api/2.0/files/thirdparty/backup`, and it is deliberately kept out of the personal  list of `GET api/2.0/files/thirdparty`. Any authenticated member may ask, and the call is read-only. The body  is `null`, with a successful status, in two situations the answer does not distinguish: no backup account has  been connected, and the caller has no read access to the folder of the one that is. When a folder does come  back, its `id` is the string ID of a third-party folder and can be used with the folder operations that accept  one, and its `title` is the title the account was saved under. Connecting a different account through the  backup operation replaces this one rather than adding a second, and  `DELETE api/2.0/files/thirdparty/{providerId}` removes it.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-backup-third-party-account/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThirdPartyFolderWrapper**](ThirdPartyFolderWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

launch(Dispatchers.IO) {
    val result : ThirdPartyFolderWrapper = webService.getBackupThirdPartyAccount()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCapabilities"></a>
# **getCapabilities**
> ArrayArrayWrapper getCapabilities ()

Lists the third-party storage services this portal is able to connect, in the compact form a connection dialog  needs. Every element is itself an array whose first item is the provider key accepted as `providerKey` by  `POST api/2.0/files/thirdparty`. For the services that authenticate through OAuth 2.0 (`Box`, `DropboxV2`,  `GoogleDrive`, `OneDrive`) the second and third items are the OAuth client ID and the redirect URL this portal  is registered with, so the caller can build the consent screen URL itself; the services that authenticate by  login and password (`SharePoint`, `WebDav`, `kDrive`, `Yandex`) contribute a single-item array. Only the  services enabled in the portal configuration are listed, and an OAuth service whose application is not  configured is left out. The call is read-only. An empty array is a normal answer rather than a failure: it is  what a guest gets, and what everyone gets while the portal-wide third-party switch is off  (`PUT api/2.0/files/thirdparty`). For display names, the WebDAV presets and the flags a connection form needs,  use `GET api/2.0/files/thirdparty/providers` instead.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-capabilities/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ArrayArrayWrapper**](ArrayArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

launch(Dispatchers.IO) {
    val result : ArrayArrayWrapper = webService.getCapabilities()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCommonThirdPartyFolders"></a>
# **getCommonThirdPartyFolders**
> ThirdPartyFolderArrayWrapper getCommonThirdPartyFolders ()

Lists the third-party storage accounts attached to the legacy Common section, as folder entries that can be  browsed with the usual folder operations. Each entry stands for a whole connected account: its title is the  account title, and `providerId` and `providerKey` identify the account behind it. Only accounts whose owner  the caller may read are included, so the answer differs from one member to another. The call is read-only and  returns a plain array with no paging. An empty array is the expected answer in most portals and does not mean  an error: accounts connected by `POST api/2.0/files/thirdparty` are attached to the Rooms section, not to  Common, so only accounts inherited from an older portal appear here. The list is also empty while the  portal-wide third-party switch is off (`PUT api/2.0/files/thirdparty`) and when no storage service is  configured. For the accounts the caller owns, regardless of where they are attached, use  `GET api/2.0/files/thirdparty`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-common-third-party-folders/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThirdPartyFolderArrayWrapper**](ThirdPartyFolderArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

launch(Dispatchers.IO) {
    val result : ThirdPartyFolderArrayWrapper = webService.getCommonThirdPartyFolders()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getThirdPartyAccounts"></a>
# **getThirdPartyAccounts**
> ThirdPartyParamsArrayWrapper getThirdPartyAccounts ()

Lists the third-party storage accounts the caller has connected, one element per account, with the title it  was saved under, the storage service behind it and the portal section it is attached to. Accounts connected by  other members are not included, and neither is the portal backup account of  `GET api/2.0/files/thirdparty/backup`, even for an administrator. The `providerId` of an element is the value  to send to `DELETE api/2.0/files/thirdparty/{providerId}` and, as `providerId` in  `POST api/2.0/files/thirdparty`, the way to re-authenticate that same account instead of connecting a new one.  Credentials are never disclosed: `auth_data` comes back empty for every element. An element with  `roomsStorage` set is available as storage for a room, while `corporate` marks an account inherited from the  legacy Common section. The call is read-only, returns a plain array with no paging and no contractual  ordering, and answers with an empty array when the caller has connected nothing. To browse the content of an  account, take the folder ID from the answer of the operation that connected it or from  `GET api/2.0/files/@root`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-accounts/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ThirdPartyParamsArrayWrapper**](ThirdPartyParamsArrayWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)

launch(Dispatchers.IO) {
    val result : ThirdPartyParamsArrayWrapper = webService.getThirdPartyAccounts()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveThirdParty"></a>
# **saveThirdParty**
> ThirdPartyFolderWrapper saveThirdParty (ThirdPartyRequestDto thirdPartyRequestDto)

Connects an account at a third-party storage service to the portal, or re-authenticates one that is already  connected, and returns the folder that now stands for its root. Send `providerId` to update an existing  account and omit it to connect a new one; the accepted `providerKey` values come from  `GET api/2.0/files/thirdparty/providers`. The credentials to send depend on the service: the OAuth services  take `token`, which is the authorization code from their consent screen and not an access token, while the  WebDAV family and SharePoint take `login` with `password`, plus `url` where the server address is not fixed.  Credentials are verified against the service before anything is stored, so a wrong password is refused and  nothing is saved. The caller needs the rights to create rooms, and the portal-wide third-party switch has to  be on, otherwise the call is refused. A new account is attached to the Rooms section and becomes available as  room storage for `POST api/2.0/files/rooms/thirdparty/{id}`. Connecting twice with the same title creates two  separate accounts.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyRequestDto** | [**ThirdPartyRequestDto**](ThirdPartyRequestDto.md)|  | [optional] |

### Return type

[**ThirdPartyFolderWrapper**](ThirdPartyFolderWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val thirdPartyRequestDto : ThirdPartyRequestDto =  // ThirdPartyRequestDto | 

launch(Dispatchers.IO) {
    val result : ThirdPartyFolderWrapper = webService.saveThirdParty(thirdPartyRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveThirdPartyBackup"></a>
# **saveThirdPartyBackup**
> ThirdPartyFolderWrapper saveThirdPartyBackup (ThirdPartyBackupRequestDto thirdPartyBackupRequestDto)

Connects the third-party storage account the portal writes its backups to, and returns the folder that stands  for its root. Only a portal administrator may call it, and the portal-wide third-party switch has to be on;  other callers are refused. The account is portal-wide and single: a second call does not add another one but  re-authenticates and retitles the existing one, which makes the operation safe to repeat with the same body.  The credentials follow the same rules as in `POST api/2.0/files/thirdparty` - an authorization code in `token`  for the OAuth services, `login` with `password` and, where the server address is not fixed, `url` for the  WebDAV family and SharePoint - and are verified against the service before anything is stored, so a wrong  password leaves the previous account untouched. The account is deliberately absent from  `GET api/2.0/files/thirdparty`; read it back with `GET api/2.0/files/thirdparty/backup` and remove it with  `DELETE api/2.0/files/thirdparty/{providerId}`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-third-party-backup/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thirdPartyBackupRequestDto** | [**ThirdPartyBackupRequestDto**](ThirdPartyBackupRequestDto.md)|  | [optional] |

### Return type

[**ThirdPartyFolderWrapper**](ThirdPartyFolderWrapper.md)

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
val webService = apiClient.createWebservice(ThirdPartyIntegrationApi::class.java)
val thirdPartyBackupRequestDto : ThirdPartyBackupRequestDto =  // ThirdPartyBackupRequestDto | 

launch(Dispatchers.IO) {
    val result : ThirdPartyFolderWrapper = webService.saveThirdPartyBackup(thirdPartyBackupRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

