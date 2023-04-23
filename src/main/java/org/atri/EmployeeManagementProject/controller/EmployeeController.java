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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/employee")
@Tag(name="Employee", description="APIs to perform create, read, search, update, delete actions on employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	@Operation(description="create-employee", summary="Create new employee")
	public Employee createEmployee(@RequestBody Employee newEmployee) {
		Employee empCreated = this.employeeService.createEmployee(newEmployee);
		return empCreated;
	}
	
	@GetMapping("/")
	@Operation(description="get-all-employees", summary="Get all employees")
	public List<Employee> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	@Operation(description="get-employee-by-id", summary="Get employee by id")
	public Employee getById(@PathVariable long id) {
		Employee emp = this.employeeService.getById(id);
		return emp;
	}
	
	@PutMapping("/modify")
	@Operation(description="modify-employee", summary="Update record of existing employee")
	public Employee updateEmployee(@RequestBody Employee modifiedEmployee) {
		Employee emp = this.employeeService.updateEmployee(modifiedEmployee);
		return emp;
	}
	
	@DeleteMapping("/{id}")
	@Operation(description="delete-employee", summary="delete employee by id")
	public String deleteEmployee(@PathVariable long id) {
		return this.employeeService.deleteEmployeeById(id);
	}
}
