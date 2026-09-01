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


package onlyoffice.docspace.api.sdk.apis.AI

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiActionType
import onlyoffice.docspace.api.sdk.models.AiAssignmentMutationResult
import onlyoffice.docspace.api.sdk.models.AiAssignmentsAssignRequest
import onlyoffice.docspace.api.sdk.models.AiBulkAssignmentResult
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiResolvedAssignment
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIAssignmentsApi {
    /**
     * PUT api/2.0/ai/assignments/assign
     * Assign
     * Binds a profile to an AI action, creating the assignment or updating it in place. The profile's declared capabilities are validated against the action, except for the `Default` slot.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsAssign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-assign/
     *
     *
     * @param aiAssignmentsAssignRequest 
     * @return [AiAssignmentMutationResult]
     */
    @PUT("api/2.0/ai/assignments/assign")
    suspend fun aiAssignmentsAssign(@Body aiAssignmentsAssignRequest: AiAssignmentsAssignRequest): Response<AiAssignmentMutationResult>

    /**
     * PUT api/2.0/ai/assignments/bulk-assign
     * Bulk assign
     * Applies many action-to-profile bindings at once. Every entry is validated first and nothing is written if any of them fails, so the assignment set is never left half-written.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsBulkAssign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
     *
     *
     * @param requestBody 
     * @return [AiBulkAssignmentResult]
     */
    @PUT("api/2.0/ai/assignments/bulk-assign")
    suspend fun aiAssignmentsBulkAssign(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.String>): Response<AiBulkAssignmentResult>

    /**
     * DELETE api/2.0/ai/assignments/cascade-profile-delete
     * Cascade profile delete
     * Cleans up the assignments pointing at a profile that is about to be deleted: the `Default` slot is promoted to the first remaining profile (or dropped when none is left), and every other slot holding that profile is unbound.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/assignments/cascade-profile-delete", hasBody = true)
    suspend fun aiAssignmentsCascadeProfileDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/assignments/get-all-assignments
     * Get all assignments
     * Returns the full action-to-profile assignment map of the scope.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsGetAllAssignments Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-all-assignments/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.collections.Map<kotlin.String, kotlin.String>]
     */
    @GET("api/2.0/ai/assignments/get-all-assignments")
    suspend fun aiAssignmentsGetAllAssignments(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/2.0/ai/assignments/get-assignment
     * Get assignment
     * Returns the profile bound to one AI action, without the `Default` fallback.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsGetAssignment Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-get-assignment/
     *
     *
     * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.
     * @return [kotlin.String]
     */
    @GET("api/2.0/ai/assignments/get-assignment")
    suspend fun aiAssignmentsGetAssignment(@Query("actionType") actionType: kotlin.String): Response<kotlin.String>

    /**
     * GET api/2.0/ai/assignments/resolve-for-action
     * Resolve for action
     * Resolves the profile bound to an AI action, falling back to the `Default` slot when the action itself has none. Fails when neither slot is set or the bound profile no longer exists - use `try-resolve-for-action` for an empty answer instead.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsResolveForAction Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-resolve-for-action/
     *
     *
     * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiResolvedAssignment]
     */
    @GET("api/2.0/ai/assignments/resolve-for-action")
    suspend fun aiAssignmentsResolveForAction(@Query("actionType") actionType: kotlin.String, @Query("entityId") entityId: kotlin.String? = null): Response<AiResolvedAssignment>

    /**
     * GET api/2.0/ai/assignments/try-resolve-for-action
     * Try resolve for action
     * Resolves the profile bound to an AI action exactly like `resolve-for-action`, but answers with an empty result instead of failing when nothing is configured.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsTryResolveForAction Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-try-resolve-for-action/
     *
     *
     * @param actionType The AI action the request applies to - one of Default, Chat, Code, Summarization, Translation, TextAnalyze, ImageGeneration, OCR, Vision.
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiResolvedAssignment]
     */
    @GET("api/2.0/ai/assignments/try-resolve-for-action")
    suspend fun aiAssignmentsTryResolveForAction(@Query("actionType") actionType: kotlin.String, @Query("entityId") entityId: kotlin.String? = null): Response<AiResolvedAssignment>

    /**
     * DELETE api/2.0/ai/assignments/unassign
     * Unassign
     * Removes the profile binding of an AI action. Does nothing when that slot is already empty.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiAssignmentsUnassign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-unassign/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/assignments/unassign", hasBody = true)
    suspend fun aiAssignmentsUnassign(@Body body: kotlin.String): Response<AiSuccessResponse>

}
