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
 * Which of the ONLYOFFICE help and community entries the interface may offer, installation-wide.
 *
 * @param startDocsEnabled Whether the sample documents that ONLYOFFICE ships may be placed in a new user's Documents. Unlike the link  flags below it depends on nothing that has to be configured, so its built-in value is always `true`.
 * @param helpCenterEnabled Whether the interface may offer the Help Center entry. It is `false` both when the entry was switched off  for the installation and when the installation configures no Help Center address at all; the addresses  themselves are not part of this answer and arrive in `externalResources` of `GET api/2.0/settings`.
 * @param feedbackAndSupportEnabled Whether the interface may offer the Feedback and Support entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param userForumEnabled Whether the interface may offer the user forum entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param videoGuidesEnabled Whether the interface may offer the Video Guides entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param licenseAgreementsEnabled Whether the interface may offer the License Agreements entry, `false` for the same two reasons as  `helpCenterEnabled`.
 * @param isDefault Whether all six flags still hold the values the installation starts out with. It turns `false` as soon as  one of them is saved differently and `true` again after `DELETE api/2.0/settings/rebranding/additional`.  Because a link flag starts out off when no address is configured for it, `true` does not mean every entry  is on.
 */


data class AdditionalWhiteLabelSettingsDto (

    @Json(name = "startDocsEnabled")
    val startDocsEnabled: kotlin.Boolean,

    @Json(name = "helpCenterEnabled")
    val helpCenterEnabled: kotlin.Boolean,

    @Json(name = "feedbackAndSupportEnabled")
    val feedbackAndSupportEnabled: kotlin.Boolean,

    @Json(name = "userForumEnabled")
    val userForumEnabled: kotlin.Boolean,

    @Json(name = "videoGuidesEnabled")
    val videoGuidesEnabled: kotlin.Boolean,

    @Json(name = "licenseAgreementsEnabled")
    val licenseAgreementsEnabled: kotlin.Boolean,

    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean

) {


}

