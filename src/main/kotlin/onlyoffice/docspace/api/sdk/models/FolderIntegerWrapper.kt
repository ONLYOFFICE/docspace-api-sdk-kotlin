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

import onlyoffice.docspace.api.sdk.models.ActiveConnectionsWrapperLinksInner
import onlyoffice.docspace.api.sdk.models.FolderDtoInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param response 
 * @param count 
 * @param links 
 * @param status 
 * @param statusCode 
 */


data class FolderIntegerWrapper (

    @Json(name = "response")
    val response: FolderDtoInteger? = null,

    @Json(name = "count")
    val count: kotlin.Int? = null,

    @Json(name = "links")
    val links: kotlin.collections.List<ActiveConnectionsWrapperLinksInner>? = null,

    @Json(name = "status")
    val status: kotlin.Int? = null,

    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null

) {


}

