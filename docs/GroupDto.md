
# GroupDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The group name. |  |
| **category** | [**java.util.UUID**](java.util.UUID.md) | The group category ID. |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The group ID. |  |
| **isLDAP** | **kotlin.Boolean** | Specifies if the LDAP settings are enabled for the group or not. |  |
| **parent** | [**java.util.UUID**](java.util.UUID.md) | The parent group ID. |  [optional] |
| **isSystem** | **kotlin.Boolean** | Indicates whether the group is a system group. |  [optional] |
| **manager** | [**EmployeeFullDto**](EmployeeFullDto.md) |  |  [optional] |
| **members** | [**kotlin.collections.List&lt;EmployeeFullDto&gt;**](EmployeeFullDto.md) | The list of group members. |  [optional] |
| **shared** | **kotlin.Boolean** | Specifies whether the group can be shared or not. |  [optional] |
| **membersCount** | **kotlin.Int** | The number of group members. |  [optional] |



