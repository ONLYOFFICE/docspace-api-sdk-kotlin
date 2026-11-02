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

import onlyoffice.docspace.api.sdk.models.LogoDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A room linked to an AI project as its source.
 *
 * @param id ID of the room.
 * @param title Room title.
 * @param logo Room logo.
 */


data class AiProjectSourceDto (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "logo")
    val logo: LogoDto? = null

) {


}

