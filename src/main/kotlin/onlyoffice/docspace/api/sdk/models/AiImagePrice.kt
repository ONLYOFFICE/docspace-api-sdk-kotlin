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
 * The price of an image model: per prompt token and per generated image.
 *
 * @param prompt The price of a single prompt token.
 * @param completion The cost associated with the completion of a prompt in an AI model.
 * @param image The price of a single generated image.
 */


data class AiImagePrice (

    @Json(name = "prompt")
    val prompt: kotlin.Double? = null,

    @Json(name = "completion")
    val completion: kotlin.Double? = null,

    @Json(name = "image")
    val image: kotlin.Double? = null

) {


}

