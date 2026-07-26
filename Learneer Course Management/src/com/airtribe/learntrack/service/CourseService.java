package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.exception.*;
import com.airtribe.learntrack.enums.CourseStatus;
import java.util.List;
import com.airtribe.learntrack.util.InputValidator;

public class CourseService{

    public CourseRepository courseRepo =  new CourseRepository();

    public void addCourse(Course course){

        InputValidator.validateString(course.getCourseName(), "Course Name");

        if(course.getDuaratio() <= 0) {
            throw new InvalidInputException("Invalid duaratio");
        }
        courseRepo.save(course);
    }

   public Course getById(int id){
        InputValidator.validateId(id, "Course ID");

        Course c = courseRepo.findCourseById(id);
        if(c == null){
            throw new EntityNotFoundException("Course not found");
        }
        return c;
   }

   public List<Course> getAllCourses(){
        return courseRepo.findAll();
   }

   public void updateCourse(int id, String course){
        Course c = getById(id);
        InputValidator.validateString(course, "Course Name");
        c.setCourseName(course);
   }

   public void toggleCourseStatus(int id){
        Course c = getById(id);
        c.setStatus(c.getStatus() == CourseStatus.ACTIVE ? CourseStatus.INACTIVE : CourseStatus.ACTIVE);
   }

   public int courseCount(){
        return courseRepo.courseCount();
   }
}
