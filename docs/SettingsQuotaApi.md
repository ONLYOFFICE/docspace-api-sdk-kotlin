# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getUserQuotaSettings**](SettingsQuotaApi.md#getUserQuotaSettings) | **GET** api/2.0/settings/userquotasettings | Get the user quota settings |
| [**saveAiAgentQuotaSettings**](SettingsQuotaApi.md#saveAiAgentQuotaSettings) | **POST** api/2.0/settings/aiagentquotasettings | Save the AI Agent quota settings |
| [**saveRoomQuotaSettings**](SettingsQuotaApi.md#saveRoomQuotaSettings) | **POST** api/2.0/settings/roomquotasettings | Save the room quota settings |
| [**setTenantQuotaSettings**](SettingsQuotaApi.md#setTenantQuotaSettings) | **PUT** api/2.0/settings/tenantquotasettings | Save the tenant quota settings |



<a id="getUserQuotaSettings"></a>
# **getUserQuotaSettings**
> TenantUserQuotaSettingsWrapper getUserQuotaSettings ()

Returns the user quota settings.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-quota-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantUserQuotaSettingsWrapper**](TenantUserQuotaSettingsWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)

val result : TenantUserQuotaSettingsWrapper = webService.getUserQuotaSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAiAgentQuotaSettings"></a>
# **saveAiAgentQuotaSettings**
> TenantAiAgentQuotaSettingsWrapper saveAiAgentQuotaSettings (QuotaSettingsRequestsDto quotaSettingsRequestsDto)

Saves the AI Agent quota settings specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-ai-agent-quota-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quotaSettingsRequestsDto** | [**QuotaSettingsRequestsDto**](QuotaSettingsRequestsDto.md)|  | [optional] |

### Return type

[**TenantAiAgentQuotaSettingsWrapper**](TenantAiAgentQuotaSettingsWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val quotaSettingsRequestsDto : QuotaSettingsRequestsDto =  // QuotaSettingsRequestsDto | 

val result : TenantAiAgentQuotaSettingsWrapper = webService.saveAiAgentQuotaSettings(quotaSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveRoomQuotaSettings"></a>
# **saveRoomQuotaSettings**
> TenantRoomQuotaSettingsWrapper saveRoomQuotaSettings (QuotaSettingsRequestsDto quotaSettingsRequestsDto)

Saves the room quota settings specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/save-room-quota-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quotaSettingsRequestsDto** | [**QuotaSettingsRequestsDto**](QuotaSettingsRequestsDto.md)|  | [optional] |

### Return type

[**TenantRoomQuotaSettingsWrapper**](TenantRoomQuotaSettingsWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val quotaSettingsRequestsDto : QuotaSettingsRequestsDto =  // QuotaSettingsRequestsDto | 

val result : TenantRoomQuotaSettingsWrapper = webService.saveRoomQuotaSettings(quotaSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTenantQuotaSettings"></a>
# **setTenantQuotaSettings**
> TenantQuotaSettingsWrapper setTenantQuotaSettings (TenantQuotaSettingsRequestsDto tenantQuotaSettingsRequestsDto)

Saves the tenant quota settings specified in the request to the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-quota-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantQuotaSettingsRequestsDto** | [**TenantQuotaSettingsRequestsDto**](TenantQuotaSettingsRequestsDto.md)|  | [optional] |

### Return type

[**TenantQuotaSettingsWrapper**](TenantQuotaSettingsWrapper.md)

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
val webService = apiClient.createWebservice(QuotaApi::class.java)
val tenantQuotaSettingsRequestsDto : TenantQuotaSettingsRequestsDto =  // TenantQuotaSettingsRequestsDto | 

val result : TenantQuotaSettingsWrapper = webService.setTenantQuotaSettings(tenantQuotaSettingsRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

