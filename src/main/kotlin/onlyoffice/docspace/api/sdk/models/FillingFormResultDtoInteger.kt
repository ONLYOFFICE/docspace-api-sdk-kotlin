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

import onlyoffice.docspace.api.sdk.models.EmployeeFullDto
import onlyoffice.docspace.api.sdk.models.FileDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters of the form filling result.
 *
 * @param formNumber The filling form number.
 * @param roomId The room ID where filling the form.
 * @param completedForm The file parameters.
 * @param originalForm The file parameters.
 * @param manager The full list of user parameters.
 * @param isRoomMember Specifies if the manager who fills the form is a room member or not.
 */


data class FillingFormResultDtoInteger (

    @Json(name = "formNumber")
    val formNumber: kotlin.Int,

    @Json(name = "roomId")
    val roomId: kotlin.Int,

    @Json(name = "completedForm")
    val completedForm: FileDtoInteger? = null,

    @Json(name = "originalForm")
    val originalForm: FileDtoInteger? = null,

    @Json(name = "manager")
    val manager: EmployeeFullDto? = null,

    @Json(name = "isRoomMember")
    val isRoomMember: kotlin.Boolean? = null

) {


}

