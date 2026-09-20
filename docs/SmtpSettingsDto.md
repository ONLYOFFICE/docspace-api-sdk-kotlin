
# SmtpSettingsDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **host** | **kotlin.String** | The host name or address of the mail server. On a cloud portal that has saved no relay of its own every  field of this object comes back empty, because the installation's own server is not disclosed - only  `isDefaultSettings` is set there. |  [optional] |
| **port** | **kotlin.Int** | The port the mail server is reached on - conventionally 25 or 587 without encryption from the start, 465  with it. It is empty when no port was stored, in which case the portal falls back to its own default. |  [optional] |
| **senderAddress** | **kotlin.String** | The address the letters are sent from, which appears in the From header and is what a reply goes to. |  [optional] |
| **senderDisplayName** | **kotlin.String** | The name shown beside that address in a recipient's mailbox. |  [optional] |
| **credentialsUserName** | **kotlin.String** | The account the portal signs in to the mail server as, meaningful only while `enableAuth` is `true`. |  [optional] |
| **credentialsUserPassword** | **kotlin.String** | Always empty here: the stored password is never returned, so a client that sends these settings back has  to supply it again rather than echoing what it read. |  [optional] |
| **enableSSL** | **kotlin.Boolean** | Whether the connection to the mail server is encrypted. |  [optional] |
| **enableAuth** | **kotlin.Boolean** | Whether the portal signs in to the mail server at all. While it is `false` the credentials above are  ignored and the server is expected to accept mail unauthenticated. |  [optional] |
| **useNtlm** | **kotlin.Boolean** | Always `false` here: the flag is accepted when settings are saved but is not stored, so it never comes  back set and says nothing about how the portal authenticates. |  [optional] |
| **isDefaultSettings** | **kotlin.Boolean** | Whether the portal is still on the mail configuration of the installation rather than on a relay of its  own. `DELETE api/2.0/smtpsettings/smtp` puts it back to `true`, and while it is `true` on a cloud portal  the fields above are blank rather than showing the installation's server. |  [optional] |



