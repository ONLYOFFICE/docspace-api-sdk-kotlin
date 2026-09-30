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
 * An anchor inside a document, as the editor writes it.
 *
 * @param `data` The anchor value produced by the editor, opaque to the portal: it names the comment, the mention or the  place the document is scrolled to.
 * @param type What the anchor points at, as the editor names it - a comment thread, for instance.
 */


data class ActionConfig (

    @Json(name = "data")
    val `data`: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null

) {


}

