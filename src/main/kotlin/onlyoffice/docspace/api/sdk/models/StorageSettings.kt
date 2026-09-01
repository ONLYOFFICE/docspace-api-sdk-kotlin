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
 * The storage settings.
 *
 * @param module The storage name.
 * @param props The storage properties.
 * @param lastModified The date and time when the storage settings were last modified.
 */


data class StorageSettings (

    @Json(name = "module")
    val module: kotlin.String? = null,

    @Json(name = "props")
    val props: kotlin.collections.Map<kotlin.String, kotlin.String?>? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

