package peaksoft.repo;

import peaksoft.model.Group;

import java.util.List;

public interface GroupRepo {
    void save(Group group);
    List<Group> getAllGroups();
    void delete(long id);
    void update(long id, Group newGroup);
    void getById(long id);
}
