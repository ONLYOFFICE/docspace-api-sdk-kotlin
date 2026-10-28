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
 * The file upload result.
 *
 * @param success Whether the upload succeeded. This is the field to check: the operation answers 200 even when it fails, and  reports the reason in `message` instead of in the status code.
 * @param `data` 
 * @param message The reason the upload failed, ready to be shown to a person. It is empty for a successful upload, and it is  the only place where a failure is described, because the status code stays 200.
 */


data class FileUploadResultDto (

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    @Json(name = "message")
    val message: kotlin.String? = null

) {


}

