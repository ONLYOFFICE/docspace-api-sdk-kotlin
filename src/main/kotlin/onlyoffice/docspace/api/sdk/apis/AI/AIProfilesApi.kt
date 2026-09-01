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

import onlyoffice.docspace.api.sdk.models.AiCreateProfileInput
import onlyoffice.docspace.api.sdk.models.AiErrorResponse
import onlyoffice.docspace.api.sdk.models.AiModel
import onlyoffice.docspace.api.sdk.models.AiProfile
import onlyoffice.docspace.api.sdk.models.AiProfileMutationResult
import onlyoffice.docspace.api.sdk.models.AiProfilesGetById200Response
import onlyoffice.docspace.api.sdk.models.AiProfilesListProviderModelsRequest
import onlyoffice.docspace.api.sdk.models.AiProfilesTestConnection200Response
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIProfilesApi {
    /**
     * POST api/2.0/ai/profiles/create
     * Create
     * Creates an AI provider profile. The name must be unique and the credentials are validated against the provider before the profile is stored; the portal's first profile also takes the `Default` assignment slot.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesCreate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-create/
     *
     *
     * @param aiCreateProfileInput 
     * @return [AiProfileMutationResult]
     */
    @POST("api/2.0/ai/profiles/create")
    suspend fun aiProfilesCreate(@Body aiCreateProfileInput: AiCreateProfileInput): Response<AiProfileMutationResult>

    /**
     * DELETE api/2.0/ai/profiles/delete
     * Delete
     * Deletes an AI provider profile and cleans up the assignments pointing at it - the `Default` slot moves to the first remaining profile, the other slots are unbound.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
     *
     *
     * @param body 
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/profiles/delete", hasBody = true)
    suspend fun aiProfilesDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/profiles/get-by-id
     * Get by id
     * Returns one AI provider profile, or an empty result when the identifier is unknown.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesGetById Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-get-by-id/
     *
     *
     * @param id The AI provider profile identifier.
     * @return [AiProfilesGetById200Response]
     */
    @GET("api/2.0/ai/profiles/get-by-id")
    suspend fun aiProfilesGetById(@Query("id") id: kotlin.String): Response<AiProfilesGetById200Response>

    /**
     * GET api/2.0/ai/profiles/list
     * List
     * Lists the portal's AI provider profiles.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesList Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list/
     *
     *
     * @return [kotlin.collections.List<AiProfile>]
     */
    @GET("api/2.0/ai/profiles/list")
    suspend fun aiProfilesList(): Response<kotlin.collections.List<AiProfile>>

    /**
     * GET api/2.0/ai/profiles/list-models
     * List models
     * Lists the models the given profile's provider offers, as reported by the provider itself.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesListModels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-models/
     *
     *
     * @param profileId The AI provider profile identifier.
     * @return [kotlin.collections.List<AiModel>]
     */
    @GET("api/2.0/ai/profiles/list-models")
    suspend fun aiProfilesListModels(@Query("profileId") profileId: kotlin.String): Response<kotlin.collections.List<AiModel>>

    /**
     * POST api/2.0/ai/profiles/list-provider-models
     * List provider models
     * Lists the models a provider offers for the supplied endpoint and key, before any profile is created from them.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesListProviderModels Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-list-provider-models/
     *
     *
     * @param aiProfilesListProviderModelsRequest 
     * @return [kotlin.collections.List<AiModel>]
     */
    @POST("api/2.0/ai/profiles/list-provider-models")
    suspend fun aiProfilesListProviderModels(@Body aiProfilesListProviderModelsRequest: AiProfilesListProviderModelsRequest): Response<kotlin.collections.List<AiModel>>

    /**
     * POST api/2.0/ai/profiles/test-connection
     * Test connection
     * Checks a stored profile's credentials against its provider and reports the provider's own error when the call fails. Nothing is written.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesTestConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
     *
     *
     * @param body 
     * @return [AiProfilesTestConnection200Response]
     */
    @POST("api/2.0/ai/profiles/test-connection")
    suspend fun aiProfilesTestConnection(@Body body: kotlin.String): Response<AiProfilesTestConnection200Response>

    /**
     * PUT api/2.0/ai/profiles/update
     * Update
     * Updates an AI provider profile, re-checking name uniqueness and the provider credentials.
     * Responses:
     *  - 200: Success.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *
     * REST API Reference for aiProfilesUpdate Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-update/
     *
     *
     * @param aiProfile 
     * @return [AiProfileMutationResult]
     */
    @PUT("api/2.0/ai/profiles/update")
    suspend fun aiProfilesUpdate(@Body aiProfile: AiProfile): Response<AiProfileMutationResult>

}
