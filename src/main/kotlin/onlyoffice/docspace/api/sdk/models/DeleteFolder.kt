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
 * How a folder is to be deleted.
 *
 * @param deleteAfter Whether the deletion waits for the editing sessions on the contents to end: with true a folder somebody is  working in is removed once they are done, with false the deletion starts at once.
 * @param immediately Whether the folder is discarded for good instead of being moved to the Trash section: with false it can be  restored from Trash, with true it cannot be recovered. Inside a room there is no Trash and the deletion is  final either way.
 */


data class DeleteFolder (

    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null,

    @Json(name = "immediately")
    val immediately: kotlin.Boolean? = null

) {


}

