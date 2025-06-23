
# 🌐 Cloud Test Application for Product Management

## 📌 Purpose
This cloud-based application was developed as a Capstone Project for CST-452. Its primary goal is to showcase secure, scalable web development by providing product and event management features, secure user authentication, and deployment readiness for cloud platforms.

---

## ✅ Key Features

- 🔐 **User Authentication:** Register and log in with encrypted credentials.
- 🗂️ **Event Management:** Create, list, search, and manage events.
- 🛡️ **Security:** SQL Injection and XSS protection implemented.
- 💡 **MVC Architecture:** Modular design using Spring Boot and Thymeleaf.
- 📄 **Admin Support:** Admin-level functionality for managing data.
- 🌍 **Cloud-Ready:** Compatible with Azure, Heroku, and MAMP for local testing.

---

## ⚙️ Technologies Used

| Technology       | Purpose                            |
|------------------|-------------------------------------|
| Spring Boot      | Backend Framework                  |
| Thymeleaf        | Frontend Templating Engine         |
| MySQL (MAMP)     | Relational Database (Local)        |
| Java             | Core Programming Language          |
| HTML/CSS/JS      | Frontend Structure & Interaction   |
| Bootstrap        | UI Design & Styling                |
| GitHub           | Version Control and Portfolio      |

---

## 🚀 How to Run Locally

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/luisjesus156/CST-452.git
   cd CST-452
   ```

2. **Set up MySQL Database via MAMP:**
   - Database name: `orders-app`
   - Username: `root`
   - Password: `chucho11J!`

3. **Configure `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/eventsapp
   spring.datasource.username=root
   spring.datasource.password=chucho11J!
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.thymeleaf.cache=false
   ```

4. **Run the App:**
   In terminal:
   ```bash
   ./mvnw spring-boot:run
   ```
   or in VS Code/IntelliJ via Spring Boot runner.

5. **Visit in Browser:**
   ```
   http://localhost:8080/
   ```

---

## 👤 User Guide

- **Register:** Create an account from the navigation bar.
- **Login:** Log in with your registered credentials.
- **Home:** View a welcome page outlining app features.
- **Create Event:** Submit a new event to the system.
- **Search Events:** Use keywords to find existing events.
- **Logout:** End the session securely.

---

## 🛠️ Admin/System Guide

- Admins can monitor CRUD activity via DB.
- The system supports input validation and sanitization to prevent malicious attacks.
- MAMP provides local database management and logs.

---


## 📽️ Screencast

🎥 [Watch Final Project Demo on Loom](https://www.loom.com/share/bb239497947f49b490c6aca08bbf3a8b)

---

## 📁 Milestone 6 Submission Contents

- ✅ Full source code (Spring Boot App)
- ✅ Updated UI and security fixes
- ✅ PowerPoint Poster Presentation
- ✅ Milestone 6 Documentation (Word file)
- ✅ Screencast walkthrough
- ✅ This README file

---

## 📬 Contact

Luis Jesus Ruiz  
📧 [GitHub Profile](https://github.com/luisjesus156)
