package com.zen.controller;

import com.zen.domain.Car;
import com.zen.service.CarService;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @RequestMapping("importCars")
    @ResponseBody
    public String importCars(MultipartFile excel) throws IOException {
        InputStream is = excel.getInputStream();
        //获取上传文件的内容，根据业务操作文件内容，使用POI读取xls文件
        List<Car> cars = new ArrayList<>();
        //Excel对象
        Workbook workbook = WorkbookFactory.create(is);
        //Sheet对象
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            //行对象
            Row row = sheet.getRow(i);
            Cell cell1 = row.getCell(0);
            Cell cell2 = row.getCell(1);
            Cell cell3 = row.getCell(2);

            String cname = cell1.toString();
            String color = cell2.toString();
            Integer price = Integer.parseInt(cell3.toString().replace(".0",""));

            Car car = new Car(null,cname,color,price);
            cars.add(car);
        }
        service.save(cars);
        return "import success";
    }

    @RequestMapping("carList")
    public ModelAndView carList() {
        List<Car> cars = service.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cars.jsp");
        mv.addObject("cars",cars);
        return mv;
    }
}
