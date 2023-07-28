package example.controller;

import example.domain.Salary;
import example.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Salarys")

public class SalaryController {

    @Autowired
    private SalaryService salaryService;
    @PostMapping
    public boolean save(@RequestBody Salary salary) {
        salaryService.save(salary);
        return true;
    }
    @PutMapping
    public boolean update(@RequestBody Salary salary) {
        salaryService.update(salary);
        return true;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        salaryService.delete(id);
        return true;
    }
    @GetMapping("/{id}")
    public Salary findById(@PathVariable Integer id) {

        return salaryService.findById(id);
    }
    @GetMapping
    public List<Salary> findAll() {
        return salaryService.findAll();
    }
}
