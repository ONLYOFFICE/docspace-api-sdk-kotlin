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
 * The password settings parameters.
 *
 * @param minLength The minimum number of characters required for valid passwords.
 * @param upperCase Specifies whether the password should contain the uppercase letters or not.
 * @param digits Specifies whether the password should contain the digits or not.
 * @param specSymbols Specifies whether the password should contain the special symbols or not.
 * @param allowedCharactersRegexStr The allowed password characters in the regex string format.
 * @param digitsRegexStr The password digits in the regex string format.
 * @param upperCaseRegexStr The password uppercase letters in the regex string format.
 * @param specSymbolsRegexStr The passaword special symbols in the regex string format.
 */


data class PasswordSettingsDto (

    @Json(name = "minLength")
    val minLength: kotlin.Int,

    @Json(name = "upperCase")
    val upperCase: kotlin.Boolean,

    @Json(name = "digits")
    val digits: kotlin.Boolean,

    @Json(name = "specSymbols")
    val specSymbols: kotlin.Boolean,

    @Json(name = "allowedCharactersRegexStr")
    val allowedCharactersRegexStr: kotlin.String?,

    @Json(name = "digitsRegexStr")
    val digitsRegexStr: kotlin.String?,

    @Json(name = "upperCaseRegexStr")
    val upperCaseRegexStr: kotlin.String?,

    @Json(name = "specSymbolsRegexStr")
    val specSymbolsRegexStr: kotlin.String?

) {


}

