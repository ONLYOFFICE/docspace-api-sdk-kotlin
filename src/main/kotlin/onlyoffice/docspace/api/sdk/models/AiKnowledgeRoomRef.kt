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
 * One Knowledge room a round searches: the account and room ID from `GET api/2.0/ai/context/get-knowledge-folders`.
 *
 * @param cloud The account the room belongs to; `docspace` for a room of this portal.
 * @param id The room ID; anything that is not a positive integer is ignored.
 */


data class AiKnowledgeRoomRef (

    @Json(name = "cloud")
    val cloud: kotlin.String,

    @Json(name = "id")
    val id: kotlin.String

) {


}

