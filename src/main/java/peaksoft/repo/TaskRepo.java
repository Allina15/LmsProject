package peaksoft.repo;

import peaksoft.model.Task;

import java.util.List;

public interface TaskRepo {
    void save(Task task);
    List<Task> getAllTasks();
    void delete(long id);
    void update(long id, Task newTask);
    void getById(long id);
}
