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


package onlyoffice.docspace.api.sdk.apis.People

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.EmailMemberRequestDto
import onlyoffice.docspace.api.sdk.models.EmployeeFullWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.UpdateMembersRequestDto

interface GuestsApi {
    /**
     * POST api/2.0/people/guests/share/approve
     * Approve a guest sharing link
     * Accepts a guest that another member shared, which links that guest to the calling account and makes it  visible in the caller's list of guests.  Everything the operation needs comes from the confirmation token of the link produced by  `GET api/2.0/people/guests/{userid}/share`: the request body is not read at all, so there is nothing to fill  in, and an expired or already used token is answered with 401.  The caller has to be a room admin or a DocSpace admin; a member or a guest gets 403.  The account the token names has to exist and still be a guest, otherwise the operation answers 404 or 400.  The call is idempotent: a guest that is already linked to the caller is simply returned again.  The answer is the full profile of the guest.
     * Responses:
     *  - 200: The full profile of the guest now linked to the caller
     *  - 400: The account named by the token is not a guest
     *  - 403: The caller is a member or a guest
     *  - 404: The account named by the token no longer exists
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for approveGuestShareLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/approve-guest-share-link/
     *
     *
     * @param emailMemberRequestDto  (optional)
     * @return [EmployeeFullWrapper]
     */
    @POST("api/2.0/people/guests/share/approve")
    suspend fun approveGuestShareLink(@Body emailMemberRequestDto: EmailMemberRequestDto? = null): Response<EmployeeFullWrapper>

    /**
     * DELETE api/2.0/people/guests
     * Remove guest relations
     * Removes the listed guests from the caller's own list of guests and withdraws the access the caller had  granted them.  It does not delete the accounts: each guest keeps its profile and any access other members gave it, and only  the link to the caller and the caller's own shares disappear.  The caller has to be a room admin or a DocSpace admin, and every listed account has to exist, be an active  guest and be one of the caller's own guests - a single entry that is not rejects the whole call with 403 and  changes nothing.  The call returns no body; read `GET api/2.0/people/filter` with `area` set to `Guests` to see what is left.  To delete a guest account for good, disable it and then use `DELETE api/2.0/people/{userid}`.
     * Responses:
     *  - 200: The guests are no longer linked to the caller. No content is returned
     *  - 400: The userIds field is missing
     *  - 403: The caller is not an admin, or an entry is not an active guest of the caller
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for deleteGuests Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/delete-guests/
     *
     *
     * @param updateMembersRequestDto  (optional)
     * @return [Unit]
     */
    @HTTP(method = "DELETE", path = "api/2.0/people/guests", hasBody = true)
    suspend fun deleteGuests(@Body updateMembersRequestDto: UpdateMembersRequestDto? = null): Response<Unit>

}
