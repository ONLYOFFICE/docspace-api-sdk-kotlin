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

import onlyoffice.docspace.api.sdk.models.AdminMessageBaseSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.AdminMessageSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TurnOnAdminMessageSettingsRequestDto

interface MessagesApi {
    /**
     * POST api/2.0/settings/messagesettings
     * Enable the administrator message settings
     * Displays the contact form on the Sign In page, allowing users to send a message to the DocSpace administrator in case they encounter any issues while accessing DocSpace.
     * Responses:
     *  - 200: Message about the result of saving new settings
     *  - 401: Unauthorized
     *
     * REST API Reference for enableAdminMessageSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-admin-message-settings/
     *
     *
     * @param turnOnAdminMessageSettingsRequestDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/settings/messagesettings")
    fun enableAdminMessageSettings(@Body turnOnAdminMessageSettingsRequestDto: TurnOnAdminMessageSettingsRequestDto? = null): Call<StringWrapper>

    /**
     * POST api/2.0/settings/sendadmmail
     * Send a message to the administrator
     * Sends a message to the administrator email when unauthorized users encounter issues accessing DocSpace.
     * Responses:
     *  - 200: Message about the result of sending a message
     *  - 400: Incorrect email or message text is empty
     *  - 429: Request limit is exceeded
     *
     * REST API Reference for sendAdminMail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-admin-mail/
     *
     *
     * @param adminMessageSettingsRequestsDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/settings/sendadmmail")
    fun sendAdminMail(@Body adminMessageSettingsRequestsDto: AdminMessageSettingsRequestsDto? = null): Call<StringWrapper>

    /**
     * POST api/2.0/settings/sendjoininvite
     * Sends an invitation email
     * Sends an invitation email with a link to the DocSpace.
     * Responses:
     *  - 200: Message about sending a link to confirm joining the DocSpace
     *  - 400: Incorrect email or email already exists
     *  - 403: No permissions to perform this action
     *  - 429: Request limit is exceeded
     *
     * REST API Reference for sendJoinInviteMail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-join-invite-mail/
     *
     *
     * @param adminMessageBaseSettingsRequestsDto  (optional)
     * @return [Call]<[StringWrapper]>
     */
    @POST("api/2.0/settings/sendjoininvite")
    fun sendJoinInviteMail(@Body adminMessageBaseSettingsRequestsDto: AdminMessageBaseSettingsRequestsDto? = null): Call<StringWrapper>

}
