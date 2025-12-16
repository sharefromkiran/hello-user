# 🚀 Hello, Username! – Spring Boot Project

A simple Spring Boot REST application that returns a personalized greeting.

Example:
GET /hello/{username} → Hello, username!

--- 

## 📌 Project Purpose

This project demonstrates a professional, industry-standard development workflow using:

Linux environment (WSL):
- Spring Boot
- Git & GitHub
- Docker
- CI/CD
- Kubernetes (optional, advanced)

The same workflow can be applied to any technology stack.

--- 

## 🛠 Tech Stack

- Java: 17
- Spring Boot: 3.x
- Build Tool: Maven
- Version Control: Git
- Containerization: Docker
- CI/CD: GitHub Actions
- Platform: WSL (Linux)

--- 

## 📂 Project Structure
```
hello-user
├── src
│   └── main
│       ├── java
│       │   └── com.example.hellouser
│       │       └── controller
│       │           └── HelloController.java
│       └── resources
│           └── application.properties
├── Dockerfile
├── pom.xml
└── README.md
```

---

## Run Locally (WSL)

- ./mvnw spring-boot:run
- curl http://localhost:8080/hello/kiran

---

## 🧪 Rebuild & Test

- ./mvnw clean test
- ./mvnw clean package

---

## 🐳 Docker Run

- Build Image  : docker build -t hello-user . 
- Run Container: docker run -p 8080:8080 hello-user

---

## 🔄 CI/CD Workflow

- Triggered on every git push
- Builds project using Maven
- Ensures code is always in a deployable state

---

## ☸️ Kubernetes (Optional – Advanced)

- Used for production deployment
- Handles scaling & availability
- Applied only after Docker + CI/CD

---

## 🧠 Professional Workflow Followed

```
1. Create project → WSL
2. Build & run → WSL
3. Verify → Browser / curl
4. Open in STS
5. Develop & debug
6. Re-build & test → WSL
7. Git commit & push
8. Docker build & deploy
9. CI/CD automation
10. Kubernetes deployment
```
---

## 📎 Notes

- Application is stopped before Git commit
- Clean commits with tested code only
- Same workflow applies to Spring, React, Python, C++, etc.

---

## 👤 Author

- Kiran Gorrepati
- Java Full-Stack Developer

---

## ✅ Final Note

This project is intentionally simple in functionality,
but strong in workflow and best practices, reflecting real-world professional development.
