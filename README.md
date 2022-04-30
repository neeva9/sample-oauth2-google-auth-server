# Demo for OAuth2 - Google Authorization Server

#### Prerequisite:
````
Java 8
IntelliJ IDEA
Gradle
````

#### Database:
````
H2 in-memory database
````

#### Build:
````
* Remember unless the client_id and client_secret are not inputted in the application.yml, the build will not be success.
gradle clean build
````

#### Run Application:
````
gradle bootRun
````

#### Google Cloud Console:
````
* Create project on Google Cloud Console.
* Under Apis & Services, create credentials to access Apis, select OAuth client Id.
* Define the application types, name and redirect URL to create OAuth client id.
* Select the scopes which gives permission from end user to authorize for the project/app. For this demo I have used profile,email,openid scopes.
* Flow starts with http://localhost:8080/login, where user can click the "Login with Google" button and can see how there will be Google's sign in page which would ask for username and password details. 
* Based on what is the fist name and last name of the Google account user inputs, an Hello message is displayed followed by first name and last name.
* The user details can be found from the H2 database at jdbc:h2:mem:oauth
````
