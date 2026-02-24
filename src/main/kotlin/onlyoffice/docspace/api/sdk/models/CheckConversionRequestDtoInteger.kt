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
 * The parameters for checking file conversion.
 *
 * @param fileId The file ID to check conversion proccess.
 * @param sync Specifies if the conversion process is synchronous or not.
 * @param startConvert Specifies whether to start a conversion process or not.
 * @param version The file version that is converted.
 * @param password The password of the converted file.
 * @param outputType The conversion output type.
 * @param createNewIfExist Specifies whether to create a new file if it exists or not.
 */


data class CheckConversionRequestDtoInteger (

    /* The file ID to check conversion proccess. */
    @Json(name = "fileId")
    val fileId: kotlin.Int? = null,

    /* Specifies if the conversion process is synchronous or not. */
    @Json(name = "sync")
    val sync: kotlin.Boolean? = null,

    /* Specifies whether to start a conversion process or not. */
    @Json(name = "startConvert")
    val startConvert: kotlin.Boolean? = null,

    /* The file version that is converted. */
    @Json(name = "version")
    val version: kotlin.Int? = null,

    /* The password of the converted file. */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* The conversion output type. */
    @Json(name = "outputType")
    val outputType: kotlin.String? = null,

    /* Specifies whether to create a new file if it exists or not. */
    @Json(name = "createNewIfExist")
    val createNewIfExist: kotlin.Boolean? = null

) {


}

