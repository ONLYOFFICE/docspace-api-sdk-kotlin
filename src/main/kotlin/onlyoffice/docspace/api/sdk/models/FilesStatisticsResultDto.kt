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

import onlyoffice.docspace.api.sdk.models.FilesStatisticsFolder

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file statistics result parameters.
 *
 * @param myDocumentsUsedSpace The used space of files in the \\My Documents\\ section.
 * @param trashUsedSpace The used space of files in the \\Trash\\ section.
 * @param archiveUsedSpace The used space of files in the \\Archive\\ section.
 * @param roomsUsedSpace The used space of files in the \\Rooms\\ section.
 * @param aiAgentsUsedSpace The used space of files in the \\AI agents\\ section.
 * @param formsUsedSpace The used space of files in the \\Forms\\ section.
 */


data class FilesStatisticsResultDto (

    @Json(name = "myDocumentsUsedSpace")
    val myDocumentsUsedSpace: FilesStatisticsFolder? = null,

    @Json(name = "trashUsedSpace")
    val trashUsedSpace: FilesStatisticsFolder? = null,

    @Json(name = "archiveUsedSpace")
    val archiveUsedSpace: FilesStatisticsFolder? = null,

    @Json(name = "roomsUsedSpace")
    val roomsUsedSpace: FilesStatisticsFolder? = null,

    @Json(name = "aiAgentsUsedSpace")
    val aiAgentsUsedSpace: FilesStatisticsFolder? = null,

    @Json(name = "formsUsedSpace")
    val formsUsedSpace: FilesStatisticsFolder? = null

) {


}

