
# CurrenciesDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isoCountryCode** | **kotlin.String** | The two-letter ISO code of the country the currency is that of, which is the region the price list was  picked for rather than the country of the caller. |  [optional] |
| **isoCurrencySymbol** | **kotlin.String** | The three-letter ISO 4217 code of the currency. On the first item of the answer it is the currency the  amounts from `GET api/2.0/portal/payment/prices` are expressed in. |  [optional] |
| **currencyNativeName** | **kotlin.String** | The currency name in the language of its own region - not in the portal language, and not a symbol. |  [optional] |



