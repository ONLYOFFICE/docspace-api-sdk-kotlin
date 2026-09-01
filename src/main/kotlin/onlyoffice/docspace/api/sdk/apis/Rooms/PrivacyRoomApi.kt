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


package onlyoffice.docspace.api.sdk.apis.Rooms

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EncryptionKeyArrayWrapper
import onlyoffice.docspace.api.sdk.models.EncryptionKeyRequestDto
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse

interface PrivacyRoomApi {
    /**
     * DELETE api/2.0/privacyroom/keys/{id}
     * Deletes an encryption key and removes it from the system.
     * Deletes an encryption key and removes it from the system based on the provided key identifier.    Breaking change in DocSpace 4.0: the endpoint used to answer 200 with the caller's remaining  encryption keys and now answers 204 with no body. A client that read that list must call  `GET api/2.0/privacyroom/keys` instead.
     * Responses:
     *  - 204: The encryption key is deleted. Answered 200 with the remaining keys before DocSpace 4.0
     *  - 400: The key identifier is not a valid GUID
     *  - 404: The encryption key is not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteKeys Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-keys/
     *
     *
     * @param id The unique identifier of the encryption key to be deleted.
     * @return [Unit]
     */
    @DELETE("api/2.0/privacyroom/keys/{id}")
    suspend fun deleteKeys(@Path("id") id: java.util.UUID): Response<Unit>

    /**
     * GET api/2.0/privacyroom/keys
     * Retrieves encryption keys associated with the current user.
     * Retrieves encryption keys associated with the current user.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserKeys Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys/
     *
     *
     * @return [EncryptionKeyArrayWrapper]
     */
    @GET("api/2.0/privacyroom/keys")
    suspend fun getUserKeys(): Response<EncryptionKeyArrayWrapper>

    /**
     * GET api/2.0/privacyroom/{roomId}/access
     * Retrieves the encryption keys associated with a specific privacy room.
     * Retrieves the encryption keys associated with a specific privacy room.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getUserKeysForRoom Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-user-keys-for-room/
     *
     *
     * @param roomId The identifier of the privacy room.
     * @return [EncryptionKeyArrayWrapper]
     */
    @GET("api/2.0/privacyroom/{roomId}/access")
    suspend fun getUserKeysForRoom(@Path("roomId") roomId: kotlin.Int): Response<EncryptionKeyArrayWrapper>

    /**
     * PUT api/2.0/privacyroom/keys
     * Replaces an existing encryption key with a new one for the user.
     * Replaces an existing encryption key with a new one for the user.
     * Responses:
     *  - 200: The encryption key is replaced
     *  - 400: The key material is missing, blank or too large to be stored
     *  - 404: The encryption key to replace is not found
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for replaceKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/replace-key/
     *
     *
     * @param encryptionKeyRequestDto The request object containing the public and private key information to replace the existing key. (optional)
     * @return [EncryptionKeyArrayWrapper]
     */
    @PUT("api/2.0/privacyroom/keys")
    suspend fun replaceKey(@Body encryptionKeyRequestDto: EncryptionKeyRequestDto? = null): Response<EncryptionKeyArrayWrapper>

    /**
     * POST api/2.0/privacyroom/keys
     * Creates and sets encryption keys for the user.
     * Creates and sets encryption keys for the user.
     * Responses:
     *  - 201: The encryption key is created. Answered 200 before DocSpace 4.0; the response body is unchanged
     *  - 400: The key material is missing, blank or too large to be stored
     *  - 409: A key with the same identifier already exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for setKeys Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/set-keys/
     *
     *
     * @param encryptionKeyRequestDto The request object containing public and private key information. (optional)
     * @return [EncryptionKeyArrayWrapper]
     */
    @POST("api/2.0/privacyroom/keys")
    suspend fun setKeys(@Body encryptionKeyRequestDto: EncryptionKeyRequestDto? = null): Response<EncryptionKeyArrayWrapper>

}
