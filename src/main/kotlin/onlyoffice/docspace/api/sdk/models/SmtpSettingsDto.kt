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
 * The SMTP settings parameters.
 *
 * @param host The SMTP host.
 * @param port The SMTP port.
 * @param senderAddress The sender address.
 * @param senderDisplayName The sender display name.
 * @param credentialsUserName The credentials username.
 * @param credentialsUserPassword The credentials user password.
 * @param enableSSL Specifies whether the SSL is enabled or not.
 * @param enableAuth Specifies whether the authentication is enabled or not.
 * @param useNtlm Specifies whether to use NTLM or not.
 * @param isDefaultSettings Specifies if the current settings are default or not.
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

