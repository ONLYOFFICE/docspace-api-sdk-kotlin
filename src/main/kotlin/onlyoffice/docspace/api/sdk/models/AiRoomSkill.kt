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
 * A skill of an Instructions room: the frontmatter of one Markdown skill file. `name` and `description` are what the model is shown; the body is read through `GET api/2.0/ai/context/get-room-skill`.
 *
 * @param id The skill's ID, as `GET api/2.0/ai/context/get-room-skill` takes it.
 * @param name The skill's name, from its frontmatter.
 * @param description What the skill is for, from its frontmatter; empty when it declares none.
 */


data class AiRoomSkill (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String

) {


}

