package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.model.Course;
import peaksoft.service.CourseServ;
@Controller
@RequestMapping("/company/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseServ courseServ;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("getAllCourses", courseServ.getAllCourses());
        return "courses";
    }

    @GetMapping("/createCourse")
    public String create(Model model){
        model.addAttribute("newCourse", new Course());
        return "createCourse";
    }

    @PostMapping("/saveCourse")
    public String save(@ModelAttribute("newCourse") Course course){
        courseServ.save(course);
        return "redirect:/company/courses";
    }
    @GetMapping("/{id}")
    public String get(@PathVariable("id") long id, Model model){
        Course course = courseServ.getById(id);
        model.addAttribute("newCourse", course);
        return "/course";
    }
    @GetMapping("/{id}/updateCourse")
    public String update(Model model, @PathVariable("id") long id){
        model.addAttribute("newCourse",courseServ.getById(id));
        return "updateCourse";
    }

    @PutMapping("/{id}")
    public String edit(@ModelAttribute("newCourse") Course course, @PathVariable("id") long id){
        courseServ.update(id,course);
        return "redirect:/courses";
    }

    @DeleteMapping("/{id}/deleteCourse")
    public String delete(@PathVariable("id") Long id) {
        courseServ.delete(id);
        return "redirect:/company/courses";
    }
    @GetMapping("/companies/company")
    public String getCompanyPage() {
        return "/company";
    }
}
