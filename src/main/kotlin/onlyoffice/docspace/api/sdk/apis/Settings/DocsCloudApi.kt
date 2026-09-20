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
     * Calculate the DocsCloudDevPack switch cost
     * Prices the upgrade of the paid DocsCloud subscription of the current portal to DocsCloudDevPack for  the requested number of users, without changing the subscription or charging anything. It applies the  same preconditions as the switch itself: the portal must hold an active DocsCloud subscription, must  not already hold a DocsCloudDevPack one, and its tariff must not be delayed or unpaid; the quotas and  the state of the current tariff are listed by `GET api/2.0/portal/tariff`. The caller must be a  DocSpace administrator of a portal registered with the billing service. The call is read-only and  idempotent, so it can be repeated for different quantities before any switch is made. It returns the  amount that switching would cost, the three-letter ISO 4217 currency of that amount, the quantity the  amount was calculated for, and the identifier of the billing operation; an empty result means the  billing service could not price the switch, which should then not be attempted. The switch itself is  performed by `POST api/2.0/settings/docscloud/switchtodevpack` with the same `quantity` and takes no  identifier from this response; to price a change in the number of users of a subscription the portal  already has, use `PUT api/2.0/portal/payment/calculatewallet` instead.
     * Responses:
     *  - 200: The cost of switching to DocsCloudDevPack for the requested quantity, or an empty result if the billing service could not price it
     *  - 400: The quantity is below the allowed minimum, the portal has no active DocsCloud subscription, or it already has a DocsCloudDevPack subscription
     *  - 402: The portal tariff is delayed or not paid, so the switch cannot be priced
     *  - 403: The caller is not a DocSpace administrator, or the billing service is not configured
     *  - 404: The portal is not registered as a billing customer, or the DocsCloud and DocsCloudDevPack wallet products are not configured on this installation
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
     * Start the DocsCloud quota report
     * Queues a background job that renders the current DocsCloud user quota of the portal into an xlsx file and  saves that file in the My documents folder of the calling user; the report lists the editor and the viewer  users with the type and the expiration date of each, and summarizes the internal, external and remaining users  against the license limits. The file is not ready when the response arrives: poll  `GET api/2.0/settings/docscloud/tenant/quota/report` until `isCompleted` is true, then take the file from  `resultFileId` or `resultFileUrl`, and use `DELETE api/2.0/settings/docscloud/tenant/quota/report` to cancel a  job that is still running. The caller must be a portal administrator allowed to edit the portal settings. The  portal should have an activated DocsCloud tenant: this call does not check that, and without a tenant the job  itself fails and reports the reason in the `error` of the status response. One report per caller runs at a  time: while a report of this user is still being built, the call describes that running job and no second  generation is started, so a repeated call is safe. What comes back is the initial state of the job, with  `percentage` 0 and a created `status`, not the report; the report is a point-in-time snapshot and carries the  generation date in its file name. To read the same data as JSON, without building a file, use  `GET api/2.0/settings/docscloud/tenant/quota`.
     * Responses:
     *  - 200: The initial state of the queued report generation job, with zero progress and an uncompleted status
     *  - 403: The caller is not allowed to edit the portal settings
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
     * Returns the DocsCloud tenant of the current portal: the DocsCloud server assigned to the portal, with its  address, the date the tenant subscription ends and the payment the tenant was created for. A tenant exists  only after a DocsCloud subscription has been granted, by `POST api/2.0/settings/docscloud/trial` or by a  DocsCloud purchase, and only on an installation where the DocsCloud service is configured. The caller must  be a portal administrator allowed to edit the portal settings. The call is read-only and idempotent, and it  is served from a cache that keeps the tenant for an hour and the absence of a tenant for a minute, so pass  `refresh=true` right after a subscription change to read the current state from DocsCloud instead. In the  result, `address` is the absolute URL of the assigned server, `isActive` tells whether `endDate` is still in  the future, and the dates are in UTC. An empty result means the portal has no DocsCloud tenant yet, which is  the normal state before a subscription and not an error, so this is the operation to call to find out whether  DocsCloud is activated at all. The license and server details, the editing settings, the user quota and the  usage statistics are not part of it: they live in `GET api/2.0/settings/docscloud/tenant/info`,  `.../tenant/config`, `.../tenant/quota` and `.../tenant/usage`, each of which fails with 400 while the  portal has no activated tenant.
     * Responses:
     *  - 200: The DocsCloud tenant of the portal, or an empty result if no DocsCloud tenant is assigned to it
     *  - 403: The caller is not allowed to edit the portal settings
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
     * @param refresh Pass `true` to skip the cached copy and request the tenant from DocsCloud again, replacing the cached one; with the default `false` the answer may be up to an hour old, or up to a minute old while the portal has no tenant. (optional, default to false)
     * @return [DocsCloudTenantWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant")
    suspend fun getTenant(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudTenantWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/config
     * Get the DocsCloud tenant configuration
     * Returns the configuration of the DocsCloud tenant of the current portal: its name, the security secret and  header name, the file size limit and anonymous access switch of the server, the WOPI switch and the IP filter  rules. The portal must have an activated DocsCloud tenant, granted by `POST api/2.0/settings/docscloud/trial`  or by a DocsCloud purchase: an empty result from `GET api/2.0/settings/docscloud/tenant` means there is none  and this call fails with 400. The caller must be a portal administrator allowed to edit the portal settings,  on an installation where the DocsCloud service is configured. The call is read-only, idempotent and cached for  an hour, so pass `refresh=true` to read the current state from DocsCloud; the same values are changed by  `PUT api/2.0/settings/docscloud/tenant/config`, which drops the cached copy itself, so no refresh is needed  after an update. In the result, `security.secret` is a credential, so the response should be treated as  sensitive; `server.fileSizeLimit` is in bytes and an update cannot raise it above 209715200 (200 MB); and an  empty or absent `ipFilter.rules` means no address restriction is configured. The license and server version,  the address of the assigned server, the per-user quota and the usage counters are not part of it: they live in  `.../tenant/info`, `.../tenant`, `.../tenant/quota` and `.../tenant/usage`.
     * Responses:
     *  - 200: The configuration of the DocsCloud tenant of the portal, with its security, server, WOPI and IP filter settings
     *  - 400: The portal has no activated DocsCloud tenant, so there is no configuration to return
     *  - 403: The caller is not allowed to edit the portal settings
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
     * @param refresh Pass `true` to skip the cached copy and request the configuration from DocsCloud again, replacing the cached one; with the default `false` the answer may be up to an hour old. (optional, default to false)
     * @return [DocsCloudConfigWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/config")
    suspend fun getTenantConfig(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudConfigWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/info
     * Get the DocsCloud tenant information
     * Returns the DocsCloud license of the current portal, the DocsCloud server serving it, the user limits of  that license and the editor and viewer usage counted against them for the current period. The portal must  have an activated DocsCloud tenant, granted by `POST api/2.0/settings/docscloud/trial` or by a DocsCloud  purchase: an empty result from `GET api/2.0/settings/docscloud/tenant` means there is none and this call  fails with 400. The caller must be a portal administrator allowed to edit the portal settings, on an  installation where the DocsCloud service is configured. The call is read-only, idempotent and cached for a  minute, so pass `refresh=true` right after a subscription change to read the current state from DocsCloud.  In the result, `license.valid` is when the license expires and `license.trial` is reported as `false` once  the portal holds a paid DocsCloud or DocsCloudDevPack subscription, even when the license itself still says  trial; `usersLimit` caps the editors and the viewers allowed, `stats` counts the active, internal, external  and remaining users of each of those two kinds over the last `stats.periodDay` days, and the dates are in  UTC. The editing settings, the per-user quota lists and the address of the assigned server live in  `.../tenant/config`, `.../tenant/quota` and `.../tenant`, while `.../tenant/usage` gives one active-user  total instead of this per-role breakdown.
     * Responses:
     *  - 200: The DocsCloud license and server information of the portal, with the user limits of the license and the usage statistics for the current period
     *  - 400: The portal has no activated DocsCloud tenant, so there is no license information to return
     *  - 403: The caller is not allowed to edit the portal settings
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
     * @param refresh Pass `true` to skip the cached copy and request the license, server and usage information from DocsCloud again, replacing the cached one; with the default `false` the answer may be up to a minute old. (optional, default to false)
     * @return [DocsCloudTenantInfoWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/info")
    suspend fun getTenantInfo(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudTenantInfoWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/quota
     * Get the DocsCloud tenant quota
     * Returns the DocsCloud user quota of the current portal: the users who currently count as DocsCloud editors and  the users who count as viewers, each with the identifier DocsCloud knows them by and the date their quota entry  expires. The portal must have an activated DocsCloud tenant, granted by `POST api/2.0/settings/docscloud/trial`  or by a DocsCloud purchase: an empty result from `GET api/2.0/settings/docscloud/tenant` means there is none  and this call fails with 400. The caller must be a portal administrator allowed to edit the portal settings,  on an installation where the DocsCloud service is configured. The call is read-only, idempotent and cached for  a minute, so pass `refresh=true` to read the current state from DocsCloud. In the result, `users` holds the  editor entries and `usersView` the viewer entries, both unordered; `userId` is the DocSpace user ID for a  portal member and an identifier of DocsCloud's own for anyone else; `expire` is the date and time the entry  expires, as a UTC string; and empty lists mean no user has been counted yet. It lists the users themselves,  not the counters: the license limits with the per-role totals are in  `GET api/2.0/settings/docscloud/tenant/info`, a single active-user total is in `.../tenant/usage`, and the  same lists as a downloadable xlsx file are produced by  `POST api/2.0/settings/docscloud/tenant/quota/report`.
     * Responses:
     *  - 200: The editor and viewer users of the DocsCloud tenant of the portal, with the expiration date of each entry
     *  - 400: The portal has no activated DocsCloud tenant, so there is no user quota to return
     *  - 403: The caller is not allowed to edit the portal settings
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
     * @param refresh Pass `true` to skip the cached copy and request the user quota from DocsCloud again, replacing the cached one; with the default `false` the answer may be up to a minute old. (optional, default to false)
     * @return [DocsCloudQuotaWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/quota")
    suspend fun getTenantQuota(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudQuotaWrapper>

    /**
     * GET api/2.0/settings/docscloud/tenant/quota/report
     * Get the DocsCloud quota report status
     * Returns the state of the DocsCloud user quota report that the current user started with  `POST api/2.0/settings/docscloud/tenant/quota/report`, so that the caller can follow the generation and pick  up the resulting file. It reports the caller's own job only: a report started by another administrator is not  visible here, and an empty result means this user has no job, because none was started, because it was  terminated, or because a finished one has already been cleared (a job state is kept for a day, and starting a  new report drops the previous finished one); that is a normal state and not an error. The caller must be a  portal administrator allowed to edit the portal settings. The call is read-only and idempotent, and it is  meant to be polled while the job runs. In the result, `percentage` goes from 0 to 100 and `isCompleted`  becomes true both on success and on failure, so check `error`: it is empty when the report was built and  carries the failure message otherwise;  `resultFileId`, `resultFileName` and `resultFileUrl` are filled in only once the file exists, and that file  also stays in the My documents folder of the caller. Use the `POST` operation on this path to start a report  and the `DELETE` one to cancel it.
     * Responses:
     *  - 200: The state of the DocsCloud quota report job of the caller, or an empty result if there is no such job
     *  - 403: The caller is not allowed to edit the portal settings
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
     * Returns the DocsCloud usage of the current portal: the number of users who have been active in DocsCloud in  the current period, and the moment that period is counted from. The portal must have an activated DocsCloud  tenant, granted by `POST api/2.0/settings/docscloud/trial` or by a DocsCloud purchase: an empty result from  `GET api/2.0/settings/docscloud/tenant` means there is none and this call fails with 400. The caller must be a  portal administrator allowed to edit the portal settings, on an installation where the DocsCloud service is  configured. The call is read-only, idempotent and cached for a minute, so pass `refresh=true` to read the  current state from DocsCloud. In the result, `activeCount` counts the users seen since `since`, which is in  UTC, and it is one total for the whole tenant, with no split by role and no limit to compare it against. For  the editor and viewer breakdown with the license limits use `GET api/2.0/settings/docscloud/tenant/info`, and  for the users counted one by one `GET api/2.0/settings/docscloud/tenant/quota`.
     * Responses:
     *  - 200: The number of active DocsCloud users of the portal and the date the count starts from
     *  - 400: The portal has no activated DocsCloud tenant, so there is no usage information to return
     *  - 403: The caller is not allowed to edit the portal settings
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
     * @param refresh Pass `true` to skip the cached copy and request the usage statistics from DocsCloud again, replacing the cached one; with the default `false` the answer may be up to a minute old. (optional, default to false)
     * @return [DocsCloudUsageWrapper]
     */
    @GET("api/2.0/settings/docscloud/tenant/usage")
    suspend fun getTenantUsage(@Query("refresh") refresh: kotlin.Boolean? = false): Response<DocsCloudUsageWrapper>

    /**
     * POST api/2.0/settings/docscloud/trial
     * Start the DocsCloud trial
     * Activates the free DocsCloud trial subscription for the current portal, and, once a DocsCloud server is  assigned to the portal, allows the address of that server in the Content Security Policy settings.  The portal tariff must be in the trial or paid state (not delayed and not unpaid), and the portal must not  already hold a DocsCloud trial, DocsCloud or DocsCloudDevPack subscription: the quotas of the current  tariff are listed by `GET api/2.0/portal/tariff`. The caller must be a portal administrator allowed to edit  the portal settings, on an installation where the billing service is configured. The operation changes the  portal subscription and is not idempotent: repeating it after a successful activation fails with 400.  It returns `true` when the trial has been granted, and `false` when the billing service declines it  (for example, when this portal has already used its trial), in which case nothing is changed. It never buys  a paid plan: an existing paid DocsCloud subscription is moved to DocsCloudDevPack by  `POST api/2.0/settings/docscloud/switchtodevpack` instead.
     * Responses:
     *  - 200: Boolean value: true if the trial subscription is activated, false if the billing service declines it
     *  - 400: The portal already has a DocsCloud trial, DocsCloud or DocsCloudDevPack subscription
     *  - 402: The portal tariff is delayed or not paid, so the trial cannot be started
     *  - 403: The caller is not allowed to edit the portal settings, or the billing service is not configured
     *  - 404: The DocsCloud trial quota is not available on this installation
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
     * Switch DocsCloud to DocsCloudDevPack
     * Upgrades the paid DocsCloud subscription of the current portal to DocsCloudDevPack for the requested  number of users, charging the price difference to the portal wallet and moving the DocsCloud license  to the new product. The portal must hold an active DocsCloud subscription, must not already hold a  DocsCloudDevPack one, and its tariff must not be delayed or unpaid: the quotas and the state of the  current tariff are listed by `GET api/2.0/portal/tariff`, and the amount that will be charged is  returned by `POST api/2.0/settings/docscloud/calculatedevpack` for the same `quantity`. The caller  must be a DocSpace administrator of a portal registered with the billing service. The switch is  synchronous, mutating and not idempotent: repeating it after a successful call fails with 400, and  concurrent calls for one portal are serialized so that the wallet is charged only once. It returns  `true` when the subscription has been switched, and `false` when the billing service declines or  fails to perform the switch, in which case nothing is charged and the portal stays on DocsCloud.  Only the DocsCloud to DocsCloudDevPack direction is supported: to change the number of users of a  subscription the portal already has, or to schedule a reversion from DocsCloudDevPack back to  DocsCloud at the next billing period, use `PUT api/2.0/portal/payment/updatewallet` instead.
     * Responses:
     *  - 200: Boolean value: true if the subscription is switched to DocsCloudDevPack, false if the billing service declines it
     *  - 400: The quantity is below the allowed minimum, the portal has no active DocsCloud subscription, or it already has a DocsCloudDevPack subscription
     *  - 402: The portal tariff is delayed or not paid, so the subscription cannot be switched
     *  - 403: The caller is not a DocSpace administrator, or the billing service is not configured
     *  - 404: The portal is not registered as a billing customer, or the DocsCloud and DocsCloudDevPack wallet products are not configured on this installation
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
     * Terminate the DocsCloud quota report
     * Cancels the DocsCloud user quota report that the current user started with  `POST api/2.0/settings/docscloud/tenant/quota/report` and removes its job, so that a new report can be started  right away. There is no precondition: the call is accepted even when this user has no report job at all, and  it affects the caller's own job only, never one started by another administrator. The caller must be a portal  administrator allowed to edit the portal settings. The cancellation is asynchronous and idempotent: 200 means  the request has been queued for the report worker, not that the job has already stopped, so poll  `GET api/2.0/settings/docscloud/tenant/quota/report` until it returns an empty result. Nothing is returned in  the body. A report file that has already been saved in the My documents folder of the caller is left there  and has to be deleted through the file operations if it is no longer wanted.
     * Responses:
     *  - 200: The termination request has been queued for the report worker; the response has no body
     *  - 403: The caller is not allowed to edit the portal settings
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
     * Replaces the configuration of the DocsCloud tenant of the current portal: its name, the security secret and  header name, the file size limit and anonymous access switch of the server, the WOPI switch and the IP filter  rules; it returns the configuration as DocsCloud stored it. The portal must have an activated DocsCloud tenant,  granted by `POST api/2.0/settings/docscloud/trial` or by a DocsCloud purchase: an empty result from  `GET api/2.0/settings/docscloud/tenant` means there is none and this call fails with 400. Read the current  values with `GET api/2.0/settings/docscloud/tenant/config` first and send back whole sections: the sections  left out of the request are not sent to DocsCloud at all, while a section that is present is sent with all of  its fields, so a field left unset inside it goes out as `0`, `false` or empty. The caller must be a portal  administrator allowed to edit the portal settings, on an installation where the DocsCloud service is  configured. The call is mutating,  synchronous and idempotent, it is recorded in the portal audit trail, and it drops the cached configuration  itself, so the next read returns the new values without `refresh=true`. The `tenantName`, `security.secret`,  `security.header` and every `ipFilter.rules` address are capped at 255 characters and `server.fileSizeLimit`  at 209715200 bytes (200 MB); a value outside those bounds is rejected with 400 before anything reaches  DocsCloud. It changes these settings only, never the subscription, the user quota or the license.
     * Responses:
     *  - 200: The configuration of the DocsCloud tenant as DocsCloud stored it after the update
     *  - 400: A text field is longer than 255 characters, the file size limit is outside 0-209715200 bytes, or the portal has no activated DocsCloud tenant
     *  - 403: The caller is not allowed to edit the portal settings
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
