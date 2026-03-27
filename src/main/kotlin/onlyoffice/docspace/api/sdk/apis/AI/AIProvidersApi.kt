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
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.AiProviderArrayWrapper
import onlyoffice.docspace.api.sdk.models.AiProviderWrapper
import onlyoffice.docspace.api.sdk.models.CreateProviderRequestDto
import onlyoffice.docspace.api.sdk.models.DefaultProviderWrapper
import onlyoffice.docspace.api.sdk.models.ProviderSettingsArrayWrapper
import onlyoffice.docspace.api.sdk.models.RemoveProviderRequestDto
import onlyoffice.docspace.api.sdk.models.SetDefaultProviderRequestDto
import onlyoffice.docspace.api.sdk.models.UpdateProviderBody

interface AIProvidersApi {
    /**
     * POST api/2.0/ai/providers
     * Add an AI provider
     * Registers a new AI provider for the current tenant by specifying its type, display title, API endpoint URL, and authentication key.  The provider becomes available for AI chat conversations after creation. This action is rate-limited.
     * Responses:
     *  - 200: Created AI provider details
     *  - 400: Invalid connection data or provider with this name already exists
     *  - 403: You don't have enough permission to manage providers
     *  - 401: Unauthorized
     *
     * REST API Reference for addProvider Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/add-provider/
     *
     *
     * @param createProviderRequestDto  (optional)
     * @return [Call]<[AiProviderWrapper]>
     */
    @POST("api/2.0/ai/providers")
    fun addProvider(@Body createProviderRequestDto: CreateProviderRequestDto? = null): Call<AiProviderWrapper>

    /**
     * DELETE api/2.0/ai/providers
     * Delete AI providers
     * Permanently deletes one or more AI providers by their identifiers.  All specified providers are removed from the current tenant. This action cannot be undone.
     * Responses:
     *  - 204: The providers were successfully deleted
     *  - 403: You don't have enough permission to manage providers
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-providers/
     *
     *
     * @param removeProviderRequestDto  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/2.0/ai/providers")
    fun deleteProviders(@Body removeProviderRequestDto: RemoveProviderRequestDto? = null): Call<Unit>

    /**
     * GET api/2.0/ai/providers/available
     * Get available AI provider types
     * Returns the list of AI provider types that are available for configuration on the current instance.  Each entry includes the provider type identifier and the default API endpoint URL.
     * Responses:
     *  - 200: List of available AI provider types
     *  - 401: Unauthorized
     *
     * REST API Reference for getAvailableProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-available-providers/
     *
     *
     * @return [Call]<[ProviderSettingsArrayWrapper]>
     */
    @GET("api/2.0/ai/providers/available")
    fun getAvailableProviders(): Call<ProviderSettingsArrayWrapper>

    /**
     * GET api/2.0/ai/providers/default
     * Get the default AI provider
     * Returns the default AI provider and model configured for the current tenant.  Returns null if the tenant does not have any registered providers.
     * Responses:
     *  - 200: Default provider information or null if not set
     *  - 401: Unauthorized
     *
     * REST API Reference for getDefaultProvider Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-default-provider/
     *
     *
     * @return [Call]<[DefaultProviderWrapper]>
     */
    @GET("api/2.0/ai/providers/default")
    fun getDefaultProvider(): Call<DefaultProviderWrapper>

    /**
     * GET api/2.0/ai/providers
     * Get AI providers
     * Returns a paginated list of AI providers configured for the current tenant.  Supports pagination via the startIndex and count query parameters. The total number of providers is included in the response metadata.
     * Responses:
     *  - 200: Paginated list of AI providers
     *  - 401: Unauthorized
     *
     * REST API Reference for getProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-providers/
     *
     *
     * @param startIndex The number of items to skip before returning results (zero-based offset). Defaults to 0. (optional)
     * @param count The maximum number of items to return per page. Defaults to 100. (optional)
     * @return [Call]<[AiProviderArrayWrapper]>
     */
    @GET("api/2.0/ai/providers")
    fun getProviders(@Query("startIndex") startIndex: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<AiProviderArrayWrapper>

    /**
     * PUT api/2.0/ai/providers/default
     * Set the default AI provider
     * Sets the default AI provider and model for the current tenant.  The specified provider and model will be used as the default for all new AI chat sessions within the tenant.
     * Responses:
     *  - 200: Default provider information
     *  - 403: You don't have enough permission to manage providers
     *  - 404: Provider not found
     *  - 401: Unauthorized
     *
     * REST API Reference for setDefaultProvider Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-default-provider/
     *
     *
     * @param setDefaultProviderRequestDto  (optional)
     * @return [Call]<[DefaultProviderWrapper]>
     */
    @PUT("api/2.0/ai/providers/default")
    fun setDefaultProvider(@Body setDefaultProviderRequestDto: SetDefaultProviderRequestDto? = null): Call<DefaultProviderWrapper>

    /**
     * PUT api/2.0/ai/providers/{id}
     * Update an AI provider
     * Updates the configuration of an existing AI provider, including its display title, API endpoint URL, and authentication key.  Only the fields provided in the request body will be updated. This action is rate-limited.
     * Responses:
     *  - 200: Updated AI provider details
     *  - 400: Invalid connection data or provider with this name already exists
     *  - 403: You don't have enough permission to manage providers
     *  - 404: The provider with the specified ID was not found
     *  - 401: Unauthorized
     *
     * REST API Reference for updateProvider Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-provider/
     *
     *
     * @param id The identifier of the AI provider to update.
     * @param updateProviderBody The AI provider configuration parameters to update.
     * @return [Call]<[AiProviderWrapper]>
     */
    @PUT("api/2.0/ai/providers/{id}")
    fun updateProvider(@Path("id") id: kotlin.Int, @Body updateProviderBody: UpdateProviderBody): Call<AiProviderWrapper>

}
