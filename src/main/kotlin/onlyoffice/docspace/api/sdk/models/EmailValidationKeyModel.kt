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

import onlyoffice.docspace.api.sdk.models.ConfirmType
import onlyoffice.docspace.api.sdk.models.EmployeeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The confirmation email parameters.
 *
 * @param key The email validation key.
 * @param emplType 
 * @param email The email address.
 * @param encEmail The encrypted email address.
 * @param uiD The user ID.
 * @param type 
 * @param first Specifies whether it is the first time account access or not.
 * @param roomId The room ID.
 */


data class EmailValidationKeyModel (

    /* The email validation key. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "emplType")
    val emplType: EmployeeType? = null,

    /* The email address. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The encrypted email address. */
    @Json(name = "encEmail")
    val encEmail: kotlin.String? = null,

    /* The user ID. */
    @Json(name = "uiD")
    val uiD: java.util.UUID? = null,

    @Json(name = "type")
    val type: ConfirmType? = null,

    /* Specifies whether it is the first time account access or not. */
    @Json(name = "first")
    val first: kotlin.String? = null,

    /* The room ID. */
    @Json(name = "roomId")
    val roomId: kotlin.String? = null

) {


}

