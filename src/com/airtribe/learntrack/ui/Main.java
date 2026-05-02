package com.airtribe.learntrack.ui;

import java.util.Scanner;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.*;
import com.airtribe.learntrack.util.IdGenerator;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final StudentService studentService = new StudentService();
    private static final CourseService courseService = new CourseService();
    private static final EnrollmentService enrollmentService = new EnrollmentService();

    public static void main(String[] args) {

        while (true) {
            printMainMenu();
            int choice = readInt();

            try {
                switch (choice) {
                    case 1:
                        studentMenu();
                        break;
                    case 2:
                        courseMenu();
                        break;
                    case 3:
                        enrollmentMenu();
                        break;
                    case 0:
                        exitApp();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("⚠ Error: " + e.getMessage());
            }
        }
    }

    // ================= MAIN MENU =================

    private static void printMainMenu() {
        System.out.println("\n========= LearnTrack =========");
        System.out.println("1. Student Management");
        System.out.println("2. Course Management");
        System.out.println("3. Enrollment Management");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    // ================= STUDENT MENU =================

    private static void studentMenu() {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Active Students");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Update Student Batch");
            System.out.println("6. Deactivate Student");
            System.out.println("7. Total Students");
            System.out.println("0. Back");
            System.out.print("Choose option: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    viewActiveStudents();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    updateStudent();
                    break;
                case 6:
                    deactivateStudent();
                    break;
                case 7:
                    System.out.println("Total Students: " + studentService.studentCount());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void addStudent() {
        System.out.print("First Name: ");
        String fn = readString();

        System.out.print("Last Name: ");
        String ln = readString();

        System.out.print("Email: ");
        String email = readString();

        System.out.print("Batch: ");
        String batch = readString();

        studentService.addStudent(new Student(
                IdGenerator.nextStudentId(), fn, ln, email, batch));

        System.out.println("✔ Student added successfully!");
    }

    private static void viewStudents() {
        for(Student s : studentService.getAllStudents()){
                System.out.println(s.getId() + " | " + s.getDisplayName());
        }
    }

    private static void viewActiveStudents() {
        for (Student s : studentService.getActiveStudents()){
            System.out.println(s.getDisplayName());
        }

    }

    private static void searchStudent() {
        System.out.print("Enter ID: ");
        int id = readInt();
        Student s = studentService.getById(id);
        System.out.println("Found: " + s.getDisplayName());
    }

    private static void updateStudent() {
        System.out.print("Enter ID: ");
        int id = readInt();

        System.out.print("New Batch: ");
        String batch = readString();

        studentService.updateStudent(id, batch);
        System.out.println("✔ Updated!");
    }

    private static void deactivateStudent() {
        System.out.print("Enter ID: ");
        int id = readInt();

        studentService.deactivateStudent(id);
        System.out.println("✔ Student deactivated");
    }

    // ================= COURSE MENU =================

    private static void courseMenu() {
        while (true) {
            System.out.println("\n--- Course Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Search Course by ID");
            System.out.println("4. Update Course Name");
            System.out.println("5. Toggle Course Status");
            System.out.println("6. Total Courses");
            System.out.println("0. Back");

            int choice = readInt();

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    viewCourses();
                    break;
                case 3:
                    searchCourse();
                    break;
                case 4:
                    updateCourse();
                    break;
                case 5:
                    toggleCourse();
                    break;
                case 6:
                    System.out.println("Total Courses: " + courseService.courseCount());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void addCourse() {
        System.out.print("Name: ");
        String name = readString();

        System.out.print("Description: ");
        String desc = readString();

        System.out.print("Duration: ");
        int d = readInt();

        courseService.addCourse(new Course(
                IdGenerator.nextCourseId(), name, desc, d));

        System.out.println("✔ Course added!");
    }

    private static void viewCourses() {
       for(Course c : courseService.getAllCourses()) {
           System.out.println(c.getId() + " | " + c.getCourseName() + " | " + c.getStatus());
       }
    }

    private static void searchCourse() {
        System.out.print("Enter ID: ");
        int id = readInt();

        Course c = courseService.getById(id);
        System.out.println("Found: " + c.getCourseName());
    }

    private static void updateCourse() {
        System.out.print("Enter ID: ");
        int id = readInt();

        System.out.print("New Name: ");
        String name = readString();

        courseService.updateCourse(id, name);
        System.out.println("✔ Updated!");
    }

    private static void toggleCourse() {
        System.out.print("Enter ID: ");
        int id = readInt();

        courseService.toggleCourseStatus(id);
        System.out.println("✔ Status toggled!");
    }

    // ================= ENROLLMENT MENU =================

    private static void enrollmentMenu() {
        while (true) {
            System.out.println("\n--- Enrollment Menu ---");
            System.out.println("1. Enroll Student");
            System.out.println("2. View All Enrollments");
            System.out.println("3. View Enrollments by Student");
            System.out.println("0. Back");

            int choice = readInt();

            switch (choice) {
                case 1:
                    enrollStudent();
                    break;
                case 2:
                    viewEnrollments();
                    break;
                case 3:
                    viewByStudent();
                    break;
                case 0:
                    return;
                default :
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static void enrollStudent() {
        System.out.print("Student ID: ");
        int sid = readInt();

        System.out.print("Course ID: ");
        int cid = readInt();

        enrollmentService.addEnrollment(new Enrollment(
                IdGenerator.nextEnrollmentId(), sid, cid));

        System.out.println("✔ Enrollment successful!");
    }

    private static void viewEnrollments() {
       for(Enrollment e: enrollmentService.getAllEnrollments()) {
           System.out.println("EnrollID: " + e.getEnrollmentId()
                   + " | Student: " + e.getStudentId()
                   + " | Course: " + e.getCourseId());
       }
    }

    private static void viewByStudent() {
        System.out.print("Student ID: ");
        int sid = readInt();

        for (Enrollment e : enrollmentService.getByStudent(sid)) {
            System.out.println("EnrollID: " + e.getEnrollmentId());
        }
    }
    // ================= HELPER METHODS =================

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Enter valid number: ");
            }
        }
    }

    private static String readString() {
        String input = sc.nextLine();
        if (input.trim().isEmpty()) {
            System.out.print("Cannot be empty, re-enter: ");
            return readString();
        }
        return input;
    }

    private static void exitApp() {
        System.out.println("Exiting LearnTrack... Goodbye!");
        System.exit(0);
    }
}