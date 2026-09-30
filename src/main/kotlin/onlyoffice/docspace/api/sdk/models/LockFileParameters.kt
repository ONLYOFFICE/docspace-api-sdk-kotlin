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
 * The lock state a file is to be put into.
 *
 * @param lockFile The state to reach: `true` locks the file, which blocks editing, renaming and deleting for everybody but the  account that locked it and the room admins, and drops the others out of a running editing session; `false`  releases the lock.
 */


data class LockFileParameters (

    @Json(name = "lockFile")
    val lockFile: kotlin.Boolean? = null

) {


}

