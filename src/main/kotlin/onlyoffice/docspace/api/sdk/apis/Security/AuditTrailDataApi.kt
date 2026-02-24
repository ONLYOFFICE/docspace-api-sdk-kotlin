 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ActionType
import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.AuditEventArrayWrapper
import onlyoffice.docspace.api.sdk.models.EntryType
import onlyoffice.docspace.api.sdk.models.LocationType
import onlyoffice.docspace.api.sdk.models.MessageAction
import onlyoffice.docspace.api.sdk.models.ObjectWrapper
import onlyoffice.docspace.api.sdk.models.ProductType
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TenantAuditSettingsWrapper

import onlyoffice.docspace.api.sdk.models.*

interface AuditTrailDataApi {
    /**
     * POST api/2.0/security/audit/events/report
     * Generate the audit trail report
     * Generates the audit trail report.
     * Responses:
     *  - 200: URL to the xlsx report file
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *  - 403: You don't have enough permission to create
     *
     * REST API Reference for createAuditTrailReport Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-audit-trail-report/
     *
     *
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/security/audit/events/report")
    fun createAuditTrailReport(): Call<StringWrapper>

    /**
     * GET api/2.0/security/audit/events/filter
     * Get filtered audit trail data
     * Returns a list of the audit events by the parameters specified in the request.
     * Responses:
     *  - 200: List of filtered audit trail data
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
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
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param utcTime The time in UTC format. (optional)
     * @param timeZoneOffset The time zone offset. (optional)
     * @param count The maximum number of audit event records to retrieve. (optional)
     * @param startIndex The index of the first audit event record to retrieve in a paged query. (optional)
     * @return [Call]<[AuditEventArrayWrapper]>
     */
    @GET("api/2.0/security/audit/events/filter")
    fun getAuditEventsByFilter(@Query("userId") userId: java.util.UUID? = null, @Query("moduleType") moduleType: LocationType? = null, @Query("actionType") actionType: ActionType? = null, @Query("action") action: MessageAction? = null, @Query("entryType") entryType: EntryType? = null, @Query("target") target: kotlin.String? = null, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("utcTime") utcTime: java.time.OffsetDateTime? = null, @Query("timeZoneOffset") timeZoneOffset: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null): Call<AuditEventArrayWrapper>

    /**
     * GET api/2.0/security/audit/settings/lifetime
     * Get the audit trail settings
     * Returns the audit trail settings.
     * Responses:
     *  - 200: Audit settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for getAuditSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-settings/
     *
     *
     * @return [Call]<[TenantAuditSettingsWrapper]>
     */
    @GET("api/2.0/security/audit/settings/lifetime")
    fun getAuditSettings(): Call<TenantAuditSettingsWrapper>

    /**
     * GET api/2.0/security/audit/mappers
     * Get audit trail mappers
     * Returns the mappers for the audit trail types.
     * Responses:
     *  - 200: Audit trail mappers
     *
     * REST API Reference for getAuditTrailMappers Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-mappers/
     *
     *
     * @param productType The type of product related to the audit trail. (optional)
     * @param moduleType The location associated with the audit trail. (optional)
     * @return [Call]<[ObjectWrapper]>
     */
    @GET("api/2.0/security/audit/mappers")
    fun getAuditTrailMappers(@Query("productType") productType: ProductType? = null, @Query("moduleType") moduleType: LocationType? = null): Call<ObjectWrapper>

    /**
     * GET api/2.0/security/audit/types
     * Get audit trail types
     * Returns all the available audit trail types.
     * Responses:
     *  - 200: Audit trail types
     *
     * REST API Reference for getAuditTrailTypes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-audit-trail-types/
     *
     *
     * @return [Call]<[ObjectWrapper]>
     */
    @GET("api/2.0/security/audit/types")
    fun getAuditTrailTypes(): Call<ObjectWrapper>

    /**
     * GET api/2.0/security/audit/events/last
     * Get audit trail data
     * Returns a list of the latest changes (creation, modification, deletion, etc.) made by users to the entities on the portal.
     * Responses:
     *  - 200: List of audit trail data
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for getLastAuditEvents Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-last-audit-events/
     *
     *
     * @return [Call]<[AuditEventArrayWrapper]>
     */
    @GET("api/2.0/security/audit/events/last")
    fun getLastAuditEvents(): Call<AuditEventArrayWrapper>

    /**
     * POST api/2.0/security/audit/settings/lifetime
     * Set the audit trail settings
     * Sets the audit trail settings for the current portal.
     * Responses:
     *  - 200: Audit trail settings
     *  - 400: Exception in LoginHistoryLifeTime or AuditTrailLifeTime
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for setAuditSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-audit-settings/
     *
     *
     * @param tenantAuditSettingsWrapper  (optional)
     * @return [Call]<[TenantAuditSettingsWrapper]>
     */
    @POST("api/2.0/security/audit/settings/lifetime")
    fun setAuditSettings(@Body tenantAuditSettingsWrapper: TenantAuditSettingsWrapper? = null): Call<TenantAuditSettingsWrapper>

}
