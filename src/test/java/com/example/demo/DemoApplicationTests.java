package com.example.demo;

import com.example.demo.dao.AlphaDao;
import com.example.demo.service.Alphaservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

//演示IOC
//启用配置类(真实环境一致)
//IOC核心是spring容器，要实现接口 ApplicationContextAware 最底层是bean
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
class DemoApplicationTests implements ApplicationContextAware {
    //记录容器
    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    @Test
    public  void  testApplicationContext(){
        System.out.println(applicationContext);
        AlphaDao alphaDao =applicationContext.getBean(AlphaDao.class);
        System.out.println(alphaDao.select());
        alphaDao =applicationContext.getBean("AlphaDaoHibernatelmpl",AlphaDao.class);
        System.out.println(alphaDao.select());
    }
    @Test
    public  void testBeanManagement(){
        Alphaservice alphaservice =applicationContext.getBean(Alphaservice.class);
        System.out.println(alphaservice);
    }
    @Test
    public void testBeanConfig(){
        SimpleDateFormat simpleDateFormat =applicationContext.getBean(SimpleDateFormat.class);
        System.out.println(new Date());
        System.out.println(simpleDateFormat.format(new Date()));
    }
    @Autowired
    private AlphaDao alphaDao;
    @Autowired
    private Alphaservice alphaservice;
    @Autowired
    private SimpleDateFormat simpleDateFormat;
    @Test
    public void testDI(){
        System.out.println(alphaDao);
        System.out.println(alphaservice);
        System.out.println(simpleDateFormat);
    }

}
