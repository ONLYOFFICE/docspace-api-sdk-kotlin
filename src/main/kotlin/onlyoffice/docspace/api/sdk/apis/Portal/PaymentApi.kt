 /*
 * (c) Copyright Ascensio System SIA 2026
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ActiveServiceArrayWrapper
import onlyoffice.docspace.api.sdk.models.AiPricesWrapper
import onlyoffice.docspace.api.sdk.models.BalanceWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ChangeWalletServiceStateRequestDto
import onlyoffice.docspace.api.sdk.models.CurrenciesArrayWrapper
import onlyoffice.docspace.api.sdk.models.CustomerInfoWrapper
import onlyoffice.docspace.api.sdk.models.CustomerMonthlyUsageArrayWrapper
import onlyoffice.docspace.api.sdk.models.CustomerMonthlyUsageReportRequestDto
import onlyoffice.docspace.api.sdk.models.CustomerOperationsReportRequestDto
import onlyoffice.docspace.api.sdk.models.CustomerServiceUsageReportRequestDto
import onlyoffice.docspace.api.sdk.models.CustomerServiceUsageReportWrapper
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.GetPortalPrices200Response
import onlyoffice.docspace.api.sdk.models.OperationOrderType
import onlyoffice.docspace.api.sdk.models.OperationStatus
import onlyoffice.docspace.api.sdk.models.OperationType
import onlyoffice.docspace.api.sdk.models.PaymentCalculationWrapper
import onlyoffice.docspace.api.sdk.models.PaymentUrlRequestDto
import onlyoffice.docspace.api.sdk.models.QuantityRequestDto
import onlyoffice.docspace.api.sdk.models.QuotaArrayWrapper
import onlyoffice.docspace.api.sdk.models.QuotaWrapper
import onlyoffice.docspace.api.sdk.models.ReportWrapper
import onlyoffice.docspace.api.sdk.models.RestrictedModelsResponseWrapper
import onlyoffice.docspace.api.sdk.models.SalesRequestsDto
import onlyoffice.docspace.api.sdk.models.ServicePriceInfoArrayWrapper
import onlyoffice.docspace.api.sdk.models.SetRestrictedAiModelsRequestDto
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.SubscriptionBalanceInfoWrapper
import onlyoffice.docspace.api.sdk.models.TenantWalletService
import onlyoffice.docspace.api.sdk.models.TenantWalletServiceSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantWalletSettingsResponseWrapper
import onlyoffice.docspace.api.sdk.models.TenantWalletSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TopUpDepositRequestDto
import onlyoffice.docspace.api.sdk.models.WalletQuantityRequestDto
import onlyoffice.docspace.api.sdk.models.WalletServiceArrayWrapper
import onlyoffice.docspace.api.sdk.models.WalletServiceWrapper

interface PaymentApi {
    /**
     * PUT api/2.0/portal/payment/calculatewallet
     * Calculate the wallet payment amount
     * Prices a wallet-service purchase without making it: it returns what buying the requested number of units would  cost right now, so a client can show the amount before asking for a confirmation. Only `productQuantityType`  `Add` (1) is accepted, the quantity must be greater than zero, and the portal needs a billing customer whose  wallet has a sub-account in the accounting currency. The caller has to be a DocSpace administrator. Nothing is  bought, charged or written down - the call is read-only and may be repeated - and the purchase itself is  `PUT api/2.0/portal/payment/updatewallet`. The answer carries the amount with its currency, the quantity it  was computed for and the identifier of the calculation. It is the price of this moment and is not held: it can  differ by the time the purchase is made.
     * Responses:
     *  - 200: The amount the purchase would cost, its currency and the quantity it was calculated for
     *  - 400: The quantity type is not `Add`, the quantity is not greater than zero, or the product is not a wallet service
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or its wallet has no sub-account in the accounting currency
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for calculateWalletPayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-wallet-payment/
     *
     *
     * @param walletQuantityRequestDto  (optional)
     * @return [PaymentCalculationWrapper]
     */
    @PUT("api/2.0/portal/payment/calculatewallet")
    suspend fun calculateWalletPayment(@Body walletQuantityRequestDto: WalletQuantityRequestDto? = null): Response<PaymentCalculationWrapper>

    /**
     * POST api/2.0/portal/payment/servicestate
     * Switch a wallet service
     * Switches one wallet service on or off for the portal: `service` names it and `enabled` says which way. The  portal needs a billing customer, and the caller needs both the permission to edit the portal settings and  DocSpace administrator rights. Order matters between the two AI services - AI tools has to be on before AI  search may be switched on, and switching AI tools off switches AI search off with it - so a request that  breaks that order is refused with 403. The call is mutating and idempotent: switching on a service that is  already on changes nothing. It is written to the portal audit trail, and switching AI tools notifies the  portal clients so the AI features appear or disappear for them without a reload. The whole updated set of  switched-on services comes back. Switching a service on does not buy it - its units are still bought with  `PUT api/2.0/portal/payment/updatewallet`.
     * Responses:
     *  - 200: The whole set of wallet services switched on for the portal after the change
     *  - 403: The caller may not edit the portal settings or is not a DocSpace administrator, the portal has no billing service configured, or AI search was switched on while AI tools is off
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for changeTenantWalletServiceState Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-tenant-wallet-service-state/
     *
     *
     * @param changeWalletServiceStateRequestDto  (optional)
     * @return [TenantWalletServiceSettingsWrapper]
     */
    @POST("api/2.0/portal/payment/servicestate")
    suspend fun changeTenantWalletServiceState(@Body changeWalletServiceStateRequestDto: ChangeWalletServiceStateRequestDto? = null): Response<TenantWalletServiceSettingsWrapper>

    /**
     * POST api/2.0/portal/payment/customer/usage/monthly/report
     * Start the monthly usage report
     * Queues the wallet spending added up per calendar month as an `xlsx` file and returns the task that will build  it; the file is not ready when the response arrives. The portal needs a billing customer and the caller has to  be a DocSpace administrator. The body takes only the period - `startDate` and `endDate`, both inclusive - and  an empty body covers everything from the portal creation date to now; the months are cut in the portal time  zone, exactly as in `GET api/2.0/portal/payment/customer/usage/monthly`. Poll  `GET api/2.0/portal/payment/customer/usage/monthly/report` until `isCompleted` is true, then take the file  from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents  section, where it counts against the portal storage like any other file. One monthly usage report per user is  tracked at a time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/usage/monthly/report` stops it. There is no service filter here: for a  report per service use `POST api/2.0/portal/payment/customer/usage/report`.
     * Responses:
     *  - 200: The queued task, to be polled until `isCompleted` is true
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createCustomerMonthlyUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-monthly-usage-report/
     *
     *
     * @param customerMonthlyUsageReportRequestDto  (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/portal/payment/customer/usage/monthly/report")
    suspend fun createCustomerMonthlyUsageReport(@Body customerMonthlyUsageReportRequestDto: CustomerMonthlyUsageReportRequestDto? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * POST api/2.0/portal/payment/customer/operationsreport
     * Start the operations report
     * Queues the history of the wallet movements as an `xlsx` file and returns the task that will build it; the file  is not ready when the response arrives. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/operations` -  the service names, the date range, the participant, the operation type and status, the credit and debit  directions and the ordering - and an empty body reports everything from the portal creation date to now; a  service name this installation does not sell fails with 404. Poll  `GET api/2.0/portal/payment/customer/operationsreport` until `isCompleted` is true, then take the file from  `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's own My documents section,  where it counts against the portal storage like any other file. One operations report per user is tracked at a  time - a call made while the previous one is still running answers with that task - and  `DELETE api/2.0/portal/payment/customer/operationsreport` stops it. A build that fails ends the task with  `error` filled in rather than failing this call.
     * Responses:
     *  - 200: The queued task, to be polled until `isCompleted` is true
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or one of the names in `serviceName` is not a wallet service of this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-operations-report/
     *
     *
     * @param customerOperationsReportRequestDto  (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/portal/payment/customer/operationsreport")
    suspend fun createCustomerOperationsReport(@Body customerOperationsReportRequestDto: CustomerOperationsReportRequestDto? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * POST api/2.0/portal/payment/customer/usage/report
     * Start the service usage report
     * Queues the usage of the wallet services as an `xlsx` file and returns the task that will build it; the file is  not ready when the response arrives. The portal needs a billing customer and the caller has to be a DocSpace  administrator. The body takes the same filters as `GET api/2.0/portal/payment/customer/usage` - the service  names, the date range, the participant, the operation status, the usage metadata and the ordering - and an  empty body reports every service from the portal creation date to now; a service name this installation does  not sell fails with 404. Poll `GET api/2.0/portal/payment/customer/usage/report` until `isCompleted` is true,  then take the file from `resultFileUrl` or open `resultFileId`: the finished file is saved into the caller's  own My documents section, where it counts against the portal storage like any other file. One service usage  report per user is tracked at a time - a call made while the previous one is still running answers with that  task - and `DELETE api/2.0/portal/payment/customer/usage/report` stops it. It is a different report from the  operations one and does not interfere with it: per-movement history is  `POST api/2.0/portal/payment/customer/operationsreport`.
     * Responses:
     *  - 200: The queued task, to be polled until `isCompleted` is true
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or one of the names in `serviceName` is not a wallet service of this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createCustomerServiceUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-service-usage-report/
     *
     *
     * @param customerServiceUsageReportRequestDto  (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/portal/payment/customer/usage/report")
    suspend fun createCustomerServiceUsageReport(@Body customerServiceUsageReportRequestDto: CustomerServiceUsageReportRequestDto? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/accounting/prices/{serviceName}
     * Get the service prices from the accounting service
     * Returns the portal's automatic wallet top-up settings: whether it is switched on, the balance that triggers  it, the balance it tops the wallet up to and the currency it charges in. Only a DocSpace administrator may  read it, no billing customer is needed, and the call is read-only. A portal that has never configured it gets  the defaults rather than an empty result, so `enabled` is the field that says whether anything happens at all.  Two of the values are kept by the portal itself and cannot be set through this API: `lowBalanceThreshold` is  the balance below which the portal warns its administrators by mail, and `lowBalanceNotified` says whether  that warning has already gone out for the current dip. Change the rest with  `POST api/2.0/portal/payment/topupsettings`.
     * Responses:
     *  - 200: The list of the service prices
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAccountingServicePrices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-accounting-service-prices/
     *
     *
     * @param serviceName The service whose price list is read, named the way the billing catalogue names it, such as `ai-tools` or  `backup`. Take the value from the `serviceName` field of `GET api/2.0/portal/payment/walletservices`; a name  the accounting service does not price yields an empty list rather than an error.
     * @param active Whether the answer is narrowed to the prices in force at the moment of the call. Leaving it false also  returns the retired and the not yet started ones, which is what pricing a movement recorded in the past  needs. (optional)
     * @return [ServicePriceInfoArrayWrapper]
     */
    @GET("api/2.0/portal/payment/accounting/prices/{serviceName}")
    suspend fun getAccountingServicePrices(@Path("serviceName") serviceName: kotlin.String, @Query("active") active: kotlin.Boolean? = null): Response<ServicePriceInfoArrayWrapper>

    /**
     * GET api/2.0/portal/payment/activeservices
     * Get the active wallet services
     * Lists the wallet services the portal is running right now: the add-ons its plan pays for that are in the  active state, plus the ones an administrator switched on by hand in the wallet service settings; the Docs Connect  trial is listed as well, although it is not paid from the wallet. Only a DocSpace administrator may call it,  no billing customer is needed for it, and the call is read-only. Every item names the service, its title and  the unit it is measured in, and says whether it is a subscription; a subscribed service also carries the limit  it grants and how much of it is used where that number is known - the editor seats and the editors currently  active for Docs Connect, the purchased units and the units already consumed for disk storage. A service listed  with no limit is one whose usage is not counted this way, not one without a limit. The catalogue of what could  be switched on is `GET api/2.0/portal/payment/walletservices`, and switching one is  `POST api/2.0/portal/payment/servicestate`.
     * Responses:
     *  - 200: The wallet services active on the portal, with their limits and usage where those are known
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getActiveServices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-active-services/
     *
     *
     * @return [ActiveServiceArrayWrapper]
     */
    @GET("api/2.0/portal/payment/activeservices")
    suspend fun getActiveServices(): Response<ActiveServiceArrayWrapper>

    /**
     * GET api/2.0/portal/payment/ai-prices
     * Get AI model prices
     * Returns the price list of the AI features the portal pays for out of its wallet: the chat models with the  price of their prompt and completion tokens, the embedding models, the image models with their per-image  price, and the web search providers with the price of one search. The installation needs both a billing  service and the AI gateway configured, otherwise the answer is 403, and only a DocSpace administrator may read  it; the call is read-only. Token prices are normalised per million tokens, and every price is in the single  `currency` the answer names. Each entry carries the model identifier to use when talking to the AI operations,  its display alias, its provider with the provider icon, and a link to the model's own page. It is a list of  what the models cost and not of what the portal spent - that is `GET api/2.0/portal/payment/customer/usage` -  and it says nothing about which of them are allowed here, which is  `GET api/2.0/portal/payment/ai-model/restrictions`.
     * Responses:
     *  - 200: The prices of the chat, embedding and image models and of the web search providers, with the currency they are in
     *  - 403: The caller is not a DocSpace administrator, or the installation has no billing service or no AI gateway configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAiPrices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-ai-prices/
     *
     *
     * @return [AiPricesWrapper]
     */
    @GET("api/2.0/portal/payment/ai-prices")
    suspend fun getAiPrices(): Response<AiPricesWrapper>

    /**
     * GET api/2.0/portal/payment/checkoutsetupurl
     * Get the checkout setup page URL
     * Hands back the hosted page on which a payment method is attached to the portal's billing account, for the case  where money has to be taken later - a wallet top-up or an automatic one - rather than a plan bought now. A  portal that already has a payment method on file answers with an empty result; a DocSpace administrator may  ask for the page, but once the portal has a billing customer with an e-mail, only its payer may. The call  itself changes nothing and may be repeated: the payment method is stored by the payment provider when the  returned page is completed, after which `GET api/2.0/portal/payment/customerinfo` reports it as set. The URL  is absolute, carries the caller's e-mail, the language of the request and the currency of the region, and  redirects to `successUrl` or `backUrl` when the user finishes or cancels. It buys nothing - a plan is bought  with `PUT api/2.0/portal/payment/url`.
     * Responses:
     *  - 200: The absolute URL of the payment method setup page, or an empty result when the portal already has a payment method
     *  - 403: The caller is not a DocSpace administrator or, once a billing customer exists, not its payer; or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCheckoutSetupUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
     *
     *
     * @param backUrl The absolute address the setup page sends the user back to when attaching a payment method is abandoned. It  has to be a well-formed URL and must be reachable by that user rather than by the portal.
     * @param successUrl The absolute address the setup page sends the user to once the payment provider has stored the payment  method. Reaching it means a method is now on file, which `GET api/2.0/portal/payment/customerinfo` confirms;  nothing has been charged.
     * @return [StringWrapper]
     */
    @GET("api/2.0/portal/payment/checkoutsetupurl")
    suspend fun getCheckoutSetupUrl(@Query("BackUrl") backUrl: java.net.URI, @Query("SuccessUrl") successUrl: java.net.URI): Response<StringWrapper>

    /**
     * GET api/2.0/portal/payment/customer/balance
     * Get the customer balance
     * Returns the money the portal has in its wallet as the accounting service holds it: the account with its own  currency, one sub-account per currency with the amount on it, and the most recent credit movement. Only a  DocSpace administrator may read it, an installation without a billing service answers 403, and a portal that  has never been a customer gets an empty result. The call is read-only. This balance is what the wallet  services are charged against, so it falls as they are used and rises with  `POST api/2.0/portal/payment/deposit`; the movements behind a change are listed by  `GET api/2.0/portal/payment/customer/operations`. Pass `refresh=true` to re-read it from the accounting  service rather than the cache - right after a top-up the cached figure is still the old one.
     * Responses:
     *  - 200: The wallet account with its sub-account per currency, or an empty result when the portal has no billing customer
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerBalance Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
     *
     *
     * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
     * @return [BalanceWrapper]
     */
    @GET("api/2.0/portal/payment/customer/balance")
    suspend fun getCustomerBalance(@Query("refresh") refresh: kotlin.Boolean? = null): Response<BalanceWrapper>

    /**
     * GET api/2.0/portal/payment/customerinfo
     * Get the customer information
     * Returns the billing customer behind the portal: the e-mail its billing account is registered to, whether a  payment method is stored for it, and the portal user who is the payer of that account. Only a DocSpace  administrator may read it, and the call is read-only. The answer is empty in two ordinary cases - the  installation has no billing service configured at all, and the portal has never been a customer - so an empty  body is not an error. `payer` is filled in only when the billing e-mail belongs to a portal user; when it does  not, the e-mail is still shown but the field stays empty, and that is what makes every payer-only operation of  this group unreachable for everybody. `refresh=true` re-reads the customer from the billing provider instead  of the cache, which is worth doing right after a payment method has been attached.
     * Responses:
     *  - 200: The billing customer with its payer, or an empty result when the portal has no customer or billing is not configured
     *  - 403: The caller is not a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
     *
     *
     * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
     * @return [CustomerInfoWrapper]
     */
    @GET("api/2.0/portal/payment/customerinfo")
    suspend fun getCustomerInfo(@Query("refresh") refresh: kotlin.Boolean? = null): Response<CustomerInfoWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/monthly
     * Get the customer monthly usage
     * Returns what the portal spent from its wallet added up per calendar month, so a client can draw a spending  chart without paging through every movement. Only a DocSpace administrator may read it, a portal with no  billing customer answers with an empty result, and the call is read-only. `startDate` and `endDate` bound the  period, both inclusive, and default to the portal creation date and the present moment; the months are cut in  the portal time zone, so a movement at the edge of a month falls where the portal sees it and not where UTC  does. Each item names its year and month, the total charged in it with the currency, and how many operations  that total came from. The movements behind a month are in `GET api/2.0/portal/payment/customer/operations`,  and the same figures as a file come from `POST api/2.0/portal/payment/customer/usage/monthly/report`.
     * Responses:
     *  - 200: One item per calendar month that had spending, or an empty result when the portal has no billing customer
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerMonthlyUsage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage/
     *
     *
     * @param startDate The beginning of the reported period, inclusive. The months are cut in the portal time zone rather than in  UTC, so spending at the turn of a month falls where the portal sees it; defaults to the portal creation date. (optional)
     * @param endDate The end of the reported period, inclusive. Cut in the portal time zone in the same way as `startDate`, and  defaults to the moment the call is made. (optional)
     * @return [CustomerMonthlyUsageArrayWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage/monthly")
    suspend fun getCustomerMonthlyUsage(@Query("startDate") startDate: java.time.OffsetDateTime? = null, @Query("endDate") endDate: java.time.OffsetDateTime? = null): Response<CustomerMonthlyUsageArrayWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/monthly/report
     * Get the monthly usage report status
     * Returns the state of the `xlsx` monthly usage report this user started with  `POST api/2.0/portal/payment/customer/usage/monthly/report`: `percentage` while it is being built,  `isCompleted` when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in  the caller's My documents, and `error` when the build failed. The portal needs a billing customer and the  caller has to be a DocSpace administrator; the call is read-only and is the one to poll. The task is kept per  user and per report kind, so it reports neither another administrator's report nor the operations and service  usage ones, which have their own status operations. An empty result means this user has no monthly usage  report at all - none was started, or the finished one was already picked up or terminated. A completed task is  dropped as soon as the next report is started, so read the file link out of the same answer that first reports  `isCompleted`.
     * Responses:
     *  - 200: The state of this user's monthly usage report, or an empty result when there is none
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerMonthlyUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-monthly-usage-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage/monthly/report")
    suspend fun getCustomerMonthlyUsageReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/customer/operations
     * Get the wallet operations
     * Lists the money movements on the portal's wallet - top-ups, the charges of the wallet services, refunds and  corrections - one page at a time, which is what a billing history is built from. Only a DocSpace administrator  may read it, a portal with no billing customer answers with an empty result, and the call is read-only. Every  filter is optional: `startDate` and `endDate` are read in the portal time zone and default to the portal  creation date and the present moment, `serviceName` narrows to particular wallet services and fails with 404  on a name this installation does not sell, `participantName`, `type` and `status` narrow to who caused a  movement and how it ended, and `credit` and `debit` include or exclude the two directions. `offset` and  `limit` page through the result and default to 0 and 25, `orderBy` and `orderType` sort it, and the answer  repeats them next to `totalQuantity`, `totalPage` and `currentPage` so a client can page without counting. The  same data as a downloadable file is `POST api/2.0/portal/payment/customer/operationsreport`, and the figures  added up per service are `GET api/2.0/portal/payment/customer/usage`.
     * Responses:
     *  - 200: A page of wallet movements with its paging information, or an empty result when the portal has no billing customer
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: One of the names in `serviceName` is not a wallet service of this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerOperations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
     *
     *
     * @param offset The number of movements to skip before the first one returned, for walking through a long history page by  page. Counted after the filters and the ordering are applied, and starts at 0 when omitted. (optional)
     * @param limit The maximum number of movements returned in one page. Defaults to 25 when omitted; the answer echoes the  window back next to `totalQuantity`, `totalPage` and `currentPage`, so the next `offset` can be computed  without counting the items. (optional)
     * @param serviceName The wallet services whose movements are kept, named the way the billing catalogue names them - `backup`,  `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field of  `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not sell  fails the call with 404, and an omitted list keeps every service. A bare string is accepted in place of an  array for backward compatibility. (optional)
     * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, so a  movement at the edge of the period falls where the portal sees it; defaults to the portal creation date. (optional)
     * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
     * @param participantName The participant whose movements are kept - the account the accounting service records as the cause of a  movement. A movement caused by a portal user carries that user ID here, and one caused by the portal itself  carries the customer name; surrounding whitespace is trimmed, and an omitted value keeps every participant. (optional)
     * @param credit Whether movements that add money to the wallet - top-ups, refunds and corrections in the portal's favour -  are kept. Both directions are reported when neither this nor `debit` is given. (optional)
     * @param debit Whether movements that take money out of the wallet - the charges of the wallet services - are kept. Both  directions are reported when neither this nor `credit` is given. (optional)
     * @param type The kind of movement to keep, which says what caused the money to move rather than how it ended. Every kind  is reported when it is omitted. (optional)
     * @param status The outcome to keep. A movement that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is reported when this is omitted. (optional)
     * @param orderBy The name of the field the movements are sorted by, spelled as the accounting service names it, such as  `StartDate` or `ServiceName`. Surrounding whitespace is trimmed, and the accounting service applies its own  ordering when this is omitted. (optional)
     * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
     * @return [ReportWrapper]
     */
    @GET("api/2.0/portal/payment/customer/operations")
    suspend fun getCustomerOperations(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("ServiceName") serviceName: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("StartDate") startDate: java.time.OffsetDateTime? = null, @Query("EndDate") endDate: java.time.OffsetDateTime? = null, @Query("ParticipantName") participantName: kotlin.String? = null, @Query("Credit") credit: kotlin.Boolean? = null, @Query("Debit") debit: kotlin.Boolean? = null, @Query("Type") type: OperationType? = null, @Query("Status") status: OperationStatus? = null, @Query("OrderBy") orderBy: kotlin.String? = null, @Query("OrderType") orderType: OperationOrderType? = null): Response<ReportWrapper>

    /**
     * GET api/2.0/portal/payment/customer/operationsreport
     * Get the operations report status
     * Returns the state of the `xlsx` wallet operations report this user started with  `POST api/2.0/portal/payment/customer/operationsreport`: `percentage` while it is being built, `isCompleted`  when it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it never reports another administrator's report, nor the service usage and monthly usage ones, which  have their own status operations. An empty result means this user has no operations report at all - none was  started, or the finished one was already picked up or terminated. A completed task is dropped as soon as the  next report is started, so read the file link out of the same answer that first reports `isCompleted`.
     * Responses:
     *  - 200: The state of this user's operations report, or an empty result when there is none
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/portal/payment/customer/operationsreport")
    suspend fun getCustomerOperationsReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage
     * Get the customer service usage
     * Returns how much of each wallet service the portal consumed and what that cost, added up per service instead  of listed per movement. Only a DocSpace administrator may read it, a portal with no billing customer answers  with an empty result, and the call is read-only. The filters are optional: `serviceName` narrows to particular  services and fails with 404 on a name this installation does not sell, `participantName` and `status` narrow  to who consumed and how the operation ended, `startDate` and `endDate` bound the period in the portal time  zone, `metadata` matches the key and value pairs a service records with its usage, and `offset`, `limit`,  `orderBy` and `orderType` page and sort the result. Amounts come with the unit the service is sold in, except  AI tools, whose consumption is reported in tokens rather than in AI credits. The individual charges behind  these totals are `GET api/2.0/portal/payment/customer/operations`, and the same figures as a downloadable file  are `POST api/2.0/portal/payment/customer/usage/report`.
     * Responses:
     *  - 200: The usage and cost per wallet service with its paging information, or an empty result when the portal has no billing customer
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: One of the names in `serviceName` is not a wallet service of this installation
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerServiceUsage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage/
     *
     *
     * @param serviceName The wallet services whose consumption is added up, named the way the billing catalogue names them -  `backup`, `ai-tools`, `ai-search`, `disk-storage`, `docscloud`. Take the values from the `serviceName` field  of `GET api/2.0/portal/payment/walletservices`; the match ignores case, a name this installation does not  sell fails the call with 404, and an omitted list covers every service. (optional)
     * @param participantName The participant whose consumption is added up - the account the accounting service records as the consumer.  Consumption caused by a portal user carries that user ID here; surrounding whitespace is trimmed, and an  omitted value covers every participant. (optional)
     * @param status The outcome to keep. Consumption that is still being settled is reported as pending and may change later,  while the other outcomes are final; every outcome is counted when this is omitted. (optional)
     * @param startDate The beginning of the reported period, inclusive. Read in the portal time zone rather than in UTC, and  defaults to the portal creation date. (optional)
     * @param endDate The end of the reported period, inclusive. Read in the portal time zone rather than in UTC, and defaults to  the moment the call is made. (optional)
     * @param metadata The usage annotations a wallet service records alongside its consumption, as the key and value pairs that  must all match for a record to be counted. The keys are chosen by the service that writes them, so read them  off the `metadata` of the records already returned rather than guessing; an omitted map counts every record. (optional)
     * @param offset The number of per-service totals to skip before the first one returned. Counted after the filters and the  ordering are applied, and starts at 0 when omitted. (optional)
     * @param limit The maximum number of per-service totals returned in one page. Defaults to 25 when omitted; the answer echoes  the window back with its paging information, so the next `offset` can be computed without counting the items. (optional)
     * @param orderBy The name of the field the per-service totals are sorted by, spelled as the accounting service names it, such  as `ServiceName` or `StartDate`. Surrounding whitespace is trimmed, and the accounting service applies its  own ordering when this is omitted. (optional)
     * @param orderType The direction the field named in `orderBy` is sorted in. Newest or largest first is what the accounting  service does by default, so leaving this out sorts the same way as asking for descending explicitly. (optional)
     * @return [CustomerServiceUsageReportWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage")
    suspend fun getCustomerServiceUsage(@Query("ServiceName") serviceName: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("ParticipantName") participantName: kotlin.String? = null, @Query("Status") status: OperationStatus? = null, @Query("StartDate") startDate: java.time.OffsetDateTime? = null, @Query("EndDate") endDate: java.time.OffsetDateTime? = null, @Query("Metadata") metadata: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("OrderBy") orderBy: kotlin.String? = null, @Query("OrderType") orderType: OperationOrderType? = null): Response<CustomerServiceUsageReportWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/report
     * Get the service usage report status
     * Returns the state of the `xlsx` service usage report this user started with  `POST api/2.0/portal/payment/customer/usage/report`: `percentage` while it is being built, `isCompleted` when  it is done, `resultFileId`, `resultFileName` and `resultFileUrl` pointing at the file in the caller's My  documents, and `error` when the build failed. The portal needs a billing customer and the caller has to be a  DocSpace administrator; the call is read-only and is the one to poll. The task is kept per user and per report  kind, so it reports neither another administrator's report nor the operations and monthly usage ones, which  have their own status operations. An empty result means this user has no service usage report at all - none  was started, or the finished one was already picked up or terminated. A completed task is dropped as soon as  the next report is started, so read the file link out of the same answer that first reports `isCompleted`.
     * Responses:
     *  - 200: The state of this user's service usage report, or an empty result when there is none
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getCustomerServiceUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-service-usage-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage/report")
    suspend fun getCustomerServiceUsageReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/account
     * Get the billing account page
     * Hands back the address of the portal page on which the billing account is managed - the payment method on  file, the invoices and the receipts - so a client can link to it instead of assembling the address itself. The  portal must already have a billing customer: one that has never had it gets an empty result, and an  installation without a billing service answers 403. Only the payer or the portal owner may read it, and the  call changes nothing. The value is relative to the portal root (`payment.ashx`), and the optional `backUrl` is  appended to it as a query parameter so the page can send the user back where they came from. It is not a  checkout page: a plan is bought with `PUT api/2.0/portal/payment/url` and a payment method is attached with  `GET api/2.0/portal/payment/checkoutsetupurl`.
     * Responses:
     *  - 200: The portal-relative address of the billing account page, or an empty result when the portal has no billing customer
     *  - 403: The caller is neither the payer nor the portal owner, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPaymentAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
     *
     *
     * @param backUrl The absolute address the billing account page should offer as its way back. It is appended to the returned  portal-relative address as a query parameter rather than followed here, and omitting it yields the bare  address of the page. (optional)
     * @return [StringWrapper]
     */
    @GET("api/2.0/portal/payment/account")
    suspend fun getPaymentAccount(@Query("backUrl") backUrl: java.net.URI? = null): Response<StringWrapper>

    /**
     * GET api/2.0/portal/payment/currencies
     * Get the billing currencies
     * Tells a client which currency the portal is billed in: the default currency of the portal region always comes  first, followed by the currency resolved for the current request when that one differs, so the answer holds  one or two items. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Each item carries the country code of the region, the currency symbol and the  native name of the currency; the first item is the currency the amounts from  `GET api/2.0/portal/payment/prices` are expressed in. These are the currencies of the subscription prices, and  they are not the accounting currencies the wallet is topped up in - those come with the balance in  `GET api/2.0/portal/payment/customer/balance`.
     * Responses:
     *  - 200: The default currency of the portal region first, followed by the currency of the current request when it differs
     *  - 403: The caller may not edit the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPaymentCurrencies Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-currencies/
     *
     *
     * @return [CurrenciesArrayWrapper]
     */
    @GET("api/2.0/portal/payment/currencies")
    suspend fun getPaymentCurrencies(): Response<CurrenciesArrayWrapper>

    /**
     * GET api/2.0/portal/payment/quotas
     * Get the purchasable quotas
     * Lists the quotas the portal can be put on - the paid plans and the wallet services - each with its price, its  features and the limits it grants, which is what a pricing page is built from. Nothing has to be called first,  the caller needs the permission to edit the portal settings, and the call is read-only. Only quotas marked  visible are listed, newest first, and the two optional filters narrow that: `wallet` selects the wallet  services (`true`) or the subscription plans (`false`), `additional` selects the add-ons to a plan (`true`) or  the plans themselves (`false`), and an omitted filter keeps both kinds. A portal on a non-profit quota is a  special case - asking for `additional=false` returns that single quota and nothing else, because no other plan  may be bought for it. The quota the portal is actually on is not marked here; read it from  `GET api/2.0/portal/payment/quota`.
     * Responses:
     *  - 200: The visible quotas matching the filters, newest first, each with its price, features and limits
     *  - 403: The caller may not edit the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPaymentQuotas Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
     *
     *
     * @param wallet Which side of the catalogue is listed: `true` keeps the services paid out of the portal wallet, `false` keeps  the subscription plans, and omitting it keeps both. (optional)
     * @param additional Which layer of the catalogue is listed: `true` keeps the add-ons that extend a plan, `false` keeps the plans  themselves, and omitting it keeps both. (optional)
     * @return [QuotaArrayWrapper]
     */
    @GET("api/2.0/portal/payment/quotas")
    suspend fun getPaymentQuotas(@Query("wallet") wallet: kotlin.Boolean? = null, @Query("additional") additional: kotlin.Boolean? = null): Response<QuotaArrayWrapper>

    /**
     * PUT api/2.0/portal/payment/url
     * Get the payment page URL
     * Starts the purchase of a monthly paid plan for this portal by handing back the hosted checkout page the buyer  has to open; nothing is bought until that page is completed. The portal must have no paid plan yet - a portal  whose plan is already paid gets an empty result and changes its subscription through  `PUT api/2.0/portal/payment/update` instead - and the product name in `quantity` must be one of the monthly,  non-wallet plans listed by `GET api/2.0/portal/payment/quotas`. Only a DocSpace administrator may call it. The  call itself changes nothing on the portal and may be repeated: the money is taken by the payment provider on  the checkout page, and the plan becomes active once the provider confirms it. The returned URL is absolute and  single-purpose - it carries the caller's e-mail, the language of the request and the currency of the request  region, and it redirects to `successUrl` or `backUrl` when the buyer finishes or cancels. Exactly one product  per call is accepted and its quantity has to be greater than zero; yearly and wallet products are refused, and  wallet services are bought with `PUT api/2.0/portal/payment/updatewallet` instead.
     * Responses:
     *  - 200: The absolute URL of the checkout page to open, or an empty result when the portal already has a paid plan
     *  - 400: `quantity` holds more than one product, a quantity that is not greater than zero, or a product that is not a monthly plan
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPaymentUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/
     *
     *
     * @param paymentUrlRequestDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/portal/payment/url")
    suspend fun getPaymentUrl(@Body paymentUrlRequestDto: PaymentUrlRequestDto? = null): Response<StringWrapper>

    /**
     * GET api/2.0/portal/payment/prices
     * Get the product prices
     * Lists what one unit of every purchasable product costs, keyed by the product name that `quantity` takes in the  purchase operations, so a client can price a plan or a wallet service without reading the whole quota list.  Nothing has to be called first, and the caller needs the permission to edit the portal settings, which portal  administrators and the owner have. The call is read-only. Prices are given in the one currency resolved for  this request from the portal region, which `GET api/2.0/portal/payment/currencies` reports; a product with no  price in that currency comes back as `0` rather than being left out, so a zero means unpriced and not free.  The list covers the products on offer, not the portal's own plan - the plan in force, with its limits and its  usage, is `GET api/2.0/portal/payment/quota`.
     * Responses:
     *  - 200: Product name to the price of one unit in the currency of the request, `0` where the product has no price in it
     *  - 403: The caller may not edit the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalPrices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-prices/
     *
     *
     * @return [GetPortalPrices200Response]
     */
    @GET("api/2.0/portal/payment/prices")
    suspend fun getPortalPrices(): Response<GetPortalPrices200Response>

    /**
     * GET api/2.0/portal/payment/quota
     * Get the current plan and limits
     * Returns the quota the portal is on right now - its paid plan or the free one - with everything a client needs  to render itself: the price, the features that are switched on, the limits they grant (rooms, storage in  bytes, users, administrators, AI) and how much of each is already used. Every signed-in member of the portal  reads it, so it is not restricted to administrators; only guests are refused with 403. The call is read-only.  The plan is served from the cache by default, which is what a start-up needs; `refresh=true` fetches it from  the billing service instead, so use that right after a purchase and not routinely, because it is a remote  call. The catalogue of the quotas that could be bought instead is `GET api/2.0/portal/payment/quotas`, and the  money side of the same portal - customer, wallet and balance - starts at  `GET api/2.0/portal/payment/customerinfo`.
     * Responses:
     *  - 200: The quota the portal is on, with its price, features, limits and current usage
     *  - 403: The caller is a guest of this portal
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getQuotaPaymentInformation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
     *
     *
     * @param refresh Whether the answer is fetched from the billing service instead of the portal cache. The cached copy is what a  start-up needs and costs nothing; asking for a fresh one makes a remote call, so use it right after a  purchase or a top-up and not on every read. (optional)
     * @return [QuotaWrapper]
     */
    @GET("api/2.0/portal/payment/quota")
    suspend fun getQuotaPaymentInformation(@Query("refresh") refresh: kotlin.Boolean? = null): Response<QuotaWrapper>

    /**
     * GET api/2.0/portal/payment/ai-model/restrictions
     * Get restricted AI models
     * Returns the AI chat models that are barred on this portal - the ones no user of it may pick for a  conversation, whatever the price list offers. Only a DocSpace administrator may read it, and the call is  read-only. When the installation has no billing service or AI is not enabled for the portal, the answer is an  empty set instead of an error, which is indistinguishable from a portal that restricts nothing. An empty  `models` therefore means every model in `GET api/2.0/portal/payment/ai-prices` may be used. The set names the  barred models and not the allowed ones; replace it with `PUT api/2.0/portal/payment/ai-model/restrictions`.
     * Responses:
     *  - 200: The identifiers of the AI chat models barred on this portal, empty when none is
     *  - 403: The caller is not a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRestrictedAiModels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-restricted-ai-models/
     *
     *
     * @return [RestrictedModelsResponseWrapper]
     */
    @GET("api/2.0/portal/payment/ai-model/restrictions")
    suspend fun getRestrictedAiModels(): Response<RestrictedModelsResponseWrapper>

    /**
     * GET api/2.0/portal/payment/subscription/balance
     * Get the subscription balance information
     * Reports in money how much of the portal's paid subscription period is still unused - the credit that  `POST api/2.0/portal/payment/subscription/movetowallet` would carry over to the wallet if the subscription  were ended now. The portal must have a billing customer and a plan in the paid state; a plan that is not paid  answers 402, and a paid plan without a subscription row gives 404. Only the payer - the portal user whose  e-mail is the billing customer's e-mail - may read it, and the call is read-only. The answer states the total  cost of the current period with its currency, the start and the end of that period in UTC, the moment the  unused part is measured up to, the days already elapsed, and the remaining balance both in the subscription  currency and converted to the wallet currency. Every figure is computed for the instant of the request, so it  changes between calls.
     * Responses:
     *  - 200: The unused balance of the current subscription period with its period boundaries and currencies
     *  - 400: The plan currently paid is a wallet product or has no product identifier
     *  - 402: The plan of the portal is not in the paid state
     *  - 403: The caller is not the payer of this portal, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or its paid plan has no subscription
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getSubscriptionBalanceInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-subscription-balance-info/
     *
     *
     * @return [SubscriptionBalanceInfoWrapper]
     */
    @GET("api/2.0/portal/payment/subscription/balance")
    suspend fun getSubscriptionBalanceInfo(): Response<SubscriptionBalanceInfoWrapper>

    /**
     * GET api/2.0/portal/payment/servicessettings
     * Get the wallet service settings
     * Returns which wallet services an administrator has switched on for this portal by hand, as opposed to the ones  its plan pays for. Only a DocSpace administrator may read it, an installation without a billing service  answers 403, no billing customer is needed, and the call is read-only. `enabledServices` holds the names of  those services and is empty when none was switched on. This is the stored setting and not the state of the  portal: a service the plan brings with it is active without appearing here, so the honest answer to what is  running is `GET api/2.0/portal/payment/activeservices`. One entry is changed with  `POST api/2.0/portal/payment/servicestate`.
     * Responses:
     *  - 200: The wallet services switched on by hand for this portal
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantWalletServiceSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-service-settings/
     *
     *
     * @return [TenantWalletServiceSettingsWrapper]
     */
    @GET("api/2.0/portal/payment/servicessettings")
    suspend fun getTenantWalletServiceSettings(): Response<TenantWalletServiceSettingsWrapper>

    /**
     * GET api/2.0/portal/payment/topupsettings
     * Get the auto top-up settings
     * Returns the portal's automatic wallet top-up settings - whether it is on, the balance that triggers a  charge, the balance it is topped up to, and the currency both are expressed in. Any DocSpace  administrator may read them, and unlike the operation that changes them this one needs neither a  billing customer nor a configured billing service, so it answers on a portal that has never paid for  anything. It is read-only and changes nothing.  A portal that has never configured top-up gets the defaults rather than an empty result: `enabled` is  false, `currency` is null, and `minBalance` and `upToBalance` are 0. Those two zeros are outside the  ranges `POST api/2.0/portal/payment/topupsettings` accepts - 5 to 1000 and 6 to 5000 - so the answer  cannot be sent straight back to it; supply real values instead. `lastModified` is  `0001-01-01T00:00:00` until the settings are stored for the first time.  `lowBalanceThreshold` and `lowBalanceNotified` are maintained by the portal itself: they are reported  here, but ignored when the settings are written.
     * Responses:
     *  - 200: The automatic top-up settings of the portal, or their defaults when it has never configured them
     *  - 403: The caller is not a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantWalletSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/
     *
     *
     * @return [TenantWalletSettingsResponseWrapper]
     */
    @GET("api/2.0/portal/payment/topupsettings")
    suspend fun getTenantWalletSettings(): Response<TenantWalletSettingsResponseWrapper>

    /**
     * GET api/2.0/portal/payment/walletservice
     * Get a wallet service
     * Returns one wallet service by name, for a client that already knows which service it needs and does not want  the whole catalogue. `service` is the name of the service - `Storage`, `Backup`, `AITools`, `Admin`,  `DocsCloud`, `DocsCloudDevPack` or `AISearch` - and a name this installation does not sell answers 404.  Nothing has to be called first, the caller needs the permission to edit the portal settings, and the call is  read-only. The answer has the same shape as one item of `GET api/2.0/portal/payment/walletservices` - the  price of a unit, the unit, the limits the service grants and its service name - except that the variants of a  service are not grouped into `innerServices` here, because a single service is looked up directly. The price  is in the currency resolved for the request.
     * Responses:
     *  - 200: The wallet service with its price, unit and the limits it grants
     *  - 403: The caller may not edit the portal settings
     *  - 404: This installation does not sell a wallet service under that name
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWalletService Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
     *
     *
     * @param service The service to look up, given by its catalogue name. A service this installation does not sell answers 404,  and the whole catalogue is `GET api/2.0/portal/payment/walletservices`.
     * @return [WalletServiceWrapper]
     */
    @GET("api/2.0/portal/payment/walletservice")
    suspend fun getWalletService(@Query("service") service: TenantWalletService): Response<WalletServiceWrapper>

    /**
     * GET api/2.0/portal/payment/walletservices
     * Get wallet services
     * Lists every service the portal may pay for out of its wallet - extra administrators, disk storage, backup, AI  tools, AI search and Docs Connect - with the price of a unit, the unit it is sold in and whether the portal has  it switched on. Nothing has to be called first, the caller needs the permission to edit the portal settings,  and the call is read-only. Services that are variants of one another are folded together: the visible one  carries the rest in its `innerServices`, so a client renders one card per group. The AI services are left out  entirely when AI is not enabled for the portal. This is the catalogue and not the state of the portal - what  is actually running is `GET api/2.0/portal/payment/activeservices`, one service on its own is  `GET api/2.0/portal/payment/walletservice`, and switching one on or off is  `POST api/2.0/portal/payment/servicestate`.
     * Responses:
     *  - 200: The wallet services on offer, with their prices, units and grouped variants
     *  - 403: The caller may not edit the portal settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getWalletServices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-services/
     *
     *
     * @return [WalletServiceArrayWrapper]
     */
    @GET("api/2.0/portal/payment/walletservices")
    suspend fun getWalletServices(): Response<WalletServiceArrayWrapper>

    /**
     * POST api/2.0/portal/payment/subscription/movetowallet
     * Move the subscription to the wallet
     * Ends the portal's paid subscription and moves it onto the wallet: the unused balance of the running period is  credited to the wallet, the wallet is topped up from the payment method on file if that credit does not cover  the purchase, and the requested number of administrators is then bought as a wallet service. The portal needs  a billing customer with a payment method set and a plan in the paid state, `quantity` has to name the  administrators wallet product, and the number asked for may not be below the administrators the portal already  has - read the credit that will be carried over from `GET api/2.0/portal/payment/subscription/balance` first.  Only the payer may call it. The call is mutating, spends money and cannot be undone: the subscription is ended  before the purchase is attempted, so a failure in the second half leaves the portal on the wallet with the  money credited but the administrators unbought, and a repeat would then buy them a second time. It is limited  to ten requests a minute per user by default. The result is `true` when the administrators were bought.
     * Responses:
     *  - 200: `true` when the balance was moved to the wallet and the administrators were bought
     *  - 400: `quantity` does not name the administrators wallet product, or the number asked for is below the administrators the portal already has
     *  - 402: The plan of the portal is not paid, the balance could not be moved, or the wallet is still short of the price after the top-up
     *  - 403: The caller is not the payer of this portal, the portal has no billing service configured, or the customer has no payment method set
     *  - 404: This portal has no billing customer, its paid plan has no subscription, or the price of the administrators product is unknown
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for moveSubscriptionToWallet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/move-subscription-to-wallet/
     *
     *
     * @param quantityRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/portal/payment/subscription/movetowallet")
    suspend fun moveSubscriptionToWallet(@Body quantityRequestDto: QuantityRequestDto? = null): Response<BooleanWrapper>

    /**
     * POST api/2.0/portal/payment/request
     * Contact the sales team
     * Sends the portal's message to the ONLYOFFICE sales team - the contact-sales form behind a request for a quote,  an invoice or a plan that cannot be bought online. `email` has to be a well-formed address and is where the  answer will go, while `userName` and `message` say who is asking and what for; all three are required and none  may be empty. Only a DocSpace administrator may call it. Nothing on the portal changes: no plan, no quota and  no payment is touched, a message is mailed out and the request is written to the portal audit trail. There is  no response body - status 200 means the message was handed to the mail service - and the call is not  idempotent, so a repeat sends a second message. It is limited to ten requests a minute per user by default and  answers 429 above that.
     * Responses:
     *  - 200: The message has been handed to the mail service; the response carries no content
     *  - 400: `email` is not a well-formed address, or one of the required fields is empty
     *  - 403: The caller is not a DocSpace administrator
     *  - 429: This user has made more than ten requests in a minute
     *  - 401: Unauthorized
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendPaymentRequest Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
     *
     *
     * @param salesRequestsDto  (optional)
     * @return [Unit]
     */
    @POST("api/2.0/portal/payment/request")
    suspend fun sendPaymentRequest(@Body salesRequestsDto: SalesRequestsDto? = null): Response<Unit>

    /**
     * PUT api/2.0/portal/payment/ai-model/restrictions
     * Set restricted AI models
     * Replaces the whole set of AI chat models barred on this portal: the body is the complete set that is to hold,  so adding one restriction means sending the new model together with the ones already restricted, lifting one  means leaving it out, and an empty set lifts them all. Read the current set from  `GET api/2.0/portal/payment/ai-model/restrictions` and the model identifiers from  `GET api/2.0/portal/payment/ai-prices` before calling. The installation needs a billing service and the AI  gateway configured, the portal needs a billing customer, and the caller needs the permission to edit the  portal settings as well as DocSpace administrator rights. The call is mutating and idempotent - sending the  same set twice leaves the same state - and it is written to the portal audit trail. It takes effect on the  next AI request, so a conversation already open on a model that has just been barred cannot go on with it. The  stored set comes back in the answer.
     * Responses:
     *  - 200: The set of barred AI chat models as it was stored
     *  - 403: The caller may not edit the portal settings or is not a DocSpace administrator, or the installation has no billing service or no AI gateway configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setRestrictedAiModels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-restricted-ai-models/
     *
     *
     * @param setRestrictedAiModelsRequestDto  (optional)
     * @return [RestrictedModelsResponseWrapper]
     */
    @PUT("api/2.0/portal/payment/ai-model/restrictions")
    suspend fun setRestrictedAiModels(@Body setRestrictedAiModelsRequestDto: SetRestrictedAiModelsRequestDto? = null): Response<RestrictedModelsResponseWrapper>

    /**
     * POST api/2.0/portal/payment/topupsettings
     * Set the auto top-up settings
     * Switches the portal's automatic wallet top-up on or off and sets its thresholds: while it is on, the payment  method on file is charged whenever the wallet balance falls below `minBalance`, enough to bring it up to  `upToBalance`, in `currency`. The portal needs a billing customer whose wallet balance exists - a portal that  has never had one answers 404, so top the wallet up once with `POST api/2.0/portal/payment/deposit` first -  and only the payer may change the settings. The body replaces the stored settings as a whole and an omitted  body resets them to the defaults; `minBalance` is accepted between 5 and 1000 and `upToBalance` between 6 and  5000, while `lowBalanceThreshold` and `lowBalanceNotified` are ignored on the way in and kept as the portal  had them. The call is mutating and idempotent, it charges nothing by itself, it is written to the portal audit  trail, and switching the top-up on also re-arms the low-balance warning. The settings as they were stored come  back in the answer.
     * Responses:
     *  - 200: The automatic top-up settings as they were stored
     *  - 403: The caller is not the payer of this portal, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or its wallet has no balance yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setTenantWalletSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
     *
     *
     * @param tenantWalletSettingsWrapper  (optional)
     * @return [TenantWalletSettingsResponseWrapper]
     */
    @POST("api/2.0/portal/payment/topupsettings")
    suspend fun setTenantWalletSettings(@Body tenantWalletSettingsWrapper: TenantWalletSettingsWrapper? = null): Response<TenantWalletSettingsResponseWrapper>

    /**
     * DELETE api/2.0/portal/payment/customer/usage/monthly/report
     * Terminate the monthly usage report
     * Stops the `xlsx` monthly usage report this user has running and drops its task, for a report that was started  for the wrong period or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/monthly/report` can still answer for a moment afterwards. The call  is safe to repeat and does nothing at all when this user has no such report running: there is no response  body, and status 200 says the stop was requested, not that a report was really stopped. It leaves the  operations and service usage reports alone, and a report that had already finished keeps its file in My  documents.
     * Responses:
     *  - 200: The stop has been requested; the response carries no content
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateCustomerMonthlyUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-monthly-usage-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/portal/payment/customer/usage/monthly/report")
    suspend fun terminateCustomerMonthlyUsageReport(): Response<Unit>

    /**
     * DELETE api/2.0/portal/payment/customer/operationsreport
     * Terminate the operations report
     * Stops the `xlsx` wallet operations report this user has running and drops its task, for a report that was  started with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has  to be a DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/operationsreport` can still answer for a moment afterwards. The call is  safe to repeat and does nothing at all when this user has no report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. A report that had already  finished keeps its file in My documents - nothing is deleted from there.
     * Responses:
     *  - 200: The stop has been requested; the response carries no content
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-operations-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/portal/payment/customer/operationsreport")
    suspend fun terminateCustomerOperationsReport(): Response<Unit>

    /**
     * DELETE api/2.0/portal/payment/customer/usage/report
     * Terminate the service usage report
     * Stops the `xlsx` service usage report this user has running and drops its task, for a report that was started  with the wrong filters or is no longer wanted. The portal needs a billing customer and the caller has to be a  DocSpace administrator. The stop is asked of the worker that builds the file rather than done here, so  `GET api/2.0/portal/payment/customer/usage/report` can still answer for a moment afterwards. The call is safe  to repeat and does nothing at all when this user has no such report running: there is no response body, and  status 200 says the stop was requested, not that a report was really stopped. It leaves the operations and  monthly usage reports alone, and a report that had already finished keeps its file in My documents.
     * Responses:
     *  - 200: The stop has been requested; the response carries no content
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateCustomerServiceUsageReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-service-usage-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/portal/payment/customer/usage/report")
    suspend fun terminateCustomerServiceUsageReport(): Response<Unit>

    /**
     * POST api/2.0/portal/payment/deposit
     * Top up the wallet
     * Charges the payment method on file and adds the amount to the portal's wallet, the balance every wallet  service is paid from. The portal needs a billing customer with a payment method set - attach one with  `GET api/2.0/portal/payment/checkoutsetupurl` - `currency` has to be one of the accounting currencies this  installation supports, and `amount` is a whole number of currency units between 1 and 999999. Only the payer  may call it. The call takes money and is not idempotent in any way: two identical requests charge twice, so a  client must not retry it blindly after a timeout, and it is limited to ten requests a minute per user by  default. A successful top-up pushes the new balance to the portal clients over their socket connection and  re-arms the low-balance notification. The result is `true` when the payment provider accepted the charge; read  the resulting balance back from `GET api/2.0/portal/payment/customer/balance`.
     * Responses:
     *  - 200: `true` when the payment provider accepted the charge and the wallet was credited
     *  - 400: `currency` is not one of the supported accounting currencies, or `amount` is outside 1 to 999999
     *  - 403: The caller is not the payer of this portal, the portal has no billing service configured, or the customer has no payment method set
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for topUpDeposit Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/top-up-deposit/
     *
     *
     * @param topUpDepositRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/portal/payment/deposit")
    suspend fun topUpDeposit(@Body topUpDepositRequestDto: TopUpDepositRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/portal/payment/update
     * Change the subscription quantity
     * Changes how many units of the plan the portal is paying for - the number of administrators it covers - and  lets the payment provider bill the difference against the payment method already on file. The portal must have  a billing customer and a plan bought through `PUT api/2.0/portal/payment/url`, and while the portal is on a  priced plan the product name in `quantity` has to be that same plan, which `GET api/2.0/portal/payment/quota`  reports, because a subscription is changed here and not swapped. Only the payer - the portal user whose e-mail  is the billing customer's e-mail - may call it. The call is mutating and charges money, and it is guarded  against a double submission: once the new quantity is in effect, repeating the same request fails with 400  because that quantity is already set. The result is `true` when the provider accepted the change and `false`  when it declined it without an error. Exactly one product per call is accepted, the operation is limited to  ten requests a minute per user by default and answers 429 above that, and wallet services are not bought here  - use `PUT api/2.0/portal/payment/updatewallet` for those.
     * Responses:
     *  - 200: `true` when the provider accepted the new quantity, `false` when it declined it
     *  - 400: The product is not the plan currently paid, or the quantity is already the one in effect
     *  - 403: The caller is not the payer of this portal, or the portal has no billing service configured
     *  - 404: This portal has no billing customer yet
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updatePayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-payment/
     *
     *
     * @param quantityRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/portal/payment/update")
    suspend fun updatePayment(@Body quantityRequestDto: QuantityRequestDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/portal/payment/updatewallet
     * Change a wallet service quantity
     * Buys more units of a wallet service - extra administrators, disk storage, backup, AI tools, AI search or  Docs Connect - or writes down the quantity that service will have after the next renewal, depending on  `productQuantityType`. With `Add` (1) the units are bought at once and paid out of the portal wallet, so the  wallet needs a sub-account in the accounting currency and enough money on it; with `Set` (0) nothing is  charged now and the quantity only takes effect in the next period, where an empty or zero quantity cancels a  change scheduled earlier. `Renew` and `Sub` are not accepted here. The portal needs a billing customer and the  caller has to be a DocSpace administrator; a service that is an add-on to the plan also needs the plan itself  to be paid, otherwise the answer is 402. Minimum quantities apply - disk storage starts at 100 units, the  Docs Connect Dev Pack at 10, and the administrators may not be fewer than the portal already has - and in  the `Add` form they are checked only while the portal does not hold that service yet. Asking for the Docs Connect  plan in the `Set` form while Docs Connect Dev Pack is active schedules the reversion to it at the next period,  while the upgrade in the other direction is not done here at all: use  `POST api/2.0/settings/docscloud/switchtodevpack`. The result is `true` when the change was accepted; the call  is mutating, spends money in its `Add` form and is limited to ten requests a minute per user by default. Price  the same purchase without paying for it with `PUT api/2.0/portal/payment/calculatewallet`.
     * Responses:
     *  - 200: `true` when the purchase or the scheduled change was accepted, `false` when the provider declined it
     *  - 400: The quantity type is not `Set` or `Add`, the product is not a wallet service, the quantity is below the minimum for it, or that service is already set
     *  - 402: The plan of the portal is not paid and the requested service is an add-on to it
     *  - 403: The caller is not a DocSpace administrator, or the portal has no billing service configured
     *  - 404: This portal has no billing customer, or its wallet has no sub-account in the accounting currency
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateWalletPayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-wallet-payment/
     *
     *
     * @param walletQuantityRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/portal/payment/updatewallet")
    suspend fun updateWalletPayment(@Body walletQuantityRequestDto: WalletQuantityRequestDto? = null): Response<BooleanWrapper>

}
