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

import onlyoffice.docspace.api.sdk.models.AiAgentsCreateRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsDeleteRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsGet200Response
import onlyoffice.docspace.api.sdk.models.AiAgentsResetQuotaRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsUpdateQuotaRequest
import onlyoffice.docspace.api.sdk.models.AiAgentsUpdateRequest
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiFileOperationWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderArrayWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderContentWrapper
import onlyoffice.docspace.api.sdk.models.AiFolderWrapper
import onlyoffice.docspace.api.sdk.models.AiNewItemsAgentNewItemsArrayWrapper

interface AIAgentsApi {
    /**
     * POST api/2.0/ai/agents
     * Create an agent
     * Creates an AI agent room and binds a model to it, in that order. `profileId` is required, has to be a UUID, has to name an existing profile, and that profile has to support chat - an image-only model is refused here rather than failing on every later request. `prompt` is required and is stored on the room as its standing instruction with any markup stripped, so it cannot round-trip HTML into another user's reply. The two steps are not atomic: when the room is created but the model binding fails, the call reports an error and the room is left behind, so re-bind it with `PUT api/2.0/ai/agents/{id}` rather than creating a second one.
     * Responses:
     *  - 200: The created agent room, with the model already bound to it.
     *  - 400: `profileId` is missing, is not a UUID, names no existing profile, or names one that does not support chat; or `prompt` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-create/
     *
     *
     * @param aiAgentsCreateRequest 
     * @return [AiFolderWrapper]
     */
    @POST("api/2.0/ai/agents")
    suspend fun aiAgentsCreate(@Body aiAgentsCreateRequest: AiAgentsCreateRequest): Response<AiFolderWrapper>

    /**
     * DELETE api/2.0/ai/agents/{id}
     * Delete an agent
     * Deletes an AI agent room. The ID has to be the room's integer identifier, and the body is forwarded to the DocSpace AI service unchanged, so it accepts the same options as deleting an ordinary room - `deleteAfter` among them. Deletion is asynchronous there: the answer is a file-operation payload to poll, not a completed result. The agent's model binding is deliberately left behind, because the upstream assignment API has no per-entry delete, so an orphaned assignment row survives the room.
     * Responses:
     *  - 200: The queued file operation. Deletion runs asynchronously, so poll DocSpace for its outcome.
     *  - 400: The agent ID is not a positive integer.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-delete/
     *
     *
     * @param id The agent identifier.
     * @param aiAgentsDeleteRequest 
     * @return [AiFileOperationWrapper]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/agents/{id}", hasBody = true)
    suspend fun aiAgentsDelete(@Path("id") id: kotlin.String, @Body aiAgentsDeleteRequest: AiAgentsDeleteRequest): Response<AiFileOperationWrapper>

    /**
     * GET api/2.0/ai/agents/{id}
     * Get an agent
     * Returns one AI agent room, enriched with the `profileId` currently bound to it so an edit form can prefill its model selector. The ID is the room's integer identifier, and a non-integer value is refused rather than passed on to fail opaquely upstream. The binding lives in an assignment rather than on the room, so it is looked up separately: a missing or unreadable assignment simply leaves `profileId` out of the answer instead of failing the call. The standing instruction comes back on the room as `chatSettings.prompt`.
     * Responses:
     *  - 200: The agent room, with `profileId` added when a model is bound to it.
     *  - 400: The agent ID is not a positive integer.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsGet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-get/
     *
     *
     * @param id The agent identifier.
     * @return [AiAgentsGet200Response]
     */
    @GET("api/2.0/ai/agents/{id}")
    suspend fun aiAgentsGet(@Path("id") id: kotlin.String): Response<AiAgentsGet200Response>

    /**
     * GET api/2.0/ai/agents
     * List agents
     * Lists the portal's AI agent rooms. The query is forwarded unchanged to the DocSpace AI service, so it takes the same paging, sorting and filtering parameters as an ordinary room listing, and the answer is that service's folder-content payload rather than a shape of this API's own. Array and object query values are dropped rather than guessed at, so send flat strings. The profile bound to each agent is not included here - read one agent with `GET api/2.0/ai/agents/{id}` for that.
     * Responses:
     *  - 200: The agent rooms, in the DocSpace AI service's folder-content envelope.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-list/
     *
     *
     * @param subjectId Show only the agent rooms this user takes part in. (optional)
     * @param subjectOwnerId Show only the agent rooms owned by this user. (optional)
     * @param excludeSubject Invert the user filter: leave out what `subjectId` selects instead of keeping it. (optional)
     * @param tags Show only the agent rooms carrying these tags, comma-separated. (optional)
     * @param withoutTags Show only the agent rooms that carry no tags at all. (optional)
     * @param quotaFilter Filter by quota kind: 0 for all, 1 for the default quota, 2 for a custom one. (optional)
     * @param filterValue Show only the agent rooms whose title matches this text. (optional)
     * @param sortBy Field to sort by, for example `DateAndTime`. (optional)
     * @param sortOrder Sort direction, `ascending` or `descending`. (optional)
     * @param startIndex Index of the first entry to return; 0 starts at the beginning. (optional)
     * @param count How many entries to return. The internal service applies its own default. (optional)
     * @return [AiFolderContentWrapper]
     */
    @GET("api/2.0/ai/agents")
    suspend fun aiAgentsList(@Query("subjectId") subjectId: kotlin.String? = null, @Query("subjectOwnerId") subjectOwnerId: kotlin.String? = null, @Query("excludeSubject") excludeSubject: kotlin.Boolean? = null, @Query("tags") tags: kotlin.String? = null, @Query("withoutTags") withoutTags: kotlin.Boolean? = null, @Query("quotaFilter") quotaFilter: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null, @Query("sortBy") sortBy: kotlin.String? = null, @Query("sortOrder") sortOrder: kotlin.String? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Response<AiFolderContentWrapper>

    /**
     * GET api/2.0/ai/agents/news
     * List agent news items
     * Lists the unread items across the caller's AI agent rooms, so a badge can be rendered without walking each room. It takes no parameters and is scoped to the caller by the DocSpace AI service. The answer is that service's new-items payload. This is a read-only operation and does not mark anything as seen.
     * Responses:
     *  - 200: The unread items of the caller's agent rooms.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsNews Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-news/
     *
     *
     * @return [AiNewItemsAgentNewItemsArrayWrapper]
     */
    @GET("api/2.0/ai/agents/news")
    suspend fun aiAgentsNews(): Response<AiNewItemsAgentNewItemsArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/resetquota
     * Reset agents' quota
     * Returns the listed AI agent rooms to the portal's default storage quota, forwarding `roomIds` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. This is the counterpart of `PUT api/2.0/ai/agents/agentquota` and takes no quota value of its own. Rooms already on the default are unaffected.
     * Responses:
     *  - 200: The updated agent rooms, one entry each.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsResetQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-reset-quota/
     *
     *
     * @param aiAgentsResetQuotaRequest 
     * @return [AiFolderArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/resetquota")
    suspend fun aiAgentsResetQuota(@Body aiAgentsResetQuotaRequest: AiAgentsResetQuotaRequest): Response<AiFolderArrayWrapper>

    /**
     * PUT api/2.0/ai/agents/{id}
     * Update an agent
     * Changes an AI agent room - its title, tags or standing instruction - and optionally rebinds its model. The ID has to be the room's integer identifier. `profileId` is not part of the room contract: it is taken out of the forwarded body and applied afterwards as the agent's assignment, and it has to be a UUID naming an existing chat-capable profile. An instruction sent as `chatSettings.prompt` has its markup stripped, as on create; note that when `chatSettings` is present the upstream service still requires the rest of that object to be valid, so send it whole.
     * Responses:
     *  - 200: The updated agent room.
     *  - 400: The agent ID is not a positive integer, or `profileId` is not a UUID, names no existing profile, or names one that does not support chat.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update/
     *
     *
     * @param id The agent identifier.
     * @param aiAgentsUpdateRequest 
     * @return [AiFolderWrapper]
     */
    @PUT("api/2.0/ai/agents/{id}")
    suspend fun aiAgentsUpdate(@Path("id") id: kotlin.String, @Body aiAgentsUpdateRequest: AiAgentsUpdateRequest): Response<AiFolderWrapper>

    /**
     * PUT api/2.0/ai/agents/agentquota
     * Update agents' quota
     * Sets the storage quota of the listed AI agent rooms in one call, forwarding `roomIds` and `quota` to the DocSpace AI service unchanged. The answer is that service's payload, one updated room per entry. A quota applies to the room's stored files, not to the model usage of its chats. Use `PUT api/2.0/ai/agents/resetquota` to return rooms to the portal default instead of naming a number.
     * Responses:
     *  - 200: The updated agent rooms, one entry each.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiAgentsUpdateQuota Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-agents-update-quota/
     *
     *
     * @param aiAgentsUpdateQuotaRequest 
     * @return [AiFolderArrayWrapper]
     */
    @PUT("api/2.0/ai/agents/agentquota")
    suspend fun aiAgentsUpdateQuota(@Body aiAgentsUpdateQuotaRequest: AiAgentsUpdateQuotaRequest): Response<AiFolderArrayWrapper>

}
