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
 * An encryption key pair as the portal reports it: the public half of some member's key, with the encrypted private  half filled in only when the pair belongs to the caller.
 *
 * @param id Names the pair inside its owner's key set. Pass it back to rotate the pair or to delete it; the all-zero value  belongs to a client that stores its keys without sending an identifier.
 * @param userId The member the pair belongs to. In the key set of a room or of a file this is how the caller tells its own  entries, the ones carrying a private half, from those of the other members.
 * @param date When this key material was written. Rotating the pair refreshes it, so it dates the material that is being  reported rather than the first appearance of the identifier.
 * @param publicKey The public half of the pair, the half a client encrypts file keys with. A pair whose public half is missing  is treated as no access and left out of a room's or a file's key set.
 * @param privateKeyEnc The private half, encrypted with its owner's password. It is filled in only when the pair belongs to the  calling user; on another member's entry it comes back empty, because the private half is not handed out.
 * @param cryptoEngineId The crypto engine this material was issued for, as a braced GUID. The engine is portal-wide, so the same value  comes back for every key of every member.
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

