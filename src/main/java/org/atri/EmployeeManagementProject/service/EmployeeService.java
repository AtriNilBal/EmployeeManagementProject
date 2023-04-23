package org.atri.EmployeeManagementProject.service;

import java.util.List;

import org.atri.EmployeeManagementProject.entity.Employee;

public interface EmployeeService {
	
	//Create
	Employee createEmployee(Employee newEmployee);
	//Read
	Employee getById(long id);
	//Read
	List<Employee> getAllEmployees();
	//Search
	List<Employee> searchByDepartment(String dept);
	//Update
	Employee updateEmployee(Employee modifiedEmployee);
	//Delete
	String deleteEmployeeById(long id);
		
}
