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
 * The actions that can be performed with the file entry.
 *
 * @param read 
 * @param comment 
 * @param fillForms 
 * @param review 
 * @param create 
 * @param createFrom 
 * @param edit 
 * @param delete 
 * @param customFilter 
 * @param editRoom 
 * @param rename 
 * @param readHistory 
 * @param lock 
 * @param editHistory 
 * @param copyTo 
 * @param copy 
 * @param moveTo 
 * @param move 
 * @param pin 
 * @param mute 
 * @param editAccess 
 * @param duplicate 
 * @param submitToFormGallery 
 * @param download 
 * @param convert 
 * @param copySharedLink 
 * @param readLinks 
 * @param reconnect 
 * @param createRoomFrom 
 * @param copyLink 
 * @param embed 
 * @param changeOwner 
 * @param indexExport 
 * @param startFilling 
 * @param fillingStatus 
 * @param resetFilling 
 * @param stopFilling 
 * @param openForm 
 * @param editInternal 
 * @param editExpiration 
 * @param vectorization 
 * @param askAi 
 * @param useChat 
 * @param updateXlsx 
 * @param analyzeResponses 
 * @param canUseAi 
 * @param historyExport 
 */


data class FileEntryDtoIntegerAllOfSecurity (

    @Json(name = "Read")
    val read: kotlin.Boolean? = null,

    @Json(name = "Comment")
    val comment: kotlin.Boolean? = null,

    @Json(name = "FillForms")
    val fillForms: kotlin.Boolean? = null,

    @Json(name = "Review")
    val review: kotlin.Boolean? = null,

    @Json(name = "Create")
    val create: kotlin.Boolean? = null,

    @Json(name = "CreateFrom")
    val createFrom: kotlin.Boolean? = null,

    @Json(name = "Edit")
    val edit: kotlin.Boolean? = null,

    @Json(name = "Delete")
    val delete: kotlin.Boolean? = null,

    @Json(name = "CustomFilter")
    val customFilter: kotlin.Boolean? = null,

    @Json(name = "EditRoom")
    val editRoom: kotlin.Boolean? = null,

    @Json(name = "Rename")
    val rename: kotlin.Boolean? = null,

    @Json(name = "ReadHistory")
    val readHistory: kotlin.Boolean? = null,

    @Json(name = "Lock")
    val lock: kotlin.Boolean? = null,

    @Json(name = "EditHistory")
    val editHistory: kotlin.Boolean? = null,

    @Json(name = "CopyTo")
    val copyTo: kotlin.Boolean? = null,

    @Json(name = "Copy")
    val copy: kotlin.Boolean? = null,

    @Json(name = "MoveTo")
    val moveTo: kotlin.Boolean? = null,

    @Json(name = "Move")
    val move: kotlin.Boolean? = null,

    @Json(name = "Pin")
    val pin: kotlin.Boolean? = null,

    @Json(name = "Mute")
    val mute: kotlin.Boolean? = null,

    @Json(name = "EditAccess")
    val editAccess: kotlin.Boolean? = null,

    @Json(name = "Duplicate")
    val duplicate: kotlin.Boolean? = null,

    @Json(name = "SubmitToFormGallery")
    val submitToFormGallery: kotlin.Boolean? = null,

    @Json(name = "Download")
    val download: kotlin.Boolean? = null,

    @Json(name = "Convert")
    val convert: kotlin.Boolean? = null,

    @Json(name = "CopySharedLink")
    val copySharedLink: kotlin.Boolean? = null,

    @Json(name = "ReadLinks")
    val readLinks: kotlin.Boolean? = null,

    @Json(name = "Reconnect")
    val reconnect: kotlin.Boolean? = null,

    @Json(name = "CreateRoomFrom")
    val createRoomFrom: kotlin.Boolean? = null,

    @Json(name = "CopyLink")
    val copyLink: kotlin.Boolean? = null,

    @Json(name = "Embed")
    val embed: kotlin.Boolean? = null,

    @Json(name = "ChangeOwner")
    val changeOwner: kotlin.Boolean? = null,

    @Json(name = "IndexExport")
    val indexExport: kotlin.Boolean? = null,

    @Json(name = "StartFilling")
    val startFilling: kotlin.Boolean? = null,

    @Json(name = "FillingStatus")
    val fillingStatus: kotlin.Boolean? = null,

    @Json(name = "ResetFilling")
    val resetFilling: kotlin.Boolean? = null,

    @Json(name = "StopFilling")
    val stopFilling: kotlin.Boolean? = null,

    @Json(name = "OpenForm")
    val openForm: kotlin.Boolean? = null,

    @Json(name = "EditInternal")
    val editInternal: kotlin.Boolean? = null,

    @Json(name = "EditExpiration")
    val editExpiration: kotlin.Boolean? = null,

    @Json(name = "Vectorization")
    val vectorization: kotlin.Boolean? = null,

    @Json(name = "AskAi")
    val askAi: kotlin.Boolean? = null,

    @Json(name = "UseChat")
    val useChat: kotlin.Boolean? = null,

    @Json(name = "UpdateXlsx")
    val updateXlsx: kotlin.Boolean? = null,

    @Json(name = "AnalyzeResponses")
    val analyzeResponses: kotlin.Boolean? = null,

    @Json(name = "CanUseAi")
    val canUseAi: kotlin.Boolean? = null,

    @Json(name = "HistoryExport")
    val historyExport: kotlin.Boolean? = null

) {


}

