
# InfoConfigDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **favorite** | **kotlin.Boolean** | Whether the caller has this document among their favorites. It is empty when favorites do not apply - for an  anonymous caller, for a guest, and for an encrypted document. |  [optional] |
| **folder** | **kotlin.String** | The place of the document as a readable path, its folders joined from the root downwards. It is empty in the  embedded layout, which shows no such panel. |  [optional] |
| **owner** | **kotlin.String** | The display name of the owner of the document. It is empty for an anonymous session. |  [optional] |
| **sharingSettings** | [**kotlin.collections.List&lt;AceShortWrapper&gt;**](AceShortWrapper.md) | Who the document is shared with, as the information panel lists it. An empty list means it is shared with  nobody beyond its owner. |  [optional] |
| **type** | [**EditorType**](EditorType.md) | The layout the information panel is rendered for. |  [optional] |
| **uploaded** | **kotlin.String** | When the document was created on the portal, already formatted for reading in the culture of the caller rather  than as a machine timestamp. |  [optional] |



