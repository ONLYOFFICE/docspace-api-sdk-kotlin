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
 * @param email The user email address.
 * @param recaptchaType The type of CAPTCHA validation used.
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

