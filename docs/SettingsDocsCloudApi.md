# DocsCloudApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateDevPack**](SettingsDocsCloudApi.md#calculateDevPack) | **POST** api/2.0/settings/docscloud/calculatedevpack | Calculate the DocsCloud subscription switch cost |
| [**createTenantQuotaReport**](SettingsDocsCloudApi.md#createTenantQuotaReport) | **POST** api/2.0/settings/docscloud/tenant/quota/report | Start the DocsCloud tenant quota report generation |
| [**getTenant**](SettingsDocsCloudApi.md#getTenant) | **GET** api/2.0/settings/docscloud/tenant | Get the DocsCloud tenant |
| [**getTenantConfig**](SettingsDocsCloudApi.md#getTenantConfig) | **GET** api/2.0/settings/docscloud/tenant/config | Get the DocsCloud tenant configuration |
| [**getTenantInfo**](SettingsDocsCloudApi.md#getTenantInfo) | **GET** api/2.0/settings/docscloud/tenant/info | Get the DocsCloud tenant information |
| [**getTenantQuota**](SettingsDocsCloudApi.md#getTenantQuota) | **GET** api/2.0/settings/docscloud/tenant/quota | Get the DocsCloud tenant quota |
| [**getTenantQuotaReport**](SettingsDocsCloudApi.md#getTenantQuotaReport) | **GET** api/2.0/settings/docscloud/tenant/quota/report | Get the status of the DocsCloud tenant quota report generation |
| [**getTenantUsage**](SettingsDocsCloudApi.md#getTenantUsage) | **GET** api/2.0/settings/docscloud/tenant/usage | Get the DocsCloud tenant usage |
| [**startDocsCloudTrial**](SettingsDocsCloudApi.md#startDocsCloudTrial) | **POST** api/2.0/settings/docscloud/trial | Start the DocsCloud trial |
| [**switchToDevPack**](SettingsDocsCloudApi.md#switchToDevPack) | **POST** api/2.0/settings/docscloud/switchtodevpack | Switch the DocsCloud subscription to DocsCloudDevPack |
| [**terminateTenantQuotaReport**](SettingsDocsCloudApi.md#terminateTenantQuotaReport) | **DELETE** api/2.0/settings/docscloud/tenant/quota/report | Terminate the DocsCloud tenant quota report generation |
| [**updateTenantConfig**](SettingsDocsCloudApi.md#updateTenantConfig) | **PUT** api/2.0/settings/docscloud/tenant/config | Update the DocsCloud tenant configuration |



<a id="calculateDevPack"></a>
# **calculateDevPack**
> PaymentCalculationWrapper calculateDevPack (DocsCloudDevPackRequestDto docsCloudDevPackRequestDto)

Calculates the top-up cost of switching the current DocsCloud subscription to DocsCloudDevPack,  without making any changes. The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-dev-pack/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **docsCloudDevPackRequestDto** | [**DocsCloudDevPackRequestDto**](DocsCloudDevPackRequestDto.md)|  | [optional] |

### Return type

[**PaymentCalculationWrapper**](PaymentCalculationWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val docsCloudDevPackRequestDto : DocsCloudDevPackRequestDto =  // DocsCloudDevPackRequestDto | 

launch(Dispatchers.IO) {
    val result : PaymentCalculationWrapper = webService.calculateDevPack(docsCloudDevPackRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createTenantQuotaReport"></a>
# **createTenantQuotaReport**
> DocumentBuilderTaskWrapper createTenantQuotaReport ()

Starts generating the DocsCloud user quota report as an xlsx file and saves it in My Documents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-tenant-quota-report/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.createTenantQuotaReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenant"></a>
# **getTenant**
> DocsCloudTenantWrapper getTenant (kotlin.Boolean refresh)

Returns the DocsCloud tenant of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**DocsCloudTenantWrapper**](DocsCloudTenantWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DocsCloudTenantWrapper = webService.getTenant(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantConfig"></a>
# **getTenantConfig**
> DocsCloudConfigWrapper getTenantConfig (kotlin.Boolean refresh)

Returns the DocsCloud tenant configuration of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**DocsCloudConfigWrapper**](DocsCloudConfigWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DocsCloudConfigWrapper = webService.getTenantConfig(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantInfo"></a>
# **getTenantInfo**
> DocsCloudTenantInfoWrapper getTenantInfo (kotlin.Boolean refresh)

Returns the DocsCloud license and server information with usage statistics of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**DocsCloudTenantInfoWrapper**](DocsCloudTenantInfoWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DocsCloudTenantInfoWrapper = webService.getTenantInfo(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantQuota"></a>
# **getTenantQuota**
> DocsCloudQuotaWrapper getTenantQuota (kotlin.Boolean refresh)

Returns the DocsCloud user quota (active users) of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**DocsCloudQuotaWrapper**](DocsCloudQuotaWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DocsCloudQuotaWrapper = webService.getTenantQuota(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantQuotaReport"></a>
# **getTenantQuotaReport**
> DocumentBuilderTaskWrapper getTenantQuotaReport ()

Returns the status of generating the DocsCloud user quota report.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota-report/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentBuilderTaskWrapper**](DocumentBuilderTaskWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.getTenantQuotaReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantUsage"></a>
# **getTenantUsage**
> DocsCloudUsageWrapper getTenantUsage (kotlin.Boolean refresh)

Returns the DocsCloud usage statistics of the current portal.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-usage/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**|  | [optional] [default to false] |

### Return type

[**DocsCloudUsageWrapper**](DocsCloudUsageWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | 

launch(Dispatchers.IO) {
    val result : DocsCloudUsageWrapper = webService.getTenantUsage(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="startDocsCloudTrial"></a>
# **startDocsCloudTrial**
> BooleanWrapper startDocsCloudTrial ()

Starts the DocsCloud trial.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/start-docs-cloud-trial/).

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.startDocsCloudTrial()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="switchToDevPack"></a>
# **switchToDevPack**
> BooleanWrapper switchToDevPack (DocsCloudDevPackRequestDto docsCloudDevPackRequestDto)

Switches the current DocsCloud subscription to DocsCloudDevPack: charges the price difference  from the wallet and transfers the subscription (with its license) to the target product.  The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/switch-to-dev-pack/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **docsCloudDevPackRequestDto** | [**DocsCloudDevPackRequestDto**](DocsCloudDevPackRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val docsCloudDevPackRequestDto : DocsCloudDevPackRequestDto =  // DocsCloudDevPackRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.switchToDevPack(docsCloudDevPackRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateTenantQuotaReport"></a>
# **terminateTenantQuotaReport**
> void terminateTenantQuotaReport ()

Terminates generating the DocsCloud user quota report.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tenant-quota-report/).

### Parameters
This endpoint does not need any parameter.

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)

launch(Dispatchers.IO) {
    webService.terminateTenantQuotaReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="updateTenantConfig"></a>
# **updateTenantConfig**
> DocsCloudConfigWrapper updateTenantConfig (DocsCloudConfig docsCloudConfig)

Updates the DocsCloud tenant configuration of the current portal with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tenant-config/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **docsCloudConfig** | [**DocsCloudConfig**](DocsCloudConfig.md)|  | [optional] |

### Return type

[**DocsCloudConfigWrapper**](DocsCloudConfigWrapper.md)

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
val webService = apiClient.createWebservice(DocsCloudApi::class.java)
val docsCloudConfig : DocsCloudConfig =  // DocsCloudConfig | 

launch(Dispatchers.IO) {
    val result : DocsCloudConfigWrapper = webService.updateTenantConfig(docsCloudConfig)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

