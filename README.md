Training Center Management API

Overview

A RESTful API for managing training centers, built with Spring Boot and documented using Swagger.

Tech Stack

Backend: Java, Spring Boot, Spring Data JPA

Database: MySQL / PostgreSQL

Validation: Jakarta Validation (JSR-303)

API Documentation: Swagger

Installation

Clone the repository:
git clone https://github.com/your-username/training-center-api.git
cd training-center-api

Configure application.properties with database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/training_center_db
spring.datasource.username=root
spring.datasource.password=yourpassword


Build and run the project:
mvn clean install
mvn spring-boot:run


Access Swagger UI at http://localhost:8080/swagger-ui.html


API Endpoints

Create Training Center

POST /api/training-centers

Request:
{
"trainingCenterName": "ABC Training",
"centerCode": "ABCD12345678",
"address": { "state": "NY", "city": "NYC", "addressLine": "123 Main St" },
"studentStrength": 200,
"courses": ["Java", "Spring Boot"],
"email": "abc@training.com",
"phoneNum": "9876543210"
}

Response: Returns created training center details.

Get All Training Centers

GET /api/training-centers

Response: List of all training centers.


Author

Ansh Saini