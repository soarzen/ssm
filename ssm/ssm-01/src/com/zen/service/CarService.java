package com.zen.service;

import com.zen.dao.CarDao;
import com.zen.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDao dao;

    public void save(List<Car> cars) {
        for (Car car : cars) {
            dao.save(car);
        }
    }

    public List<Car> findAll() {
        return dao.findAll();
    }
}
