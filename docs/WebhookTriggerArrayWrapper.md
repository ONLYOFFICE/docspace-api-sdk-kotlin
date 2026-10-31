
# WebhookTriggerArrayWrapper

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **response** | [**kotlin.collections.List&lt;WebhookTriggerDto&gt;**](WebhookTriggerDto.md) | The list of WebhookTriggerDto objects returned by the operation. |  [optional] |
| **count** | **kotlin.Int** | How many items this response carries: the length of the page for a list, 1 for a single object |  [optional] |
| **total** | **kotlin.Long** | How many items the whole list holds across all pages, for working out how many pages to request. Sent only by the operations that page their results, and left out of every other response |  [optional] |
| **links** | [**kotlin.collections.List&lt;GetPortalPrices200ResponseLinksInner&gt;**](GetPortalPrices200ResponseLinksInner.md) | List of links related to the response |  [optional] |
| **status** | **kotlin.Int** | HTTP status code of the response |  [optional] |
| **statusCode** | **kotlin.Int** | HTTP status code of the response (duplicate of status) |  [optional] |



