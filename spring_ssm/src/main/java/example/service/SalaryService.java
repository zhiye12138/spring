package example.service;

import example.domain.Salary;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface SalaryService {
    public boolean save(Salary salary);
    public boolean update(Salary salary);
    public boolean delete(Integer id);
    public Salary findById(Integer id);
    public List<Salary> findAll();
}
