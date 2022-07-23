package com.masai.dao;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {

	public Employee getSalaryByEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees() throws EmployeeException;

	public boolean provideBonus(int bonus) throws EmployeeException;

	public String insertEmployeeDetails(Employee employee);

	public Employee searchEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployeesBySalary(int salary) throws EmployeeException;

}
