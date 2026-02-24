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
 * The presence or absence of the documents in the Open Recent... menu option.
 *
 * @param folder The folder where the document is stored.
 * @param title The document title that will be displayed in the Open Recent... menu option.
 * @param url The absolute URL to the document where it is stored.
 */


data class RecentConfig (

    /* The folder where the document is stored. */
    @Json(name = "folder")
    val folder: kotlin.String? = null,

    /* The document title that will be displayed in the Open Recent... menu option. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The absolute URL to the document where it is stored. */
    @Json(name = "url")
    val url: java.net.URI? = null

) {


}

