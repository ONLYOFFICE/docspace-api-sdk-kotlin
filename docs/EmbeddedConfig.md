
# EmbeddedConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **embedUrl** | **kotlin.String** | The page to put into the frame. It is empty when the opening carries no external share key, since a framed  viewer cannot authenticate a portal member. |  [optional] |
| **saveUrl** | **kotlin.String** | Where the download button of the framed viewer leads. |  [optional] [readonly] |
| **shareLinkParam** | **kotlin.String** | The query fragment carrying the external share key, ampersand included, out of which the addresses around it  are built. |  [optional] |
| **shareUrl** | **kotlin.String** | The address behind the share button of the framed viewer, the document opened full-screen for reading. It is  empty when the opening carries no external share key. |  [optional] |
| **toolbarDocked** | **kotlin.String** | Where the framed viewer puts its toolbar. The portal always asks for the top. |  [optional] [readonly] |



