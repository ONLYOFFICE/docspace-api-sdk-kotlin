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

import onlyoffice.docspace.api.sdk.models.FileReferenceData
import onlyoffice.docspace.api.sdk.models.InfoConfigDto
import onlyoffice.docspace.api.sdk.models.Options
import onlyoffice.docspace.api.sdk.models.PermissionsConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The document config parameters.
 *
 * @param fileType The file type of the document.
 * @param info 
 * @param isLinkedForMe Specifies if the documnet is linked for current user.
 * @param key The document key.
 * @param permissions 
 * @param sharedLinkParam The shared link parameter of the document.
 * @param sharedLinkKey The shared link key of the document.
 * @param referenceData 
 * @param title The document title.
 * @param url The document url.
 * @param isForm Indicates whether this is a form.
 * @param options 
 */


data class DocumentConfigDto (

    /* The file type of the document. */
    @Json(name = "fileType")
    val fileType: kotlin.String? = null,

    @Json(name = "info")
    val info: InfoConfigDto? = null,

    /* Specifies if the documnet is linked for current user. */
    @Json(name = "isLinkedForMe")
    val isLinkedForMe: kotlin.Boolean? = null,

    /* The document key. */
    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: PermissionsConfig? = null,

    /* The shared link parameter of the document. */
    @Json(name = "sharedLinkParam")
    val sharedLinkParam: kotlin.String? = null,

    /* The shared link key of the document. */
    @Json(name = "sharedLinkKey")
    val sharedLinkKey: kotlin.String? = null,

    @Json(name = "referenceData")
    val referenceData: FileReferenceData? = null,

    /* The document title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The document url. */
    @Json(name = "url")
    val url: java.net.URI? = null,

    /* Indicates whether this is a form. */
    @Json(name = "isForm")
    val isForm: kotlin.Boolean? = null,

    @Json(name = "options")
    val options: Options? = null

) {


}

