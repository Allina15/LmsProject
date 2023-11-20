package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.model.Company;
import peaksoft.service.CompanyServ;

@Controller
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompanyController {

  private final CompanyServ companyServ;

  @GetMapping
  public String getAll(Model model){
    model.addAttribute("getAllCompanies", companyServ.getAllCompanies());
    return "companies";
  }

  @GetMapping("/createCompany")
  public String create(Model model){
    model.addAttribute("newCompany", new Company());
    return "createCompany";
  }

  @PostMapping("/save")
  public String save(@ModelAttribute("newCompany") Company company){
    companyServ.save(company);
    return "redirect:/companies";
  }
  @GetMapping("/{id}")
  public String get(@PathVariable("id") long id, Model model){
    Company company = companyServ.getById(id);
    model.addAttribute("newCompany", company);
    return "/company";
  }
  @GetMapping("/{id}/updateCompany")
  public String update(Model model, @PathVariable("id") long id){
    model.addAttribute("newCompany",companyServ.getById(id));
    return "updateCompany";
  }

  @PutMapping("/{id}")
  public String edit(@ModelAttribute("newAgency") Company company, @PathVariable("id") long id){
    companyServ.update(id,company);
    return "redirect:/companies";
  }

  @DeleteMapping("/{id}/delete")
  public String delete(@PathVariable("id") Long id) {
    companyServ.delete(id);
    return "redirect:/companies";
  }
}
