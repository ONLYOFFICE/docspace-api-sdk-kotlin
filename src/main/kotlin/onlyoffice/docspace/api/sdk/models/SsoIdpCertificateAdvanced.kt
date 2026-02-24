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
 * The IdP advanced certificate parameters.
 *
 * @param verifyAlgorithm The certificate verification algorithm.
 * @param verifyAuthResponsesSign Specifies if the signatures of the SAML authentication responses sent to SP will be verified or not.
 * @param verifyLogoutRequestsSign Specifies if the signatures of the SAML logout requests sent to SP will be verified or not.
 * @param verifyLogoutResponsesSign Specifies if the signatures of the SAML logout responses sent to SP will be verified or not.
 * @param decryptAlgorithm The certificate decryption algorithm.
 * @param decryptAssertions Specifies if the assertions will be decrypted or not.
 */


data class SsoIdpCertificateAdvanced (

    /* The certificate verification algorithm. */
    @Json(name = "verifyAlgorithm")
    val verifyAlgorithm: kotlin.String? = null,

    /* Specifies if the signatures of the SAML authentication responses sent to SP will be verified or not. */
    @Json(name = "verifyAuthResponsesSign")
    val verifyAuthResponsesSign: kotlin.Boolean? = null,

    /* Specifies if the signatures of the SAML logout requests sent to SP will be verified or not. */
    @Json(name = "verifyLogoutRequestsSign")
    val verifyLogoutRequestsSign: kotlin.Boolean? = null,

    /* Specifies if the signatures of the SAML logout responses sent to SP will be verified or not. */
    @Json(name = "verifyLogoutResponsesSign")
    val verifyLogoutResponsesSign: kotlin.Boolean? = null,

    /* The certificate decryption algorithm. */
    @Json(name = "decryptAlgorithm")
    val decryptAlgorithm: kotlin.String? = null,

    /* Specifies if the assertions will be decrypted or not. */
    @Json(name = "decryptAssertions")
    val decryptAssertions: kotlin.Boolean? = null

) {


}

