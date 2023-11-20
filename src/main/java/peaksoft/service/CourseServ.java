package peaksoft.service;

import peaksoft.model.Course;

import java.util.List;

public interface CourseServ {
    void save(Course course);
    List<Course> getAllCourses();
    void delete(long id);
    void update(long id, Course newCourse);
    Course getById(long id);
}
