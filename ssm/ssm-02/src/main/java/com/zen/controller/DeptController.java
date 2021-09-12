package com.zen.controller;

import com.zen.domain.Dept;
import com.zen.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "saveDept",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String saveDept(String dname,String loc,String[] ename,Integer[] sal) {
        service.save(dname, loc, ename, sal);
        return "保存成功";
    }

    @RequestMapping("deptList")
    @ResponseBody
    public List<Dept> deptList() {
        //spring mvc会转换json
        return service.findAll();
    }
}
