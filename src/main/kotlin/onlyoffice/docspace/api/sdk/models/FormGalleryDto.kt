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
 * The form gallery parameters.
 *
 * @param path The form gallery path.
 * @param domain The form gallery domain.
 * @param ext The form gallery extension.
 * @param uploadPath The form gallery upload path.
 * @param uploadDomain The form gallery upload domain.
 * @param uploadExt The form gallery upload extension.
 * @param uploadDashboard The form gallery upload dashboard.
 */


data class FormGalleryDto (

    @Json(name = "path")
    val path: kotlin.String?,

    @Json(name = "domain")
    val domain: kotlin.String?,

    @Json(name = "ext")
    val ext: kotlin.String?,

    @Json(name = "uploadPath")
    val uploadPath: kotlin.String?,

    @Json(name = "uploadDomain")
    val uploadDomain: kotlin.String?,

    @Json(name = "uploadExt")
    val uploadExt: kotlin.String?,

    @Json(name = "uploadDashboard")
    val uploadDashboard: kotlin.String?

) {


}

