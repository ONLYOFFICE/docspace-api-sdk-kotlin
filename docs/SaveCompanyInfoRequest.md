
# SaveCompanyInfoRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **companyName** | **kotlin.String** | The company name. |  [optional] |
| **site** | [**java.net.URI**](java.net.URI.md) | The company website, as an absolute URL. |  [optional] |
| **email** | **kotlin.String** | The contact email address. |  [optional] |
| **address** | **kotlin.String** | The postal address. |  [optional] |
| **phone** | **kotlin.String** | The contact phone number. |  [optional] |
| **isLicensor** | **kotlin.Boolean** | Accepted for compatibility with earlier clients and not read: saved details are never those of the licensor, so the server always stores `false`. |  [optional] |
| **hideAbout** | **kotlin.Boolean** | Whether the About page is hidden. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Accepted for compatibility with earlier clients and not read: the server keeps its own value. |  [optional] |



