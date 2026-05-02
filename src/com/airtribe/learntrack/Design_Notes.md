
#========= Design Notes ============#

## 1. Why ArrayList instead of Array?

#ArrayList is used because:-

* It is dynamic (no fixed size)
* Easy to add/remove elements
* Better suited for real-world applications

## 2. Where Static is Used

Static is used in IdGenerator:-

* To generate unique IDs
* No need to create object every time
* Shared across entire application

## 3. Where Inheritance is Used

* Person is base class
* Student extends "Person" To inherits the parent fields & methods

Benefits:-
* Code reuse ( use parent fields, methods and constructor )
* It provides cleaner structure code to rewrite same code again and again
* Common properties handled in one place

## 4. Separation of Concerns

* UI → Handles input/output
* Service → Business logic
* Repository → Data storage

This makes code clean and readable, Maintainable- easy to make changes directly, Scalable
