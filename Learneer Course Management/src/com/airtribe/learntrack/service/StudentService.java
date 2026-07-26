package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.StudentRepository;
import com.airtribe.learntrack.util.InputValidator;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private StudentRepository studentRepo = new StudentRepository();

    public void addStudent(Student s) {
        InputValidator.validateString(s.getFirstName(), "First Name");
        InputValidator.validateString(s.getLastName(), "Last Name");
        InputValidator.validateString(s.getEmail(), "Email");
        studentRepo.save(s);
    }

    public Student getById(int id) {
        InputValidator.validateId(id, "Student ID");
        Student s = studentRepo.findStudentById(id);
        if (s == null) {
            throw new EntityNotFoundException("Student not found, Enter Valid Student ID");
        }
        return s;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public List<Student> getActiveStudents() {
        List<Student> result = new ArrayList<>();
        for (Student s : studentRepo.findAll()) {
            if (s.isActive()) {
                result.add(s);
            }
        }
        return result;
    }

    public void updateStudent(int id, String batch) {
        Student s =getById(id);
        InputValidator.validateString(batch,"Batch");
        s.setBatch(batch);
    }

    public void deactivateStudent(int id) {
        getById(id).setActive(false);
    }

    public void activateStudent(int id) {
        getById(id).setActive(true);
    }

    public int studentCount() {
        return studentRepo.studentCount();
    }

}
