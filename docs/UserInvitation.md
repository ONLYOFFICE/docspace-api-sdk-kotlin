
# UserInvitation

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **usersIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The accounts to write to, taken from `GET api/2.0/files/rooms/{id}/share`. Anyone who has already joined, is  not in the room, or is invisible to the caller is skipped without an error, and the field is ignored once  every pending invitation is being resent. |  [optional] |
| **resendAll** | **kotlin.Boolean** | Whether every invitation of the room that is still waiting is sent again. With it on the list of accounts is  ignored, and with it off an empty list means that nothing is sent at all. |  [optional] |



