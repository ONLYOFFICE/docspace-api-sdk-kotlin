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
 * The encryption key pair of a user.
 *
 * @param id The identifier of the key pair.
 * @param userId The identifier of the user the key pair belongs to.
 * @param date The date and time when the key pair was created.
 * @param publicKey The public key of the pair, used to encrypt the file keys.
 * @param privateKeyEnc The private key of the pair, encrypted with the user password.
 * @param cryptoEngineId The identifier of the crypto engine the key pair was issued for.
 */


data class EncryptionKeyDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "date")
    val date: java.time.OffsetDateTime? = null,

    @Json(name = "publicKey")
    val publicKey: kotlin.String? = null,

    @Json(name = "privateKeyEnc")
    val privateKeyEnc: kotlin.String? = null,

    @Json(name = "cryptoEngineId")
    val cryptoEngineId: kotlin.String? = null

) {


}

