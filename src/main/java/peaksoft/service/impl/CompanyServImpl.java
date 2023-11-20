package peaksoft.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Company;
import peaksoft.repo.CompanyRepo;
import peaksoft.service.CompanyServ;

import java.util.List;
@Service
public class CompanyServImpl implements CompanyServ {

    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public void save(Company company) {
    companyRepo.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepo.getAllCompanies();
    }

    @Override
    public void delete(long id) {
     companyRepo.delete(id);
    }

    @Override
    public void update(long id, Company newCompany) {
        companyRepo.update(id, newCompany);
    }

    @Override
    public Company getById(long id) {
    return companyRepo.getById(id);
    }
}
