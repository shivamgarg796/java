package com.question1;

import java.util.List;

public interface EmployeeDao {

	public String saveEmployeeDetails(Employee employee);
	
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public String deleteEmployee(int empId)throws EmployeeException;
}
