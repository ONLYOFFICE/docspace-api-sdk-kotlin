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
 * Where the ready-made form templates are served from, for browsing them and for submitting new ones.
 *
 * @param path The path under `domain` that the gallery's own listing API is reached at. It is joined to `domain` by the  client; the portal only relays the values from its configuration.
 * @param domain The address of the gallery service, which is a service of the vendor rather than part of the portal. Every  field of this object is empty on an installation that configures no gallery, and a client should then not  offer the gallery at all.
 * @param ext The file extension to ask the gallery for, which decides which rendition of a template is downloaded when  several are published.
 * @param uploadPath The path used for submitting a form of one's own to the gallery, the counterpart of `path` for the upload  side. The four `upload` fields are empty when the installation allows browsing but not submitting.
 * @param uploadDomain The address the submission is sent to, which may differ from `domain`.
 * @param uploadExt The file extension a submitted form has to carry.
 * @param uploadDashboard The page a person is sent to in order to follow up on a submission, joined to `uploadDomain` the same way  as `uploadPath`.
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

