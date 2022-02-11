Spring Boot, MongoDB, Rest API
Build Restful CRUD API test using Spring Boot, MongoDB.

Steps to Setup
1. Clone the application

git clone https://github.com/mazenhadjali/SpringBoot-3.0---MongoDB-Restfull-API

2. Open MongoDB database
create database "tempDB"
open src/main/resources/application.properties
change those with your 
spring.data.mongodb.uri=mongodb://localhost:27017/
spring.data.mongodb.database=tempDB

4. Run the app using maven

mvn spring-boot:run
The app will start running at http://localhost:8080
