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
 * The picture and the colour a room is drawn with while it has no logo.
 *
 * @param color The background colour the room is drawn with while it has no logo, as six hexadecimal digits with no leading  number sign. An empty value restores the default colour of the room type.
 * @param cover The picture drawn on the room while it has no logo, named by an identifier from  `GET api/2.0/files/rooms/covers`. Any other value is rejected, and an empty value leaves the room without a  cover.
 */


data class CoverRequestDto (

    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "cover")
    val cover: kotlin.String? = null

) {


}

