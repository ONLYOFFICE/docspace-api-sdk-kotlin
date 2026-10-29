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

import onlyoffice.docspace.api.sdk.models.AiMetaGenerateRequestId

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param kind The entry's table. Only `file` for now: a folder or a room answers 400.
 * @param id 
 * @param prompt What to pay attention to; a hint for the model.
 * @param overwrite Also replace the fields that already carry a value. Default false.
 * @param dryRun Resolve the values but write nothing; the caller writes what the user confirms. Default true: a write needs an explicit false.
 */


data class AiMetaFillRequest (

    @Json(name = "kind")
    val kind: AiMetaFillRequest.Kind,

    @Json(name = "id")
    val id: AiMetaGenerateRequestId,

    @Json(name = "prompt")
    val prompt: kotlin.String? = null,

    @Json(name = "overwrite")
    val overwrite: kotlin.Boolean? = null,

    @Json(name = "dryRun")
    val dryRun: kotlin.Boolean? = null

) {

    /**
     * The entry's table. Only `file` for now: a folder or a room answers 400.
     *
     * Values: file
     */
    @JsonClass(generateAdapter = false)
    enum class Kind(val value: kotlin.String) {
        @Json(name = "file") file("file");
    }

}

