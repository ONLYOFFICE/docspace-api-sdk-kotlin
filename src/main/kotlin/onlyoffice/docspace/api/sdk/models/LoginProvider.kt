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
 * [0 - Facebook, 1 - Google, 2 - Dropbox, 3 - Docusign, 4 - Box, 5 - OneDrive, 6 - GosUslugi, 7 - LinkedIn, 8 - MailRu, 9 - VK, 10 - Wordpress, 11 - Yahoo, 12 - Yandex, 13 - Github]
 *
 * Values: Facebook,Google,Dropbox,Docusign,Box,OneDrive,GosUslugi,LinkedIn,MailRu,VK,Wordpress,Yahoo,Yandex,Github
 */

@JsonClass(generateAdapter = false)
enum class LoginProvider(val value: kotlin.Int) {

    @Json(name = 0)
    Facebook(0),

    @Json(name = 1)
    Google(1),

    @Json(name = 2)
    Dropbox(2),

    @Json(name = 3)
    Docusign(3),

    @Json(name = 4)
    Box(4),

    @Json(name = 5)
    OneDrive(5),

    @Json(name = 6)
    GosUslugi(6),

    @Json(name = 7)
    LinkedIn(7),

    @Json(name = 8)
    MailRu(8),

    @Json(name = 9)
    VK(9),

    @Json(name = 10)
    Wordpress(10),

    @Json(name = 11)
    Yahoo(11),

    @Json(name = 12)
    Yandex(12),

    @Json(name = 13)
    Github(13);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is LoginProvider) "$data" else null

        /**
         * Returns a valid [LoginProvider] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): LoginProvider? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

