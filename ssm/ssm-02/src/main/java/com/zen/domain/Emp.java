package com.zen.domain;

import java.io.Serializable;

public class Emp implements Serializable {

    //基本属性
    private Integer eno;
    private String ename;
    private Integer sal;
    private Integer deptno;

    //关联属性 (一个员工有一个所属部门信息)
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer eno, String ename, Integer sal, Integer deptno, Dept dept) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.deptno = deptno;
        this.dept = dept;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
