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


package onlyoffice.docspace.api.sdk.apis.ApiKeys

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ApiKeyResponseArrayWrapper
import onlyoffice.docspace.api.sdk.models.ApiKeyResponseWrapper
import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.CreateApiKeyRequestDto
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.UpdateApiKeyRequest

interface ApiKeysApi {
    /**
     * POST api/2.0/keys
     * Create a user API key
     * Creates a user API key with the parameters specified in the request.
     * Responses:
     *  - 200: Create a user api key
     *  - 401: Unauthorized
     *
     * REST API Reference for createApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/create-api-key/
     *
     *
     * @param createApiKeyRequestDto  (optional)
     * @return [ApiKeyResponseWrapper]
     */
    @POST("api/2.0/keys")
    suspend fun createApiKey(@Body createApiKeyRequestDto: CreateApiKeyRequestDto? = null): Response<ApiKeyResponseWrapper>

    /**
     * DELETE api/2.0/keys/{keyId}
     * Delete a user API key
     * Deletes a user API key by its ID.
     * Responses:
     *  - 200: Delete a user api key
     *  - 401: Unauthorized
     *
     * REST API Reference for deleteApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-api-key/
     *
     *
     * @param keyId The API key ID.
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/keys/{keyId}")
    suspend fun deleteApiKey(@Path("keyId") keyId: java.util.UUID): Response<BooleanWrapper>

    /**
     * GET api/2.0/keys/permissions
     * Get API key permissions
     * Returns a list of all available permissions for the API key.
     * Responses:
     *  - 200: List of all available permissions for key
     *  - 401: Unauthorized
     *
     * REST API Reference for getAllPermissions Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-all-permissions/
     *
     *
     * @return [STRINGArrayWrapper]
     */
    @GET("api/2.0/keys/permissions")
    suspend fun getAllPermissions(): Response<STRINGArrayWrapper>

    /**
     * GET api/2.0/keys/@self
     * Get current user's API key
     * Returns information about the current user's API key.
     * Responses:
     *  - 200: List of api keys for user
     *  - 401: Unauthorized
     *
     * REST API Reference for getApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-key/
     *
     *
     * @return [ApiKeyResponseWrapper]
     */
    @GET("api/2.0/keys/@self")
    suspend fun getApiKey(): Response<ApiKeyResponseWrapper>

    /**
     * GET api/2.0/keys
     * Get current user's API keys
     * Returns a list of all API keys for the current user.
     * Responses:
     *  - 200: List of api keys for user
     *  - 401: Unauthorized
     *
     * REST API Reference for getApiKeys Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-api-keys/
     *
     *
     * @return [ApiKeyResponseArrayWrapper]
     */
    @GET("api/2.0/keys")
    suspend fun getApiKeys(): Response<ApiKeyResponseArrayWrapper>

    /**
     * PUT api/2.0/keys/{keyId}
     * Update an API key
     * Updates an existing API key changing its name, permissions, and status.
     * Responses:
     *  - 200: Update optional params for user api keys
     *  - 401: Unauthorized
     *
     * REST API Reference for updateApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-api-key/
     *
     *
     * @param keyId The unique identifier of the API key to update.
     * @param updateApiKeyRequest The request parameters for updating an existing API key.
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/keys/{keyId}")
    suspend fun updateApiKey(@Path("keyId") keyId: java.util.UUID, @Body updateApiKeyRequest: UpdateApiKeyRequest): Response<BooleanWrapper>

}
