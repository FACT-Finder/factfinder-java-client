# FACT-Finder Java Client

This project should help you integrate [FACT-Finder](http://www.fact-finder.com/) into your own system, by demonstrating how to use the different 
functionalities via the JSON based REST API.
  
## Usage
### Requirement
- Java 8
- As this project is using [gradle](https://gradle.org/), you need a plugin to import it into your IDE. [IntelliJ](https://www.jetbrains.com/idea/) does support this by default, when using [Eclipse](https://eclipse.org/) we recommend using the [Buildship Plugin](http://marketplace.eclipse.org/content/buildship-gradle-integration).


### Update client
For generating the swagger client the swagger-codegen needs to be executed inside the client directory. 

Example command:
```
java -jar /path/to/swagger-codegen.jar generate -l java -c swagger-java-configuration.json -i /path/to/factfinder-swagger.json
```

### Project structure
This project consists of two modules, named client and runner. 

The client module contains POJO-classes and all classes necessary to send requests to FACT-Finder via its JSON based REST API. Most of the module has been 
generated using [swagger codegen](http://swagger.io/docs/swagger-tools/). Only the class `de.factfinder.client.UpdatingAuthKeyClient` was added manually to ensure the validity
 of the auth key for each service call. Some dependencies were also added to the generated `build.gradle`. These dependencies are needed by the manually 
 created classes.

The second module, named runner, contains example classes using that client classes. Each `Runner*`-class is executable on it's own and demonstrates a different FACT-Finder functionality.


#### `Settings`-class
Before you are able to run one of the `Runner*`-classes, you need to adjust the `de.factfinder.runner.Settings`-class according to the path and credentials of your FACT-Finder environment.
