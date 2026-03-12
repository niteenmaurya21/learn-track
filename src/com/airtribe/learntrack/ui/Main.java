package com.airtribe.learntrack.ui;

import java.util.Scanner;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;

import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService= new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while(true){
            System.out.println("\n=====LearnTrack Menu=====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Add Course");
            System.out.println("4. View Course");
            System.out.println("5. Enroll Student");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");

            System.out.println("Choose Option: ");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("First Name: ");
                    String firstName= scanner.nextLine();
                    System.out.println("Last Name: ");
                    String lastName=scanner.nextLine();
                    System.out.println("Email: ");
                    String email= scanner.nextLine();
                    System.out.println("Batch: ");
                    String batch=scanner.nextLine();

                    Student student = new Student(studentService.getAllStudent().size()+1,
                            firstName,
                            lastName,
                            email,
                            batch
                    );
                    studentService.addStudent(student);

                    System.out.println("Student added Successfully");
                    break;

                case 2:
                    for(Student s: studentService.getAllStudent()) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("course name: ");
                    String courseName=scanner.nextLine();

                    System.out.println("course description: ");
                    String description=scanner.nextLine();

                    System.out.println("Duration(weeks): ");
                    int duration= scanner.nextInt();
                    scanner.nextLine();

                    Course course = new Course(courseService.getAllCourses().size()+1,
                            courseName,
                            description,
                            duration
                            );
                    courseService.addCourse(course);
                    System.out.println("Course added successfully!");
                    break;

                case 4:
                    for(Course c: courseService.getAllCourses() ){
                        System.out.println(c);
                    }
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    int studentId=scanner.nextInt();

                    System.out.print("Course Id: ");
                    int courseId=scanner.nextInt();
                    scanner.nextLine();

                    Enrollment enrollment= new Enrollment(
                            enrollmentService.getallEnrollments().size()+1,
                            studentId,
                            courseId,
                            "2026-03-10",
                            "Active"
                    );

                    enrollmentService.enrollStudent(enrollment);
                    System.out.println("Enrollment Successfull");
                    break;

                case 6:
                    for(Enrollment e: enrollmentService.getallEnrollments()) {
                        System.out.println(e);
                        break;
                    }

                case 7:
                    System.out.println("Exiting....");
                    scanner.close();
                    return;

                default :
                    System.out.println("Invalid Option");
            }
        }
    }
}



