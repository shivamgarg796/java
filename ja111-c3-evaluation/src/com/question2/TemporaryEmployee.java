package com.question2;

public class TemporaryEmployee extends Employee {

	
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages ) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		
	}
	
	
	
	
	@Override
	void calculateSalary() {
		
		salary = hoursWorked * hourlyWages ;
		
		setSalary(salary);
		
	}
	
}
