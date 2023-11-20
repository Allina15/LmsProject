package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Lesson;
import peaksoft.repo.LessonRepo;

import java.util.List;
@Repository
@Transactional
public class LessonRepoImpl implements LessonRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Lesson lesson) {
        entityManager.persist(lesson);
    }

    @Override
    public List<Lesson> getAllLessons() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Lesson newLesson) {

    }

    @Override
    public void getById(long id) {

    }
}
