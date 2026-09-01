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

import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiPreferencesSetDeepModeRequest
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIPreferencesApi {
    /**
     * DELETE api/2.0/ai/preferences/clear-deep-mode
     * Clear deep mode
     * Drops the persisted deep-mode toggle of the scope, so later reads fall back to the configured default.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiPreferencesClearDeepMode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-preferences-clear-deep-mode/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/preferences/clear-deep-mode", hasBody = true)
    suspend fun aiPreferencesClearDeepMode(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/preferences/get-deep-mode
     * Get deep mode
     * Returns the deep-mode toggle of the scope, falling back to the configured default when nothing has been persisted.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * GET api/2.0/ai/preferences/is-deep-mode-set
     * Is deep mode set
     * Tells whether the scope has an explicitly persisted deep-mode value, whichever way that value is set.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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
     * Persists the deep-mode toggle of the scope. Idempotent - there is no need to check whether a value already exists.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
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

}
