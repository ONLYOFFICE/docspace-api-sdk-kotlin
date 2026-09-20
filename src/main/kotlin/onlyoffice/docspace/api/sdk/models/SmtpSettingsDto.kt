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
 * The mail server the portal sends its letters through.
 *
 * @param host The host name or address of the mail server. On a cloud portal that has saved no relay of its own every  field of this object comes back empty, because the installation's own server is not disclosed - only  `isDefaultSettings` is set there.
 * @param port The port the mail server is reached on - conventionally 25 or 587 without encryption from the start, 465  with it. It is empty when no port was stored, in which case the portal falls back to its own default.
 * @param senderAddress The address the letters are sent from, which appears in the From header and is what a reply goes to.
 * @param senderDisplayName The name shown beside that address in a recipient's mailbox.
 * @param credentialsUserName The account the portal signs in to the mail server as, meaningful only while `enableAuth` is `true`.
 * @param credentialsUserPassword Always empty here: the stored password is never returned, so a client that sends these settings back has  to supply it again rather than echoing what it read.
 * @param enableSSL Whether the connection to the mail server is encrypted.
 * @param enableAuth Whether the portal signs in to the mail server at all. While it is `false` the credentials above are  ignored and the server is expected to accept mail unauthenticated.
 * @param useNtlm Always `false` here: the flag is accepted when settings are saved but is not stored, so it never comes  back set and says nothing about how the portal authenticates.
 * @param isDefaultSettings Whether the portal is still on the mail configuration of the installation rather than on a relay of its  own. `DELETE api/2.0/smtpsettings/smtp` puts it back to `true`, and while it is `true` on a cloud portal  the fields above are blank rather than showing the installation's server.
 */


data class SmtpSettingsDto (

    @Json(name = "host")
    val host: kotlin.String? = null,

    @Json(name = "port")
    val port: kotlin.Int? = null,

    @Json(name = "senderAddress")
    val senderAddress: kotlin.String? = null,

    @Json(name = "senderDisplayName")
    val senderDisplayName: kotlin.String? = null,

    @Json(name = "credentialsUserName")
    val credentialsUserName: kotlin.String? = null,

    @Json(name = "credentialsUserPassword")
    val credentialsUserPassword: kotlin.String? = null,

    @Json(name = "enableSSL")
    val enableSSL: kotlin.Boolean? = null,

    @Json(name = "enableAuth")
    val enableAuth: kotlin.Boolean? = null,

    @Json(name = "useNtlm")
    val useNtlm: kotlin.Boolean? = null,

    @Json(name = "isDefaultSettings")
    val isDefaultSettings: kotlin.Boolean? = null

) {


}

