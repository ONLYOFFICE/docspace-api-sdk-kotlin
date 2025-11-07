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

import onlyoffice.docspace.api.sdk.models.DistributedTaskStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The task progress response parameters.
 *
 * @param id The task progress ID.
 * @param percentage The percentage of the task progress.
 * @param isCompleted Specifies if the task peogress is completed or not.
 * @param status 
 * @param error The task progress error message.
 */


data class TaskProgressResponseDto (

    /* The task progress ID. */
    @Json(name = "id")
    val id: kotlin.String?,

    /* The percentage of the task progress. */
    @Json(name = "percentage")
    val percentage: kotlin.Int,

    /* Specifies if the task peogress is completed or not. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean,

    @Json(name = "status")
    val status: DistributedTaskStatus,

    /* The task progress error message. */
    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

