
# AuthServiceDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The internal key of the provider, such as `google` or `box`. It is the `name` that  `POST api/2.0/settings/authservice` takes to select the provider. |  [optional] |
| **title** | **kotlin.String** | The provider name as it is shown in the interface. |  [optional] |
| **description** | **kotlin.String** | A sentence about what connecting the provider gives the portal, shown next to it in the interface. |  [optional] |
| **instruction** | **kotlin.String** | The steps an administrator has to take on the provider side to obtain the keys, shown in the interface. |  [optional] |
| **canSet** | **kotlin.Boolean** | Whether this provider accepts keys through the API at all. A provider whose keys are fixed by the  installation reports `false`, and saving keys for it is refused. |  [optional] |
| **paid** | **kotlin.Boolean** | Whether the provider is a paid option. A paid one can only be connected while the portal plan includes  third-party storage or the installation is licensed as self-hosted. |  [optional] |
| **props** | [**kotlin.collections.List&lt;AuthKeyDto&gt;**](AuthKeyDto.md) | The keys the provider defines, with the values last saved and how the settings form shows each of them.  It is `null` for a provider that forbids changes (`canSet` is `false`): its keys are not read at all. |  [optional] |



