# Cloud Test Application for Product Management

## Project Overview
This is the final deliverable for CST-452 Milestone 6. It includes a complete Spring Boot application with secure authentication, CRUD functionality for events, and protection against common vulnerabilities like SQL injection and XSS.

The application demonstrates best practices in cloud application design and development.

---

## Contents of the ZIP File (`milestone 6.zip`)

| File/Folder                    | Description                                                                 |
|-------------------------------|-----------------------------------------------------------------------------|
| `/src`                        | Full Java source code for the Spring Boot application                       |
| `pom.xml`                     | Maven configuration with project dependencies                              |
| `application.properties`      | Database connection and server settings                                    |
| `/templates`                  | Thymeleaf HTML views including `home`, `login`, `register`, and `events`   |
| `/static`                     | CSS styling files (if present)                                             |
| `README.md`                   | This file                                                                  |
| `Milestone6_LuisJesusRuiz.docx` | Final milestone documentation detailing features, challenges, and purpose |
| `Capstone_Milestone6_Presentation.pptx` | Final PowerPoint presentation with screenshots and explanation   |
| `screenshots/` (if any)       | Application screenshots used in documentation and PPT                      |

---

## Key Features
- User registration and encrypted login
- Create, list, and search events
- Secure coding practices (SQL Injection/XSS protection)
- Built with Spring Boot, Thymeleaf, and MySQL (MAMP)

---

## How to Run the Application
1. Open terminal inside the project folder
2. Run with Maven:
   ```bash
   mvn spring-boot:run
