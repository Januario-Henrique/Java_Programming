# 🏨 Hotel Management System

This repository contains two versions of a Hotel Management System developed to demonstrate Java programming concepts and system evolution from in-memory storage to database persistence.

---

# 📌 Project 1: Console-Based Hotel Management System

## 📖 Overview
This is a menu-driven Java console application that allows users to manage hotel clients using in-memory storage (ArrayList).

## ✅ Features
- Register client
- Update client
- Delete client
- Display all clients
- Find client by ID
- Input validation (name & age)

## 🛠 Technologies Used
- Java
- OOP Principles (Encapsulation, Classes, Objects)
- ArrayList (Java Collections Framework)
- Scanner (User input handling)

## 🧠 Concepts Demonstrated
- CRUD operations
- Static auto-increment ID
- Encapsulation with getters and setters
- Data validation using Regex
- Menu-driven program structure

## ⚠ Limitation
- Data is not saved permanently
- Once the program stops, all data is lost

---

# 📌 Project 2: Database-Integrated Hotel Management System (JDBC Version)

## 📖 Overview
This version extends the console application by integrating a MySQL database using JDBC. Client data is now stored permanently in a database.

## ✅ Features
- Register client (stored in MySQL database)
- Update client
- Delete client
- Display all clients
- Find client by ID
- Persistent storage

## 🛠 Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL
- SQL (INSERT, UPDATE, DELETE, SELECT)
- PreparedStatement (for secure queries)

## 🧠 Concepts Demonstrated
- Database connectivity
- SQL query execution
- Persistent data storage
- Exception handling (try-catch)
- Resource management (closing connections)

## ⚠ Improvements Over Version 1
- Data persistence
- More scalable
- Suitable for real-world systems
- Better data management

---

# 🔎 Key Differences Between Both Projects

| Feature | Version 1 (ArrayList) | Version 2 (MySQL + JDBC) |
|----------|-----------------------|--------------------------|
| Data Storage | In-memory | Database |
| Data Persistence | ❌ No | ✅ Yes |
| Scalability | Limited | High |
| Performance | Fast (small data) | Optimized for larger data |
| Real-world usage | Educational | Production-ready base |

---

# 🚀 Learning Outcome

Through these two projects, the following skills were developed:

- Understanding of Java fundamentals
- Practical implementation of OOP
- CRUD operations
- Transition from local data storage to database systems
- JDBC integration
- SQL query writing
- Input validation
- Error handling

---

# 📌 Future Improvements

- GUI implementation (JavaFX or Swing)
- Web-based version (Spring Boot)
- Authentication system
- Admin and user roles
- Logging system
- REST API integration

---

# 👨‍💻 Author
Developed as part of Java learning and practical database integration exercises.
@Januario Henrique--> https://www.linkedin.com/in/januario-henrique-98335a314/
