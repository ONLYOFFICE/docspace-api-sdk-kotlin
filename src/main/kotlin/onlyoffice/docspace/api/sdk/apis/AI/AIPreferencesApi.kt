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

import onlyoffice.docspace.api.sdk.models.AiChatToolPermissionMode
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiPreferencesSetDeepModeRequest
import onlyoffice.docspace.api.sdk.models.AiPreferencesSetReasoningLevelRequest
import onlyoffice.docspace.api.sdk.models.AiPreferencesSetToolPermissionModeRequest
import onlyoffice.docspace.api.sdk.models.AiReasoningLevel
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIPreferencesApi {
    /**
     * DELETE api/2.0/ai/preferences/clear-deep-mode
     * Clear deep mode
     * Removes the stored extended-thinking setting of a scope (the depth and, with it, the deep-mode toggle), after which reads fall back to the configured default rather than to false. `entityId` picks a room and omitting it clears the portal-wide preference. Clearing a scope that has no stored value is not an error. This differs from storing false, which is an explicit choice a later read reports as set.
     * Responses:
     *  - 200: Confirms the scope has no preference of its own and now inherits the default.
     *  - 400: `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesClearDeepMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/
     *
     *
     * @param aiPreferencesClearDeepModeRequest The ID of the room whose preference is cleared, as a bare JSON string. Send an empty body to clear the portal-wide preference.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/preferences/clear-deep-mode", hasBody = true)
    suspend fun aiPreferencesClearDeepMode(@Body aiPreferencesClearDeepModeRequest: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/preferences/get-deep-mode
     * Get deep mode
     * Returns the deep-mode toggle of a scope, as a bare boolean: whether the stored extended-thinking depth is above `off`. `entityId` picks a room and omitting it reads the portal-wide preference; a value that is not a room ID is refused with 400, as it is on the write. A scope that has never had a value stored falls back to the configured default, so the answer never distinguishes off from unset - ask `GET api/2.0/ai/preferences/is-deep-mode-set` for that. This is a read-only operation.
     * Responses:
     *  - 200: Whether deep mode is on, falling back to the configured default when the scope has no value of its own.
     *  - 400: `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesGetDeepMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-deep-mode/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Boolean]
     */
    @GET("api/2.0/ai/preferences/get-deep-mode")
    suspend fun aiPreferencesGetDeepMode(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Boolean>

    /**
     * GET api/2.0/ai/preferences/get-reasoning-level
     * Get reasoning level
     * Returns the effective extended-thinking depth of the scope: `off` while deep mode is off, otherwise the persisted depth (`low`, `medium`, `high`, `max`), falling back to the default depth (`medium`) when none has been stored. `entityId` picks a room and omitting it reads the portal-wide preference; a value that is not a room ID is refused with 400. Providers clamp the depth to what the model accepts.
     * Responses:
     *  - 200: Success.
     *  - 400: `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesGetReasoningLevel Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-reasoning-level/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiReasoningLevel]
     */
    @GET("api/2.0/ai/preferences/get-reasoning-level")
    suspend fun aiPreferencesGetReasoningLevel(@Query("entityId") entityId: kotlin.String? = null): Response<AiReasoningLevel>

    /**
     * GET api/2.0/ai/preferences/get-tool-permission-mode
     * Get tool permission mode
     * Returns how a tool call the model makes is approved for the calling user, in the chat library's spelling: `ask` prompts for every call bar the tools pinned as always allowed, `auto` also runs a tool that opted out of approval itself or is annotated read-only / non-destructive, `allow` runs everything without asking. The mode is one value per user, stored in the user's AI settings (the same value `GET api/2.0/ai/config/tool-mode` reports as the AI service's enum); `entityId` is accepted for symmetry with the depth routes and ignored, though a value that is not a room ID is still refused with 400. The AI service's default is `auto`.
     * Responses:
     *  - 200: The mode in force for the scope, as a bare JSON string, falling back to `ask` when none is stored.
     *  - 400: `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesGetToolPermissionMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-get-tool-permission-mode/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [AiChatToolPermissionMode]
     */
    @GET("api/2.0/ai/preferences/get-tool-permission-mode")
    suspend fun aiPreferencesGetToolPermissionMode(@Query("entityId") entityId: kotlin.String? = null): Response<AiChatToolPermissionMode>

    /**
     * GET api/2.0/ai/preferences/is-deep-mode-set
     * Is deep mode set
     * Tells whether a scope has an explicitly persisted extended-thinking setting of its own, as opposed to inheriting the configured default. `entityId` picks a room and omitting it asks about the portal-wide preference; a value that is not a room ID is refused with 400. A true answer means a value was stored, whether that value is on or off - read the value itself with `GET api/2.0/ai/preferences/get-deep-mode`. This is the check a settings screen uses to show an explicit override rather than an inherited state.
     * Responses:
     *  - 200: Whether the scope has a preference of its own, whichever way that preference is set.
     *  - 400: `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesIsDeepModeSet Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-is-deep-mode-set/
     *
     *
     * @param entityId The DocSpace entity the request is scoped to - the room, folder or agent workspace the chat is invoked from. Omit for the portal-wide scope. (optional)
     * @return [kotlin.Boolean]
     */
    @GET("api/2.0/ai/preferences/is-deep-mode-set")
    suspend fun aiPreferencesIsDeepModeSet(@Query("entityId") entityId: kotlin.String? = null): Response<kotlin.Boolean>

    /**
     * PUT api/2.0/ai/preferences/set-deep-mode
     * Set deep mode
     * Stores the deep-mode toggle of a scope. `false` stores the `off` depth; `true` keeps the depth already stored and falls back to the default depth (`medium`) when none is. `value` has to be a real boolean: a string, a number or an absent value is rejected rather than coerced, so the string false cannot silently switch the setting on and an empty request cannot silently switch it off. `entityId` picks a room and omitting it writes the portal-wide preference. It is idempotent, so there is no need to read the current value first.
     * Responses:
     *  - 200: Confirms the preference was stored.
     *  - 400: `value` is missing or is not a boolean, or `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesSetDeepMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-deep-mode/
     *
     *
     * @param aiPreferencesSetDeepModeRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/preferences/set-deep-mode")
    suspend fun aiPreferencesSetDeepMode(@Body aiPreferencesSetDeepModeRequest: AiPreferencesSetDeepModeRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/preferences/set-reasoning-level
     * Set reasoning level
     * Persists the extended-thinking depth of the scope as its single stored value: a depth turns deep mode on at that depth, `off` turns it off and replaces the stored depth (a later deep-mode `true` without a depth lands on `medium`). `entityId` picks a room and omitting it writes the portal-wide preference. Idempotent.
     * Responses:
     *  - 200: Success.
     *  - 400: `value` is not one of the depths, or `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesSetReasoningLevel Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-reasoning-level/
     *
     *
     * @param aiPreferencesSetReasoningLevelRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/preferences/set-reasoning-level")
    suspend fun aiPreferencesSetReasoningLevel(@Body aiPreferencesSetReasoningLevelRequest: AiPreferencesSetReasoningLevelRequest): Response<AiSuccessResponse>

    /**
     * PUT api/2.0/ai/preferences/set-tool-permission-mode
     * Set tool permission mode
     * Persists the tool permission mode of the calling user. `value` has to be one of `ask`, `auto`, `allow`: anything else is rejected rather than coerced, so an absent or mistyped value can never overwrite the stored mode. `entityId` is validated like on the other writes and otherwise ignored - the mode applies to every chat of the user. Idempotent.
     * Responses:
     *  - 200: Confirms the preference was stored.
     *  - 400: `value` is not one of `ask`, `auto`, `allow`, or `entityId` is not a room ID.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, the caller is a guest, or the room named by `entityId` is one the caller cannot open. Relayed from the DocSpace AI service or the Files API.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiPreferencesSetToolPermissionMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-set-tool-permission-mode/
     *
     *
     * @param aiPreferencesSetToolPermissionModeRequest 
     * @return [AiSuccessResponse]
     */
    @PUT("api/2.0/ai/preferences/set-tool-permission-mode")
    suspend fun aiPreferencesSetToolPermissionMode(@Body aiPreferencesSetToolPermissionModeRequest: AiPreferencesSetToolPermissionModeRequest): Response<AiSuccessResponse>

}
