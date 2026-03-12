package com.airtribe.learntrack.service;

import java.util.ArrayList;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;

public class CourseService {
    private ArrayList<Course> courses= new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }
    public ArrayList<Course> getAllCourses() {
        return courses;
    }
    public Course findCourseById(int id) {
        for(Course c: courses) {
            if (c.getCourseId()==id) {
                return c;
            }
        }
        throw new EntityNotFoundException("Course not found with id: "+id);

    }
    public void deactivateCourse(int id) {
        Course course = findCourseById(id);
        course.deactivate();
    }
}