package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.util.InputValidator;

public class Student extends Person{
    private String batch;
    private boolean active;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, String batch){
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = true ;
    }

    public Student(int id, String firstName, String lastName, String batch){
        super(id, firstName, lastName);
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + super.getDisplayName();
    }
    // Getters...

    public String getBatch() {
        return batch;
    }

    public int getId() {
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public boolean isActive() {
        return active;
    }

    // Setters...

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
