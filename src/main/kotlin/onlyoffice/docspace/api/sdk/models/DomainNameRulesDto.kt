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
 * The rules a portal name is checked against.
 *
 * @param regex The pattern the portal name has to match.
 * @param minLength The shortest portal name accepted.
 * @param maxLength The longest portal name accepted.
 */


data class DomainNameRulesDto (

    @Json(name = "regex")
    val regex: kotlin.String? = null,

    @Json(name = "minLength")
    val minLength: kotlin.Int? = null,

    @Json(name = "maxLength")
    val maxLength: kotlin.Int? = null

) {


}

