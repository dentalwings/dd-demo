package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	Logger logger = LogManager.getLogger(DemoController.class);

	@GetMapping("/")
	public String index() {
        logger.info("1332 First line of log");
        logger.info("1332 Second line of log");
		return "Greetings from Spring Boot! (1332)";
	}

}