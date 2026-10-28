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
 * What the identity provider's certificate may be used for, as the `action` of an identity provider certificate.
 *
 * @param verification The certificate verifies the signatures on what the provider sends, and nothing else - the counterpart of  the service provider's signing action.
 * @param decrypt The certificate is used to decrypt what the provider sends, but verifies no signature.
 * @param verificationAndDecrypt The certificate does both, which is what a single provider certificate has to be set to.
 */


data class SsoIdpCertificateActionTypeDto (

    @Json(name = "verification")
    val verification: kotlin.String? = null,

    @Json(name = "decrypt")
    val decrypt: kotlin.String? = null,

    @Json(name = "verificationAndDecrypt")
    val verificationAndDecrypt: kotlin.String? = null

) {


}

