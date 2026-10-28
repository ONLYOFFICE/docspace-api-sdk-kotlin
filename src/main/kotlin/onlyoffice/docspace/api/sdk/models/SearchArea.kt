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
 * [Active - Active, Archive - Archive, Any - Any, RecentByLinks - Recent by links, Templates - Template, Knowledge - Knowledge, ResultStorage - Result storage, AiAgents - AiAgents, Forms - Forms, FormTemplates - Form templates]
 *
 * Values: Active,Archive,Any,RecentByLinks,Templates,Knowledge,ResultStorage,AiAgents,Forms,FormTemplates
 */

@JsonClass(generateAdapter = false)
enum class SearchArea(val value: kotlin.String) {

    @Json(name = "Active")
    Active("Active"),

    @Json(name = "Archive")
    Archive("Archive"),

    @Json(name = "Any")
    Any("Any"),

    @Json(name = "RecentByLinks")
    RecentByLinks("RecentByLinks"),

    @Json(name = "Templates")
    Templates("Templates"),

    @Json(name = "Knowledge")
    Knowledge("Knowledge"),

    @Json(name = "ResultStorage")
    ResultStorage("ResultStorage"),

    @Json(name = "AiAgents")
    AiAgents("AiAgents"),

    @Json(name = "Forms")
    Forms("Forms"),

    @Json(name = "FormTemplates")
    FormTemplates("FormTemplates");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SearchArea) "$data" else null

        /**
         * Returns a valid [SearchArea] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SearchArea? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

