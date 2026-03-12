package com.airtribe.learntrack.service;

import java.util.ArrayList;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public ArrayList<Enrollment> getallEnrollments() {
        return enrollments;
    }
    public Enrollment findEnrollmentById(int id) {
        for(Enrollment e : enrollments) {
            if(e.getEnrollmentId()==id){
                return e;
            }

        }
        throw new EntityNotFoundException("Enrollment not found with id: "+id);
    }
    public ArrayList<Enrollment> getEnrollmentsForStudent(int StudentId) {
        ArrayList<Enrollment> result= new ArrayList<>();
        for(Enrollment e: enrollments) {
            if(e.getStudentId()== StudentId) {
                result.add(e);
            }
        }
        return result;
    }
    public void updateEnrollmentStatus(int enrollmentId, String status) {
        Enrollment enrollment = findEnrollmentById(enrollmentId);
        enrollment.setStatus(status);
    }
}