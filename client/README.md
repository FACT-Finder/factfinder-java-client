# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CampaignApi;

import java.io.File;
import java.util.*;

public class CampaignApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        CampaignApi apiInstance = new CampaignApi();
        String channel = "channel_example"; // String | channel
        String pageId = "pageId_example"; // String | Use this parameter to pass a page ID for which you wish to obtain campaigns.
        Boolean idsOnly = false; // Boolean | If the value true is passed, then only the record IDs will be returned, streamlining the results. If you do not need the other information in the results, this will help you to improve performance.
        String sid = "sid_example"; // String | This parameter is used to pass an id for the user session. This is important for recognising the user, if you want to trigger personalised campaigns, as well as for FACT-Finder tracking.
        String advisorStatus = "advisorStatus_example"; // String | For specifying the current campaign id and answer path; format: campaignId-answerPath
        try {
            List<Campaign> result = apiInstance.getPageCampaignsUsingGET(channel, pageId, idsOnly, sid, advisorStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignApi#getPageCampaignsUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://{FACT_FINDER_INSTANCE}/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignApi* | [**getPageCampaignsUsingGET**](docs/CampaignApi.md#getPageCampaignsUsingGET) | **GET** /v1/campaign/{channel}/page | Get page campaigns
*CampaignApi* | [**getProductCampaignsUsingGET**](docs/CampaignApi.md#getProductCampaignsUsingGET) | **GET** /v1/campaign/{channel}/product | Get product campaigns
*CampaignApi* | [**getShoppingCartCampaignsUsingGET**](docs/CampaignApi.md#getShoppingCartCampaignsUsingGET) | **GET** /v1/campaign/{channel}/shoppingcart | Get shopping cart campaigns
*CompareproductsApi* | [**compareUsingGET**](docs/CompareproductsApi.md#compareUsingGET) | **GET** /v1/compareproducts/{channel} | compare products
*ImportApi* | [**startRecommendationImportUsingPOST**](docs/ImportApi.md#startRecommendationImportUsingPOST) | **POST** /v1/import/recommendation | Start recommendation import
*ImportApi* | [**startSearchImportUsingPOST**](docs/ImportApi.md#startSearchImportUsingPOST) | **POST** /v1/import/search | Start search import
*ImportApi* | [**startSuggestImportUsingPOST**](docs/ImportApi.md#startSuggestImportUsingPOST) | **POST** /v1/import/suggest | Start suggest import
*ManagementApi* | [**importWhatsHotUsingPOST**](docs/ManagementApi.md#importWhatsHotUsingPOST) | **POST** /v1/management/whatshot | Execute whatshot import(s)
*ManagementApi* | [**reloadConfigurationUsingPOST**](docs/ManagementApi.md#reloadConfigurationUsingPOST) | **POST** /v1/management/reloadConfiguration | Reload the configuration
*RecommendationApi* | [**getRecommendationUsingGET**](docs/RecommendationApi.md#getRecommendationUsingGET) | **GET** /v1/recommendation/{channel} | Get recommendations
*RecordsApi* | [**deleteUsingDELETE**](docs/RecordsApi.md#deleteUsingDELETE) | **DELETE** /v1/records/{channel} | Delete records
*RecordsApi* | [**getRecordsUsingGET**](docs/RecordsApi.md#getRecordsUsingGET) | **GET** /v1/records/{channel} | Get records
*RecordsApi* | [**insertRecordsUsingPOST**](docs/RecordsApi.md#insertRecordsUsingPOST) | **POST** /v1/records/{channel} | Insert records
*RecordsApi* | [**updateUsingPUT**](docs/RecordsApi.md#updateUsingPUT) | **PUT** /v1/records/{channel} | Update records
*RefreshdatabasesApi* | [**refreshAllDatabasesUsingPOST**](docs/RefreshdatabasesApi.md#refreshAllDatabasesUsingPOST) | **POST** /v1/refreshdatabases/all | Refresh all databases
*RefreshdatabasesApi* | [**refreshRecommendationDatabasesUsingPOST**](docs/RefreshdatabasesApi.md#refreshRecommendationDatabasesUsingPOST) | **POST** /v1/refreshdatabases/recommendation | Refresh recommendation databases
*RefreshdatabasesApi* | [**refreshSearchDatabasesUsingPOST**](docs/RefreshdatabasesApi.md#refreshSearchDatabasesUsingPOST) | **POST** /v1/refreshdatabases/search | Refresh search databases
*RefreshdatabasesApi* | [**refreshSuggestDatabasesUsingPOST**](docs/RefreshdatabasesApi.md#refreshSuggestDatabasesUsingPOST) | **POST** /v1/refreshdatabases/suggest | Refresh suggest databases
*SearchApi* | [**searchUsingGET**](docs/SearchApi.md#searchUsingGET) | **GET** /v1/search/{channel} | Search
*SearchApi* | [**searchUsingPOST**](docs/SearchApi.md#searchUsingPOST) | **POST** /v1/search | Search with POST
*SimilarproductsApi* | [**getSimilarProductsUsingGET**](docs/SimilarproductsApi.md#getSimilarProductsUsingGET) | **GET** /v1/similarproducts/{channel} | Get similar products
*SuggestApi* | [**getSuggestionsUsingGET**](docs/SuggestApi.md#getSuggestionsUsingGET) | **GET** /v1/suggest/{channel} | Get suggestions
*TagcloudApi* | [**getTagCloudUsingGET**](docs/TagcloudApi.md#getTagCloudUsingGET) | **GET** /v1/tagcloud/{channel} | Get tag cloud entries
*TrackingApi* | [**trackCartUsingPOST**](docs/TrackingApi.md#trackCartUsingPOST) | **POST** /v1/track/{channel}/cart | Track a cart event
*TrackingApi* | [**trackCheckoutUsingPOST**](docs/TrackingApi.md#trackCheckoutUsingPOST) | **POST** /v1/track/{channel}/checkout | Track a checkout event
*TrackingApi* | [**trackClickUsingPOST**](docs/TrackingApi.md#trackClickUsingPOST) | **POST** /v1/track/{channel}/click | Track a click event
*TrackingApi* | [**trackFeedbackUsingPOST**](docs/TrackingApi.md#trackFeedbackUsingPOST) | **POST** /v1/track/{channel}/feedback | Track a feedback event
*TrackingApi* | [**trackLogUsingPOST**](docs/TrackingApi.md#trackLogUsingPOST) | **POST** /v1/track/{channel}/log | Track a log event
*TrackingApi* | [**trackLoginUsingPOST**](docs/TrackingApi.md#trackLoginUsingPOST) | **POST** /v1/track/{channel}/login | Track a login event
*TrackingApi* | [**trackRecommendationClickUsingPOST**](docs/TrackingApi.md#trackRecommendationClickUsingPOST) | **POST** /v1/track/{channel}/recommendationClick | Track a recommendation click event


## Documentation for Models

 - [AdvisorCampaignStatusHolder](docs/AdvisorCampaignStatusHolder.md)
 - [Answer](docs/Answer.md)
 - [ApiError](docs/ApiError.md)
 - [BreadCrumbTrailItem](docs/BreadCrumbTrailItem.md)
 - [Campaign](docs/Campaign.md)
 - [CartOrCheckoutEvent](docs/CartOrCheckoutEvent.md)
 - [ClickEvent](docs/ClickEvent.md)
 - [CompareAttribute](docs/CompareAttribute.md)
 - [CompareResult](docs/CompareResult.md)
 - [CustomParameter](docs/CustomParameter.md)
 - [FeedbackEvent](docs/FeedbackEvent.md)
 - [FeedbackText](docs/FeedbackText.md)
 - [Filter](docs/Filter.md)
 - [FilterValue](docs/FilterValue.md)
 - [Group](docs/Group.md)
 - [GroupElement](docs/GroupElement.md)
 - [ImportChannelResult](docs/ImportChannelResult.md)
 - [ImportResult](docs/ImportResult.md)
 - [LoginEvent](docs/LoginEvent.md)
 - [PageLink](docs/PageLink.md)
 - [Paging](docs/Paging.md)
 - [PagingConfiguration](docs/PagingConfiguration.md)
 - [Params](docs/Params.md)
 - [PreprocessorEntry](docs/PreprocessorEntry.md)
 - [Question](docs/Question.md)
 - [RecommendationClickEvent](docs/RecommendationClickEvent.md)
 - [RecommendationResult](docs/RecommendationResult.md)
 - [RecordWithId](docs/RecordWithId.md)
 - [Result](docs/Result.md)
 - [ResultSortItem](docs/ResultSortItem.md)
 - [ResultSuggestion](docs/ResultSuggestion.md)
 - [ResultsPerPageOption](docs/ResultsPerPageOption.md)
 - [ResultsPerPageOptionWithSearchParams](docs/ResultsPerPageOptionWithSearchParams.md)
 - [SearchControlParams](docs/SearchControlParams.md)
 - [SearchLogEvent](docs/SearchLogEvent.md)
 - [SearchRecord](docs/SearchRecord.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SimilarAttributeInfo](docs/SimilarAttributeInfo.md)
 - [SimilarProducts](docs/SimilarProducts.md)
 - [SingleWordSearchResult](docs/SingleWordSearchResult.md)
 - [SortItem](docs/SortItem.md)
 - [TagCloudEntry](docs/TagCloudEntry.md)
 - [Target](docs/Target.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



