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

import onlyoffice.docspace.api.sdk.models.DefaultTemplateItemDto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The blank document the portal creates for each extension it covers.
 *
 * @param items One entry per extension the portal's built-in template set covers, whether or not a custom blank has been  chosen for it, so the list is never empty and its length follows the template set rather than the number of  custom blanks. Entries come in the order an interface shows them: text document, spreadsheet, presentation and  PDF first, everything else by extension.
 */


data class DefaultTemplateSettingsDto (

    @Json(name = "items")
    val items: kotlin.collections.List<DefaultTemplateItemDto>?

) {


}

