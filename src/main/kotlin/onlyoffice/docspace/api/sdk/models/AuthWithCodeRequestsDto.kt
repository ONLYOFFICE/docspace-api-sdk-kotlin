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

package onlyoffice.docspace.api.sdk.models

import onlyoffice.docspace.api.sdk.models.ConfirmData
import onlyoffice.docspace.api.sdk.models.RecaptchaType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The same credentials as an ordinary sign-in, plus the one-time code that completes it.
 *
 * @param userName The account signing in, given as its email address or its portal user name. It is required for a password  sign-in and ignored when the credentials are a confirmation key or a third-party account.
 * @param password The password in the clear. Send either this or `passwordHash`, never both; hashing it in the client with the  parameters from `GET api/2.0/settings?withpassword=true` and sending `passwordHash` instead keeps the plain  password off the wire.
 * @param passwordHash The password already hashed in the client. It has to be produced with the `salt`, iteration count and hash  size that `GET api/2.0/settings?withpassword=true` publishes, or the portal cannot recognise it; a value sent  here takes the place of `password`.
 * @param provider The third-party identity provider the account is being signed in through, by its internal key such as  `google` or `linkedin`. Sending it switches the call to a third-party sign-in, which needs `accessToken` or  `serializedProfile` and is only allowed on a self-hosted installation or a tariff that includes third-party  sign-in.
 * @param accessToken The access token the provider named in `provider` issued for the account, passed on unchanged for the portal  to verify with that provider. The portal then matches the address it gets back against its own accounts, so a  valid token for an address unknown here is answered as no such user.
 * @param serializedProfile The third-party profile already fetched and serialised by the caller, as an alternative to `accessToken` for  a provider whose profile the client holds. It identifies the account by the address it carries.
 * @param codeOAuth The OAuth authorization code obtained from the provider, for a flow that has not been exchanged for an access  token yet. It is recorded with the sign-in rather than replacing `accessToken`.
 * @param session Whether the issued token is tied to the browser session. When it is, the answer carries no `expires` and the  token dies with the session; otherwise it lives for the portal session lifetime.
 * @param confirmData The confirmation link data, as a third way to identify the account beside a password and a third-party  account. Send it when the sign-in comes from a link the portal mailed, in which case `userName` and the  password fields are not read.
 * @param recaptchaType Which CAPTCHA service the proof in `recaptchaResponse` came from. It has to match the service the  installation is configured with, which `GET api/2.0/settings` publishes together with the site key.
 * @param recaptchaResponse The token the CAPTCHA widget produced in the browser, passed on unchanged for the portal to verify. It is  only demanded once repeated failures have made the portal ask for a challenge, and it is single-use, so a  retry needs a freshly solved one.
 * @param culture The language the sign-in messages and any letter that follows are written in, as a culture name such as  `en-US`. A culture the installation does not have falls back to the portal language.
 * @param code The one-time code from the SMS the portal sent or from the authenticator app, whichever second factor the  portal has enabled for this user. It is single-use and expires; a wrong, empty or expired value fails the  sign-in and counts against the brute-force limit.
 */


data class AuthWithCodeRequestsDto (

    @Json(name = "userName")
    val userName: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "passwordHash")
    val passwordHash: kotlin.String? = null,

    @Json(name = "provider")
    val provider: kotlin.String? = null,

    @Json(name = "accessToken")
    val accessToken: kotlin.String? = null,

    @Json(name = "serializedProfile")
    val serializedProfile: kotlin.String? = null,

    @Json(name = "codeOAuth")
    val codeOAuth: kotlin.String? = null,

    @Json(name = "session")
    val session: kotlin.Boolean? = null,

    @Json(name = "confirmData")
    val confirmData: ConfirmData? = null,

    @Json(name = "recaptchaType")
    val recaptchaType: RecaptchaType? = null,

    @Json(name = "recaptchaResponse")
    val recaptchaResponse: kotlin.String? = null,

    @Json(name = "culture")
    val culture: kotlin.String? = null,

    @Json(name = "code")
    val code: kotlin.String? = null

) {


}

