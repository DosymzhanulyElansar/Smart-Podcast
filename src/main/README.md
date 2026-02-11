Here is a professional version of the README.md file in English, formatted for academic submission without any emojis or decorative symbols.

Smart-Podcast System
Project Overview
The Smart-Podcast System is a RESTful API application built with Spring Boot. It provides a structured approach to managing podcast data while demonstrating the practical application of software design patterns, layered architecture, and database integration.

Technical Stack
Java: Version 17

Framework: Spring Boot 4.0.2

Persistence: Spring Data JPA

Database: H2 (In-memory)

Build Tool: Maven

Library: Project Lombok

Design Patterns
This project implements the following architectural and design patterns:

Factory Method Pattern

Implementation: Located in the PodcastFactory class within the patterns package.

Purpose: Encapsulates the object creation logic for the Podcast entity. This decouples the instantiation process from the Controller and Service layers, allowing for centralized modifications to object initialization.

Builder Pattern

Implementation: Applied via the @Builder annotation on the Podcast model.

Purpose: Utilized within the PodcastFactory to construct objects step-by-step. This ensures code readability and provides flexibility when dealing with multiple entity fields.

Singleton Pattern

Implementation: Managed by the Spring IoC container for all Beans (@RestController, @Service, @Repository).

Purpose: Ensures that only one instance of each service and repository exists during the application lifecycle, optimizing memory usage and maintaining a consistent state.

Repository Pattern

Implementation: Defined in the PodcastRepository interface.

Purpose: Provides an abstraction layer over the H2 database, facilitating CRUD operations without the requirement for manual SQL queries.

Layered Architecture
The application follows a standard multi-tier architecture:

Controller Layer: Handles incoming HTTP requests and maps them to service methods.

Service Layer: Contains the business logic and coordinates data flow between the controller and the repository.

Repository Layer: Manages data persistence and communication with the H2 database.

Model Layer: Defines the data structure and JPA entities.

API Endpoints
1. Create a Podcast
   URL: http://localhost:8080/api/podcasts

Method: POST

Request Body (JSON):

JSON
{
"title": "Example Title",
"author": "Example Author",
"genre": "Example Genre"
}
Response: 200 OK (includes generated ID).

2. Get All Podcasts
   URL: http://localhost:8080/api/podcasts

Method: GET

Response: Returns a JSON array of all podcast records currently stored in the in-memory database.

Database Configuration
The system uses the H2 In-Memory Database for development and testing.

Console Access: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Credentials: User sa, Password (blank).

Installation and Execution
Clone the repository to your local machine.

Execute mvn clean install to resolve dependencies.

Run the SmartPodcastApplication.java file.

Use Postman or a similar tool to test the endpoints as described above.