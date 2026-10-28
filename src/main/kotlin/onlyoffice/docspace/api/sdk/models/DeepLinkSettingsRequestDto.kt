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

import onlyoffice.docspace.api.sdk.models.DeepLinkHandlingMode

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The deep link handling the portal applies on mobile devices.
 *
 * @param handlingMode Whether a link always opens in the browser, always in the native application, or asks the user each time.
 * @param lastModified Accepted for compatibility with earlier clients and not read: the server keeps its own value.
 */


data class DeepLinkSettingsRequestDto (

    @Json(name = "handlingMode")
    val handlingMode: DeepLinkHandlingMode? = null,

    @Json(name = "lastModified")
    val lastModified: java.time.OffsetDateTime? = null

) {


}

