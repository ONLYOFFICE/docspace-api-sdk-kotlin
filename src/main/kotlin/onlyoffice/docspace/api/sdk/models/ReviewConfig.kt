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
 * How tracked changes are displayed when the document opens.
 *
 * @param reviewDisplay How the editors render tracked changes at first: with the markup, in a simplified markup, as the final text,  or as the original text. A session that may not write opens on the final text.
 */


data class ReviewConfig (

    @Json(name = "reviewDisplay")
    val reviewDisplay: kotlin.String? = null

) {


}

