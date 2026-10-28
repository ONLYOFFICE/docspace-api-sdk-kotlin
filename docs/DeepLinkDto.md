
# DeepLinkDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **androidPackageName** | **kotlin.String** | The package name to look for on Android, and to build a store link from when the application is missing.  All three fields are empty strings on an installation that ships no mobile application, which is the  signal to keep opening links in the browser. |  |
| **url** | **kotlin.String** | The address the client redirects a portal link through so that the application can claim it. It is the  installation's own deep-link host, not a link to any particular document. |  |
| **iosPackageId** | **kotlin.String** | The bundle identifier to look for on iOS, used the same way as `androidPackageName`. |  |



