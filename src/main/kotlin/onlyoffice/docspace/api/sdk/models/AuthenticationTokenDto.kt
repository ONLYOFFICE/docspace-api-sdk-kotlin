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
 * The authentication token parameters.
 *
 * @param token The authentication token.
 * @param expires The token expiration time.
 * @param sms Specifies if the authentication code is sent by SMS or not.
 * @param phoneNoise The phone number.
 * @param tfa Specifies if the two-factor application is used or not.
 * @param tfaKey The two-factor authentication key.
 * @param confirmUrl The confirmation email URL.
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

