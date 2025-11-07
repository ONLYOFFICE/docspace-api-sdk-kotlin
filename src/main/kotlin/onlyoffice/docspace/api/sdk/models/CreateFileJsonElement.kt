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

import onlyoffice.docspace.api.sdk.models.CreateFileJsonElementTemplateId

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for creating a file.
 *
 * @param title The file title for creation.
 * @param templateId 
 * @param enableExternalExt Specifies whether to allow creating a file of an external extension or not.
 * @param formId The form ID for creation.
 */


data class CreateFileJsonElement (

    /* The file title for creation. */
    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "templateId")
    val templateId: CreateFileJsonElementTemplateId? = null,

    /* Specifies whether to allow creating a file of an external extension or not. */
    @Json(name = "enableExternalExt")
    val enableExternalExt: kotlin.Boolean? = null,

    /* The form ID for creation. */
    @Json(name = "formId")
    val formId: kotlin.Int? = null

) {


}

