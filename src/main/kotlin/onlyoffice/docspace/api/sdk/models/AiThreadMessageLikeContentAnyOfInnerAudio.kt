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
 * An `audio` part's sound.
 *
 * @param `data` The audio data, base64.
 * @param format Audio format: `mp3` or `wav`.
 */


data class AiThreadMessageLikeContentAnyOfInnerAudio (

    @Json(name = "data")
    val `data`: kotlin.String,

    @Json(name = "format")
    val format: AiThreadMessageLikeContentAnyOfInnerAudio.Format

) {

    /**
     * Audio format: `mp3` or `wav`.
     *
     * Values: mp3,wav
     */
    @JsonClass(generateAdapter = false)
    enum class Format(val value: kotlin.String) {
        @Json(name = "mp3") mp3("mp3"),
        @Json(name = "wav") wav("wav");
    }

}

