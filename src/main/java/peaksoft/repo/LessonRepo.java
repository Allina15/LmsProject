package peaksoft.repo;


import peaksoft.model.Lesson;

import java.util.List;

public interface LessonRepo {
    void save(Lesson lesson);
    List<Lesson> getAllLessons();
    void delete(long id);
    void update(long id, Lesson newLesson);
    void getById(long id);
}
