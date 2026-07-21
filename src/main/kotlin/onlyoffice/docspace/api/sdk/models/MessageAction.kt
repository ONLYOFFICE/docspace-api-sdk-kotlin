 /*
 * (c) Copyright Ascensio System SIA 2026
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package onlyoffice.docspace.api.sdk.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * [1000 - Login success, 1001 - Login success via social account, 1002 - Login fail invalid combination, 1003 - Login fail social account not found, 1004 - Login fail disabled profile, 1005 - Login fail, 1006 - Logout, 1007 - Login success via sms, 1008 - Login fail via sms, 1009 - Login fail ip security, 1010 - Login success via api, 1011 - Login success via social app, 1012 - Login success via api sms, 1013 - Login fail via api, 1014 - Login fail via api sms, 1015 - Login success via SSO, 1016 - Session started, 1017 - Session completed, 1018 - Login fail via SSO, 1019 - Login success via api social account, 1020 - Login fail via api social account, 1021 - Login succes via tfa app, 1022 - Login fail via Tfa app, 1023 - Login fail brute force, 1024 - Login success via api tfa, 1025 - Login fail via api tfa, 1026 - Login fail recaptcha, 1027 - Authorization link activated, 1028 - Login success via OAuth 2.0, 1029 - Login success via login and password, 4000 - User created, 4001 - Guest created, 4002 - User created via invite, 4003 - Guest created via invite, 4004 - User activated, 4005 - Guest activated, 4006 - User updated, 4007 - User updated language, 4008 - User added avatar, 4009 - User deleted avatar, 4010 - User updated avatar thumbnails, 4011 - User linked social account, 4012 - User unlinked social account, 4013 - User sent activation instructions, 4014 - User sent email change instructions, 4015 - User sent password change instructions, 4016 - User sent delete instructions, 4017 - User updated password, 4018 - User deleted, 4019 - Users updated type, 4020 - Users updated status, 4021 - Users sent activation instructions, 4022 - Users deleted, 4023 - Sent invite instructions, 4024 - User imported, 4025 - Guest imported, 4026 - Group created, 4027 - Group updated, 4028 - Group deleted, 4029 - User updated mobile number, 4030 - User data reassigns, 4031 - User data removing, 4032 - User connected tfa app, 4033 - User disconnected tfa app, 4034 - User logout active connections, 4035 - User logout active connection, 4036 - User logout active connections for user, 4037 - Send join invite, 5000 - File created, 5001 - File renamed, 5002 - File updated, 5003 - File created version, 5004 - File deleted version, 5005 - File updated revision comment, 5006 - File locked, 5007 - File unlocked, 5008 - File updated access, 5009 - File downloaded, 5010 - File downloaded as, 5011 - File uploaded, 5012 - File imported, 5013 - File copied, 5014 - File copied with overwriting, 5015 - File moved, 5016 - File moved with overwriting, 5017 - File moved to trash, 5018 - File deleted, 5019 - Folder created, 5020 - Folder renamed, 5021 - Folder updated access, 5022 - Folder copied, 5023 - Folder copied with overwriting, 5024 - Folder moved, 5025 - Folder moved with overwriting, 5026 - Folder moved to trash, 5027 - Folder deleted, 5028 - ThirdParty created, 5029 - ThirdParty updated, 5030 - ThirdParty deleted, 5031 - Documents ThirdParty settings updated, 5032 - Documents overwriting settings updated, 5033 - Documents uploading formats settings updated, 5034 - User file updated, 5035 - File converted, 5036 - File send access link, 5037 - Document service location setting, 5038 - Authorization keys setting, 5039 - Full text search setting, 5040 - Start transfer setting, 5041 - Backup started, 5042 - License key uploaded, 5043 - File change owner, 5044 - File restore version, 5045 - Document send to sign, 5046 - Document sign complete, 5047 - User updated email, 5048 - Documents store forcesave, 5049 - Documents forcesave, 5050 - Start storage encryption, 5051 - Privacy room enable, 5052 - Privacy room disable, 5053 - Start storage decryption, 5054 - File opened for change, 5055 - File marked as favorite, 5056 - File removed from favorite, 5057 - Folder downloaded, 5058 - File removed from list, 5059 - Folder removed from list, 5060 - File external link access updated, 5061 - Trash emptied, 5062 - File revision downloaded, 5063 - File marked as read, 5064 - File readed, 5065 - Folder marked as read, 5066 - Folder updated access for, 5068 - File updated access for, 5069 - Documents external share settings updated, 5070 - Room created, 5071 - Room renamed, 5072 - Room archived, 5073 - Room unarchived, 5074 - Room deleted, 5075 - Room update access for user, 5076 - Tag created, 5077 - Tags deleted, 5078 - Added room tags, 5079 - Deleted room tags, 5080 - Room logo created, 5081 - Room logo deleted, 5082 - Room invitation link updated, 5083 - Documents keep new file name settings updated, 5084 - Room remove user, 5085 - Room create user, 5086 - Room invitation link created, 5087 - Room invitation link deleted, 5088 - Room external link created, 5089 - Room external link updated, 5090 - Room external link deleted, 5091 - File external link created, 5092 - File external link updated, 5093 - File external link deleted, 5094 - Room group added, 5095 - Room update access for group, 5096 - Room group remove, 5097 - Room external link revoked, 5098 - Room external link renamed, 5099 - File uploaded with overwriting, 5100 - Room copied, 5101 - Documents display file extension updated, 5102 - Room color changed, 5103 - Room cover changed, 5104 - Room indexing changed, 5105 - Room deny download changed, 5106 - Room index export saved, 5107 - Folder index changed, 5108 - Folder index reordered, 5109 - Room deny download enabled, 5110 - Room deny download disabled, 5111 - File index changed, 5112 - Room watermark set, 5113 - Room watermark disabled, 5114 - Room index export saved, 5115 - Room indexing disabled, 5116 - Room life time set, 5117 - Room life time disabled, 5118 - Room invite resend, 5119 - File version deleted, 5120 - File custom filter enabled, 5121 - File custom filter disabled, 5122 - Folder external link created, 5123 - Folder external link updated, 5124 - Folder external link deleted, 5125 - Backup completed, 5126 - Backup failed, 5127 - Scheduled backup started, 5128 - Scheduled backup completed, 5129 - Scheduled backup failed, 5130 - Scheduled backup deleted, 5131 - Backup cancelled, 5132 - Restore started, 5133 - Restore cancelled, 5150 - Form started to fill, 5151 - Form partially filled, 5152 - Form completely filled, 5153 - Form stopped, 5154 - AI agent created, 5155 - AI agent renamed, 5156 - AI agent deleted, 5157 - MCP server added to AI agent, 5158 - MCP server deleted from AI agent, 5159 - Room change owner, 5160 - Documents default templates settings updated, 5201 - File saved, user quota exceeded, 5202 - File not saved due to user quota exceeded, 5203 - File saved, room quota exceeded, 5204 - File not saved due to room quota exceeded, 5501 - Ldap enabled, 5502 - Ldap disabled, 5503 - LDAP synchronization completed, 6000 - Language settings updated, 6001 - Time zone settings updated, 6002 - Dns settings updated, 6003 - Trusted mail domain settings updated, 6004 - Password strength settings updated, 6005 - Two factor authentication settings updated, 6006 - Administrator message settings updated, 6007 - Default start page settings updated, 6008 - Products list updated, 6009 - Administrator added, 6010 - Administrator opened full access, 6011 - Administrator deleted, 6012 - Users opened product access, 6013 - Groups opened product access, 6014 - Product access opened, 6015 - Product access restricted, 6016 - Product added administrator, 6017 - Product deleted administrator, 6018 - Greeting settings updated, 6019 - Team template changed, 6020 - Color theme changed, 6021 - Owner sent change owner instructions, 6022 - Owner updated, 6023 - Owner sent portal deactivation instructions, 6024 - Owner sent portal delete instructions, 6025 - Portal deactivated, 6026 - Portal deleted, 6027 - Login history report downloaded, 6028 - Audit trail report downloaded, 6029 - SSO enabled, 6030 - SSO disabled, 6031 - Portal access settings updated, 6032 - Cookie settings updated, 6033 - Mail service settings updated, 6034 - Custom navigation settings updated, 6035 - Audit settings updated, 6036 - Two factor authentication disabled, 6037 - Two factor authentication enabled by sms, 6038 - Two factor authentication enabled by tfa app, 6039 - Portal renamed, 6040 - Quota per room changed, 6041 - Quota per room disabled, 6042 - Quota per user changed, 6043 - Quota per user disabled, 6044 - Quota per portal changed, 6045 - Quota per portal disabled, 6046 - Form submit, 6047 - Form opened for filling, 6048 - Custom quota per room default, 6049 - Custom quota per room changed, 6050 - Custom quota per room disabled, 6051 - Custom quota per user default, 6052 - Custom quota per user changed, 6053 - Custom quota per user disabled, 6054 - DevTools access settings changed, 6055 - Webhook created, 6056 - Webhook updated, 6057 - Webhook deleted, 6058 - Created api key, 6059 - Update api key, 6060 - Deleted User api key, 6061 - Customer wallet topped up, 6062 - Customer operation performed, 6063 - Customer operations report downloaded, 6064 - Customer wallet top up settings updated, 6065 - Customer subscription updated, 6066 - Promotional banners visibility settings changed, 6067 - Customer wallet services settings updated, 6068 - Quota per AI agent changed, 6069 - Quota per AI agent disabled, 6070 - Custom quota per AI agent default, 6071 - Custom quota per AI agent changed, 6072 - Custom quota per AI agent disabled, 6073 - AI provider created, 6074 - AI provider updated, 6075 - AI provider deleted, 6076 - MCP server created, 6077 - MCP server updated, 6078 - MCP server enabled, 6079 - MCP server disabled, 6080 - MCP server deleted, 6081 - WebSearch settings configured, 6082 - WebSearch settings reset, 6083 - Vectorization settings configured, 6084 - Vectorization settings reset, 6085 - Webplugin uploaded, 6086 - Webplugin updated, 6087 - Webplugin deleted, 6088 - Whitelabel settings logo text updated, 6089 - Whitelabel settings logos updated, 6090 - Whitelabel company settings updated, 6091 - Whitelabel additional settings updated, 6092 - Whitelabel mail settings updated, 6093 - Invitation settings updated, 6094 - IP restrictions settings updated, 6095 - Login settings updated, 6096 - AI default provider set, 6097 - AI access enabled, 6098 - AI access disabled, 6099 - User AI settings updated, 7000 - Contact admin mail sent, 7001 - Room invite link used, 7002 - User created and added to room, 7003 - Guest created and added to room, 7004 - Contact sales mail sent, 9901 - Create client, 9902 - Update client, 9903 - Regenerate secret, 9904 - Delete client, 9905 - Change client activation, 9906 - Change client visibility, 9907 - Revoke user client, 9908 - Generate authorization code token, 9909 - Generate personal access token, -1 - None]
 *
 * Values: LoginSuccess,LoginSuccessViaSocialAccount,LoginFailInvalidCombination,LoginFailSocialAccountNotFound,LoginFailDisabledProfile,LoginFail,Logout,LoginSuccessViaSms,LoginFailViaSms,LoginFailIpSecurity,LoginSuccessViaApi,LoginSuccessViaSocialApp,LoginSuccessViaApiSms,LoginFailViaApi,LoginFailViaApiSms,LoginSuccessViaSSO,SessionStarted,SessionCompleted,LoginFailViaSSO,LoginSuccessViaApiSocialAccount,LoginFailViaApiSocialAccount,LoginSuccesViaTfaApp,LoginFailViaTfaApp,LoginFailBruteForce,LoginSuccessViaApiTfa,LoginFailViaApiTfa,LoginFailRecaptcha,AuthLinkActivated,LoginSuccessViaOAuth,LoginSuccessViaPassword,UserCreated,GuestCreated,UserCreatedViaInvite,GuestCreatedViaInvite,UserActivated,GuestActivated,UserUpdated,UserUpdatedLanguage,UserAddedAvatar,UserDeletedAvatar,UserUpdatedAvatarThumbnails,UserLinkedSocialAccount,UserUnlinkedSocialAccount,UserSentActivationInstructions,UserSentEmailChangeInstructions,UserSentPasswordChangeInstructions,UserSentDeleteInstructions,UserUpdatedPassword,UserDeleted,UsersUpdatedType,UsersUpdatedStatus,UsersSentActivationInstructions,UsersDeleted,SentInviteInstructions,UserImported,GuestImported,GroupCreated,GroupUpdated,GroupDeleted,UserUpdatedMobileNumber,UserDataReassigns,UserDataRemoving,UserConnectedTfaApp,UserDisconnectedTfaApp,UserLogoutActiveConnections,UserLogoutActiveConnection,UserLogoutActiveConnectionsForUser,SendJoinInvite,FileCreated,FileRenamed,FileUpdated,FileCreatedVersion,FileDeletedVersion,FileUpdatedRevisionComment,FileLocked,FileUnlocked,FileUpdatedAccess,FileDownloaded,FileDownloadedAs,FileUploaded,FileImported,FileCopied,FileCopiedWithOverwriting,FileMoved,FileMovedWithOverwriting,FileMovedToTrash,FileDeleted,FolderCreated,FolderRenamed,FolderUpdatedAccess,FolderCopied,FolderCopiedWithOverwriting,FolderMoved,FolderMovedWithOverwriting,FolderMovedToTrash,FolderDeleted,ThirdPartyCreated,ThirdPartyUpdated,ThirdPartyDeleted,DocumentsThirdPartySettingsUpdated,DocumentsOverwritingSettingsUpdated,DocumentsUploadingFormatsSettingsUpdated,UserFileUpdated,FileConverted,FileSendAccessLink,DocumentServiceLocationSetting,AuthorizationKeysSetting,FullTextSearchSetting,StartTransferSetting,BackupStarted,LicenseKeyUploaded,FileChangeOwner,FileRestoreVersion,DocumentSendToSign,DocumentSignComplete,UserUpdatedEmail,DocumentsStoreForcesave,DocumentsForcesave,StartStorageEncryption,PrivacyRoomEnable,PrivacyRoomDisable,StartStorageDecryption,FileOpenedForChange,FileMarkedAsFavorite,FileRemovedFromFavorite,FolderDownloaded,FileRemovedFromList,FolderRemovedFromList,FileExternalLinkAccessUpdated,TrashEmptied,FileRevisionDownloaded,FileMarkedAsRead,FileReaded,FolderMarkedAsRead,FolderUpdatedAccessFor,FileUpdatedAccessFor,DocumentsExternalShareSettingsUpdated,RoomCreated,RoomRenamed,RoomArchived,RoomUnarchived,RoomDeleted,RoomUpdateAccessForUser,TagCreated,TagsDeleted,AddedRoomTags,DeletedRoomTags,RoomLogoCreated,RoomLogoDeleted,RoomInvitationLinkUpdated,DocumentsKeepNewFileNameSettingsUpdated,RoomRemoveUser,RoomCreateUser,RoomInvitationLinkCreated,RoomInvitationLinkDeleted,RoomExternalLinkCreated,RoomExternalLinkUpdated,RoomExternalLinkDeleted,FileExternalLinkCreated,FileExternalLinkUpdated,FileExternalLinkDeleted,RoomGroupAdded,RoomUpdateAccessForGroup,RoomGroupRemove,RoomExternalLinkRevoked,RoomExternalLinkRenamed,FileUploadedWithOverwriting,RoomCopied,DocumentsDisplayFileExtensionUpdated,RoomColorChanged,RoomCoverChanged,RoomIndexingChanged,RoomDenyDownloadChanged,RoomIndexExportSaved,FolderIndexChanged,FolderIndexReordered,RoomDenyDownloadEnabled,RoomDenyDownloadDisabled,FileIndexChanged,RoomWatermarkSet,RoomWatermarkDisabled,RoomIndexingEnabled,RoomIndexingDisabled,RoomLifeTimeSet,RoomLifeTimeDisabled,RoomInviteResend,FileVersionRemoved,FileCustomFilterEnabled,FileCustomFilterDisabled,FolderExternalLinkCreated,FolderExternalLinkUpdated,FolderExternalLinkDeleted,BackupCompleted,BackupFailed,ScheduledBackupStarted,ScheduledBackupCompleted,ScheduledBackupFailed,ScheduledBackupDeleted,BackupCancelled,RestoreStarted,RestoreCancelled,FormStartedToFill,FormPartiallyFilled,FormCompletelyFilled,FormStopped,AgentCreated,AgentRenamed,AgentDeleted,AddedServerToAgent,DeletedServerFromAgent,RoomChangeOwner,DocumentsDefaultTemplatesSettingsUpdated,FileSavedButUserQuotaExceeded,FileNotSavedDueToUserQuota,FileSavedButRoomQuotaExceeded,FileNotSavedDueToRoomQuota,LdapEnabled,LdapDisabled,LdapSync,LanguageSettingsUpdated,TimeZoneSettingsUpdated,DnsSettingsUpdated,TrustedMailDomainSettingsUpdated,PasswordStrengthSettingsUpdated,TwoFactorAuthenticationSettingsUpdated,AdministratorMessageSettingsUpdated,DefaultStartPageSettingsUpdated,ProductsListUpdated,AdministratorAdded,AdministratorOpenedFullAccess,AdministratorDeleted,UsersOpenedProductAccess,GroupsOpenedProductAccess,ProductAccessOpened,ProductAccessRestricted,ProductAddedAdministrator,ProductDeletedAdministrator,GreetingSettingsUpdated,TeamTemplateChanged,ColorThemeChanged,OwnerSentChangeOwnerInstructions,OwnerUpdated,OwnerSentPortalDeactivationInstructions,OwnerSentPortalDeleteInstructions,PortalDeactivated,PortalDeleted,LoginHistoryReportDownloaded,AuditTrailReportDownloaded,SSOEnabled,SSODisabled,PortalAccessSettingsUpdated,CookieSettingsUpdated,MailServiceSettingsUpdated,CustomNavigationSettingsUpdated,AuditSettingsUpdated,TwoFactorAuthenticationDisabled,TwoFactorAuthenticationEnabledBySms,TwoFactorAuthenticationEnabledByTfaApp,PortalRenamed,QuotaPerRoomChanged,QuotaPerRoomDisabled,QuotaPerUserChanged,QuotaPerUserDisabled,QuotaPerPortalChanged,QuotaPerPortalDisabled,FormSubmit,FormOpenedForFilling,CustomQuotaPerRoomDefault,CustomQuotaPerRoomChanged,CustomQuotaPerRoomDisabled,CustomQuotaPerUserDefault,CustomQuotaPerUserChanged,CustomQuotaPerUserDisabled,DevToolsAccessSettingsChanged,WebhookCreated,WebhookUpdated,WebhookDeleted,ApiKeyCreated,ApiKeyUpdated,ApiKeyDeleted,CustomerWalletToppedUp,CustomerOperationPerformed,CustomerOperationsReportDownloaded,CustomerWalletTopUpSettingsUpdated,CustomerSubscriptionUpdated,BannerSettingsChanged,CustomerWalletServicesSettingsUpdated,QuotaPerAiAgentChanged,QuotaPerAiAgentDisabled,CustomQuotaPerAiAgentDefault,CustomQuotaPerAiAgentChanged,CustomQuotaPerAiAgentDisabled,AIProviderCreated,AIProviderUpdated,AIProviderDeleted,ServerCreated,ServerUpdated,ServerEnabled,ServerDisabled,ServerDeleted,SetWebSearchSettings,ResetWebSearchSettings,SetVectorizationSettings,ResetVectorizationSettings,WebpluginUploaded,WebpluginUpdated,WebpluginDeleted,WhiteLabelSettingsLogoTextUpdated,WhiteLabelSettingsLogosUpdated,WhiteLabelCompanySettingsUpdated,WhiteLabelAdditionalSettingsUpdated,WhiteLabelMailSettingsUpdated,InvitationSettingsUpdated,IPRestrictionsSettingsUpdated,LoginSettingsUpdated,AIDefaultProviderSet,AIAccessEnabled,AIAccessDisabled,UserUpdatedAiSettings,ContactAdminMailSent,RoomInviteLinkUsed,UserCreatedAndAddedToRoom,GuestCreatedAndAddedToRoom,ContactSalesMailSent,CreateClient,UpdateClient,RegenerateSecret,DeleteClient,ChangeClientActivation,ChangeClientVisibility,RevokeUserClient,GenerateAuthorizationCodeToken,GeneratePersonalAccessToken,None
 */

@JsonClass(generateAdapter = false)
enum class MessageAction(val value: kotlin.Int) {

    @Json(name = "1000")
    LoginSuccess(1000),

    @Json(name = "1001")
    LoginSuccessViaSocialAccount(1001),

    @Json(name = "1002")
    LoginFailInvalidCombination(1002),

    @Json(name = "1003")
    LoginFailSocialAccountNotFound(1003),

    @Json(name = "1004")
    LoginFailDisabledProfile(1004),

    @Json(name = "1005")
    LoginFail(1005),

    @Json(name = "1006")
    Logout(1006),

    @Json(name = "1007")
    LoginSuccessViaSms(1007),

    @Json(name = "1008")
    LoginFailViaSms(1008),

    @Json(name = "1009")
    LoginFailIpSecurity(1009),

    @Json(name = "1010")
    LoginSuccessViaApi(1010),

    @Json(name = "1011")
    LoginSuccessViaSocialApp(1011),

    @Json(name = "1012")
    LoginSuccessViaApiSms(1012),

    @Json(name = "1013")
    LoginFailViaApi(1013),

    @Json(name = "1014")
    LoginFailViaApiSms(1014),

    @Json(name = "1015")
    LoginSuccessViaSSO(1015),

    @Json(name = "1016")
    SessionStarted(1016),

    @Json(name = "1017")
    SessionCompleted(1017),

    @Json(name = "1018")
    LoginFailViaSSO(1018),

    @Json(name = "1019")
    LoginSuccessViaApiSocialAccount(1019),

    @Json(name = "1020")
    LoginFailViaApiSocialAccount(1020),

    @Json(name = "1021")
    LoginSuccesViaTfaApp(1021),

    @Json(name = "1022")
    LoginFailViaTfaApp(1022),

    @Json(name = "1023")
    LoginFailBruteForce(1023),

    @Json(name = "1024")
    LoginSuccessViaApiTfa(1024),

    @Json(name = "1025")
    LoginFailViaApiTfa(1025),

    @Json(name = "1026")
    LoginFailRecaptcha(1026),

    @Json(name = "1027")
    AuthLinkActivated(1027),

    @Json(name = "1028")
    LoginSuccessViaOAuth(1028),

    @Json(name = "1029")
    LoginSuccessViaPassword(1029),

    @Json(name = "4000")
    UserCreated(4000),

    @Json(name = "4001")
    GuestCreated(4001),

    @Json(name = "4002")
    UserCreatedViaInvite(4002),

    @Json(name = "4003")
    GuestCreatedViaInvite(4003),

    @Json(name = "4004")
    UserActivated(4004),

    @Json(name = "4005")
    GuestActivated(4005),

    @Json(name = "4006")
    UserUpdated(4006),

    @Json(name = "4007")
    UserUpdatedLanguage(4007),

    @Json(name = "4008")
    UserAddedAvatar(4008),

    @Json(name = "4009")
    UserDeletedAvatar(4009),

    @Json(name = "4010")
    UserUpdatedAvatarThumbnails(4010),

    @Json(name = "4011")
    UserLinkedSocialAccount(4011),

    @Json(name = "4012")
    UserUnlinkedSocialAccount(4012),

    @Json(name = "4013")
    UserSentActivationInstructions(4013),

    @Json(name = "4014")
    UserSentEmailChangeInstructions(4014),

    @Json(name = "4015")
    UserSentPasswordChangeInstructions(4015),

    @Json(name = "4016")
    UserSentDeleteInstructions(4016),

    @Json(name = "4017")
    UserUpdatedPassword(4017),

    @Json(name = "4018")
    UserDeleted(4018),

    @Json(name = "4019")
    UsersUpdatedType(4019),

    @Json(name = "4020")
    UsersUpdatedStatus(4020),

    @Json(name = "4021")
    UsersSentActivationInstructions(4021),

    @Json(name = "4022")
    UsersDeleted(4022),

    @Json(name = "4023")
    SentInviteInstructions(4023),

    @Json(name = "4024")
    UserImported(4024),

    @Json(name = "4025")
    GuestImported(4025),

    @Json(name = "4026")
    GroupCreated(4026),

    @Json(name = "4027")
    GroupUpdated(4027),

    @Json(name = "4028")
    GroupDeleted(4028),

    @Json(name = "4029")
    UserUpdatedMobileNumber(4029),

    @Json(name = "4030")
    UserDataReassigns(4030),

    @Json(name = "4031")
    UserDataRemoving(4031),

    @Json(name = "4032")
    UserConnectedTfaApp(4032),

    @Json(name = "4033")
    UserDisconnectedTfaApp(4033),

    @Json(name = "4034")
    UserLogoutActiveConnections(4034),

    @Json(name = "4035")
    UserLogoutActiveConnection(4035),

    @Json(name = "4036")
    UserLogoutActiveConnectionsForUser(4036),

    @Json(name = "4037")
    SendJoinInvite(4037),

    @Json(name = "5000")
    FileCreated(5000),

    @Json(name = "5001")
    FileRenamed(5001),

    @Json(name = "5002")
    FileUpdated(5002),

    @Json(name = "5003")
    FileCreatedVersion(5003),

    @Json(name = "5004")
    FileDeletedVersion(5004),

    @Json(name = "5005")
    FileUpdatedRevisionComment(5005),

    @Json(name = "5006")
    FileLocked(5006),

    @Json(name = "5007")
    FileUnlocked(5007),

    @Json(name = "5008")
    FileUpdatedAccess(5008),

    @Json(name = "5009")
    FileDownloaded(5009),

    @Json(name = "5010")
    FileDownloadedAs(5010),

    @Json(name = "5011")
    FileUploaded(5011),

    @Json(name = "5012")
    FileImported(5012),

    @Json(name = "5013")
    FileCopied(5013),

    @Json(name = "5014")
    FileCopiedWithOverwriting(5014),

    @Json(name = "5015")
    FileMoved(5015),

    @Json(name = "5016")
    FileMovedWithOverwriting(5016),

    @Json(name = "5017")
    FileMovedToTrash(5017),

    @Json(name = "5018")
    FileDeleted(5018),

    @Json(name = "5019")
    FolderCreated(5019),

    @Json(name = "5020")
    FolderRenamed(5020),

    @Json(name = "5021")
    FolderUpdatedAccess(5021),

    @Json(name = "5022")
    FolderCopied(5022),

    @Json(name = "5023")
    FolderCopiedWithOverwriting(5023),

    @Json(name = "5024")
    FolderMoved(5024),

    @Json(name = "5025")
    FolderMovedWithOverwriting(5025),

    @Json(name = "5026")
    FolderMovedToTrash(5026),

    @Json(name = "5027")
    FolderDeleted(5027),

    @Json(name = "5028")
    ThirdPartyCreated(5028),

    @Json(name = "5029")
    ThirdPartyUpdated(5029),

    @Json(name = "5030")
    ThirdPartyDeleted(5030),

    @Json(name = "5031")
    DocumentsThirdPartySettingsUpdated(5031),

    @Json(name = "5032")
    DocumentsOverwritingSettingsUpdated(5032),

    @Json(name = "5033")
    DocumentsUploadingFormatsSettingsUpdated(5033),

    @Json(name = "5034")
    UserFileUpdated(5034),

    @Json(name = "5035")
    FileConverted(5035),

    @Json(name = "5036")
    FileSendAccessLink(5036),

    @Json(name = "5037")
    DocumentServiceLocationSetting(5037),

    @Json(name = "5038")
    AuthorizationKeysSetting(5038),

    @Json(name = "5039")
    FullTextSearchSetting(5039),

    @Json(name = "5040")
    StartTransferSetting(5040),

    @Json(name = "5041")
    BackupStarted(5041),

    @Json(name = "5042")
    LicenseKeyUploaded(5042),

    @Json(name = "5043")
    FileChangeOwner(5043),

    @Json(name = "5044")
    FileRestoreVersion(5044),

    @Json(name = "5045")
    DocumentSendToSign(5045),

    @Json(name = "5046")
    DocumentSignComplete(5046),

    @Json(name = "5047")
    UserUpdatedEmail(5047),

    @Json(name = "5048")
    DocumentsStoreForcesave(5048),

    @Json(name = "5049")
    DocumentsForcesave(5049),

    @Json(name = "5050")
    StartStorageEncryption(5050),

    @Json(name = "5051")
    PrivacyRoomEnable(5051),

    @Json(name = "5052")
    PrivacyRoomDisable(5052),

    @Json(name = "5053")
    StartStorageDecryption(5053),

    @Json(name = "5054")
    FileOpenedForChange(5054),

    @Json(name = "5055")
    FileMarkedAsFavorite(5055),

    @Json(name = "5056")
    FileRemovedFromFavorite(5056),

    @Json(name = "5057")
    FolderDownloaded(5057),

    @Json(name = "5058")
    FileRemovedFromList(5058),

    @Json(name = "5059")
    FolderRemovedFromList(5059),

    @Json(name = "5060")
    FileExternalLinkAccessUpdated(5060),

    @Json(name = "5061")
    TrashEmptied(5061),

    @Json(name = "5062")
    FileRevisionDownloaded(5062),

    @Json(name = "5063")
    FileMarkedAsRead(5063),

    @Json(name = "5064")
    FileReaded(5064),

    @Json(name = "5065")
    FolderMarkedAsRead(5065),

    @Json(name = "5066")
    FolderUpdatedAccessFor(5066),

    @Json(name = "5068")
    FileUpdatedAccessFor(5068),

    @Json(name = "5069")
    DocumentsExternalShareSettingsUpdated(5069),

    @Json(name = "5070")
    RoomCreated(5070),

    @Json(name = "5071")
    RoomRenamed(5071),

    @Json(name = "5072")
    RoomArchived(5072),

    @Json(name = "5073")
    RoomUnarchived(5073),

    @Json(name = "5074")
    RoomDeleted(5074),

    @Json(name = "5075")
    RoomUpdateAccessForUser(5075),

    @Json(name = "5076")
    TagCreated(5076),

    @Json(name = "5077")
    TagsDeleted(5077),

    @Json(name = "5078")
    AddedRoomTags(5078),

    @Json(name = "5079")
    DeletedRoomTags(5079),

    @Json(name = "5080")
    RoomLogoCreated(5080),

    @Json(name = "5081")
    RoomLogoDeleted(5081),

    @Json(name = "5082")
    RoomInvitationLinkUpdated(5082),

    @Json(name = "5083")
    DocumentsKeepNewFileNameSettingsUpdated(5083),

    @Json(name = "5084")
    RoomRemoveUser(5084),

    @Json(name = "5085")
    RoomCreateUser(5085),

    @Json(name = "5086")
    RoomInvitationLinkCreated(5086),

    @Json(name = "5087")
    RoomInvitationLinkDeleted(5087),

    @Json(name = "5088")
    RoomExternalLinkCreated(5088),

    @Json(name = "5089")
    RoomExternalLinkUpdated(5089),

    @Json(name = "5090")
    RoomExternalLinkDeleted(5090),

    @Json(name = "5091")
    FileExternalLinkCreated(5091),

    @Json(name = "5092")
    FileExternalLinkUpdated(5092),

    @Json(name = "5093")
    FileExternalLinkDeleted(5093),

    @Json(name = "5094")
    RoomGroupAdded(5094),

    @Json(name = "5095")
    RoomUpdateAccessForGroup(5095),

    @Json(name = "5096")
    RoomGroupRemove(5096),

    @Json(name = "5097")
    RoomExternalLinkRevoked(5097),

    @Json(name = "5098")
    RoomExternalLinkRenamed(5098),

    @Json(name = "5099")
    FileUploadedWithOverwriting(5099),

    @Json(name = "5100")
    RoomCopied(5100),

    @Json(name = "5101")
    DocumentsDisplayFileExtensionUpdated(5101),

    @Json(name = "5102")
    RoomColorChanged(5102),

    @Json(name = "5103")
    RoomCoverChanged(5103),

    @Json(name = "5104")
    RoomIndexingChanged(5104),

    @Json(name = "5105")
    RoomDenyDownloadChanged(5105),

    @Json(name = "5106")
    RoomIndexExportSaved(5106),

    @Json(name = "5107")
    FolderIndexChanged(5107),

    @Json(name = "5108")
    FolderIndexReordered(5108),

    @Json(name = "5109")
    RoomDenyDownloadEnabled(5109),

    @Json(name = "5110")
    RoomDenyDownloadDisabled(5110),

    @Json(name = "5111")
    FileIndexChanged(5111),

    @Json(name = "5112")
    RoomWatermarkSet(5112),

    @Json(name = "5113")
    RoomWatermarkDisabled(5113),

    @Json(name = "5114")
    RoomIndexingEnabled(5114),

    @Json(name = "5115")
    RoomIndexingDisabled(5115),

    @Json(name = "5116")
    RoomLifeTimeSet(5116),

    @Json(name = "5117")
    RoomLifeTimeDisabled(5117),

    @Json(name = "5118")
    RoomInviteResend(5118),

    @Json(name = "5119")
    FileVersionRemoved(5119),

    @Json(name = "5120")
    FileCustomFilterEnabled(5120),

    @Json(name = "5121")
    FileCustomFilterDisabled(5121),

    @Json(name = "5122")
    FolderExternalLinkCreated(5122),

    @Json(name = "5123")
    FolderExternalLinkUpdated(5123),

    @Json(name = "5124")
    FolderExternalLinkDeleted(5124),

    @Json(name = "5125")
    BackupCompleted(5125),

    @Json(name = "5126")
    BackupFailed(5126),

    @Json(name = "5127")
    ScheduledBackupStarted(5127),

    @Json(name = "5128")
    ScheduledBackupCompleted(5128),

    @Json(name = "5129")
    ScheduledBackupFailed(5129),

    @Json(name = "5130")
    ScheduledBackupDeleted(5130),

    @Json(name = "5131")
    BackupCancelled(5131),

    @Json(name = "5132")
    RestoreStarted(5132),

    @Json(name = "5133")
    RestoreCancelled(5133),

    @Json(name = "5150")
    FormStartedToFill(5150),

    @Json(name = "5151")
    FormPartiallyFilled(5151),

    @Json(name = "5152")
    FormCompletelyFilled(5152),

    @Json(name = "5153")
    FormStopped(5153),

    @Json(name = "5154")
    AgentCreated(5154),

    @Json(name = "5155")
    AgentRenamed(5155),

    @Json(name = "5156")
    AgentDeleted(5156),

    @Json(name = "5157")
    AddedServerToAgent(5157),

    @Json(name = "5158")
    DeletedServerFromAgent(5158),

    @Json(name = "5159")
    RoomChangeOwner(5159),

    @Json(name = "5160")
    DocumentsDefaultTemplatesSettingsUpdated(5160),

    @Json(name = "5201")
    FileSavedButUserQuotaExceeded(5201),

    @Json(name = "5202")
    FileNotSavedDueToUserQuota(5202),

    @Json(name = "5203")
    FileSavedButRoomQuotaExceeded(5203),

    @Json(name = "5204")
    FileNotSavedDueToRoomQuota(5204),

    @Json(name = "5501")
    LdapEnabled(5501),

    @Json(name = "5502")
    LdapDisabled(5502),

    @Json(name = "5503")
    LdapSync(5503),

    @Json(name = "6000")
    LanguageSettingsUpdated(6000),

    @Json(name = "6001")
    TimeZoneSettingsUpdated(6001),

    @Json(name = "6002")
    DnsSettingsUpdated(6002),

    @Json(name = "6003")
    TrustedMailDomainSettingsUpdated(6003),

    @Json(name = "6004")
    PasswordStrengthSettingsUpdated(6004),

    @Json(name = "6005")
    TwoFactorAuthenticationSettingsUpdated(6005),

    @Json(name = "6006")
    AdministratorMessageSettingsUpdated(6006),

    @Json(name = "6007")
    DefaultStartPageSettingsUpdated(6007),

    @Json(name = "6008")
    ProductsListUpdated(6008),

    @Json(name = "6009")
    AdministratorAdded(6009),

    @Json(name = "6010")
    AdministratorOpenedFullAccess(6010),

    @Json(name = "6011")
    AdministratorDeleted(6011),

    @Json(name = "6012")
    UsersOpenedProductAccess(6012),

    @Json(name = "6013")
    GroupsOpenedProductAccess(6013),

    @Json(name = "6014")
    ProductAccessOpened(6014),

    @Json(name = "6015")
    ProductAccessRestricted(6015),

    @Json(name = "6016")
    ProductAddedAdministrator(6016),

    @Json(name = "6017")
    ProductDeletedAdministrator(6017),

    @Json(name = "6018")
    GreetingSettingsUpdated(6018),

    @Json(name = "6019")
    TeamTemplateChanged(6019),

    @Json(name = "6020")
    ColorThemeChanged(6020),

    @Json(name = "6021")
    OwnerSentChangeOwnerInstructions(6021),

    @Json(name = "6022")
    OwnerUpdated(6022),

    @Json(name = "6023")
    OwnerSentPortalDeactivationInstructions(6023),

    @Json(name = "6024")
    OwnerSentPortalDeleteInstructions(6024),

    @Json(name = "6025")
    PortalDeactivated(6025),

    @Json(name = "6026")
    PortalDeleted(6026),

    @Json(name = "6027")
    LoginHistoryReportDownloaded(6027),

    @Json(name = "6028")
    AuditTrailReportDownloaded(6028),

    @Json(name = "6029")
    SSOEnabled(6029),

    @Json(name = "6030")
    SSODisabled(6030),

    @Json(name = "6031")
    PortalAccessSettingsUpdated(6031),

    @Json(name = "6032")
    CookieSettingsUpdated(6032),

    @Json(name = "6033")
    MailServiceSettingsUpdated(6033),

    @Json(name = "6034")
    CustomNavigationSettingsUpdated(6034),

    @Json(name = "6035")
    AuditSettingsUpdated(6035),

    @Json(name = "6036")
    TwoFactorAuthenticationDisabled(6036),

    @Json(name = "6037")
    TwoFactorAuthenticationEnabledBySms(6037),

    @Json(name = "6038")
    TwoFactorAuthenticationEnabledByTfaApp(6038),

    @Json(name = "6039")
    PortalRenamed(6039),

    @Json(name = "6040")
    QuotaPerRoomChanged(6040),

    @Json(name = "6041")
    QuotaPerRoomDisabled(6041),

    @Json(name = "6042")
    QuotaPerUserChanged(6042),

    @Json(name = "6043")
    QuotaPerUserDisabled(6043),

    @Json(name = "6044")
    QuotaPerPortalChanged(6044),

    @Json(name = "6045")
    QuotaPerPortalDisabled(6045),

    @Json(name = "6046")
    FormSubmit(6046),

    @Json(name = "6047")
    FormOpenedForFilling(6047),

    @Json(name = "6048")
    CustomQuotaPerRoomDefault(6048),

    @Json(name = "6049")
    CustomQuotaPerRoomChanged(6049),

    @Json(name = "6050")
    CustomQuotaPerRoomDisabled(6050),

    @Json(name = "6051")
    CustomQuotaPerUserDefault(6051),

    @Json(name = "6052")
    CustomQuotaPerUserChanged(6052),

    @Json(name = "6053")
    CustomQuotaPerUserDisabled(6053),

    @Json(name = "6054")
    DevToolsAccessSettingsChanged(6054),

    @Json(name = "6055")
    WebhookCreated(6055),

    @Json(name = "6056")
    WebhookUpdated(6056),

    @Json(name = "6057")
    WebhookDeleted(6057),

    @Json(name = "6058")
    ApiKeyCreated(6058),

    @Json(name = "6059")
    ApiKeyUpdated(6059),

    @Json(name = "6060")
    ApiKeyDeleted(6060),

    @Json(name = "6061")
    CustomerWalletToppedUp(6061),

    @Json(name = "6062")
    CustomerOperationPerformed(6062),

    @Json(name = "6063")
    CustomerOperationsReportDownloaded(6063),

    @Json(name = "6064")
    CustomerWalletTopUpSettingsUpdated(6064),

    @Json(name = "6065")
    CustomerSubscriptionUpdated(6065),

    @Json(name = "6066")
    BannerSettingsChanged(6066),

    @Json(name = "6067")
    CustomerWalletServicesSettingsUpdated(6067),

    @Json(name = "6068")
    QuotaPerAiAgentChanged(6068),

    @Json(name = "6069")
    QuotaPerAiAgentDisabled(6069),

    @Json(name = "6070")
    CustomQuotaPerAiAgentDefault(6070),

    @Json(name = "6071")
    CustomQuotaPerAiAgentChanged(6071),

    @Json(name = "6072")
    CustomQuotaPerAiAgentDisabled(6072),

    @Json(name = "6073")
    AIProviderCreated(6073),

    @Json(name = "6074")
    AIProviderUpdated(6074),

    @Json(name = "6075")
    AIProviderDeleted(6075),

    @Json(name = "6076")
    ServerCreated(6076),

    @Json(name = "6077")
    ServerUpdated(6077),

    @Json(name = "6078")
    ServerEnabled(6078),

    @Json(name = "6079")
    ServerDisabled(6079),

    @Json(name = "6080")
    ServerDeleted(6080),

    @Json(name = "6081")
    SetWebSearchSettings(6081),

    @Json(name = "6082")
    ResetWebSearchSettings(6082),

    @Json(name = "6083")
    SetVectorizationSettings(6083),

    @Json(name = "6084")
    ResetVectorizationSettings(6084),

    @Json(name = "6085")
    WebpluginUploaded(6085),

    @Json(name = "6086")
    WebpluginUpdated(6086),

    @Json(name = "6087")
    WebpluginDeleted(6087),

    @Json(name = "6088")
    WhiteLabelSettingsLogoTextUpdated(6088),

    @Json(name = "6089")
    WhiteLabelSettingsLogosUpdated(6089),

    @Json(name = "6090")
    WhiteLabelCompanySettingsUpdated(6090),

    @Json(name = "6091")
    WhiteLabelAdditionalSettingsUpdated(6091),

    @Json(name = "6092")
    WhiteLabelMailSettingsUpdated(6092),

    @Json(name = "6093")
    InvitationSettingsUpdated(6093),

    @Json(name = "6094")
    IPRestrictionsSettingsUpdated(6094),

    @Json(name = "6095")
    LoginSettingsUpdated(6095),

    @Json(name = "6096")
    AIDefaultProviderSet(6096),

    @Json(name = "6097")
    AIAccessEnabled(6097),

    @Json(name = "6098")
    AIAccessDisabled(6098),

    @Json(name = "6099")
    UserUpdatedAiSettings(6099),

    @Json(name = "7000")
    ContactAdminMailSent(7000),

    @Json(name = "7001")
    RoomInviteLinkUsed(7001),

    @Json(name = "7002")
    UserCreatedAndAddedToRoom(7002),

    @Json(name = "7003")
    GuestCreatedAndAddedToRoom(7003),

    @Json(name = "7004")
    ContactSalesMailSent(7004),

    @Json(name = "9901")
    CreateClient(9901),

    @Json(name = "9902")
    UpdateClient(9902),

    @Json(name = "9903")
    RegenerateSecret(9903),

    @Json(name = "9904")
    DeleteClient(9904),

    @Json(name = "9905")
    ChangeClientActivation(9905),

    @Json(name = "9906")
    ChangeClientVisibility(9906),

    @Json(name = "9907")
    RevokeUserClient(9907),

    @Json(name = "9908")
    GenerateAuthorizationCodeToken(9908),

    @Json(name = "9909")
    GeneratePersonalAccessToken(9909),

    @Json(name = "-1")
    None(-1);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MessageAction) "$data" else null

        /**
         * Returns a valid [MessageAction] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MessageAction? = data?.let {
          val normalizedData = "$it".lowercase()
          entries.firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

