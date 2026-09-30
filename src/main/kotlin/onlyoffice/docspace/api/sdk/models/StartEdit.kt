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
 * The body of an editing session request.
 *
 * @param editingAlone Claims the file for this caller alone: the session is opened without asking the document service to track  co-editing, and the call is refused when anybody else already has the file open. Left off, an ordinary  co-editing session is opened and others may join it.
 */


data class StartEdit (

    @Json(name = "editingAlone")
    val editingAlone: kotlin.Boolean? = null

) {


}

