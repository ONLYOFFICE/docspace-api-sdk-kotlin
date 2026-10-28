
# InvitationLinkCreateRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **employeeType** | [**EmployeeType**](EmployeeType.md) | The role whoever follows the link joins with. Only `DocSpaceAdmin`, `RoomAdmin` and `User` are accepted, and  the role cannot be changed afterwards - delete the link and create one for the other role instead. |  |
| **expiration** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the link stops letting anyone in, read in the portal time zone. It has to lie in the future; leaving it  out creates a link with no deadline at all. |  [optional] |
| **maxUseCount** | **kotlin.Int** | How many accounts may join through the link in total. Leaving it out creates a link with no use limit; the  uses spent so far are reported as `currentUseCount`. |  [optional] |



