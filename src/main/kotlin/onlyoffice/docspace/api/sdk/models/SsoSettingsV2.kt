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

import onlyoffice.docspace.api.sdk.models.SsoCertificate
import onlyoffice.docspace.api.sdk.models.SsoFieldMapping
import onlyoffice.docspace.api.sdk.models.SsoIdpCertificateAdvanced
import onlyoffice.docspace.api.sdk.models.SsoIdpSettings
import onlyoffice.docspace.api.sdk.models.SsoSpCertificateAdvanced

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The SSO portal settings.
 *
 * @param lastModified The timestamp indicating when the settings were last modified.
 * @param enableSso Specifies if the SSO settings are enabled or not.
 * @param idpSettings 
 * @param idpCertificates The list of the IdP certificates.
 * @param idpCertificateAdvanced 
 * @param spLoginLabel The SP login label.
 * @param spCertificates The list of the SP certificates.
 * @param spCertificateAdvanced 
 * @param fieldMapping 
 * @param hideAuthPage Specifies if the authentication page will be hidden or not.
 * @param usersType The user type.
 * @param disableEmailVerification Specifies if the email verification is disabled or not.
 */


data class SsoSettingsV2 (

    /* The timestamp indicating when the settings were last modified. */
    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    /* Specifies if the SSO settings are enabled or not. */
    @Json(name = "enableSso")
    val enableSso: kotlin.Boolean? = null,

    @Json(name = "idpSettings")
    val idpSettings: SsoIdpSettings? = null,

    /* The list of the IdP certificates. */
    @Json(name = "idpCertificates")
    val idpCertificates: kotlin.collections.List<SsoCertificate>? = null,

    @Json(name = "idpCertificateAdvanced")
    val idpCertificateAdvanced: SsoIdpCertificateAdvanced? = null,

    /* The SP login label. */
    @Json(name = "spLoginLabel")
    val spLoginLabel: kotlin.String? = null,

    /* The list of the SP certificates. */
    @Json(name = "spCertificates")
    val spCertificates: kotlin.collections.List<SsoCertificate>? = null,

    @Json(name = "spCertificateAdvanced")
    val spCertificateAdvanced: SsoSpCertificateAdvanced? = null,

    @Json(name = "fieldMapping")
    val fieldMapping: SsoFieldMapping? = null,

    /* Specifies if the authentication page will be hidden or not. */
    @Json(name = "hideAuthPage")
    val hideAuthPage: kotlin.Boolean? = null,

    /* The user type. */
    @Json(name = "usersType")
    val usersType: kotlin.Int? = null,

    /* Specifies if the email verification is disabled or not. */
    @Json(name = "disableEmailVerification")
    val disableEmailVerification: kotlin.Boolean? = null

) {


}

