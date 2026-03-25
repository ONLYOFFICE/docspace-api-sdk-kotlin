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
 * [0 - None, 1 - Create, 2 - Update, 3 - Delete, 4 - Link, 5 - Unlink, 6 - Attach, 7 - Detach, 8 - Send, 9 - Import, 10 - Export, 11 - Update access, 12 - Download, 13 - Upload, 14 - Copy, 15 - Move, 16 - Reassigns, 17 - Follow, 18 - Unfollow, 19 - Logout]
 *
 * Values: None,Create,Update,Delete,Link,Unlink,Attach,Detach,Send,Import,Export,UpdateAccess,Download,Upload,Copy,Move,Reassigns,Follow,Unfollow,Logout
 */

@JsonClass(generateAdapter = false)
enum class ActionType(val value: kotlin.Int) {

    @Json(name = "0")
    None(0),

    @Json(name = "1")
    Create(1),

    @Json(name = "2")
    Update(2),

    @Json(name = "3")
    Delete(3),

    @Json(name = "4")
    Link(4),

    @Json(name = "5")
    Unlink(5),

    @Json(name = "6")
    Attach(6),

    @Json(name = "7")
    Detach(7),

    @Json(name = "8")
    Send(8),

    @Json(name = "9")
    Import(9),

    @Json(name = "10")
    Export(10),

    @Json(name = "11")
    UpdateAccess(11),

    @Json(name = "12")
    Download(12),

    @Json(name = "13")
    Upload(13),

    @Json(name = "14")
    Copy(14),

    @Json(name = "15")
    Move(15),

    @Json(name = "16")
    Reassigns(16),

    @Json(name = "17")
    Follow(17),

    @Json(name = "18")
    Unfollow(18),

    @Json(name = "19")
    Logout(19);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ActionType) "$data" else null

        /**
         * Returns a valid [ActionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ActionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

