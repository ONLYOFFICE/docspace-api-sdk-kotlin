
# TfaConfirmDataDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **url** | **kotlin.String** | The link to open. Its `type` shows which step it is: phone activation or phone authorization for the SMS  method, and authenticator activation or re-verification for the application method. The whole body is empty  when the portal requires no second factor of the caller. |  [optional] |
| **cookieName** | **kotlin.String** | The name of the confirmation cookie the link is validated against. It is filled in only for the  authenticator-application method; the SMS method returns `url` alone. |  [optional] |
| **cookieValue** | **kotlin.String** | The value of that cookie. The call already set it on the response, so it is repeated here only for a client  that does not keep cookies of its own; it is filled in under the same condition as `cookieName`, and a  later call to this operation replaces it. |  [optional] |



