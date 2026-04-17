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

import onlyoffice.docspace.api.sdk.models.ProviderType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Default AI provider information.
 *
 * @param defaultModel Default model identifier used with this provider.
 * @param providerId AI provider identifier.
 * @param providerTitle AI provider title.
 * @param providerType 
 * @param defaultModelAlias Display alias of the default model.
 */


data class DefaultProviderDto (

    /* Default model identifier used with this provider. */
    @Json(name = "defaultModel")
    val defaultModel: kotlin.String?,

    /* AI provider identifier. */
    @Json(name = "providerId")
    val providerId: kotlin.Int? = null,

    /* AI provider title. */
    @Json(name = "providerTitle")
    val providerTitle: kotlin.String? = null,

    @Json(name = "providerType")
    val providerType: ProviderType? = null,

    /* Display alias of the default model. */
    @Json(name = "defaultModelAlias")
    val defaultModelAlias: kotlin.String? = null

) {


}

