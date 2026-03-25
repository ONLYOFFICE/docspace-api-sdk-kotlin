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
 * Represents dimensions with width and height values.
 *
 * @param height Gets or sets the height dimension of an object, typically measured in pixels or other unit.  It defines the vertical size of the object.
 * @param width Gets or sets the width dimension of an object, typically measured in pixels or other unit.
 */


data class Size (

    /* Gets or sets the height dimension of an object, typically measured in pixels or other unit.  It defines the vertical size of the object. */
    @Json(name = "height")
    val height: kotlin.Int? = null,

    /* Gets or sets the width dimension of an object, typically measured in pixels or other unit. */
    @Json(name = "width")
    val width: kotlin.Int? = null

) {


}

