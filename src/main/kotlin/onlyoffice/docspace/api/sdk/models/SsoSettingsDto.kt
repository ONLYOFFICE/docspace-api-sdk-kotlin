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

import onlyoffice.docspace.api.sdk.models.SsoCertificateDto
import onlyoffice.docspace.api.sdk.models.SsoFieldMappingDto
import onlyoffice.docspace.api.sdk.models.SsoIdpCertificateAdvancedDto
import onlyoffice.docspace.api.sdk.models.SsoIdpSettingsDto
import onlyoffice.docspace.api.sdk.models.SsoSpCertificateAdvancedDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The SAML single sign-on configuration of the portal.
 *
 * @param lastModified The timestamp indicating when the settings were last modified.
 * @param enableSso Specifies if the SSO settings are enabled or not.
 * @param idpSettings The SSO IdP settings.
 * @param idpCertificates The list of the IdP certificates.
 * @param idpCertificateAdvanced The IdP advanced certificate.
 * @param spLoginLabel The SP login label.
 * @param spCertificates The list of the SP certificates.
 * @param spCertificateAdvanced The SP advanced certificate.
 * @param fieldMapping The SSO field mapping.
 * @param hideAuthPage Specifies if the authentication page will be hidden or not.
 * @param usersType The user type.
 * @param disableEmailVerification Specifies if the email verification is disabled or not.
 */


data class SsoSettingsDto (

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null,

    @Json(name = "enableSso")
    val enableSso: kotlin.Boolean? = null,

    @Json(name = "idpSettings")
    val idpSettings: SsoIdpSettingsDto? = null,

    @Json(name = "idpCertificates")
    val idpCertificates: kotlin.collections.List<SsoCertificateDto>? = null,

    @Json(name = "idpCertificateAdvanced")
    val idpCertificateAdvanced: SsoIdpCertificateAdvancedDto? = null,

    @Json(name = "spLoginLabel")
    val spLoginLabel: kotlin.String? = null,

    @Json(name = "spCertificates")
    val spCertificates: kotlin.collections.List<SsoCertificateDto>? = null,

    @Json(name = "spCertificateAdvanced")
    val spCertificateAdvanced: SsoSpCertificateAdvancedDto? = null,

    @Json(name = "fieldMapping")
    val fieldMapping: SsoFieldMappingDto? = null,

    @Json(name = "hideAuthPage")
    val hideAuthPage: kotlin.Boolean? = null,

    @Json(name = "usersType")
    val usersType: kotlin.Int? = null,

    @Json(name = "disableEmailVerification")
    val disableEmailVerification: kotlin.Boolean? = null

) {


}

