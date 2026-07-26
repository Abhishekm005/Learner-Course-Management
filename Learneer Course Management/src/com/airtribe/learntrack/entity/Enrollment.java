package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.EnrollmentStatus;
import java.time.LocalDate;

public class Enrollment {
    private int enrollmentId;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment() {

    }

    public Enrollment (int id, int studentid, int courseId) {
        this.enrollmentId = id;
        this.studentId = studentid;
        this.courseId = courseId;
        this.enrollmentDate = LocalDate.now();
        this.status = EnrollmentStatus.ACTIVE;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}
