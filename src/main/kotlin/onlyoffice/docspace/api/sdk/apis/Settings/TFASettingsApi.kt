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


package onlyoffice.docspace.api.sdk.apis.Settings

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.BooleanWrapper
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TfaAppCodeArrayWrapper
import onlyoffice.docspace.api.sdk.models.TfaConfirmDataWrapper
import onlyoffice.docspace.api.sdk.models.TfaRequestsDto
import onlyoffice.docspace.api.sdk.models.TfaSettingsArrayWrapper
import onlyoffice.docspace.api.sdk.models.TfaSetupCodeWrapper
import onlyoffice.docspace.api.sdk.models.TfaValidateRequestsDto

interface TFASettingsApi {
    /**
     * GET api/2.0/settings/tfaappcodes
     * Get the TFA codes
     * Returns the two-factor authentication application codes.
     * Responses:
     *  - 200: List of TFA application codes
     *  - 405: TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaAppCodes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-app-codes/
     *
     *
     * @return [TfaAppCodeArrayWrapper]
     */
    @GET("api/2.0/settings/tfaappcodes")
    suspend fun getTfaAppCodes(): Response<TfaAppCodeArrayWrapper>

    /**
     * GET api/2.0/settings/tfaapp/confirm
     * Get TFA confirmation data
     * Returns the confirmation data for authorization via SMS or TFA application.
     * Responses:
     *  - 200: TFA confirmation data
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaConfirmData Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-confirm-data/
     *
     *
     * @return [TfaConfirmDataWrapper]
     */
    @GET("api/2.0/settings/tfaapp/confirm")
    suspend fun getTfaConfirmData(): Response<TfaConfirmDataWrapper>

    /**
     * GET api/2.0/settings/tfaapp
     * Get the TFA settings
     * Returns the current two-factor authentication settings.
     * Responses:
     *  - 200: TFA settings
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for getTfaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-tfa-settings/
     *
     *
     * @return [TfaSettingsArrayWrapper]
     */
    @GET("api/2.0/settings/tfaapp")
    suspend fun getTfaSettings(): Response<TfaSettingsArrayWrapper>

    /**
     * GET api/2.0/settings/tfaapp/setup
     * Generate setup code
     * Generates the setup TFA code for the current user.
     * Responses:
     *  - 200: Setup code
     *  - 405: TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for tfaAppGenerateSetupCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-app-generate-setup-code/
     *
     *
     * @return [TfaSetupCodeWrapper]
     */
    @GET("api/2.0/settings/tfaapp/setup")
    suspend fun tfaAppGenerateSetupCode(): Response<TfaSetupCodeWrapper>

    /**
     * POST api/2.0/settings/tfaapp/validate
     * Validate the TFA code
     * Validates the two-factor authentication code specified in the request.
     * Responses:
     *  - 200: True if the code is valid
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for tfaValidateAuthCode Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/tfa-validate-auth-code/
     *
     *
     * @param tfaValidateRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @POST("api/2.0/settings/tfaapp/validate")
    suspend fun tfaValidateAuthCode(@Body tfaValidateRequestsDto: TfaValidateRequestsDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/settings/tfaappnewapp
     * Unlink the TFA application
     * Unlinks the current two-factor authentication application from the user account specified in the request.
     * Responses:
     *  - 200: Login URL
     *  - 403: No permissions to perform this action
     *  - 405: TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for unlinkTfaApp Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/unlink-tfa-app/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/tfaappnewapp")
    suspend fun unlinkTfaApp(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<StringWrapper>

    /**
     * PUT api/2.0/settings/tfaappnewcodes
     * Update the TFA codes
     * Requests the new backup codes for the two-factor authentication application.
     * Responses:
     *  - 200: New backup codes
     *  - 405: TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaAppCodes Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-app-codes/
     *
     *
     * @return [TfaAppCodeArrayWrapper]
     */
    @PUT("api/2.0/settings/tfaappnewcodes")
    suspend fun updateTfaAppCodes(): Response<TfaAppCodeArrayWrapper>

    /**
     * PUT api/2.0/settings/tfaapp
     * Update the TFA settings
     * Updates the two-factor authentication settings with the parameters specified in the request.
     * Responses:
     *  - 200: True if the operation is successful
     *  - 405: SMS settings are not available/TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [BooleanWrapper]
     */
    @PUT("api/2.0/settings/tfaapp")
    suspend fun updateTfaSettings(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<BooleanWrapper>

    /**
     * PUT api/2.0/settings/tfaappwithlink
     * Updates TFA settings
     * Updates TFA settings and returns the confirmation URL for authorization via SMS or TFA application.
     * Responses:
     *  - 200: TFA confirmation URL
     *  - 403: No permissions to perform this action
     *  - 405: SMS settings are not available/TFA application settings are not available
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for updateTfaSettingsLink Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/update-tfa-settings-link/
     *
     *
     * @param tfaRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @PUT("api/2.0/settings/tfaappwithlink")
    suspend fun updateTfaSettingsLink(@Body tfaRequestsDto: TfaRequestsDto? = null): Response<StringWrapper>

}
