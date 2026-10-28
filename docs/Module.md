
# Module

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The identifier of the module. It is the same in every portal and in every language, so use it rather than the  title to tell modules apart. |  [optional] |
| **appName** | **kotlin.String** | The short system name of the module, the one that appears in its addresses and in the portal configuration.  Unlike the title it is not translated. |  [optional] |
| **title** | **kotlin.String** | The display name of the module, already translated for the calling account, so it changes with the language  and must not be compared against a fixed string. |  [optional] |
| **link** | **kotlin.String** | The address of the start page of the module, to be opened in a browser rather than called as an API. |  [optional] |
| **iconUrl** | **kotlin.String** | The address of the small icon of the module, meant for a menu entry. |  [optional] |
| **imageUrl** | **kotlin.String** | The address of the large image of the module, meant for a tile or a start screen. |  [optional] |
| **helpUrl** | **kotlin.String** | The address of the help section of the module. It is empty when the portal publishes no help for it. |  [optional] |
| **description** | **kotlin.String** | The one-line description of the module shown next to its title, translated for the calling account. |  [optional] |
| **isPrimary** | **kotlin.Boolean** | Whether the portal opens this module first when no other destination is given. |  [optional] |



