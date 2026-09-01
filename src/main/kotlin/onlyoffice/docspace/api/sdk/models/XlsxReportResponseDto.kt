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

import onlyoffice.docspace.api.sdk.models.DocumentBuilderTaskDto
import onlyoffice.docspace.api.sdk.models.FileDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The XLSX report task response parameters.
 *
 * @param form The original form file information.
 * @param task The Document Builder task information.
 * @param isNewFile Specifies whether the XLSX report file is newly created or an existing file will be updated.
 */


data class XlsxReportResponseDto (

    @Json(name = "form")
    val form: FileDtoInteger? = null,

    @Json(name = "task")
    val task: DocumentBuilderTaskDto? = null,

    @Json(name = "isNewFile")
    val isNewFile: kotlin.Boolean? = null

) {


}

