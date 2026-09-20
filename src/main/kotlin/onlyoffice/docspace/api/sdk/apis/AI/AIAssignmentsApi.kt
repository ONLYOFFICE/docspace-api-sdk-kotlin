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
import onlyoffice.docspace.api.sdk.models.AiAssignmentsCascadeProfileDeleteRequest
import onlyoffice.docspace.api.sdk.models.AiBulkAssignmentResult
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiResolvedAssignment
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIAssignmentsApi {
    /**
     * PUT api/2.0/ai/assignments/assign
     * Bind a profile to an action
     * Binds a profile to one AI action portal-wide, creating the assignment or replacing it in place, and returns the result. Both `actionType` and `profileId` are required. The profile's declared capabilities are checked against the action, so a model that cannot generate images cannot be bound to `ImageGeneration` - the `Default` slot is exempt, because it stands in for every action. There is no room-scoped form of this write: a room's own binding is created by the agent that owns it, while reads accept an `entityId`.
     * Responses:
     *  - 200: Whether the binding was stored. A failure is reported in `error` rather than as a status.
     *  - 400: `actionType` or `profileId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Applies many action-to-profile bindings in one write, which is how a settings screen saves the whole set. The body is a plain map of action type to profile ID, and every entry is validated before anything is written: one unknown action or one non-string profile ID rejects the request whole, so the set is never left half-applied. Each entry behaves as the single assign operation does, capability checks included. The answer carries the resulting assignment set.
     * Responses:
     *  - 200: Whether the set was stored, with `errors` listing the entries that were refused.
     *  - 400: The body is not a map of action type to profile ID, or one of its keys is not a known action type.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAssignmentsBulkAssign Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-bulk-assign/
     *
     *
     * @param requestBody A map of action type to profile ID. Every key has to be a known action type and every value a profile ID; one bad entry rejects the whole map.
     * @return [AiBulkAssignmentResult]
     */
    @PUT("api/2.0/ai/assignments/bulk-assign")
    suspend fun aiAssignmentsBulkAssign(@Body requestBody: kotlin.collections.Map<kotlin.String, kotlin.String>): Response<AiBulkAssignmentResult>

    /**
     * DELETE api/2.0/ai/assignments/cascade-profile-delete
     * Cascade profile delete
     * Detaches a profile from every assignment that points at it, which is the cleanup step before the profile itself is removed. The `Default` slot is promoted to the first remaining profile, or dropped when none is left, and every other slot holding the profile is cleared. `profileId` is required and may be sent in the body or as a query parameter. `DELETE api/2.0/ai/profiles/delete` already does this, so call it directly only when the profile is being removed by some other means.
     * Responses:
     *  - 200: Confirms no assignment points at the profile any more.
     *  - 400: `profileId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAssignmentsCascadeProfileDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-assignments-cascade-profile-delete/
     *
     *
     * @param aiAssignmentsCascadeProfileDeleteRequest The profile to detach from every assignment. May be sent as the `profileId` query parameter instead of in the body.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/assignments/cascade-profile-delete", hasBody = true)
    suspend fun aiAssignmentsCascadeProfileDelete(@Body aiAssignmentsCascadeProfileDeleteRequest: AiAssignmentsCascadeProfileDeleteRequest): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/assignments/get-all-assignments
     * Get all assignments
     * Returns every action-to-profile binding of a scope as one map, which is what a settings screen loads. `entityId` narrows it to a room and has to name one the caller can open; a room that is not an agent room degrades to the portal-wide set rather than answering empty, and omitting the parameter reads the portal-wide set directly. Actions with no binding are simply absent from the map. The `Default` slot is reported as an entry of its own rather than being folded into the others.
     * Responses:
     *  - 200: The scope's bindings as a map of action type to profile ID. An action with no binding is absent.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: The referenced object does not exist, or the caller cannot access it - the two are deliberately indistinguishable, so a room the caller may not open answers 404 rather than 403.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the profile bound to one AI action, without applying the `Default` fallback - an empty answer means this action has no profile of its own, not that nothing is configured. `actionType` is required and is read from the query. Use `GET api/2.0/ai/assignments/resolve-for-action` to learn which profile would actually serve the action. This reads the portal-wide binding and accepts no `entityId`.
     * Responses:
     *  - 200: The profile bound to the action, or an empty result when it has none of its own.
     *  - 400: `actionType` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the profile that will serve one AI action, falling back to the `Default` slot when the action has no profile of its own. `actionType` is required and has to be one of the known actions - an unknown or misspelled value is rejected rather than resolved to the default. `entityId` narrows the lookup to a room, and a room with no assignment of its own degrades to the portal-wide one. This fails when neither slot is set or the bound profile is gone, so use `GET api/2.0/ai/assignments/try-resolve-for-action` when an unconfigured portal should answer empty instead.
     * Responses:
     *  - 200: The profile that will serve the action.
     *  - 400: `actionType` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Returns the profile that will serve one AI action, exactly as `GET api/2.0/ai/assignments/resolve-for-action` does, but answers with an empty result rather than failing when nothing is configured. `actionType` is required and is validated the same way, and `entityId` narrows the lookup to a room. This is the operation to call when the absence of a profile is a normal state to render - a settings screen, or a feature that hides itself. Both operations are read-only.
     * Responses:
     *  - 200: The profile that will serve the action, or an empty result when none is configured.
     *  - 400: `actionType` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Clear an action's profile
     * Clears the portal-wide binding of one AI action, after which the action falls back to the `Default` slot. `actionType` is required and may be sent in the body or as a query parameter. An action whose slot is already empty is not reported as an error - the call answers success either way, so it is safe to repeat. Clearing `Default` itself leaves the actions that relied on it unresolvable.
     * Responses:
     *  - 200: Confirms the action now has no profile of its own.
     *  - 400: `actionType` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
