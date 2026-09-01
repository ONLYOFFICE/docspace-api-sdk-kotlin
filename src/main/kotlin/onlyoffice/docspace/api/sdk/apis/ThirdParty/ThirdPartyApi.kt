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


package onlyoffice.docspace.api.sdk.apis.ThirdParty

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.LoginProvider
import onlyoffice.docspace.api.sdk.models.ObjectWrapper

interface ThirdPartyApi {
    /**
     * GET api/2.0/thirdparty/{provider}
     * Get the code request
     * Returns a request to get the confirmation code from URL.
     * Responses:
     *  - 200: Code request
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getThirdPartyCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-code/
     *
     *
     * @param provider The identity provider used for authentication.
     * @return [ObjectWrapper]
     */
    @GET("api/2.0/thirdparty/{provider}")
    suspend fun getThirdPartyCode(@Path("provider") provider: LoginProvider): Response<ObjectWrapper>

}
