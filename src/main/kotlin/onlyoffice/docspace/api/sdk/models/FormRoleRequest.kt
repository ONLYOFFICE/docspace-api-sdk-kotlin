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
 * One role of a form and the account that fills it.
 *
 * @param roomId The ID of the room the form is in. It is stored with the role as sent, so pass the room the form lives in.
 * @param roleName The name of a role the form defines, such as the one the form author gave a group of fields.
 * @param roleColor The color the editor marks the fields of this role with, as a hex code.
 * @param userId The account that fills this role. It is notified once filling starts, unless it is the caller.
 * @param sequence Accepted for compatibility and ignored: the position of the role in the list sets the filling order.
 * @param submitted Whether this role counts as already submitted. It is stored as sent; send false when filling starts.
 * @param openedAt Accepted for compatibility and ignored: the portal records when the role is opened.
 * @param submissionDate Accepted for compatibility and ignored: the portal records when the role is submitted.
 */


data class FormRoleRequest (

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

