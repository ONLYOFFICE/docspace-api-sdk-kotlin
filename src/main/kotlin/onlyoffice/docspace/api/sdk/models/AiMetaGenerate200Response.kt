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

import onlyoffice.docspace.api.sdk.models.AiMetaGenerate200ResponseFieldsInner
import onlyoffice.docspace.api.sdk.models.AiMetaGenerate200ResponseSkippedInner
import onlyoffice.docspace.api.sdk.models.AiMetaGenerate200ResponseSourcesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param fields The proposed custom metadata fields with the values the text supports.
 * @param sources The documents the proposal was read from.
 * @param skipped The entries that were left out, with the reason for each.
 */


data class AiMetaGenerate200Response (

    @Json(name = "fields")
    val fields: kotlin.collections.List<AiMetaGenerate200ResponseFieldsInner>,

    @Json(name = "sources")
    val sources: kotlin.collections.List<AiMetaGenerate200ResponseSourcesInner>,

    @Json(name = "skipped")
    val skipped: kotlin.collections.List<AiMetaGenerate200ResponseSkippedInner>

) {


}

