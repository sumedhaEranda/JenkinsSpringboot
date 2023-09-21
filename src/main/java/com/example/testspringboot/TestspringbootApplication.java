package com.example.testspringboot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestspringbootApplication implements CommandLineRunner {


	public static final Logger LOGGER = LoggerFactory.getLogger(TestspringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestspringbootApplication.class, args);
		LOGGER.info("first logger.");
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.warn("This is a second logger message.");

	}
}
