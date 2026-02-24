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

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for configuring the password complexity requirements.
 *
 * @param minLength The minimum number of characters required for valid passwords.
 * @param upperCase Specifies whether the password should contain the uppercase letters or not.
 * @param digits Specifies whether the password should contain the digits or not.
 * @param specSymbols Specifies whether the password should contain the special symbols or not.
 */


data class PasswordSettingsRequestsDto (

    /* The minimum number of characters required for valid passwords. */
    @Json(name = "minLength")
    val minLength: kotlin.Int,

    /* Specifies whether the password should contain the uppercase letters or not. */
    @Json(name = "upperCase")
    val upperCase: kotlin.Boolean? = null,

    /* Specifies whether the password should contain the digits or not. */
    @Json(name = "digits")
    val digits: kotlin.Boolean? = null,

    /* Specifies whether the password should contain the special symbols or not. */
    @Json(name = "specSymbols")
    val specSymbols: kotlin.Boolean? = null

) {


}

