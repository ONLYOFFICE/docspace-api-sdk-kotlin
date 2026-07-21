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
 * The Access Control external sharing settings request parameters.
 *
 * @param externalShare Specifies whether external (public) link creation is allowed.
 * @param defaultShareLinkInternal Specifies the default sharing link type: true = DocSpace users only, false = Anyone with the link.  Relevant only when ExternalShare is true.
 * @param externalShareApplyToDocuments When external sharing is restricted, specifies whether to apply the restriction to the My Documents section.  Relevant only when ExternalShare is false.
 * @param externalShareApplyToRooms When external sharing is restricted, specifies whether to apply the restriction to the Rooms section.  Relevant only when ExternalShare is false.
 * @param blockExistingLinksOnRestrict When external sharing is restricted, specifies whether to block existing public links immediately.  Relevant only when ExternalShare is false.
 */


data class ExternalSharingSettingsRequestDto (

    /* Specifies whether external (public) link creation is allowed. */
    @Json(name = "externalShare")
    val externalShare: kotlin.Boolean? = null,

    /* Specifies the default sharing link type: true = DocSpace users only, false = Anyone with the link.  Relevant only when ExternalShare is true. */
    @Json(name = "defaultShareLinkInternal")
    val defaultShareLinkInternal: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether to apply the restriction to the My Documents section.  Relevant only when ExternalShare is false. */
    @Json(name = "externalShareApplyToDocuments")
    val externalShareApplyToDocuments: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether to apply the restriction to the Rooms section.  Relevant only when ExternalShare is false. */
    @Json(name = "externalShareApplyToRooms")
    val externalShareApplyToRooms: kotlin.Boolean? = null,

    /* When external sharing is restricted, specifies whether to block existing public links immediately.  Relevant only when ExternalShare is false. */
    @Json(name = "blockExistingLinksOnRestrict")
    val blockExistingLinksOnRestrict: kotlin.Boolean? = null

) {


}

