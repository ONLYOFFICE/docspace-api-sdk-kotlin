
# GroupRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **groupName** | **kotlin.String** | The name of the group, from 1 to 128 characters. It is required, it may not be blank, and it does not have to  be unique. |  |
| **members** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The accounts to put into the new group. Every one of them has to be an active member that is not a guest,  otherwise the whole call is rejected. Omit it to create an empty group. |  [optional] |
| **groupManager** | [**java.util.UUID**](java.util.UUID.md) | The account to make the manager of the new group. It is added to the group as well, so it does not have to be  repeated in `members`. Omit it to create a group without a manager. |  [optional] |



