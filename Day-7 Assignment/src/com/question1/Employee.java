package com.question1;

public class Employee extends Member {

	
	 String specialisation;
	 String department;
	 
	 public Employee(String specialisation,String department){
		 System.out.println("Details of Employee :");
		 System.out.println("Specialisation :"+specialisation);
		 System.out.println("Department :"+department);
	 }
}
