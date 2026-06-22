# Spring Boot Thymeleaf Bat Management System

## Project Description

This is a simple Bat Management System developed using Spring Boot, Thymeleaf, Spring Data JPA, Hibernate, and PostgreSQL.

The application allows users to perform CRUD (Create, Read, Update, Delete) operations on bat records through a web interface built with Thymeleaf templates.

---

## Features

* Add New Bat
* View All Bats
* View Bat By ID
* Update Bat Details
* Delete Bat By ID
* Thymeleaf Integration
* Spring Boot MVC Architecture
* PostgreSQL Database Connectivity

---

## Technologies Used

* Java
* Spring Boot
* Spring MVC
* Thymeleaf
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Eclipse IDE

---

## Concepts Used

* MVC Architecture
* Spring Boot
* Spring MVC
* Thymeleaf Templates
* CRUD Operations
* JPA Repository
* Hibernate ORM
* Dependency Injection
* Path Variables
* Model Attributes

---

## Project Structure

src/main/java

├── com.jsp.Thymeleaf.controller

│   └── batController.java

├── com.jsp.Thymeleaf.entity

│   └── Bat.java

├── com.jsp.Thymeleaf.repository

│   └── batrepository.java

└── com.jsp.Thymeleaf.service

```
└── batservice.java
```

src/main/resources

└── templates

```
├── reg.html

├── Fetch.html

├── FetchAll.html

├── update.html

├── delete.html

├── succes.html

└── Succes.html
```

---

## Entity Fields

### Bat

* id
* brand
* owner
* price

---

## Application Workflow

### Add Bat

URL:

/add

Allows users to register a new bat.

---

### Save Bat

URL:

/savebat

Stores bat details in the database.

---

### Fetch All Bats

URL:

/get

Displays all available bat records.

---

### Fetch Bat By ID

URL:

/fetch/{id}

Displays a single bat record based on ID.

---

### Update Bat

URL:

/update/{id}

Updates bat details.

---

### Delete Bat

URL:

/delete/{id}

Deletes bat details from the database.

---

## Sample Data

| ID | Brand | Owner   | Price |
| -- | ----- | ------- | ----- |
| 1  | SS    | Pradeep | 5000  |
| 2  | MRF   | Karthik | 7000  |
| 3  | SG    | Anu     | 4500  |

---

## Learning Outcomes

* Spring Boot MVC Development
* Thymeleaf Template Engine
* Spring Data JPA
* Hibernate ORM
* PostgreSQL Integration
* CRUD Operations
* Layered Architecture (Controller, Service, Repository)

---

## Future Enhancements

* Search Bat By Brand
* Pagination and Sorting
* Validation API
* Exception Handling
* Spring Security
* User Authentication
* REST API Integration

---

## Author

Pradeep Bhat

MCA Graduate | Java Full Stack Developer
