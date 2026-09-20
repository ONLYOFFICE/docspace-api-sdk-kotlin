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

import onlyoffice.docspace.api.sdk.models.FieldError

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * RFC 7807 problem details returned by the registration API for failed requests.
 *
 * @param type A URI reference that identifies the problem type. This service sets it to the DocSpace API getting-started page.
 * @param title A short, human-readable summary of the problem type, typically the HTTP status reason phrase.
 * @param status The HTTP status code for this occurrence of the problem.
 * @param detail A human-readable explanation specific to this occurrence of the problem.
 * @param instance A URI reference that identifies the specific occurrence, set to the request path.
 * @param properties Extension members carried on the problem. Usually empty; validation failures also surface as the top-level errors array.
 * @param errors Field-specific validation errors. Present when the request body or parameters failed validation, or when a named scope is not in the tenant catalogue.
 */


data class ProblemDetail (

    @Json(name = "type")
    val type: java.net.URI? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.Int? = null,

    @Json(name = "detail")
    val detail: kotlin.String? = null,

    @Json(name = "instance")
    val instance: java.net.URI? = null,

    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.Any?>? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<FieldError>? = null

) {


}

