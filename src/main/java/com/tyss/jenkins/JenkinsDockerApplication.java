package com.tyss.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Jenkins Dockers";
	}
	
	@GetMapping("/check")
	public String check() {
		return "Checked Successfully m";
	}


}
