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
 * The password policy of the portal, with the expressions a client can check a password against.
 *
 * @param minLength The shortest password the portal accepts, 8 characters on a portal nobody has configured. Whatever the  policy says, a password longer than 30 characters is refused as well, and that ceiling is not reported  here.
 * @param upperCase Whether at least one uppercase letter is demanded. While it is `false` an uppercase letter is still  allowed - the flag adds a requirement rather than permission.
 * @param digits Whether at least one digit is demanded, read the same way as `upperCase`.
 * @param specSymbols Whether at least one special symbol is demanded, read the same way as `upperCase`. Which symbols count is  spelled out by `specSymbolsRegexStr`.
 * @param allowedCharactersRegexStr The expression the whole password has to match, which is what defines the alphabet the portal accepts at  all. It comes from the installation's configuration rather than from the portal policy, so it is the same  for every portal of an installation and unaffected by the flags above.
 * @param digitsRegexStr The look-ahead expression that tests the digit requirement, meant to be applied only while `digits` is  `true`. It is always filled in, so its presence is not itself a requirement.
 * @param upperCaseRegexStr The look-ahead expression that tests the uppercase requirement, to be applied while `upperCase` is `true`.
 * @param specSymbolsRegexStr The look-ahead expression that tests the special-symbol requirement, to be applied while `specSymbols` is  `true`. It also enumerates the symbols the portal treats as special.
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

