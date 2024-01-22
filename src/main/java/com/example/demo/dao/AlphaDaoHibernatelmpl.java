package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("AlphaDaoHibernatelmpl")
public class AlphaDaoHibernatelmpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
