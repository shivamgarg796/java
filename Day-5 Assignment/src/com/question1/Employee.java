package com.question1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public int getEmployeeId(){
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public String getEmployeeName(){
		return employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	
	public void setNetSalary(double netSalary) {
		this.netSalary=netSalary;
	}
	public double getNetSalary(){
		return netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage){
	double pfund=(salary*pfpercentage)/100;
	netSalary=salary-pfund;
	display();
	
	}
	
	
	
	public static Employee getEmployeeDetails(int employeeId, String employeeName, double salary) {
		Employee e1=new Employee();
		e1.setEmployeeId(employeeId);
		e1.setEmployeeName(employeeName);
		e1.setSalary(salary);
		return e1;
		}
	
	public static int getPFPercentage(double pf) {
		
		return (int)pf;
	}
	
	 
	 public void display() {
		 System.out.println("Id:"+getEmployeeId());
		 System.out.println("Name:"+getEmployeeName());
		 System.out.println("Salary:"+getSalary());
		 System.out.println("Net Salary:"+getNetSalary());
	 }
	 
	 
	 
	 
	 
}
