### Setup

#### Dependencies
JDK 8 is the only dependency needed to build and run this project. Please make sure you have it installed correctly.

#### IDE
After cloning this repository, import the directory into your favorite IDE as a Maven project. 

#### Non IDE 
Run `./mvnw install` to install and `./mvnw build` to build the project



### Running

Run this with `./mvnw spring-boot:run` - this command will make the app available on `http://localhost:8080/` with an 
embedded Tomcat and H2 database with data imported using the script in `src/main/resources/data.sql`


### Components

1. [Spring Boot](https://projects.spring.io/spring-boot/) (1.5.8) - for automatically configuring the project and 
helpful maven plugins to build and run it.
2. [Spring MVC](https://projects.spring.io/spring-framework/) (4.3.12) - the main MVC part
3. [H2](http://www.h2database.com/html/main.html) - in memory database
4. [Spring Data](https://projects.spring.io/spring-data/) - for abstracting away the data store and exposing interfaces 
to fetch and save data
5. [Spring Data REST](https://projects.spring.io/spring-data-rest) - exposes Spring Data repositories as RESTful 
endpoints - using these endpoints is optional but may help in completing your tasks quicker.


### Helpful endpoints

#### H2 console  
`http://localhost:8080/h2-console/` will give you a helpful webapp to browse around the in memory DB and run queries 
against it.

#### REST data API browser
Using [Spring Data REST](https://projects.spring.io/spring-data-rest/) exposes the data in the database through RESTful 
endpoints.

`http://localhost:8080/` or  will give you an API browser to try out the different endpoints exposed by Spring Data REST