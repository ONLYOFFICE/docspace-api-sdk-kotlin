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


package onlyoffice.docspace.api.sdk.apis

import onlyoffice.docspace.api.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import onlyoffice.docspace.api.sdk.models.GroupArrayWrapper

interface SearchApi {
    /**
     * GET api/2.0/group/file/{id}
     * Get groups with file sharing settings
     * Returns groups with their sharing settings for a file with the ID specified in request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for getGroupsWithFilesShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-files-shared/
     *
     *
     * @param id The group ID.
     * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
     * @param count The number of groups to retrieve in the request. (optional)
     * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
     * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
     * @return [Call]<[GroupArrayWrapper]>
     */
    @GET("api/2.0/group/file/{id}")
    fun getGroupsWithFilesShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<GroupArrayWrapper>

    /**
     * GET api/2.0/group/folder/{id}
     * Get groups with folder sharing settings
     * Returns groups with their sharing settings in a folder with the ID specified in request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for getGroupsWithFoldersShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-folders-shared/
     *
     *
     * @param id The group ID.
     * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
     * @param count The number of groups to retrieve in the request. (optional)
     * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
     * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
     * @return [Call]<[GroupArrayWrapper]>
     */
    @GET("api/2.0/group/folder/{id}")
    fun getGroupsWithFoldersShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<GroupArrayWrapper>

    /**
     * GET api/2.0/group/room/{id}
     * Get groups with room sharing settings
     * Returns groups with their sharing settings in a room with the ID specified in request.
     * Responses:
     *  - 200: Ok
     *  - 401: Unauthorized
     *  - 403: No permissions to perform this action
     *
     * REST API Reference for getGroupsWithRoomsShared Operation
     * @see https://api.onlyoffice.com/docspace/api-backend/usage-api/get-groups-with-rooms-shared/
     *
     *
     * @param id The group ID.
     * @param excludeShared Specifies whether to exclude the group sharing settings from the response. (optional)
     * @param count The number of groups to retrieve in the request. (optional)
     * @param startIndex The starting index from which to begin retrieving groups with their sharing settings. (optional)
     * @param filterValue The text used as a filter for retrieving groups with their sharing settings. (optional)
     * @return [Call]<[GroupArrayWrapper]>
     */
    @GET("api/2.0/group/room/{id}")
    fun getGroupsWithRoomsShared(@Path("id") id: kotlin.Int, @Query("excludeShared") excludeShared: kotlin.Boolean? = null, @Query("count") count: kotlin.Int? = null, @Query("startIndex") startIndex: kotlin.Int? = null, @Query("filterValue") filterValue: kotlin.String? = null): Call<GroupArrayWrapper>

}
