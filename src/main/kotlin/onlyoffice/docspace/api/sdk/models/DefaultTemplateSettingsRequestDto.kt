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
 * Default templates settings request parameters.
 *
 * @param fileExtension File extension of a template to replace
 * @param selectedFile File id to replace template with (or null to use default template)
 */


data class DefaultTemplateSettingsRequestDto (

    /* File extension of a template to replace */
    @Json(name = "fileExtension")
    val fileExtension: kotlin.String?,

    /* File id to replace template with (or null to use default template) */
    @Json(name = "selectedFile")
    val selectedFile: kotlin.Int? = null

) {


}

