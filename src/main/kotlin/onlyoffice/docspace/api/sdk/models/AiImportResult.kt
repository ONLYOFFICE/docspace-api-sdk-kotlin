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

import onlyoffice.docspace.api.sdk.models.AiImportError
import onlyoffice.docspace.api.sdk.models.AiImportResultImported

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Outcome of `PromptsEngine.importBundle`. Either every entry persisted with counts, or no entries persisted plus a per-entry error report.
 *
 * @param success True when the whole bundle was imported.
 * @param imported 
 * @param errors What was rejected, per entry. Present on failure - and then nothing was imported.
 */


data class AiImportResult (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "imported")
    val imported: AiImportResultImported? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<AiImportError>? = null

) {


}

