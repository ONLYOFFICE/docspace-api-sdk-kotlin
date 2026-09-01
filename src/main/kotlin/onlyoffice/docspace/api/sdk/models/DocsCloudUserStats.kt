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
 * Represents the usage statistics of a single DocsCloud user category (editor or viewer).
 *
 * @param active The number of active users.
 * @param `internal` The number of internal users.
 * @param `external` The number of external users.
 * @param remaining The number of remaining users before the limit is reached.
 * @param criticalRemaining Whether the number of remaining users is critically low.
 */


data class DocsCloudUserStats (

    @Json(name = "active")
    val active: kotlin.Int? = null,

    @Json(name = "internal")
    val `internal`: kotlin.Int? = null,

    @Json(name = "external")
    val `external`: kotlin.Int? = null,

    @Json(name = "remaining")
    val remaining: kotlin.Int? = null,

    @Json(name = "criticalRemaining")
    val criticalRemaining: kotlin.Boolean? = null

) {


}

