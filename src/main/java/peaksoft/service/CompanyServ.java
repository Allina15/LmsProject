package peaksoft.service;

import peaksoft.model.Company;

import java.util.List;

public interface CompanyServ {
    void save(Company company);
    List<Company> getAllCompanies();
    void delete(long id);
    void update(long id, Company newCompany);
    Company getById(long id);
}
