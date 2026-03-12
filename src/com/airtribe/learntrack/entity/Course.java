package com.airtribe.learntrack.entity;

public class Course {
    private int courseId;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active;

    public Course (int courseId, String courseName, String description, int durationInWeeks) {
        this.courseId=courseId;
        this.courseName=courseName;
        this.description=description;
        this.durationInWeeks=durationInWeeks;
        this.active=true;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public boolean isActive() {
        return active;
    }
    public void deactivate() {
        active=false;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", durationInWeeks=" + durationInWeeks +
                ", active=" + active +
                '}';
    }
}