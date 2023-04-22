package org.atri.EmployeeManagementProject.service;

import java.util.List;

import org.atri.EmployeeManagementProject.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee newEmployee);
	
	Employee getById(long id);
	
	Employee updateEmployee(Employee modifiedEmployee);
	
	List<Employee> getAllEmployees();
	
	String deleteEmployeeById(long id);
	
	List<Employee> searchByDepartment(String dept);
}
