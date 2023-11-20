package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.repo.CompanyRepo;

import java.util.List;
@Repository
@Transactional
public class CompanyRepoImpl implements CompanyRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Company company) {
    entityManager.persist(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return entityManager.createQuery("select c from Company c", Company.class).getResultList();
    }

    @Override
    public void delete(long id) {
    entityManager.remove(entityManager.find(Company.class,id));
    }

    @Override
    public void update(long id, Company newCompany) {
    entityManager.find(Company.class,id);
    entityManager.merge(newCompany);
    }

    @Override
    public Company getById(long id) {
    return entityManager.find(Company.class, id);
    }
}
