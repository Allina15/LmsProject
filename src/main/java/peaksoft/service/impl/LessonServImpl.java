package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Lesson;
import peaksoft.repo.LessonRepo;
import peaksoft.service.LessonServ;

import java.util.List;
@Service
public class LessonServImpl implements LessonServ {
    @Autowired
    private LessonRepo lessonRepo;

    @Override
    public void save(Lesson lesson) {
        lessonRepo.save(lesson);
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
