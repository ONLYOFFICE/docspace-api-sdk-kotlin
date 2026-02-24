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
 * The domain validator.
 *
 * @param regex The regex string to validate a domain.
 * @param minLength The minimum length of the valid domain.
 * @param maxLength The maximum length of the valid domain.
 */


data class TenantDomainValidator (

    /* The regex string to validate a domain. */
    @Json(name = "regex")
    val regex: kotlin.String? = null,

    /* The minimum length of the valid domain. */
    @Json(name = "minLength")
    val minLength: kotlin.Int? = null,

    /* The maximum length of the valid domain. */
    @Json(name = "maxLength")
    val maxLength: kotlin.Int? = null

) {


}

