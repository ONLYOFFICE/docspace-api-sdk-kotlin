
# UpdateMembersRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The accounts the operation applies to. System accounts are dropped from the list without an error, and the  remaining ones are processed in the order they are given. |  [optional] |
| **resendAll** | **kotlin.Boolean** | Reaches every pending account of the portal instead of the ones in `userIds`. It is read only by  `PUT api/2.0/people/invite` and is ignored by every other operation that binds this body. |  [optional] |



