# PaymentApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateWalletPayment**](PortalPaymentApi.md#calculateWalletPayment) | **PUT** api/2.0/portal/payment/calculatewallet | Calculate the wallet payment amount |
| [**changeTenantWalletServiceState**](PortalPaymentApi.md#changeTenantWalletServiceState) | **POST** api/2.0/portal/payment/servicestate | Change wallet service state |
| [**createCustomerOperationsReport**](PortalPaymentApi.md#createCustomerOperationsReport) | **POST** api/2.0/portal/payment/customer/operationsreport | Start the customer operations report generation |
| [**getCheckoutSetupUrl**](PortalPaymentApi.md#getCheckoutSetupUrl) | **GET** api/2.0/portal/payment/checkoutsetupurl | Get the checkout setup page URL |
| [**getCustomerBalance**](PortalPaymentApi.md#getCustomerBalance) | **GET** api/2.0/portal/payment/customer/balance | Get the customer balance |
| [**getCustomerInfo**](PortalPaymentApi.md#getCustomerInfo) | **GET** api/2.0/portal/payment/customerinfo | Get the customer information |
| [**getCustomerOperations**](PortalPaymentApi.md#getCustomerOperations) | **GET** api/2.0/portal/payment/customer/operations | Get the customer operations |
| [**getCustomerOperationsReport**](PortalPaymentApi.md#getCustomerOperationsReport) | **GET** api/2.0/portal/payment/customer/operationsreport | Get the status of the customer operations report generation |
| [**getPaymentAccount**](PortalPaymentApi.md#getPaymentAccount) | **GET** api/2.0/portal/payment/account | Get the payment account |
| [**getPaymentCurrencies**](PortalPaymentApi.md#getPaymentCurrencies) | **GET** api/2.0/portal/payment/currencies | Get currencies |
| [**getPaymentQuotas**](PortalPaymentApi.md#getPaymentQuotas) | **GET** api/2.0/portal/payment/quotas | Get quotas |
| [**getPaymentUrl**](PortalPaymentApi.md#getPaymentUrl) | **PUT** api/2.0/portal/payment/url | Get the payment page URL |
| [**getPortalPrices**](PortalPaymentApi.md#getPortalPrices) | **GET** api/2.0/portal/payment/prices | Get prices |
| [**getQuotaPaymentInformation**](PortalPaymentApi.md#getQuotaPaymentInformation) | **GET** api/2.0/portal/payment/quota | Get quota payment information |
| [**getTenantWalletServiceSettings**](PortalPaymentApi.md#getTenantWalletServiceSettings) | **GET** api/2.0/portal/payment/servicessettings | Get wallet services settings |
| [**getTenantWalletSettings**](PortalPaymentApi.md#getTenantWalletSettings) | **GET** api/2.0/portal/payment/topupsettings | Get wallet auto top-up settings |
| [**getWalletService**](PortalPaymentApi.md#getWalletService) | **GET** api/2.0/portal/payment/walletservice | Get wallet service |
| [**getWalletServices**](PortalPaymentApi.md#getWalletServices) | **GET** api/2.0/portal/payment/walletservices | Get wallet services |
| [**sendPaymentRequest**](PortalPaymentApi.md#sendPaymentRequest) | **POST** api/2.0/portal/payment/request | Send a payment request |
| [**setTenantWalletSettings**](PortalPaymentApi.md#setTenantWalletSettings) | **POST** api/2.0/portal/payment/topupsettings | Set wallet auto top-up settings |
| [**terminateCustomerOperationsReport**](PortalPaymentApi.md#terminateCustomerOperationsReport) | **DELETE** api/2.0/portal/payment/customer/operationsreport | Terminate the customer operations report generation |
| [**topUpDeposit**](PortalPaymentApi.md#topUpDeposit) | **POST** api/2.0/portal/payment/deposit | Put money on deposit |
| [**updatePayment**](PortalPaymentApi.md#updatePayment) | **PUT** api/2.0/portal/payment/update | Update the payment quantity |
| [**updateWalletPayment**](PortalPaymentApi.md#updateWalletPayment) | **PUT** api/2.0/portal/payment/updatewallet | Update the wallet payment quantity |



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

val result : PaymentCalculationWrapper = webService.calculateWalletPayment(walletQuantityRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="changeTenantWalletServiceState"></a>
# **changeTenantWalletServiceState**
> TenantWalletServiceSettingsWrapper changeTenantWalletServiceState (ChangeWalletServiceStateRequestDto changeWalletServiceStateRequestDto)

Changes the wallet service state.

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

val result : TenantWalletServiceSettingsWrapper = webService.changeTenantWalletServiceState(changeWalletServiceStateRequestDto)
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

val result : DocumentBuilderTaskWrapper = webService.createCustomerOperationsReport(customerOperationsReportRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
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
val backUrl : kotlin.String = some text // kotlin.String | The URL where the user will be redirected after completing the setup.

val result : StringWrapper = webService.getCheckoutSetupUrl(backUrl)
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

val result : BalanceWrapper = webService.getCustomerBalance(refresh)
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

val result : CustomerInfoWrapper = webService.getCustomerInfo(refresh)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerOperations"></a>
# **getCustomerOperations**
> ReportWrapper getCustomerOperations (java.time.OffsetDateTime startDate, java.time.OffsetDateTime endDate, kotlin.String participantName, kotlin.Boolean credit, kotlin.Boolean debit, kotlin.Int offset, kotlin.Int limit)

Returns the report of customer operations from the accounting service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/).

### Parameters
| **startDate** | **java.time.OffsetDateTime**| The report start date. | [optional] |
| **endDate** | **java.time.OffsetDateTime**| The report end date. | [optional] |
| **participantName** | **kotlin.String**| The participant name. | [optional] |
| **credit** | **kotlin.Boolean**| Specifies whether to include credit operations in the report. The default value is true. | [optional] |
| **debit** | **kotlin.Boolean**| Specifies whether to include debit operations in the report. The default value is true. | [optional] |
| **offset** | **kotlin.Int**| The number of items to skip for pagination. The default value is 0. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| The maximum number of items to return for pagination. The default value is 25. | [optional] |

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
val startDate : java.time.OffsetDateTime = 2008-04-10T06:30+04:00 // java.time.OffsetDateTime | The report start date.
val endDate : java.time.OffsetDateTime = 2008-04-10T06:30+04:00 // java.time.OffsetDateTime | The report end date.
val participantName : kotlin.String = some text // kotlin.String | The participant name.
val credit : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include credit operations in the report. The default value is true.
val debit : kotlin.Boolean = true // kotlin.Boolean | Specifies whether to include debit operations in the report. The default value is true.
val offset : kotlin.Int = 1234 // kotlin.Int | The number of items to skip for pagination. The default value is 0.
val limit : kotlin.Int = 1234 // kotlin.Int | The maximum number of items to return for pagination. The default value is 25.

val result : ReportWrapper = webService.getCustomerOperations(startDate, endDate, participantName, credit, debit, offset, limit)
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

val result : DocumentBuilderTaskWrapper = webService.getCustomerOperationsReport()
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
val backUrl : kotlin.String = some text // kotlin.String | The URL where the user will be redirected after payment processing.

val result : StringWrapper = webService.getPaymentAccount(backUrl)
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

val result : CurrenciesArrayWrapper = webService.getPaymentCurrencies()
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

val result : QuotaArrayWrapper = webService.getPaymentQuotas(wallet)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentUrl"></a>
# **getPaymentUrl**
> StringWrapper getPaymentUrl (PaymentUrlRequestsDto paymentUrlRequestsDto)

Returns the URL to the payment page.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentUrlRequestsDto** | [**PaymentUrlRequestsDto**](PaymentUrlRequestsDto.md)|  | [optional] |

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
val paymentUrlRequestsDto : PaymentUrlRequestsDto =  // PaymentUrlRequestsDto | 

val result : StringWrapper = webService.getPaymentUrl(paymentUrlRequestsDto)
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

val result : GetPortalPrices200Response = webService.getPortalPrices()
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

val result : QuotaWrapper = webService.getQuotaPaymentInformation(refresh)
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantWalletServiceSettings"></a>
# **getTenantWalletServiceSettings**
> TenantWalletServiceSettingsWrapper getTenantWalletServiceSettings ()

Returns the wallet services settings.

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

val result : TenantWalletServiceSettingsWrapper = webService.getTenantWalletServiceSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantWalletSettings"></a>
# **getTenantWalletSettings**
> TenantWalletSettingsWrapper getTenantWalletSettings ()

Returns the wallet auto top-up settings.

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

val result : TenantWalletSettingsWrapper = webService.getTenantWalletSettings()
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWalletService"></a>
# **getWalletService**
> QuotaWrapper getWalletService (TenantWalletService service)

Returns the specified wallet service.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **service** | [**TenantWalletService**](.md)| The wallet service type. | [enum: -14, -13, -12, -11] |

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
val service : TenantWalletService =  // TenantWalletService | The wallet service type.

val result : QuotaWrapper = webService.getWalletService(service)
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

val result : WalletServiceArrayWrapper = webService.getWalletServices()
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

webService.sendPaymentRequest(salesRequestsDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


<a id="setTenantWalletSettings"></a>
# **setTenantWalletSettings**
> TenantWalletSettingsWrapper setTenantWalletSettings (TenantWalletSettingsWrapper tenantWalletSettingsWrapper)

Sets the wallet auto top-up settings.

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

val result : TenantWalletSettingsWrapper = webService.setTenantWalletSettings(tenantWalletSettingsWrapper)
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

webService.terminateCustomerOperationsReport()
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

val result : BooleanWrapper = webService.topUpDeposit(topUpDepositRequestDto)
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

val result : BooleanWrapper = webService.updatePayment(quantityRequestDto)
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

val result : BooleanWrapper = webService.updateWalletPayment(walletQuantityRequestDto)
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

