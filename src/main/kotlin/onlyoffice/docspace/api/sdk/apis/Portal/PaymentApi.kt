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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BalanceWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ChangeWalletServiceStateRequestDto
import onlyoffice.docspace.api.sdk.models.CurrenciesArrayWrapper
import onlyoffice.docspace.api.sdk.models.CustomerInfoWrapper
import onlyoffice.docspace.api.sdk.models.CustomerOperationsReportRequestDto
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.GetPortalPrices200Response
import onlyoffice.docspace.api.sdk.models.PaymentCalculationWrapper
import onlyoffice.docspace.api.sdk.models.PaymentUrlRequestsDto
import onlyoffice.docspace.api.sdk.models.QuantityRequestDto
import onlyoffice.docspace.api.sdk.models.QuotaArrayWrapper
import onlyoffice.docspace.api.sdk.models.QuotaWrapper
import onlyoffice.docspace.api.sdk.models.ReportWrapper
import onlyoffice.docspace.api.sdk.models.SalesRequestsDto
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TenantWalletService
import onlyoffice.docspace.api.sdk.models.TenantWalletServiceSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TenantWalletSettingsWrapper
import onlyoffice.docspace.api.sdk.models.TopUpDepositRequestDto
import onlyoffice.docspace.api.sdk.models.WalletQuantityRequestDto
import onlyoffice.docspace.api.sdk.models.WalletServiceArrayWrapper

interface PaymentApi {
    /**
     * PUT api/2.0/portal/payment/calculatewallet
     * Calculate the wallet payment amount
     * Calculates an amount of the wallet payment with the parameters specified in the request.
     * Responses:
     *  - 200: Payment calculation
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for calculateWalletPayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-wallet-payment/
     *
     *
     * @param walletQuantityRequestDto  (optional)
     * @return [Call]<[PaymentCalculationWrapper]>
     */
    @PUT("api/2.0/portal/payment/calculatewallet")
    fun calculateWalletPayment(@Body walletQuantityRequestDto: WalletQuantityRequestDto? = null): Call<PaymentCalculationWrapper>

    /**
     * POST api/2.0/portal/payment/servicestate
     * Change wallet service state
     * Changes the wallet service state.
     * Responses:
     *  - 200: The wallet service settings
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for changeTenantWalletServiceState Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/change-tenant-wallet-service-state/
     *
     *
     * @param changeWalletServiceStateRequestDto  (optional)
     * @return [Call]<[TenantWalletServiceSettingsWrapper]>
     */
    @POST("api/2.0/portal/payment/servicestate")
    fun changeTenantWalletServiceState(@Body changeWalletServiceStateRequestDto: ChangeWalletServiceStateRequestDto? = null): Call<TenantWalletServiceSettingsWrapper>

    /**
     * POST api/2.0/portal/payment/customer/operationsreport
     * Start the customer operations report generation
     * Starts generating a customer operations report as an xlsx file and saves it in Documents.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for createCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-customer-operations-report/
     *
     *
     * @param customerOperationsReportRequestDto  (optional)
     * @return [Call]<[DocumentBuilderTaskWrapper]>
     */
    @POST("api/2.0/portal/payment/customer/operationsreport")
    fun createCustomerOperationsReport(@Body customerOperationsReportRequestDto: CustomerOperationsReportRequestDto? = null): Call<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/checkoutsetupurl
     * Get the checkout setup page URL
     * Returns the URL to the checkout setup page.
     * Responses:
     *  - 200: The URL to the checkout setup page
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getCheckoutSetupUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-checkout-setup-url/
     *
     *
     * @param backUrl The URL where the user will be redirected after completing the setup. (optional)
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/portal/payment/checkoutsetupurl")
    fun getCheckoutSetupUrl(@Query("BackUrl") backUrl: kotlin.String? = null): Call<StringWrapper>

    /**
     * GET api/2.0/portal/payment/customer/balance
     * Get the customer balance
     * Returns the customer balance from the accounting service.
     * Responses:
     *  - 200: The customer balance
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getCustomerBalance Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-balance/
     *
     *
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [Call]<[BalanceWrapper]>
     */
    @GET("api/2.0/portal/payment/customer/balance")
    fun getCustomerBalance(@Query("refresh") refresh: kotlin.Boolean? = null): Call<BalanceWrapper>

    /**
     * GET api/2.0/portal/payment/customerinfo
     * Get the customer information
     * Returns the customer information.
     * Responses:
     *  - 200: The customer info
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getCustomerInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-info/
     *
     *
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [Call]<[CustomerInfoWrapper]>
     */
    @GET("api/2.0/portal/payment/customerinfo")
    fun getCustomerInfo(@Query("refresh") refresh: kotlin.Boolean? = null): Call<CustomerInfoWrapper>

    /**
     * GET api/2.0/portal/payment/customer/operations
     * Get the customer operations
     * Returns the report of customer operations from the accounting service.
     * Responses:
     *  - 200: The customer operations
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getCustomerOperations Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations/
     *
     *
     * @param startDate The report start date. (optional)
     * @param endDate The report end date. (optional)
     * @param participantName The participant name. (optional)
     * @param credit Specifies whether to include credit operations in the report. The default value is true. (optional)
     * @param debit Specifies whether to include debit operations in the report. The default value is true. (optional)
     * @param offset The number of items to skip for pagination. The default value is 0. (optional)
     * @param limit The maximum number of items to return for pagination. The default value is 25. (optional)
     * @return [Call]<[ReportWrapper]>
     */
    @GET("api/2.0/portal/payment/customer/operations")
    fun getCustomerOperations(@Query("startDate") startDate: java.time.OffsetDateTime? = null, @Query("endDate") endDate: java.time.OffsetDateTime? = null, @Query("participantName") participantName: kotlin.String? = null, @Query("credit") credit: kotlin.Boolean? = null, @Query("debit") debit: kotlin.Boolean? = null, @Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Call<ReportWrapper>

    /**
     * GET api/2.0/portal/payment/customer/operationsreport
     * Get the status of the customer operations report generation
     * Returns the status of generating a customer operations report.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for getCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-customer-operations-report/
     *
     *
     * @return [Call]<[DocumentBuilderTaskWrapper]>
     */
    @GET("api/2.0/portal/payment/customer/operationsreport")
    fun getCustomerOperationsReport(): Call<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/portal/payment/account
     * Get the payment account
     * Returns the URL to the payment account.
     * Responses:
     *  - 200: The URL to the payment account
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getPaymentAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-account/
     *
     *
     * @param backUrl The URL where the user will be redirected after payment processing. (optional)
     * @return [Call]<[StringWrapper]>
     */
    @GET("api/2.0/portal/payment/account")
    fun getPaymentAccount(@Query("backUrl") backUrl: kotlin.String? = null): Call<StringWrapper>

    /**
     * GET api/2.0/portal/payment/currencies
     * Get currencies
     * Returns the available portal currencies.
     * Responses:
     *  - 200: List of available portal currencies
     *  - 401: Unauthorized
     *
     * REST API Reference for getPaymentCurrencies Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-currencies/
     *
     *
     * @return [Call]<[CurrenciesArrayWrapper]>
     */
    @GET("api/2.0/portal/payment/currencies")
    fun getPaymentCurrencies(): Call<CurrenciesArrayWrapper>

    /**
     * GET api/2.0/portal/payment/quotas
     * Get quotas
     * Returns the available portal quotas.
     * Responses:
     *  - 200: List of available portal quotas
     *  - 401: Unauthorized
     *
     * REST API Reference for getPaymentQuotas Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-quotas/
     *
     *
     * @param wallet Specifies whether to return the wallet quotas only. (optional)
     * @return [Call]<[QuotaArrayWrapper]>
     */
    @GET("api/2.0/portal/payment/quotas")
    fun getPaymentQuotas(@Query("wallet") wallet: kotlin.Boolean? = null): Call<QuotaArrayWrapper>

    /**
     * PUT api/2.0/portal/payment/url
     * Get the payment page URL
     * Returns the URL to the payment page.
     * Responses:
     *  - 200: The URL to the payment page
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getPaymentUrl Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-payment-url/
     *
     *
     * @param paymentUrlRequestsDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @PUT("api/2.0/portal/payment/url")
    fun getPaymentUrl(@Body paymentUrlRequestsDto: PaymentUrlRequestsDto? = null): Call<StringWrapper>

    /**
     * GET api/2.0/portal/payment/prices
     * Get prices
     * Returns the available portal prices.
     * Responses:
     *  - 200: List of available portal prices
     *  - 401: Unauthorized
     *
     * REST API Reference for getPortalPrices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-prices/
     *
     *
     * @return [Call]<[GetPortalPrices200Response]>
     */
    @GET("api/2.0/portal/payment/prices")
    fun getPortalPrices(): Call<GetPortalPrices200Response>

    /**
     * GET api/2.0/portal/payment/quota
     * Get quota payment information
     * Returns the payment information about the current portal quota.
     * Responses:
     *  - 200: Payment information about the current portal quota
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getQuotaPaymentInformation Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-quota-payment-information/
     *
     *
     * @param refresh Specifies whether to refresh the payment information cache or not. (optional)
     * @return [Call]<[QuotaWrapper]>
     */
    @GET("api/2.0/portal/payment/quota")
    fun getQuotaPaymentInformation(@Query("refresh") refresh: kotlin.Boolean? = null): Call<QuotaWrapper>

    /**
     * GET api/2.0/portal/payment/servicessettings
     * Get wallet services settings
     * Returns the wallet services settings.
     * Responses:
     *  - 200: The wallet services settings
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getTenantWalletServiceSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-service-settings/
     *
     *
     * @return [Call]<[TenantWalletServiceSettingsWrapper]>
     */
    @GET("api/2.0/portal/payment/servicessettings")
    fun getTenantWalletServiceSettings(): Call<TenantWalletServiceSettingsWrapper>

    /**
     * GET api/2.0/portal/payment/topupsettings
     * Get wallet auto top-up settings
     * Returns the wallet auto top-up settings.
     * Responses:
     *  - 200: The wallet auto top up settings
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for getTenantWalletSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-wallet-settings/
     *
     *
     * @return [Call]<[TenantWalletSettingsWrapper]>
     */
    @GET("api/2.0/portal/payment/topupsettings")
    fun getTenantWalletSettings(): Call<TenantWalletSettingsWrapper>

    /**
     * GET api/2.0/portal/payment/walletservice
     * Get wallet service
     * Returns the specified wallet service.
     * Responses:
     *  - 200: Wallet service
     *  - 401: Unauthorized
     *
     * REST API Reference for getWalletService Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-service/
     *
     *
     * @param service The wallet service type.
     * @return [Call]<[QuotaWrapper]>
     */
    @GET("api/2.0/portal/payment/walletservice")
    fun getWalletService(@Query("service") service: TenantWalletService): Call<QuotaWrapper>

    /**
     * GET api/2.0/portal/payment/walletservices
     * Get wallet services
     * Returns the available wallet services.
     * Responses:
     *  - 200: List of available wallet services
     *  - 401: Unauthorized
     *
     * REST API Reference for getWalletServices Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-wallet-services/
     *
     *
     * @return [Call]<[WalletServiceArrayWrapper]>
     */
    @GET("api/2.0/portal/payment/walletservices")
    fun getWalletServices(): Call<WalletServiceArrayWrapper>

    /**
     * POST api/2.0/portal/payment/request
     * Send a payment request
     * Sends a request for the portal payment.
     * Responses:
     *  - 200: Ok
     *  - 400: Incorrect email or message text is empty
     *  - 429: Request limit is exceeded
     *  - 401: Unauthorized
     *
     * REST API Reference for sendPaymentRequest Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-payment-request/
     *
     *
     * @param salesRequestsDto  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/2.0/portal/payment/request")
    fun sendPaymentRequest(@Body salesRequestsDto: SalesRequestsDto? = null): Call<Unit>

    /**
     * POST api/2.0/portal/payment/topupsettings
     * Set wallet auto top-up settings
     * Sets the wallet auto top-up settings.
     * Responses:
     *  - 200: The wallet auto top up settings
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for setTenantWalletSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-tenant-wallet-settings/
     *
     *
     * @param tenantWalletSettingsWrapper  (optional)
     * @return [Call]<[TenantWalletSettingsWrapper]>
     */
    @POST("api/2.0/portal/payment/topupsettings")
    fun setTenantWalletSettings(@Body tenantWalletSettingsWrapper: TenantWalletSettingsWrapper? = null): Call<TenantWalletSettingsWrapper>

    /**
     * DELETE api/2.0/portal/payment/customer/operationsreport
     * Terminate the customer operations report generation
     * Terminates generating a customer operations report.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *
     * REST API Reference for terminateCustomerOperationsReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-customer-operations-report/
     *
     *
     * @return [Call]<[Unit]>
     */
    @DELETE("api/2.0/portal/payment/customer/operationsreport")
    fun terminateCustomerOperationsReport(): Call<Unit>

    /**
     * POST api/2.0/portal/payment/deposit
     * Put money on deposit
     * Returns the result of putting money on deposit.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for topUpDeposit Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/top-up-deposit/
     *
     *
     * @param topUpDepositRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @POST("api/2.0/portal/payment/deposit")
    fun topUpDeposit(@Body topUpDepositRequestDto: TopUpDepositRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/portal/payment/update
     * Update the payment quantity
     * Updates the payment quantity with the parameters specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for updatePayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-payment/
     *
     *
     * @param quantityRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/portal/payment/update")
    fun updatePayment(@Body quantityRequestDto: QuantityRequestDto? = null): Call<BooleanWrapper>

    /**
     * PUT api/2.0/portal/payment/updatewallet
     * Update the wallet payment quantity
     * Updates the wallet payment quantity with the parameters specified in the request.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *
     * REST API Reference for updateWalletPayment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-wallet-payment/
     *
     *
     * @param walletQuantityRequestDto  (optional)
     * @return [Call]<[BooleanWrapper]>
     */
    @PUT("api/2.0/portal/payment/updatewallet")
    fun updateWalletPayment(@Body walletQuantityRequestDto: WalletQuantityRequestDto? = null): Call<BooleanWrapper>

}
