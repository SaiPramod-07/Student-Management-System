# Student Management System

A simple console-based Student Management System developed using **Java, JDBC, and MySQL** to manage student records.

## Features

* Add student
* View student details
* Update student details
* Delete student
* Store student records in MySQL
* Perform CRUD operations using JDBC

## Technologies Used

* Java
* JDBC
* MySQL

## Project Structure

```text
StudentManagementSystem
│
├── src
│   ├── Model
│   │   └── Student.java
│   │
│   ├── DAO
│   │   └── StudentDAO.java
│   │
│   └── DB
│       └── DBConnection.java
│
└── Main.java
```

## Database

The project uses **MySQL** to store student information.

Example table:

```sql
CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(
```
