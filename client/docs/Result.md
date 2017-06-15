
# Result

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedPreprocessorEntries** | [**List&lt;PreprocessorEntry&gt;**](PreprocessorEntry.md) |  |  [optional]
**asnGroups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional]
**breadCrumbTrail** | [**List&lt;BreadCrumbTrailItem&gt;**](BreadCrumbTrailItem.md) |  |  [optional]
**campaignsList** | [**List&lt;Campaign&gt;**](Campaign.md) |  |  [optional]
**fieldRoles** | **Map&lt;String, String&gt;** |  |  [optional]
**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional]
**paging** | [**Paging**](Paging.md) |  |  [optional]
**records** | [**List&lt;SearchRecord&gt;**](SearchRecord.md) |  |  [optional]
**resultArticleNumberStatus** | [**ResultArticleNumberStatusEnum**](#ResultArticleNumberStatusEnum) |  |  [optional]
**resultCount** | **Integer** |  |  [optional]
**resultStatus** | [**ResultStatusEnum**](#ResultStatusEnum) |  |  [optional]
**resultsPerPageList** | [**List&lt;ResultsPerPageOptionWithSearchParams&gt;**](ResultsPerPageOptionWithSearchParams.md) |  |  [optional]
**searchControlParams** | [**SearchControlParams**](SearchControlParams.md) |  |  [optional]
**searchParams** | [**Params**](Params.md) |  |  [optional]
**searchTime** | **Long** |  |  [optional]
**simiFirstRecord** | **Integer** |  |  [optional]
**simiLastRecord** | **Integer** |  |  [optional]
**singleWordResults** | [**List&lt;SingleWordSearchResult&gt;**](SingleWordSearchResult.md) |  |  [optional]
**sortsList** | [**List&lt;ResultSortItem&gt;**](ResultSortItem.md) |  |  [optional]
**timedOut** | **Boolean** |  |  [optional]


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



