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
 * Whether the users are warned before the portals go down for the storage encryption pass.
 *
 * @param notifyUsers Whether every user of every portal on the server is mailed before the encryption or decryption pass starts.  The pass runs either way; the flag only decides whether people are told that their portal is about to become  unavailable.
 */


data class StorageEncryptionRequestsDto (

    @Json(name = "notifyUsers")
    val notifyUsers: kotlin.Boolean? = null

) {


}

