package com.carcrud.cars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication {

	private static final Logger logger =
			LoggerFactory.getLogger
					(CarsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
		logger.info("Application started");
	}

}
