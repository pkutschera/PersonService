PersonService: A Kotlin-based Spring Boot Service
=================================================

The service can be deployed using docker.

Make the Docker build process integrate with the Maven build process. 
If you bind the default phases, when you type <em>mvn package</em>, you get a Docker image. 
When you type <em>mvn deploy</em>, your image gets pushed.