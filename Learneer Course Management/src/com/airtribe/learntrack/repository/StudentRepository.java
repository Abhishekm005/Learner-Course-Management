package com.airtribe.learntrack.repository;

import java.util.List;
import java.util.ArrayList;
import com.airtribe.learntrack.entity.Student;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void save(Student s) {
        students.add(s);
    }

    public List<Student> findAll() {
        return students;
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public int studentCount() {
        return students.size();
    }
}