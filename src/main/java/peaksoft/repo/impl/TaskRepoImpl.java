package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Task;
import peaksoft.repo.TaskRepo;

import java.util.List;
@Repository
@Transactional
public class TaskRepoImpl implements TaskRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Task task) {
        entityManager.persist(task);
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
