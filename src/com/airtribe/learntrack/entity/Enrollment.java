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
    private Enrollment(EnrollmentBuilder builder) {
        this.enrollmentId = builder.enrollmentId;
        this.studentId = builder.studentId;
        this.courseId = builder.courseId;
        this.enrollmentDate = builder.enrollmentDate;
        this.status = builder.status;
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
    public static class EnrollmentBuilder {
        private int enrollmentId;
        private int studentId;
        private int courseId;
        private String enrollmentDate;
        private String status;

        public EnrollmentBuilder setEnrollmentId(int enrollmentId) {
            this.enrollmentId=enrollmentId;
            return this;
        }
        public EnrollmentBuilder setStudentId(int studentId) {
            this.studentId=studentId;
            return this;
        }
        public EnrollmentBuilder setCourseId(int courseId) {
            this.courseId=courseId;
            return this;
        }
        public EnrollmentBuilder setEnrollmentDate(String enrollmentDate) {
            this.enrollmentDate=enrollmentDate;
            return this;
        }
        public EnrollmentBuilder setStatus(String status) {
            this.status=status;
            return this;
        }
        public Enrollment build() {
            return new Enrollment(this);
        }
    }
}