package com.zen.dao;

import com.zen.domain.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DeptDao {

    @Insert("insert into dept values(null,#{dname},#{loc})")
    @Options(useGeneratedKeys = true,keyProperty = "deptno")
    public void save(Dept dept);

    @Select("select * from dept")
    @Results({
            @Result(property = "deptno",column = "deptno"),
            @Result(property = "dname",column = "dname"),
            @Result(property = "loc",column = "loc"),
            @Result(property = "emps",column = "deptno",many = @Many(select = "com.zen.dao.EmpDao.findByDept"))
    })
    public List<Dept> findAll();

}
