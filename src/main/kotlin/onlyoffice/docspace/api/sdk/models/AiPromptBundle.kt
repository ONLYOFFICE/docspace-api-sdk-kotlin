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

import onlyoffice.docspace.api.sdk.models.AiPrompt
import onlyoffice.docspace.api.sdk.models.AiPromptFolder

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Versioned, self-contained bundle of every saved prompt and folder. Stable wire format — `version` lets the import path migrate older shapes if the schema ever changes.
 *
 * @param version 
 * @param folders 
 * @param prompts 
 */


data class AiPromptBundle (

    @Json(name = "version")
    val version: AiPromptBundle.Version,

    @Json(name = "folders")
    val folders: kotlin.collections.List<AiPromptFolder>,

    @Json(name = "prompts")
    val prompts: kotlin.collections.List<AiPrompt>

) {

    /**
     * 
     *
     * Values: _1
     */
    @JsonClass(generateAdapter = false)
    enum class Version(val value: kotlin.String) {
        @Json(name = "1") _1("1");
    }

}

