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
import onlyoffice.docspace.api.sdk.models.AiPricesResponseWrapper
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
     * Calculates an amount of the wallet payment with the parameters specified in the request.
     * Responses:
     *  - 200: Payment calculation
     *  - 400: Invalid request parameters
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Change tenant wallet service state
     * Changes the state of a wallet service for the current tenant.  Requires permission to edit portal settings and a configured tariff service.  Adds or removes the specified service from the enabled services list based on the enabled flag.
     * Responses:
     *  - 200: The updated tenant wallet service settings
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Start the customer monthly usage report generation
     * Starts generating a customer monthly usage report as an xlsx file and saves it in Documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Start the customer operations report generation
     * Starts generating a customer operations report as an xlsx file and saves it in Documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer or service could not be found
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
     * Start the customer service usage report generation
     * Starts generating a customer service usage report as an xlsx file and saves it in Documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer or service could not be found
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
     * GET api/2.0/portal/payment/activeservices
     * Get the active wallet services
     * Returns all the active wallet services (quotas) of the current portal: the active additional quotas  from the tariff, plus the services enabled manually via the wallet service settings.
     * Responses:
     *  - 200: The list of active wallet services
     *  - 403: No permissions to perform this action
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
     * Retrieves the pricing information for AI models including chat, embedding, and web search services.  The prices are returned in the configured currency and normalized per million tokens.  Requires administrator permissions to access.
     * Responses:
     *  - 200: Prices for AI models
     *  - 403: No permissions to perform this action
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
     * @return [AiPricesResponseWrapper]
     */
    @GET("api/2.0/portal/payment/ai-prices")
    suspend fun getAiPrices(): Response<AiPricesResponseWrapper>

    /**
     * GET api/2.0/portal/payment/checkoutsetupurl
     * Get the checkout setup page URL
     * Returns the URL to the checkout setup page.
     * Responses:
     *  - 200: The URL to the checkout setup page
     *  - 403: No permissions to perform this action
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
     * @param backUrl The URL where the user will be redirected after setup cancellation.
     * @param successUrl The URL where the user will be redirected after successful payment.
     * @return [StringWrapper]
     */
    @GET("api/2.0/portal/payment/checkoutsetupurl")
    suspend fun getCheckoutSetupUrl(@Query("BackUrl") backUrl: java.net.URI, @Query("SuccessUrl") successUrl: java.net.URI): Response<StringWrapper>

    /**
     * GET api/2.0/portal/payment/customer/balance
     * Get the customer balance
     * Returns the customer balance from the accounting service.
     * Responses:
     *  - 200: The customer balance
     *  - 403: No permissions to perform this action
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
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [BalanceWrapper]
     */
    @GET("api/2.0/portal/payment/customer/balance")
    suspend fun getCustomerBalance(@Query("refresh") refresh: kotlin.Boolean? = null): Response<BalanceWrapper>

    /**
     * GET api/2.0/portal/payment/customerinfo
     * Get the customer information
     * Returns the customer information.
     * Responses:
     *  - 200: The customer info
     *  - 403: No permissions to perform this action
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
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [CustomerInfoWrapper]
     */
    @GET("api/2.0/portal/payment/customerinfo")
    suspend fun getCustomerInfo(@Query("refresh") refresh: kotlin.Boolean? = null): Response<CustomerInfoWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/monthly
     * Get the customer monthly usage
     * Returns the customer spending aggregated per calendar month from the accounting service.
     * Responses:
     *  - 200: The customer monthly usage
     *  - 403: No permissions to perform this action
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
     * @param startDate Start of the period (inclusive). (optional)
     * @param endDate End of the period (inclusive). (optional)
     * @return [CustomerMonthlyUsageArrayWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage/monthly")
    suspend fun getCustomerMonthlyUsage(@Query("startDate") startDate: java.time.OffsetDateTime? = null, @Query("endDate") endDate: java.time.OffsetDateTime? = null): Response<CustomerMonthlyUsageArrayWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/monthly/report
     * Get the status of the customer monthly usage report generation
     * Returns the status of generating a customer monthly usage report.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Get the customer operations
     * Returns the report of customer operations from the accounting service.
     * Responses:
     *  - 200: The customer operations
     *  - 403: No permissions to perform this action
     *  - 404: Service could not be found
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
     * @param offset The number of items to skip for pagination. The default value is 0. (optional)
     * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
     * @param serviceName The service name list. A single string is also accepted for backward compatibility. (optional)
     * @param startDate The report start date. (optional)
     * @param endDate The report end date. (optional)
     * @param participantName The participant name. (optional)
     * @param credit Specifies whether to include credit operations in the report. (optional)
     * @param debit Specifies whether to include debit operations in the report. (optional)
     * @param type The operation type to filter by. (optional)
     * @param status The operation status to filter by. (optional)
     * @param orderBy The field to order by. (optional)
     * @param orderType Order direction: Ascending or Descending. (optional)
     * @return [ReportWrapper]
     */
    @GET("api/2.0/portal/payment/customer/operations")
    suspend fun getCustomerOperations(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("ServiceName") serviceName: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("StartDate") startDate: java.time.OffsetDateTime? = null, @Query("EndDate") endDate: java.time.OffsetDateTime? = null, @Query("ParticipantName") participantName: kotlin.String? = null, @Query("Credit") credit: kotlin.Boolean? = null, @Query("Debit") debit: kotlin.Boolean? = null, @Query("Type") type: OperationType? = null, @Query("Status") status: OperationStatus? = null, @Query("OrderBy") orderBy: kotlin.String? = null, @Query("OrderType") orderType: OperationOrderType? = null): Response<ReportWrapper>

    /**
     * GET api/2.0/portal/payment/customer/operationsreport
     * Get the status of the customer operations report generation
     * Returns the status of generating a customer operations report.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Returns the customer usage statistics aggregated per service from the accounting service.
     * Responses:
     *  - 200: The customer service usage
     *  - 403: No permissions to perform this action
     *  - 404: Service could not be found
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
     * @param serviceName The service name list. (optional)
     * @param participantName The participant name. (optional)
     * @param status The operation status to filter by. (optional)
     * @param startDate Start of the period (inclusive). (optional)
     * @param endDate End of the period (inclusive). (optional)
     * @param metadata Metadata key-value pairs to filter by. (optional)
     * @param offset The number of items to skip for pagination. The default value is 0. (optional)
     * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
     * @param orderBy The field to order by. (optional)
     * @param orderType Order direction: Ascending or Descending. (optional)
     * @return [CustomerServiceUsageReportWrapper]
     */
    @GET("api/2.0/portal/payment/customer/usage")
    suspend fun getCustomerServiceUsage(@Query("ServiceName") serviceName: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("ParticipantName") participantName: kotlin.String? = null, @Query("Status") status: OperationStatus? = null, @Query("StartDate") startDate: java.time.OffsetDateTime? = null, @Query("EndDate") endDate: java.time.OffsetDateTime? = null, @Query("Metadata") metadata: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null, @Query("OrderBy") orderBy: kotlin.String? = null, @Query("OrderType") orderType: OperationOrderType? = null): Response<CustomerServiceUsageReportWrapper>

    /**
     * GET api/2.0/portal/payment/customer/usage/report
     * Get the status of the customer service usage report generation
     * Returns the status of generating a customer service usage report.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Get the payment account
     * Returns the URL to the payment account.
     * Responses:
     *  - 200: The URL to the payment account
     *  - 403: No permissions to perform this action
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
     * @param backUrl The URL where the user will be redirected after payment processing. (optional)
     * @return [StringWrapper]
     */
    @GET("api/2.0/portal/payment/account")
    suspend fun getPaymentAccount(@Query("backUrl") backUrl: java.net.URI? = null): Response<StringWrapper>

    /**
     * GET api/2.0/portal/payment/currencies
     * Get currencies
     * Returns the available portal currencies.
     * Responses:
     *  - 200: List of available portal currencies
     *  - 403: No permissions to perform this action
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
     * Get quotas
     * Returns the available portal quotas.
     * Responses:
     *  - 200: List of available portal quotas
     *  - 403: No permissions to perform this action
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
     * @param wallet Specifies whether to return the wallet quotas only. (optional)
     * @param additional Specifies whether to return additional quotas only. (optional)
     * @return [QuotaArrayWrapper]
     */
    @GET("api/2.0/portal/payment/quotas")
    suspend fun getPaymentQuotas(@Query("wallet") wallet: kotlin.Boolean? = null, @Query("additional") additional: kotlin.Boolean? = null): Response<QuotaArrayWrapper>

    /**
     * PUT api/2.0/portal/payment/url
     * Get the payment page URL
     * Returns the URL to the payment page.
     * Responses:
     *  - 200: The URL to the payment page
     *  - 400: Invalid request parameters
     *  - 403: No permissions to perform this action
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
     * Get prices
     * Returns the available portal prices.
     * Responses:
     *  - 200: List of available portal prices
     *  - 403: No permissions to perform this action
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
     * Get quota payment information
     * Returns the payment information about the current portal quota.
     * Responses:
     *  - 200: Payment information about the current portal quota
     *  - 403: No permissions to perform this action
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
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [QuotaWrapper]
     */
    @GET("api/2.0/portal/payment/quota")
    suspend fun getQuotaPaymentInformation(@Query("refresh") refresh: kotlin.Boolean? = null): Response<QuotaWrapper>

    /**
     * GET api/2.0/portal/payment/ai-model/restrictions
     * Get restricted AI models
     * Returns the list of AI chat model IDs that are restricted (disabled) for the current tenant.  Restricted models cannot be used for AI chat conversations by any user within the portal.  Only DocSpace administrators can access this endpoint.
     * Responses:
     *  - 200: The list of restricted AI model IDs
     *  - 403: No permissions to perform this action
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
     * Returns the information about the current subscription and its unused (prorated) balance.
     * Responses:
     *  - 200: The subscription balance information
     *  - 400: Invalid request parameters
     *  - 402: Tariff is not paid
     *  - 403: No permissions to perform this action
     *  - 404: Customer or subscription could not be found
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
     * Gets the wallet service settings for the tenant.
     * Retrieves configuration settings related to the wallet service associated with the current tenant.
     * Responses:
     *  - 200: The wallet service settings for the tenant
     *  - 403: No permissions to perform this action
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
     * Gets the tenant wallet auto top up settings
     * Returns the wallet auto top up settings for the current tenant.
     * Responses:
     *  - 200: The wallet auto top up settings
     *  - 403: No permissions to perform this action
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
     * Get wallet service
     * Returns the specified wallet service.
     * Responses:
     *  - 200: Wallet service
     *  - 403: No permissions to perform this action
     *  - 404: Service could not be found
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
     * @param service The wallet service type.
     * @return [WalletServiceWrapper]
     */
    @GET("api/2.0/portal/payment/walletservice")
    suspend fun getWalletService(@Query("service") service: TenantWalletService): Response<WalletServiceWrapper>

    /**
     * GET api/2.0/portal/payment/walletservices
     * Get wallet services
     * Returns the available wallet services.
     * Responses:
     *  - 200: List of available wallet services
     *  - 403: No permissions to perform this action
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
     * Move the subscription balance to the wallet and purchase admins
     * Cancels the current subscription, moves its unused balance to the wallet, and purchases the requested number of  admins from the wallet. If the wallet balance is not enough, it is topped up for the missing amount first  (with several attempts, as the balance may be consumed concurrently).
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Invalid request parameters
     *  - 402: Tariff is not paid
     *  - 403: No permissions to perform this action
     *  - 404: Customer or subscription could not be found
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
     * Send a payment request
     * Sends a request for the portal payment.
     * Responses:
     *  - 200: Ok
     *  - 400: Incorrect email or message text is empty
     *  - 403: No permissions to perform this action
     *  - 429: Request limit is exceeded
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
     * Overwrites the entire set of restricted AI model IDs for the current tenant.  The request body must contain the complete desired set — to add a restriction, include the new model alongside existing ones;  to remove one, omit it. An empty set lifts all restrictions. Only portal administrators can perform this action.
     * Responses:
     *  - 200: The updated list of restricted AI model IDs
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Set the wallet auto top up settings
     * Updates the wallet auto top up settings for the current tenant.  Requires the tariff service to be configured and the user to be authorized as a payer.  Returns null if the tariff service is not configured or customer information/balance cannot be retrieved.
     * Responses:
     *  - 200: The wallet auto top up settings
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Terminate the customer monthly usage report generation
     * Terminates generating a customer monthly usage report.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Terminate the customer operations report generation
     * Terminates generating a customer operations report.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Terminate the customer service usage report generation
     * Terminates generating a customer service usage report.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Put money on deposit
     * Returns the result of putting money on deposit.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Invalid request parameters
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Update the payment quantity
     * Updates the payment quantity with the parameters specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Invalid request parameters
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
     * Update the wallet payment quantity
     * Updates the wallet payment quantity with the parameters specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Invalid request parameters
     *  - 402: Payment required
     *  - 403: No permissions to perform this action
     *  - 404: Customer could not be found
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
