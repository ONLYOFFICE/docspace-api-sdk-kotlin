
# ConvertSpreadsheetLayoutRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ignorePrintArea** | **kotlin.Boolean** | Whether the print area chosen in the spreadsheet is ignored; false converts only that area. |  [optional] |
| **orientation** | **kotlin.String** | The page orientation of the output PDF file: portrait or landscape. |  [optional] |
| **fitToHeight** | **kotlin.Int** | The number of pages the converted area is fitted into in height; 0 does not fit it. |  [optional] |
| **scale** | **kotlin.Int** | The scale of the output PDF file, in percent. |  [optional] |
| **fitToWidth** | **kotlin.Int** | The number of pages the converted area is fitted into in width; 0 does not fit it. |  [optional] |
| **headings** | **kotlin.Boolean** | Whether the row and column headings are printed in the output PDF file. |  [optional] |
| **gridLines** | **kotlin.Boolean** | Whether the grid lines are printed in the output PDF file. |  [optional] |
| **margins** | [**ConvertSpreadsheetMarginsRequest**](ConvertSpreadsheetMarginsRequest.md) | The margins of the output PDF file. |  [optional] |
| **pageSize** | [**ConvertSpreadsheetPageSizeRequest**](ConvertSpreadsheetPageSizeRequest.md) | The page size of the output PDF file. |  [optional] |



