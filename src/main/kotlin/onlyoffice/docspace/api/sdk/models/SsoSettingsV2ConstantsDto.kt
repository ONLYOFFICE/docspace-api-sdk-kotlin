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

import onlyoffice.docspace.api.sdk.models.SsoBindingTypeDto
import onlyoffice.docspace.api.sdk.models.SsoEncryptAlgorithmTypeDto
import onlyoffice.docspace.api.sdk.models.SsoIdpCertificateActionTypeDto
import onlyoffice.docspace.api.sdk.models.SsoNameIdFormatTypeDto
import onlyoffice.docspace.api.sdk.models.SsoSigningAlgorithmTypeDto
import onlyoffice.docspace.api.sdk.models.SsoSpCertificateActionTypeDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The SSO settings constants: every value the settings accept, by name.
 *
 * @param ssoNameIdFormatType The values the `nameIdFormat` of the identity provider settings accepts. The built-in configuration uses  the SAML 2.0 transient format.
 * @param ssoBindingType The values the `ssoBinding` and `sloBinding` of the identity provider settings accept - how the portal  sends its sign-in and sign-out requests. The built-in configuration uses HTTP POST for both.
 * @param ssoSigningAlgorithmType The values the `signingAlgorithm` of the service provider certificate and the `verifyAlgorithm` of the  identity provider certificate accept. The built-in configuration uses RSA-SHA1 for both.
 * @param ssoEncryptAlgorithmType The values the `encryptAlgorithm` and `decryptAlgorithm` of the certificate settings accept. The built-in  configuration uses AES-128 everywhere.
 * @param ssoSpCertificateActionType The values the `action` of a service provider certificate accepts, which is what the portal's own key  pair may be used for.
 * @param ssoIdpCertificateActionType The values the `action` of an identity provider certificate accepts, which is what the provider's  certificate may be used for - the mirror image of the service provider actions.
 */


data class SsoSettingsV2ConstantsDto (

    @Json(name = "ssoNameIdFormatType")
    val ssoNameIdFormatType: SsoNameIdFormatTypeDto? = null,

    @Json(name = "ssoBindingType")
    val ssoBindingType: SsoBindingTypeDto? = null,

    @Json(name = "ssoSigningAlgorithmType")
    val ssoSigningAlgorithmType: SsoSigningAlgorithmTypeDto? = null,

    @Json(name = "ssoEncryptAlgorithmType")
    val ssoEncryptAlgorithmType: SsoEncryptAlgorithmTypeDto? = null,

    @Json(name = "ssoSpCertificateActionType")
    val ssoSpCertificateActionType: SsoSpCertificateActionTypeDto? = null,

    @Json(name = "ssoIdpCertificateActionType")
    val ssoIdpCertificateActionType: SsoIdpCertificateActionTypeDto? = null

) {


}

