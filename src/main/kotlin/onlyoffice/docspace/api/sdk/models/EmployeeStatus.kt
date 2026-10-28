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
 * [1 - Active, 2 - Terminated, 4 - Pending, 5 - Default, 7 - All]
 *
 * Values: Active,Terminated,Pending,Default,All
 */

@JsonClass(generateAdapter = false)
enum class EmployeeStatus(val value: kotlin.Int) {

    @Json(name = "1")
    Active(1),

    @Json(name = "2")
    Terminated(2),

    @Json(name = "4")
    Pending(4),

    @Json(name = "5")
    Default(5),

    @Json(name = "7")
    All(7);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EmployeeStatus) "$data" else null

        /**
         * Returns a valid [EmployeeStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EmployeeStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

