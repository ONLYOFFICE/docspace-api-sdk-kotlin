# QuotaApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getPortalQuota**](PortalQuotaApi.md#getPortalQuota) | **GET** api/2.0/portal/quota | Get a portal quota |
| [**getPortalTariff**](PortalQuotaApi.md#getPortalTariff) | **GET** api/2.0/portal/tariff | Get a portal tariff |
| [**getPortalUsedSpace**](PortalQuotaApi.md#getPortalUsedSpace) | **GET** api/2.0/portal/usedspace | Get the portal used space |
| [**getRightQuota**](PortalQuotaApi.md#getRightQuota) | **GET** api/2.0/portal/quota/right | Get the recommended quota |



<a id="getPortalQuota"></a>
# **getPortalQuota**
> TenantQuotaWrapper getPortalQuota ()

Returns the current portal quota.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-quota/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantQuotaWrapper**](TenantQuotaWrapper.md)

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

val result : TenantQuotaWrapper = webService.getPortalQuota()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalTariff"></a>
# **getPortalTariff**
> TariffWrapper getPortalTariff (kotlin.Boolean refresh)

Returns the current portal tariff.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-tariff/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| The value indicating whether the current portal tariff information should be refreshed. | [optional] |

### Return type

[**TariffWrapper**](TariffWrapper.md)

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
val refresh : kotlin.Boolean = true // kotlin.Boolean | The value indicating whether the current portal tariff information should be refreshed.

val result : TariffWrapper = webService.getPortalTariff(refresh)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPortalUsedSpace"></a>
# **getPortalUsedSpace**
> DoubleWrapper getPortalUsedSpace ()

Returns the used space of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-used-space/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DoubleWrapper**](DoubleWrapper.md)

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

val result : DoubleWrapper = webService.getPortalUsedSpace()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRightQuota"></a>
# **getRightQuota**
> TenantQuotaWrapper getRightQuota ()

Returns the recommended quota for the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-right-quota/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantQuotaWrapper**](TenantQuotaWrapper.md)

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

val result : TenantQuotaWrapper = webService.getRightQuota()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

