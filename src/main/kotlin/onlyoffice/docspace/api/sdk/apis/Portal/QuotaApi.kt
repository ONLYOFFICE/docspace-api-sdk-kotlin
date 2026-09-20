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

import onlyoffice.docspace.api.sdk.models.DoubleWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.TariffWrapper
import onlyoffice.docspace.api.sdk.models.TenantQuotaWrapper
import onlyoffice.docspace.api.sdk.models.UpcomingPaymentArrayWrapper

interface QuotaApi {
    /**
     * GET api/2.0/portal/quota
     * Get the portal quota
     * Returns the quota this portal runs on - the allowance its tariff grants: how many users and paid users it may  have, how many rooms, the largest total and single-file size, the price of the quota and the feature flags  that go with it. The caller needs the portal-settings right and gets 403 without it; the call is read-only and  idempotent. Sizes are in bytes, and `maxTotalSize` comes back as `0` when the calling account's own role is  user, rather than as the real allowance. This is what the portal is allowed, not what it consumes: the  consumption is reported by `GET api/2.0/portal/usedspace` in gigabytes and by `GET api/2.0/portal/userscount`.  The quotas the portal could move to are listed by `GET api/2.0/portal/payment/quotas`, and  `GET api/2.0/portal/quota/right` picks the smallest of them that would still fit. A free or trial quota  carries no price, and the billing state that goes with the quota - paid, in grace period or not paid - is read  from `GET api/2.0/portal/tariff`.
     * Responses:
     *  - 200: The allowance the current tariff grants this portal, with sizes in bytes
     *  - 403: The caller has no portal-settings right
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-quota/
     *
     *
     * @return [TenantQuotaWrapper]
     */
    @GET("api/2.0/portal/quota")
    suspend fun getPortalQuota(): Response<TenantQuotaWrapper>

    /**
     * GET api/2.0/portal/tariff
     * Get the portal tariff
     * Returns the tariff this portal runs on: its state, the end of the current period and the quotas - the plan and  its add-ons - it is made of. Nothing has to be called first, the call is read-only and idempotent, and it  keeps answering while the portal's payment has lapsed, which is what a client needs in order to show a payment  warning. How much of it is filled depends on the caller: every user gets `state`, which is `Trial`, `Paid`,  `Delay` for the grace period after the due date, or `NotPaid`; a room or DocSpace administrator also gets  `dueDate` and `delayDueDate`; and a caller with the portal-settings right additionally gets `id`,  `customerId`, `licenseDate`, the `openSource`, `enterprise` and `developer` flags and `quotas`, each entry  naming the quota, its quantity, its own due date and the quota it switches to next period. Dates are in the  portal time zone. Pass `refresh=true` to re-read the tariff from the billing system instead of the portal  cache - it is slower, so use it after a payment, not on every page. What the next period will cost is listed  by `GET api/2.0/portal/tariff/upcoming`.
     * Responses:
     *  - 200: The tariff of this portal, filled as far as the rights of the caller allow
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalTariff Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-tariff/
     *
     *
     * @param refresh Whether the tariff is re-read from the billing system instead of the portal cache. The remote read is slower,  so ask for it right after a payment and leave it off for ordinary page loads. (optional)
     * @return [TariffWrapper]
     */
    @GET("api/2.0/portal/tariff")
    suspend fun getPortalTariff(@Query("refresh") refresh: kotlin.Boolean? = null): Response<TariffWrapper>

    /**
     * GET api/2.0/portal/usedspace
     * Get the portal used space
     * Returns how much space the content of this portal occupies, in gigabytes rounded to two decimals, so a client  can show the storage bar next to the allowance. The caller needs the portal-settings right and is refused  without it; the call is read-only and idempotent. The number is added up from the storage counters the portal  keeps per owner, which means content that belongs to no account - system data - is not part of it, and it is a  plain number, not an object. The counters are maintained as files are written and removed, so the value is  current but may lag a large operation that is still running. The allowance to compare it with is  `maxTotalSize` from `GET api/2.0/portal/quota`, in bytes rather than gigabytes, and the smallest quota that  would still fit the portal is suggested by `GET api/2.0/portal/quota/right`. This operation says nothing about  which room or user the space belongs to - the per-user figures come from the People API.
     * Responses:
     *  - 200: The space the portal content occupies, in gigabytes rounded to two decimals
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getPortalUsedSpace Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-portal-used-space/
     *
     *
     * @return [DoubleWrapper]
     */
    @GET("api/2.0/portal/usedspace")
    suspend fun getPortalUsedSpace(): Response<DoubleWrapper>

    /**
     * GET api/2.0/portal/quota/right
     * Get the recommended quota
     * Recommends the cheapest quota this portal could run on and still fit: the lowest-priced quota that is not  billed yearly, whose user allowance is above the number of active accounts and whose storage allowance is  above the space already used. The caller needs the portal-settings right and gets 403 without it. The call is  read-only, idempotent and buys nothing - it only picks one quota out of those the portal may switch to,  comparing them with the figures that `GET api/2.0/portal/userscount` and `GET api/2.0/portal/usedspace`  report. The answer is a single quota in the same shape as `GET api/2.0/portal/quota`, with sizes in bytes;  when no quota is large enough the answer is an empty body with 200 and not an error, so handle the empty  result as nothing to recommend. Yearly quotas are left out by design, so the recommendation is always a  monthly one - the full list to choose from comes from `GET api/2.0/portal/payment/quotas`, and the purchase  itself is started with `PUT api/2.0/portal/payment/url`.
     * Responses:
     *  - 200: The cheapest monthly quota that would still fit this portal, or an empty body when none does
     *  - 403: The caller has no portal-settings right
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getRightQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-right-quota/
     *
     *
     * @return [TenantQuotaWrapper]
     */
    @GET("api/2.0/portal/quota/right")
    suspend fun getRightQuota(): Response<TenantQuotaWrapper>

    /**
     * GET api/2.0/portal/tariff/upcoming
     * Get upcoming payments
     * Lists what this portal will be charged next for the quotas of its current tariff - one entry per quota that is  going to be billed, with the amount, the currency and the due date. The caller needs the portal-settings right  and gets 403 without it; the call is read-only and idempotent and keeps answering while the portal's payment  has lapsed. Only quotas that are really charged appear: an overdue quota is skipped, and so is a quota that  has no price of its own, such as a trial or a free plan - which is why the list can come back empty on a  portal that does have a tariff. When a switch to another quota is scheduled for the next period, the entry  describes that next quota and its quantity, so `id` and `name` may differ from what  `GET api/2.0/portal/tariff` reports for today. `amount` is the unit price multiplied by `quantity`, in the  currency named by `currency` as an ISO 4217 code, `dueDate` is in the portal time zone, and `wallet` marks a  service paid from the portal wallet instead of the subscription.
     * Responses:
     *  - 200: The charges the portal is going to be billed next, one entry per quota, empty when nothing is due
     *  - 403: The caller has no portal-settings right
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUpcomingPayments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-upcoming-payments/
     *
     *
     * @param refresh Whether the tariff is re-read from the billing system instead of the portal cache. The remote read is slower,  so ask for it right after a payment and leave it off for ordinary page loads. (optional)
     * @return [UpcomingPaymentArrayWrapper]
     */
    @GET("api/2.0/portal/tariff/upcoming")
    suspend fun getUpcomingPayments(@Query("refresh") refresh: kotlin.Boolean? = null): Response<UpcomingPaymentArrayWrapper>

}
