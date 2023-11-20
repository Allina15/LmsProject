package peaksoft.repo;

import peaksoft.model.Instructor;

import java.util.List;

public interface InstructorRepo {
    void save(Instructor instructor);
    List<Instructor> getAllInstructors();
    void delete(long id);
    void update(long id, Instructor newInstructor);
    void getById(long id);
}
