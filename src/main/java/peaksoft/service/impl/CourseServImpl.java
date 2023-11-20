package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Course;
import peaksoft.repo.CourseRepo;
import peaksoft.service.CourseServ;

import java.util.List;

@Service
public class CourseServImpl implements CourseServ {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void save(Course course) {
        courseRepo.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.getAllCourses();
    }

    @Override
    public void delete(long id) {
    courseRepo.delete(id);
    }

    @Override
    public void update(long id, Course newCourse) {
        courseRepo.update(id,newCourse);
    }

    @Override
    public Course getById(long id) {
    return courseRepo.getById(id);
    }
}
