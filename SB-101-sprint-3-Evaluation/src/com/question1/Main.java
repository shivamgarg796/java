package com.question1;

import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee e=new Employee(101,"Ram","agra",480);
		
		String msg=dao.saveEmployeeDetails(e);
		
		System.out.println(msg);
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter eId of Employee");
		int eId=sc.nextInt();
	
		try {
			Employee e1=dao.getEmployeeById(eId);
		     System.out.println(e1);
		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
		}
		
		

		try {
			List<Employee> employees = dao.getAllEmployees();

			employees.forEach(s -> {
				System.out.println("Eid is :" + s.getEmpId());
				System.out.println("Name is :" + s.getName());
				System.out.println("Address is :" + s.getAddress());
				System.out.println("Salary is :" + s.getSalary());

				System.out.println("===========================");
			});

		} catch (EmployeeException ee) {
			ee.printStackTrace();
			System.out.println(ee.getMessage());
		}
		
		
		System.out.println("Enter eId of Employee");
		int eId1=sc.nextInt();
		
		try {
			String msg1=dao.deleteEmployee(eId1);
			System.out.println(msg1);
		} catch (EmployeeException ee) {
			ee.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
