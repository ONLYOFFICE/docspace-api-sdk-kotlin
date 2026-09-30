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

Returns the portal's per-user default storage quota: whether it is enabled and, if so, its size in bytes.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission); every other authenticated role, and an  anonymous caller, is refused. This is a read-only, idempotent call. When `enableQuota` is false, the size  value is not enforced and users get unlimited personal storage regardless of what it holds. The response  supports conditional requests: send the standard If-Modified-Since header with the previous `lastModified`  value, and an unchanged response comes back empty instead of resending the settings.

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

launch(Dispatchers.IO) {
    val result : TenantUserQuotaSettingsWrapper = webService.getUserQuotaSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="saveAiAgentQuotaSettings"></a>
# **saveAiAgentQuotaSettings**
> TenantAiAgentQuotaSettingsWrapper saveAiAgentQuotaSettings (QuotaSettingsRequestsDto quotaSettingsRequestsDto)

Sets the portal's default storage quota for AI agents, applied as the starting limit for newly created agents.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission), and on a paid SaaS tenant the portal's  plan must include the statistics feature, or the call is rejected as not covered by the plan. The requested  size cannot exceed the portal's own total storage quota, nor, on a Standalone install with a portal-wide quota  enabled, that quota's size. Disable enforcement by passing `enableQuota=false`; the size is then ignored for  new agents. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved settings, not any agent's current usage.

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

launch(Dispatchers.IO) {
    val result : TenantAiAgentQuotaSettingsWrapper = webService.saveAiAgentQuotaSettings(quotaSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="saveRoomQuotaSettings"></a>
# **saveRoomQuotaSettings**
> TenantRoomQuotaSettingsWrapper saveRoomQuotaSettings (QuotaSettingsRequestsDto quotaSettingsRequestsDto)

Sets the portal's default per-room storage quota, applied to newly created rooms as their starting limit.  Requires Owner or DocSpaceAdmin (the EditPortalSettings permission), and on a paid SaaS tenant the portal's  plan must include the statistics feature, or the call is rejected as not covered by the plan. The requested  size cannot exceed the portal's own total storage quota, nor, on a Standalone install with a portal-wide quota  enabled, that quota's size. Disable enforcement by passing `enableQuota=false`; the size is then ignored for  new rooms. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved settings, not the individual rooms' current usage.

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

launch(Dispatchers.IO) {
    val result : TenantRoomQuotaSettingsWrapper = webService.saveRoomQuotaSettings(quotaSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTenantQuotaSettings"></a>
# **setTenantQuotaSettings**
> TenantQuotaSettingsWrapper setTenantQuotaSettings (TenantQuotaSettingsRequestsDto tenantQuotaSettingsRequestsDto)

Sets or removes the storage quota for a given tenant. Available only on a Standalone (self-hosted)  installation; on SaaS the call is always refused. Requires a DocSpace administrator, and the portal's plan  must include the statistics feature or the call is rejected as not covered by the plan. Pass a non-negative  `quota` in bytes to enable the limit for the tenant identified by `tenantId`, or a negative value to remove  any limit. This is a mutating, idempotent call: sending the same body again leaves the quota unchanged. It  returns the saved quota settings for that tenant, not its current usage.

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

launch(Dispatchers.IO) {
    val result : TenantQuotaSettingsWrapper = webService.setTenantQuotaSettings(tenantQuotaSettingsRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

