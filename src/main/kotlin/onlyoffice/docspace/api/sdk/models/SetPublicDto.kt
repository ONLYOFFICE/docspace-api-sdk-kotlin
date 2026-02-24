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
 * The public settings of the room template to set.
 *
 * @param id The room template ID.
 * @param `public` Specifies whether the room template is public or not.
 */


data class SetPublicDto (

    /* The room template ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* Specifies whether the room template is public or not. */
    @Json(name = "public")
    val `public`: kotlin.Boolean? = null

) {


}

