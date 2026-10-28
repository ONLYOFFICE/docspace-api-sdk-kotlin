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
 * The file key issued to one account.
 *
 * @param userId The account that is to open the file with this key; it has to have read access to the file.
 * @param publicKeyId The public key the file key was encrypted with, as reported for that account by  `GET api/2.0/files/file/{fileId}/publickeys`.
 * @param privateKeyEnc The key of the file itself, encrypted by the client with that public key, so that the plain key never reaches  the portal.
 */


data class AccessRequestKeyDto (

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "publicKeyId")
    val publicKeyId: java.util.UUID? = null,

    @Json(name = "privateKeyEnc")
    val privateKeyEnc: kotlin.String? = null

) {


}

