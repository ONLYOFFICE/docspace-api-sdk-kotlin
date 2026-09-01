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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.DocsCloudConfig
import onlyoffice.docspace.api.sdk.models.DocsCloudConfigWrapper
import onlyoffice.docspace.api.sdk.models.DocsCloudDevPackRequestDto
import onlyoffice.docspace.api.sdk.models.DocsCloudQuotaWrapper
import onlyoffice.docspace.api.sdk.models.DocsCloudTenantInfoWrapper
import onlyoffice.docspace.api.sdk.models.DocsCloudTenantWrapper
import onlyoffice.docspace.api.sdk.models.DocsCloudUsageWrapper
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.PaymentCalculationWrapper

interface DocsCloudApi {
    /**
     * POST api/2.0/settings/docscloud/calculatedevpack
     * Calculate the DocsCloud subscription switch cost
     * Calculates the top-up cost of switching the current DocsCloud subscription to DocsCloudDevPack,  without making any changes. The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
     * Responses:
     *  - 200: Payment calculation
     *  - 400: Invalid request parameters
     *  - 402: Tariff is not paid
     *  - 403: No permissions to perform this action
     *  - 404: Customer or service could not be found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for calculateDevPack Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/calculate-dev-pack/
     *
     *
     * @param docsCloudDevPackRequestDto  (optional)
     * @return [PaymentCalculationWrapper]
     */
    @POST("api/2.0/settings/docscloud/calculatedevpack")
    suspend fun calculateDevPack(@Body docsCloudDevPackRequestDto: DocsCloudDevPackRequestDto? = null): Response<PaymentCalculationWrapper>

    /**
     * POST api/2.0/settings/docscloud/tenant/quota/report
     * Start the DocsCloud tenant quota report generation
     * Starts generating the DocsCloud user quota report as an xlsx file and saves it in My Documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createTenantQuotaReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-tenant-quota-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/settings/docscloud/tenant/quota/report")
    suspend fun createTenantQuotaReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant
     * Get the DocsCloud tenant
     * Returns the DocsCloud tenant of the current portal.
     * Responses:
     *  - 200: DocsCloud tenant
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenant Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant/
     *
     *
     * @param refresh Specifies whether to bypass the cache and request the tenant from DocsCloud again. (optional, default to false)
     * @return [DocsCloudTenantWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant")
    suspend fun getTenant(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudTenantWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/config
     * Get the DocsCloud tenant configuration
     * Returns the DocsCloud tenant configuration of the current portal.
     * Responses:
     *  - 200: DocsCloud tenant configuration
     *  - 400: The DocsCloud tenant is not activated
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantConfig Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-config/
     *
     *
     * @param refresh Specifies whether to bypass the cache and request the tenant configuration from DocsCloud again. (optional, default to false)
     * @return [DocsCloudConfigWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/config")
    suspend fun getTenantConfig(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudConfigWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/info
     * Get the DocsCloud tenant information
     * Returns the DocsCloud license and server information with usage statistics of the current portal.
     * Responses:
     *  - 200: DocsCloud tenant information
     *  - 400: The DocsCloud tenant is not activated
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantInfo Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-info/
     *
     *
     * @param refresh Specifies whether to bypass the cache and request the tenant information from DocsCloud again. (optional, default to false)
     * @return [DocsCloudTenantInfoWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/info")
    suspend fun getTenantInfo(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudTenantInfoWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/quota
     * Get the DocsCloud tenant quota
     * Returns the DocsCloud user quota (active users) of the current portal.
     * Responses:
     *  - 200: DocsCloud user quota
     *  - 400: The DocsCloud tenant is not activated
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota/
     *
     *
     * @param refresh Specifies whether to bypass the cache and request the user quota from DocsCloud again. (optional, default to false)
     * @return [DocsCloudQuotaWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/quota")
    suspend fun getTenantQuota(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudQuotaWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/quota/report
     * Get the status of the DocsCloud tenant quota report generation
     * Returns the status of generating the DocsCloud user quota report.
     * Responses:
     *  - 200: Operation execution status
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantQuotaReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-quota-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/quota/report")
    suspend fun getTenantQuotaReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/usage
     * Get the DocsCloud tenant usage
     * Returns the DocsCloud usage statistics of the current portal.
     * Responses:
     *  - 200: DocsCloud tenant usage statistics
     *  - 400: The DocsCloud tenant is not activated
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTenantUsage Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tenant-usage/
     *
     *
     * @param refresh Specifies whether to bypass the cache and request the usage statistics from DocsCloud again. (optional, default to false)
     * @return [DocsCloudUsageWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/usage")
    suspend fun getTenantUsage(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudUsageWrapper>

    /**
     * POST api/2.0/settings/docscloud/trial
     * Start the DocsCloud trial
     * Starts the DocsCloud trial.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Quota is already set
     *  - 402: Tariff is not paid
     *  - 403: No permissions to perform this action
     *  - 404: Quota could not be found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for startDocsCloudTrial Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/start-docs-cloud-trial/
     *
     *
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/docscloud/trial")
    suspend fun startDocsCloudTrial(): Response<BooleanWrapper>

    /**
     * POST api/2.0/settings/docscloud/switchtodevpack
     * Switch the DocsCloud subscription to DocsCloudDevPack
     * Switches the current DocsCloud subscription to DocsCloudDevPack: charges the price difference  from the wallet and transfers the subscription (with its license) to the target product.  The quantity is taken from the currently purchased DocsCloud quota.  Only the portal payer can perform this action.
     * Responses:
     *  - 200: Boolean value: true if the operation is successful
     *  - 400: Invalid request parameters
     *  - 402: Tariff is not paid
     *  - 403: No permissions to perform this action
     *  - 404: Customer or service could not be found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for switchToDevPack Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/switch-to-dev-pack/
     *
     *
     * @param docsCloudDevPackRequestDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/docscloud/switchtodevpack")
    suspend fun switchToDevPack(@Body docsCloudDevPackRequestDto: DocsCloudDevPackRequestDto? = null): Response<BooleanWrapper>

    /**
     * DELETE api/2.0/settings/docscloud/tenant/quota/report
     * Terminate the DocsCloud tenant quota report generation
     * Terminates generating the DocsCloud user quota report.
     * Responses:
     *  - 200: Ok
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateTenantQuotaReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-tenant-quota-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/settings/docscloud/tenant/quota/report")
    suspend fun terminateTenantQuotaReport(): Response<Unit>

    /**
     * PUT api/2.0/settings/docscloud/tenant/config
     * Update the DocsCloud tenant configuration
     * Updates the DocsCloud tenant configuration of the current portal with the parameters specified in the request.
     * Responses:
     *  - 200: Updated DocsCloud tenant configuration
     *  - 400: Invalid request parameters, or the DocsCloud tenant is not activated
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTenantConfig Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tenant-config/
     *
     *
     * @param docsCloudConfig  (optional)
     * @return [DocsCloudConfigWrapper]
     */
    @PUT("api/2.0/settings/docscloud/tenant/config")
    suspend fun updateTenantConfig(@Body docsCloudConfig: DocsCloudConfig? = null): Response<DocsCloudConfigWrapper>

}
