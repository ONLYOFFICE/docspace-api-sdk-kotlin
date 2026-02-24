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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The file upload result.
 *
 * @param success Specifies if the upload operation is successful or not.
 * @param `data` The file upload result data.
 * @param message The file upload result message.
 */


data class FileUploadResultDto (

    /* Specifies if the upload operation is successful or not. */
    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    /* The file upload result data. */
    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    /* The file upload result message. */
    @Json(name = "message")
    val message: kotlin.String? = null

) {


}

