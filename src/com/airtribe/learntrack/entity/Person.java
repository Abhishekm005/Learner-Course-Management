package com.airtribe.learntrack.entity;

public class Person {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;

    // Default Constructor...

    public Person() {}

    // Perametarize Constructor...

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
// Constructor Overloading...

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return firstName + " " + lastName;
    }
    // Getters...

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
