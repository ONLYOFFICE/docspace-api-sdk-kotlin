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
 * [0 - User or group, 1 - Invitation link, 2 - External link, 4 - Additional external link, 8 - Primary external link, 16 - User, 32 - Group]
 *
 * Values: UserOrGroup,InvitationLink,ExternalLink,AdditionalExternalLink,PrimaryExternalLink,Link,User,Group
 */

@JsonClass(generateAdapter = false)
enum class ShareFilterType(val value: kotlin.Int) {

    @Json(name = "0")
    UserOrGroup(0),

    @Json(name = "1")
    InvitationLink(1),

    @Json(name = "2")
    ExternalLink(2),

    @Json(name = "4")
    AdditionalExternalLink(4),

    @Json(name = "8")
    PrimaryExternalLink(8),

    @Json(name = "15")
    Link(15),

    @Json(name = "16")
    User(16),

    @Json(name = "32")
    Group(32);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ShareFilterType) "$data" else null

        /**
         * Returns a valid [ShareFilterType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ShareFilterType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

