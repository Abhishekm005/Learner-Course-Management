package com.airtribe.learntrack.service;

import java.util.List;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.repository.EnrollmentRepository;
import com.airtribe.learntrack.enums.EnrollmentStatus;

public class EnrollmentService {

    public EnrollmentRepository enrollmentRepo = new EnrollmentRepository();

    public void addEnrollment(Enrollment e) {
        enrollmentRepo.save(e);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }

    public List<Enrollment> getByStudent(int studentId) {
        return enrollmentRepo.findByStudentId(studentId);
    }

    public void updateEnrollmentStatus(Enrollment e, EnrollmentStatus status) {
        e.setStatus(status);
    }

    public int enrollmentCount() {
        return enrollmentRepo.enrollmentCount();
    }
}
