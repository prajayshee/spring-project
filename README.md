# Spring Project

This project is a Spring Boot-based web application built to demonstrate key features like user authentication, data persistence, and token-based security. It incorporates best practices for building secure and maintainable RESTful APIs using JWT (JSON Web Tokens) and Hibernate validation.

## What We've Done So Far

### 1. **Spring Boot Setup**
   - Initialized a Spring Boot project using Maven.
   - Configured the project with essential dependencies, including Spring Boot Starter Web, Data JPA, and Security.

### 2. **Authentication and Security**
   - Integrated Spring Security to provide basic user authentication.
   - Configured JWT (JSON Web Tokens) for stateless authentication and secure API access.
   - Set up in-memory user authentication for development purposes.

### 3. **Validation Implementation**
   - Implemented input validation using Jakarta Validation API (e.g., `@NotNull`, `@Size`, `@Email` annotations) to ensure data integrity and enforce business rules on entity fields.

### 4. **Database Setup**
   - Configured H2 in-memory database for easy development and testing.
   - Set up JPA entities with the necessary configurations and mapped them to database tables.

### 5. **Application Startup and Testing**
   - Successfully configured and started the application on port 8080.
   - Completed initial tests to ensure the project runs and authentication works as expected.

## Features

- **User Authentication**: Users can authenticate using JWT tokens.
- **JWT Authentication**: Secure token-based authentication with JWT.
- **Database Integration**: Uses H2 database for development, with JPA-based persistence.
- **Input Validation**: Built-in validation for user inputs (e.g., `@NotNull`, `@Size`, `@Email`).
- **Security Configuration**: Basic Spring Security configuration with in-memory user details.

## Technologies Used

- Spring Boot
- Spring Security
- Hibernate Validator (Jakarta Validation API)
- JJWT for JSON Web Token (JWT) Authentication
- H2 Database for development
