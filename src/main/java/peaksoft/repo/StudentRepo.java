package peaksoft.repo;

import peaksoft.model.Student;

import java.util.List;

public interface StudentRepo {
    void save(Student student);
    List<Student> getAllStudents();
    void delete(long id);
    void update(long id, Student newStudent);
    void getById(long id);
}
