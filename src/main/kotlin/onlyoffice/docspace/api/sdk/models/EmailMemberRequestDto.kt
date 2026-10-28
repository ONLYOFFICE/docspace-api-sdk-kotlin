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

import onlyoffice.docspace.api.sdk.models.RecaptchaType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for the user email.
 *
 * @param email The address to send the password recovery link to. It is required and validated even by  `POST api/2.0/people/guests/share/approve`, which then ignores its value and takes the account from the  confirmation token instead.
 * @param recaptchaType Which CAPTCHA the `recaptchaResponse` comes from: `Default` for the web reCAPTCHA, `AndroidV2` or `iOSV2` for  the mobile ones, and `hCaptcha` when the portal is configured with hCaptcha. It matters only for an  unauthenticated request on a portal that has a CAPTCHA.
 * @param recaptchaResponse The user's response to the CAPTCHA challenge.
 */


data class EmailMemberRequestDto (

    @Json(name = "email")
    val email: kotlin.String,

    @Json(name = "recaptchaType")
    val recaptchaType: RecaptchaType? = null,

    @Json(name = "recaptchaResponse")
    val recaptchaResponse: kotlin.String? = null

) {


}

