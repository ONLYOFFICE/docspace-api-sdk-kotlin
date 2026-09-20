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
 * The greeting caption the portal shows its users.
 *
 * @param title The caption to store, which is kept as the portal name. An empty value clears the greeting and returns the  portal to the built-in default caption. On a cloud portal with a free or trial plan the text is also matched  against the character rule configured for the installation and a text that breaks it is refused, while a paid  cloud plan and a self-hosted installation apply no such check.
 */


data class GreetingSettingsRequestsDto (

    @Json(name = "title")
    val title: kotlin.String?

) {


}

