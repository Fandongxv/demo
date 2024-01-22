package com.example.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository()
@Primary//控制优先级
public class AlphaDaoMybatis implements AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}
