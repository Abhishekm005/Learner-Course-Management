package com.airtribe.learntrack.repository;

import java.util.List;
import java.util.ArrayList;
import com.airtribe.learntrack.entity.Course;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public void save(Course c) {
        courses.add(c);
    }

    public List<Course> findAll() {
        return courses;
    }

    public Course findCourseById(int id) {
        for (Course c : courses) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public int courseCount() {
        return courses.size();
    }
}