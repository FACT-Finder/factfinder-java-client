# JobsApi

All URIs are relative to *http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec*

Method | HTTP request | Description
------------- | ------------- | -------------
[**startJobUsingPOST**](JobsApi.md#startJobUsingPOST) | **POST** /rest/v4/jobs/startJob | Start the job with the given name and group name. The job will only be started, if it is not already running.
[**startJobsWithGroupNameUsingPOST**](JobsApi.md#startJobsWithGroupNameUsingPOST) | **POST** /rest/v4/jobs/startJobsWithGroupName | Start the jobs with the given group name. A job will only be started, if it is not already running.
[**startJobsWithNameUsingPOST**](JobsApi.md#startJobsWithNameUsingPOST) | **POST** /rest/v4/jobs/startJobsWithName | Start the jobs with the given name. A job will only be started, if it is not already running.


<a name="startJobUsingPOST"></a>
# **startJobUsingPOST**
> List&lt;JobTriggerResult&gt; startJobUsingPOST(jobName, jobGroup)

Start the job with the given name and group name. The job will only be started, if it is not already running.

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String jobName = "jobName_example"; // String | jobName
    String jobGroup = "jobGroup_example"; // String | jobGroup
    try {
      List<JobTriggerResult> result = apiInstance.startJobUsingPOST(jobName, jobGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#startJobUsingPOST");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |
 **jobGroup** | **String**| jobGroup |

### Return type

[**List&lt;JobTriggerResult&gt;**](JobTriggerResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="startJobsWithGroupNameUsingPOST"></a>
# **startJobsWithGroupNameUsingPOST**
> List&lt;JobTriggerResult&gt; startJobsWithGroupNameUsingPOST(jobGroup)

Start the jobs with the given group name. A job will only be started, if it is not already running.

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String jobGroup = "jobGroup_example"; // String | jobGroup
    try {
      List<JobTriggerResult> result = apiInstance.startJobsWithGroupNameUsingPOST(jobGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#startJobsWithGroupNameUsingPOST");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobGroup** | **String**| jobGroup |

### Return type

[**List&lt;JobTriggerResult&gt;**](JobTriggerResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

<a name="startJobsWithNameUsingPOST"></a>
# **startJobsWithNameUsingPOST**
> List&lt;JobTriggerResult&gt; startJobsWithNameUsingPOST(jobName)

Start the jobs with the given name. A job will only be started, if it is not already running.

### Example
```java
// Import classes:
import de.factfinder.client.ApiClient;
import de.factfinder.client.ApiException;
import de.factfinder.client.Configuration;
import de.factfinder.client.auth.*;
import de.factfinder.client.models.*;
import de.factfinder.client.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://!!!DO NOT MANUALLY EDIT THIS FILE!!! Update files in this directory with ./gradlew :itests:default:test -PgenerateSpec");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: oAuth2
    OAuth oAuth2 = (OAuth) defaultClient.getAuthentication("oAuth2");
    oAuth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String jobName = "jobName_example"; // String | jobName
    try {
      List<JobTriggerResult> result = apiInstance.startJobsWithNameUsingPOST(jobName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#startJobsWithNameUsingPOST");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |

### Return type

[**List&lt;JobTriggerResult&gt;**](JobTriggerResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [oAuth2](../README.md#oAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Server Error |  -  |

