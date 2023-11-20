package peaksoft.service;

import peaksoft.model.Instructor;

import java.util.List;

public interface InstructorServ {
    void save(Instructor instructor);
    List<Instructor> getAllInstructors();
    void delete(long id);
    void update(long id, Instructor newInstructor);
    void getById(long id);
}
