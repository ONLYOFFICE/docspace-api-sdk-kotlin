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

import onlyoffice.docspace.api.sdk.models.EngineType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Parameters for configuring web search settings.
 *
 * @param enabled Indicates whether web search is enabled for AI chat sessions.
 * @param type 
 * @param key The API key for the selected web search engine. Pass null to keep the existing key unchanged.
 */


data class SetWebSearchSettingsRequestBody (

    /* Indicates whether web search is enabled for AI chat sessions. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "type")
    val type: EngineType? = null,

    /* The API key for the selected web search engine. Pass null to keep the existing key unchanged. */
    @Json(name = "key")
    val key: kotlin.String? = null

) {


}

