
# ProductAdministratorDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **productId** | [**java.util.UUID**](java.util.UUID.md) | The module the verdict is about, echoed from the request. The all-zero GUID stands for the portal as a  whole rather than for any single module. |  |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | The user the verdict is about, echoed from the request unchanged - it is not checked for existing. |  |
| **administrator** | **kotlin.Boolean** | Whether that user administers that module. It is `true` for a DocSpace administrator whatever the module,  since the portal-wide role covers every one of them. A `false` can also mean the identifiers name no user  or no module at all, so it is not proof that the user exists, and it says nothing about whether the module  is enabled for the portal - `GET api/2.0/settings/security/{id}` reports that. |  |



