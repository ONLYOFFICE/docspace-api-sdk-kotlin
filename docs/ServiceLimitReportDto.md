
# ServiceLimitReportDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **collection** | [**kotlin.collections.List&lt;ServiceLimitDto&gt;**](ServiceLimitDto.md) | The limits of this page, one per user; empty when no limit applies to any user or the page is past the end. |  [optional] |
| **offset** | **kotlin.Int** | The number of limits skipped before this page. |  [optional] |
| **limit** | **kotlin.Int** | The page size the page was read with. |  [optional] |
| **totalPage** | **kotlin.Int** | The number of pages the whole list takes at this page size. |  [optional] |
| **currentPage** | **kotlin.Int** | The number of this page, starting from 1. |  [optional] |
| **totalQuantity** | **kotlin.Int** | The number of users with a limit in force across all pages. |  [optional] |



