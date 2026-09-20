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
     * Delete an encryption key
     * Removes one encryption key pair from the calling user's own key set and answers 204 with no body. The pair is  named by the `id` of an entry of `GET api/2.0/privacyroom/keys`; the caller's other pairs stay as they are.  The call is destructive and cannot be repeated: the key material is gone for good, a second delete of the same  `id`, like an `id` that was never stored, is answered with 404, and there is no parameter for another user's  keys, so an authenticated member only ever deletes their own while a guest is refused. Deleting the last key  the caller holds locks them out of the private rooms they belong to, their own rooms included: the rooms and  their content survive untouched and stay listed as private, but `GET api/2.0/privacyroom/{roomId}/access` then  refuses the caller until a new key is stored with `POST api/2.0/privacyroom/keys`. Before DocSpace 4.0 the  call answered 200 with the caller's remaining keys, so a client that read that list has to call  `GET api/2.0/privacyroom/keys` instead.
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
     * @param id The pair to delete, taken from the `id` of an entry of `GET api/2.0/privacyroom/keys`. Only the caller's own  pairs can be named here.
     * @return [Unit]
     */
    @DELETE("api/2.0/privacyroom/keys/{id}")
    suspend fun deleteKeys(@Path("id") id: java.util.UUID): Response<Unit>

    /**
     * GET api/2.0/privacyroom/keys
     * Get own encryption keys
     * Returns every encryption key pair the calling user holds, the encrypted private half included, which is the  material a client needs in order to decrypt content in a private room. The set is personal and there is no  parameter for another user's keys: an authenticated caller reads only their own, and a guest, who cannot own  key material at all, always reads an empty set. The call is read-only. An empty answer, whether an empty list  or none at all, means no key has been created yet, and until `POST api/2.0/privacyroom/keys` creates one the  user cannot be invited to a private room. Each entry carries the pair's `id`, its owner in `userId`, the  moment the material was stored in `date`, the public half, the private half encrypted with the user's  password, and the portal-wide crypto engine in `cryptoEngineId`. For the keys that open a whole private room  use `GET api/2.0/privacyroom/{roomId}/access`, and for the keys a single file is shared with use  `GET api/2.0/files/file/{fileId}/publickeys`; this operation is about the caller alone.
     * Responses:
     *  - 200: The encryption keys of the current user
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
     * Get private room access keys
     * Returns the encryption keys that give access to a private room: one entry per key held by each of its members,  which is what a client needs in order to encrypt a file key for everyone allowed to open the room's content.  Only the caller's own entries carry `privateKeyEnc`; another member's entry carries the public half alone, and  an entry with no public half is not reported as access at all. The room has to be a private one, a room  created without private mode holds no access keys and the call is refused, and it has to still exist: an  unknown room, or one already moved to Trash, is reported as missing, while an archived private room still  answers. Access follows room membership and not portal role: any member from read access upwards receives the  full set, whereas a DocSpace administrator who is not a member is refused, and so is a caller holding no key  of their own, the room creator included once they delete their last key. The call is read-only. For the keys  of a single file use `GET api/2.0/files/file/{fileId}/publickeys`.
     * Responses:
     *  - 200: The encryption keys associated with the privacy room
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
     * @param roomId The private room whose access keys are read. Take it from the `id` of the room returned by  `POST api/2.0/files/rooms` or listed by `GET api/2.0/files/rooms`.
     * @return [EncryptionKeyArrayWrapper]
     */
    @GET("api/2.0/privacyroom/{roomId}/access")
    suspend fun getUserKeysForRoom(@Path("roomId") roomId: kotlin.Int): Response<EncryptionKeyArrayWrapper>

    /**
     * PUT api/2.0/privacyroom/keys
     * Rotate an encryption key
     * Rotates one encryption key pair of the calling user: the entry whose `id` matches is overwritten with the  submitted `publicKey` and `privateKeyEnc`, and the caller's other pairs are left untouched. The pair has to  exist already, an `id` that is not in the caller's set is answered with 404, and a first key is created with  `POST api/2.0/privacyroom/keys`. This is a full replacement rather than a merge: both halves are mandatory,  and a request that omits or blanks one of them is rejected as invalid with the stored pair surviving  unchanged, so a rotation that means to keep the private half has to send it again. Omitting `id` targets the  all-zero pair, the one a client that never sets an id keeps rotating. Every authenticated member rotates their  own keys and only their own, and a guest is refused. The call is mutating, and repeating it with the same body  leaves the same state. It answers with every key the caller holds afterwards, and from then on  `GET api/2.0/privacyroom/{roomId}/access` reports the new public half for this member.
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
     * @param encryptionKeyRequestDto  (optional)
     * @return [EncryptionKeyArrayWrapper]
     */
    @PUT("api/2.0/privacyroom/keys")
    suspend fun replaceKey(@Body encryptionKeyRequestDto: EncryptionKeyRequestDto? = null): Response<EncryptionKeyArrayWrapper>

    /**
     * POST api/2.0/privacyroom/keys
     * Create an encryption key
     * Stores a new encryption key pair for the calling user and answers with that user's whole key set. The material  is end-to-end: `publicKey` is the half other members use to encrypt file keys for this user, while  `privateKeyEnc` arrives already encrypted with the user's own password, so the portal keeps it as opaque text.  A member must hold at least one key before they can be invited to a private room, which makes this the first  call of the private-room flow. Every authenticated member manages their own keys and only their own, there is  no parameter for somebody else's, and a guest is refused, which is also why a guest cannot become a member of  a private room. The call is mutating and is not safe to repeat: `id` names the pair inside the caller's set  and an `id` that is already stored is answered with 409, while a request that omits or blanks either half is  rejected as invalid and stores nothing. A successful call answers 201 with every key the caller now holds. To  change the material of an existing pair use `PUT api/2.0/privacyroom/keys`.
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
     * @param encryptionKeyRequestDto  (optional)
     * @return [EncryptionKeyArrayWrapper]
     */
    @POST("api/2.0/privacyroom/keys")
    suspend fun setKeys(@Body encryptionKeyRequestDto: EncryptionKeyRequestDto? = null): Response<EncryptionKeyArrayWrapper>

}
