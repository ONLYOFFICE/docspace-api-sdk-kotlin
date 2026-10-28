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
 * The parameters for adding a custom tag to the portal catalog of room tags.
 *
 * @param name The name of the tag to create, which is also its identity: tags are addressed by name everywhere, there is no  separate identifier. It is stored exactly as sent, spacing and case included, and a name that is already in  the catalog gives back that tag instead of a second one.
 */


data class CreateTagRequestDto (

    @Json(name = "name")
    val name: kotlin.String?

) {


}

