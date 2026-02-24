 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.EncryprtionStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The encryption settings.
 *
 * @param password The encryption password.
 * @param status 
 * @param notifyUsers Specifies if the users will be notified about the encryption operation or not.
 */


data class EncryptionSettings (

    /* The encryption password. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "status")
    val status: EncryprtionStatus? = null,

    /* Specifies if the users will be notified about the encryption operation or not. */
    @Json(name = "notifyUsers")
    val notifyUsers: kotlin.Boolean? = null

) {


}

