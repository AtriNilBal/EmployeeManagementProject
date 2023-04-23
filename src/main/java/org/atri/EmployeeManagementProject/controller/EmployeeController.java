package org.atri.EmployeeManagementProject.controller;

import java.util.List;

import org.atri.EmployeeManagementProject.entity.Employee;
import org.atri.EmployeeManagementProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee newEmployee) {
		Employee empCreated = this.employeeService.createEmployee(newEmployee);
		return empCreated;
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable long id) {
		Employee emp = this.employeeService.getById(id);
		return emp;
	}
	
	@PutMapping("/modify")
	public Employee updateEmployee(@RequestBody Employee modifiedEmployee) {
		Employee emp = this.employeeService.updateEmployee(modifiedEmployee);
		return emp;
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable long id) {
		return this.employeeService.deleteEmployeeById(id);
	}
}
