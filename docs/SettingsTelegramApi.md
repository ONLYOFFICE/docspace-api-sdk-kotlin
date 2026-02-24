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

Checks if the current user is connected to the Telegram Bot or not.

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

val result : TelegramStatusWrapper = webService.checkTelegram()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="linkTelegram"></a>
# **linkTelegram**
> StringWrapper linkTelegram ()

Returns a link that will connect the Telegram Bot to your account.

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

val result : StringWrapper = webService.linkTelegram()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="unlinkTelegram"></a>
# **unlinkTelegram**
> BooleanWrapper unlinkTelegram ()

Unlinks the Telegram Bot from your account.

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

val result : BooleanWrapper = webService.unlinkTelegram()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

