
# FileReference

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **referenceData** | [**FileReferenceData**](FileReferenceData.md) | How this document is named when another spreadsheet refers to it. Send it back as it stands to resolve the  reference again. |  [optional] |
| **error** | **kotlin.String** | Filled in when the reference resolved to nothing; the rest of the descriptor is then empty and must not be  handed to the editors. |  [optional] |
| **path** | **kotlin.String** | The title of the document the reference resolved to. |  [optional] |
| **url** | [**java.net.URI**](java.net.URI.md) | Where the content is fetched from. It is addressed to the host the document service can reach, which on a  deployment with a private editor network is not the address a browser should follow. |  [optional] |
| **fileType** | **kotlin.String** | The format the content is in, without the leading dot. |  [optional] |
| **key** | **kotlin.String** | Identifies the exact revision to the editors: two clients that receive the same key read the same co-editing  session, and the key changes as soon as the document is saved. |  [optional] |
| **link** | **kotlin.String** | The address of the document in the portal web editor - the link to put in front of a person, unlike the  download address above. |  [optional] |
| **token** | **kotlin.String** | Signs this descriptor so that the editors can trust it. It stays empty on a portal that has no signature  secret configured for the document service. |  [optional] |



