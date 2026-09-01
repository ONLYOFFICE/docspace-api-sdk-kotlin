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
 * The request parameters for storing the encryption key pair of a user.
 *
 * @param id The identifier of the key pair.
 * @param publicKey The public key of the pair, used to encrypt the file keys.
 * @param privateKeyEnc The private key of the pair, encrypted with the user password.
 */


data class EncryptionKeyRequestDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "publicKey")
    val publicKey: kotlin.String? = null,

    @Json(name = "privateKeyEnc")
    val privateKeyEnc: kotlin.String? = null

) {


}

