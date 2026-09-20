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
import onlyoffice.docspace.api.sdk.models.AiProfilesListProviderModels400Response
import onlyoffice.docspace.api.sdk.models.AiProfilesListProviderModelsRequest
import onlyoffice.docspace.api.sdk.models.AiProfilesTestConnection200Response
import onlyoffice.docspace.api.sdk.models.AiSuccessResponse

interface AIProfilesApi {
    /**
     * POST api/2.0/ai/profiles/create
     * Create a provider profile
     * Creates an AI provider profile - the endpoint, credentials and model that a chat round runs on - and returns it. The name has to be unique, the credentials are probed against the live provider before anything is stored, and the portal's first profile also takes the `Default` assignment slot. Two inputs are refused outright: a `baseUrl` pointing at a private network address, and `providerType: external`, which delegates transport to the host application and therefore cannot work for a profile the server manages. On a portal running the AI gateway, profiles are managed centrally and this operation answers 403.
     * Responses:
     *  - 200: Whether the profile was created, with it in `profile`. A refusal is reported in `error` rather than as a status.
     *  - 400: The provider URL is missing, malformed, or points at a private network address.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI profiles are read-only on this portal because they are managed by the AI gateway.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Delete a provider profile
     * Deletes an AI provider profile and cleans up every assignment pointing at it: the `Default` slot moves to the first remaining profile and the other slots are left unbound. The ID is required and may be sent in the body or as a query parameter. An unknown ID is not reported - the call answers success without deleting anything. Threads already bound to the profile keep the stored reference, so a round on such a thread falls back to whatever the scope resolves to.
     * Responses:
     *  - 200: Confirms the request was accepted, whether or not a profile was deleted.
     *  - 400: The profile ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiProfilesDelete Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-delete/
     *
     *
     * @param body The ID of the profile to delete, as a bare JSON string.
     * @return [AiSuccessResponse]
     */
    @HTTP(method = "DELETE", path = "api/2.0/ai/profiles/delete", hasBody = true)
    suspend fun aiProfilesDelete(@Body body: kotlin.String): Response<AiSuccessResponse>

    /**
     * GET api/2.0/ai/profiles/get-by-id
     * Get a provider profile
     * Returns one AI provider profile by its ID, with its secrets stripped: neither the API key nor the custom headers are ever sent back, on any portal. The ID is required and is read from the query, and an unknown one answers 404. The `baseUrl` in the answer is the one that was stored, not the internal gateway address a round actually dials, so it cannot be used to reach the provider directly. Use `GET api/2.0/ai/profiles/list` to enumerate profiles instead of reading them one by one.
     * Responses:
     *  - 200: The profile, with its key and headers stripped.
     *  - 400: The profile ID is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 404: No profile has this ID.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * List provider profiles
     * Lists the portal's AI provider profiles with their secrets stripped, the same way the single-profile read does. It takes no parameters and is not paginated, because a portal holds few profiles. On a portal running the AI gateway the answer is synthesised from the gateway's own catalogue rather than from stored records. The IDs in the answer are what the assignment operations and every round's `profileId` accept.
     * Responses:
     *  - 200: The portal's profiles, with their keys and headers stripped.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
     * Lists the models a stored profile's provider currently offers, asking the provider itself rather than reading a cached list. `profileId` is required and is read from the query. A failure is reported with the provider's own verdict: an unusable key comes back as 400 and a provider that is unreachable or broken as 502, while a missing profile or a caller without access keeps the status the portal gave it. Use `POST api/2.0/ai/profiles/list-provider-models` to probe an endpoint that has no profile yet.
     * Responses:
     *  - 200: The models the profile's provider currently offers.
     *  - 400: `profileId` is missing, or the provider rejected the profile's API key.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
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
     * Lists the models an endpoint offers for credentials supplied in the request, before any profile exists - this is what a provider-setup form calls to fill its model picker. `providerType` and `baseUrl` are both required, and a 400 for either names the offending input in a `field` member so the form can highlight it; a `baseUrl` pointing at a private network address is refused as well. For `providerType: onlyoffice` the answer comes from the portal gateway's catalogue, which carries richer capability data than the provider's own listing and matches what `GET api/2.0/ai/profiles/list` reports; a portal without that gateway falls back to asking the provider. A provider that is unreachable or broken is reported as 502, and one that rejects the key as 400.
     * Responses:
     *  - 200: The models the endpoint offers for the supplied credentials.
     *  - 400: `baseUrl` is missing, points at a private network address, or the provider rejected the supplied API key.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *  - 502: The AI provider could not be reached, or answered with a failure of its own.
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
     * Test a profile's provider
     * Probes a stored profile's credentials against its provider and reports the outcome in the answer, writing nothing - this is what a Test button calls so that a failure does not commit anything. `profileId` is required and may be sent in the body or as a query parameter. The result is carried in the body rather than in the status, so a failed probe still answers 200 and the caller has to read the payload. To validate credentials that are not stored yet, use `POST api/2.0/ai/profiles/list-provider-models`.
     * Responses:
     *  - 200: The outcome of the probe. A failed probe is reported here, not as a status.
     *  - 400: `profileId` is missing.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI is disabled for this portal, or the caller is a guest. Relayed from the DocSpace AI service.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
     *
     * REST API Reference for aiProfilesTestConnection Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/ai-profiles-test-connection/
     *
     *
     * @param body The ID of the profile to probe, as a bare JSON string.
     * @return [AiProfilesTestConnection200Response]
     */
    @POST("api/2.0/ai/profiles/test-connection")
    suspend fun aiProfilesTestConnection(@Body body: kotlin.String): Response<AiProfilesTestConnection200Response>

    /**
     * PUT api/2.0/ai/profiles/update
     * Update a provider profile
     * Replaces a stored AI provider profile and returns it, re-checking name uniqueness and probing the credentials against the live provider again. The same two inputs are refused as on create - a private-network `baseUrl` and `providerType: external` - and the whole profile is overwritten by the one supplied rather than merged. On a portal running the AI gateway this answers 403, because profiles are managed centrally there. A profile that is bound to an action or an agent keeps those bindings.
     * Responses:
     *  - 200: Whether the profile was updated, with the stored profile in `profile`.
     *  - 400: The provider URL is missing, malformed, or points at a private network address.
     *  - 401: Missing `asc_auth_key` cookie or `Authorization` header.
     *  - 403: AI profiles are read-only on this portal because they are managed by the AI gateway.
     *  - 413: The request body is larger than 100 KB, the JSON parser's limit on this route.
     *  - 500: Unhandled failure. The reason is logged server-side and never echoed back.
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
