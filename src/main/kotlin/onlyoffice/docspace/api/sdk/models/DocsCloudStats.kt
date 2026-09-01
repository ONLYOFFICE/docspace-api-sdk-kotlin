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

import onlyoffice.docspace.api.sdk.models.DocsCloudUserStats

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the usage statistics of a DocsCloud tenant for the current period.
 *
 * @param periodDay The length of the statistics period in days.
 * @param editor The statistics for editor users.
 * @param viewer The statistics for viewer users.
 */


data class DocsCloudStats (

    @Json(name = "periodDay")
    val periodDay: kotlin.Int? = null,

    @Json(name = "editor")
    val editor: DocsCloudUserStats? = null,

    @Json(name = "viewer")
    val viewer: DocsCloudUserStats? = null

) {


}

