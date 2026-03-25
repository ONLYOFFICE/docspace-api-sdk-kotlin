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
 * [0 - User, 1 - External link, 2 - Group, 3 - Invitation link, 4 - Primary external link]
 *
 * Values: User,ExternalLink,Group,InvitationLink,PrimaryExternalLink
 */

@JsonClass(generateAdapter = false)
enum class SubjectType(val value: kotlin.Int) {

    @Json(name = "0")
    User(0),

    @Json(name = "1")
    ExternalLink(1),

    @Json(name = "2")
    Group(2),

    @Json(name = "3")
    InvitationLink(3),

    @Json(name = "4")
    PrimaryExternalLink(4);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SubjectType) "$data" else null

        /**
         * Returns a valid [SubjectType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SubjectType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

