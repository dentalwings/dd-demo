package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.Marker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditTrailController {
	Logger logger = LogManager.getLogger(AuditTrailController.class);
    Marker autditMarker = MarkerManager.getMarker("AuditTrail");

	@GetMapping("/trail")
	public String index() {
        logger.info(autditMarker, "1332 call to /trail added to the audit trail");
        logger.info("1332 /trail called !");
		return "1332 /trail called !";
	}

}