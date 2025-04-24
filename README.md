# Student-Management-System-SpringBoot-SpringMVC

## Introdution :
The Student Management System API is a RESTful service built using Spring Boot, designed to handle student-related operations efficiently. This backend system allows for the creation, updating, retrieval, and authentication of student records through well-defined API endpoints. It ensures seamless data management and integration possibilities for academic platforms or administrative portals.

*API Testing with Postman:*

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
          ![add_sms](https://github.com/user-attachments/assets/f283d643-fdb6-47cb-8659-db55a4fe5d3f)

2.   **Fetch a Student:**

     - *Fetch Student by ID*
       - Endpoint: GET /fetch/{id}
         ![fetch_id_sms](https://github.com/user-attachments/assets/fbcd04df-63bb-40b7-bd9e-0b627662a19f)
  
     - *Login via Phone & Password*
       - Endpoint: GET /fetch/{phone}/{password}
         ![fetch_phn_pass_sms](https://github.com/user-attachments/assets/540063d9-06e6-4e43-863e-4c8c37be2729)
         
     - *Login via Email & Password*
       - Endpoint: GET /fetch?email={email}&password={password}fetch/{id}
         ![fetch_email_pass](https://github.com/user-attachments/assets/2d9b861a-7c62-41c8-bce7-0bb63982761e)

     - *Get All Students*
       - Endpoint: GET /fetch/all
         ![fetch_all_sms](https://github.com/user-attachments/assets/18d34064-9f4d-4ed5-970d-abbbebcfc28d)

4.  **Update a Student:**
      -   Endpoint: PUT /update
          ![update_sms](https://github.com/user-attachments/assets/a32dce8e-4a53-41a1-ac27-2e66be52618d)

## Technologies Used :
-   Java 17
-   Spring Boot
-   Spring Web (REST Controller)
-   Spring Dependency Injection
-   Postman (for testing)
-   PostgreSQL
-   HTTP (ResponseEntity)
-   Custom Response Wrapper (ResponseStructure<T>)
