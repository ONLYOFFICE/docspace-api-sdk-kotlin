 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.Run

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The paragraph parameters.
 *
 * @param align The paragraph align.
 * @param runs The list of text runs from the paragraph.
 */


data class Paragraph (

    /* The paragraph align. */
    @Json(name = "align")
    val align: kotlin.Int? = null,

    /* The list of text runs from the paragraph. */
    @Json(name = "runs")
    val runs: kotlin.collections.List<Run>? = null

) {


}

