package com.itmayiedu.service;

import com.itmayiedu.controller.IndexController;
import com.itmayiedu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void createUser(String name, Integer age) {
        System.out.println("createUser");
        jdbcTemplate.update("insert into users values(null,?,?);", name, age);
        System.out.println("创建用户成功...");
    }

}
