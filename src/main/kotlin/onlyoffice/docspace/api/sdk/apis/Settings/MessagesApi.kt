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

import onlyoffice.docspace.api.sdk.models.AdminMessageBaseSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.AdminMessageSettingsRequestsDto
import onlyoffice.docspace.api.sdk.models.ErrorApiResponse
import onlyoffice.docspace.api.sdk.models.StringWrapper
import onlyoffice.docspace.api.sdk.models.TurnOnAdminMessageSettingsRequestDto

interface MessagesApi {
    /**
     * POST api/2.0/settings/messagesettings
     * Enable or disable administrator messages
     * Switches on or off the contact form the sign-in page offers a visitor who cannot get into the portal, and  which delivers their message to the portal administrators. The caller needs the portal-settings right of a  DocSpace administrator - the portal owner and a DocSpace administrator qualify, any other member is refused.  Send the new state as `turnOn`: `true` publishes the form, `false` hides it. The change covers the whole  portal, applies to the next sign-in page without a restart, is recorded in the audit trail, and repeating the  call with the same value leaves the portal as it is. What comes back is a localized confirmation message  rather than the stored flag - read the flag as `enableAdmMess` from `GET api/2.0/settings`, which needs no  token. That flag is also forced on while the portal's payment has lapsed, so it can report `true` on a portal  where the form was switched off here. The form itself posts to `POST api/2.0/settings/sendadmmail` and this  setting gates nothing else: the notifications administrators receive as portal members are subscribed  separately with `POST api/2.0/settings/notification`.
     * Responses:
     *  - 200: A localized message confirming that the administrator message setting has been saved
     *  - 401: Unauthorized
     *  - 429: Too Many Requests.
     *  - 500: Internal Server Error.
     *  - 400: Bad Request.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for enableAdminMessageSettings Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/enable-admin-message-settings/
     *
     *
     * @param turnOnAdminMessageSettingsRequestDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/messagesettings")
    suspend fun enableAdminMessageSettings(@Body turnOnAdminMessageSettingsRequestDto: TurnOnAdminMessageSettingsRequestDto? = null): Response<StringWrapper>

    /**
     * POST api/2.0/settings/sendadmmail
     * Send a message to the administrator
     * Sends a message from someone who cannot get into the portal to its administrators - the contact form the  sign-in page offers unauthenticated visitors. No token is needed. The form has to be published first with  `POST api/2.0/settings/messagesettings` unless the portal's payment has lapsed, otherwise nothing is sent;  `enableAdmMess` in `GET api/2.0/settings` reports whether the call is worth making. `email` is the address the  administrators answer to and has to be a real address, and `message` is reduced to plain text first, so a body  carrying nothing but markup counts as empty - either fault is refused with 400. When the caller is not signed  in and this installation has a CAPTCHA configured, `recaptchaResponse` has to carry a solved challenge of the  `recaptchaType` that `GET api/2.0/settings` publishes together with the site key, and a missing or stale  answer refuses the call. `culture` picks the language of the letter. Delivery is queued and reaches the  administrators subscribed to administrator notifications, so a confirmed call means accepted rather than read,  and the answer is a localized confirmation. Attempts are rate limited per address and per operation, and  further ones are refused with 429.
     * Responses:
     *  - 200: A localized message confirming that the message has been queued for the portal administrators
     *  - 400: The email address is malformed, or the message is empty once its markup is stripped
     *  - 429: Too many contact attempts came from the same address within the rate-limit window
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendAdminMail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-admin-mail/
     *
     *
     * @param adminMessageSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/sendadmmail")
    suspend fun sendAdminMail(@Body adminMessageSettingsRequestsDto: AdminMessageSettingsRequestsDto? = null): Response<StringWrapper>

    /**
     * POST api/2.0/settings/sendjoininvite
     * Send an invitation email
     * Sends an invitation email with a join link to the address in the request - the self-registration the sign-in  page's register link performs. No token is needed. The portal has to publish a trusted-domain policy first,  saved with `POST api/2.0/settings/maildomainsettings`: without one there is nothing to join and every caller  alike is answered with 405 - the same condition `GET api/2.0/settings` reports as `enabledJoin`. `email` has  to be a real address written in ASCII rather than an internationalized one, must not already belong to a  portal member, and, when the policy names domains rather than accepting all of them, has to end with one of  them - each of those faults is refused with 400. `culture` picks the language of the letter. The invitation is  not an account: the invitee becomes a member only after following the link, and the role it grants, user or  room administrator, follows the trusted-domain settings and drops to user once the portal's paid places are  taken. Where the installation caps invitations, an accepted call spends one of those counted by  `invitationLimit`, and only about a dozen calls from one address in two minutes are accepted. What comes back  is a localized confirmation.
     * Responses:
     *  - 200: A localized message confirming that the invitation with the join link has been sent
     *  - 400: The email address is malformed or internationalized, lies outside the trusted domains, or already belongs to a member of the portal
     *  - 403: The portal is not accepting requests while it is being restored, transferred or encrypted
     *  - 405: The portal publishes no trusted-domain policy, so it has nothing to join
     *  - 429: Too many invitation requests came from the same network address
     *  - 500: Internal Server Error.
     *  - 502: Bad Gateway. Returned by the reverse proxy, response body may be HTML and not JSON.
     *  - 503: Service Unavailable. Returned by the reverse proxy, response body may be HTML and not JSON.
     *
     * REST API Reference for sendJoinInviteMail Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/send-join-invite-mail/
     *
     *
     * @param adminMessageBaseSettingsRequestsDto  (optional)
     * @return [StringWrapper]
     */
    @POST("api/2.0/settings/sendjoininvite")
    suspend fun sendJoinInviteMail(@Body adminMessageBaseSettingsRequestsDto: AdminMessageBaseSettingsRequestsDto? = null): Response<StringWrapper>

}
