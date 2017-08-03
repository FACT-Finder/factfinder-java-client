
# Result

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedPreprocessorEntries** | [**List&lt;PreprocessorEntry&gt;**](PreprocessorEntry.md) |  |  [optional]
**asnGroups** | [**List&lt;Group&gt;**](Group.md) |  | 
**breadCrumbTrail** | [**List&lt;BreadCrumbTrailItem&gt;**](BreadCrumbTrailItem.md) |  | 
**campaignsList** | [**List&lt;Campaign&gt;**](Campaign.md) |  | 
**fieldRoles** | **Map&lt;String, String&gt;** |  | 
**filters** | [**List&lt;Filter&gt;**](Filter.md) |  | 
**paging** | [**Paging**](Paging.md) |  |  [optional]
**records** | [**List&lt;SearchRecord&gt;**](SearchRecord.md) |  | 
**resultArticleNumberStatus** | [**ResultArticleNumberStatusEnum**](#ResultArticleNumberStatusEnum) |  | 
**resultCount** | **Integer** |  | 
**resultStatus** | [**ResultStatusEnum**](#ResultStatusEnum) |  | 
**resultsPerPageList** | [**List&lt;ResultsPerPageOptionWithSearchParams&gt;**](ResultsPerPageOptionWithSearchParams.md) |  | 
**searchControlParams** | [**SearchControlParams**](SearchControlParams.md) |  | 
**searchParams** | [**Params**](Params.md) |  |  [optional]
**searchTime** | **Long** |  | 
**simiFirstRecord** | **Integer** |  | 
**simiLastRecord** | **Integer** |  | 
**singleWordResults** | [**List&lt;SingleWordSearchResult&gt;**](SingleWordSearchResult.md) |  |  [optional]
**sortsList** | [**List&lt;ResultSortItem&gt;**](ResultSortItem.md) |  | 
**timedOut** | **Boolean** |  | 


<a name="ResultArticleNumberStatusEnum"></a>
## Enum: ResultArticleNumberStatusEnum
Name | Value
---- | -----
NOARTICLENUMBERSEARCH | &quot;noArticleNumberSearch&quot;
NOTHINGFOUND | &quot;nothingFound&quot;
RESULTSFOUND | &quot;resultsFound&quot;


<a name="ResultStatusEnum"></a>
## Enum: ResultStatusEnum
Name | Value
---- | -----
RESULTSFOUND | &quot;resultsFound&quot;
NOTHINGFOUND | &quot;nothingFound&quot;
ERROROCCURED | &quot;errorOccured&quot;



