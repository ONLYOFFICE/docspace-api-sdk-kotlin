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
 * The additional white label settings parameters.
 *
 * @param startDocsEnabled Specifies if the sample documents are displayed or hidden.
 * @param helpCenterEnabled Specifies if the Help Center link is available or not.
 * @param feedbackAndSupportEnabled Specifies if the Feedback & Support link is available or not.
 * @param userForumEnabled Specifies if the user forum is available or not.
 * @param videoGuidesEnabled Specifies if the Video Guides link is available or not.
 * @param licenseAgreementsEnabled Specifies if the License Agreements link is available or not.
 * @param isDefault Specifies if the additional white label settings are default or not.
 */


data class AdditionalWhiteLabelSettingsDto (

    /* Specifies if the sample documents are displayed or hidden. */
    @Json(name = "startDocsEnabled")
    val startDocsEnabled: kotlin.Boolean,

    /* Specifies if the Help Center link is available or not. */
    @Json(name = "helpCenterEnabled")
    val helpCenterEnabled: kotlin.Boolean,

    /* Specifies if the Feedback & Support link is available or not. */
    @Json(name = "feedbackAndSupportEnabled")
    val feedbackAndSupportEnabled: kotlin.Boolean,

    /* Specifies if the user forum is available or not. */
    @Json(name = "userForumEnabled")
    val userForumEnabled: kotlin.Boolean,

    /* Specifies if the Video Guides link is available or not. */
    @Json(name = "videoGuidesEnabled")
    val videoGuidesEnabled: kotlin.Boolean,

    /* Specifies if the License Agreements link is available or not. */
    @Json(name = "licenseAgreementsEnabled")
    val licenseAgreementsEnabled: kotlin.Boolean,

    /* Specifies if the additional white label settings are default or not. */
    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean

) {


}

