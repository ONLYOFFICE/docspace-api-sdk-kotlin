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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.AuditReportFormat
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.LoginEventArrayWrapper
import onlyoffice.docspace.api.sdk.models.MessageAction

interface LoginHistoryApi {
    /**
     * POST api/2.0/security/audit/login/report
     * Start the login history report generation
     * Starts generating the login history report (XLSX by default, or CSV) and saves it to My documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createLoginHistoryReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-login-history-report/
     *
     *
     * @param format The output file format of the report. Defaults to XLSX. (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/security/audit/login/report")
    suspend fun createLoginHistoryReport(@Query("format") format: AuditReportFormat? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/security/audit/login/last
     * Get login history
     * Returns all the latest user login activity, including successful logins and error logs.
     * Responses:
     *  - 200: List of login events
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Returns a list of the login events by the parameters specified in the request.
     * Responses:
     *  - 200: List of filtered login events
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLoginEventsByFilter Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-login-events-by-filter/
     *
     *
     * @param userId The ID of the user whose login events are being queried. (optional)
     * @param action The login-related action to filter events by. (optional)
     * @param from The starting date and time for filtering login events. (optional)
     * @param to The ending date and time for filtering login events. (optional)
     * @param count The number of login events to retrieve in the query. (optional)
     * @param startIndex The starting index for fetching a subset of login events from the query results. (optional)
     * @return [LoginEventArrayWrapper]
     */
    @GET("api/2.0/security/audit/login/filter")
    suspend fun getLoginEventsByFilter(@Query("userId") userId: java.util.UUID? = null, @Query("action") action: MessageAction? = null, @Query("from") from: ApiDateTime? = null, @Query("to") to: ApiDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<LoginEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/login/report
     * Get the login history report generation status
     * Returns the status of generating the login history report.
     * Responses:
     *  - 200: Operation execution status
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
     * Terminate the login history report generation
     * Terminates generating the login history report.
     * Responses:
     *  - 200: Ok
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
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
