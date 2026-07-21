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
 * The result of an external DB synchronization for a single form.
 *
 * @param id The form file ID.
 * @param title The form file title.
 * @param success Specifies whether the synchronization succeeded for this form.
 * @param error The error message if the synchronization failed for this form.
 */


data class ExternalDbSyncFormResultDto (

    /* The form file ID. */
    @Json(name = "id")
    val id: kotlin.Int? = null,

    /* The form file title. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Specifies whether the synchronization succeeded for this form. */
    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    /* The error message if the synchronization failed for this form. */
    @Json(name = "error")
    val error: kotlin.String? = null

) {


}

