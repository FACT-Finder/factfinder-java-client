# Changelog

### 1.0.1 (2016-08-08)
Adjust the error handling while connecting to FACT-Finder, when an error occurs a `FFApiException` will be thrown which has a status code and the response.
Split the suggest runner into a separate class.
Add tracking api and runner example.
Url encode the parameters which will be send to FACT-Finder.

### 1.0.0 (2016-08-05)
Initial Release of FACT-Finder Java Client, which uses the JSON-API and is compatible for Version 7.0