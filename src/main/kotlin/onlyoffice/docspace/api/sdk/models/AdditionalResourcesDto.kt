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
 * Which of the ONLYOFFICE help and community entries the interface may offer, installation-wide, in the shape the  reset of these flags returns.
 *
 * @param startDocsEnabled Whether the sample documents that ONLYOFFICE ships may be placed in a new user's Documents. Unlike the link  flags below it depends on nothing that has to be configured, so its built-in value is always `true`.
 * @param helpCenterEnabled Whether the interface may offer the Help Center entry. It is `false` both when the entry was switched off  for the installation and when the installation configures no Help Center address at all; the addresses  themselves are not part of this answer and arrive in `externalResources` of `GET api/2.0/settings`.
 * @param feedbackAndSupportEnabled Whether the interface may offer the Feedback and Support entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param userForumEnabled Whether the interface may offer the user forum entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param videoGuidesEnabled Whether the interface may offer the Video Guides entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param licenseAgreementsEnabled Whether the interface may offer the License Agreements entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param lastModified When these flags were last stored. Flags that were never stored report the moment they were read, and the  answer of the reset operation reports `0001-01-01T00:00:00`.
 */


data class AdditionalResourcesDto (

    @Json(name = "startDocsEnabled")
    val startDocsEnabled: kotlin.Boolean? = null,

    @Json(name = "helpCenterEnabled")
    val helpCenterEnabled: kotlin.Boolean? = null,

    @Json(name = "feedbackAndSupportEnabled")
    val feedbackAndSupportEnabled: kotlin.Boolean? = null,

    @Json(name = "userForumEnabled")
    val userForumEnabled: kotlin.Boolean? = null,

    @Json(name = "videoGuidesEnabled")
    val videoGuidesEnabled: kotlin.Boolean? = null,

    @Json(name = "licenseAgreementsEnabled")
    val licenseAgreementsEnabled: kotlin.Boolean? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

