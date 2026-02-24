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

import onlyoffice.docspace.api.sdk.models.FolderDtoString
import onlyoffice.docspace.api.sdk.models.GetPortalPrices200ResponseLinksInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param response 
 * @param count The total number of items in the response
 * @param links List of links related to the response
 * @param status HTTP status code of the response
 * @param statusCode HTTP status code of the response (duplicate of status)
 */


data class FolderStringArrayWrapper (

    @Json(name = "response")
    val response: kotlin.collections.List<FolderDtoString>? = null,

    /* The total number of items in the response */
    @Json(name = "count")
    val count: kotlin.Int? = null,

    /* List of links related to the response */
    @Json(name = "links")
    val links: kotlin.collections.List<GetPortalPrices200ResponseLinksInner>? = null,

    /* HTTP status code of the response */
    @Json(name = "status")
    val status: kotlin.Int? = null,

    /* HTTP status code of the response (duplicate of status) */
    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null

) {


}

