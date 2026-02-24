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
 * [0 - Default, 1 - Coomon, 2 - Bunch, 3 - Trash, 5 - User, 6 - Share, 8 - Projects, 10 - Favourites, 11 - Recent, 12 - Templates, 13 - Privacy, 14 - Virtual rooms, 15 - Filling forms room, 16 - Editing room, 19 - Custom room, 20 - Archive, 21 - Thirdparty backup, 22 - Public room, 25 - Ready form folder, 26 - In process form folder, 27 - Form filling folder done, 28 - Form filling folder in progress, 29 - Virtual Data Room, 30 - Room templates folder, 31 - AI Room, 32 - Knowledge, 33 - Result storage, 34 - AI Agents, 35 - Default Templates]
 *
 * Values: DEFAULT,COMMON,BUNCH,TRASH,USER,SHARE,Projects,Favorites,Recent,Templates,Privacy,VirtualRooms,FillingFormsRoom,EditingRoom,CustomRoom,Archive,ThirdpartyBackup,PublicRoom,ReadyFormFolder,InProcessFormFolder,FormFillingFolderDone,FormFillingFolderInProgress,VirtualDataRoom,RoomTemplates,AiRoom,Knowledge,ResultStorage,AiAgents,DefaultTemplates
 */

@JsonClass(generateAdapter = false)
enum class FolderType(val value: kotlin.Int) {

    @Json(name = "0")
    DEFAULT(0),

    @Json(name = "1")
    COMMON(1),

    @Json(name = "2")
    BUNCH(2),

    @Json(name = "3")
    TRASH(3),

    @Json(name = "5")
    USER(5),

    @Json(name = "6")
    SHARE(6),

    @Json(name = "8")
    Projects(8),

    @Json(name = "10")
    Favorites(10),

    @Json(name = "11")
    Recent(11),

    @Json(name = "12")
    Templates(12),

    @Json(name = "13")
    Privacy(13),

    @Json(name = "14")
    VirtualRooms(14),

    @Json(name = "15")
    FillingFormsRoom(15),

    @Json(name = "16")
    EditingRoom(16),

    @Json(name = "19")
    CustomRoom(19),

    @Json(name = "20")
    Archive(20),

    @Json(name = "21")
    ThirdpartyBackup(21),

    @Json(name = "22")
    PublicRoom(22),

    @Json(name = "25")
    ReadyFormFolder(25),

    @Json(name = "26")
    InProcessFormFolder(26),

    @Json(name = "27")
    FormFillingFolderDone(27),

    @Json(name = "28")
    FormFillingFolderInProgress(28),

    @Json(name = "29")
    VirtualDataRoom(29),

    @Json(name = "30")
    RoomTemplates(30),

    @Json(name = "31")
    AiRoom(31),

    @Json(name = "32")
    Knowledge(32),

    @Json(name = "33")
    ResultStorage(33),

    @Json(name = "34")
    AiAgents(34),

    @Json(name = "35")
    DefaultTemplates(35);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FolderType) "$data" else null

        /**
         * Returns a valid [FolderType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FolderType? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

