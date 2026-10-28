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
 * The SAML name ID formats the SSO settings accept.
 *
 * @param saml11Unspecified The SAML 1.1 unspecified name ID format.
 * @param saml11EmailAddress The SAML 1.1 email address name ID format.
 * @param saml20Entity The SAML 2.0 entity name ID format.
 * @param saml20Transient The SAML 2.0 transient name ID format, whose identifier differs from one session to the next. It is what  the built-in configuration uses.
 * @param saml20Persistent The SAML 2.0 persistent name ID format, whose identifier stays the same for one person across sessions.
 * @param saml20Encrypted The SAML 2.0 encrypted name ID format.
 * @param saml20Unspecified The SAML 2.0 unspecified name ID format.
 * @param saml11X509SubjectName The SAML 1.1 X.509 subject name name ID format.
 * @param saml11WindowsDomainQualifiedName The SAML 1.1 Windows domain qualified name name ID format.
 * @param saml20Kerberos The SAML 2.0 Kerberos name ID format.
 */


data class SsoNameIdFormatTypeDto (

    @Json(name = "saml11Unspecified")
    val saml11Unspecified: kotlin.String? = null,

    @Json(name = "saml11EmailAddress")
    val saml11EmailAddress: kotlin.String? = null,

    @Json(name = "saml20Entity")
    val saml20Entity: kotlin.String? = null,

    @Json(name = "saml20Transient")
    val saml20Transient: kotlin.String? = null,

    @Json(name = "saml20Persistent")
    val saml20Persistent: kotlin.String? = null,

    @Json(name = "saml20Encrypted")
    val saml20Encrypted: kotlin.String? = null,

    @Json(name = "saml20Unspecified")
    val saml20Unspecified: kotlin.String? = null,

    @Json(name = "saml11X509SubjectName")
    val saml11X509SubjectName: kotlin.String? = null,

    @Json(name = "saml11WindowsDomainQualifiedName")
    val saml11WindowsDomainQualifiedName: kotlin.String? = null,

    @Json(name = "saml20Kerberos")
    val saml20Kerberos: kotlin.String? = null

) {


}

