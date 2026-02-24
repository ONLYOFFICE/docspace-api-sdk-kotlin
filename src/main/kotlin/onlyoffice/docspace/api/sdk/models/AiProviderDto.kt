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

import onlyoffice.docspace.api.sdk.models.ApiDateTime
import onlyoffice.docspace.api.sdk.models.ProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * AI provider details.
 *
 * @param title AI provider display title.
 * @param createdOn 
 * @param modifiedOn 
 * @param id AI provider identifier.
 * @param type 
 * @param url API endpoint URL for the AI provider.
 * @param needReset Indicates whether the provider's API key needs to be reset.
 * @param isDefault Indicates whether this provider is the default provider for the tenant.
 */


data class AiProviderDto (

    /* AI provider display title. */
    @Json(name = "title")
    val title: kotlin.String?,

    @Json(name = "createdOn")
    val createdOn: ApiDateTime,

    @Json(name = "modifiedOn")
    val modifiedOn: ApiDateTime,

    /* AI provider identifier. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "type")
    val type: ProviderType? = null,

    /* API endpoint URL for the AI provider. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* Indicates whether the provider's API key needs to be reset. */
    @Json(name = "needReset")
    val needReset: kotlin.Boolean? = null,

    /* Indicates whether this provider is the default provider for the tenant. */
    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean? = null

) {


}

