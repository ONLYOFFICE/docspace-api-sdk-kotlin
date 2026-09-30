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
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.STRINGArrayWrapper
import onlyoffice.docspace.api.sdk.models.UpdateApiKeyRequest

interface ApiKeysApi {
    /**
     * POST api/2.0/keys
     * Create a user API key
     * Creates an API key that authenticates requests as the calling account, and is the only operation that ever  returns the secret.  Any portal member except a guest may create one; when the portal limits developer tools to administrators,  only a DocSpace administrator may call it.  The call is not idempotent - every call issues a new key - and it is throttled, so a client that retries on a  timeout can end up with several keys.  The answer carries the full secret in `key`: it is shown here and never again, later reads expose only the  last four characters in `keyPostfix`, so store it now.  Pass the scopes the key may use in `permissions`, taking the values from  `GET api/2.0/keys/permissions`; pass `*` or omit the field to record a key without scope restrictions, and set  `expiresInDays` to make it expire, otherwise it stays valid until it is deleted.  An empty `permissions` array and an unknown scope are both rejected with 400.  Send the key in the `Authorization` header as `Bearer sk-...` to use it.
     * Responses:
     *  - 200: The new API key, with the full secret in the key field
     *  - 400: The permissions array is empty or contains a scope the portal does not know
     *  - 403: The caller is a guest, or the portal limits developer tools to administrators
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Delete an API key
     * Deletes the API key with the ID given in the route, so that it stops authenticating requests immediately.  The caller may delete a key they created themselves, and a DocSpace administrator may delete any key of the  portal.  The removal is permanent and cannot be undone: the secret was only ever readable at creation time, so a  deleted key cannot be restored and a new one has to be issued through `POST api/2.0/keys`.  To stop a key temporarily instead, set `isActive` to false through `PUT api/2.0/keys/{keyId}`.  The answer is a plain boolean reporting whether the key was removed.
     * Responses:
     *  - 200: True if the key was removed
     *  - 403: The key belongs to another member and the caller is not a DocSpace admin
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-api-key/
     *
     *
     * @param keyId The ID of the key to delete, taken from the route. Read it from the `id` of an entry of  `GET api/2.0/keys` - it is not the secret and not the `keyPostfix`.
     * @return [BooleanWrapper]
     */
    @DELETE("api/2.0/keys/{keyId}")
    suspend fun deleteApiKey(@Path("keyId") keyId: java.util.UUID): Response<BooleanWrapper>

    /**
     * GET api/2.0/keys/permissions
     * Get API key permissions
     * Returns every scope value the portal accepts in the `permissions` array of an API key.  Read it before `POST api/2.0/keys` or `PUT api/2.0/keys/{keyId}`, because any other value is rejected with  400.  Any portal member except a guest may call it, and the call is read-only.  The answer is a flat list sorted alphabetically, holding the per-area scopes such as `accounts:read`,  `files:write` and `rooms:write`, the portal-wide `*:read` and `*:write`, and `*` which stands for a key  without scope restrictions.  The list is fixed for the portal and identical for every caller, so it can be cached by the client.
     * Responses:
     *  - 200: The scope values accepted in the permissions array of an API key
     *  - 403: The caller is a guest
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Get the current API key
     * Returns the API key that authenticated this very request, letting the holder of a key find out what it is  allowed to do without knowing its ID.  The key is identified by the `Authorization` header of the call itself, so the request has to be sent as  `Bearer sk-...`; a session authenticated in any other way has no key to report and this operation is not  usable for it.  The call is read-only and returns one entry, with the same fields as `GET api/2.0/keys` and without the  secret - read `permissions` for the granted scopes, `expiresAt` for the expiry and `isActive` for the state.  To look at a key other than the one in use, call `GET api/2.0/keys` instead.
     * Responses:
     *  - 200: The API key that authenticated this request
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Get the API keys
     * Returns the API keys the caller is allowed to see, which is not the same set for everybody: a DocSpace  administrator gets every key of the portal, while any other member gets only the keys they created  themselves.  Any portal member except a guest may call it, and the call is read-only.  The secrets are not returned - each entry identifies its key by `id` and by the last four characters in  `keyPostfix`, and a secret can only be read once, at the moment `POST api/2.0/keys` creates it.  Expired and deactivated keys stay in the list, so check `expiresAt` against the current time and read  `isActive` before treating an entry as usable.  An empty list means the caller has created no keys, not that the portal has none.
     * Responses:
     *  - 200: Every key of the portal for a DocSpace admin, or the keys created by the caller for anybody else
     *  - 403: The caller is a guest
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
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
     * Renames an API key, replaces the scopes it may use, or activates and deactivates it, without changing the  secret.  The caller may update a key they created themselves, and a DocSpace administrator may update any key of the  portal.  Take the values for `permissions` from `GET api/2.0/keys/permissions`; an unknown scope or an empty array is  rejected with 400, and the fields that are left out keep their current values.  The answer is a plain boolean: true when the key was changed, and false when it was not - which is also what  an already expired key returns, because such a key is left untouched instead of being reported as an error.  Deactivating a key through `isActive` stops it from authenticating while keeping it in the list, so use it  when the key may be needed again and `DELETE api/2.0/keys/{keyId}` when it may not.
     * Responses:
     *  - 200: True if the key was changed, false if it was left untouched because it has already expired
     *  - 400: The permissions array is empty or contains a scope the portal does not know
     *  - 403: The key belongs to another member and the caller is not a DocSpace admin
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateApiKey Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-api-key/
     *
     *
     * @param keyId The ID of the key to update, taken from the route. Read it from the `id` of an entry of  `GET api/2.0/keys` - it is not the secret and not the `keyPostfix`.
     * @param updateApiKeyRequest The fields to change. Every field is optional and the ones that are left out keep their current values, so an  empty object changes nothing.
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/keys/{keyId}")
    suspend fun updateApiKey(@Path("keyId") keyId: java.util.UUID, @Body updateApiKeyRequest: UpdateApiKeyRequest): Response<BooleanWrapper>

}
