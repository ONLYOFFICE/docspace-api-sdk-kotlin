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

import onlyoffice.docspace.api.sdk.models.ClientInfoResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * One page of consent-facing client info together with the next-page cursor.
 *
 * @param `data` The items on this page, at most as many as the requested limit. An empty array means there is nothing further to read.
 * @param limit The page size that was applied to this request, between 1 and 50.
 * @param lastClientId The cursor to send back as last_client_id to ask for the next page, together with last_created_on. It is null when the page is empty.
 * @param lastCreatedOn The cursor to send back as last_created_on to ask for the next page, together with last_client_id. It is null when the page is empty.
 */


data class PageableClientInfoResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<ClientInfoResponse>? = null,

    @Json(name = "limit")
    val limit: kotlin.Int? = null,

    @Json(name = "last_client_id")
    val lastClientId: kotlin.String? = null,

    @Json(name = "last_created_on")
    val lastCreatedOn: java.time.OffsetDateTime? = null

) {


}

