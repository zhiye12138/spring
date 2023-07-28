package example.service.impl;

import example.dao.SalaryDao;
import example.domain.Salary;
import example.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.SliderUI;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryDao salaryDao;
    public boolean save(Salary salary) {
        salaryDao.save(salary);
        return true;
    }
    public boolean update(Salary salary) {
        salaryDao.update(salary);
        return true;
    }
    public boolean delete(Integer id) {
        salaryDao.delete(id);
        return true;
    }
    public Salary findById(Integer id) {
        return salaryDao.findById(id);
    }
    public List<Salary> findAll() {
        return salaryDao.findAll();
    }
}
