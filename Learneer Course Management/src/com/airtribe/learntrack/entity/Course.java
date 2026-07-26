package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.CourseStatus;

public class Course {

    private int id;
    private String courseName;
    private String description;
    private int duaratioInWeeks;
    private CourseStatus status;

    // Dafault Constructor...
    public Course() {

    }

    public Course(int id, String courseName, String description,  int duaratioInWeeks) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.duaratioInWeeks = duaratioInWeeks;
        this.status = CourseStatus.ACTIVE;
    }
    // Getter & Setters...

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
         this.courseName = courseName;
    }

    public int getDuaratio() {
        return duaratioInWeeks;
    }

    public CourseStatus getStatus() {
        return status;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }
}
