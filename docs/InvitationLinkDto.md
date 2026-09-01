
# InvitationLinkDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **employeeType** | [**EmployeeType**](EmployeeType.md) | The type of employee role for the invitation link. |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The ID of the invitation link. |  [optional] |
| **expiration** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The expiration date of the invitation link. |  [optional] |
| **isExpired** | **kotlin.Boolean** | Indicates whether the invitation link has expired. |  [optional] |
| **maxUseCount** | **kotlin.Int** | The maximum number of times the invitation link can be used. |  [optional] |
| **currentUseCount** | **kotlin.Int** | The current number of times the invitation link has been used. |  [optional] |
| **url** | **kotlin.String** | The URL of the invitation link. |  [optional] |



