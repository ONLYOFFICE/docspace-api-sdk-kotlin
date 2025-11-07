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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The room template status.
 *
 * @param templateId The room template ID.
 * @param progress The progress of the room template creation process.
 * @param isCompleted Specifies whether the process of creating the room template is completed.
 * @param error The error message that is sent when the room template is not created successfully.
 */


data class RoomTemplateStatusDto (

    /* The room template ID. */
    @Json(name = "templateId")
    val templateId: kotlin.Int,

    /* The progress of the room template creation process. */
    @Json(name = "progress")
    val progress: kotlin.Double,

    /* Specifies whether the process of creating the room template is completed. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    /* The error message that is sent when the room template is not created successfully. */
    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

