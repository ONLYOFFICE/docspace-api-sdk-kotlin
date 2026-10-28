
# MentionDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**PortalUserDto**](PortalUserDto.md) | The account itself, as the portal stores it. |  [optional] |
| **email** | **kotlin.String** | Where a mention notification for this user is delivered. |  [optional] |
| **id** | **kotlin.String** | The account id as text, the same value the account object carries; it is what identifies the user in a sharing  request built from this list. |  [optional] |
| **image** | **kotlin.String** | An absolute address of the medium-sized avatar. A generated default avatar is reported when the user never  uploaded one, so the field is never empty. |  [optional] |
| **hasAccess** | **kotlin.Boolean** | Not filled in by the operations that return this list: it always comes back false. Whether a user can already  open the document has to be read from the sharing settings of the file. |  [optional] |
| **name** | **kotlin.String** | The name to display, assembled the way the portal is configured to show names. |  [optional] |



