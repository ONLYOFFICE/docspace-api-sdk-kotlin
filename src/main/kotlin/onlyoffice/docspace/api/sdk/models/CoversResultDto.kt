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
 * One drawing of the built-in gallery of room covers.
 *
 * @param id The name of the cover, and the value to send as `cover` when a room is created or changed. The names are the  same on every portal and do not change with the language of the request.
 * @param `data` The drawing itself, as inline vector markup ready to be rendered as it is. It is the default size of the  cover, and it may change between product versions while the name stays.
 */


data class CoversResultDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "data")
    val `data`: kotlin.String?

) {


}

