package peaksoft.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.model.Group;
import peaksoft.repo.GroupRepo;
import peaksoft.service.GroupServ;

import java.util.List;
@Service
public class GroupServImpl implements GroupServ {
    @Autowired
    private GroupRepo groupRepo;

    @Override
    public void save(Group group) {
        groupRepo.save(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Group newGroup) {

    }

    @Override
    public void getById(long id) {

    }
}
