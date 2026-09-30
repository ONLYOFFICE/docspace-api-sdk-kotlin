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
 * The outcome of storing an image in temporary storage before it is used as a room logo.
 *
 * @param success True when the image was stored and its path is in the data field. A rejected image is reported with an error  response rather than with a false here, so this field is true in every answer that carries a body.
 * @param `data` 
 * @param message Left empty by this operation: nothing is reported here, and a refused image comes back as an error response  instead.
 */


data class UploadResultDto (

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    @Json(name = "message")
    val message: kotlin.String? = null

) {


}

