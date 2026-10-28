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
 * [0 - None, 1 - Read and write, 2 - Read, 3 - Restrict, 4 - Varies, 5 - Review, 6 - Comment, 7 - Fill forms, 8 - Custom filter, 9 - Room manager, 10 - Editing, 11 - Content creator]
 *
 * Values: None,ReadWrite,Read,Restrict,Varies,Review,Comment,FillForms,CustomFilter,RoomManager,Editing,ContentCreator
 */

@JsonClass(generateAdapter = false)
enum class AiFileShare(val value: kotlin.Int) {

    @Json(name = "0")
    None(0),

    @Json(name = "1")
    ReadWrite(1),

    @Json(name = "2")
    Read(2),

    @Json(name = "3")
    Restrict(3),

    @Json(name = "4")
    Varies(4),

    @Json(name = "5")
    Review(5),

    @Json(name = "6")
    Comment(6),

    @Json(name = "7")
    FillForms(7),

    @Json(name = "8")
    CustomFilter(8),

    @Json(name = "9")
    RoomManager(9),

    @Json(name = "10")
    Editing(10),

    @Json(name = "11")
    ContentCreator(11);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AiFileShare) "$data" else null

        /**
         * Returns a valid [AiFileShare] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AiFileShare? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

