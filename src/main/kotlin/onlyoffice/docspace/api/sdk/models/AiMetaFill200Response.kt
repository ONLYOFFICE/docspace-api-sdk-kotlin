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

import onlyoffice.docspace.api.sdk.models.AiEntryMetadata
import onlyoffice.docspace.api.sdk.models.AiMetaFill200ResponseFilledInner
import onlyoffice.docspace.api.sdk.models.AiMetaFill200ResponseSourcesInner
import onlyoffice.docspace.api.sdk.models.AiMetaFill200ResponseUnresolvedInner
import onlyoffice.docspace.api.sdk.models.AiMetaGenerate200ResponseSkippedInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dryRun Whether the values were only proposed (`true`) or written as well.
 * @param metadata The entry's metadata after the write (or as it stands, with `dryRun`), as `GET api/2.0/files/metadata/{kind}/{id}` returns it.
 * @param filled The values written, or proposed with `dryRun`: a typed value for a template field, a string for a custom field.
 * @param unresolved The fields left as they were, with the reason for each.
 * @param sources The documents the values were read from.
 * @param skipped The entries that were left out, with the reason for each.
 */


data class AiMetaFill200Response (

    @Json(name = "dryRun")
    val dryRun: kotlin.Boolean,

    @Json(name = "metadata")
    val metadata: AiEntryMetadata,

    @Json(name = "filled")
    val filled: kotlin.collections.List<AiMetaFill200ResponseFilledInner>,

    @Json(name = "unresolved")
    val unresolved: kotlin.collections.List<AiMetaFill200ResponseUnresolvedInner>,

    @Json(name = "sources")
    val sources: kotlin.collections.List<AiMetaFill200ResponseSourcesInner>,

    @Json(name = "skipped")
    val skipped: kotlin.collections.List<AiMetaGenerate200ResponseSkippedInner>

) {


}

