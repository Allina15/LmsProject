package peaksoft.repo.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Instructor;
import peaksoft.repo.InstructorRepo;

import java.util.List;
@Repository
@Transactional
public class InstructorRepoImpl implements InstructorRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Instructor instructor) {
    entityManager.persist(instructor);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Instructor newInstructor) {

    }

    @Override
    public void getById(long id) {

    }
}
