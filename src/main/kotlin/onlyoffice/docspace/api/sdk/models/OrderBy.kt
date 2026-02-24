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

import onlyoffice.docspace.api.sdk.models.SortedByType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The sorting parameters.
 *
 * @param isAsc Specifies if the order is ascending.
 * @param `property` 
 */


data class OrderBy (

    /* Specifies if the order is ascending. */
    @Json(name = "is_asc")
    val isAsc: kotlin.Boolean? = null,

    @Json(name = "property")
    val `property`: SortedByType? = null

) {


}

