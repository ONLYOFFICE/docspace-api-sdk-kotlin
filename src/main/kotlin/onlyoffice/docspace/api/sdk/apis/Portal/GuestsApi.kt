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


package onlyoffice.docspace.api.sdk.apis.Portal

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper

interface GuestsApi {
    /**
     * GET api/2.0/people/guests/{userid}/share
     * Get a guest sharing link
     * Builds a link that lets another member of the portal take over the caller's guest, so that the guest becomes  visible to them as well.  The account in the route has to exist and be a guest - any other type is rejected with 400 - and the caller  has to be able to see it and must not be a guest itself.  The call is read-only: it only mints the link and changes nothing, and it can be repeated as often as needed.  The answer is a shortened confirmation URL as plain text; hand it to the person who should get the guest, and  their client completes the hand-over with `POST api/2.0/people/guests/share/approve`.  The link carries a confirmation token and therefore expires, so mint it when it is about to be used rather  than storing it.
     * Responses:
     *  - 200: The shortened confirmation link, as plain text
     *  - 400: The account is not a guest
     *  - 403: The caller is a guest, or is not allowed to see that account
     *  - 404: No account has the specified ID
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getGuestSharingLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-guest-sharing-link/
     *
     *
     * @param userid The ID of the guest to be handed over, taken from the route. The account has to exist, has to be a guest, and  has to be one the caller can see.
     * @return [StringWrapper]
     */
    @GET("api/2.0/people/guests/{userid}/share")
    suspend fun getGuestSharingLink(@Path("userid") userid: java.util.UUID): Response<StringWrapper>

}
