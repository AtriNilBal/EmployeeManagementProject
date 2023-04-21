package org.atri.EmployeeManagementProject.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Employee Management Project, a Spring Boot Application!";
	}
	
	@GetMapping("/welcome")
	public String generalGreet() {
		return "Welcome to Employee Management Project it is getting created on Spring Boot Application. Time now is "+ LocalDateTime.now();
	}
	
	@GetMapping("/welcome/{firstName}")
	public String greetUserByFirstName(@PathVariable String firstName) {
		return "Welcome "+ firstName + " to Employee Management Project";
	}
	
	@GetMapping("/welcome/fname/{firstName}/lname/{lastName}")
	public String greetUserByFullName(@PathVariable String firstName, @PathVariable String lastName) {
		return "Welcome " + firstName + " " + lastName + " to Employee Managerment Project";
	}

}
