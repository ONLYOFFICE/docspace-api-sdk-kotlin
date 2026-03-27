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

import onlyoffice.docspace.api.sdk.models.AccountInfoArrayWrapper
import onlyoffice.docspace.api.sdk.models.EmployeeWrapper
import onlyoffice.docspace.api.sdk.models.LinkAccountRequestDto
import onlyoffice.docspace.api.sdk.models.SignupAccountRequestDto

interface ThirdPartyAccountsApi {
    /**
     * GET api/2.0/people/thirdparty/providers
     * Get third-party accounts
     * Returns a list of the available third-party accounts.
     * Responses:
     *  - 200: List of third-party accounts
     *
     * REST API Reference for getThirdPartyAuthProviders Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-third-party-auth-providers/
     *
     *
     * @param inviteView Specifies whether to return providers that are available for invitation links, i.e. the user can login or register through these providers. (optional)
     * @param settingsView Specifies whether to display the provider settings in a pop-up window (true) or redirect them to the desktop application (false). (optional)
     * @param clientCallback The method that is called after authentication. (optional)
     * @param fromOnly The provider name if a response is required only from this provider. (optional)
     * @return [AccountInfoArrayWrapper]
     */
    @GET("api/2.0/people/thirdparty/providers")
    suspend fun getThirdPartyAuthProviders(@Query("inviteView") inviteView: kotlin.Boolean? = null, @Query("settingsView") settingsView: kotlin.Boolean? = null, @Query("clientCallback") clientCallback: kotlin.String? = null, @Query("fromOnly") fromOnly: kotlin.String? = null): Response<AccountInfoArrayWrapper>

    /**
     * PUT api/2.0/people/thirdparty/linkaccount
     * Link a third-pary account
     * Links a third-party account specified in the request to the user profile.
     * Responses:
     *  - 200: Ok
     *  - 405: Error not allowed option
     *  - 401: Unauthorized
     *
     * REST API Reference for linkThirdPartyAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/link-third-party-account/
     *
     *
     * @param linkAccountRequestDto  (optional)
     * @return [Unit]
     */
    @PUT("api/2.0/people/thirdparty/linkaccount")
    suspend fun linkThirdPartyAccount(@Body linkAccountRequestDto: LinkAccountRequestDto? = null): Response<Unit>

    /**
     * POST api/2.0/people/thirdparty/signup
     * Create a third-pary account
     * Creates a third-party account with the parameters specified in the request.
     * Responses:
     *  - 200: Ok
     *  - 400: Incorrect email
     *  - 403: The invitation link is invalid or its validity has expired
     *
     * REST API Reference for signupThirdPartyAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/signup-third-party-account/
     *
     *
     * @param signupAccountRequestDto  (optional)
     * @return [EmployeeWrapper]
     */
    @POST("api/2.0/people/thirdparty/signup")
    suspend fun signupThirdPartyAccount(@Body signupAccountRequestDto: SignupAccountRequestDto? = null): Response<EmployeeWrapper>

    /**
     * DELETE api/2.0/people/thirdparty/unlinkaccount
     * Unlink a third-pary account
     * Unlinks a third-party account specified in the request from the user profile.
     * Responses:
     *  - 200: OK
     *  - 401: Unauthorized
     *
     * REST API Reference for unlinkThirdPartyAccount Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-third-party-account/
     *
     *
     * @param provider The provider name. (optional)
     * @return [Unit]
     */
    @DELETE("api/2.0/people/thirdparty/unlinkaccount")
    suspend fun unlinkThirdPartyAccount(@Query("provider") provider: kotlin.String? = null): Response<Unit>

}
