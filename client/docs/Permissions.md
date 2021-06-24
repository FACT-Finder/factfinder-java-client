

# Permissions

Contains all permission related settings of a FACT-Finder user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowAllCurrentAndFutureChannels** | **Boolean** | If set to true the user has access to all channels. In that case any explicitly specified channels are ignored. | 
**channels** | **List&lt;String&gt;** | The channels assigned to the user. | 
**groups** | **List&lt;String&gt;** | The groups assigned to the user. | 
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | The roles assigned to the user. | 



## Enum: List&lt;RolesEnum&gt;

Name | Value
---- | -----
ABTESTMANAGER | &quot;AbTestManager&quot;
AFTERSEARCHNAVIGATIONMANAGER | &quot;AfterSearchNavigationManager&quot;
BACKUPMANAGER | &quot;BackupManager&quot;
CACHEMANAGER | &quot;CacheManager&quot;
CAMPAIGNMANAGER | &quot;CampaignManager&quot;
CONFIGURATORMANAGER | &quot;ConfiguratorManager&quot;
DEPLOYMENTMANAGER | &quot;DeploymentManager&quot;
IMPORTMANAGER | &quot;ImportManager&quot;
INTERMEDIATEONLYIMPORTMANAGER | &quot;IntermediateOnlyImportManager&quot;
INSTALLMANAGER | &quot;InstallManager&quot;
LANGUAGEMANAGER | &quot;LanguageManager&quot;
LOGFILEANALYZERMANAGER | &quot;LogfileAnalyzerManager&quot;
MAYCHANGEPASSWORD | &quot;MayChangePassword&quot;
MESSAGESMANAGER | &quot;MessagesManager&quot;
NOTIFICATIONMANAGER | &quot;NotificationManager&quot;
PREPROCESSORMANAGER | &quot;PreprocessorManager&quot;
RANKINGMANAGER | &quot;RankingManager&quot;
RECOMMENDATIONENGINEMANAGER | &quot;RecommendationEngineManager&quot;
SEARCHINTERFACEUSER | &quot;SearchInterfaceUser&quot;
SEARCHMANAGER | &quot;SearchManager&quot;
SHOWHELPSECTION | &quot;ShowHelpSection&quot;
SUGGESTMANAGER | &quot;SuggestManager&quot;
THESAURUSMANAGER | &quot;ThesaurusManager&quot;
USERMANAGER | &quot;UserManager&quot;
WORDVALUESMANAGER | &quot;WordValuesManager&quot;
APIIMPORT | &quot;ApiImport&quot;
APIANALYTICS | &quot;ApiAnalytics&quot;
APIPUBLICQUERIES | &quot;ApiPublicQueries&quot;
APICONFIG | &quot;ApiConfig&quot;
APIJOBS | &quot;ApiJobs&quot;
APIINSTOREADS | &quot;ApiInstoreAds&quot;
APIDATABASE | &quot;ApiDatabase&quot;
APIMANAGE | &quot;ApiManage&quot;
APILICENCE | &quot;ApiLicence&quot;
APIUSERS | &quot;ApiUsers&quot;



