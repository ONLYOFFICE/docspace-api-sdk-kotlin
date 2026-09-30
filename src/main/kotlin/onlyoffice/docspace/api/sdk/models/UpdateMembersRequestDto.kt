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
 * The request parameters for updating the user information.
 *
 * @param userIds The accounts the operation applies to. System accounts are dropped from the list without an error, and the  remaining ones are processed in the order they are given.
 * @param resendAll Reaches every pending account of the portal instead of the ones in `userIds`. It is read only by  `PUT api/2.0/people/invite` and is ignored by every other operation that binds this body.
 */


data class UpdateMembersRequestDto (

    @Json(name = "userIds")
    val userIds: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "resendAll")
    val resendAll: kotlin.Boolean? = null

) {


}

