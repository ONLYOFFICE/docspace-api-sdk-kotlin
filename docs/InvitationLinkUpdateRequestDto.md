
# InvitationLinkUpdateRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | The link to change, by the `id` that creating or reading it returned. The role behind that id cannot be  changed here. |  |
| **expiration** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The new deadline, read in the portal time zone. The body is applied as a whole, so leaving it out clears the  deadline rather than keeping the current one; a moment in the past is refused. |  [optional] |
| **maxUseCount** | **kotlin.Int** | The new total number of accounts that may join through the link. It may not be lower than the uses already  spent, which the link reports as `currentUseCount`, and leaving it out removes the limit rather than keeping  the current one. |  [optional] |



