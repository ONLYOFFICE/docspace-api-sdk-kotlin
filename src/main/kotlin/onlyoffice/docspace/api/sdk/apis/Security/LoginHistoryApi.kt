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


package onlyoffice.docspace.api.sdk.apis.Security

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AuditReportFormat
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.LoginEventArrayWrapper
import onlyoffice.docspace.api.sdk.models.MessageAction

interface LoginHistoryApi {
    /**
     * POST api/2.0/security/audit/login/report
     * Start login history report
     * Queues a report of the portal's login history and returns the state of the background job that builds it. The  report covers the period reaching from now back by the login history lifetime that  `GET api/2.0/security/audit/settings/lifetime` reports and is never filtered: the query parameters of  `GET api/2.0/security/audit/login/filter` do not apply here. The caller needs the portal-settings right of a  DocSpace administrator plus the audit option of the portal's pricing plan, otherwise the call is answered with  402. The file is not ready when the response arrives - poll `GET api/2.0/security/audit/login/report` until  `isCompleted` is true, then take `resultFileUrl`, and treat a non-empty `error` as a failed build. The  finished file is saved to the caller's My documents section, as an XLSX workbook by default or as CSV when  `format=Csv`, in which case `resultFileId` stays empty and only the name and the URL identify it. One job runs  per caller and kind: calling again while the previous one is still building returns that job instead of  starting a second, and `DELETE api/2.0/security/audit/login/report` cancels it.
     * Responses:
     *  - 200: The state of the queued job that builds the login history report
     *  - 402: The portal's pricing plan has no audit option, or the login history and audit trail section is not enabled
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createLoginHistoryReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
     *
     *
     * @param format The format the report file is written in. The workbook format is the default and is the only one that leaves  the finished file addressable by ID: a report asked for as CSV comes back with an empty `resultFileId`, so it  can only be reached through `resultFileName` and `resultFileUrl`. (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/security/audit/login/report")
    suspend fun createLoginHistoryReport(@Query("format") format: AuditReportFormat? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/security/audit/login/last
     * Get recent login events
     * Returns the twenty most recent login events of the whole portal - successful sign-ins, sign-outs and failed  attempts alike - as the short summary a settings page shows before anyone asks for the full history. The  caller needs the portal-settings right of a DocSpace administrator, and in a cloud installation the login  history and audit trail section must be enabled for the portal, otherwise the call is answered with 402. The  operation is read-only and takes no parameters: the number of events is fixed at twenty, nothing can be  filtered, and events are ordered newest first. `date` is given in the portal time zone, `actionText` is the  readable sentence describing the event with every substituted value shortened to fifty characters here, and  `country` and `city` are resolved from the IP address and stay empty when it cannot be located. An empty list  means the portal has recorded no login events yet. Use `GET api/2.0/security/audit/login/filter` to filter by  user, action or period and to page through the whole history.
     * Responses:
     *  - 200: The twenty most recent login events of the portal, newest first
     *  - 402: The login history and audit trail section is not enabled for this portal
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLastLoginEvents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-login-events/
     *
     *
     * @return [LoginEventArrayWrapper]
     */
    @GET("api/2.0/security/audit/login/last")
    suspend fun getLastLoginEvents(): Response<LoginEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/login/filter
     * Get filtered login events
     * Returns the portal's login events that match the filters in the query - by user, by login action and by period  - and is the operation behind the login history page. The caller needs the portal-settings right of a DocSpace  administrator plus the audit option of the portal's pricing plan; when that option is missing the filters are  silently ignored and the answer is the same twenty most recent events that  `GET api/2.0/security/audit/login/last` returns, and when the login history and audit trail section is  disabled altogether the call is answered with 402. Omit a filter to match everything. `from` and `to` are read  as UTC instants while `date` comes back in the portal time zone, `count` defaults to 100 and cannot exceed it,  `startIndex` skips events from the newest end, and the page window is applied to the log before the filters,  so a page can hold fewer items than `count` while older matches still exist. The operation is read-only; take  the values accepted by `action` from `GET api/2.0/security/audit/types`.
     * Responses:
     *  - 200: Login events matching the filters, newest first, or the twenty most recent events when the portal has no audit option
     *  - 402: The login history and audit trail section is not enabled for this portal
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLoginEventsByFilter Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-events-by-filter/
     *
     *
     * @param userId The user whose sign-in attempts are kept, given by portal user ID. Leave it at the empty GUID to keep the  events of every user. (optional)
     * @param action The sign-in action recorded, spelled as `GET api/2.0/security/audit/types` lists it under `actions` - a  successful login, a failed one, a logout. The default value keeps every action. (optional)
     * @param from The earliest moment an event may have been recorded at, read as a UTC instant. The `date` of the events that  come back is in the portal time zone instead, so the two do not line up on a portal that is not on UTC. (optional)
     * @param to The latest moment an event may have been recorded at, read as a UTC instant in the same way as `from`. (optional)
     * @param count How many events one page may hold. The maximum is also the default, so a client that wants shorter pages has  to ask for them. (optional)
     * @param startIndex How many events to skip before the page begins, counting from the newest. It is applied to the log before  the filters, so a page can hold fewer events than `count` while older matches still exist. (optional)
     * @return [LoginEventArrayWrapper]
     */
    @GET("api/2.0/security/audit/login/filter")
    suspend fun getLoginEventsByFilter(@Query("userId") userId: java.util.UUID? = null, @Query("action") action: MessageAction? = null, @Query("from") from: java.time.OffsetDateTime? = null, @Query("to") to: java.time.OffsetDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<LoginEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/login/report
     * Get login history report status
     * Returns the state of the login history report the calling user has started, and is the operation to poll after  `POST api/2.0/security/audit/login/report`. The caller needs the portal-settings right of a DocSpace  administrator plus the audit option of the portal's pricing plan, otherwise the call is answered with 402.  Jobs are kept per user and per report kind: this operation never shows another administrator's report, nor the  audit trail report, which has its own status at `GET api/2.0/security/audit/events/report`. The answer is  empty when no report of this kind is known for the caller; otherwise `percentage` grows towards 100,  `isCompleted` turns true when the build has ended, `error` carries the failure message when it ended badly,  and `resultFileName` and `resultFileUrl` point at the file saved to the caller's My documents section, while  `resultFileId` is filled for an XLSX report only. The operation is read-only and safe to poll every few  seconds; a finished job is dropped as soon as the next report of this kind is started.
     * Responses:
     *  - 200: The state of the caller's login history report, or an empty answer when none is known
     *  - 402: The portal's pricing plan has no audit option, or the login history and audit trail section is not enabled
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLoginHistoryReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-history-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/security/audit/login/report")
    suspend fun getLoginHistoryReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * DELETE api/2.0/security/audit/login/report
     * Terminate login history report
     * Cancels the login history report the calling user has running and drops it from the build queue. The caller  needs the portal-settings right of a DocSpace administrator plus the audit option of the portal's pricing  plan, otherwise the call is answered with 402. Cancellation is handed to the same background service that  builds the report, so a successful answer means the request was accepted rather than that the job has already  stopped: poll `GET api/2.0/security/audit/login/report` to watch it disappear. The operation returns no  content and touches only the caller's own login history report - the audit trail report is cancelled by  `DELETE api/2.0/security/audit/events/report`, and no report of another user can be reached from here. It is  idempotent: cancelling when nothing is running is not an error. A job stopped before it finished writing  leaves nothing in My documents, and a report cancelled by mistake has to be built again with  `POST api/2.0/security/audit/login/report`.
     * Responses:
     *  - 200: The cancellation of the caller's login history report has been accepted
     *  - 402: The portal's pricing plan has no audit option, or the login history and audit trail section is not enabled
     *  - 403: The caller does not have the portal-settings right of a DocSpace administrator
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateLoginHistoryReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-login-history-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/security/audit/login/report")
    suspend fun terminateLoginHistoryReport(): Response<Unit>

}
