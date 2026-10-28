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
 * The progress of the job that creates a room out of a room template.
 *
 * @param roomId The room the job is creating. It is meaningful once the room exists, which is guaranteed only after  `isCompleted` turns true and `error` stays empty; until then it carries no usable id.
 * @param progress How far the job has got. The value climbs while the contents of the template are being copied into the new  room and reaches its maximum at the very end.
 * @param error Why the job stopped. It is empty while the job runs and after a successful one, and a filled value means that  no room was created, so the request has to be repeated rather than waited out.
 * @param isCompleted Whether the job has ended. It is set both after a successful creation and after a failure, so it is the flag  to poll for, while `error` is what separates the two outcomes.
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

