
# PageableClientResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;data&#x60;** | [**kotlin.collections.List&lt;ClientResponse&gt;**](ClientResponse.md) | The items on this page, at most as many as the requested limit. An empty array means there is nothing further to read. |  [optional] |
| **limit** | **kotlin.Int** | The page size that was applied to this request, between 1 and 50. |  [optional] |
| **lastClientId** | **kotlin.String** | The cursor to send back as last_client_id to ask for the next page, together with last_created_on. It is null when the page is empty. |  [optional] |
| **lastCreatedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The cursor to send back as last_created_on to ask for the next page, together with last_client_id. It is null when the page is empty. |  [optional] |



