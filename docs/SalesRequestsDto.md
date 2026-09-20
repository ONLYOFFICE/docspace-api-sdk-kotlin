
# SalesRequestsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userName** | **kotlin.String** | The name the sales team should address the reply to. It is sent as written and is not matched against any  portal account; an empty value fails the request with 400. |  |
| **email** | **kotlin.String** | The address the answer is sent to. It has to be a well-formed email address and need not be the caller portal  address; an empty or malformed value fails the request with 400. |  |
| **message** | **kotlin.String** | What is being asked of the sales team - a quote, an invoice, or a plan that cannot be bought online. An empty  value fails the request with 400. |  |



