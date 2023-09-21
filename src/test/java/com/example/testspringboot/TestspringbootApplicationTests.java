package com.example.testspringboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TestspringbootApplicationTests {

	public static final Logger LOGGER = LoggerFactory.getLogger(TestspringbootApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("its a test class");

	}

}
