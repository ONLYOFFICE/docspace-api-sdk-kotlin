 /*
 * (c) Copyright Ascensio System SIA 2025
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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.SmtpOperationStatusRequestsWrapper
import onlyoffice.docspace.api.sdk.models.SmtpSettingsDto
import onlyoffice.docspace.api.sdk.models.SmtpSettingsWrapper

interface SMTPSettingsApi {
    /**
     * GET api/2.0/smtpsettings/smtp/test/status
     * Get the SMTP testing process status
     * Returns the status of the SMTP testing process.
     * Responses:
     *  - 200: SMTP operation status
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for getSmtpOperationStatus Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-operation-status/
     *
     *
     * @return [Call]<[SmtpOperationStatusRequestsWrapper]>
     */
    @GET("api/2.0/smtpsettings/smtp/test/status")
    fun getSmtpOperationStatus(): Call<SmtpOperationStatusRequestsWrapper>

    /**
     * GET api/2.0/smtpsettings/smtp
     * Get the SMTP settings
     * Returns the current portal SMTP settings.
     * Responses:
     *  - 200: SMTP settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for getSmtpSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-smtp-settings/
     *
     *
     * @return [Call]<[SmtpSettingsWrapper]>
     */
    @GET("api/2.0/smtpsettings/smtp")
    fun getSmtpSettings(): Call<SmtpSettingsWrapper>

    /**
     * DELETE api/2.0/smtpsettings/smtp
     * Reset the SMTP settings
     * Resets the SMTP settings of the current portal.
     * Responses:
     *  - 200: Default SMTP settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for resetSmtpSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/reset-smtp-settings/
     *
     *
     * @return [Call]<[SmtpSettingsWrapper]>
     */
    @DELETE("api/2.0/smtpsettings/smtp")
    fun resetSmtpSettings(): Call<SmtpSettingsWrapper>

    /**
     * POST api/2.0/smtpsettings/smtp
     * Save the SMTP settings
     * Saves the SMTP settings for the current portal.
     * Responses:
     *  - 200: SMTP settings
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for saveSmtpSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/save-smtp-settings/
     *
     *
     * @param smtpSettingsDto  (optional)
     * @return [Call]<[SmtpSettingsWrapper]>
     */
    @POST("api/2.0/smtpsettings/smtp")
    fun saveSmtpSettings(@Body smtpSettingsDto: SmtpSettingsDto? = null): Call<SmtpSettingsWrapper>

    /**
     * GET api/2.0/smtpsettings/smtp/test
     * Test the SMTP settings
     * Tests the SMTP settings for the current portal (sends test message to the user email).
     * Responses:
     *  - 200: SMTP operation status
     *  - 401: Unauthorized
     *  - 402: Your pricing plan does not support this option
     *
     * REST API Reference for testSmtpSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/test-smtp-settings/
     *
     *
     * @return [Call]<[SmtpOperationStatusRequestsWrapper]>
     */
    @GET("api/2.0/smtpsettings/smtp/test")
    fun testSmtpSettings(): Call<SmtpOperationStatusRequestsWrapper>

}
