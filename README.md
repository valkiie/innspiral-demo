# Getting Started
This is a demo application for a hiring process

### About the project
This application is built using: 
- Java 8
- Spring Framework
- JPA for data persistence
- H2 as an in-memory database

### Requirements
- Java SDK 8
- Maven

### Running the project

To run the application:
``` 
mvn clean spring-boot:run
```

While the application is running you can access the database connecting to:
``` 
http://localhost:8080/h2-console
```

With the datasource-url:
```
jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
```
To run the tests:
``` 
mvn test
```

### Using the endpoints

#### POST 127.0.0.1:8080/client
```
{
   "names":"Richard Cham"
}
```

#### POST 127.0.0.1:8080/vehicle
```
{
   "plate":"XYZ-470",
   "model": "TOYOTA",
   "clientId": 1
}
```

#### POST 127.0.0.1:8080/repair
```
{
"vehicleId":3,
"comments": "Sin comentarios"
}
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)



