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
 * The permissions configuration parameters.
 *
 * @param comment Defines if the document can be commented or not.
 * @param chat Defines if the chat functionality is enabled in the document or not.
 * @param download Defines if the document can be downloaded or only viewed or edited online.
 * @param edit Defines if the document can be edited or only viewed.
 * @param fillForms Defines if the forms can be filled.
 * @param modifyFilter Defines if the filter can be applied globally (true) affecting all the other users,  or locally (false), i.e. for the current user only.
 * @param protect Defines if the Protection tab on the toolbar and the Protect button in the left menu are displayedor hidden.
 * @param print Defines if the document can be printed or not.
 * @param review Defines if the document can be reviewed or not.
 * @param copy Defines if the content can be copied to the clipboard or not.
 */


data class PermissionsConfig (

    /* Defines if the document can be commented or not. */
    @Json(name = "comment")
    val comment: kotlin.Boolean? = null,

    /* Defines if the chat functionality is enabled in the document or not. */
    @Json(name = "chat")
    val chat: kotlin.Boolean? = null,

    /* Defines if the document can be downloaded or only viewed or edited online. */
    @Json(name = "download")
    val download: kotlin.Boolean? = null,

    /* Defines if the document can be edited or only viewed. */
    @Json(name = "edit")
    val edit: kotlin.Boolean? = null,

    /* Defines if the forms can be filled. */
    @Json(name = "fillForms")
    val fillForms: kotlin.Boolean? = null,

    /* Defines if the filter can be applied globally (true) affecting all the other users,  or locally (false), i.e. for the current user only. */
    @Json(name = "modifyFilter")
    val modifyFilter: kotlin.Boolean? = null,

    /* Defines if the Protection tab on the toolbar and the Protect button in the left menu are displayedor hidden. */
    @Json(name = "protect")
    val protect: kotlin.Boolean? = null,

    /* Defines if the document can be printed or not. */
    @Json(name = "print")
    val print: kotlin.Boolean? = null,

    /* Defines if the document can be reviewed or not. */
    @Json(name = "review")
    val review: kotlin.Boolean? = null,

    /* Defines if the content can be copied to the clipboard or not. */
    @Json(name = "copy")
    val copy: kotlin.Boolean? = null

) {


}

