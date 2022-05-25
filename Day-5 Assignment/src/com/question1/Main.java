package com.question1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		System.out.println("Enter PF percentage:");
		double pf=sc.nextDouble();
		
		Employee e=Employee.getEmployeeDetails(id, name, salary);
		
		int p=Employee.getPFPercentage(pf);
		
		e.calculateNetSalary(p);
		
		
		
		
			

	}

}
