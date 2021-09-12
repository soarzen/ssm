package com.zen.service;

import com.zen.dao.DeptDao;
import com.zen.dao.EmpDao;
import com.zen.domain.Dept;
import com.zen.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private EmpDao empDao;

    //配置事务，隔离级别，传播行为
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void save(String dname,String loc,String[] ename,Integer[] sal) {
        Dept dept = new Dept(null,dname,loc,null);
        deptDao.save(dept);

        for(int i = 0; i < ename.length; i++) {
            Emp emp = new Emp(null,ename[i],sal[i],dept.getDeptno(),null);
            empDao.save(emp);
        }
    }

    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
