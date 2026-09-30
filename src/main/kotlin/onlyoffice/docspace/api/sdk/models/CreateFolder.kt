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
 * The title a folder is created with or renamed to.
 *
 * @param title The title the folder is given. It is trimmed before it is stored and may not be blank or consist of spaces  alone; it need not differ from the titles of the neighbouring folders, so the same title may appear twice in  one parent.
 */


data class CreateFolder (

    @Json(name = "title")
    val title: kotlin.String?

) {


}

