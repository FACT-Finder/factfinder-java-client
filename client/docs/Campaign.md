

# Campaign


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeQuestions** | [**List&lt;Question&gt;**](Question.md) | The currently active questions to be shown to the user. These questions do not need to be the root questions, in case the user has already answered a question. |  [optional]
**advisorTree** | [**List&lt;Question&gt;**](Question.md) | The advisor root questions associated with this campaign. | 
**category** | **String** | The category of the campaign. May be empty. | 
**excludeProductsNotInMarkets** | **Boolean** | The setting which decides whether pushed products should be excluded if they are not mapped to any selected market. |  [optional]
**excludeProductsNotInRange** | **Boolean** | The setting which decides whether pushed products should be excluded if they are not close enough to the search location. |  [optional]
**feedbackTexts** | [**List&lt;FeedbackText&gt;**](FeedbackText.md) | The feedback text lines that will be displayed to the user. |  [optional]
**flavour** | [**FlavourEnum**](#FlavourEnum) | The kind of the campaign. | 
**hits** | [**List&lt;TypedFlatRecord&gt;**](TypedFlatRecord.md) | The records associated with the campaign, if it should push products. |  [optional]
**id** | **String** | The ID of the campaign. |  [optional]
**name** | **String** | The name of the campaign. |  [optional]
**target** | [**Target**](Target.md) |  |  [optional]



## Enum: FlavourEnum

Name | Value
---- | -----
ADVISOR | &quot;ADVISOR&quot;
REDIRECT | &quot;REDIRECT&quot;
FEEDBACK | &quot;FEEDBACK&quot;
PRODUCT | &quot;PRODUCT&quot;



