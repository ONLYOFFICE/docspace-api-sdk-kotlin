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

import onlyoffice.docspace.api.sdk.models.EncryptionStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The state of the portal's storage encryption.
 *
 * @param password Always an empty string: the encryption password is never returned.
 * @param status Whether the storage is encrypted, decrypted, or on its way to either.
 * @param notifyUsers Whether the users are notified when the operation starts and ends.
 */


data class EncryptionSettingsDto (

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "status")
    val status: EncryptionStatus? = null,

    @Json(name = "notifyUsers")
    val notifyUsers: kotlin.Boolean? = null

) {


}

