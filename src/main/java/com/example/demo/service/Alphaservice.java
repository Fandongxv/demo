package com.example.demo.service;

import com.example.demo.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Alphaservice {
    @Autowired
    private AlphaDao alphaDao;
    public Alphaservice(){
        System.out.println("实例化Service");
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化Service");

    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁Service");
    }
    public String find(){
      return  alphaDao.select();
    }
}
