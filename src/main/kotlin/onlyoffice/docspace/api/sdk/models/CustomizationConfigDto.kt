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

import onlyoffice.docspace.api.sdk.models.AIConfig
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
 * How the editor interface is dressed: branding, the buttons that lead back into the portal, and the behaviour of  review, mentions and form submission.
 *
 * @param about Whether the About entry of the editor menu is shown.
 * @param customer The branding of the organization running the portal. It is filled in on a server installation only and is  empty in the cloud.
 * @param anonymous How an anonymous participant is treated in this session.
 * @param feedback The support link the editor offers behind its feedback button.
 * @param forcesave Whether the editors write intermediate revisions while the document stays open. It is empty when the portal  leaves the decision to the editors themselves.
 * @param goback Where the editor returns the user to when they leave the document. It is empty when there is nowhere to go  back to, as in an embedded opening.
 * @param review How tracked changes are displayed when the document opens; it depends on whether this session may write.
 * @param logo The logo the editor shows, in the variants the current layout and file type need.
 * @param mentionShare Whether mentioning a user who cannot yet open the document offers to share it with them, instead of silently  notifying nobody.
 * @param submitForm The submit button of a form: whether it is shown and what it says.
 * @param startFillingForm The button that starts filling out the form. It is empty when this opening offers no such button.
 * @param ai The AI configuration settings.
 */


data class CustomizationConfigDto (

    @Json(name = "about")
    val about: kotlin.Boolean? = null,

    @Json(name = "customer")
    val customer: CustomerConfigDto? = null,

    @Json(name = "anonymous")
    val anonymous: AnonymousConfigDto? = null,

    @Json(name = "feedback")
    val feedback: FeedbackConfig? = null,

    @Json(name = "forcesave")
    val forcesave: kotlin.Boolean? = null,

    @Json(name = "goback")
    val goback: GobackConfig? = null,

    @Json(name = "review")
    val review: ReviewConfig? = null,

    @Json(name = "logo")
    val logo: LogoConfigDto? = null,

    @Json(name = "mentionShare")
    val mentionShare: kotlin.Boolean? = null,

    @Json(name = "submitForm")
    val submitForm: SubmitForm? = null,

    @Json(name = "startFillingForm")
    val startFillingForm: StartFillingForm? = null,

    @Json(name = "ai")
    val ai: AIConfig? = null

) {


}

