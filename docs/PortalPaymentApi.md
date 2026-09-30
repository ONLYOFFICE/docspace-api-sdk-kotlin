# PaymentApi

All URIs are relative to *https://your-docspace.onlyoffice.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateWalletPayment**](PortalPaymentApi.md#calculateWalletPayment) | **PUT** api/2.0/portal/payment/calculatewallet | Calculate the wallet payment amount |
| [**changeTenantWalletServiceState**](PortalPaymentApi.md#changeTenantWalletServiceState) | **POST** api/2.0/portal/payment/servicestate | Switch a wallet service |
| [**createCustomerMonthlyUsageReport**](PortalPaymentApi.md#createCustomerMonthlyUsageReport) | **POST** api/2.0/portal/payment/customer/usage/monthly/report | Start the monthly usage report |
| [**createCustomerOperationsReport**](PortalPaymentApi.md#createCustomerOperationsReport) | **POST** api/2.0/portal/payment/customer/operationsreport | Start the operations report |
| [**createCustomerServiceUsageReport**](PortalPaymentApi.md#createCustomerServiceUsageReport) | **POST** api/2.0/portal/payment/customer/usage/report | Start the service usage report |
| [**getAccountingServicePrices**](PortalPaymentApi.md#getAccountingServicePrices) | **GET** api/2.0/portal/payment/accounting/prices/{serviceName} | Get the service prices from the accounting service |
| [**getActiveServices**](PortalPaymentApi.md#getActiveServices) | **GET** api/2.0/portal/payment/activeservices | Get the active wallet services |
| [**getAiPrices**](PortalPaymentApi.md#getAiPrices) | **GET** api/2.0/portal/payment/ai-prices | Get AI model prices |
| [**getCheckoutSetupUrl**](PortalPaymentApi.md#getCheckoutSetupUrl) | **GET** api/2.0/portal/payment/checkoutsetupurl | Get the checkout setup page URL |
| [**getCustomerBalance**](PortalPaymentApi.md#getCustomerBalance) | **GET** api/2.0/portal/payment/customer/balance | Get the customer balance |
| [**getCustomerInfo**](PortalPaymentApi.md#getCustomerInfo) | **GET** api/2.0/portal/payment/customerinfo | Get the customer information |
| [**getCustomerMonthlyUsage**](PortalPaymentApi.md#getCustomerMonthlyUsage) | **GET** api/2.0/portal/payment/customer/usage/monthly | Get the customer monthly usage |
| [**getCustomerMonthlyUsageReport**](PortalPaymentApi.md#getCustomerMonthlyUsageReport) | **GET** api/2.0/portal/payment/customer/usage/monthly/report | Get the monthly usage report status |
| [**getCustomerOperations**](PortalPaymentApi.md#getCustomerOperations) | **GET** api/2.0/portal/payment/customer/operations | Get the wallet operations |
| [**getCustomerOperationsReport**](PortalPaymentApi.md#getCustomerOperationsReport) | **GET** api/2.0/portal/payment/customer/operationsreport | Get the operations report status |
| [**getCustomerServiceUsage**](PortalPaymentApi.md#getCustomerServiceUsage) | **GET** api/2.0/portal/payment/customer/usage | Get the customer service usage |
| [**getCustomerServiceUsageReport**](PortalPaymentApi.md#getCustomerServiceUsageReport) | **GET** api/2.0/portal/payment/customer/usage/report | Get the service usage report status |
| [**getPaymentAccount**](PortalPaymentApi.md#getPaymentAccount) | **GET** api/2.0/portal/payment/account | Get the billing account page |
| [**getPaymentCurrencies**](PortalPaymentApi.md#getPaymentCurrencies) | **GET** api/2.0/portal/payment/currencies | Get the billing currencies |
| [**getPaymentQuotas**](PortalPaymentApi.md#getPaymentQuotas) | **GET** api/2.0/portal/payment/quotas | Get the purchasable quotas |
| [**getPaymentUrl**](PortalPaymentApi.md#getPaymentUrl) | **PUT** api/2.0/portal/payment/url | Get the payment page URL |
| [**getPortalPrices**](PortalPaymentApi.md#getPortalPrices) | **GET** api/2.0/portal/payment/prices | Get the product prices |
| [**getQuotaPaymentInformation**](PortalPaymentApi.md#getQuotaPaymentInformation) | **GET** api/2.0/portal/payment/quota | Get the current plan and limits |
| [**getRestrictedAiModels**](PortalPaymentApi.md#getRestrictedAiModels) | **GET** api/2.0/portal/payment/ai-model/restrictions | Get restricted AI models |
| [**getSubscriptionBalanceInfo**](PortalPaymentApi.md#getSubscriptionBalanceInfo) | **GET** api/2.0/portal/payment/subscription/balance | Get the subscription balance information |
| [**getTenantWalletServiceSettings**](PortalPaymentApi.md#getTenantWalletServiceSettings) | **GET** api/2.0/portal/payment/servicessettings | Get the wallet service settings |
| [**getTenantWalletSettings**](PortalPaymentApi.md#getTenantWalletSettings) | **GET** api/2.0/portal/payment/topupsettings | Get the auto top-up settings |
| [**getWalletService**](PortalPaymentApi.md#getWalletService) | **GET** api/2.0/portal/payment/walletservice | Get a wallet service |
| [**getWalletServices**](PortalPaymentApi.md#getWalletServices) | **GET** api/2.0/portal/payment/walletservices | Get wallet services |
| [**moveSubscriptionToWallet**](PortalPaymentApi.md#moveSubscriptionToWallet) | **POST** api/2.0/portal/payment/subscription/movetowallet | Move the subscription to the wallet |
| [**sendPaymentRequest**](PortalPaymentApi.md#sendPaymentRequest) | **POST** api/2.0/portal/payment/request | Contact the sales team |
| [**setRestrictedAiModels**](PortalPaymentApi.md#setRestrictedAiModels) | **PUT** api/2.0/portal/payment/ai-model/restrictions | Set restricted AI models |
| [**setTenantWalletSettings**](PortalPaymentApi.md#setTenantWalletSettings) | **POST** api/2.0/portal/payment/topupsettings | Set the auto top-up settings |
| [**terminateCustomerMonthlyUsageReport**](PortalPaymentApi.md#terminateCustomerMonthlyUsageReport) | **DELETE** api/2.0/portal/payment/customer/usage/monthly/report | Terminate the monthly usage report |
| [**terminateCustomerOperationsReport**](PortalPaymentApi.md#terminateCustomerOperationsReport) | **DELETE** api/2.0/portal/payment/customer/operationsreport | Terminate the operations report |
| [**terminateCustomerServiceUsageReport**](PortalPaymentApi.md#terminateCustomerServiceUsageReport) | **DELETE** api/2.0/portal/payment/customer/usage/report | Terminate the service usage report |
| [**topUpDeposit**](PortalPaymentApi.md#topUpDeposit) | **POST** api/2.0/portal/payment/deposit | Top up the wallet |
| [**updatePayment**](PortalPaymentApi.md#updatePayment) | **PUT** api/2.0/portal/payment/update | Change the subscription quantity |
| [**updateWalletPayment**](PortalPaymentApi.md#updateWalletPayment) | **PUT** api/2.0/portal/payment/updatewallet | Change a wallet service quantity |



<a id="calculateWalletPayment"></a>
# **calculateWalletPayment**
> PaymentCalculationWrapper calculateWalletPayment (WalletQuantityRequestDto walletQuantityRequestDto)

Prices a wallet-service purchase without making it: it returns what buying the requested number of units would  cost right now, so a client can show the amount before asking for a confirmation. Only `productQuantityType`  `Add` (1) is accepted, the quantity must be greater than zero, and the portal needs a billing customer whose  wallet has a sub-account in the accounting currency. The caller has to be a DocSpace administrator. Nothing is  bought, charged or written down - the call is read-only and may be repeated - and the purchase itself is  `PUT api/2.0/portal/payment/updatewallet`. The answer carries the amount with its currency, the quantity it  was computed for and the identifier of the calculation. It is the price of this moment and is not held: it can  differ by the time the purchase is made.

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

Switches one wallet service on or off for the portal: `service` names it and `enabled` says which way. The  portal needs a billing customer, and the caller needs both the permission to edit the portal settings and  DocSpace administrator rights. Order matters between the two AI services - AI tools has to be on before AI  search may be switched on, and switching AI tools off switches AI search off with it - so a request that  breaks that order is refused with 403. The call is mutating and idempotent: switching on a service that is  already on changes nothing. It is written to the portal audit trail, and switching AI tools notifies the  portal clients so the AI features appear or disappear for them without a reload. The whole updated set of  switched-on services comes back. Switching a service on does not buy it - its units are still bought with  `PUT api/2.0/portal/payment/updatewallet`.

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


<a id="createCustomerMonthlyUsageReport"></a>
# **createCustomerMonthlyUsageReport**
> DocumentBuilderTaskWrapper createCustomerMonthlyUsageReport (CustomerMonthlyUsageReportRequestDto customerMonthlyUsageReportRequestDto)

Queues the wallet spending added up per calendar month as an `xlsx` file and returns the task that will build  it; the file is not ready when the response arrives. The portal needs a billing customer and the caller has to  be a DocSpace administrator. The body takes only the period - `startDate` and `endDate`, both inclusive - and  an empty body covers everything from the portal creation date to now; the months are cut in the portal time  zone, exactly as in `GET api/2.0/portal/payment/customer/usage/monthly`. Poll  `GET api/2.0/portal/payment/customer/usage/monthly/report` until `isCompleted` is true, then take the file  from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents  section, where it counts against the portal storage like any other file. One monthly usage report per user is  tracked at a time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/usage/monthly/report` stops it. There is no service filter here: for a  report per service use `POST api/2.0/portal/payment/customer/usage/report`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-monthly-usage-report/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerMonthlyUsageReportRequestDto** | [**CustomerMonthlyUsageReportRequestDto**](CustomerMonthlyUsageReportRequestDto.md)|  | [optional] |

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
val customerMonthlyUsageReportRequestDto : CustomerMonthlyUsageReportRequestDto =  // CustomerMonthlyUsageReportRequestDto | 

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.createCustomerMonthlyUsageReport(customerMonthlyUsageReportRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="createCustomerOperationsReport"></a>
# **createCustomerOperationsReport**
> DocumentBuilderTaskWrapper createCustomerOperationsReport (CustomerOperationsReportRequestDto customerOperationsReportRequestDto)

Queues the history of the wallet movements as an `xlsx` file and returns the task that will build it; the file  is not ready when the response arrives. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/operations` -  the service names, the date range, the participant, the operation type and status, the credit and debit  directions and the ordering - and an empty body reports everything from the portal creation date to now; a  service name this installation does not sell fails with 404. Poll  `GET api/2.0/portal/payment/customer/operationsreport` until `isCompleted` is true, then take the file from  `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents section,  where it counts against the portal storage like any other file. One operations report per user is tracked at a  time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/operationsreport` stops it. A build that fails ends the task with  `error` filled in rather than failing this call.

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


<a id="createCustomerServiceUsageReport"></a>
# **createCustomerServiceUsageReport**
> DocumentBuilderTaskWrapper createCustomerServiceUsageReport (CustomerServiceUsageReportRequestDto customerServiceUsageReportRequestDto)

Queues the usage of the wallet services as an `xlsx` file and returns the task that will build it; the file is  not ready when the response arrives. The portal needs a billing customer and the caller has to be a DocSpace  administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/usage` - the service  names, the date range, the participant, the operation status, the usage metadata and the ordering - and an  empty body reports every service from the portal creation date to now; a service name this installation does  not sell fails with 404. Poll `GET api/2.0/portal/payment/customer/usage/report` until `isCompleted` is true,  then take the file from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's  own My documents section, where it counts against the portal storage like any other file. One service usage  report per user is tracked at a time - a call made while the previous one is still running answers with that  task - and `DELETE api/2.0/portal/payment/customer/usage/report` stops it. It is a different report from the  operations one and does not interfere with it: per-movement history is  `POST api/2.0/portal/payment/customer/operationsreport`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-service-usage-report/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerServiceUsageReportRequestDto** | [**CustomerServiceUsageReportRequestDto**](CustomerServiceUsageReportRequestDto.md)|  | [optional] |

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
val customerServiceUsageReportRequestDto : CustomerServiceUsageReportRequestDto =  // CustomerServiceUsageReportRequestDto | 

launch(Dispatchers.IO) {
    val result : DocumentBuilderTaskWrapper = webService.createCustomerServiceUsageReport(customerServiceUsageReportRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="getAccountingServicePrices"></a>
# **getAccountingServicePrices**
> ServicePriceInfoArrayWrapper getAccountingServicePrices (kotlin.String serviceName, kotlin.Boolean active)

Returns the portal's automatic wallet top-up settings: whether it is switched on, the balance that triggers  it, the balance it tops the wallet up to and the currency it charges in. Only a DocSpace administrator may  read it, no billing customer is needed, and the call is read-only. A portal that has never configured it gets  the defaults rather than an empty result, so `enabled` is the field that says whether anything happens at all.  Two of the values are kept by the portal itself and cannot be set through this API: `lowBalanceThreshold` is  the balance below which the portal warns its administrators by mail, and `lowBalanceNotified` says whether  that warning has already gone out for the current dip. Change the rest with  `POST api/2.0/portal/payment/topupsettings`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounting-service-prices/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceName** | **kotlin.String**| The service whose price list is read, named the way the billing catalogue names it, such as `ai-tools` or  `backup`. Take the value from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`; a name  the accounting service does not price yields an empty list rather than an error. | |
| **active** | **kotlin.Boolean**| Whether the answer is narrowed to the prices in force at the moment of the call. Leaving it false also  returns the retired and the not yet started ones, which is what pricing a movement recorded in the past  needs. | [optional] |

### Return type

[**ServicePriceInfoArrayWrapper**](ServicePriceInfoArrayWrapper.md)

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
val serviceName : kotlin.String = ai-tools // kotlin.String | The service whose price list is read, named the way the billing catalogue names it, such as `ai-tools` or  `backup`. Take the value from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`; a name  the accounting service does not price yields an empty list rather than an error.
val active : kotlin.Boolean = false // kotlin.Boolean | Whether the answer is narrowed to the prices in force at the moment of the call. Leaving it false also  returns the retired and the not yet started ones, which is what pricing a movement recorded in the past  needs.

launch(Dispatchers.IO) {
    val result : ServicePriceInfoArrayWrapper = webService.getAccountingServicePrices(serviceName, active)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getActiveServices"></a>
# **getActiveServices**
> ActiveServiceArrayWrapper getActiveServices ()

Lists the wallet services the portal is running right now: the add-ons its plan pays for that are in the  active state, plus the ones an administrator switched on by hand in the wallet service settings; the Docs Connect  trial is listed as well, although it is not paid from the wallet. Only a DocSpace administrator may call it,  no billing customer is needed for it, and the call is read-only. Every item names the service, its title and  the unit it is measured in, and says whether it is a subscription; a subscribed service also carries the limit  it grants and how much of it is used where that number is known - the editor seats and the editors currently  active for Docs Connect, the purchased units and the units already consumed for disk storage. A service listed  with no limit is one whose usage is not counted this way, not one without a limit. The catalogue of what could  be switched on is `GET api/2.0/portal/payment/walletservices`, and switching one is  `POST api/2.0/portal/payment/servicestate`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-active-services/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveServiceArrayWrapper**](ActiveServiceArrayWrapper.md)

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
    val result : ActiveServiceArrayWrapper = webService.getActiveServices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getAiPrices"></a>
# **getAiPrices**
> AiPricesWrapper getAiPrices ()

Returns the price list of the AI features the portal pays for out of its wallet: the chat models with the  price of their prompt and completion tokens, the embedding models, the image models with their per-image  price, and the web search providers with the price of one search. The installation needs both a billing  service and the AI gateway configured, otherwise the answer is 403, and only a DocSpace administrator may read  it; the call is read-only. Token prices are normalised per million tokens, and every price is in the single  `currency` the answer names. Each entry carries the model identifier to use when talking to the AI operations,  its display alias, its provider with the provider icon, and a link to the model's own page. It is a list of  what the models cost and not of what the portal spent - that is `GET api/2.0/portal/payment/customer/usage` -  and it says nothing about which of them are allowed here, which is  `GET api/2.0/portal/payment/ai-model/restrictions`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**AiPricesWrapper**](AiPricesWrapper.md)

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
    val result : AiPricesWrapper = webService.getAiPrices()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCheckoutSetupUrl"></a>
# **getCheckoutSetupUrl**
> StringWrapper getCheckoutSetupUrl (java.net.URI backUrl, java.net.URI successUrl)

Hands back the hosted page on which a payment method is attached to the portal's billing account, for the case  where money has to be taken later - a wallet top-up or an automatic one - rather than a plan bought now. A  portal that already has a payment method on file answers with an empty result; a DocSpace administrator may  ask for the page, but once the portal has a billing customer with an e-mail, only its payer may. The call  itself changes nothing and may be repeated: the payment method is stored by the payment provider when the  returned page is completed, after which `GET api/2.0/portal/payment/customerinfo` reports it as set. The URL  is absolute, carries the caller's e-mail, the language of the request and the currency of the region, and  redirects to `successUrl` or `backUrl` when the user finishes or cancels. It buys nothing - a plan is bought  with `PUT api/2.0/portal/payment/url`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backUrl** | **java.net.URI**| The absolute address the setup page sends the user back to when attaching a payment method is abandoned. It  has to be a well-formed URL and must be reachable by that user rather than by the portal. | |
| **successUrl** | **java.net.URI**| The absolute address the setup page sends the user to once the payment provider has stored the payment  method. Reaching it means a method is now on file, which `GET api/2.0/portal/payment/customerinfo` confirms;  nothing has been charged. | |

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
val backUrl : java.net.URI = https://example.com/payment/back // java.net.URI | The absolute address the setup page sends the user back to when attaching a payment method is abandoned. It  has to be a well-formed URL and must be reachable by that user rather than by the portal.
val successUrl : java.net.URI = https://example.com/payment/success // java.net.URI | The absolute address the setup page sends the user to once the payment provider has stored the payment  method. Reaching it means a method is now on file, which `GET api/2.0/portal/payment/customerinfo` confirms;  nothing has been charged.

launch(Dispatchers.IO) {
    val result : StringWrapper = webService.getCheckoutSetupUrl(backUrl, successUrl)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerBalance"></a>
# **getCustomerBalance**
> BalanceWrapper getCustomerBalance (kotlin.Boolean refresh)

Returns the money the portal has in its wallet as the accounting service holds it: the account with its own  currency, one sub-account per currency with the amount on it, and the most recent credit movement. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and a portal that  has never been a customer gets an empty result. The call is read-only. This balance is what the wallet  services are charged against, so it falls as they are used and rises with  `POST api/2.0/portal/payment/deposit`; the movements behind a change are listed by  `GET api/2.0/portal/payment/customer/operations`. Pass `refresh=true` to re-read it from the accounting  service rather than the cache - right after a top-up the cached figure is still the old one.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. | [optional] |

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
val refresh : kotlin.Boolean = true // kotlin.Boolean | Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read.

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

Returns the billing customer behind the portal: the e-mail its billing account is registered to, whether a  payment method is stored for it, and the portal user who is the payer of that account. Only a DocSpace  administrator may read it, and the call is read-only. The answer is empty in two ordinary cases - the  installation has no billing service configured at all, and the portal has never been a customer - so an empty  body is not an error. `payer` is filled in only when the billing e-mail belongs to a portal user; when it does  not, the e-mail is still shown but the field stays empty, and that is what makes every payer-only operation of  this group unreachable for everybody. `refresh=true` re-reads the customer from the billing provider instead  of the cache, which is worth doing right after a payment method has been attached.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. | [optional] |

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
val refresh : kotlin.Boolean = true // kotlin.Boolean | Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read.

launch(Dispatchers.IO) {
    val result : CustomerInfoWrapper = webService.getCustomerInfo(refresh)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerMonthlyUsage"></a>
# **getCustomerMonthlyUsage**
> CustomerMonthlyUsageArrayWrapper getCustomerMonthlyUsage (java.time.OffsetDateTime startDate, java.time.OffsetDateTime endDate)

Returns what the portal spent from its wallet added up per calendar month, so a client can draw a spending  chart without paging through every movement. Only a DocSpace administrator may read it, a portal with no  billing customer answers with an empty result, and the call is read-only. `startDate` and `endDate` bound the  period, both inclusive, and default to the portal creation date and the present moment; the months are cut in  the portal time zone, so a movement at the edge of a month falls where the portal sees it and not where UTC  does. Each item names its year and month, the total charged in it with the currency, and how many operations  that total came from. The movements behind a month are in `GET api/2.0/portal/payment/customer/operations`,  and the same figures as a file come from `POST api/2.0/portal/payment/customer/usage/monthly/report`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **startDate** | **java.time.OffsetDateTime**| The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date. | [optional] |
| **endDate** | **java.time.OffsetDateTime**| The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made. | [optional] |

### Return type

[**CustomerMonthlyUsageArrayWrapper**](CustomerMonthlyUsageArrayWrapper.md)

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
val startDate : java.time.OffsetDateTime = 2025-01-01T00:00:00Z // java.time.OffsetDateTime | The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date.
val endDate : java.time.OffsetDateTime = 2025-12-31T23:59:59Z // java.time.OffsetDateTime | The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made.

launch(Dispatchers.IO) {
    val result : CustomerMonthlyUsageArrayWrapper = webService.getCustomerMonthlyUsage(startDate, endDate)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerMonthlyUsageReport"></a>
# **getCustomerMonthlyUsageReport**
> DocumentBuilderTaskWrapper getCustomerMonthlyUsageReport ()

Returns the state of the `xlsx` monthly usage report this user started with  `POST api/2.0/portal/payment/customer/usage/monthly/report`: `percentage` while it is being built,  `isCompleted` when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in  the caller's My documents, and `error` when the build failed. The portal needs a billing customer and the  caller has to be a DocSpace administrator; the call is read-only and is the one to poll. The task is kept per  user and per report kind, so it reports neither another administrator's report nor the operations and service  usage ones, which have their own status operations. An empty result means this user has no monthly usage  report at all - none was started, or the finished one was already picked up or terminated. A completed task is  dropped as soon as the next report is started, so read the file link out of the same answer that first reports  `isCompleted`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage-report/).

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
    val result : DocumentBuilderTaskWrapper = webService.getCustomerMonthlyUsageReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerOperations"></a>
# **getCustomerOperations**
> ReportWrapper getCustomerOperations (kotlin.Int offset, kotlin.Int limit, kotlin.collections.List<kotlin.String> serviceName, java.time.OffsetDateTime startDate, java.time.OffsetDateTime endDate, kotlin.String participantName, kotlin.Boolean credit, kotlin.Boolean debit, OperationType type, OperationStatus status, kotlin.String orderBy, OperationOrderType orderType)

Lists the money movements on the portal's wallet - top-ups, the charges of the wallet services, refunds and  corrections - one page at a time, which is what a billing history is built from. Only a DocSpace administrator  may read it, a portal with no billing customer answers with an empty result, and the call is read-only. Every  filter is optional: `startDate` and `endDate` are read in the portal time zone and default to the portal  creation date and the present moment, `serviceName` narrows to particular wallet services and fails with 404  on a name this installation does not sell, `participantName`, `type` and `status` narrow to who caused a  movement and how it ended, and `credit` and `debit` include or exclude the two directions. `offset` and  `limit` page through the result and default to 0 and 25, `orderBy` and `orderType` sort it, and the answer  repeats them next to `totalQuantity`, `totalPage` and `currentPage` so a client can page without counting. The  same data as a downloadable file is `POST api/2.0/portal/payment/customer/operationsreport`, and the figures  added up per service are `GET api/2.0/portal/payment/customer/usage`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**| The number of movements to skip before the first one returned, for walking through a long history page by  page. Counted after the filters and the ordering are applied, and starts at 0 when omitted. | [optional] |
| **limit** | **kotlin.Int**| The maximum number of movements returned in one page. Defaults to 25 when omitted; the answer echoes the  window back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed  without counting the items. | [optional] |
| **serviceName** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The wallet services whose movements are kept, named the way the billing catalogue names them - `backup`,  `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field of  `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not sell  fails the call with 404, and an omitted list keeps every service. A bare string is accepted in place of an  array for backward compatibility. | [optional] |
| **startDate** | **java.time.OffsetDateTime**| The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, so a  movement at the edge of the period falls where the portal sees it; defaults to the portal creation date. | [optional] |
| **endDate** | **java.time.OffsetDateTime**| The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. | [optional] |
| **participantName** | **kotlin.String**| The participant whose movements are kept - the account the accounting service records as the cause of a  movement. A movement caused by a portal user carries that user ID here, and one caused by the portal itself  carries the customer name; surrounding whitespace is trimmed, and an omitted value keeps every participant. | [optional] |
| **credit** | **kotlin.Boolean**| Whether movements that add money to the wallet - top-ups, refunds and corrections in the portal's favour -  are kept. Both directions are reported when neither this nor `debit` is given. | [optional] |
| **debit** | **kotlin.Boolean**| Whether movements that take money out of the wallet - the charges of the wallet services - are kept. Both  directions are reported when neither this nor `credit` is given. | [optional] |
| **type** | [**OperationType**](.md)| The kind of movement to keep, which says what caused the money to move rather than how it ended. Every kind  is reported when it is omitted. | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19] |
| **status** | [**OperationStatus**](.md)| The outcome to keep. A movement that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted. | [optional] [enum: 0, 1, 2, 3] |
| **orderBy** | **kotlin.String**| The name of the field the movements are sorted by, spelled as the accounting service names it, such as  `StartDate` or `ServiceName`. Surrounding whitespace is trimmed, and the accounting service applies its own  ordering when this is omitted. | [optional] |
| **orderType** | [**OperationOrderType**](.md)| The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. | [optional] [enum: 0, 1] |

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
val offset : kotlin.Int = 0 // kotlin.Int | The number of movements to skip before the first one returned, for walking through a long history page by  page. Counted after the filters and the ordering are applied, and starts at 0 when omitted.
val limit : kotlin.Int = 25 // kotlin.Int | The maximum number of movements returned in one page. Defaults to 25 when omitted; the answer echoes the  window back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed  without counting the items.
val serviceName : kotlin.collections.List<kotlin.String> = [backup] // kotlin.collections.List<kotlin.String> | The wallet services whose movements are kept, named the way the billing catalogue names them - `backup`,  `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field of  `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not sell  fails the call with 404, and an omitted list keeps every service. A bare string is accepted in place of an  array for backward compatibility.
val startDate : java.time.OffsetDateTime = 2024-01-01T00:00:00Z // java.time.OffsetDateTime | The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, so a  movement at the edge of the period falls where the portal sees it; defaults to the portal creation date.
val endDate : java.time.OffsetDateTime = 2024-01-31T23:59:59Z // java.time.OffsetDateTime | The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made.
val participantName : kotlin.String = My Own Corporation // kotlin.String | The participant whose movements are kept - the account the accounting service records as the cause of a  movement. A movement caused by a portal user carries that user ID here, and one caused by the portal itself  carries the customer name; surrounding whitespace is trimmed, and an omitted value keeps every participant.
val credit : kotlin.Boolean = true // kotlin.Boolean | Whether movements that add money to the wallet - top-ups, refunds and corrections in the portal's favour -  are kept. Both directions are reported when neither this nor `debit` is given.
val debit : kotlin.Boolean = false // kotlin.Boolean | Whether movements that take money out of the wallet - the charges of the wallet services - are kept. Both  directions are reported when neither this nor `credit` is given.
val type : OperationType = ServicePayment // OperationType | The kind of movement to keep, which says what caused the money to move rather than how it ended. Every kind  is reported when it is omitted.
val status : OperationStatus = Completed // OperationStatus | The outcome to keep. A movement that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted.
val orderBy : kotlin.String = StartDate // kotlin.String | The name of the field the movements are sorted by, spelled as the accounting service names it, such as  `StartDate` or `ServiceName`. Surrounding whitespace is trimmed, and the accounting service applies its own  ordering when this is omitted.
val orderType : OperationOrderType = Descending // OperationOrderType | The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly.

launch(Dispatchers.IO) {
    val result : ReportWrapper = webService.getCustomerOperations(offset, limit, serviceName, startDate, endDate, participantName, credit, debit, type, status, orderBy, orderType)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerOperationsReport"></a>
# **getCustomerOperationsReport**
> DocumentBuilderTaskWrapper getCustomerOperationsReport ()

Returns the state of the `xlsx` wallet operations report this user started with  `POST api/2.0/portal/payment/customer/operationsreport`: `percentage` while it is being built, `isCompleted`  when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it never reports another administrator's report, nor the service usage and monthly usage ones, which  have their own status operations. An empty result means this user has no operations report at all - none was  started, or the finished one was already picked up or terminated. A completed task is dropped as soon as the  next report is started, so read the file link out of the same answer that first reports `isCompleted`.

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


<a id="getCustomerServiceUsage"></a>
# **getCustomerServiceUsage**
> CustomerServiceUsageReportWrapper getCustomerServiceUsage (kotlin.collections.List<kotlin.String> serviceName, kotlin.String participantName, OperationStatus status, java.time.OffsetDateTime startDate, java.time.OffsetDateTime endDate, kotlin.collections.Map<kotlin.String, kotlin.String?> metadata, kotlin.Int offset, kotlin.Int limit, kotlin.String orderBy, OperationOrderType orderType)

Returns how much of each wallet service the portal consumed and what that cost, added up per service instead  of listed per movement. Only a DocSpace administrator may read it, a portal with no billing customer answers  with an empty result, and the call is read-only. The filters are optional: `serviceName` narrows to particular  services and fails with 404 on a name this installation does not sell, `participantName` and `status` narrow  to who consumed and how the operation ended, `startDate` and `endDate` bound the period in the portal time  zone, `metadata` matches the key and value pairs a service records with its usage, and `offset`, `limit`,  `orderBy` and `orderType` page and sort the result. Amounts come with the unit the service is sold in, except  AI tools, whose consumption is reported in tokens rather than in AI credits. The individual charges behind  these totals are `GET api/2.0/portal/payment/customer/operations`, and the same figures as a downloadable file  are `POST api/2.0/portal/payment/customer/usage/report`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceName** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The wallet services whose consumption is added up, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list covers every service. | [optional] |
| **participantName** | **kotlin.String**| The participant whose consumption is added up - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value covers every participant. | [optional] |
| **status** | [**OperationStatus**](.md)| The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is counted when this is omitted. | [optional] [enum: 0, 1, 2, 3] |
| **startDate** | **java.time.OffsetDateTime**| The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date. | [optional] |
| **endDate** | **java.time.OffsetDateTime**| The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. | [optional] |
| **metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String?&gt;**](kotlin.String.md)| The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be counted. The keys are chosen by the service that writes them, so read them  off the `metadata` of the records already returned rather than guessing; an omitted map counts every record. | [optional] |
| **offset** | **kotlin.Int**| The number of per-service totals to skip before the first one returned. Counted after the filters and the  ordering are applied, and starts at 0 when omitted. | [optional] |
| **limit** | **kotlin.Int**| The maximum number of per-service totals returned in one page. Defaults to 25 when omitted; the answer echoes  the window back with its paging information, so the next `offset` can be computed without counting the items. | [optional] |
| **orderBy** | **kotlin.String**| The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted. | [optional] |
| **orderType** | [**OperationOrderType**](.md)| The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. | [optional] [enum: 0, 1] |

### Return type

[**CustomerServiceUsageReportWrapper**](CustomerServiceUsageReportWrapper.md)

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
val serviceName : kotlin.collections.List<kotlin.String> = [backup] // kotlin.collections.List<kotlin.String> | The wallet services whose consumption is added up, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list covers every service.
val participantName : kotlin.String = My Own Corporation // kotlin.String | The participant whose consumption is added up - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value covers every participant.
val status : OperationStatus = Completed // OperationStatus | The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is counted when this is omitted.
val startDate : java.time.OffsetDateTime = 2025-01-01T00:00:00Z // java.time.OffsetDateTime | The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date.
val endDate : java.time.OffsetDateTime = 2025-12-31T23:59:59Z // java.time.OffsetDateTime | The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made.
val metadata : kotlin.collections.Map<kotlin.String, kotlin.String?> = {"key1":"value1","key2":"value2"} // kotlin.collections.Map<kotlin.String, kotlin.String?> | The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be counted. The keys are chosen by the service that writes them, so read them  off the `metadata` of the records already returned rather than guessing; an omitted map counts every record.
val offset : kotlin.Int = 0 // kotlin.Int | The number of per-service totals to skip before the first one returned. Counted after the filters and the  ordering are applied, and starts at 0 when omitted.
val limit : kotlin.Int = 25 // kotlin.Int | The maximum number of per-service totals returned in one page. Defaults to 25 when omitted; the answer echoes  the window back with its paging information, so the next `offset` can be computed without counting the items.
val orderBy : kotlin.String = ServiceName // kotlin.String | The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted.
val orderType : OperationOrderType = Descending // OperationOrderType | The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly.

launch(Dispatchers.IO) {
    val result : CustomerServiceUsageReportWrapper = webService.getCustomerServiceUsage(serviceName, participantName, status, startDate, endDate, metadata, offset, limit, orderBy, orderType)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getCustomerServiceUsageReport"></a>
# **getCustomerServiceUsageReport**
> DocumentBuilderTaskWrapper getCustomerServiceUsageReport ()

Returns the state of the `xlsx` service usage report this user started with  `POST api/2.0/portal/payment/customer/usage/report`: `percentage` while it is being built, `isCompleted` when  it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it reports neither another administrator's report nor the operations and monthly usage ones, which  have their own status operations. An empty result means this user has no service usage report at all - none  was started, or the finished one was already picked up or terminated. A completed task is dropped as soon as  the next report is started, so read the file link out of the same answer that first reports `isCompleted`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage-report/).

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
    val result : DocumentBuilderTaskWrapper = webService.getCustomerServiceUsageReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentAccount"></a>
# **getPaymentAccount**
> StringWrapper getPaymentAccount (java.net.URI backUrl)

Hands back the address of the portal page on which the billing account is managed - the payment method on  file, the invoices and the receipts - so a client can link to it instead of assembling the address itself. The  portal must already have a billing customer: one that has never had it gets an empty result, and an  installation without a billing service answers 403. Only the payer or the portal owner may read it, and the  call changes nothing. The value is relative to the portal root (`payment.ashx`), and the optional `backUrl` is  appended to it as a query parameter so the page can send the user back where they came from. It is not a  checkout page: a plan is bought with `PUT api/2.0/portal/payment/url` and a payment method is attached with  `GET api/2.0/portal/payment/checkoutsetupurl`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backUrl** | **java.net.URI**| The absolute address the billing account page should offer as its way back. It is appended to the returned  portal-relative address as a query parameter rather than followed here, and omitting it yields the bare  address of the page. | [optional] |

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
val backUrl : java.net.URI = https://example.com // java.net.URI | The absolute address the billing account page should offer as its way back. It is appended to the returned  portal-relative address as a query parameter rather than followed here, and omitting it yields the bare  address of the page.

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

Tells a client which currency the portal is billed in: the default currency of the portal region always comes  first, followed by the currency resolved for the current request when that one differs, so the answer holds  one or two items. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Each item carries the country code of the region, the currency symbol and the  native name of the currency; the first item is the currency the amounts from  `GET api/2.0/portal/payment/prices` are expressed in. These are the currencies of the subscription prices, and  they are not the accounting currencies the wallet is topped up in - those come with the balance in  `GET api/2.0/portal/payment/customer/balance`.

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
> QuotaArrayWrapper getPaymentQuotas (kotlin.Boolean wallet, kotlin.Boolean additional)

Lists the quotas the portal can be put on - the paid plans and the wallet services - each with its price, its  features and the limits it grants, which is what a pricing page is built from. Nothing has to be called first,  the caller needs the permission to edit the portal settings, and the call is read-only. Only quotas marked  visible are listed, newest first, and the two optional filters narrow that: `wallet` selects the wallet  services (`true`) or the subscription plans (`false`), `additional` selects the add-ons to a plan (`true`) or  the plans themselves (`false`), and an omitted filter keeps both kinds. A portal on a non-profit quota is a  special case - asking for `additional=false` returns that single quota and nothing else, because no other plan  may be bought for it. The quota the portal is actually on is not marked here; read it from  `GET api/2.0/portal/payment/quota`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **wallet** | **kotlin.Boolean**| Which side of the catalogue is listed: `true` keeps the services paid out of the portal wallet, `false` keeps  the subscription plans, and omitting it keeps both. | [optional] |
| **additional** | **kotlin.Boolean**| Which layer of the catalogue is listed: `true` keeps the add-ons that extend a plan, `false` keeps the plans  themselves, and omitting it keeps both. | [optional] |

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
val wallet : kotlin.Boolean = true // kotlin.Boolean | Which side of the catalogue is listed: `true` keeps the services paid out of the portal wallet, `false` keeps  the subscription plans, and omitting it keeps both.
val additional : kotlin.Boolean = true // kotlin.Boolean | Which layer of the catalogue is listed: `true` keeps the add-ons that extend a plan, `false` keeps the plans  themselves, and omitting it keeps both.

launch(Dispatchers.IO) {
    val result : QuotaArrayWrapper = webService.getPaymentQuotas(wallet, additional)
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getPaymentUrl"></a>
# **getPaymentUrl**
> StringWrapper getPaymentUrl (PaymentUrlRequestDto paymentUrlRequestDto)

Starts the purchase of a monthly paid plan for this portal by handing back the hosted checkout page the buyer  has to open; nothing is bought until that page is completed. The portal must have no paid plan yet - a portal  whose plan is already paid gets an empty result and changes its subscription through  `PUT api/2.0/portal/payment/update` instead - and the product name in `quantity` must be one of the monthly,  non-wallet plans listed by `GET api/2.0/portal/payment/quotas`. Only a DocSpace administrator may call it. The  call itself changes nothing on the portal and may be repeated: the money is taken by the payment provider on  the checkout page, and the plan becomes active once the provider confirms it. The returned URL is absolute and  single-purpose - it carries the caller's e-mail, the language of the request and the currency of the request  region, and it redirects to `successUrl` or `backUrl` when the buyer finishes or cancels. Exactly one product  per call is accepted and its quantity has to be greater than zero; yearly and wallet products are refused, and  wallet services are bought with `PUT api/2.0/portal/payment/updatewallet` instead.

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

Lists what one unit of every purchasable product costs, keyed by the product name that `quantity` takes in the  purchase operations, so a client can price a plan or a wallet service without reading the whole quota list.  Nothing has to be called first, and the caller needs the permission to edit the portal settings, which portal  administrators and the owner have. The call is read-only. Prices are given in the one currency resolved for  this request from the portal region, which `GET api/2.0/portal/payment/currencies` reports; a product with no  price in that currency comes back as `0` rather than being left out, so a zero means unpriced and not free.  The list covers the products on offer, not the portal's own plan - the plan in force, with its limits and its  usage, is `GET api/2.0/portal/payment/quota`.

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

Returns the quota the portal is on right now - its paid plan or the free one - with everything a client needs  to render itself: the price, the features that are switched on, the limits they grant (rooms, storage in  bytes, users, administrators, AI) and how much of each is already used. Every signed-in member of the portal  reads it, so it is not restricted to administrators; only guests are refused with 403. The call is read-only.  The plan is served from the cache by default, which is what a start-up needs; `refresh=true` fetches it from  the billing service instead, so use that right after a purchase and not routinely, because it is a remote  call. The catalogue of the quotas that could be bought instead is `GET api/2.0/portal/payment/quotas`, and the  money side of the same portal - customer, wallet and balance - starts at  `GET api/2.0/portal/payment/customerinfo`.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refresh** | **kotlin.Boolean**| Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. | [optional] |

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
val refresh : kotlin.Boolean = true // kotlin.Boolean | Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read.

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

Returns the AI chat models that are barred on this portal - the ones no user of it may pick for a  conversation, whatever the price list offers. Only a DocSpace administrator may read it, and the call is  read-only. When the installation has no billing service or AI is not enabled for the portal, the answer is an  empty set instead of an error, which is indistinguishable from a portal that restricts nothing. An empty  `models` therefore means every model in `GET api/2.0/portal/payment/ai-prices` may be used. The set names the  barred models and not the allowed ones; replace it with `PUT api/2.0/portal/payment/ai-model/restrictions`.

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


<a id="getSubscriptionBalanceInfo"></a>
# **getSubscriptionBalanceInfo**
> SubscriptionBalanceInfoWrapper getSubscriptionBalanceInfo ()

Reports in money how much of the portal's paid subscription period is still unused - the credit that  `POST api/2.0/portal/payment/subscription/movetowallet` would carry over to the wallet if the subscription  were ended now. The portal must have a billing customer and a plan in the paid state; a plan that is not paid  answers 402, and a paid plan without a subscription row gives 404. Only the payer - the portal user whose  e-mail is the billing customer's e-mail - may read it, and the call is read-only. The answer states the total  cost of the current period with its currency, the start and the end of that period in UTC, the moment the  unused part is measured up to, the days already elapsed, and the remaining balance both in the subscription  currency and converted to the wallet currency. Every figure is computed for the instant of the request, so it  changes between calls.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-subscription-balance-info/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**SubscriptionBalanceInfoWrapper**](SubscriptionBalanceInfoWrapper.md)

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
    val result : SubscriptionBalanceInfoWrapper = webService.getSubscriptionBalanceInfo()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getTenantWalletServiceSettings"></a>
# **getTenantWalletServiceSettings**
> TenantWalletServiceSettingsWrapper getTenantWalletServiceSettings ()

Returns which wallet services an administrator has switched on for this portal by hand, as opposed to the ones  its plan pays for. Only a DocSpace administrator may read it, an installation without a billing service  answers 403, no billing customer is needed, and the call is read-only. `enabledServices` holds the names of  those services and is empty when none was switched on. This is the stored setting and not the state of the  portal: a service the plan brings with it is active without appearing here, so the honest answer to what is  running is `GET api/2.0/portal/payment/activeservices`. One entry is changed with  `POST api/2.0/portal/payment/servicestate`.

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
> TenantWalletSettingsResponseWrapper getTenantWalletSettings ()

Returns the portal's automatic wallet top-up settings - whether it is on, the balance that triggers a  charge, the balance it is topped up to, and the currency both are expressed in. Any DocSpace  administrator may read them, and unlike the operation that changes them this one needs neither a  billing customer nor a configured billing service, so it answers on a portal that has never paid for  anything. It is read-only and changes nothing.  A portal that has never configured top-up gets the defaults rather than an empty result: `enabled` is  false, `currency` is null, and `minBalance` and `upToBalance` are 0. Those two zeros are outside the  ranges `POST api/2.0/portal/payment/topupsettings` accepts - 5 to 1000 and 6 to 5000 - so the answer  cannot be sent straight back to it; supply real values instead. `lastModified` is  `0001-01-01T00:00:00` until the settings are stored for the first time.  `lowBalanceThreshold` and `lowBalanceNotified` are maintained by the portal itself: they are reported  here, but ignored when the settings are written.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/).

### Parameters
This endpoint does not need any parameter.

### Return type

[**TenantWalletSettingsResponseWrapper**](TenantWalletSettingsResponseWrapper.md)

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
    val result : TenantWalletSettingsResponseWrapper = webService.getTenantWalletSettings()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="getWalletService"></a>
# **getWalletService**
> WalletServiceWrapper getWalletService (TenantWalletService service)

Returns one wallet service by name, for a client that already knows which service it needs and does not want  the whole catalogue. `service` is the name of the service - `Storage`, `Backup`, `AITools`, `Admin`,  `DocsCloud`, `DocsCloudDevPack` or `AISearch` - and a name this installation does not sell answers 404.  Nothing has to be called first, the caller needs the permission to edit the portal settings, and the call is  read-only. The answer has the same shape as one item of `GET api/2.0/portal/payment/walletservices` - the  price of a unit, the unit, the limits the service grants and its service name - except that the variants of a  service are not grouped into `innerServices` here, because a single service is looked up directly. The price  is in the currency resolved for the request.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **service** | [**TenantWalletService**](.md)| The service to look up, given by its catalogue name. A service this installation does not sell answers 404,  and the whole catalogue is `GET api/2.0/portal/payment/walletservices`. | [enum: -18, -16, -15, -14, -13, -12, -11] |

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
val service : TenantWalletService = Storage // TenantWalletService | The service to look up, given by its catalogue name. A service this installation does not sell answers 404,  and the whole catalogue is `GET api/2.0/portal/payment/walletservices`.

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

Lists every service the portal may pay for out of its wallet - extra administrators, disk storage, backup, AI  tools, AI search and Docs Connect - with the price of a unit, the unit it is sold in and whether the portal has  it switched on. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Services that are variants of one another are folded together: the visible one  carries the rest in its `innerServices`, so a client renders one card per group. The AI services are left out  entirely when AI is not enabled for the portal. This is the catalogue and not the state of the portal - what  is actually running is `GET api/2.0/portal/payment/activeservices`, one service on its own is  `GET api/2.0/portal/payment/walletservice`, and switching one on or off is  `POST api/2.0/portal/payment/servicestate`.

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


<a id="moveSubscriptionToWallet"></a>
# **moveSubscriptionToWallet**
> BooleanWrapper moveSubscriptionToWallet (QuantityRequestDto quantityRequestDto)

Ends the portal's paid subscription and moves it onto the wallet: the unused balance of the running period is  credited to the wallet, the wallet is topped up from the payment method on file if that credit does not cover  the purchase, and the requested number of administrators is then bought as a wallet service. The portal needs  a billing customer with a payment method set and a plan in the paid state, `quantity` has to name the  administrators wallet product, and the number asked for may not be below the administrators the portal already  has - read the credit that will be carried over from `GET api/2.0/portal/payment/subscription/balance` first.  Only the payer may call it. The call is mutating, spends money and cannot be undone: the subscription is ended  before the purchase is attempted, so a failure in the second half leaves the portal on the wallet with the  money credited but the administrators unbought, and a repeat would then buy them a second time. It is limited  to ten requests a minute per user by default. The result is `true` when the administrators were bought.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/move-subscription-to-wallet/).

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
    val result : BooleanWrapper = webService.moveSubscriptionToWallet(quantityRequestDto)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="sendPaymentRequest"></a>
# **sendPaymentRequest**
> void sendPaymentRequest (SalesRequestsDto salesRequestsDto)

Sends the portal's message to the ONLYOFFICE sales team - the contact-sales form behind a request for a quote,  an invoice or a plan that cannot be bought online. `email` has to be a well-formed address and is where the  answer will go, while `userName` and `message` say who is asking and what for; all three are required and none  may be empty. Only a DocSpace administrator may call it. Nothing on the portal changes: no plan, no quota and  no payment is touched, a message is mailed out and the request is written to the portal audit trail. There is  no response body - status 200 means the message was handed to the mail service - and the call is not  idempotent, so a repeat sends a second message. It is limited to ten requests a minute per user by default and  answers 429 above that.

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
 - **Accept**: application/json


<a id="setRestrictedAiModels"></a>
# **setRestrictedAiModels**
> RestrictedModelsResponseWrapper setRestrictedAiModels (SetRestrictedAiModelsRequestDto setRestrictedAiModelsRequestDto)

Replaces the whole set of AI chat models barred on this portal: the body is the complete set that is to hold,  so adding one restriction means sending the new model together with the ones already restricted, lifting one  means leaving it out, and an empty set lifts them all. Read the current set from  `GET api/2.0/portal/payment/ai-model/restrictions` and the model identifiers from  `GET api/2.0/portal/payment/ai-prices` before calling. The installation needs a billing service and the AI  gateway configured, the portal needs a billing customer, and the caller needs the permission to edit the  portal settings as well as DocSpace administrator rights. The call is mutating and idempotent - sending the  same set twice leaves the same state - and it is written to the portal audit trail. It takes effect on the  next AI request, so a conversation already open on a model that has just been barred cannot go on with it. The  stored set comes back in the answer.

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
> TenantWalletSettingsResponseWrapper setTenantWalletSettings (TenantWalletSettingsWrapper tenantWalletSettingsWrapper)

Switches the portal's automatic wallet top-up on or off and sets its thresholds: while it is on, the payment  method on file is charged whenever the wallet balance falls below `minBalance`, enough to bring it up to  `upToBalance`, in `currency`. The portal needs a billing customer whose wallet balance exists - a portal that  has never had one answers 404, so top the wallet up once with `POST api/2.0/portal/payment/deposit` first -  and only the payer may change the settings. The body replaces the stored settings as a whole and an omitted  body resets them to the defaults; `minBalance` is accepted between 5 and 1000 and `upToBalance` between 6 and  5000, while `lowBalanceThreshold` and `lowBalanceNotified` are ignored on the way in and kept as the portal  had them. The call is mutating and idempotent, it charges nothing by itself, it is written to the portal audit  trail, and switching the top-up on also re-arms the low-balance warning. The settings as they were stored come  back in the answer.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/).

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantWalletSettingsWrapper** | [**TenantWalletSettingsWrapper**](TenantWalletSettingsWrapper.md)|  | [optional] |

### Return type

[**TenantWalletSettingsResponseWrapper**](TenantWalletSettingsResponseWrapper.md)

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
    val result : TenantWalletSettingsResponseWrapper = webService.setTenantWalletSettings(tenantWalletSettingsWrapper)
}
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


<a id="terminateCustomerMonthlyUsageReport"></a>
# **terminateCustomerMonthlyUsageReport**
> void terminateCustomerMonthlyUsageReport ()

Stops the `xlsx` monthly usage report this user has running and drops its task, for a report that was started  for the wrong period or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/monthly/report` can still answer for a moment afterwards. The call  is safe to repeat and does nothing at all when this user has no such report running: there is no response  body, and status 200 says the stop was requested, not that a report was really stopped. It leaves the  operations and service usage reports alone, and a report that had already finished keeps its file in My  documents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-monthly-usage-report/).

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
    webService.terminateCustomerMonthlyUsageReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="terminateCustomerOperationsReport"></a>
# **terminateCustomerOperationsReport**
> void terminateCustomerOperationsReport ()

Stops the `xlsx` wallet operations report this user has running and drops its task, for a report that was  started with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has  to be a DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/operationsreport` can still answer for a moment afterwards. The call is  safe to repeat and does nothing at all when this user has no report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. A report that had already  finished keeps its file in My documents - nothing is deleted from there.

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
 - **Accept**: application/json


<a id="terminateCustomerServiceUsageReport"></a>
# **terminateCustomerServiceUsageReport**
> void terminateCustomerServiceUsageReport ()

Stops the `xlsx` service usage report this user has running and drops its task, for a report that was started  with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/report` can still answer for a moment afterwards. The call is safe  to repeat and does nothing at all when this user has no such report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. It leaves the operations and  monthly usage reports alone, and a report that had already finished keeps its file in My documents.

For more information, see [api.onlyoffice.com](https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-service-usage-report/).

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
    webService.terminateCustomerServiceUsageReport()
}
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a id="topUpDeposit"></a>
# **topUpDeposit**
> BooleanWrapper topUpDeposit (TopUpDepositRequestDto topUpDepositRequestDto)

Charges the payment method on file and adds the amount to the portal's wallet, the balance every wallet  service is paid from. The portal needs a billing customer with a payment method set - attach one with  `GET api/2.0/portal/payment/checkoutsetupurl` - `currency` has to be one of the accounting currencies this  installation supports, and `amount` is a whole number of currency units between 1 and 999999. Only the payer  may call it. The call takes money and is not idempotent in any way: two identical requests charge twice, so a  client must not retry it blindly after a timeout, and it is limited to ten requests a minute per user by  default. A successful top-up pushes the new balance to the portal clients over their socket connection and  re-arms the low-balance notification. The result is `true` when the payment provider accepted the charge; read  the resulting balance back from `GET api/2.0/portal/payment/customer/balance`.

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

Changes how many units of the plan the portal is paying for - the number of administrators it covers - and  lets the payment provider bill the difference against the payment method already on file. The portal must have  a billing customer and a plan bought through `PUT api/2.0/portal/payment/url`, and while the portal is on a  priced plan the product name in `quantity` has to be that same plan, which `GET api/2.0/portal/payment/quota`  reports, because a subscription is changed here and not swapped. Only the payer - the portal user whose e-mail  is the billing customer's e-mail - may call it. The call is mutating and charges money, and it is guarded  against a double submission: once the new quantity is in effect, repeating the same request fails with 400  because that quantity is already set. The result is `true` when the provider accepted the change and `false`  when it declined it without an error. Exactly one product per call is accepted, the operation is limited to  ten requests a minute per user by default and answers 429 above that, and wallet services are not bought here  - use `PUT api/2.0/portal/payment/updatewallet` for those.

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

Buys more units of a wallet service - extra administrators, disk storage, backup, AI tools, AI search or  Docs Connect - or writes down the quantity that service will have after the next renewal, depending on  `productQuantityType`. With `Add` (1) the units are bought at once and paid out of the portal wallet, so the  wallet needs a sub-account in the accounting currency and enough money on it; with `Set` (0) nothing is  charged now and the quantity only takes effect in the next period, where an empty or zero quantity cancels a  change scheduled earlier. `Renew` and `Sub` are not accepted here. The portal needs a billing customer and the  caller has to be a DocSpace administrator; a service that is an add-on to the plan also needs the plan itself  to be paid, otherwise the answer is 402. Minimum quantities apply - disk storage starts at 100 units, the  Docs Connect Dev Pack at 10, and the administrators may not be fewer than the portal already has - and in  the `Add` form they are checked only while the portal does not hold that service yet. Asking for the Docs Connect  plan in the `Set` form while Docs Connect Dev Pack is active schedules the reversion to it at the next period,  while the upgrade in the other direction is not done here at all: use  `POST api/2.0/settings/docscloud/switchtodevpack`. The result is `true` when the change was accepted; the call  is mutating, spends money in its `Add` form and is limited to ten requests a minute per user by default. Price  the same purchase without paying for it with `PUT api/2.0/portal/payment/calculatewallet`.

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

