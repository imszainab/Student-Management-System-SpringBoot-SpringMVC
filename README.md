# Student-Management-System-SpringBoot-SpringMVC

## Introdution :
The Student Management System API is a RESTful service built using Spring Boot, designed to handle student-related operations efficiently. This backend system allows for the creation, updating, retrieval, and authentication of student records through well-defined API endpoints. It ensures seamless data management and integration possibilities for academic platforms or administrative portals.

*API Testing with Postman*
All API endpoints have been tested and verified using Postman, a popular tool for API testing and development. JSON request bodies and query parameters were used to simulate real-world use cases, ensuring each endpoint functions as expected under various scenarios.

*-------- Main Features: --------*

✅ **Register a New Student –** Add new student records using a simple POST request.

✅ **Update Student Details –** Modify student data securely via PUT requests.

✅ **Fetch Student by ID –** Retrieve detailed student information by their unique ID.

✅ **Authenticate via Phone/Password –** Verify student credentials for secure login.

✅ **Authenticate via Email/Password –** Another secure method for student login.

✅ **View All Registered Students –** Get a complete list of students.

✅ **Standardized API Responses –** Every response follows a custom **ResponseStructure** for consistency and ease of handling.

## How to Use the API :

**Base URL :** *http://localhost:8080/student*

1.   **Save a Student:** 
      -   Endpoint: POST /save
      -   Request Body (JSON):
      -   Result/Output:

2.   **Fetch a Student:**
      -   *Fetch Student by ID* 
      -   *Login via Phone & Password*
      -   *Login via Email & Password*
      -   *Get All Students*

3.  ** Update a Student:**
      -   Endpoint: PUT /update
      -   Request Body (JSON):
      -   Result/Output:  

## Technologies Used :
-   Java 17
-   Spring Boot
-   Spring Web (REST Controller)
-   Spring Dependency Injection
-   Postman (for testing)
-   PostgreSQL
-   HTTP (ResponseEntity)
-   Custom Response Wrapper (ResponseStructure<T>)
