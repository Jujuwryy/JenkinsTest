package com.george;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Testing context loading after dev pipeline creation");   
    }
}