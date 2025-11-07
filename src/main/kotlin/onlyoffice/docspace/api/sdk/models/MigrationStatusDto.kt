 /*
 * (c) Copyright Ascensio System SIA 2025
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

import onlyoffice.docspace.api.sdk.models.MigrationApiInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The migration status parameters.
 *
 * @param progress The migration progress.
 * @param error The migration error.
 * @param parseResult 
 * @param isCompleted Specifies whether the migration is completed or not.
 */


data class MigrationStatusDto (

    /* The migration progress. */
    @Json(name = "progress")
    val progress: kotlin.Double? = null,

    /* The migration error. */
    @Json(name = "error")
    val error: kotlin.String? = null,

    @Json(name = "parseResult")
    val parseResult: MigrationApiInfo? = null,

    /* Specifies whether the migration is completed or not. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean? = null

) {


}

