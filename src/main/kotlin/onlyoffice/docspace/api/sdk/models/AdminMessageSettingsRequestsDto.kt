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
 * The message sent to the portal administrators, with the CAPTCHA proof that a person wrote it.
 *
 * @param message What the sender wants to tell the portal administrators. Markup is stripped before the letter is written, so  a body that carries nothing but markup counts as empty and is refused with 400.
 * @param email The address the sender can be answered at, which the letter is signed with. It has to be a well-formed email  address.
 * @param culture The language the letter is written in, as a culture name such as `en-US`. A culture the installation does not  have falls back to the portal language rather than failing the call.
 * @param recaptchaType Which CAPTCHA service the proof in `recaptchaResponse` came from. It has to match the service the  installation is configured with, which `GET api/2.0/capabilities` reports; the default value means the  installation is left to decide.
 * @param recaptchaResponse The token the CAPTCHA widget produced in the browser, passed on unchanged for the portal to verify with the  CAPTCHA service. It is single-use and short-lived, so it cannot be reused for a second message.
 */


data class AdminMessageSettingsRequestsDto (

    @Json(name = "message")
    val message: kotlin.String?,

    @Json(name = "email")
    val email: kotlin.String?,

    @Json(name = "culture")
    val culture: kotlin.String? = null,

    @Json(name = "recaptchaType")
    val recaptchaType: RecaptchaType? = null,

    @Json(name = "recaptchaResponse")
    val recaptchaResponse: kotlin.String? = null

) {


}

