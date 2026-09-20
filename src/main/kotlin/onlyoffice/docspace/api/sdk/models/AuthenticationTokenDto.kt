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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The outcome of a sign-in attempt: either the authentication token, or the second factor still to be passed.
 *
 * @param token The token to put in the `Authorization` header of later calls. It is empty whenever a second factor is  still outstanding, which is what `sms` or `tfa` then says; the same token is also set as a portal cookie by  the call that issued it, so a browser client does not have to carry it itself.
 * @param expires When the token stops being accepted. It stays at its zero value when `session=true` tied the token to the  browser session instead of to a fixed moment. On the two operations that only send an SMS it carries a  different meaning: there is no token, and this is the moment the code that was just sent expires.
 * @param sms Whether an SMS code is the second factor in play. Next to an empty `token` it means the code has to be sent  to `POST api/2.0/authentication/{code}` before a token is issued; next to a filled `token` it means the  code just accepted was an SMS one.
 * @param phoneNoise The stored phone number with its middle digits masked, filled in only while `sms` is set and a number is  already activated for the user. It is there to be shown to the person signing in, not to be sent back.
 * @param tfa Whether an authenticator app is the second factor in play, with the same two readings as `sms`.
 * @param tfaKey The secret to enrol in an authenticator app, in the manual-entry form. It is filled in only while `tfa` is  set and the app has not been connected yet, which is the one moment the secret is handed out; once the app  is connected it stays empty. `GET api/2.0/settings/tfaapp/setup` returns the same secret with a QR code.
 * @param confirmUrl The confirmation link the client has to open to get past the second factor. It points at phone activation  while no number is activated, at authenticator-app activation while the app is not connected, and at the  plain code prompt once either is in place. It is empty in an answer that already carries a token.
 */


data class AuthenticationTokenDto (

    @Json(name = "token")
    val token: kotlin.String? = null,

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null,

    @Json(name = "sms")
    val sms: kotlin.Boolean? = null,

    @Json(name = "phoneNoise")
    val phoneNoise: kotlin.String? = null,

    @Json(name = "tfa")
    val tfa: kotlin.Boolean? = null,

    @Json(name = "tfaKey")
    val tfaKey: kotlin.String? = null,

    @Json(name = "confirmUrl")
    val confirmUrl: java.net.URI? = null

) {


}

