package com.george;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
    
    @PostConstruct
    public void init() {
        logger.info("PostConstruct method executed");
        
    }

    public static void main(String[] args) {
        logger.info("App running");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }
}
