package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Student;
import peaksoft.repo.StudentRepo;

import java.util.List;
@Repository
@Transactional
public class StudentRepoImpl implements StudentRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Student newStudent) {

    }

    @Override
    public void getById(long id) {

    }
}
