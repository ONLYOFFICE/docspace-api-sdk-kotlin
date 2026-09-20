
# StartReassignRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fromUserId** | [**java.util.UUID**](java.util.UUID.md) | The ID of the user whose rooms and shared files are transferred away. The account has to have the `Terminated`  status already, and it cannot be a system account, the portal owner or the caller. |  |
| **toUserId** | [**java.util.UUID**](java.util.UUID.md) | The ID of the user who receives the data. The account has to be an active room admin or DocSpace admin, so a  guest, a system account or a disabled account is rejected. |  |
| **deleteProfile** | **kotlin.Boolean** | Specifies whether to delete the source profile once the transfer succeeds. When false, which is the default,  the emptied profile is kept and can be deleted later through `DELETE api/2.0/people/{userid}`. |  [optional] |



