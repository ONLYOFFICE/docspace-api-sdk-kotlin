 /*
 * (c) Copyright Ascensio System SIA 2025
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
 * [0 - Active, 1 - Archive, 2 - Any, 3 - Recent by links, 4 - Template, 5 - Knowledge, 6 - Result storage, 7 - AiAgents]
 *
 * Values: Active,Archive,Any,RecentByLinks,Templates,Knowledge,ResultStorage,AiAgents
 */

@JsonClass(generateAdapter = false)
enum class SearchArea(val value: kotlin.Int) {

    @Json(name = 0)
    Active(0),

    @Json(name = 1)
    Archive(1),

    @Json(name = 2)
    Any(2),

    @Json(name = 3)
    RecentByLinks(3),

    @Json(name = 4)
    Templates(4),

    @Json(name = 5)
    Knowledge(5),

    @Json(name = 6)
    ResultStorage(6),

    @Json(name = 7)
    AiAgents(7);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

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
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

