package com.airtribe.learntrack.repository;

import java.util.List;
import java.util.ArrayList;
import com.airtribe.learntrack.entity.Enrollment;

public class EnrollmentRepository {

    private List<Enrollment> enrollments = new ArrayList<Enrollment>();


    public void save(Enrollment e){
        enrollments.add(e);
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }

    public List<Enrollment> findByStudentId(int studentId) {
        List<Enrollment> result = new ArrayList<>();
        for (Enrollment e: enrollments){
            if (e.getStudentId() == studentId){
                result.add(e);
            }
        }
        return result;
    }
    public List<Enrollment> findByCourseId(int courseId) {
        List<Enrollment> result = new ArrayList<>();
        for (Enrollment e: enrollments){
            if (e.getCourseId() == courseId){
                result.add(e);
            }
        }
        return result;
    }

    public int enrollmentCount() {
        return enrollments.size();
    }
}
