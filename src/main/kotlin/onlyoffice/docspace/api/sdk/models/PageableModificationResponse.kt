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
 * One page of results ordered by modification time, together with the cursor that asks for the next page.
 *
 * @param `data` 
 * @param limit The page size that was applied to this request, between 1 and 50.
 * @param lastModifiedOn The cursor to send back as last_modified_on to ask for the next page. It is null when the page is empty.
 */


data class PageableModificationResponse (

    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    @Json(name = "last_modified_on")
    val lastModifiedOn: java.time.OffsetDateTime? = null

) {


}

