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
 * The response containing paginated modification information.
 *
 * @param `data` The paginated modification data.
 * @param limit The maximum number of results returned per page.
 * @param lastModifiedOn The date when the user consent was last modified.
 */


data class PageableModificationResponse (

    /* The paginated modification data. */
    @Json(name = "data")
    val `data`: kotlin.Any? = null,

    /* The maximum number of results returned per page. */
    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    /* The date when the user consent was last modified. */
    @Json(name = "last_modified_on")
    val lastModifiedOn: java.time.OffsetDateTime? = null

) {


}

