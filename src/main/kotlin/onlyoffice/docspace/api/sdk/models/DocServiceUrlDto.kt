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
 * The document service URL parameters.
 *
 * @param version The version of the document service.
 * @param docServiceUrlApi The document service URL API.
 * @param docServiceUrl The document service URL.
 * @param docServicePreloadUrl The URL used to preload the document service scripts.
 * @param docServiceUrlInternal The internal document service URL.
 * @param docServicePortalUrl The document service portal URL.
 * @param docServiceSignatureHeader The document service signature header.
 * @param docServiceSslVerification Specifies if the document service SSL verification is enabled.
 * @param isDefault Specifies if the document service is default.
 */


data class DocServiceUrlDto (

    /* The version of the document service. */
    @Json(name = "version")
    val version: kotlin.String?,

    /* The document service URL API. */
    @Json(name = "docServiceUrlApi")
    val docServiceUrlApi: kotlin.String?,

    /* The document service URL. */
    @Json(name = "docServiceUrl")
    val docServiceUrl: kotlin.String?,

    /* The URL used to preload the document service scripts. */
    @Json(name = "docServicePreloadUrl")
    val docServicePreloadUrl: kotlin.String?,

    /* The internal document service URL. */
    @Json(name = "docServiceUrlInternal")
    val docServiceUrlInternal: kotlin.String?,

    /* The document service portal URL. */
    @Json(name = "docServicePortalUrl")
    val docServicePortalUrl: kotlin.String?,

    /* The document service signature header. */
    @Json(name = "docServiceSignatureHeader")
    val docServiceSignatureHeader: kotlin.String?,

    /* Specifies if the document service SSL verification is enabled. */
    @Json(name = "docServiceSslVerification")
    val docServiceSslVerification: kotlin.Boolean,

    /* Specifies if the document service is default. */
    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean

) {


}

