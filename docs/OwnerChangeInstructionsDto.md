
# OwnerChangeInstructionsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | **kotlin.Int** | Whether the letter was sent: `1` that it was, `0` that the request was turned down. A refusal comes back  with HTTP 200, so this field and not the status code is what says whether anything happened - the request  is turned down when the caller is not the portal owner and when the named member is unknown or inactive. |  [optional] |
| **message** | **kotlin.String** | The outcome spelled out in the portal language. On success it names the address the letter went to, and it  carries an HTML `mailto:` anchor rather than plain text, so it has to be rendered as markup or stripped;  on a refusal it is the localised reason. |  [optional] |



