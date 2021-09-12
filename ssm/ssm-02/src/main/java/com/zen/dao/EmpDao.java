package com.zen.dao;

import com.zen.domain.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpDao {

    @Insert("insert into emp values(null,#{ename},#{sal},#{deptno})")
    public void save(Emp emp);

    @Select("select * from emp where deptno = #{deptno}")
    public List<Emp> findByDept(Integer deptno);
}
