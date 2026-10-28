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
 * The body of a file settings switch: a single flag carrying the state to store.
 *
 * @param set The state to store for the setting the operation addresses: true switches it on, false switches it off. The  flag carries no meaning of its own - what is switched, who is allowed to switch it, and whether the value  belongs to the calling account or to the whole portal are stated by the operation that binds this body. The  answer repeats the value the portal read back afterwards, which is not always the one that was sent.
 */


data class SettingsRequestDto (

    @Json(name = "set")
    val set: kotlin.Boolean? = null

) {


}

