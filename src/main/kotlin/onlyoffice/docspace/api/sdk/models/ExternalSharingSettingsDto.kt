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
 * The external sharing policy of the portal as it now stands.
 *
 * @param externalShare Whether links that open a file or a room without a portal account may be created. While it is false the portal  also reports sharing on social networks as off and the default link type as internal, whatever was asked for.
 * @param defaultShareLinkInternal The kind of link the portal offers first: true means a link only accounts of this portal can open, false one  that anyone holding it can open.
 * @param externalShareApplyToDocuments Whether the restriction covers personal documents. It only has an effect while external sharing is off, so a  true here with sharing allowed restricts nothing.
 * @param externalShareApplyToRooms Whether the restriction covers rooms, including the creation of new public ones. It only has an effect while  external sharing is off.
 * @param blockExistingLinksOnRestrict Whether links created before the restriction stop opening as well. With false they keep working and only new  ones are refused.
 */


data class ExternalSharingSettingsDto (

    @Json(name = "externalShare")
    val externalShare: kotlin.Boolean? = null,

    @Json(name = "defaultShareLinkInternal")
    val defaultShareLinkInternal: kotlin.Boolean? = null,

    @Json(name = "externalShareApplyToDocuments")
    val externalShareApplyToDocuments: kotlin.Boolean? = null,

    @Json(name = "externalShareApplyToRooms")
    val externalShareApplyToRooms: kotlin.Boolean? = null,

    @Json(name = "blockExistingLinksOnRestrict")
    val blockExistingLinksOnRestrict: kotlin.Boolean? = null

) {


}

