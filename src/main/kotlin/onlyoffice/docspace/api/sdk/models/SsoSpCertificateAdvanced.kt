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
 * The SP advanced certificate parameters.
 *
 * @param signingAlgorithm The certificate signing algorithm.
 * @param signAuthRequests Specifies if SP will sign the SAML authentication requests sent to IdP or not.
 * @param signLogoutRequests Specifies if SP will sign the SAML logout requests sent to IdP or not.
 * @param signLogoutResponses Specifies if SP will sign the SAML logout responses sent to IdP or not.
 * @param encryptAlgorithm The certificate encryption algorithm.
 * @param decryptAlgorithm The certificate decryption algorithm.
 * @param encryptAssertions Specifies if the assertions will be encrypted or not.
 */


data class SsoSpCertificateAdvanced (

    @Json(name = "signingAlgorithm")
    val signingAlgorithm: kotlin.String? = null,

    @Json(name = "signAuthRequests")
    val signAuthRequests: kotlin.Boolean? = null,

    @Json(name = "signLogoutRequests")
    val signLogoutRequests: kotlin.Boolean? = null,

    @Json(name = "signLogoutResponses")
    val signLogoutResponses: kotlin.Boolean? = null,

    @Json(name = "encryptAlgorithm")
    val encryptAlgorithm: kotlin.String? = null,

    @Json(name = "decryptAlgorithm")
    val decryptAlgorithm: kotlin.String? = null,

    @Json(name = "encryptAssertions")
    val encryptAssertions: kotlin.Boolean? = null

) {


}

