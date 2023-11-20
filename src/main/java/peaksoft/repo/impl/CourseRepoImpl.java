package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Course;
import peaksoft.repo.CourseRepo;

import java.util.List;

@Transactional
@Repository
public class CourseRepoImpl implements CourseRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Course course) {
        entityManager.persist(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return entityManager.createQuery("select c from Course c", Course.class).getResultList();
    }

    @Override
    public void delete(long id) {
    entityManager.remove(entityManager.find(Course.class,id));
    }

    @Override
    public void update(long id, Course newCourse) {
        entityManager.find(Course.class,id);
        entityManager.merge(newCourse);
    }

    @Override
    public Course getById(long id) {
        return entityManager.find(Course.class,id);
    }
}
