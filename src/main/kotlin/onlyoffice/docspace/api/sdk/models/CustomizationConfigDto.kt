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

import onlyoffice.docspace.api.sdk.models.AnonymousConfigDto
import onlyoffice.docspace.api.sdk.models.CustomerConfigDto
import onlyoffice.docspace.api.sdk.models.FeedbackConfig
import onlyoffice.docspace.api.sdk.models.GobackConfig
import onlyoffice.docspace.api.sdk.models.LogoConfigDto
import onlyoffice.docspace.api.sdk.models.ReviewConfig
import onlyoffice.docspace.api.sdk.models.StartFillingForm
import onlyoffice.docspace.api.sdk.models.SubmitForm

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The customization config parameters.
 *
 * @param about Specifies if the customization is about.
 * @param customer 
 * @param anonymous 
 * @param feedback 
 * @param forcesave Specifies if the customization should be force saved.
 * @param goback 
 * @param review 
 * @param logo 
 * @param mentionShare Specifies if the share should be mentioned.
 * @param submitForm 
 * @param startFillingForm 
 */


data class CustomizationConfigDto (

    /* Specifies if the customization is about. */
    @Json(name = "about")
    val about: kotlin.Boolean? = null,

    @Json(name = "customer")
    val customer: CustomerConfigDto? = null,

    @Json(name = "anonymous")
    val anonymous: AnonymousConfigDto? = null,

    @Json(name = "feedback")
    val feedback: FeedbackConfig? = null,

    /* Specifies if the customization should be force saved. */
    @Json(name = "forcesave")
    val forcesave: kotlin.Boolean? = null,

    @Json(name = "goback")
    val goback: GobackConfig? = null,

    @Json(name = "review")
    val review: ReviewConfig? = null,

    @Json(name = "logo")
    val logo: LogoConfigDto? = null,

    /* Specifies if the share should be mentioned. */
    @Json(name = "mentionShare")
    val mentionShare: kotlin.Boolean? = null,

    @Json(name = "submitForm")
    val submitForm: SubmitForm? = null,

    @Json(name = "startFillingForm")
    val startFillingForm: StartFillingForm? = null

) {


}

