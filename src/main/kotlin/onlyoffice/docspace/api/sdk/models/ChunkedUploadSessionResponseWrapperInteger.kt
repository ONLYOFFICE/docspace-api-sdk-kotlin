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

import onlyoffice.docspace.api.sdk.models.ChunkedUploadSessionResponseInteger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a wrapper for the response of a chunked upload session operation.
 *
 * @param success Gets or sets a value indicating whether the operation was successful.
 * @param `data` 
 */


data class ChunkedUploadSessionResponseWrapperInteger (

    /* Gets or sets a value indicating whether the operation was successful. */
    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "data")
    val `data`: ChunkedUploadSessionResponseInteger? = null

) {


}

