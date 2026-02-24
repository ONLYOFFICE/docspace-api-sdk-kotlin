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

    /* The room ID. */
    @Json(name = "roomId")
    val roomId: kotlin.Int? = null,

    /* The role name. */
    @Json(name = "roleName")
    val roleName: kotlin.String? = null,

    /* The role color. */
    @Json(name = "roleColor")
    val roleColor: kotlin.String? = null,

    /* The user ID. */
    @Json(name = "userId")
    val userId: java.util.UUID? = null,

    /* The role sequence. */
    @Json(name = "sequence")
    val sequence: kotlin.Int? = null,

    /* Specifies if the role was submitted or not. */
    @Json(name = "submitted")
    val submitted: kotlin.Boolean? = null,

    /* The date and time when the role was opened. */
    @Json(name = "openedAt")
    val openedAt: java.time.OffsetDateTime? = null,

    /* The date and time when the role was submitted. */
    @Json(name = "submissionDate")
    val submissionDate: java.time.OffsetDateTime? = null

) {


}

