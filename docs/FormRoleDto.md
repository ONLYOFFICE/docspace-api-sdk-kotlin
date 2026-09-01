
# FormRoleDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **roleName** | **kotlin.String** | The role name. |  |
| **sequence** | **kotlin.Int** | The role sequence. |  |
| **submitted** | **kotlin.Boolean** | Specifies if the role is submitted. |  |
| **roleColor** | **kotlin.String** | The role color. |  [optional] |
| **user** | [**EmployeeFullDto**](EmployeeFullDto.md) | The user of the role. |  [optional] |
| **stopedBy** | [**EmployeeFullDto**](EmployeeFullDto.md) | The user who stopped the role. |  [optional] |
| **history** | [**kotlin.collections.Map&lt;kotlin.String, java.time.OffsetDateTime&gt;**](java.time.OffsetDateTime.md) | The role history. |  [optional] |
| **roleStatus** | [**FormFillingStatus**](FormFillingStatus.md) | The role status. |  [optional] |



