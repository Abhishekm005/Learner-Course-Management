# LearnTrack - Student & Course Management System

##  Project Overview
LearnTrack is a console-based application built using Core Java.  
It allows administrators to manage:

* Students
* Courses
* Enrollments

The project focuses on learning Java fundamentals such as OOP, collections, and clean code structure.


## Features

### Student Management
* Add new student
* View all students
* View active students
* Search student by ID
* Update student batch
* Deactivate student

### Course Management
* Add course
* View courses
* Search course by ID
* Update course name
* Activate/Deactivate course

###  Enrollment Management
* Enroll student in course
* View all enrollments
* View enrollments by student


##  Project Structure

src/
 └── com/airtribe/learntrack/
      │    
      ├── ui/ 
      │    └── Main.java
      │
      ├── entity/
      │    ├── Person.java
      │    ├── Student.java
      │    ├── Course.java
      │    └── Enrollment.java
      │
      ├── repository/ // Data storage layer
      │    ├── StudentRepository.java
      │    ├── CourseRepository.java
      │    └── EnrollmentRepository.java
      │
      ├── service/ // Business logic layer
      │    ├── StudentService.java
      │    ├── CourseService.java
      │    └── EnrollmentService.java
      │ 
      ├── exception/
      │    ├── EntityNotFoundException.java
      │    └── InvalidInputException.java 
      │    
      ├── util/
      │    ├── IdGenerator.java
      │    └── InputValidator.java
      │
      └── enums/
           ├── EnrollmentStatus.java
           └── CourseStatus.java 


## ️ Technologies Used

* Java (Core Java)
* OOP Concepts
* ArrayList (Collections)


##  How to Run

### 1. Compile

javac com/airtribe/learntrack/ui/Main.java


## Java Execution Flow

Java Code (.java) --> Compiler(javac) --> Bytecode(.class) --> JVM --> Machine Code --> Output

## Layered Architecture

User Input --> UI (Main.java) --> Service Layer --> Repository Layer --> ArrayList (Data Storage)