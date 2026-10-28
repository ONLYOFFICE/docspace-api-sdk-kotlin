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
 * [All - All, RoomAdmin - Room admin, Guest - Guest, DocSpaceAdmin - DocSpace admin, User - User]
 *
 * Values: All,RoomAdmin,Guest,DocSpaceAdmin,User
 */

@JsonClass(generateAdapter = false)
enum class EmployeeType(val value: kotlin.String) {

    @Json(name = "All")
    All("All"),

    @Json(name = "RoomAdmin")
    RoomAdmin("RoomAdmin"),

    @Json(name = "Guest")
    Guest("Guest"),

    @Json(name = "DocSpaceAdmin")
    DocSpaceAdmin("DocSpaceAdmin"),

    @Json(name = "User")
    User("User");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EmployeeType) "$data" else null

        /**
         * Returns a valid [EmployeeType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EmployeeType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

