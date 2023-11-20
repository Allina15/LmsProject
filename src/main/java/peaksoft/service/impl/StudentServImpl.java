package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Student;
import peaksoft.repo.StudentRepo;
import peaksoft.service.StudentServ;

import java.util.List;
@Service
public class StudentServImpl implements StudentServ {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(Student student) {
        studentRepo.save(student);
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
