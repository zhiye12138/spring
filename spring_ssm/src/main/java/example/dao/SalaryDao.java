package example.dao;

import example.domain.Salary;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface SalaryDao {
    @Insert("insert into rmb (id, name, money) values (#{id}, #{name}, #{money})")
    public void save(Salary salary);
    @Update("update rmb set name = #{name}, money = #{money} where id = #{id}")
    public void update(Salary salary);
    @Delete("delete from rmb where id = #{id}")
    public void delete(Integer id);
    @Select("select * from rmb where id = #{id}")
    public Salary findById(Integer id);
    @Select("select * from rmb")
    public List<Salary> findAll();
}
