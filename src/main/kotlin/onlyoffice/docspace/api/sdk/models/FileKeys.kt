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
 * 
 *
 * @param userId 
 * @param publicKeyId 
 * @param privateKeyEnc 
 * @param tenantId 
 * @param fileId 
 * @param createOn 
 */


data class FileKeys (

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "publicKeyId")
    val publicKeyId: java.util.UUID? = null,

    @Json(name = "privateKeyEnc")
    val privateKeyEnc: kotlin.String? = null,

    @Json(name = "tenantId")
    val tenantId: kotlin.Int? = null,

    @Json(name = "fileId")
    val fileId: kotlin.Int? = null,

    @Json(name = "createOn")
    val createOn: java.time.OffsetDateTime? = null

) {


}

