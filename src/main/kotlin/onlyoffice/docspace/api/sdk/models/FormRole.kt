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
 * The form role.
 *
 * @param roomId The room ID.
 * @param roleName The role name.
 * @param roleColor The role color.
 * @param userId The user ID.
 * @param sequence The role sequence.
 * @param submitted Specifies if the role was submitted or not.
 * @param openedAt The date and time when the role was opened.
 * @param submissionDate The date and time when the role was submitted.
 */


data class FormRole (

    @Json(name = "roomId")
    val roomId: kotlin.Int? = null,

    @Json(name = "roleName")
    val roleName: kotlin.String? = null,

    @Json(name = "roleColor")
    val roleColor: kotlin.String? = null,

    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    @Json(name = "sequence")
    val sequence: kotlin.Int? = null,

    @Json(name = "submitted")
    val submitted: kotlin.Boolean? = null,

    @Json(name = "openedAt")
    val openedAt: java.time.OffsetDateTime? = null,

    @Json(name = "submissionDate")
    val submissionDate: java.time.OffsetDateTime? = null

) {


}

