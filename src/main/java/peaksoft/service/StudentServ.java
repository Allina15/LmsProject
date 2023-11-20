package peaksoft.service;

import peaksoft.model.Student;

import java.util.List;

public interface StudentServ {
    void save(Student student);
    List<Student> getAllStudents();
    void delete(long id);
    void update(long id, Student newStudent);
    void getById(long id);
}
