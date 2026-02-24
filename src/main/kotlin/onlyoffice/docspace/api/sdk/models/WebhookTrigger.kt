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
 * [0 - *, 1 - user.created, 2 - user.invited, 4 - user.updated, 8 - user.deleted, 16 - group.created, 32 - group.updated, 64 - group.deleted, 128 - file.created, 256 - file.uploaded, 512 - file.updated, 1024 - file.trashed, 2048 - file.deleted, 4096 - file.restored, 8192 - file.copied, 16384 - file.moved, 32768 - folder.created, 65536 - folder.updated, 131072 - folder.trashed, 262144 - folder.deleted, 524288 - folder.restored, 1048576 - folder.copied, 2097152 - folder.moved, 4194304 - room.created, 8388608 - room.updated, 16777216 - room.archived, 33554432 - room.deleted, 67108864 - room.restored, 134217728 - room.copied]
 *
 * Values: All,UserCreated,UserInvited,UserUpdated,UserDeleted,GroupCreated,GroupUpdated,GroupDeleted,FileCreated,FileUploaded,FileUpdated,FileTrashed,FileDeleted,FileRestored,FileCopied,FileMoved,FolderCreated,FolderUpdated,FolderTrashed,FolderDeleted,FolderRestored,FolderCopied,FolderMoved,RoomCreated,RoomUpdated,RoomArchived,RoomDeleted,RoomRestored,RoomCopied
 */

@JsonClass(generateAdapter = false)
enum class WebhookTrigger(val value: kotlin.Int) {

    @Json(name = "0")
    All(0),

    @Json(name = "1")
    UserCreated(1),

    @Json(name = "2")
    UserInvited(2),

    @Json(name = "4")
    UserUpdated(4),

    @Json(name = "8")
    UserDeleted(8),

    @Json(name = "16")
    GroupCreated(16),

    @Json(name = "32")
    GroupUpdated(32),

    @Json(name = "64")
    GroupDeleted(64),

    @Json(name = "128")
    FileCreated(128),

    @Json(name = "256")
    FileUploaded(256),

    @Json(name = "512")
    FileUpdated(512),

    @Json(name = "1024")
    FileTrashed(1024),

    @Json(name = "2048")
    FileDeleted(2048),

    @Json(name = "4096")
    FileRestored(4096),

    @Json(name = "8192")
    FileCopied(8192),

    @Json(name = "16384")
    FileMoved(16384),

    @Json(name = "32768")
    FolderCreated(32768),

    @Json(name = "65536")
    FolderUpdated(65536),

    @Json(name = "131072")
    FolderTrashed(131072),

    @Json(name = "262144")
    FolderDeleted(262144),

    @Json(name = "524288")
    FolderRestored(524288),

    @Json(name = "1048576")
    FolderCopied(1048576),

    @Json(name = "2097152")
    FolderMoved(2097152),

    @Json(name = "4194304")
    RoomCreated(4194304),

    @Json(name = "8388608")
    RoomUpdated(8388608),

    @Json(name = "16777216")
    RoomArchived(16777216),

    @Json(name = "33554432")
    RoomDeleted(33554432),

    @Json(name = "67108864")
    RoomRestored(67108864),

    @Json(name = "134217728")
    RoomCopied(134217728);

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WebhookTrigger) "$data" else null

        /**
         * Returns a valid [WebhookTrigger] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WebhookTrigger? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

