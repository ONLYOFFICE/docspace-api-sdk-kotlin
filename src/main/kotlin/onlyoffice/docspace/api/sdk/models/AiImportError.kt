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

import onlyoffice.docspace.api.sdk.models.AiTErrorData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Per-entry error reported by `PromptsEngine.importBundle`.
 *
 * @param kind `folder` or `prompt`, plus the offending name or id.
 * @param ref The offending entry - its name or its id.
 * @param error Why the entry was rejected.
 */


data class AiImportError (

    @Json(name = "kind")
    val kind: AiImportError.Kind,

    @Json(name = "ref")
    val ref: kotlin.String,

    @Json(name = "error")
    val error: AiTErrorData

) {

    /**
     * `folder` or `prompt`, plus the offending name or id.
     *
     * Values: folder,prompt
     */
    @JsonClass(generateAdapter = false)
    enum class Kind(val value: kotlin.String) {
        @Json(name = "folder") folder("folder"),
        @Json(name = "prompt") prompt("prompt");
    }

}

