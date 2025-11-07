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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The request parameters for deleting file versions.
 *
 * @param fileId The file ID to delete.
 * @param versions The collection of file versions to be deleted.
 * @param returnSingleOperation Specifies whether to return only the current operation
 * @param deleteAfter Specifies whether to delete a file after the editing session is finished or not.
 */


data class DeleteVersionBatchRequestDto (

    /* The file ID to delete. */
    @Json(name = "fileId")
    val fileId: kotlin.Int,

    /* The collection of file versions to be deleted. */
    @Json(name = "versions")
    val versions: kotlin.collections.List<kotlin.Int>?,

    /* Specifies whether to return only the current operation */
    @Json(name = "returnSingleOperation")
    val returnSingleOperation: kotlin.Boolean? = null,

    /* Specifies whether to delete a file after the editing session is finished or not. */
    @Json(name = "deleteAfter")
    val deleteAfter: kotlin.Boolean? = null

) {


}

