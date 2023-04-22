package org.atri.EmployeeManagementProject.service.implementation;

import java.util.List;

import org.atri.EmployeeManagementProject.entity.Employee;
import org.atri.EmployeeManagementProject.repository.EmployeeRepository;
import org.atri.EmployeeManagementProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee createEmployee(Employee newEmployee) {
		Employee employee = this.empRepo.save(newEmployee);
		return employee;
	}

	@Override
	public Employee getById(long id) {
		Employee employee = this.empRepo.findById(id).get();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee modifiedEmployee) {
		if(this.empRepo.existsById(modifiedEmployee.getId())) {
			Employee employee = this.empRepo.save(modifiedEmployee);
			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = this.empRepo.findAll();
		return allEmployees;
	}

	@Override
	public String deleteEmployeeById(long id) {
		if(this.empRepo.existsById(id)) {
			this.empRepo.deleteById(id);
			return "Employee deleted successfully";
		}
		return "Delete operation failed.";
	}

	@Override
	public List<Employee> searchByDepartment(String dept) {
		List<Employee> employees = this.empRepo.findByDept(dept);
		return employees;
	}

}
