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
 * The names to test against the files the folder already holds.
 *
 * @param filesTitle The names to test, extensions included, spelled as they would be sent to the upload. Matching ignores case,  and a name repeated in the list is answered once.
 */


data class CheckUploadRequest (

    @Json(name = "filesTitle")
    val filesTitle: kotlin.collections.List<kotlin.String>? = null

) {


}

