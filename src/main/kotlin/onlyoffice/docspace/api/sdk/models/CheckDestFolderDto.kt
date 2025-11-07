 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.CheckDestFolderResult
import onlyoffice.docspace.api.sdk.models.FileEntryBaseDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The result of checking whether files can be moved or copied to the specified folder.
 *
 * @param result 
 * @param files The list of files in the destination folder.
 */


data class CheckDestFolderDto (

    @Json(name = "result")
    val result: CheckDestFolderResult? = null,

    /* The list of files in the destination folder. */
    @Json(name = "files")
    val files: kotlin.collections.List<FileEntryBaseDto>? = null

) {


}

