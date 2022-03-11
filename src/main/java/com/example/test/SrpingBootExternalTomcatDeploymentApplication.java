package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SrpingBootExternalTomcatDeploymentApplication {
	
	
//	Deployee a application to check application is working fine.

	@GetMapping("/test")
	public String test() {
		return "Application Deployed..";
	}
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(SrpingBootExternalTomcatDeploymentApplication.class, args);
	}

}
