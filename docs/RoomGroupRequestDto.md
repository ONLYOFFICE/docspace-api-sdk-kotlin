
# RoomGroupRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The name to show the group under. Surrounding spaces are trimmed before it is stored, a name that is blank  once trimmed is refused, and the name does not have to differ from the names of the caller's other groups. |  |
| **icon** | **kotlin.String** | The icon of the group, given as the identifier of one of the built-in covers listed by  `GET api/2.0/files/rooms/covers`. An uploaded image cannot be used, and any value that is not one of those  identifiers is refused. |  |
| **rooms** | [**kotlin.collections.List&lt;DuplicateRequestDtoAllOfFileIds&gt;**](DuplicateRequestDtoAllOfFileIds.md) | The rooms to gather in the group, each given as a number for a room stored in the portal or as a string for a  room on a connected third-party account. Every identifier has to name a room the caller can read; repeats are  collapsed, and an element of any other shape - a decimal number, a number sent as a string, null - is refused. |  |
| **searchArea** | [**SearchArea**](SearchArea.md) | The section the group belongs to: Active for Rooms and Forms for Forms. Active when omitted. |  [optional] |



