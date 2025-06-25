# 🎥 Bilibili Video Platform

A modular Java-based video streaming platform inspired by Bilibili.  
Built with **Spring Boot**, follows a **multi-module layered architecture**, and supports RESTful APIs, service orchestration, and database interaction.

---

## 📁 Project Structure

bilibili/
├── bilibili-api       # API interfaces (Controller layer)
├── bilibili-dao       # Data access layer (Mapper, Entity)
├── bilibili-service   # Business logic layer
├── src/               # Application entry & configuration
├── pom.xml            # Maven parent module

---

Module
Description
bilibili-api
Exposes RESTful APIs for frontend interaction
bilibili-dao
Handles database access (MyBatis / JPA)
bilibili-service
Contains business logic and service orchestration
src
Application entry point and global config


## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven 3.8+
- IDE: IntelliJ IDEA / VS Code

### ▶️ Run the Application

```bash
# Navigate to the root folder
cd bilibili

# Clean and install dependencies
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run

🗃️ Tips for Development
	•	Use .gitignore to exclude IDE / OS-specific files (.idea, .DS_Store, etc.)
	•	Keep environment-specific configs in application.yml or .env (for Docker)
	•	Consider adding a GitHub Actions workflow in .github/workflows/ for CI/CD

Feel free to fork, open issues, or submit pull requests.
This is a personal backend architecture project — collaboration is welcome!

This project is licensed under the MIT License.
