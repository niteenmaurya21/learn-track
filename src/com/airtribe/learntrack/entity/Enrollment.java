package com.airtribe.learntrack.entity;

public class Enrollment{

    private int enrollmentId;
    private int studentId;
    private int courseId;
    private String enrollmentDate;
    private String status;

    public Enrollment(int enrollmentId,int studentId,int courseId, String enrollmentDate, String status) {
        this.enrollmentId=enrollmentId;
        this.studentId=studentId;
        this.courseId=courseId;
        this.enrollmentDate=enrollmentDate;
        this.status=status;
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

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status=status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}