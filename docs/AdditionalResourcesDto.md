
# AdditionalResourcesDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDocsEnabled** | **kotlin.Boolean** | Whether the sample documents that ONLYOFFICE ships may be placed in a new user's Documents. Unlike the link  flags below it depends on nothing that has to be configured, so its built-in value is always `true`. |  [optional] |
| **helpCenterEnabled** | **kotlin.Boolean** | Whether the interface may offer the Help Center entry. It is `false` both when the entry was switched off  for the installation and when the installation configures no Help Center address at all; the addresses  themselves are not part of this answer and arrive in `externalResources` of `GET api/2.0/settings`. |  [optional] |
| **feedbackAndSupportEnabled** | **kotlin.Boolean** | Whether the interface may offer the Feedback and Support entry, `false` for the same two reasons as  `helpCenterEnabled`. |  [optional] |
| **userForumEnabled** | **kotlin.Boolean** | Whether the interface may offer the user forum entry, `false` for the same two reasons as  `helpCenterEnabled`. |  [optional] |
| **videoGuidesEnabled** | **kotlin.Boolean** | Whether the interface may offer the Video Guides entry, `false` for the same two reasons as  `helpCenterEnabled`. |  [optional] |
| **licenseAgreementsEnabled** | **kotlin.Boolean** | Whether the interface may offer the License Agreements entry, `false` for the same two reasons as  `helpCenterEnabled`. |  [optional] |
| **lastModified** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When these flags were last stored. Flags that were never stored report the moment they were read, and the  answer of the reset operation reports `0001-01-01T00:00:00`. |  [optional] |



