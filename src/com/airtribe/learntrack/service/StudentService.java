package com.airtribe.learntrack.service;

import java.util.ArrayList;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

public class StudentService {
    private ArrayList<Student> students= new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getAllStudent() {
        return students;
    }
    public Student findStudentById(int id) {
        for(Student s: students) {
            if (s.getId()==id) {
                return s;
            }
        }
        throw new EntityNotFoundException("Student not find with id: "+id);

    }
    public void deactivateStudent(int id) {
        Student student= findStudentById(id);
        student.deactivate();
    }
}