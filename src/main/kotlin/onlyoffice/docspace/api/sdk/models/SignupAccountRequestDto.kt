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

import onlyoffice.docspace.api.sdk.models.EmployeeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for creating a third-party account.
 *
 * @param key The user link key.
 * @param serializedProfile The third-party profile in the serialized format
 * @param employeeType 
 * @param culture The user culture code.
 */


data class SignupAccountRequestDto (

    /* The user link key. */
    @Json(name = "key")
    val key: kotlin.String?,

    /* The third-party profile in the serialized format */
    @Json(name = "serializedProfile")
    val serializedProfile: kotlin.String?,

    @Json(name = "employeeType")
    val employeeType: EmployeeType? = null,

    /* The user culture code. */
    @Json(name = "culture")
    val culture: kotlin.String? = null

) {


}

