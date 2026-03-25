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
 * [0 - Date and time, 1 - AZ, 2 - Size, 3 - Author, 4 - Type, 5 - New, 6 - Date and time creation, 7 - Room type, 8 - Tags, 9 - Room, 10 - Custom order, 11 - Last opened, 12 - Used space]
 *
 * Values: DateAndTime,AZ,Size,Author,Type,New,DateAndTimeCreation,RoomType,Tags,Room,CustomOrder,LastOpened,UsedSpace
 */

@JsonClass(generateAdapter = false)
enum class SortedByType(val value: kotlin.Int) {

    @Json(name = "0")
    DateAndTime(0),

    @Json(name = "1")
    AZ(1),

    @Json(name = "2")
    Size(2),

    @Json(name = "3")
    Author(3),

    @Json(name = "4")
    Type(4),

    @Json(name = "5")
    New(5),

    @Json(name = "6")
    DateAndTimeCreation(6),

    @Json(name = "7")
    RoomType(7),

    @Json(name = "8")
    Tags(8),

    @Json(name = "9")
    Room(9),

    @Json(name = "10")
    CustomOrder(10),

    @Json(name = "11")
    LastOpened(11),

    @Json(name = "12")
    UsedSpace(12);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SortedByType) "$data" else null

        /**
         * Returns a valid [SortedByType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SortedByType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

