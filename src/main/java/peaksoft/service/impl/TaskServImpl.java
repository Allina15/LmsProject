package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Task;
import peaksoft.repo.TaskRepo;
import peaksoft.service.TaskServ;

import java.util.List;
@Service
public class TaskServImpl implements TaskServ {
    @Autowired
    private TaskRepo taskRepo;

    @Override
    public void save(Task task) {
        taskRepo.save(task);
    }
    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Task newTask) {

    }

    @Override
    public void getById(long id) {

    }
}
