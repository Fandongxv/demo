package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes=DemoApplication.class)
public class LoggerTests {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testlogger(){
        System.out.println(logger.getName());
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
