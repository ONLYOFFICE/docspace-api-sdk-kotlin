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
 * The request parameters for switching the DocsCloud subscription to DocsCloudDevPack, or for calculating  the cost of that switch.
 *
 * @param quantity The number of users to subscribe to DocsCloudDevPack for. It must be at least the number of users of  the currently purchased DocsCloud subscription, and at least the DocsCloudDevPack minimum configured  for the installation, which is 10 users by default; a smaller value is rejected with 400.
 */


data class DocsCloudDevPackRequestDto (

    @Json(name = "quantity")
    val quantity: kotlin.Int? = null

) {


}

