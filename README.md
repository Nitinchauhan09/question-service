# Question Service

The Question Service is a microservice application designed to manage questions and facilitate quiz functionality. This service is built using Java, Spring Boot, and related technologies. It integrates with a Eureka Server for service discovery and provides RESTful endpoints for interacting with question service.

---

## Features
- **Get All Questions**: Retrieve all questions from the database.
- **Get Questions by Category**: Fetch questions filtered by a specific category.
- **Generate Quiz Questions**: Create a quiz by specifying a category and the number of questions.
- **Get Quiz Score**: Calculate the score of a quiz based on question IDs and user responses.

---

## Tech Stack
- **Language**: Java
- **Frameworks**: Spring Boot, Spring Data JPA
- **Database**: PostgreSQL
- **Tools**: Postman (for testing APIs)
- **Dependencies**: 
  - Lombok (for reducing boilerplate code)
  - Eureka Client (for service registration in the Eureka Server)

---

## Prerequisites
- Java 17 or later
- PostgreSQL installed and running
- Eureka Server running
- Postman or any API testing tool

---

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Nitinchauhan09/question-service.git
