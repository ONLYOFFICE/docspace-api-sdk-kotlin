# TelegramApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkTelegram**](SettingsTelegramApi.md#checkTelegram) | **GET** api/2.0/settings/telegram/check | Check the Telegram connection |
| [**linkTelegram**](SettingsTelegramApi.md#linkTelegram) | **GET** api/2.0/settings/telegram/link | Get the Telegram link |
| [**unlinkTelegram**](SettingsTelegramApi.md#unlinkTelegram) | **DELETE** api/2.0/settings/telegram/link | Unlink Telegram |



<a id="checkTelegram"></a>
# **checkTelegram**
> TelegramStatusWrapper checkTelegram ()

Reports whether the current user's account is linked to the portal's Telegram bot, and under which Telegram  username. The bot keys must be configured for the portal beforehand with `POST api/2.0/settings/authservice`;  until a bot is configured, linking cannot be completed and the status never reaches the linked state. Any  authenticated user may call it, and only for their own account: there is no way to read another member's  Telegram status. This is a read-only, idempotent call. The returned `status` is published as a number, where  `0` means the account is not linked, `1` means it is linked, and `2` means a registration link has been issued  and the portal is still waiting for the user to open it in Telegram. The `username` field is filled in only in  state `1` and comes back empty in the other two. Start or resume linking with  `GET api/2.0/settings/telegram/link`, and drop an established link with  `DELETE api/2.0/settings/telegram/link`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/check-telegram/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TelegramStatusWrapper**](TelegramStatusWrapper.md)

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
val webService = apiClient.createWebservice(TelegramApi::class.java)

launch(Dispatchers.IO) {
    val result : TelegramStatusWrapper = webService.checkTelegram()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="linkTelegram"></a>
# **linkTelegram**
> StringWrapper linkTelegram ()

Returns the personal `t.me` deep link that connects the current user's account to the portal's Telegram bot,  so that notifications can be delivered to that user in Telegram. The bot keys must be configured for the  portal beforehand with `POST api/2.0/settings/authservice`; without a configured bot name the response comes  back empty. Any authenticated user may call it, and the link always belongs to the caller's own account. The  call mutates state: unless the user still has an outstanding registration token it issues a fresh one, so  calling it twice in a row hands back the same link instead of invalidating the first. That token is  short-lived (20 minutes with the default configuration), and once it has expired the operation has to be  called again for a new link. Linking itself is completed in Telegram, not here, so poll  `GET api/2.0/settings/telegram/check` until its `status` becomes `1`. Remove an established link with  `DELETE api/2.0/settings/telegram/link`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/link-telegram/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(TelegramApi::class.java)

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.linkTelegram()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="unlinkTelegram"></a>
# **unlinkTelegram**
> BooleanWrapper unlinkTelegram ()

Removes the link between the current user's account and the portal's Telegram bot, so that this user stops  receiving notifications in Telegram. Any authenticated user may call it, and only for their own account: one  member cannot unlink another. Nothing has to be linked beforehand, and the call is destructive but idempotent,  returning `true` both when a link was removed and when there was none to remove, so a retry after a timeout is  safe. Only the portal-side link is dropped: the chat itself stays in the user's Telegram, and the portal's bot  configuration is untouched, so the other members keep their own links. Re-linking is not automatic, request a  new link with `GET api/2.0/settings/telegram/link` and confirm the result with  `GET api/2.0/settings/telegram/check`. Delivery over the other notification channels is unaffected; the  channels enabled for the portal are listed by `GET api/2.0/settings/notification/channels`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-telegram/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(TelegramApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.unlinkTelegram()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

