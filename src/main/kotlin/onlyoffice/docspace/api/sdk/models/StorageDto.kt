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

import onlyoffice.docspace.api.sdk.models.AuthKey

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One third-party storage provider the portal data can be kept in, with the keys it expects.
 *
 * @param id The provider's key, which is what `PUT api/2.0/settings/storage` and its CDN and backup counterparts take  as the storage to switch to. The built-in local storage has no entry of its own: a listing in which  nothing is `current` means the data sits locally.
 * @param title The provider name in the portal language, falling back to `id` when this build ships no wording for it.
 * @param current Whether the portal is using this provider right now. At most one entry of a listing has it set.
 * @param isSet Whether the provider's keys are already filled in on the server, so it could be switched to without  sending credentials. It says nothing about whether the credentials still work.
 * @param properties The settings the provider expects, each with its key, its localised label and the value the server  currently holds. For the entry marked `current` the values come from the portal's saved storage settings  and for the others from the installation configuration, so a setting nobody has configured comes back with  an empty value rather than being left out.
 */


data class StorageDto (

    @Json(name = "id")
    val id: kotlin.String?,

    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "current")
    val current: kotlin.Boolean,

    @Json(name = "isSet")
    val isSet: kotlin.Boolean,

    @Json(name = "properties")
    val properties: kotlin.collections.List<AuthKey>? = null

) {


}

