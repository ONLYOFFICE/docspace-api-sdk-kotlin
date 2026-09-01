
# RoomTemplateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **roomId** | **kotlin.Int** | The room template ID. |  |
| **title** | **kotlin.String** | The room template title. |  |
| **logo** | [**LogoRequest**](LogoRequest.md) | The logo request parameters. |  [optional] |
| **copyLogo** | **kotlin.Boolean** | Specifies whether to copy room logo or not. |  [optional] |
| **share** | **kotlin.collections.List&lt;kotlin.String&gt;** | The collection of email addresses of users with whom to share a room. |  [optional] |
| **groups** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | The collection of groups with whom to share a room. |  [optional] |
| **&#x60;public&#x60;** | **kotlin.Boolean** | Specifies whether the room template is public or not. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The collection of tags. |  [optional] |
| **color** | **kotlin.String** | The color of the room template. |  [optional] |
| **cover** | **kotlin.String** | The cover of the room template. |  [optional] |
| **quota** | **kotlin.Long** | Room quota |  [optional] |



