## Table of Contents
- [Background and Context](#background-and-context)
  * [Context](#context)
  * [Good to know concepts](#good-to-know-concepts)
  * [Components](#components)
  * [Project architecture](#project-architecture)
    + [Controllers and View](#controllers-and-view)
      - [Controller](#controller)
      - [View](#view)
    + [Data layer](#data-layer)
      - [Entities/Domains](#entitiesdomains)
      - [Services & Repositories](#services--repositories)
      - [Database](#database)
  * [Helpful endpoints](#helpful-endpoints)
    + [H2 console](#h2-console)
    + [REST data API browser](#rest-data-api-browser)
- [Building and Running the app](#building-and-running-the-app)
  * [Setup](#setup)
    + [Dependencies](#dependencies)
    + [IDE](#ide)
    + [Non IDE](#non-ide)
  * [Running](#running)
 
## Background and Context
### Context

FastBridge Learning provides a formative assessment product to allow teachers and other classroom staff to quickly and 
accurately measure student performance and growth. 

One of the most important elements of many educational software systems is classroom roster management - who are the 
teachers, who are the students, and which classes are they all in?

This project is based around building out pages for classroom roster management. We have built out the minimal code-base
necessary to get you started. Instructions for building and running the code base are below. *Please make sure you have
read through this file before jumping into the assignment.*

### Good to know concepts

1. Dependency injection and Spring's @Autowired annotation - www.baeldung.com/spring-autowire
2. MVC architecture - https://danielmiessler.com/study/mvc/
3. Spring controller and REST controller (@Controller and @RESTController) - http://www.baeldung.com/spring-controllers
4. JPA entities - https://spring.io/guides/gs/accessing-data-jpa/
5. Spring data repository - http://www.baeldung.com/spring-data-repositories

### Components

1. [Spring Boot](https://projects.spring.io/spring-boot/) (1.5.8) - for automatically configuring the project and 
helpful maven plugins to build and run it.
2. [Spring MVC](https://projects.spring.io/spring-framework/) (4.3.12) - the main MVC part
3. [H2](http://www.h2database.com/html/main.html) - in memory database
4. [Spring Data](https://projects.spring.io/spring-data/) - for abstracting away the data store and exposing interfaces 
to fetch and save data
5. [Spring Data REST](https://projects.spring.io/spring-data-rest) - exposes Spring Data repositories as RESTful 
endpoints - using these endpoints is optional but may help in completing your tasks quicker.

### Project architecture

#### Controllers and View

##### Controller
Controllers go in `org.fastbridge.takehome.controller` package. As examples and starting points, a Controller and a 
RESTController are already present in this package.

##### View
Model-View controllers like return `org.fastbridge.takehome.controller.StudentController.getStudentListings` contain 
methods that return a `String`. This `String` points directly to a `.jsp` file in `src/main/webapp/WEB-INF/jsp` with the
 same name as the returned `String`. 
 
Information is passed to these JSP files via the `ModelMap` referenced in a controller. For example, in 
`org.fastbridge.takehome.controller.StudentController.getStudentListings`, `ModelMap model` is a parameter and all 
attributes added to it will be available to the JSP as seen in `WEB-INF/jsp/studentListings.jsp` on line 17.


#### Data layer

##### Entities/Domains

Entities that map to tables in the database are present in `org.fastbridge.takehome.data.domain`.

##### Services & Repositories

Controller interacts with the service layer via classes in `org.fastbridge.takehome.data.service` package. All of these 
in turn interact with their respective repositories in `org.fastbridge.takehome.data.repository`. Repositories abstract 
away all interactions with the database.

##### Database

A H2 database is created in memory on application startup. The default connection string `jdbc:h2:mem:testdb` with 
username `sa` and no password. The database is schema is created automatically on startup based on the information 
provided in the entities. Data is imported using the script in `src/main/resources/data.sql` automatically on 
application startup.

### Helpful endpoints

#### H2 console  
`http://localhost:8080/h2-console/` will give you a helpful webapp to browse around the in memory DB and run queries 
against it. Credentials already present in the login form should work without needing any changes.

#### REST data API browser
Using [Spring Data REST](https://projects.spring.io/spring-data-rest/) exposes the data in the database through RESTful 
endpoints.

`http://localhost:8080/` or  will give you an API browser to try out the different endpoints exposed by Spring Data REST

## Building and Running the app

### Setup

#### Dependencies
JDK 8 is the only dependency needed to build and run this project. Please make sure you have it installed correctly.

#### IDE
After cloning this repository, import the directory into your favorite IDE as a Maven project. 

#### Non IDE 
Run `./mvnw install` to install and `./mvnw build` to build the project

### Running
Run this with `./mvnw spring-boot:run` - this command will make the app available on 
http://localhost:8080/ with an embedded Tomcat and H2 database with data imported using the 
script in `src/main/resources/data.sql`.
