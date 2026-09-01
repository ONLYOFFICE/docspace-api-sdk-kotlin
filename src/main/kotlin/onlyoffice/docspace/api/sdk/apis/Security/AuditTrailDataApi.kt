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

import onlyoffice.docspace.api.sdk.models.ActionType
import onlyoffice.docspace.api.sdk.models.AuditEventArrayWrapper
import onlyoffice.docspace.api.sdk.models.AuditReportFormat
import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskWrapper
import onlyoffice.docspace.api.sdk.models.EntryType
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.LocationType
import onlyoffice.docspace.api.sdk.models.MessageAction
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.ProductType
import onlyoffice.docspace.api.sdk.models.TenantAuditSettingsResponseWrapper
import onlyoffice.docspace.api.sdk.models.TenantAuditSettingsWrapper

interface AuditTrailDataApi {
    /**
     * POST api/2.0/security/audit/events/report
     * Start the audit trail report generation
     * Starts generating the audit trail report (XLSX by default, or CSV) and saves it to My documents.
     * Responses:
     *  - 200: Operation execution status
     *  - 402: Your pricing plan does not support this option
     *  - 403: You don't have enough permission to create
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for createAuditTrailReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/
     *
     *
     * @param format The output file format of the report. Defaults to XLSX. (optional)
     * @return [DocumentBuilderTaskWrapper]
     */
    @POST("api/2.0/security/audit/events/report")
    suspend fun createAuditTrailReport(@Query("format") format: AuditReportFormat? = null): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/security/audit/events/filter
     * Get filtered audit trail data
     * Returns a list of the audit events by the parameters specified in the request.
     * Responses:
     *  - 200: List of filtered audit trail data
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuditEventsByFilter Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-events-by-filter/
     *
     *
     * @param userId The ID of the user who triggered the audit event. (optional)
     * @param moduleType The location where the audit event occurred. (optional)
     * @param actionType The type of action performed in the audit event (e.g., Create, Update, Delete). (optional)
     * @param action The specific action that occurred within the audit event. (optional)
     * @param entryType The type of audit entry (e.g., Folder, User, File). (optional)
     * @param target The target object affected by the audit event (e.g., document ID, user account). (optional)
     * @param from The starting date and time for filtering audit events. (optional)
     * @param to The ending date and time for filtering audit events. (optional)
     * @param count The maximum number of audit event records to retrieve. (optional)
     * @param startIndex The index of the first audit event record to retrieve in a paged query. (optional)
     * @return [AuditEventArrayWrapper]
     */
    @GET("api/2.0/security/audit/events/filter")
    suspend fun getAuditEventsByFilter(@Query("userId") userId: java.util.UUID? = null, @Query("moduleType") moduleType: LocationType? = null, @Query("actionType") actionType: ActionType? = null, @Query("action") action: MessageAction? = null, @Query("entryType") entryType: EntryType? = null, @Query("target") target: kotlin.String? = null, @Query("from") from: java.time.OffsetDateTime? = null, @Query("to") to: java.time.OffsetDateTime? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Response<AuditEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/settings/lifetime
     * Get the audit trail settings
     * Returns the audit trail settings.
     * Responses:
     *  - 200: Audit settings
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuditSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/
     *
     *
     * @return [TenantAuditSettingsResponseWrapper]
     */
    @GET("api/2.0/security/audit/settings/lifetime")
    suspend fun getAuditSettings(): Response<TenantAuditSettingsResponseWrapper>

    /**
     * GET api/2.0/security/audit/mappers
     * Get audit trail mappers
     * Returns the mappers for the audit trail types.
     * Responses:
     *  - 200: Audit trail mappers
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuditTrailMappers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/
     *
     *
     * @param productType The type of product related to the audit trail. (optional)
     * @param moduleType The location associated with the audit trail. (optional)
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/security/audit/mappers")
    suspend fun getAuditTrailMappers(@Query("productType") productType: ProductType? = null, @Query("moduleType") moduleType: LocationType? = null): Response<ObjectWrapper>

    /**
     * GET api/2.0/security/audit/events/report
     * Get the audit trail report generation status
     * Returns the status of generating the audit trail report.
     * Responses:
     *  - 200: Operation execution status
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuditTrailReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-report/
     *
     *
     * @return [DocumentBuilderTaskWrapper]
     */
    @GET("api/2.0/security/audit/events/report")
    suspend fun getAuditTrailReport(): Response<DocumentBuilderTaskWrapper>

    /**
     * GET api/2.0/security/audit/types
     * Get audit trail types
     * Returns all the available audit trail types.
     * Responses:
     *  - 200: Audit trail types
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getAuditTrailTypes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/
     *
     *
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/security/audit/types")
    suspend fun getAuditTrailTypes(): Response<ObjectWrapper>

    /**
     * GET api/2.0/security/audit/events/last
     * Get audit trail data
     * Returns a list of the latest changes (creation, modification, deletion, etc.) made by users to the entities on the portal.
     * Responses:
     *  - 200: List of audit trail data
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getLastAuditEvents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-audit-events/
     *
     *
     * @return [AuditEventArrayWrapper]
     */
    @GET("api/2.0/security/audit/events/last")
    suspend fun getLastAuditEvents(): Response<AuditEventArrayWrapper>

    /**
     * POST api/2.0/security/audit/settings/lifetime
     * Set the audit trail settings
     * Sets the audit trail settings for the current portal.
     * Responses:
     *  - 200: Audit trail settings
     *  - 400: Exception in LoginHistoryLifeTime or AuditTrailLifeTime
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setAuditSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/
     *
     *
     * @param tenantAuditSettingsWrapper  (optional)
     * @return [TenantAuditSettingsResponseWrapper]
     */
    @POST("api/2.0/security/audit/settings/lifetime")
    suspend fun setAuditSettings(@Body tenantAuditSettingsWrapper: TenantAuditSettingsWrapper? = null): Response<TenantAuditSettingsResponseWrapper>

    /**
     * DELETE api/2.0/security/audit/events/report
     * Terminate the audit trail report generation
     * Terminates generating the audit trail report.
     * Responses:
     *  - 200: Ok
     *  - 402: Your pricing plan does not support this option
     *  - 403: No permissions to perform this action
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for terminateAuditTrailReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/terminate-audit-trail-report/
     *
     *
     * @return [Unit]
     */
    @DELETE("api/2.0/security/audit/events/report")
    suspend fun terminateAuditTrailReport(): Response<Unit>

}
