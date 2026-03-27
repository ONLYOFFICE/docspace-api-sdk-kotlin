# PaymentApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**buyWalletService**](PortalPaymentApi.md#buyWalletService) | **POST** api/2.0/portal/payment/buywalletservice | Purchases a wallet service with the specified quantity. |
| [**calculateWalletPayment**](PortalPaymentApi.md#calculateWalletPayment) | **PUT** api/2.0/portal/payment/calculatewallet | Calculate the wallet payment amount |
| [**changeTenantWalletServiceState**](PortalPaymentApi.md#changeTenantWalletServiceState) | **POST** api/2.0/portal/payment/servicestate | Change tenant wallet service state |
| [**createCustomerOperationsReport**](PortalPaymentApi.md#createCustomerOperationsReport) | **POST** api/2.0/portal/payment/customer/operationsreport | Start the customer operations report generation |
| [**getAiPrices**](PortalPaymentApi.md#getAiPrices) | **GET** api/2.0/portal/payment/ai-prices | Get AI model prices |
| [**getCheckoutSetupUrl**](PortalPaymentApi.md#getCheckoutSetupUrl) | **GET** api/2.0/portal/payment/checkoutsetupurl | Get the checkout setup page URL |
| [**getCustomerBalance**](PortalPaymentApi.md#getCustomerBalance) | **GET** api/2.0/portal/payment/customer/balance | Get the customer balance |
| [**getCustomerInfo**](PortalPaymentApi.md#getCustomerInfo) | **GET** api/2.0/portal/payment/customerinfo | Get the customer information |
| [**getCustomerOperations**](PortalPaymentApi.md#getCustomerOperations) | **GET** api/2.0/portal/payment/customer/operations | Get the customer operations |
| [**getCustomerOperationsReport**](PortalPaymentApi.md#getCustomerOperationsReport) | **GET** api/2.0/portal/payment/customer/operationsreport | Get the status of the customer operations report generation |
| [**getCustomerServiceQuota**](PortalPaymentApi.md#getCustomerServiceQuota) | **GET** api/2.0/portal/payment/customer/servicequota | Get the service quota |
| [**getPaymentAccount**](PortalPaymentApi.md#getPaymentAccount) | **GET** api/2.0/portal/payment/account | Get the payment account |
| [**getPaymentCurrencies**](PortalPaymentApi.md#getPaymentCurrencies) | **GET** api/2.0/portal/payment/currencies | Get currencies |
| [**getPaymentQuotas**](PortalPaymentApi.md#getPaymentQuotas) | **GET** api/2.0/portal/payment/quotas | Get quotas |
| [**getPaymentUrl**](PortalPaymentApi.md#getPaymentUrl) | **PUT** api/2.0/portal/payment/url | Get the payment page URL |
| [**getPortalPrices**](PortalPaymentApi.md#getPortalPrices) | **GET** api/2.0/portal/payment/prices | Get prices |
| [**getQuotaPaymentInformation**](PortalPaymentApi.md#getQuotaPaymentInformation) | **GET** api/2.0/portal/payment/quota | Get quota payment information |
| [**getRestrictedAiModels**](PortalPaymentApi.md#getRestrictedAiModels) | **GET** api/2.0/portal/payment/ai-model/restrictions | Get restricted AI models |
| [**getTenantWalletServiceSettings**](PortalPaymentApi.md#getTenantWalletServiceSettings) | **GET** api/2.0/portal/payment/servicessettings | Gets the wallet service settings for the tenant. |
| [**getTenantWalletSettings**](PortalPaymentApi.md#getTenantWalletSettings) | **GET** api/2.0/portal/payment/topupsettings | Gets the tenant wallet auto top up settings |
| [**getWalletService**](PortalPaymentApi.md#getWalletService) | **GET** api/2.0/portal/payment/walletservice | Get wallet service |
| [**getWalletServices**](PortalPaymentApi.md#getWalletServices) | **GET** api/2.0/portal/payment/walletservices | Get wallet services |
| [**sendPaymentRequest**](PortalPaymentApi.md#sendPaymentRequest) | **POST** api/2.0/portal/payment/request | Send a payment request |
| [**setRestrictedAiModels**](PortalPaymentApi.md#setRestrictedAiModels) | **PUT** api/2.0/portal/payment/ai-model/restrictions | Set restricted AI models |
| [**setTenantWalletSettings**](PortalPaymentApi.md#setTenantWalletSettings) | **POST** api/2.0/portal/payment/topupsettings | Set the wallet auto top up settings |
| [**terminateCustomerOperationsReport**](PortalPaymentApi.md#terminateCustomerOperationsReport) | **DELETE** api/2.0/portal/payment/customer/operationsreport | Terminate the customer operations report generation |
| [**topUpDeposit**](PortalPaymentApi.md#topUpDeposit) | **POST** api/2.0/portal/payment/deposit | Put money on deposit |
| [**updatePayment**](PortalPaymentApi.md#updatePayment) | **PUT** api/2.0/portal/payment/update | Update the payment quantity |
| [**updateWalletPayment**](PortalPaymentApi.md#updateWalletPayment) | **PUT** api/2.0/portal/payment/updatewallet | Update the wallet payment quantity |



<a id="buyWalletService"></a>
# **buyWalletService**
> ServicePaymentWrapper buyWalletService (BuyWalletServiceRequestDto buyWalletServiceRequestDto)

This method processes a payment for a wallet service using the configured payment method.  Requires the tariff service to be configured and a valid payment method to be set for the customer.  Rate limiting is applied according to the payments API policy.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/buy-wallet-service/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **buyWalletServiceRequestDto** | [**BuyWalletServiceRequestDto**](BuyWalletServiceRequestDto.md)|  | [optional] |

### Return type

[**ServicePaymentWrapper**](ServicePaymentWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val buyWalletServiceRequestDto : BuyWalletServiceRequestDto =  // BuyWalletServiceRequestDto | 

launch(Dispatchers.IO) {
    val result : ServicePaymentWrapper = webService.buyWalletService(buyWalletServiceRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="calculateWalletPayment"></a>
# **calculateWalletPayment**
> PaymentCalculationWrapper calculateWalletPayment (WalletQuantityRequestDto walletQuantityRequestDto)

Calculates an amount of the wallet payment with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-wallet-payment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **walletQuantityRequestDto** | [**WalletQuantityRequestDto**](WalletQuantityRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val walletQuantityRequestDto : WalletQuantityRequestDto =  // WalletQuantityRequestDto | 

launch(Dispatchers.IO) {
    val result : PaymentCalculationWrapper = webService.calculateWalletPayment(walletQuantityRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeTenantWalletServiceState"></a>
# **changeTenantWalletServiceState**
> TenantWalletServiceSettingsWrapper changeTenantWalletServiceState (ChangeWalletServiceStateRequestDto changeWalletServiceStateRequestDto)

Changes the state of a wallet service for the current tenant.  Requires permission to edit portal settings and a configured tariff service.  Adds or removes the specified service from the enabled services list based on the enabled flag.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/change-tenant-wallet-service-state/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeWalletServiceStateRequestDto** | [**ChangeWalletServiceStateRequestDto**](ChangeWalletServiceStateRequestDto.md)|  | [optional] |

### Return type

[**TenantWalletServiceSettingsWrapper**](TenantWalletServiceSettingsWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val changeWalletServiceStateRequestDto : ChangeWalletServiceStateRequestDto =  // ChangeWalletServiceStateRequestDto | 

launch(Dispatchers.IO) {
    val result : TenantWalletServiceSettingsWrapper = webService.changeTenantWalletServiceState(changeWalletServiceStateRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createCustomerOperationsReport"></a>
# **createCustomerOperationsReport**
> DocumentBuilderTaskWrapper createCustomerOperationsReport (CustomerOperationsReportRequestDto customerOperationsReportRequestDto)

Starts generating a customer operations report as an xlsx file and saves it in Documents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-operations-report/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerOperationsReportRequestDto** | [**CustomerOperationsReportRequestDto**](CustomerOperationsReportRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val customerOperationsReportRequestDto : CustomerOperationsReportRequestDto =  // CustomerOperationsReportRequestDto | 

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.createCustomerOperationsReport(customerOperationsReportRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getAiPrices"></a>
# **getAiPrices**
> AiPricesResponseWrapper getAiPrices ()

Retrieves the pricing information for AI models including chat, embedding, and web search services.  The prices are returned in the configured currency and normalized per million tokens.  Requires administrator permissions to access.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiPricesResponseWrapper**](AiPricesResponseWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : AiPricesResponseWrapper = webService.getAiPrices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCheckoutSetupUrl"></a>
# **getCheckoutSetupUrl**
> StringWrapper getCheckoutSetupUrl (kotlin.String backUrl)

Returns the URL to the checkout setup page.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backUrl** | **kotlin.String**| The URL where the user will be redirected after completing the setup. | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val backUrl : kotlin.String = https://example.com/setup/complete // kotlin.String | The URL where the user will be redirected after completing the setup.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getCheckoutSetupUrl(backUrl)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerBalance"></a>
# **getCustomerBalance**
> BalanceWrapper getCustomerBalance (kotlin.Boolean refresh)

Returns the customer balance from the accounting service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Specifies whether to refresh the payment information cache or not. | [optional] |

### Return type

[**BalanceWrapper**](BalanceWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to refresh the payment information cache or not.

launch(Dispatchers.IO) {
    val result : BalanceWrapper = webService.getCustomerBalance(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerInfo"></a>
# **getCustomerInfo**
> CustomerInfoWrapper getCustomerInfo (kotlin.Boolean refresh)

Returns the customer information.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Specifies whether to refresh the payment information cache or not. | [optional] |

### Return type

[**CustomerInfoWrapper**](CustomerInfoWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to refresh the payment information cache or not.

launch(Dispatchers.IO) {
    val result : CustomerInfoWrapper = webService.getCustomerInfo(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerOperations"></a>
# **getCustomerOperations**
> ReportWrapper getCustomerOperations (kotlin.Int offset, kotlin.Int limit, kotlin.String serviceName, kotlin.Boolean writeOffServiceQuota, java.time.OffsetDateTime startDate, java.time.OffsetDateTime endDate, kotlin.String participantName, kotlin.Boolean credit, kotlin.Boolean debit, OperationType types, OperationStatus status, kotlin.String orderBy, OperationOrderType orderType)

Returns the report of customer operations from the accounting service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**| The number of items to skip for pagination. The default value is 0. | [optional] |
| **limit** | **kotlin.Int**| The maximum number of items to return for pagination. The default value is 25. | [optional] |
| **serviceName** | **kotlin.String**| The service name. | [optional] |
| **writeOffServiceQuota** | **kotlin.Boolean**| Write-off of the quota for the service | [optional] |
| **startDate** | **java.time.OffsetDateTime**| The report start date. | [optional] |
| **endDate** | **java.time.OffsetDateTime**| The report end date. | [optional] |
| **participantName** | **kotlin.String**| The participant name. | [optional] |
| **credit** | **kotlin.Boolean**| Specifies whether to include credit operations in the report. | [optional] |
| **debit** | **kotlin.Boolean**| Specifies whether to include debit operations in the report. | [optional] |
| **types** | [**OperationType**](.md)| List of operation types to filter by. | [optional] [enum: 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072] |
| **status** | [**OperationStatus**](.md)| List of operation status to filter by. | [optional] [enum: 0, 1, 2, 4, 8] |
| **orderBy** | **kotlin.String**| The field to order by. | [optional] |
| **orderType** | [**OperationOrderType**](.md)| Order direction: Ascending or Descending. | [optional] [enum: 0, 1] |

### Return type

[**ReportWrapper**](ReportWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val offset : kotlin.Int = 0 // kotlin.Int | The number of items to skip for pagination. The default value is 0.
val limit : kotlin.Int = 25 // kotlin.Int | The maximum number of items to return for pagination. The default value is 25.
val serviceName : kotlin.String = backup // kotlin.String | The service name.
val writeOffServiceQuota : kotlin.Boolean = false // kotlin.Boolean | Write-off of the quota for the service
val startDate : java.time.OffsetDateTime = 2024-01-01T00:00Z // java.time.OffsetDateTime | The report start date.
val endDate : java.time.OffsetDateTime = 2024-01-31T23:59:59Z // java.time.OffsetDateTime | The report end date.
val participantName : kotlin.String = ACME Corp // kotlin.String | The participant name.
val credit : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include credit operations in the report.
val debit : kotlin.Boolean = false // kotlin.Boolean | Specifies whether to include debit operations in the report.
val types : OperationType = Any // OperationType | List of operation types to filter by.
val status : OperationStatus = Any // OperationStatus | List of operation status to filter by.
val orderBy : kotlin.String = StartDate // kotlin.String | The field to order by.
val orderType : OperationOrderType = Descending // OperationOrderType | Order direction: Ascending or Descending.

launch(Dispatchers.IO) {
    val result : ReportWrapper = webService.getCustomerOperations(offset, limit, serviceName, writeOffServiceQuota, startDate, endDate, participantName, credit, debit, types, status, orderBy, orderType)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerOperationsReport"></a>
# **getCustomerOperationsReport**
> DocumentBuilderTaskWrapper getCustomerOperationsReport ()

Returns the status of generating a customer operations report.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations-report/).

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.getCustomerOperationsReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerServiceQuota"></a>
# **getCustomerServiceQuota**
> BalanceWrapper getCustomerServiceQuota (kotlin.String serviceName, kotlin.Boolean refresh)

Returns the service quota from the accounting service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-quota/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceName** | **kotlin.String**| The service name. | [optional] |
| **refresh** | **kotlin.Boolean**| Specifies whether to refresh the payment information cache or not. | [optional] |

### Return type

[**BalanceWrapper**](BalanceWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val serviceName : kotlin.String = backup // kotlin.String | The service name.
val refresh : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to refresh the payment information cache or not.

launch(Dispatchers.IO) {
    val result : BalanceWrapper = webService.getCustomerServiceQuota(serviceName, refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentAccount"></a>
# **getPaymentAccount**
> StringWrapper getPaymentAccount (kotlin.String backUrl)

Returns the URL to the payment account.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backUrl** | **kotlin.String**| The URL where the user will be redirected after payment processing. | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val backUrl : kotlin.String = https://example.com // kotlin.String | The URL where the user will be redirected after payment processing.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getPaymentAccount(backUrl)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentCurrencies"></a>
# **getPaymentCurrencies**
> CurrenciesArrayWrapper getPaymentCurrencies ()

Returns the available portal currencies.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-currencies/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrenciesArrayWrapper**](CurrenciesArrayWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : CurrenciesArrayWrapper = webService.getPaymentCurrencies()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentQuotas"></a>
# **getPaymentQuotas**
> QuotaArrayWrapper getPaymentQuotas (kotlin.Boolean wallet)

Returns the available portal quotas.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **wallet** | **kotlin.Boolean**| Specifies whether to return the wallet quotas only. | [optional] |

### Return type

[**QuotaArrayWrapper**](QuotaArrayWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val wallet : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to return the wallet quotas only.

launch(Dispatchers.IO) {
    val result : QuotaArrayWrapper = webService.getPaymentQuotas(wallet)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentUrl"></a>
# **getPaymentUrl**
> StringWrapper getPaymentUrl (PaymentUrlRequestDto paymentUrlRequestDto)

Returns the URL to the payment page.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentUrlRequestDto** | [**PaymentUrlRequestDto**](PaymentUrlRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val paymentUrlRequestDto : PaymentUrlRequestDto =  // PaymentUrlRequestDto | 

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getPaymentUrl(paymentUrlRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getPortalPrices"></a>
# **getPortalPrices**
> GetPortalPrices200Response getPortalPrices ()

Returns the available portal prices.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-prices/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPortalPrices200Response**](GetPortalPrices200Response.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : GetPortalPrices200Response = webService.getPortalPrices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getQuotaPaymentInformation"></a>
# **getQuotaPaymentInformation**
> QuotaWrapper getQuotaPaymentInformation (kotlin.Boolean refresh)

Returns the payment information about the current portal quota.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Specifies whether to refresh the payment information cache or not. | [optional] |

### Return type

[**QuotaWrapper**](QuotaWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val refresh : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to refresh the payment information cache or not.

launch(Dispatchers.IO) {
    val result : QuotaWrapper = webService.getQuotaPaymentInformation(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getRestrictedAiModels"></a>
# **getRestrictedAiModels**
> RestrictedModelsResponseWrapper getRestrictedAiModels ()

Returns the list of AI chat model IDs that are restricted (disabled) for the current tenant.  Restricted models cannot be used for AI chat conversations by any user within the portal.  Only DocSpace administrators can access this endpoint.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestrictedModelsResponseWrapper**](RestrictedModelsResponseWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : RestrictedModelsResponseWrapper = webService.getRestrictedAiModels()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantWalletServiceSettings"></a>
# **getTenantWalletServiceSettings**
> TenantWalletServiceSettingsWrapper getTenantWalletServiceSettings ()

Retrieves configuration settings related to the wallet service associated with the current tenant.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-service-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantWalletServiceSettingsWrapper**](TenantWalletServiceSettingsWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : TenantWalletServiceSettingsWrapper = webService.getTenantWalletServiceSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantWalletSettings"></a>
# **getTenantWalletSettings**
> TenantWalletSettingsWrapper getTenantWalletSettings ()

Returns the wallet auto top up settings for the current tenant.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantWalletSettingsWrapper**](TenantWalletSettingsWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : TenantWalletSettingsWrapper = webService.getTenantWalletSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWalletService"></a>
# **getWalletService**
> WalletServiceWrapper getWalletService (TenantWalletService service)

Returns the specified wallet service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **service** | [**TenantWalletService**](.md)| The wallet service type. | [enum: -13, -12, -11] |

### Return type

[**WalletServiceWrapper**](WalletServiceWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val service : TenantWalletService = Storage // TenantWalletService | The wallet service type.

launch(Dispatchers.IO) {
    val result : WalletServiceWrapper = webService.getWalletService(service)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWalletServices"></a>
# **getWalletServices**
> WalletServiceArrayWrapper getWalletServices ()

Returns the available wallet services.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-services/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**WalletServiceArrayWrapper**](WalletServiceArrayWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    val result : WalletServiceArrayWrapper = webService.getWalletServices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="sendPaymentRequest"></a>
# **sendPaymentRequest**
> void sendPaymentRequest (SalesRequestsDto salesRequestsDto)

Sends a request for the portal payment.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salesRequestsDto** | [**SalesRequestsDto**](SalesRequestsDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val salesRequestsDto : SalesRequestsDto =  // SalesRequestsDto | 

launch(Dispatchers.IO) {
    webService.sendPaymentRequest(salesRequestsDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setRestrictedAiModels"></a>
# **setRestrictedAiModels**
> RestrictedModelsResponseWrapper setRestrictedAiModels (SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto)

Overwrites the entire set of restricted AI model IDs for the current tenant.  The request body must contain the complete desired set — to add a restriction, include the new model alongside existing ones;  to remove one, omit it. An empty set lifts all restrictions. Only the portal payer can perform this action.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setRestrictedAiModelsRequestDto** | [**SetRestrictedAiModelsRequestDto**](SetRestrictedAiModelsRequestDto.md)|  | [optional] |

### Return type

[**RestrictedModelsResponseWrapper**](RestrictedModelsResponseWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val setRestrictedAiModelsRequestDto : SetRestrictedAiModelsRequestDto =  // SetRestrictedAiModelsRequestDto | 

launch(Dispatchers.IO) {
    val result : RestrictedModelsResponseWrapper = webService.setRestrictedAiModels(setRestrictedAiModelsRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="setTenantWalletSettings"></a>
# **setTenantWalletSettings**
> TenantWalletSettingsWrapper setTenantWalletSettings (TenantWalletSettingsWrapper tenantWalletSettingsWrapper)

Updates the wallet auto top up settings for the current tenant.  Requires the tariff service to be configured and the user to be authorized as a payer.  Returns null if the tariff service is not configured or customer information/balance cannot be retrieved.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantWalletSettingsWrapper** | [**TenantWalletSettingsWrapper**](TenantWalletSettingsWrapper.md)|  | [optional] |

### Return type

[**TenantWalletSettingsWrapper**](TenantWalletSettingsWrapper.md)

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val tenantWalletSettingsWrapper : TenantWalletSettingsWrapper =  // TenantWalletSettingsWrapper | 

launch(Dispatchers.IO) {
    val result : TenantWalletSettingsWrapper = webService.setTenantWalletSettings(tenantWalletSettingsWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateCustomerOperationsReport"></a>
# **terminateCustomerOperationsReport**
> void terminateCustomerOperationsReport ()

Terminates generating a customer operations report.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-operations-report/).

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
val webService = apiClient.createWebservice(PaymentApi::class.java)

launch(Dispatchers.IO) {
    webService.terminateCustomerOperationsReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


<a id="topUpDeposit"></a>
# **topUpDeposit**
> BooleanWrapper topUpDeposit (TopUpDepositRequestDto topUpDepositRequestDto)

Returns the result of putting money on deposit.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/top-up-deposit/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topUpDepositRequestDto** | [**TopUpDepositRequestDto**](TopUpDepositRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val topUpDepositRequestDto : TopUpDepositRequestDto =  // TopUpDepositRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.topUpDeposit(topUpDepositRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updatePayment"></a>
# **updatePayment**
> BooleanWrapper updatePayment (QuantityRequestDto quantityRequestDto)

Updates the payment quantity with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-payment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quantityRequestDto** | [**QuantityRequestDto**](QuantityRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val quantityRequestDto : QuantityRequestDto =  // QuantityRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.updatePayment(quantityRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="updateWalletPayment"></a>
# **updateWalletPayment**
> BooleanWrapper updateWalletPayment (WalletQuantityRequestDto walletQuantityRequestDto)

Updates the wallet payment quantity with the parameters specified in the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/update-wallet-payment/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **walletQuantityRequestDto** | [**WalletQuantityRequestDto**](WalletQuantityRequestDto.md)|  | [optional] |

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
val webService = apiClient.createWebservice(PaymentApi::class.java)
val walletQuantityRequestDto : WalletQuantityRequestDto =  // WalletQuantityRequestDto | 

launch(Dispatchers.IO) {
    val result : BooleanWrapper = webService.updateWalletPayment(walletQuantityRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

