
# DepositReportDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **collection** | [**kotlin.collections.List&lt;DepositDto&gt;**](DepositDto.md) | The top-ups on this page. It is empty for a page past the end of the list as well as for a period in which  nothing was paid into the wallet. |  [optional] |
| **offset** | **kotlin.Int** | How many top-ups were skipped before this page, echoed from the request so a client need not remember what it  asked for. |  [optional] |
| **limit** | **kotlin.Int** | How many top-ups one page may hold, echoed from the request; it is 25 unless another value was asked for. A  full page is not proof that more exist - compare `currentPage` with `totalPage`. |  [optional] |
| **totalQuantity** | **kotlin.Int** | How many top-ups match the filters in total, across every page. |  [optional] |
| **totalPage** | **kotlin.Int** | How many pages those top-ups come to at the current `limit`. |  [optional] |
| **currentPage** | **kotlin.Int** | Which of those pages this one is, as the billing service numbers them. Page through by advancing `offset`  rather than this value, which nothing accepts as an argument. |  [optional] |



