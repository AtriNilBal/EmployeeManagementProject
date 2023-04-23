package org.atri.EmployeeManagementProject.repository;

import java.util.List;

import org.atri.EmployeeManagementProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	/*
	 * List<Employee> findByDept(String department);
	 * 
	 * @Query(value = "select * from employee where dept =?1", nativeQuery = true)
	 * List<Employee> findByDeptNative(String department);
	 */
}
