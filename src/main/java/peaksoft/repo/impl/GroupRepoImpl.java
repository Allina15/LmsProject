package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Group;
import peaksoft.repo.GroupRepo;

import java.util.List;
@Repository
@Transactional
public class GroupRepoImpl implements GroupRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Group group) {
        entityManager.persist(group);
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
