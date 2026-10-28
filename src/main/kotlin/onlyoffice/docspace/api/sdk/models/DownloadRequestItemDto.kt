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

import onlyoffice.docspace.api.sdk.models.DownloadRequestItemDtoKey

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One file of a bulk download, together with the format it is converted to.
 *
 * @param key 
 * @param `value` The format the file is converted to before it is packed, as a file extension without a leading dot.
 * @param password The password that opens the source file, for a file protected with one; a protected file cannot be converted  without it.
 */


data class DownloadRequestItemDto (

    @Json(name = "key")
    val key: DownloadRequestItemDtoKey,

    @Json(name = "value")
    val `value`: kotlin.String?,

    @Json(name = "password")
    val password: kotlin.String? = null

) {


}

