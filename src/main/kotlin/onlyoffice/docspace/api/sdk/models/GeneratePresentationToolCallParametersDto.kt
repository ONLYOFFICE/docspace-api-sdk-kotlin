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
 * The generate presentation tool call parameters.
 *
 * @param topic What the generated presentation is about.
 * @param slideCount How many slides to generate, as the request spelled it.
 * @param style The visual style the slides should be generated in.
 */


data class GeneratePresentationToolCallParametersDto (

    @Json(name = "topic")
    val topic: kotlin.String? = null,

    @Json(name = "slideCount")
    val slideCount: kotlin.String? = null,

    @Json(name = "style")
    val style: kotlin.String? = null

) {


}

