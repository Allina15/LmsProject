package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Instructor;
import peaksoft.repo.InstructorRepo;
import peaksoft.service.InstructorServ;

import java.util.List;
@Service
public class InstructorServImpl implements InstructorServ {
    @Autowired
    private InstructorRepo instructorRepo;

    @Override
    public void save(Instructor instructor) {
    instructorRepo.save(instructor);
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
