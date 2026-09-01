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
 * The parameters required for the user two-factor authentication requests.
 *
 * @param userName The username or email used for authentication.
 * @param password The password in plain text for user authentication.
 * @param passwordHash The hashed password for secure verification.
 * @param provider The type of authentication provider (e.g., internal, Google, Azure).
 * @param accessToken The access token used for authentication with external providers.
 * @param serializedProfile The serialized user profile data, if applicable.
 * @param codeOAuth The authorization code used for obtaining OAuth tokens.
 * @param session Specifies whether the authentication is session-based.
 * @param confirmData The additional confirmation data required for authentication.
 * @param recaptchaType The type of CAPTCHA validation used.
 * @param recaptchaResponse The user's response to the CAPTCHA challenge.
 * @param culture The culture code for localization during authentication.
 * @param code The code for two-factor authentication.
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

