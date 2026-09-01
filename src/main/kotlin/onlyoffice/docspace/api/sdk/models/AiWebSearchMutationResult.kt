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
import onlyoffice.docspace.api.sdk.models.AiWebSearchConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Outcome of `WebSearchEngine.configure` — either the persisted config or a field-scoped error suitable for the settings form.
 *
 * @param success True when the configuration was persisted.
 * @param config The persisted web-search configuration. Present on success.
 * @param error Why the configuration was rejected. Present on failure.
 */


data class AiWebSearchMutationResult (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "config")
    val config: AiWebSearchConfig? = null,

    @Json(name = "error")
    val error: AiTErrorData? = null

) {


}

