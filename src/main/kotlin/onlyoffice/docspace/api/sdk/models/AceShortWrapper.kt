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
 * The information about the settings which allow to share the document with other users.
 *
 * @param user The name of the user the document will be shared with.
 * @param permissions The access rights for the user with the name above.  Can be Full Access, Read Only, or Deny Access.
 * @param isLink Specifies whether to change the user icon to the link icon.
 */


data class AceShortWrapper (

    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: kotlin.String? = null,

    @Json(name = "isLink")
    val isLink: kotlin.Boolean? = null

) {


}

