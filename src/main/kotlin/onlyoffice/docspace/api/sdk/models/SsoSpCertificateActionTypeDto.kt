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
 * What the portal's own key pair may be used for, as the `action` of a service provider certificate.
 *
 * @param signing The key pair signs the requests the portal sends and nothing else.
 * @param encrypt The key pair encrypts what the portal sends and decrypts what comes back, but signs nothing.
 * @param signingAndEncrypt The key pair does both, which is what one pair configured on its own has to be set to.
 */


data class SsoSpCertificateActionTypeDto (

    @Json(name = "signing")
    val signing: kotlin.String? = null,

    @Json(name = "encrypt")
    val encrypt: kotlin.String? = null,

    @Json(name = "signingAndEncrypt")
    val signingAndEncrypt: kotlin.String? = null

) {


}

