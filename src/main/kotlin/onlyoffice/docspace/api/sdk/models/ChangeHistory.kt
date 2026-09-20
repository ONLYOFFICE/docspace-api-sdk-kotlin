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
 * The change to make to a revision group of a file.
 *
 * @param version The version the change applies to; 0 means the current version of the file.
 * @param continueVersion What to do with the revision group: `false` completes the named version, storing its content again as a fresh  version that opens a new group, while `true` folds the last group back into the group before it, so the next  save continues that revision.
 */


data class ChangeHistory (

    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "continueVersion")
    val continueVersion: kotlin.Boolean? = null

) {


}

