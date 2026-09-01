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
 * The progress parameters of creating a room from the template.
 *
 * @param roomId The room ID.
 * @param progress The progress of creating a room from the template.
 * @param error The error message that is sent when a room is not created successfully from the template.
 * @param isCompleted Specifies whether the process of creating a room from the template is completed.
 */


data class RoomFromTemplateStatusDto (

    @Json(name = "roomId")
    val roomId: kotlin.Int,

    @Json(name = "progress")
    val progress: kotlin.Double,

    @Json(name = "error")
    val error: kotlin.String?,

    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean

) {


}

