package com.zen.dao;

import com.zen.domain.Car;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDao extends SqlSessionDaoSupport {

    @Autowired
    public void setFactory(SqlSessionFactory factory) {
        super.setSqlSessionFactory(factory);
    }

    public void save(Car car) {
        //获取sqlSession
        SqlSession session = super.getSqlSession();
        //插入数据库(不需要提交事务，直接交给spring管理)
        session.insert("car.save",car);
    }

    public List<Car> findAll() {
        return getSqlSession().selectList("car.findAll");
    }
}
