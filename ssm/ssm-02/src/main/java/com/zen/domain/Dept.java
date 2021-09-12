package com.zen.domain;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {

    //基本属性
    private Integer deptno;
    private String dname;
    private String loc;

    //关联属性
    private List<Emp> emps;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc, List<Emp> emps) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.emps = emps;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
