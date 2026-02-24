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

import onlyoffice.docspace.api.sdk.models.CopyAsJsonElementDestFolderId

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The parameters for copying a file.
 *
 * @param destTitle The copied file name.
 * @param destFolderId 
 * @param enableExternalExt Specifies whether to allow creating the copied file of an external extension or not.
 * @param password The copied file password.
 * @param toForm Specifies whether to convert the file to form or not.
 */


data class CopyAsJsonElement (

    /* The copied file name. */
    @Json(name = "destTitle")
    val destTitle: kotlin.String?,

    @Json(name = "destFolderId")
    val destFolderId: CopyAsJsonElementDestFolderId,

    /* Specifies whether to allow creating the copied file of an external extension or not. */
    @Json(name = "enableExternalExt")
    val enableExternalExt: kotlin.Boolean? = null,

    /* The copied file password. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* Specifies whether to convert the file to form or not. */
    @Json(name = "toForm")
    val toForm: kotlin.Boolean? = null

) {


}

